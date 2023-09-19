package com.poc.tree.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Organisation extends GenericTreeNode<OrganisationDetails>{

    private Long id;
    private String name;
    List<Organisation> children;

    public Organisation(OrganisationDetails data) {
        super(data);
    }
}
