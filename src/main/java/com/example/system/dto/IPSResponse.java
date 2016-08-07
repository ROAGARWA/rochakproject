package com.example.system.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by rajorea on 06/08/16.
 */

public class  IPSResponse {

    private String ipsId;
    private Date updatedDate;
    private String status;
    private List<MyPayload> payload;

    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }


    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MyPayload> getPayload() {
        return payload;
    }

    public void setPayload(List<MyPayload> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "IPSResponse{" +
                "ipsId='" + ipsId + '\'' +
                ", updatedDate=" + updatedDate +
                ", status='" + status + '\'' +
                ", payload=" + payload +
                '}';
    }
}
