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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceHourRequest extends AbstractModel {

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * 每个副本集内从节点个数，目前只支持从节点数为2
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Long SecondaryNum;

    /**
    * MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例类型，HIO10G：高IO万兆。
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 实例数量，默认值为1, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 可用区信息，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例角色，默认传MASTER即可
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
    * 私有网络ID，如果不传则默认选择基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目ID，不填为默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 安全组参数
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 私有网络ID，如果不传则默认选择基础网络
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * Get 实例内存大小，单位：GB 
     * @return Memory 实例内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB 
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10 
     * @return ReplicateSetNum 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     * @param ReplicateSetNum 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get 每个副本集内从节点个数，目前只支持从节点数为2 
     * @return SecondaryNum 每个副本集内从节点个数，目前只支持从节点数为2
     */
    public Long getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * Set 每个副本集内从节点个数，目前只支持从节点数为2
     * @param SecondaryNum 每个副本集内从节点个数，目前只支持从节点数为2
     */
    public void setSecondaryNum(Long SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * Get MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT 
     * @return EngineVersion MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     * @param EngineVersion MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 实例类型，HIO10G：高IO万兆。 
     * @return Machine 实例类型，HIO10G：高IO万兆。
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 实例类型，HIO10G：高IO万兆。
     * @param Machine 实例类型，HIO10G：高IO万兆。
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 实例数量，默认值为1, 最小值1，最大值为10 
     * @return GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，默认值为1, 最小值1，最大值为10
     * @param GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 可用区信息，格式如：ap-guangzhou-2 
     * @return Zone 可用区信息，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息，格式如：ap-guangzhou-2
     * @param Zone 可用区信息，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例角色，默认传MASTER即可 
     * @return InstanceRole 实例角色，默认传MASTER即可
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例角色，默认传MASTER即可
     * @param InstanceRole 实例角色，默认传MASTER即可
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例类型，REPLSET-副本集，SHARD-分片集群 
     * @return InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，REPLSET-副本集，SHARD-分片集群
     * @param InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密 
     * @return Encrypt 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     * @param Encrypt 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 私有网络ID，如果不传则默认选择基础网络 
     * @return VpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，如果不传则默认选择基础网络
     * @param VpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填 
     * @return SubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @param SubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 项目ID，不填为默认项目 
     * @return ProjectId 项目ID，不填为默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，不填为默认项目
     * @param ProjectId 项目ID，不填为默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全组参数 
     * @return SecurityGroup 安全组参数
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组参数
     * @param SecurityGroup 安全组参数
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 私有网络ID，如果不传则默认选择基础网络 
     * @return UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID，如果不传则默认选择基础网络
     * @param UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填 
     * @return UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @param UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    public CreateDBInstanceHourRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceHourRequest(CreateDBInstanceHourRequest source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.SecondaryNum != null) {
            this.SecondaryNum = new Long(source.SecondaryNum);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}

