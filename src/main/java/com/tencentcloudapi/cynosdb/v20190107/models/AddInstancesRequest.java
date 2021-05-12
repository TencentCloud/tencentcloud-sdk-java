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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 新增只读实例数
    */
    @SerializedName("ReadOnlyCount")
    @Expose
    private Long ReadOnlyCount;

    /**
    * 实例组ID，在已有RO组中新增实例时使用，不传则新增RO组
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 所属VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所属子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 新增RO组时使用的Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 是否自动选择代金券 1是 0否 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 订单来源
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cpu核数 
     * @return Cpu Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数
     * @param Cpu Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 新增只读实例数 
     * @return ReadOnlyCount 新增只读实例数
     */
    public Long getReadOnlyCount() {
        return this.ReadOnlyCount;
    }

    /**
     * Set 新增只读实例数
     * @param ReadOnlyCount 新增只读实例数
     */
    public void setReadOnlyCount(Long ReadOnlyCount) {
        this.ReadOnlyCount = ReadOnlyCount;
    }

    /**
     * Get 实例组ID，在已有RO组中新增实例时使用，不传则新增RO组 
     * @return InstanceGrpId 实例组ID，在已有RO组中新增实例时使用，不传则新增RO组
     */
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 实例组ID，在已有RO组中新增实例时使用，不传则新增RO组
     * @param InstanceGrpId 实例组ID，在已有RO组中新增实例时使用，不传则新增RO组
     */
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get 所属VPC网络ID 
     * @return VpcId 所属VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属VPC网络ID
     * @param VpcId 所属VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所属子网ID 
     * @return SubnetId 所属子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所属子网ID
     * @param SubnetId 所属子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 新增RO组时使用的Port 
     * @return Port 新增RO组时使用的Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 新增RO组时使用的Port
     * @param Port 新增RO组时使用的Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 是否自动选择代金券 1是 0否 默认为0 
     * @return AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券 1是 0否 默认为0
     * @param AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 订单来源 
     * @return OrderSource 订单来源
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set 订单来源
     * @param OrderSource 订单来源
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    public AddInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddInstancesRequest(AddInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.ReadOnlyCount != null) {
            this.ReadOnlyCount = new Long(source.ReadOnlyCount);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "ReadOnlyCount", this.ReadOnlyCount);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);

    }
}

