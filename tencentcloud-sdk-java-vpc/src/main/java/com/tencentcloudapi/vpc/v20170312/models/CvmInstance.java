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

public class CvmInstance extends AbstractModel{

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 云主机实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云主机名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 云主机状态。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 实例内存容量，单位：GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例弹性网卡配额（包含主网卡）。
    */
    @SerializedName("EniLimit")
    @Expose
    private Long EniLimit;

    /**
    * 实例弹性网卡内网IP配额（包含主网卡）。
    */
    @SerializedName("EniIpLimit")
    @Expose
    private Long EniIpLimit;

    /**
    * 实例已绑定弹性网卡的个数（包含主网卡）。
    */
    @SerializedName("InstanceEniCount")
    @Expose
    private Long InstanceEniCount;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID。 
     * @return SubnetId 子网实例ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID。
     * @param SubnetId 子网实例ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 云主机实例ID 
     * @return InstanceId 云主机实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云主机实例ID
     * @param InstanceId 云主机实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云主机名称。 
     * @return InstanceName 云主机名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 云主机名称。
     * @param InstanceName 云主机名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 云主机状态。 
     * @return InstanceState 云主机状态。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 云主机状态。
     * @param InstanceState 云主机状态。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例的CPU核数，单位：核。 
     * @return CPU 实例的CPU核数，单位：核。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例的CPU核数，单位：核。
     * @param CPU 实例的CPU核数，单位：核。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 实例内存容量，单位：GB。 
     * @return Memory 实例内存容量，单位：GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：GB。
     * @param Memory 实例内存容量，单位：GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例弹性网卡配额（包含主网卡）。 
     * @return EniLimit 实例弹性网卡配额（包含主网卡）。
     */
    public Long getEniLimit() {
        return this.EniLimit;
    }

    /**
     * Set 实例弹性网卡配额（包含主网卡）。
     * @param EniLimit 实例弹性网卡配额（包含主网卡）。
     */
    public void setEniLimit(Long EniLimit) {
        this.EniLimit = EniLimit;
    }

    /**
     * Get 实例弹性网卡内网IP配额（包含主网卡）。 
     * @return EniIpLimit 实例弹性网卡内网IP配额（包含主网卡）。
     */
    public Long getEniIpLimit() {
        return this.EniIpLimit;
    }

    /**
     * Set 实例弹性网卡内网IP配额（包含主网卡）。
     * @param EniIpLimit 实例弹性网卡内网IP配额（包含主网卡）。
     */
    public void setEniIpLimit(Long EniIpLimit) {
        this.EniIpLimit = EniIpLimit;
    }

    /**
     * Get 实例已绑定弹性网卡的个数（包含主网卡）。 
     * @return InstanceEniCount 实例已绑定弹性网卡的个数（包含主网卡）。
     */
    public Long getInstanceEniCount() {
        return this.InstanceEniCount;
    }

    /**
     * Set 实例已绑定弹性网卡的个数（包含主网卡）。
     * @param InstanceEniCount 实例已绑定弹性网卡的个数（包含主网卡）。
     */
    public void setInstanceEniCount(Long InstanceEniCount) {
        this.InstanceEniCount = InstanceEniCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "EniLimit", this.EniLimit);
        this.setParamSimple(map, prefix + "EniIpLimit", this.EniIpLimit);
        this.setParamSimple(map, prefix + "InstanceEniCount", this.InstanceEniCount);

    }
}

