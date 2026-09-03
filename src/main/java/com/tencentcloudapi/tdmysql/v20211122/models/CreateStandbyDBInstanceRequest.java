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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStandbyDBInstanceRequest extends AbstractModel {

    /**
    * <p>主实例 id</p>
    */
    @SerializedName("PrimaryInstanceId")
    @Expose
    private String PrimaryInstanceId;

    /**
    * <p>创建实例区域</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>字符型vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>字符型subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>购买规格</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>存储节点磁盘容量，单位GB</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>存储节点数量</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>存储节点副本数量，最大为5，要求为奇数</p>
    */
    @SerializedName("Replications")
    @Expose
    private Long Replications;

    /**
    * <p>全能型副本数</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>时间单位，y：年，m：月，d：日</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>商品的时间大小</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>存储节点CPU核数</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>存储节点内存大小</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>付费模式，0表示按需计费/后付费，1表示预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>自定义端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>多AZ可用区列表</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>是否使用优惠卷</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * <p>优惠卷列表</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>实例架构类型，19.0.0 起支持 &quot;hybrid&quot;&quot;</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>磁盘类型,CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>标签键值对数组</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>主实例地域</p>
    */
    @SerializedName("PrimaryInstanceRegion")
    @Expose
    private String PrimaryInstanceRegion;

    /**
    * <p>实例模式，normal:标准型；enhanced:加强型</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>dbaadmin密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>绑定安全组id列表</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get <p>主实例 id</p> 
     * @return PrimaryInstanceId <p>主实例 id</p>
     */
    public String getPrimaryInstanceId() {
        return this.PrimaryInstanceId;
    }

    /**
     * Set <p>主实例 id</p>
     * @param PrimaryInstanceId <p>主实例 id</p>
     */
    public void setPrimaryInstanceId(String PrimaryInstanceId) {
        this.PrimaryInstanceId = PrimaryInstanceId;
    }

    /**
     * Get <p>创建实例区域</p> 
     * @return Zone <p>创建实例区域</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>创建实例区域</p>
     * @param Zone <p>创建实例区域</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>字符型vpcid</p> 
     * @return VpcId <p>字符型vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>字符型vpcid</p>
     * @param VpcId <p>字符型vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>字符型subnetid</p> 
     * @return SubnetId <p>字符型subnetid</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>字符型subnetid</p>
     * @param SubnetId <p>字符型subnetid</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>购买规格</p> 
     * @return SpecCode <p>购买规格</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>购买规格</p>
     * @param SpecCode <p>购买规格</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>存储节点磁盘容量，单位GB</p> 
     * @return Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>存储节点磁盘容量，单位GB</p>
     * @param Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>存储节点数量</p> 
     * @return StorageNodeNum <p>存储节点数量</p>
     */
    public Long getStorageNodeNum() {
        return this.StorageNodeNum;
    }

    /**
     * Set <p>存储节点数量</p>
     * @param StorageNodeNum <p>存储节点数量</p>
     */
    public void setStorageNodeNum(Long StorageNodeNum) {
        this.StorageNodeNum = StorageNodeNum;
    }

    /**
     * Get <p>存储节点副本数量，最大为5，要求为奇数</p> 
     * @return Replications <p>存储节点副本数量，最大为5，要求为奇数</p>
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>存储节点副本数量，最大为5，要求为奇数</p>
     * @param Replications <p>存储节点副本数量，最大为5，要求为奇数</p>
     */
    public void setReplications(Long Replications) {
        this.Replications = Replications;
    }

    /**
     * Get <p>全能型副本数</p> 
     * @return FullReplications <p>全能型副本数</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>全能型副本数</p>
     * @param FullReplications <p>全能型副本数</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p> 
     * @return InstanceName <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p>
     * @param InstanceName <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>时间单位，y：年，m：月，d：日</p> 
     * @return TimeUnit <p>时间单位，y：年，m：月，d：日</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时间单位，y：年，m：月，d：日</p>
     * @param TimeUnit <p>时间单位，y：年，m：月，d：日</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>商品的时间大小</p> 
     * @return TimeSpan <p>商品的时间大小</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>商品的时间大小</p>
     * @param TimeSpan <p>商品的时间大小</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>存储节点CPU核数</p> 
     * @return StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>存储节点CPU核数</p>
     * @param StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>存储节点内存大小</p> 
     * @return StorageNodeMem <p>存储节点内存大小</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>存储节点内存大小</p>
     * @param StorageNodeMem <p>存储节点内存大小</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>付费模式，0表示按需计费/后付费，1表示预付费</p> 
     * @return PayMode <p>付费模式，0表示按需计费/后付费，1表示预付费</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，0表示按需计费/后付费，1表示预付费</p>
     * @param PayMode <p>付费模式，0表示按需计费/后付费，1表示预付费</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>自定义端口</p> 
     * @return Vport <p>自定义端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>自定义端口</p>
     * @param Vport <p>自定义端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>多AZ可用区列表</p> 
     * @return Zones <p>多AZ可用区列表</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>多AZ可用区列表</p>
     * @param Zones <p>多AZ可用区列表</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>是否使用优惠卷</p> 
     * @return AutoVoucher <p>是否使用优惠卷</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否使用优惠卷</p>
     * @param AutoVoucher <p>是否使用优惠卷</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>优惠卷列表</p> 
     * @return VoucherIds <p>优惠卷列表</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>优惠卷列表</p>
     * @param VoucherIds <p>优惠卷列表</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>实例架构类型，19.0.0 起支持 &quot;hybrid&quot;&quot;</p> 
     * @return InstanceType <p>实例架构类型，19.0.0 起支持 &quot;hybrid&quot;&quot;</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例架构类型，19.0.0 起支持 &quot;hybrid&quot;&quot;</p>
     * @param InstanceType <p>实例架构类型，19.0.0 起支持 &quot;hybrid&quot;&quot;</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>磁盘类型,CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p> 
     * @return StorageType <p>磁盘类型,CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型,CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     * @param StorageType <p>磁盘类型,CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>标签键值对数组</p> 
     * @return ResourceTags <p>标签键值对数组</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>标签键值对数组</p>
     * @param ResourceTags <p>标签键值对数组</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>主实例地域</p> 
     * @return PrimaryInstanceRegion <p>主实例地域</p>
     */
    public String getPrimaryInstanceRegion() {
        return this.PrimaryInstanceRegion;
    }

    /**
     * Set <p>主实例地域</p>
     * @param PrimaryInstanceRegion <p>主实例地域</p>
     */
    public void setPrimaryInstanceRegion(String PrimaryInstanceRegion) {
        this.PrimaryInstanceRegion = PrimaryInstanceRegion;
    }

    /**
     * Get <p>实例模式，normal:标准型；enhanced:加强型</p> 
     * @return InstanceMode <p>实例模式，normal:标准型；enhanced:加强型</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>实例模式，normal:标准型；enhanced:加强型</p>
     * @param InstanceMode <p>实例模式，normal:标准型；enhanced:加强型</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>dbaadmin密码</p> 
     * @return Password <p>dbaadmin密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>dbaadmin密码</p>
     * @param Password <p>dbaadmin密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>绑定安全组id列表</p> 
     * @return SecurityGroupIds <p>绑定安全组id列表</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>绑定安全组id列表</p>
     * @param SecurityGroupIds <p>绑定安全组id列表</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateStandbyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStandbyDBInstanceRequest(CreateStandbyDBInstanceRequest source) {
        if (source.PrimaryInstanceId != null) {
            this.PrimaryInstanceId = new String(source.PrimaryInstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.PrimaryInstanceRegion != null) {
            this.PrimaryInstanceRegion = new String(source.PrimaryInstanceRegion);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryInstanceId", this.PrimaryInstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "PrimaryInstanceRegion", this.PrimaryInstanceRegion);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

