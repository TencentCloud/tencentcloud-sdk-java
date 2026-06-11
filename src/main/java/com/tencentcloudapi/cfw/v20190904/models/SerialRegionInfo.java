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
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>分配带宽值 单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>弹性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * <p>弹性带宽上限，单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * <p>七天入向峰值带宽，单位bps</p>
    */
    @SerializedName("InFlowMax")
    @Expose
    private Long InFlowMax;

    /**
    * <p>七天出向峰值带宽，单位bps</p>
    */
    @SerializedName("OutFlowMax")
    @Expose
    private Long OutFlowMax;

    /**
    * <p>边界按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("ElasticTrafficSwitch")
    @Expose
    private Long ElasticTrafficSwitch;

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>分配带宽值 单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width <p>分配带宽值 单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>分配带宽值 单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width <p>分配带宽值 单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>弹性开关</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticSwitch <p>弹性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set <p>弹性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticSwitch <p>弹性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get <p>弹性带宽上限，单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBandwidth <p>弹性带宽上限，单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set <p>弹性带宽上限，单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBandwidth <p>弹性带宽上限，单位Mbps</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get <p>七天入向峰值带宽，单位bps</p> 
     * @return InFlowMax <p>七天入向峰值带宽，单位bps</p>
     */
    public Long getInFlowMax() {
        return this.InFlowMax;
    }

    /**
     * Set <p>七天入向峰值带宽，单位bps</p>
     * @param InFlowMax <p>七天入向峰值带宽，单位bps</p>
     */
    public void setInFlowMax(Long InFlowMax) {
        this.InFlowMax = InFlowMax;
    }

    /**
     * Get <p>七天出向峰值带宽，单位bps</p> 
     * @return OutFlowMax <p>七天出向峰值带宽，单位bps</p>
     */
    public Long getOutFlowMax() {
        return this.OutFlowMax;
    }

    /**
     * Set <p>七天出向峰值带宽，单位bps</p>
     * @param OutFlowMax <p>七天出向峰值带宽，单位bps</p>
     */
    public void setOutFlowMax(Long OutFlowMax) {
        this.OutFlowMax = OutFlowMax;
    }

    /**
     * Get <p>边界按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return ElasticTrafficSwitch <p>边界按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getElasticTrafficSwitch() {
        return this.ElasticTrafficSwitch;
    }

    /**
     * Set <p>边界按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param ElasticTrafficSwitch <p>边界按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setElasticTrafficSwitch(Long ElasticTrafficSwitch) {
        this.ElasticTrafficSwitch = ElasticTrafficSwitch;
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
        if (source.ElasticTrafficSwitch != null) {
            this.ElasticTrafficSwitch = new Long(source.ElasticTrafficSwitch);
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
        this.setParamSimple(map, prefix + "ElasticTrafficSwitch", this.ElasticTrafficSwitch);

    }
}

