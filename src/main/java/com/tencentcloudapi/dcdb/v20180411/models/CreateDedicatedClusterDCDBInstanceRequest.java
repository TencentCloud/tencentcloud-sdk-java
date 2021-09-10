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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDedicatedClusterDCDBInstanceRequest extends AbstractModel{

    /**
    * 分配实例个数
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 分片数量
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 分片內存大小, 单位GB
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * 分片磁盘大小, 单位GB
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * 独享集群集群uuid
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * （废弃）可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * （废弃）cpu大小，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * （废弃）分片机型
    */
    @SerializedName("ShardMachine")
    @Expose
    private String ShardMachine;

    /**
    * 分片的节点个数
    */
    @SerializedName("ShardNodeNum")
    @Expose
    private Long ShardNodeNum;

    /**
    * （废弃）节点cpu核数，单位：1/100核
    */
    @SerializedName("ShardNodeCpu")
    @Expose
    private Long ShardNodeCpu;

    /**
    * （废弃）节点內存大小，单位：GB
    */
    @SerializedName("ShardNodeMemory")
    @Expose
    private Long ShardNodeMemory;

    /**
    * （废弃）节点磁盘大小，单位：GB
    */
    @SerializedName("ShardNodeStorage")
    @Expose
    private Long ShardNodeStorage;

    /**
    * db版本
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * DCN源实例ID
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * DCN源实例地域名
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * 自定义实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 标签
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 支持IPv6标志：1 支持， 0 不支持
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * （废弃）Pid，可通过获取独享集群售卖配置接口得到
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue InitParams;

    /**
    * 指定主节点uuid，不填随机分配
    */
    @SerializedName("MasterHostId")
    @Expose
    private String MasterHostId;

    /**
    * 指定从节点uuid，不填随机分配
    */
    @SerializedName("SlaveHostIds")
    @Expose
    private String [] SlaveHostIds;

    /**
     * Get 分配实例个数 
     * @return GoodsNum 分配实例个数
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 分配实例个数
     * @param GoodsNum 分配实例个数
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 分片数量 
     * @return ShardNum 分片数量
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片数量
     * @param ShardNum 分片数量
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 分片內存大小, 单位GB 
     * @return ShardMemory 分片內存大小, 单位GB
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set 分片內存大小, 单位GB
     * @param ShardMemory 分片內存大小, 单位GB
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get 分片磁盘大小, 单位GB 
     * @return ShardStorage 分片磁盘大小, 单位GB
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set 分片磁盘大小, 单位GB
     * @param ShardStorage 分片磁盘大小, 单位GB
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get 独享集群集群uuid 
     * @return ClusterId 独享集群集群uuid
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 独享集群集群uuid
     * @param ClusterId 独享集群集群uuid
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get （废弃）可用区 
     * @return Zone （废弃）可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set （废弃）可用区
     * @param Zone （废弃）可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get （废弃）cpu大小，单位：核 
     * @return Cpu （废弃）cpu大小，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set （废弃）cpu大小，单位：核
     * @param Cpu （废弃）cpu大小，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 网络ID 
     * @return VpcId 网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网络ID
     * @param VpcId 网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get （废弃）分片机型 
     * @return ShardMachine （废弃）分片机型
     */
    public String getShardMachine() {
        return this.ShardMachine;
    }

    /**
     * Set （废弃）分片机型
     * @param ShardMachine （废弃）分片机型
     */
    public void setShardMachine(String ShardMachine) {
        this.ShardMachine = ShardMachine;
    }

    /**
     * Get 分片的节点个数 
     * @return ShardNodeNum 分片的节点个数
     */
    public Long getShardNodeNum() {
        return this.ShardNodeNum;
    }

    /**
     * Set 分片的节点个数
     * @param ShardNodeNum 分片的节点个数
     */
    public void setShardNodeNum(Long ShardNodeNum) {
        this.ShardNodeNum = ShardNodeNum;
    }

    /**
     * Get （废弃）节点cpu核数，单位：1/100核 
     * @return ShardNodeCpu （废弃）节点cpu核数，单位：1/100核
     */
    public Long getShardNodeCpu() {
        return this.ShardNodeCpu;
    }

    /**
     * Set （废弃）节点cpu核数，单位：1/100核
     * @param ShardNodeCpu （废弃）节点cpu核数，单位：1/100核
     */
    public void setShardNodeCpu(Long ShardNodeCpu) {
        this.ShardNodeCpu = ShardNodeCpu;
    }

    /**
     * Get （废弃）节点內存大小，单位：GB 
     * @return ShardNodeMemory （废弃）节点內存大小，单位：GB
     */
    public Long getShardNodeMemory() {
        return this.ShardNodeMemory;
    }

    /**
     * Set （废弃）节点內存大小，单位：GB
     * @param ShardNodeMemory （废弃）节点內存大小，单位：GB
     */
    public void setShardNodeMemory(Long ShardNodeMemory) {
        this.ShardNodeMemory = ShardNodeMemory;
    }

    /**
     * Get （废弃）节点磁盘大小，单位：GB 
     * @return ShardNodeStorage （废弃）节点磁盘大小，单位：GB
     */
    public Long getShardNodeStorage() {
        return this.ShardNodeStorage;
    }

    /**
     * Set （废弃）节点磁盘大小，单位：GB
     * @param ShardNodeStorage （废弃）节点磁盘大小，单位：GB
     */
    public void setShardNodeStorage(Long ShardNodeStorage) {
        this.ShardNodeStorage = ShardNodeStorage;
    }

    /**
     * Get db版本 
     * @return DbVersionId db版本
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set db版本
     * @param DbVersionId db版本
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupId 安全组ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupId 安全组ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get DCN源实例ID 
     * @return DcnInstanceId DCN源实例ID
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set DCN源实例ID
     * @param DcnInstanceId DCN源实例ID
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get DCN源实例地域名 
     * @return DcnRegion DCN源实例地域名
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set DCN源实例地域名
     * @param DcnRegion DCN源实例地域名
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get 自定义实例名称 
     * @return InstanceName 自定义实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 自定义实例名称
     * @param InstanceName 自定义实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 标签 
     * @return ResourceTags 标签
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 标签
     * @param ResourceTags 标签
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 支持IPv6标志：1 支持， 0 不支持 
     * @return Ipv6Flag 支持IPv6标志：1 支持， 0 不支持
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 支持IPv6标志：1 支持， 0 不支持
     * @param Ipv6Flag 支持IPv6标志：1 支持， 0 不支持
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get （废弃）Pid，可通过获取独享集群售卖配置接口得到 
     * @return Pid （废弃）Pid，可通过获取独享集群售卖配置接口得到
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set （废弃）Pid，可通过获取独享集群售卖配置接口得到
     * @param Pid （废弃）Pid，可通过获取独享集群售卖配置接口得到
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。 
     * @return InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public DBParamValue getInitParams() {
        return this.InitParams;
    }

    /**
     * Set 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     * @param InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public void setInitParams(DBParamValue InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get 指定主节点uuid，不填随机分配 
     * @return MasterHostId 指定主节点uuid，不填随机分配
     */
    public String getMasterHostId() {
        return this.MasterHostId;
    }

    /**
     * Set 指定主节点uuid，不填随机分配
     * @param MasterHostId 指定主节点uuid，不填随机分配
     */
    public void setMasterHostId(String MasterHostId) {
        this.MasterHostId = MasterHostId;
    }

    /**
     * Get 指定从节点uuid，不填随机分配 
     * @return SlaveHostIds 指定从节点uuid，不填随机分配
     */
    public String [] getSlaveHostIds() {
        return this.SlaveHostIds;
    }

    /**
     * Set 指定从节点uuid，不填随机分配
     * @param SlaveHostIds 指定从节点uuid，不填随机分配
     */
    public void setSlaveHostIds(String [] SlaveHostIds) {
        this.SlaveHostIds = SlaveHostIds;
    }

    public CreateDedicatedClusterDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterDCDBInstanceRequest(CreateDedicatedClusterDCDBInstanceRequest source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ShardMachine != null) {
            this.ShardMachine = new String(source.ShardMachine);
        }
        if (source.ShardNodeNum != null) {
            this.ShardNodeNum = new Long(source.ShardNodeNum);
        }
        if (source.ShardNodeCpu != null) {
            this.ShardNodeCpu = new Long(source.ShardNodeCpu);
        }
        if (source.ShardNodeMemory != null) {
            this.ShardNodeMemory = new Long(source.ShardNodeMemory);
        }
        if (source.ShardNodeStorage != null) {
            this.ShardNodeStorage = new Long(source.ShardNodeStorage);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
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
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue(source.InitParams);
        }
        if (source.MasterHostId != null) {
            this.MasterHostId = new String(source.MasterHostId);
        }
        if (source.SlaveHostIds != null) {
            this.SlaveHostIds = new String[source.SlaveHostIds.length];
            for (int i = 0; i < source.SlaveHostIds.length; i++) {
                this.SlaveHostIds[i] = new String(source.SlaveHostIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ShardMachine", this.ShardMachine);
        this.setParamSimple(map, prefix + "ShardNodeNum", this.ShardNodeNum);
        this.setParamSimple(map, prefix + "ShardNodeCpu", this.ShardNodeCpu);
        this.setParamSimple(map, prefix + "ShardNodeMemory", this.ShardNodeMemory);
        this.setParamSimple(map, prefix + "ShardNodeStorage", this.ShardNodeStorage);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "MasterHostId", this.MasterHostId);
        this.setParamArraySimple(map, prefix + "SlaveHostIds.", this.SlaveHostIds);

    }
}

