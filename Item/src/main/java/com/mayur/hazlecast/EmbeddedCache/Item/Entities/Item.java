package com.mayur.hazlecast.EmbeddedCache.Item.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item implements Serializable {

    @GeneratedValue
    @EqualsAndHashCode.Include
    @Id
    private Integer itemId;
    private String itemName;
}
