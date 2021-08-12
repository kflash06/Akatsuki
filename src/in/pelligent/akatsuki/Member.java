package in.pelligent.akatsuki;

import in.pelligent.media.Photograph;

public class Member {
    private String name;
    private Photograph photo;
    private Village village;
    private Clan clan;
    private String[] jutsus;
    private String[] elements;
    private Member[] partners;

    public Member[] getPartners() {
        return partners;
    }

    public void setPartners(Member[] partners) {
        this.partners = partners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Photograph getPhoto() {
        return photo;
    }

    public void setPhoto(Photograph photo) {
        this.photo = photo;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public String[] getJutsus() {
        return jutsus;
    }

    public void setJutsus(String[] jutsus) {
        this.jutsus = jutsus;
    }

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    private String abilities;
}
