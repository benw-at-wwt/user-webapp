package com.wwt.webapp.userwebapp.domain.request;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author benw-at-wwt
 */
@XmlRootElement
@SuppressWarnings("unused")
public class ExecuteRecoveryRequest implements InternalRequest {

    private String passwordToken;
    private String newPassword;

    public ExecuteRecoveryRequest() {
    }

    public ExecuteRecoveryRequest(String passwordToken, String newPassword) {
        this.passwordToken = passwordToken;
        this.newPassword = newPassword;
    }

    public void setPasswordToken(String passwordToken) {
        this.passwordToken = passwordToken;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getPasswordToken() {
        return passwordToken;
    }

    public String getNewPassword() {
        return newPassword;
    }

    @Override
    public final String toString() {
        return "ExecuteRecoveryRequest{" +
                " passwordToken='" + passwordToken + '\'' +
                '}';
    }
}