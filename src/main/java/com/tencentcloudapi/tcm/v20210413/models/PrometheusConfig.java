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

public class PrometheusConfig extends AbstractModel{

    /**
    * 虚拟网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 关联已存在实例Id，不填则默认创建
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 第三方 Prometheus
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomProm")
    @Expose
    private CustomPromConfig CustomProm;

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
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 关联已存在实例Id，不填则默认创建 
     * @return InstanceId 关联已存在实例Id，不填则默认创建
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联已存在实例Id，不填则默认创建
     * @param InstanceId 关联已存在实例Id，不填则默认创建
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 第三方 Prometheus
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomProm 第三方 Prometheus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomPromConfig getCustomProm() {
        return this.CustomProm;
    }

    /**
     * Set 第三方 Prometheus
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomProm 第三方 Prometheus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomProm(CustomPromConfig CustomProm) {
        this.CustomProm = CustomProm;
    }

    public PrometheusConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusConfig(PrometheusConfig source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CustomProm != null) {
            this.CustomProm = new CustomPromConfig(source.CustomProm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "CustomProm.", this.CustomProm);

    }
}

