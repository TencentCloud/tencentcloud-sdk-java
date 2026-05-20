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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLibraDBInstancesRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
    * 内存，单位为GB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 磁盘大小
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 同步对象列表
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * 新增RO组时使用的Port，取值范围为[0,65535)
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 新增只读实例数，取值范围为(0,15]
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，'_','-','.'
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 副本数
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * ReplicasNum>1或者ReplicasNum=1且Cpu>=32核的时候取值为'Exclusive'，其余场景取值'Common'
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 磁盘类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 是否自动选择代金券 1是 0否 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 订单来源，字符串长度范围为[0,64)
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * 交易模式 0-下单并支付 1-下单
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * 所属VPC网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所属子网ID，如果设置了VpcId，则SubnetId必填。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 安全组ID，新建只读实例时可以指定安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 分析引擎版本
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * 购买时长,与TimeUnit组合才能生效
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买时长单位, 与TimeSpan组合生效，可选:日:d,月:m
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 源端实例id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

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
     * Get 内存，单位为GB 
     * @return Mem 内存，单位为GB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存，单位为GB
     * @param Mem 内存，单位为GB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 磁盘大小 
     * @return StorageSize 磁盘大小
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 磁盘大小
     * @param StorageSize 磁盘大小
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 同步对象列表 
     * @return Objects 同步对象列表
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set 同步对象列表
     * @param Objects 同步对象列表
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 新增RO组时使用的Port，取值范围为[0,65535) 
     * @return Port 新增RO组时使用的Port，取值范围为[0,65535)
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 新增RO组时使用的Port，取值范围为[0,65535)
     * @param Port 新增RO组时使用的Port，取值范围为[0,65535)
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 新增只读实例数，取值范围为(0,15] 
     * @return GoodsNum 新增只读实例数，取值范围为(0,15]
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 新增只读实例数，取值范围为(0,15]
     * @param GoodsNum 新增只读实例数，取值范围为(0,15]
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，'_','-','.' 
     * @return InstanceName 实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，'_','-','.'
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，'_','-','.'
     * @param InstanceName 实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，'_','-','.'
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 副本数 
     * @return ReplicasNum 副本数
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set 副本数
     * @param ReplicasNum 副本数
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get ReplicasNum>1或者ReplicasNum=1且Cpu>=32核的时候取值为'Exclusive'，其余场景取值'Common' 
     * @return InstanceType ReplicasNum>1或者ReplicasNum=1且Cpu>=32核的时候取值为'Exclusive'，其余场景取值'Common'
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set ReplicasNum>1或者ReplicasNum=1且Cpu>=32核的时候取值为'Exclusive'，其余场景取值'Common'
     * @param InstanceType ReplicasNum>1或者ReplicasNum=1且Cpu>=32核的时候取值为'Exclusive'，其余场景取值'Common'
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 磁盘类型 
     * @return StorageType 磁盘类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 磁盘类型
     * @param StorageType 磁盘类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
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
     * Get 订单来源，字符串长度范围为[0,64) 
     * @return OrderSource 订单来源，字符串长度范围为[0,64)
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set 订单来源，字符串长度范围为[0,64)
     * @param OrderSource 订单来源，字符串长度范围为[0,64)
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get 交易模式 0-下单并支付 1-下单 
     * @return DealMode 交易模式 0-下单并支付 1-下单
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 交易模式 0-下单并支付 1-下单
     * @param DealMode 交易模式 0-下单并支付 1-下单
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get 所属VPC网络ID。 
     * @return VpcId 所属VPC网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属VPC网络ID。
     * @param VpcId 所属VPC网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所属子网ID，如果设置了VpcId，则SubnetId必填。 
     * @return SubnetId 所属子网ID，如果设置了VpcId，则SubnetId必填。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所属子网ID，如果设置了VpcId，则SubnetId必填。
     * @param SubnetId 所属子网ID，如果设置了VpcId，则SubnetId必填。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 安全组ID，新建只读实例时可以指定安全组。 
     * @return SecurityGroupIds 安全组ID，新建只读实例时可以指定安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID，新建只读实例时可以指定安全组。
     * @param SecurityGroupIds 安全组ID，新建只读实例时可以指定安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 分析引擎版本 
     * @return LibraDBVersion 分析引擎版本
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set 分析引擎版本
     * @param LibraDBVersion 分析引擎版本
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get 购买时长,与TimeUnit组合才能生效 
     * @return TimeSpan 购买时长,与TimeUnit组合才能生效
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长,与TimeUnit组合才能生效
     * @param TimeSpan 购买时长,与TimeUnit组合才能生效
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买时长单位, 与TimeSpan组合生效，可选:日:d,月:m 
     * @return TimeUnit 购买时长单位, 与TimeSpan组合生效，可选:日:d,月:m
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位, 与TimeSpan组合生效，可选:日:d,月:m
     * @param TimeUnit 购买时长单位, 与TimeSpan组合生效，可选:日:d,月:m
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 源端实例id 
     * @return SrcInstanceId 源端实例id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源端实例id
     * @param SrcInstanceId 源端实例id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    public AddLibraDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLibraDBInstancesRequest(AddLibraDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);

    }
}

