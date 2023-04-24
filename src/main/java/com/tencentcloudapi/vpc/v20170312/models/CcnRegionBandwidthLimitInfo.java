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

public class CcnRegionBandwidthLimitInfo extends AbstractModel{

    /**
    * 源地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 目的地域， 例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * 出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Long BandwidthLimit;

    /**
     * Get 源地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceRegion 源地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 源地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceRegion 源地域，例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 目的地域， 例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationRegion 目的地域， 例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set 目的地域， 例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationRegion 目的地域， 例如：ap-shanghai
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    /**
     * Get 出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthLimit 出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set 出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthLimit 出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthLimit(Long BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    public CcnRegionBandwidthLimitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRegionBandwidthLimitInfo(CcnRegionBandwidthLimitInfo source) {
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Long(source.BandwidthLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);

    }
}

