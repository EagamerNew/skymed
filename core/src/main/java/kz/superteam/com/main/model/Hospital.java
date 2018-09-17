package kz.superteam.com.main.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "hospital", schema = "skymed_coredb", catalog = "")
public class Hospital {
    private Integer id;
    private String name;
    private String address;
    private String primaryEmail;
    private String mobile;
    private Date dateOfEstablishment;
    private String medicalDirector;

    public Hospital() {
    }

    public Hospital(Integer id, String name, String address, String primaryEmail, String mobile, Date dateOfEstablishment, String medicalDirector) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.primaryEmail = primaryEmail;
        this.mobile = mobile;
        this.dateOfEstablishment = dateOfEstablishment;
        this.medicalDirector = medicalDirector;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false,updatable=false, insertable=true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "primary_email")
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "date_of_establishment")
    public Date getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(Date dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    @Basic
    @Column(name = "medical_director")
    public String getMedicalDirector() {
        return medicalDirector;
    }

    public void setMedicalDirector(String medicalDirector) {
        this.medicalDirector = medicalDirector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(id, hospital.id) &&
                Objects.equals(name, hospital.name) &&
                Objects.equals(address, hospital.address) &&
                Objects.equals(primaryEmail, hospital.primaryEmail) &&
                Objects.equals(mobile, hospital.mobile) &&
                Objects.equals(dateOfEstablishment, hospital.dateOfEstablishment) &&
                Objects.equals(medicalDirector, hospital.medicalDirector);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, primaryEmail, mobile, dateOfEstablishment, medicalDirector);
    }
}
