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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel{

    /**
    * 机型族配置信息
    */
    @SerializedName("InstanceFamilyConfig")
    @Expose
    private InstanceFamilyConfig InstanceFamilyConfig;

    /**
    * 机型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * CPU核数
    */
    @SerializedName("Vcpu")
    @Expose
    private Long Vcpu;

    /**
    * 内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 主频
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * 处理器型号
    */
    @SerializedName("CpuModelName")
    @Expose
    private String CpuModelName;

    /**
    * 机型族类别配置信息
    */
    @SerializedName("InstanceFamilyTypeConfig")
    @Expose
    private InstanceFamilyTypeConfig InstanceFamilyTypeConfig;

    /**
    * 机型额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 机型族配置信息 
     * @return InstanceFamilyConfig 机型族配置信息
     */
    public InstanceFamilyConfig getInstanceFamilyConfig() {
        return this.InstanceFamilyConfig;
    }

    /**
     * Set 机型族配置信息
     * @param InstanceFamilyConfig 机型族配置信息
     */
    public void setInstanceFamilyConfig(InstanceFamilyConfig InstanceFamilyConfig) {
        this.InstanceFamilyConfig = InstanceFamilyConfig;
    }

    /**
     * Get 机型 
     * @return InstanceType 机型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型
     * @param InstanceType 机型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get CPU核数 
     * @return Vcpu CPU核数
     */
    public Long getVcpu() {
        return this.Vcpu;
    }

    /**
     * Set CPU核数
     * @param Vcpu CPU核数
     */
    public void setVcpu(Long Vcpu) {
        this.Vcpu = Vcpu;
    }

    /**
     * Get 内存大小 
     * @return Memory 内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
     * @param Memory 内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 主频 
     * @return Frequency 主频
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 主频
     * @param Frequency 主频
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 处理器型号 
     * @return CpuModelName 处理器型号
     */
    public String getCpuModelName() {
        return this.CpuModelName;
    }

    /**
     * Set 处理器型号
     * @param CpuModelName 处理器型号
     */
    public void setCpuModelName(String CpuModelName) {
        this.CpuModelName = CpuModelName;
    }

    /**
     * Get 机型族类别配置信息 
     * @return InstanceFamilyTypeConfig 机型族类别配置信息
     */
    public InstanceFamilyTypeConfig getInstanceFamilyTypeConfig() {
        return this.InstanceFamilyTypeConfig;
    }

    /**
     * Set 机型族类别配置信息
     * @param InstanceFamilyTypeConfig 机型族类别配置信息
     */
    public void setInstanceFamilyTypeConfig(InstanceFamilyTypeConfig InstanceFamilyTypeConfig) {
        this.InstanceFamilyTypeConfig = InstanceFamilyTypeConfig;
    }

    /**
     * Get 机型额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo 机型额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 机型额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo 机型额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceFamilyConfig.", this.InstanceFamilyConfig);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Vcpu", this.Vcpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CpuModelName", this.CpuModelName);
        this.setParamObj(map, prefix + "InstanceFamilyTypeConfig.", this.InstanceFamilyTypeConfig);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

