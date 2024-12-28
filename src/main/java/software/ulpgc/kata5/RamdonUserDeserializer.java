package software.ulpgc.kata5;

import com.google.gson.Gson;
import software.ulpgc.kata5.pojos.RamdonUserGetResponse;

public class RamdonUserDeserializer implements UserDeserializer{
    @Override
    public Object deserialize(String text) {
        return new Gson().fromJson(text, RamdonUserGetResponse.class);
    }
}
