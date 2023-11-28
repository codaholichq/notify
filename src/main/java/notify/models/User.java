package notify.models;

import java.io.Serializable;

public record User(
        String firstName,
        String lastName,
        String email
) implements Serializable {}
