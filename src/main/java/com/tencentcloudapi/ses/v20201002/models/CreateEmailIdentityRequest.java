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

public class CreateEmailIdentityRequest extends AbstractModel{

    /**
    * 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
    */
    @SerializedName("EmailIdentity")
    @Expose
    private String EmailIdentity;

    /**
     * Get 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。 
     * @return EmailIdentity 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     */
    public String getEmailIdentity() {
        return this.EmailIdentity;
    }

    /**
     * Set 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     * @param EmailIdentity 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     */
    public void setEmailIdentity(String EmailIdentity) {
        this.EmailIdentity = EmailIdentity;
    }

    public CreateEmailIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmailIdentityRequest(CreateEmailIdentityRequest source) {
        if (source.EmailIdentity != null) {
            this.EmailIdentity = new String(source.EmailIdentity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailIdentity", this.EmailIdentity);

    }
}

