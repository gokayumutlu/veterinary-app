package com.g.veterinaryApp.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "sahipler")
public class Sahip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "İsim giriniz")
    private String isim;

    @NotBlank(message = "Telefon numarası giriniz")
    @Digits(fraction =0,integer = 10)
    private String telefon;

    @NotBlank(message = "Email giriniz")
    private String email;

    @OneToMany(mappedBy = "hayvan",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Hayvan> hayvanlar;

    public Sahip(){

    }

    public Sahip(String isim, String telefon, String email){
        this.isim=isim;
        this.telefon=telefon;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
