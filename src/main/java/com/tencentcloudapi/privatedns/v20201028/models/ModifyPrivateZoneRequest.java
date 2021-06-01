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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrivateZoneRequest extends AbstractModel{

    /**
    * 私有域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启子域名递归, ENABLED， DISABLED
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
     * Get 私有域ID 
     * @return ZoneId 私有域ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域ID
     * @param ZoneId 私有域ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否开启子域名递归, ENABLED， DISABLED 
     * @return DnsForwardStatus 是否开启子域名递归, ENABLED， DISABLED
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set 是否开启子域名递归, ENABLED， DISABLED
     * @param DnsForwardStatus 是否开启子域名递归, ENABLED， DISABLED
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    public ModifyPrivateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivateZoneRequest(ModifyPrivateZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);

    }
}

