package com.becappstudios.becapp.domain;

import java.util.Date;

public class Profile {
    private Long id;
    private String name;
    private String FIO;
    private String nickname;

    private String birthday;

    public Profile(Long id, String name, String FIO, String nickname, String birthday) {
        this.id = id;
        this.name = name;
        this.FIO = FIO;
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
