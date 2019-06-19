package com.filippov.restclient.restapi.domain.SelectedProfessionalCategories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
@Getter
@Setter
public class ListSelectedCategories {
    @Id
    private Integer id ;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "selectedCategoriesId")
    private List<SelectedCategories> selectedCategories=new ArrayList<>();
}
