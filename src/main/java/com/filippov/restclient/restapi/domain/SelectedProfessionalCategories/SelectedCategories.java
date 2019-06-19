package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories;

import com.filippov.restclient.restapi.domain.SelectedProfessionalCategories.ProfessionalCategories.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "SelectedCategories")
@Getter
@Setter
public class SelectedCategories {
    @Id
    private Integer id ;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<ArtisticCategory>artisticCategories=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<EntrepreneurialCategory> entrepreneurialCategories = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<IntellectualCategory >intellectualCategories = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<OfficeCategory>officeCategories = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<RealistCategory>realistCategories = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="selectedCategories")
    private List<SocialCategory>socialCategories = new ArrayList<>();
}
