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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherAccountInfo extends AbstractModel{

    /**
    * id
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 手机号
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
    * id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get id 
     * @return AccountId id
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set id
     * @param AccountId id
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 手机号 
     * @return MobilePhone 手机号
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 手机号
     * @param MobilePhone 手机号
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Get id 
     * @return DeviceId id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set id
     * @param DeviceId id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public OtherAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherAccountInfo(OtherAccountInfo source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.MobilePhone != null) {
            this.MobilePhone = new String(source.MobilePhone);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

