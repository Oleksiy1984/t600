package model;

import javax.persistence.*;

/**
 * Created by Zhenichka on 13.08.2016.
 */
@Entity
@Table(name = "proverka", schema = "t650")
public class ProverkaEntity {
    private int id;
    private String s3;
    @Embedded
    private Adres adres= new Adres();


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "s1", nullable = true)
    public String getS1() {
        return adres.getS1();
    }

    public void setS1(String s1) {
        this.adres.setS1(s1);
    }

    @Basic
    @Column(name = "s2", nullable = true)
    public String getS2() {
        return adres.getS2();
    }

    public void setS2(String s2) {
        this.adres.setS2(s2);
    }


    @Basic
    @Column(name = "s3", nullable = true)
    public String getS3() {
        return s3;
    }
    public void setS3(String s3) {
        this.s3 = s3;
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProverkaEntity that = (ProverkaEntity) o;

        if (id != that.id) return false;
        if (adres.getS1() != null ? !adres.getS1().equals(that.adres.getS1()) : that.adres.getS1() != null) return false;
        if (adres.getS2() != null ? !adres.getS2().equals(that.adres.getS2()) : that.adres.getS2() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (adres.getS1() != null ? adres.getS1().hashCode() : 0);
        result = 31 * result + (adres.getS2() != null ? adres.getS2().hashCode() : 0);
        return result;
    }*/
}
