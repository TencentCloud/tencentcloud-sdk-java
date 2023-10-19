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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetConfig extends AbstractModel {

    /**
    * 公网地址版本，可选："IPV4" | "IPV6" 。不填默认 IPV4 。
    */
    @SerializedName("InternetAddressVersion")
    @Expose
    private String InternetAddressVersion;

    /**
    * 公网付费类型，当前仅可选："BANDWIDTH"。不填默认为 "BANDWIDTH"
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * 公网带宽。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 负载均衡描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 负载均衡的规格类型，传 "SLA" 表示性能容量型，不传为共享型。
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * 负载均衡是否多可用区
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * 主可用区
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * 备可用区
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
     * Get 公网地址版本，可选："IPV4" | "IPV6" 。不填默认 IPV4 。 
     * @return InternetAddressVersion 公网地址版本，可选："IPV4" | "IPV6" 。不填默认 IPV4 。
     */
    public String getInternetAddressVersion() {
        return this.InternetAddressVersion;
    }

    /**
     * Set 公网地址版本，可选："IPV4" | "IPV6" 。不填默认 IPV4 。
     * @param InternetAddressVersion 公网地址版本，可选："IPV4" | "IPV6" 。不填默认 IPV4 。
     */
    public void setInternetAddressVersion(String InternetAddressVersion) {
        this.InternetAddressVersion = InternetAddressVersion;
    }

    /**
     * Get 公网付费类型，当前仅可选："BANDWIDTH"。不填默认为 "BANDWIDTH" 
     * @return InternetPayMode 公网付费类型，当前仅可选："BANDWIDTH"。不填默认为 "BANDWIDTH"
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set 公网付费类型，当前仅可选："BANDWIDTH"。不填默认为 "BANDWIDTH"
     * @param InternetPayMode 公网付费类型，当前仅可选："BANDWIDTH"。不填默认为 "BANDWIDTH"
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get 公网带宽。 
     * @return InternetMaxBandwidthOut 公网带宽。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网带宽。
     * @param InternetMaxBandwidthOut 公网带宽。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 负载均衡描述 
     * @return Description 负载均衡描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 负载均衡描述
     * @param Description 负载均衡描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 负载均衡的规格类型，传 "SLA" 表示性能容量型，不传为共享型。 
     * @return SlaType 负载均衡的规格类型，传 "SLA" 表示性能容量型，不传为共享型。
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 负载均衡的规格类型，传 "SLA" 表示性能容量型，不传为共享型。
     * @param SlaType 负载均衡的规格类型，传 "SLA" 表示性能容量型，不传为共享型。
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get 负载均衡是否多可用区 
     * @return MultiZoneFlag 负载均衡是否多可用区
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set 负载均衡是否多可用区
     * @param MultiZoneFlag 负载均衡是否多可用区
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get 主可用区 
     * @return MasterZoneId 主可用区
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set 主可用区
     * @param MasterZoneId 主可用区
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get 备可用区 
     * @return SlaveZoneId 备可用区
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set 备可用区
     * @param SlaveZoneId 备可用区
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    public InternetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetConfig(InternetConfig source) {
        if (source.InternetAddressVersion != null) {
            this.InternetAddressVersion = new String(source.InternetAddressVersion);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetAddressVersion", this.InternetAddressVersion);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);

    }
}

