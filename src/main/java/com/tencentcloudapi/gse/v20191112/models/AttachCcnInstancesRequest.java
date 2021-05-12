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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachCcnInstancesRequest extends AbstractModel{

    /**
    * 服务器舰队 Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 云联网账号 Uin
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 云联网 Id
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
     * Get 服务器舰队 Id 
     * @return FleetId 服务器舰队 Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
     * @param FleetId 服务器舰队 Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 云联网账号 Uin 
     * @return AccountId 云联网账号 Uin
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 云联网账号 Uin
     * @param AccountId 云联网账号 Uin
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 云联网 Id 
     * @return CcnId 云联网 Id
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网 Id
     * @param CcnId 云联网 Id
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    public AttachCcnInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachCcnInstancesRequest(AttachCcnInstancesRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);

    }
}

