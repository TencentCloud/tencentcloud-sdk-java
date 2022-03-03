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

public class CreateHourDBInstanceRequest extends AbstractModel{

    /**
    * 节点可用区分布，最多可填两个可用区。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 节点个数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 储存大小，单位：GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 购买实例数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 项目ID，不传表示默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 统一网络ID，不传表示基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 统一子网ID，VpcId有值时需填写
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库引擎版本，当前可选：10.0.10，10.1.9，5.7.17。
如果不填的话，默认为10.1.9，表示Mariadb 10.1.9。
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 自定义实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 安全组ID，不传表示不绑定安全组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 是否支持IPv6
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * 标签键值对数组
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * DCN源地域
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * DCN源实例ID
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * 参数列表。本接口的可选值为：
character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），
innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化，默认为强同步可退化）。
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * 回档源实例ID
    */
    @SerializedName("RollbackInstanceId")
    @Expose
    private String RollbackInstanceId;

    /**
    * 回档时间
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
     * Get 节点可用区分布，最多可填两个可用区。 
     * @return Zones 节点可用区分布，最多可填两个可用区。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 节点可用区分布，最多可填两个可用区。
     * @param Zones 节点可用区分布，最多可填两个可用区。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 节点个数 
     * @return NodeCount 节点个数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点个数
     * @param NodeCount 节点个数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 内存大小，单位：GB 
     * @return Memory 内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：GB
     * @param Memory 内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 储存大小，单位：GB 
     * @return Storage 储存大小，单位：GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 储存大小，单位：GB
     * @param Storage 储存大小，单位：GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 购买实例数量 
     * @return Count 购买实例数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买实例数量
     * @param Count 购买实例数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 项目ID，不传表示默认项目 
     * @return ProjectId 项目ID，不传表示默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，不传表示默认项目
     * @param ProjectId 项目ID，不传表示默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 统一网络ID，不传表示基础网络 
     * @return VpcId 统一网络ID，不传表示基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 统一网络ID，不传表示基础网络
     * @param VpcId 统一网络ID，不传表示基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 统一子网ID，VpcId有值时需填写 
     * @return SubnetId 统一子网ID，VpcId有值时需填写
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 统一子网ID，VpcId有值时需填写
     * @param SubnetId 统一子网ID，VpcId有值时需填写
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库引擎版本，当前可选：10.0.10，10.1.9，5.7.17。
如果不填的话，默认为10.1.9，表示Mariadb 10.1.9。 
     * @return DbVersionId 数据库引擎版本，当前可选：10.0.10，10.1.9，5.7.17。
如果不填的话，默认为10.1.9，表示Mariadb 10.1.9。
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set 数据库引擎版本，当前可选：10.0.10，10.1.9，5.7.17。
如果不填的话，默认为10.1.9，表示Mariadb 10.1.9。
     * @param DbVersionId 数据库引擎版本，当前可选：10.0.10，10.1.9，5.7.17。
如果不填的话，默认为10.1.9，表示Mariadb 10.1.9。
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
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
     * Get 安全组ID，不传表示不绑定安全组 
     * @return SecurityGroupIds 安全组ID，不传表示不绑定安全组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID，不传表示不绑定安全组
     * @param SecurityGroupIds 安全组ID，不传表示不绑定安全组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 是否支持IPv6 
     * @return Ipv6Flag 是否支持IPv6
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 是否支持IPv6
     * @param Ipv6Flag 是否支持IPv6
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get 标签键值对数组 
     * @return ResourceTags 标签键值对数组
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 标签键值对数组
     * @param ResourceTags 标签键值对数组
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get DCN源地域 
     * @return DcnRegion DCN源地域
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set DCN源地域
     * @param DcnRegion DCN源地域
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
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
     * Get 参数列表。本接口的可选值为：
character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），
innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化，默认为强同步可退化）。 
     * @return InitParams 参数列表。本接口的可选值为：
character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），
innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化，默认为强同步可退化）。
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set 参数列表。本接口的可选值为：
character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），
innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化，默认为强同步可退化）。
     * @param InitParams 参数列表。本接口的可选值为：
character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），
innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化，默认为强同步可退化）。
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get 回档源实例ID 
     * @return RollbackInstanceId 回档源实例ID
     */
    public String getRollbackInstanceId() {
        return this.RollbackInstanceId;
    }

    /**
     * Set 回档源实例ID
     * @param RollbackInstanceId 回档源实例ID
     */
    public void setRollbackInstanceId(String RollbackInstanceId) {
        this.RollbackInstanceId = RollbackInstanceId;
    }

    /**
     * Get 回档时间 
     * @return RollbackTime 回档时间
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set 回档时间
     * @param RollbackTime 回档时间
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    public CreateHourDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHourDBInstanceRequest(CreateHourDBInstanceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.RollbackInstanceId != null) {
            this.RollbackInstanceId = new String(source.RollbackInstanceId);
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "RollbackInstanceId", this.RollbackInstanceId);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);

    }
}

