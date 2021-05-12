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

public class CreateEmailAddressRequest extends AbstractModel{

    /**
    * 您的发信地址（发信地址总数上限为10个）
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 发件人别名
    */
    @SerializedName("EmailSenderName")
    @Expose
    private String EmailSenderName;

    /**
     * Get 您的发信地址（发信地址总数上限为10个） 
     * @return EmailAddress 您的发信地址（发信地址总数上限为10个）
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 您的发信地址（发信地址总数上限为10个）
     * @param EmailAddress 您的发信地址（发信地址总数上限为10个）
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 发件人别名 
     * @return EmailSenderName 发件人别名
     */
    public String getEmailSenderName() {
        return this.EmailSenderName;
    }

    /**
     * Set 发件人别名
     * @param EmailSenderName 发件人别名
     */
    public void setEmailSenderName(String EmailSenderName) {
        this.EmailSenderName = EmailSenderName;
    }

    public CreateEmailAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmailAddressRequest(CreateEmailAddressRequest source) {
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.EmailSenderName != null) {
            this.EmailSenderName = new String(source.EmailSenderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "EmailSenderName", this.EmailSenderName);

    }
}

