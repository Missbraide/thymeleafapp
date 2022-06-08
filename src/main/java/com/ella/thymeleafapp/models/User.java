package com.ella.thymeleafapp.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;
import java.util.Objects;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter @Setter
@ToString
public class User {
    String name;
    String email;
    String password;
    String gender;
    String note;
    boolean married;
    Date birthday;
    String profession;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return married == user.married && name.equals(user.name) && email.equals(user.email) && password.equals(user.password) && gender.equals(user.gender) && note.equals(user.note) && birthday.equals(user.birthday) && profession.equals(user.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, gender, note, married, birthday, profession);
    }


}
