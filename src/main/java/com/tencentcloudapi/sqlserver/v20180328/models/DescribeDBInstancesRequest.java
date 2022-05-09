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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例状态。取值范围：
<li>1：申请中</li>
<li>2：运行中</li>
<li>3：受限运行中 (主备切换中)</li>
<li>4：已隔离</li>
<li>5：回收中</li>
<li>6：已回收</li>
<li>7：任务执行中 (实例做备份、回档等操作)</li>
<li>8：已下线</li>
<li>9：实例扩容中</li>
<li>10：实例迁移中</li>
<li>11：只读</li>
<li>12：重启中</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 付费类型检索 1-包年包月，0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，传空字符串(“”)则按照基础网络筛选。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 实例所属子网的唯一字符串ID，格式如： subnet-xxx，传空字符串(“”)则按照基础网络筛选。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例内网地址列表，格式如：172.1.0.12
    */
    @SerializedName("VipSet")
    @Expose
    private String [] VipSet;

    /**
    * 实例名称列表，模糊查询
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * 实例版本代号列表，格式如：2008R2，2012SP3等
    */
    @SerializedName("VersionSet")
    @Expose
    private String [] VersionSet;

    /**
    * 实例可用区，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例标签列表
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 模糊查询关键字，支持实例id、实例名、内网ip
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 实例唯一Uid列表
    */
    @SerializedName("UidSet")
    @Expose
    private String [] UidSet;

    /**
    * 实例类型 HA-高可用 RO-只读实例 SI-基础版 BI-商业智能服务
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

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
     * Get 实例状态。取值范围：
<li>1：申请中</li>
<li>2：运行中</li>
<li>3：受限运行中 (主备切换中)</li>
<li>4：已隔离</li>
<li>5：回收中</li>
<li>6：已回收</li>
<li>7：任务执行中 (实例做备份、回档等操作)</li>
<li>8：已下线</li>
<li>9：实例扩容中</li>
<li>10：实例迁移中</li>
<li>11：只读</li>
<li>12：重启中</li> 
     * @return Status 实例状态。取值范围：
<li>1：申请中</li>
<li>2：运行中</li>
<li>3：受限运行中 (主备切换中)</li>
<li>4：已隔离</li>
<li>5：回收中</li>
<li>6：已回收</li>
<li>7：任务执行中 (实例做备份、回档等操作)</li>
<li>8：已下线</li>
<li>9：实例扩容中</li>
<li>10：实例迁移中</li>
<li>11：只读</li>
<li>12：重启中</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。取值范围：
<li>1：申请中</li>
<li>2：运行中</li>
<li>3：受限运行中 (主备切换中)</li>
<li>4：已隔离</li>
<li>5：回收中</li>
<li>6：已回收</li>
<li>7：任务执行中 (实例做备份、回档等操作)</li>
<li>8：已下线</li>
<li>9：实例扩容中</li>
<li>10：实例迁移中</li>
<li>11：只读</li>
<li>12：重启中</li>
     * @param Status 实例状态。取值范围：
<li>1：申请中</li>
<li>2：运行中</li>
<li>3：受限运行中 (主备切换中)</li>
<li>4：已隔离</li>
<li>5：回收中</li>
<li>6：已回收</li>
<li>7：任务执行中 (实例做备份、回档等操作)</li>
<li>8：已下线</li>
<li>9：实例扩容中</li>
<li>10：实例迁移中</li>
<li>11：只读</li>
<li>12：重启中</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页 
     * @return Offset 分页返回，页编号，默认值为第0页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页
     * @param Offset 分页返回，页编号，默认值为第0页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为100 
     * @return Limit 分页返回，每页返回的数目，取值为1-100，默认值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为100
     * @param Limit 分页返回，每页返回的数目，取值为1-100，默认值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl 
     * @return InstanceIdSet 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl
     * @param InstanceIdSet 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 付费类型检索 1-包年包月，0-按量计费 
     * @return PayMode 付费类型检索 1-包年包月，0-按量计费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型检索 1-包年包月，0-按量计费
     * @param PayMode 付费类型检索 1-包年包月，0-按量计费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，传空字符串(“”)则按照基础网络筛选。 
     * @return VpcId 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，传空字符串(“”)则按照基础网络筛选。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，传空字符串(“”)则按照基础网络筛选。
     * @param VpcId 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，传空字符串(“”)则按照基础网络筛选。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例所属子网的唯一字符串ID，格式如： subnet-xxx，传空字符串(“”)则按照基础网络筛选。 
     * @return SubnetId 实例所属子网的唯一字符串ID，格式如： subnet-xxx，传空字符串(“”)则按照基础网络筛选。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例所属子网的唯一字符串ID，格式如： subnet-xxx，传空字符串(“”)则按照基础网络筛选。
     * @param SubnetId 实例所属子网的唯一字符串ID，格式如： subnet-xxx，传空字符串(“”)则按照基础网络筛选。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例内网地址列表，格式如：172.1.0.12 
     * @return VipSet 实例内网地址列表，格式如：172.1.0.12
     */
    public String [] getVipSet() {
        return this.VipSet;
    }

    /**
     * Set 实例内网地址列表，格式如：172.1.0.12
     * @param VipSet 实例内网地址列表，格式如：172.1.0.12
     */
    public void setVipSet(String [] VipSet) {
        this.VipSet = VipSet;
    }

    /**
     * Get 实例名称列表，模糊查询 
     * @return InstanceNameSet 实例名称列表，模糊查询
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set 实例名称列表，模糊查询
     * @param InstanceNameSet 实例名称列表，模糊查询
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get 实例版本代号列表，格式如：2008R2，2012SP3等 
     * @return VersionSet 实例版本代号列表，格式如：2008R2，2012SP3等
     */
    public String [] getVersionSet() {
        return this.VersionSet;
    }

    /**
     * Set 实例版本代号列表，格式如：2008R2，2012SP3等
     * @param VersionSet 实例版本代号列表，格式如：2008R2，2012SP3等
     */
    public void setVersionSet(String [] VersionSet) {
        this.VersionSet = VersionSet;
    }

    /**
     * Get 实例可用区，格式如：ap-guangzhou-2 
     * @return Zone 实例可用区，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例可用区，格式如：ap-guangzhou-2
     * @param Zone 实例可用区，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例标签列表 
     * @return TagKeys 实例标签列表
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 实例标签列表
     * @param TagKeys 实例标签列表
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get 模糊查询关键字，支持实例id、实例名、内网ip 
     * @return SearchKey 模糊查询关键字，支持实例id、实例名、内网ip
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 模糊查询关键字，支持实例id、实例名、内网ip
     * @param SearchKey 模糊查询关键字，支持实例id、实例名、内网ip
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 实例唯一Uid列表 
     * @return UidSet 实例唯一Uid列表
     */
    public String [] getUidSet() {
        return this.UidSet;
    }

    /**
     * Set 实例唯一Uid列表
     * @param UidSet 实例唯一Uid列表
     */
    public void setUidSet(String [] UidSet) {
        this.UidSet = UidSet;
    }

    /**
     * Get 实例类型 HA-高可用 RO-只读实例 SI-基础版 BI-商业智能服务 
     * @return InstanceType 实例类型 HA-高可用 RO-只读实例 SI-基础版 BI-商业智能服务
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型 HA-高可用 RO-只读实例 SI-基础版 BI-商业智能服务
     * @param InstanceType 实例类型 HA-高可用 RO-只读实例 SI-基础版 BI-商业智能服务
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VipSet != null) {
            this.VipSet = new String[source.VipSet.length];
            for (int i = 0; i < source.VipSet.length; i++) {
                this.VipSet[i] = new String(source.VipSet[i]);
            }
        }
        if (source.InstanceNameSet != null) {
            this.InstanceNameSet = new String[source.InstanceNameSet.length];
            for (int i = 0; i < source.InstanceNameSet.length; i++) {
                this.InstanceNameSet[i] = new String(source.InstanceNameSet[i]);
            }
        }
        if (source.VersionSet != null) {
            this.VersionSet = new String[source.VersionSet.length];
            for (int i = 0; i < source.VersionSet.length; i++) {
                this.VersionSet[i] = new String(source.VersionSet[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.UidSet != null) {
            this.UidSet = new String[source.UidSet.length];
            for (int i = 0; i < source.UidSet.length; i++) {
                this.UidSet[i] = new String(source.UidSet[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "VipSet.", this.VipSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamArraySimple(map, prefix + "VersionSet.", this.VersionSet);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "UidSet.", this.UidSet);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

