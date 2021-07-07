package h_manage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "admitpatient_ward", catalog = "h_m_s", schema = "")
@NamedQueries({
    @NamedQuery(name = "AdmitpatientWard.findAll", query = "SELECT a FROM AdmitpatientWard a"),
    @NamedQuery(name = "AdmitpatientWard.findByPatientID", query = "SELECT a FROM AdmitpatientWard a WHERE a.patientID = :patientID"),
    @NamedQuery(name = "AdmitpatientWard.findByDisease", query = "SELECT a FROM AdmitpatientWard a WHERE a.disease = :disease"),
    @NamedQuery(name = "AdmitpatientWard.findByAdmitDate", query = "SELECT a FROM AdmitpatientWard a WHERE a.admitDate = :admitDate"),
    @NamedQuery(name = "AdmitpatientWard.findByWardname", query = "SELECT a FROM AdmitpatientWard a WHERE a.wardname = :wardname"),
    @NamedQuery(name = "AdmitpatientWard.findByDoctorID", query = "SELECT a FROM AdmitpatientWard a WHERE a.doctorID = :doctorID"),
    @NamedQuery(name = "AdmitpatientWard.findByAPRemarks", query = "SELECT a FROM AdmitpatientWard a WHERE a.aPRemarks = :aPRemarks")})
public class AdmitpatientWard implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PatientID")
    private String patientID;
    @Column(name = "Disease")
    private String disease;
    @Column(name = "AdmitDate")
    private String admitDate;
    @Column(name = "Wardname")
    private String wardname;
    @Column(name = "DoctorID")
    private String doctorID;
    @Column(name = "AP_Remarks")
    private String aPRemarks;

    public AdmitpatientWard() {
    }

    public AdmitpatientWard(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        String oldPatientID = this.patientID;
        this.patientID = patientID;
        changeSupport.firePropertyChange("patientID", oldPatientID, patientID);
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        String oldDisease = this.disease;
        this.disease = disease;
        changeSupport.firePropertyChange("disease", oldDisease, disease);
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        String oldAdmitDate = this.admitDate;
        this.admitDate = admitDate;
        changeSupport.firePropertyChange("admitDate", oldAdmitDate, admitDate);
    }

    public String getWardname() {
        return wardname;
    }

    public void setWardname(String wardname) {
        String oldWardname = this.wardname;
        this.wardname = wardname;
        changeSupport.firePropertyChange("wardname", oldWardname, wardname);
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        String oldDoctorID = this.doctorID;
        this.doctorID = doctorID;
        changeSupport.firePropertyChange("doctorID", oldDoctorID, doctorID);
    }

    public String getAPRemarks() {
        return aPRemarks;
    }

    public void setAPRemarks(String aPRemarks) {
        String oldAPRemarks = this.aPRemarks;
        this.aPRemarks = aPRemarks;
        changeSupport.firePropertyChange("APRemarks", oldAPRemarks, aPRemarks);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientID != null ? patientID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdmitpatientWard)) {
            return false;
        }
        AdmitpatientWard other = (AdmitpatientWard) object;
        if ((this.patientID == null && other.patientID != null) || (this.patientID != null && !this.patientID.equals(other.patientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "h_manage.AdmitpatientWard[ patientID=" + patientID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
