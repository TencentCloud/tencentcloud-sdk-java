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

public class CcnRegionBandwidthLimit extends AbstractModel{

    /**
    * 地域，例如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 出带宽上限，单位：Mbps
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Long BandwidthLimit;

    /**
    * 是否黑石地域，默认`false`。
    */
    @SerializedName("IsBm")
    @Expose
    private Boolean IsBm;

    /**
    * 目的地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 目的地域是否为黑石地域，默认`false`。
    */
    @SerializedName("DstIsBm")
    @Expose
    private Boolean DstIsBm;

    /**
     * Get 地域，例如：ap-guangzhou 
     * @return Region 地域，例如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域，例如：ap-guangzhou
     * @param Region 地域，例如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 出带宽上限，单位：Mbps 
     * @return BandwidthLimit 出带宽上限，单位：Mbps
     */
    public Long getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set 出带宽上限，单位：Mbps
     * @param BandwidthLimit 出带宽上限，单位：Mbps
     */
    public void setBandwidthLimit(Long BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get 是否黑石地域，默认`false`。 
     * @return IsBm 是否黑石地域，默认`false`。
     */
    public Boolean getIsBm() {
        return this.IsBm;
    }

    /**
     * Set 是否黑石地域，默认`false`。
     * @param IsBm 是否黑石地域，默认`false`。
     */
    public void setIsBm(Boolean IsBm) {
        this.IsBm = IsBm;
    }

    /**
     * Get 目的地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstRegion 目的地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 目的地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstRegion 目的地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 目的地域是否为黑石地域，默认`false`。 
     * @return DstIsBm 目的地域是否为黑石地域，默认`false`。
     */
    public Boolean getDstIsBm() {
        return this.DstIsBm;
    }

    /**
     * Set 目的地域是否为黑石地域，默认`false`。
     * @param DstIsBm 目的地域是否为黑石地域，默认`false`。
     */
    public void setDstIsBm(Boolean DstIsBm) {
        this.DstIsBm = DstIsBm;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "IsBm", this.IsBm);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "DstIsBm", this.DstIsBm);

    }
}

