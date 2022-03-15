package com.g.veterinaryApp.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="hayvanlar")
public class Hayvan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "İsim giriniz")
    private String isim;

    @NotBlank(message = "Cins giriniz")
    private String cins;

    @NotBlank(message = "Yaş giriniz")
    private int yas;

    @NotBlank(message = "Açıklama giriniz")
    private String aciklama;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "sahipId",nullable = false)
    private Sahip sahip;

    public Hayvan(){

    }

    public Hayvan(String isim, String cins, int yas, String aciklama){
        this.isim=isim;
        this.cins=cins;
        this.yas=yas;
        this.aciklama=aciklama;
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

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
