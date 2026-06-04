/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterFwBypassRequest extends AbstractModel {

    /**
    * 防火墙类型，"VPC_FW"-VPC防火墙，"NAT_FW"-NAT防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 云联网实例ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * Bypass开关，true-开启Bypass（禁用正常下一跳，流量绕过防火墙），false-关闭Bypass（启用正常下一跳，流量经过防火墙）
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * NAT防火墙实例ID，FwType为nat时必填
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
     * Get 防火墙类型，"VPC_FW"-VPC防火墙，"NAT_FW"-NAT防火墙 
     * @return FwType 防火墙类型，"VPC_FW"-VPC防火墙，"NAT_FW"-NAT防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 防火墙类型，"VPC_FW"-VPC防火墙，"NAT_FW"-NAT防火墙
     * @param FwType 防火墙类型，"VPC_FW"-VPC防火墙，"NAT_FW"-NAT防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 云联网实例ID 
     * @return CcnId 云联网实例ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网实例ID
     * @param CcnId 云联网实例ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get Bypass开关，true-开启Bypass（禁用正常下一跳，流量绕过防火墙），false-关闭Bypass（启用正常下一跳，流量经过防火墙） 
     * @return Enable Bypass开关，true-开启Bypass（禁用正常下一跳，流量绕过防火墙），false-关闭Bypass（启用正常下一跳，流量经过防火墙）
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Bypass开关，true-开启Bypass（禁用正常下一跳，流量绕过防火墙），false-关闭Bypass（启用正常下一跳，流量经过防火墙）
     * @param Enable Bypass开关，true-开启Bypass（禁用正常下一跳，流量绕过防火墙），false-关闭Bypass（启用正常下一跳，流量经过防火墙）
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get NAT防火墙实例ID，FwType为nat时必填 
     * @return NatInsId NAT防火墙实例ID，FwType为nat时必填
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set NAT防火墙实例ID，FwType为nat时必填
     * @param NatInsId NAT防火墙实例ID，FwType为nat时必填
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    public ModifyClusterFwBypassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterFwBypassRequest(ModifyClusterFwBypassRequest source) {
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);

    }
}

