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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel{

    /**
    * 独享实例唯一id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 独享实例名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 独享实例描述
    */
    @SerializedName("InstanceDescription")
    @Expose
    private String InstanceDescription;

    /**
    * 独享实例计费类型
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 独享实例状态
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 独享实例预付费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 独享实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 独享实例网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConfig")
    @Expose
    private NetworkConfig NetworkConfig;

    /**
    * 独享实例vpc配置
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 独享实例参数配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parameters")
    @Expose
    private ParameterInfo [] Parameters;

    /**
    * 独享实例隔离时间
    */
    @SerializedName("IsolationStartedTime")
    @Expose
    private String IsolationStartedTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String Zones;

    /**
     * Get 独享实例唯一id 
     * @return InstanceId 独享实例唯一id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例唯一id
     * @param InstanceId 独享实例唯一id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 独享实例名字 
     * @return InstanceName 独享实例名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 独享实例名字
     * @param InstanceName 独享实例名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 独享实例描述 
     * @return InstanceDescription 独享实例描述
     */
    public String getInstanceDescription() {
        return this.InstanceDescription;
    }

    /**
     * Set 独享实例描述
     * @param InstanceDescription 独享实例描述
     */
    public void setInstanceDescription(String InstanceDescription) {
        this.InstanceDescription = InstanceDescription;
    }

    /**
     * Get 独享实例计费类型 
     * @return InstanceChargeType 独享实例计费类型
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 独享实例计费类型
     * @param InstanceChargeType 独享实例计费类型
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 独享实例状态 
     * @return InstanceState 独享实例状态
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 独享实例状态
     * @param InstanceState 独享实例状态
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 独享实例预付费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargePrepaid 独享实例预付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 独享实例预付费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargePrepaid 独享实例预付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 独享实例类型 
     * @return InstanceType 独享实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 独享实例类型
     * @param InstanceType 独享实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 独享实例网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConfig 独享实例网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkConfig getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set 独享实例网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConfig 独享实例网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConfig(NetworkConfig NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get 独享实例vpc配置 
     * @return VpcConfig 独享实例vpc配置
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 独享实例vpc配置
     * @param VpcConfig 独享实例vpc配置
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 独享实例参数配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parameters 独享实例参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterInfo [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 独享实例参数配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parameters 独享实例参数配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameters(ParameterInfo [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 独享实例隔离时间 
     * @return IsolationStartedTime 独享实例隔离时间
     */
    public String getIsolationStartedTime() {
        return this.IsolationStartedTime;
    }

    /**
     * Set 独享实例隔离时间
     * @param IsolationStartedTime 独享实例隔离时间
     */
    public void setIsolationStartedTime(String IsolationStartedTime) {
        this.IsolationStartedTime = IsolationStartedTime;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 可用区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String Zones) {
        this.Zones = Zones;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDescription != null) {
            this.InstanceDescription = new String(source.InstanceDescription);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NetworkConfig != null) {
            this.NetworkConfig = new NetworkConfig(source.NetworkConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
        }
        if (source.Parameters != null) {
            this.Parameters = new ParameterInfo[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new ParameterInfo(source.Parameters[i]);
            }
        }
        if (source.IsolationStartedTime != null) {
            this.IsolationStartedTime = new String(source.IsolationStartedTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Zones != null) {
            this.Zones = new String(source.Zones);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDescription", this.InstanceDescription);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "NetworkConfig.", this.NetworkConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "IsolationStartedTime", this.IsolationStartedTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Zones", this.Zones);

    }
}

