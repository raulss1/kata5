package software.ulpgc.kata5;

import software.ulpgc.kata5.model.User;

public class UserLoader {
    private final UserReader reader;
    private final UserDeserializer deserializer;
    private final UserAdapter adapter;

    public UserLoader(UserAdapter adapter, UserReader reader, UserDeserializer deserializer) {
        this.adapter = adapter;
        this.reader = reader;
        this.deserializer = deserializer;
    }

    public User get(){
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
