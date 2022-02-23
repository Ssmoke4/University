package ru.skillfactory.hw24_7.enums;

public enum StudyProfile {

        MEDICINE ("Медицина"),
        MATHEMATIC ("Математика"),
        DEVELOPERS("Разработчики")
    ;

        private final String profileName;


    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
