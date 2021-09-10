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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDedicatedClusterDBInstanceRequest extends AbstractModel{

    /**
    * 分配实例个数
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 內存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘大小，单位GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

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
    * （废弃）Pid，可通过获取独享集群售卖配置接口得到
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * （废弃）机型
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 网络Id
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
    * db类型，不传默认0
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * （废弃）是否手动指定一组服务器分配, 运维使用
    */
    @SerializedName("Manual")
    @Expose
    private Long Manual;

    /**
    * （废弃）DeviceNo参数
    */
    @SerializedName("DeviceNo")
    @Expose
    private String DeviceNo;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

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
    * 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * 实例节点数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

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
     * Get 內存大小，单位GB 
     * @return Memory 內存大小，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 內存大小，单位GB
     * @param Memory 內存大小，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘大小，单位GB 
     * @return Storage 磁盘大小，单位GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 磁盘大小，单位GB
     * @param Storage 磁盘大小，单位GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get （废弃）机型 
     * @return Machine （废弃）机型
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set （废弃）机型
     * @param Machine （废弃）机型
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 网络Id 
     * @return VpcId 网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网络Id
     * @param VpcId 网络Id
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
     * Get db类型，不传默认0 
     * @return DbVersionId db类型，不传默认0
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set db类型，不传默认0
     * @param DbVersionId db类型，不传默认0
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get （废弃）是否手动指定一组服务器分配, 运维使用 
     * @return Manual （废弃）是否手动指定一组服务器分配, 运维使用
     */
    public Long getManual() {
        return this.Manual;
    }

    /**
     * Set （废弃）是否手动指定一组服务器分配, 运维使用
     * @param Manual （废弃）是否手动指定一组服务器分配, 运维使用
     */
    public void setManual(Long Manual) {
        this.Manual = Manual;
    }

    /**
     * Get （废弃）DeviceNo参数 
     * @return DeviceNo （废弃）DeviceNo参数
     */
    public String getDeviceNo() {
        return this.DeviceNo;
    }

    /**
     * Set （废弃）DeviceNo参数
     * @param DeviceNo （废弃）DeviceNo参数
     */
    public void setDeviceNo(String DeviceNo) {
        this.DeviceNo = DeviceNo;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupIds 安全组ID
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupIds 安全组ID
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
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
     * Get 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。 
     * @return InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     * @param InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get 实例节点数 
     * @return NodeNum 实例节点数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 实例节点数
     * @param NodeNum 实例节点数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
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

    public CreateDedicatedClusterDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterDBInstanceRequest(CreateDedicatedClusterDBInstanceRequest source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
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
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.Manual != null) {
            this.Manual = new Long(source.Manual);
        }
        if (source.DeviceNo != null) {
            this.DeviceNo = new String(source.DeviceNo);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
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
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
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
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "Manual", this.Manual);
        this.setParamSimple(map, prefix + "DeviceNo", this.DeviceNo);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "MasterHostId", this.MasterHostId);
        this.setParamArraySimple(map, prefix + "SlaveHostIds.", this.SlaveHostIds);

    }
}

