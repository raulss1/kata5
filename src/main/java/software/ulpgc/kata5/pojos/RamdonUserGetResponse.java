package software.ulpgc.kata5.pojos;

import software.ulpgc.kata5.model.User;

import java.util.List;

public record RamdonUserGetResponse(List<User> results) {
}
