package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Zhenichka on 13.08.2016.
 */
@Embeddable
public class Adres {
    private String s1;
    private String s2;

@Basic
    @Column(name = "s1", nullable = true)
    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
    @Basic
    @Column(name = "s2", nullable = true)
    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }


    public Adres() {

    }


}
