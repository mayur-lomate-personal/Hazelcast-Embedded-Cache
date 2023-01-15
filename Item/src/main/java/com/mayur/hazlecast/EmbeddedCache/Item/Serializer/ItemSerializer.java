package com.mayur.hazlecast.EmbeddedCache.Item.Serializer;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.StreamSerializer;
import com.mayur.hazlecast.EmbeddedCache.Item.Entities.Item;

import java.io.IOException;

public class ItemSerializer implements StreamSerializer<Item> {

    @Override
    public void write(ObjectDataOutput objectDataOutput, Item item) throws IOException {
        objectDataOutput.writeUTF(item.getItemId().toString());
        objectDataOutput.writeUTF(item.getItemName());
    }

    @Override
    public Item read(ObjectDataInput objectDataInput) throws IOException {
        return Item.builder()
                .itemId(Integer.parseInt(objectDataInput.readUTF()))
                .itemName(objectDataInput.readUTF())
                .build();
    }

    @Override
    public int getTypeId() {
        return 1;
    }
}
