package software.ulpgc.kata5;

import software.ulpgc.kata5.model.User;
import software.ulpgc.kata5.pojos.RamdonUserGetResponse;

public class RamdonUserAdapter implements UserAdapter{
    @Override
    public User adapt(Object o) {
        return adapt_user(((RamdonUserGetResponse) o).results().get(0));
    }

    private User adapt_user(RamdonUserGetResponse.User user) {
        return new User(userNameOf(user));
    }

    private String userNameOf(RamdonUserGetResponse.User user) {
        return user.name().title() + " " + user.name().first() + " " + user.name().last();
    }
}
