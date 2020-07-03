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

    }
}

