/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailSmtpPassWordRequest extends AbstractModel{

    /**
    * smtp密码，长度限制64
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 发信邮箱,长度限制128
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
     * Get smtp密码，长度限制64 
     * @return Password smtp密码，长度限制64
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set smtp密码，长度限制64
     * @param Password smtp密码，长度限制64
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 发信邮箱,长度限制128 
     * @return EmailAddress 发信邮箱,长度限制128
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 发信邮箱,长度限制128
     * @param EmailAddress 发信邮箱,长度限制128
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public UpdateEmailSmtpPassWordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEmailSmtpPassWordRequest(UpdateEmailSmtpPassWordRequest source) {
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);

    }
}

