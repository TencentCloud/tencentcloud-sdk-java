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

public class CreateCloneInstanceRequest extends AbstractModel {

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
    * <p>源实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称，要求长度1-60，允许包含中文、英文大小写、数字、-、_</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>标签键值对数组</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>备份回档名称</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

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
    * <p>创建版本</p>
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>创建端口号</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>恢复时间点</p>
    */
    @SerializedName("RecoverTime")
    @Expose
    private String RecoverTime;

    /**
    * <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>多可用区列表，Zones[0]表示主可用区</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>全能型副本数</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>实例模式，normal：标准型；enhanced:加强型</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

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
     * Get <p>源实例id</p> 
     * @return InstanceId <p>源实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>源实例id</p>
     * @param InstanceId <p>源实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>备份回档名称</p> 
     * @return BackupName <p>备份回档名称</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>备份回档名称</p>
     * @param BackupName <p>备份回档名称</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
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
     * Get <p>创建版本</p> 
     * @return CreateVersion <p>创建版本</p>
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>创建版本</p>
     * @param CreateVersion <p>创建版本</p>
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
    }

    /**
     * Get <p>创建端口号</p> 
     * @return Vport <p>创建端口号</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>创建端口号</p>
     * @param Vport <p>创建端口号</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>恢复时间点</p> 
     * @return RecoverTime <p>恢复时间点</p>
     */
    public String getRecoverTime() {
        return this.RecoverTime;
    }

    /**
     * Set <p>恢复时间点</p>
     * @param RecoverTime <p>恢复时间点</p>
     */
    public void setRecoverTime(String RecoverTime) {
        this.RecoverTime = RecoverTime;
    }

    /**
     * Get <p>实例架构类型，separate:分离架构；hybrid:对等架构</p> 
     * @return InstanceType <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
     * @param InstanceType <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p> 
     * @return StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     * @param StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>多可用区列表，Zones[0]表示主可用区</p> 
     * @return Zones <p>多可用区列表，Zones[0]表示主可用区</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>多可用区列表，Zones[0]表示主可用区</p>
     * @param Zones <p>多可用区列表，Zones[0]表示主可用区</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
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
     * Get <p>实例模式，normal：标准型；enhanced:加强型</p> 
     * @return InstanceMode <p>实例模式，normal：标准型；enhanced:加强型</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>实例模式，normal：标准型；enhanced:加强型</p>
     * @param InstanceMode <p>实例模式，normal：标准型；enhanced:加强型</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    public CreateCloneInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloneInstanceRequest(CreateCloneInstanceRequest source) {
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.RecoverTime != null) {
            this.RecoverTime = new String(source.RecoverTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "RecoverTime", this.RecoverTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);

    }
}

