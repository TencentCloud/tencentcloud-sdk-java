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

public class SerialRegionInfo extends AbstractModel {

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 分配带宽值 单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 弹性开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * 弹性带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * 七天入向峰值带宽，单位bps
    */
    @SerializedName("InFlowMax")
    @Expose
    private Long InFlowMax;

    /**
    * 七天出向峰值带宽，单位bps
    */
    @SerializedName("OutFlowMax")
    @Expose
    private Long OutFlowMax;

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 分配带宽值 单位Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 分配带宽值 单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 分配带宽值 单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 分配带宽值 单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 弹性开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticSwitch 弹性开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set 弹性开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticSwitch 弹性开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get 弹性带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBandwidth 弹性带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set 弹性带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBandwidth 弹性带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get 七天入向峰值带宽，单位bps 
     * @return InFlowMax 七天入向峰值带宽，单位bps
     */
    public Long getInFlowMax() {
        return this.InFlowMax;
    }

    /**
     * Set 七天入向峰值带宽，单位bps
     * @param InFlowMax 七天入向峰值带宽，单位bps
     */
    public void setInFlowMax(Long InFlowMax) {
        this.InFlowMax = InFlowMax;
    }

    /**
     * Get 七天出向峰值带宽，单位bps 
     * @return OutFlowMax 七天出向峰值带宽，单位bps
     */
    public Long getOutFlowMax() {
        return this.OutFlowMax;
    }

    /**
     * Set 七天出向峰值带宽，单位bps
     * @param OutFlowMax 七天出向峰值带宽，单位bps
     */
    public void setOutFlowMax(Long OutFlowMax) {
        this.OutFlowMax = OutFlowMax;
    }

    public SerialRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SerialRegionInfo(SerialRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Long(source.ElasticSwitch);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
        if (source.InFlowMax != null) {
            this.InFlowMax = new Long(source.InFlowMax);
        }
        if (source.OutFlowMax != null) {
            this.OutFlowMax = new Long(source.OutFlowMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);
        this.setParamSimple(map, prefix + "InFlowMax", this.InFlowMax);
        this.setParamSimple(map, prefix + "OutFlowMax", this.OutFlowMax);

    }
}

