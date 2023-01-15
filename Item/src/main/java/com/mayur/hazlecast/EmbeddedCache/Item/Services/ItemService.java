package com.mayur.hazlecast.EmbeddedCache.Item.Services;

import com.mayur.hazlecast.EmbeddedCache.Item.Entities.Item;

import java.util.List;

public interface ItemService {
    public Item saveItem(Item item);
    public Item updateItem(Item item, Integer itemId);
    public void deleteItem(Integer itemId);
    public Item getOneItem(Integer itemId);
    public List<Item> getAllItems();
}
