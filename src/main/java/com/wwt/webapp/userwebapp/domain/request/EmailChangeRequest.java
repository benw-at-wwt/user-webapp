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
package com.wwt.webapp.userwebapp.domain.request;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author benw-at-wwt
 */
@XmlRootElement
@SuppressWarnings("unused")
public class EmailChangeRequest extends AuthenticatedRequest implements InternalRequest {

	private String email;

    public EmailChangeRequest() {
    }

    public EmailChangeRequest(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public final String toString() {
        return "EmailChangeRequest{" +
                (super.toString())+
                ", email='" + email + '\'' +
                '}';
    }
}
