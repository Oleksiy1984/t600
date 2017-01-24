package model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Zhenichka on 11.08.2016.
 */
@Entity
@Table(name = "volume", schema = "t650", catalog = "")
public class VolumeEntity {
    private int id;
    private BigDecimal m3;
    private Adres address;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "m3", nullable = false, precision = 3)
    public BigDecimal getM3() {
        return m3;
    }

    public void setM3(BigDecimal m3) {
        this.m3 = m3;
    }

    @Embedded
    public Adres getAddress() {
        return address;
    }

    public void setAddress(Adres address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeEntity that = (VolumeEntity) o;

        if (id != that.id) return false;
        if (m3 != null ? !m3.equals(that.m3) : that.m3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (m3 != null ? m3.hashCode() : 0);
        return result;
    }
}
