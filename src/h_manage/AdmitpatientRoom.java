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
@Table(name = "admitpatient_room", catalog = "h_m_s", schema = "")
@NamedQueries({
    @NamedQuery(name = "AdmitpatientRoom.findAll", query = "SELECT a FROM AdmitpatientRoom a"),
    @NamedQuery(name = "AdmitpatientRoom.findByPatientID", query = "SELECT a FROM AdmitpatientRoom a WHERE a.patientID = :patientID"),
    @NamedQuery(name = "AdmitpatientRoom.findByDisease", query = "SELECT a FROM AdmitpatientRoom a WHERE a.disease = :disease"),
    @NamedQuery(name = "AdmitpatientRoom.findByAdmitDate", query = "SELECT a FROM AdmitpatientRoom a WHERE a.admitDate = :admitDate"),
    @NamedQuery(name = "AdmitpatientRoom.findByRoomNo", query = "SELECT a FROM AdmitpatientRoom a WHERE a.roomNo = :roomNo"),
    @NamedQuery(name = "AdmitpatientRoom.findByDoctorID", query = "SELECT a FROM AdmitpatientRoom a WHERE a.doctorID = :doctorID"),
    @NamedQuery(name = "AdmitpatientRoom.findByAPRemarks", query = "SELECT a FROM AdmitpatientRoom a WHERE a.aPRemarks = :aPRemarks")})
public class AdmitpatientRoom implements Serializable {

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
    @Column(name = "RoomNo")
    private String roomNo;
    @Column(name = "DoctorID")
    private String doctorID;
    @Column(name = "AP_Remarks")
    private String aPRemarks;

    public AdmitpatientRoom() {
    }

    public AdmitpatientRoom(String patientID) {
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

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        String oldRoomNo = this.roomNo;
        this.roomNo = roomNo;
        changeSupport.firePropertyChange("roomNo", oldRoomNo, roomNo);
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
        if (!(object instanceof AdmitpatientRoom)) {
            return false;
        }
        AdmitpatientRoom other = (AdmitpatientRoom) object;
        if ((this.patientID == null && other.patientID != null) || (this.patientID != null && !this.patientID.equals(other.patientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "h_manage.AdmitpatientRoom[ patientID=" + patientID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
