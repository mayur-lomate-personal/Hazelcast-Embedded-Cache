package com.mayur.hazlecast.EmbeddedCache.Item.Repositories;

import com.mayur.hazlecast.EmbeddedCache.Item.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
