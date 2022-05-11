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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusStatus extends AbstractModel{

    /**
    * Prometheus Id
    */
    @SerializedName("PrometheusId")
    @Expose
    private String PrometheusId;

    /**
    * 展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 虚拟网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Grafana信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grafana")
    @Expose
    private GrafanaInfo Grafana;

    /**
    * Prometheus 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Prometheus Id 
     * @return PrometheusId Prometheus Id
     */
    public String getPrometheusId() {
        return this.PrometheusId;
    }

    /**
     * Set Prometheus Id
     * @param PrometheusId Prometheus Id
     */
    public void setPrometheusId(String PrometheusId) {
        this.PrometheusId = PrometheusId;
    }

    /**
     * Get 展示名称 
     * @return DisplayName 展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 展示名称
     * @param DisplayName 展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 虚拟网络Id 
     * @return VpcId 虚拟网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟网络Id
     * @param VpcId 虚拟网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 地区 
     * @return Region 地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区
     * @param Region 地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Grafana信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grafana Grafana信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GrafanaInfo getGrafana() {
        return this.Grafana;
    }

    /**
     * Set Grafana信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grafana Grafana信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafana(GrafanaInfo Grafana) {
        this.Grafana = Grafana;
    }

    /**
     * Get Prometheus 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type Prometheus 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Prometheus 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type Prometheus 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public PrometheusStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusStatus(PrometheusStatus source) {
        if (source.PrometheusId != null) {
            this.PrometheusId = new String(source.PrometheusId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Grafana != null) {
            this.Grafana = new GrafanaInfo(source.Grafana);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrometheusId", this.PrometheusId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "Grafana.", this.Grafana);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

