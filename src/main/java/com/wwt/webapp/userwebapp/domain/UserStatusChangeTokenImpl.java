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
package com.wwt.webapp.userwebapp.domain;


import com.wwt.webapp.userwebapp.util.ConfigProvider;
import org.apache.commons.codec.binary.Hex;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author benw-at-wwt
 */
public class UserStatusChangeTokenImpl implements UserStatusChangeToken {


    private final String token;
    private final Timestamp tokenExpiresAt;

    private UserStatusChangeTokenImpl(String token, Timestamp tokenExpiresAt) {
        this.token = token;
        this.tokenExpiresAt = tokenExpiresAt;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public Timestamp getTokenExpiresAt() {
        return tokenExpiresAt;
    }

    public static UserStatusChangeTokenImpl newInstance() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        utc = utc.plusMinutes( ConfigProvider.getConfigIntValue("minutesUntilTokenExpiry"));
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return new UserStatusChangeTokenImpl(Hex.encodeHexString(bytes),Timestamp.from(utc.toInstant()));
    }

    public static UserStatusChangeTokenImpl getInstance(String token, Timestamp tokenExpiresAt) {
        return new UserStatusChangeTokenImpl(token,tokenExpiresAt);
    }
}
