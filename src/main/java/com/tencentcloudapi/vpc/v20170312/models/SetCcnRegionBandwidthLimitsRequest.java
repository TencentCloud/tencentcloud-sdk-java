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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCcnRegionBandwidthLimitsRequest extends AbstractModel{

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网（CCN）各地域出带宽上限。
    */
    @SerializedName("CcnRegionBandwidthLimits")
    @Expose
    private CcnRegionBandwidthLimit [] CcnRegionBandwidthLimits;

    /**
    * 是否恢复云联网地域出口/地域间带宽限速为默认值（1Gbps）。false表示不恢复；true表示恢复。恢复默认值后，限速实例将不在控制台展示。该参数默认为 false，不恢复。
    */
    @SerializedName("SetDefaultLimitFlag")
    @Expose
    private Boolean SetDefaultLimitFlag;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网（CCN）各地域出带宽上限。 
     * @return CcnRegionBandwidthLimits 云联网（CCN）各地域出带宽上限。
     */
    public CcnRegionBandwidthLimit [] getCcnRegionBandwidthLimits() {
        return this.CcnRegionBandwidthLimits;
    }

    /**
     * Set 云联网（CCN）各地域出带宽上限。
     * @param CcnRegionBandwidthLimits 云联网（CCN）各地域出带宽上限。
     */
    public void setCcnRegionBandwidthLimits(CcnRegionBandwidthLimit [] CcnRegionBandwidthLimits) {
        this.CcnRegionBandwidthLimits = CcnRegionBandwidthLimits;
    }

    /**
     * Get 是否恢复云联网地域出口/地域间带宽限速为默认值（1Gbps）。false表示不恢复；true表示恢复。恢复默认值后，限速实例将不在控制台展示。该参数默认为 false，不恢复。 
     * @return SetDefaultLimitFlag 是否恢复云联网地域出口/地域间带宽限速为默认值（1Gbps）。false表示不恢复；true表示恢复。恢复默认值后，限速实例将不在控制台展示。该参数默认为 false，不恢复。
     */
    public Boolean getSetDefaultLimitFlag() {
        return this.SetDefaultLimitFlag;
    }

    /**
     * Set 是否恢复云联网地域出口/地域间带宽限速为默认值（1Gbps）。false表示不恢复；true表示恢复。恢复默认值后，限速实例将不在控制台展示。该参数默认为 false，不恢复。
     * @param SetDefaultLimitFlag 是否恢复云联网地域出口/地域间带宽限速为默认值（1Gbps）。false表示不恢复；true表示恢复。恢复默认值后，限速实例将不在控制台展示。该参数默认为 false，不恢复。
     */
    public void setSetDefaultLimitFlag(Boolean SetDefaultLimitFlag) {
        this.SetDefaultLimitFlag = SetDefaultLimitFlag;
    }

    public SetCcnRegionBandwidthLimitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCcnRegionBandwidthLimitsRequest(SetCcnRegionBandwidthLimitsRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnRegionBandwidthLimits != null) {
            this.CcnRegionBandwidthLimits = new CcnRegionBandwidthLimit[source.CcnRegionBandwidthLimits.length];
            for (int i = 0; i < source.CcnRegionBandwidthLimits.length; i++) {
                this.CcnRegionBandwidthLimits[i] = new CcnRegionBandwidthLimit(source.CcnRegionBandwidthLimits[i]);
            }
        }
        if (source.SetDefaultLimitFlag != null) {
            this.SetDefaultLimitFlag = new Boolean(source.SetDefaultLimitFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "CcnRegionBandwidthLimits.", this.CcnRegionBandwidthLimits);
        this.setParamSimple(map, prefix + "SetDefaultLimitFlag", this.SetDefaultLimitFlag);

    }
}

