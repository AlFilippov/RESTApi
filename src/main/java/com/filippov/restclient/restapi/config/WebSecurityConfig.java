package com.filippov.restclient.restapi.config;

import com.filippov.restclient.restapi.domain.UserData;
import com.filippov.restclient.restapi.repository.UserDataListRepository;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/data/profession","/data","/data/profession/info","/data/category","/data/category/*")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();

    }

    @Bean
    public PrincipalExtractor principalExtractor(UserDataListRepository userDataListRepository) {
        return map -> {
            String id = (String) map.get("sub");
            UserData userData = userDataListRepository.findById(id).orElseGet(() -> {
            //TODO: Дописать сохранение юзера в БД

                UserData newUserData = new UserData();
             newUserData.setId((String) map.get("sub"));
             newUserData.setEmail((String)map.get("email"));
             newUserData.setLogin((String) map.get("email"));
                return newUserData;
            });
            return userDataListRepository.save(userData);

        };
    }
}
