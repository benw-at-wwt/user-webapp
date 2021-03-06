/* Copyright 2018-2019 Wehe Web Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wwt.webapp.userwebapp.domain.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author benw-at-wwt
 */
@XmlRootElement
@SuppressWarnings("unused")
public class RegistrationSuccessResp implements InternalResponse {

    private final String emailAddress;

    public RegistrationSuccessResp(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public boolean isSuccessful() {
        return true;
    }

    @Override
    public MessageCode getMessageCode() {
        return MessageCode.OPERATION_SUCCESSFUL;
    }

    @Override
    public String getMessageText() {
        return MessageCode.OPERATION_SUCCESSFUL.getMessage();
    }

    @Override
    public String toString() {
        return "RegistrationSuccessResp{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
