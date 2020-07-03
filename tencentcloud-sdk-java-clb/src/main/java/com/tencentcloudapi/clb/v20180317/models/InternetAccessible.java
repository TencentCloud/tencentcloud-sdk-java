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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel{

    /**
    * TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;
BANDWIDTH_PACKAGE 按带宽包计费（当前，只有指定运营商时才支持此种计费模式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 带宽包的类型，如SINGLEISP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthpkgSubType")
    @Expose
    private String BandwidthpkgSubType;

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;
BANDWIDTH_PACKAGE 按带宽包计费（当前，只有指定运营商时才支持此种计费模式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;
BANDWIDTH_PACKAGE 按带宽包计费（当前，只有指定运营商时才支持此种计费模式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;
BANDWIDTH_PACKAGE 按带宽包计费（当前，只有指定运营商时才支持此种计费模式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;
BANDWIDTH_PACKAGE 按带宽包计费（当前，只有指定运营商时才支持此种计费模式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetMaxBandwidthOut 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetMaxBandwidthOut 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 带宽包的类型，如SINGLEISP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthpkgSubType 带宽包的类型，如SINGLEISP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthpkgSubType() {
        return this.BandwidthpkgSubType;
    }

    /**
     * Set 带宽包的类型，如SINGLEISP
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthpkgSubType 带宽包的类型，如SINGLEISP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthpkgSubType(String BandwidthpkgSubType) {
        this.BandwidthpkgSubType = BandwidthpkgSubType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthpkgSubType", this.BandwidthpkgSubType);

    }
}

