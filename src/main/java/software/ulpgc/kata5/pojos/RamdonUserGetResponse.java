package software.ulpgc.kata5.pojos;

import software.ulpgc.kata5.model.User;

import java.util.List;

public record RamdonUserGetResponse(List<User> results) {
    public record User(Name name, String gender, String email){}

    public record Name(String title, String first, String last){}
}
