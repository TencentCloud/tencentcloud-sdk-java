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

public class EmailIdentity extends AbstractModel{

    /**
    * 发信域名
    */
    @SerializedName("IdentityName")
    @Expose
    private String IdentityName;

    /**
    * 验证类型，固定为DOMAIN
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * 是否已通过验证
    */
    @SerializedName("SendingEnabled")
    @Expose
    private Boolean SendingEnabled;

    /**
     * Get 发信域名 
     * @return IdentityName 发信域名
     */
    public String getIdentityName() {
        return this.IdentityName;
    }

    /**
     * Set 发信域名
     * @param IdentityName 发信域名
     */
    public void setIdentityName(String IdentityName) {
        this.IdentityName = IdentityName;
    }

    /**
     * Get 验证类型，固定为DOMAIN 
     * @return IdentityType 验证类型，固定为DOMAIN
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set 验证类型，固定为DOMAIN
     * @param IdentityType 验证类型，固定为DOMAIN
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get 是否已通过验证 
     * @return SendingEnabled 是否已通过验证
     */
    public Boolean getSendingEnabled() {
        return this.SendingEnabled;
    }

    /**
     * Set 是否已通过验证
     * @param SendingEnabled 是否已通过验证
     */
    public void setSendingEnabled(Boolean SendingEnabled) {
        this.SendingEnabled = SendingEnabled;
    }

    public EmailIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailIdentity(EmailIdentity source) {
        if (source.IdentityName != null) {
            this.IdentityName = new String(source.IdentityName);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
        if (source.SendingEnabled != null) {
            this.SendingEnabled = new Boolean(source.SendingEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityName", this.IdentityName);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "SendingEnabled", this.SendingEnabled);

    }
}

