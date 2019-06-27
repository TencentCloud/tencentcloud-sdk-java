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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest  extends AbstractModel{

    /**
    * 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例类型，取值范围：0-所有实例,1-正式实例，2-临时实例, 3-只读实例，-1-正式实例+只读+灾备实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * 集群类型，取值范围：0-副本集实例，1-分片实例，-1-所有实例
    */
    @SerializedName("ClusterType")
    @Expose
    private Integer ClusterType;

    /**
    * 实例状态，取值范围：0-待初始化，1-流程执行中，2-实例有效，-2-实例已过期
    */
    @SerializedName("Status")
    @Expose
    private Integer [] Status;

    /**
    * 私有网络的ID，基础网络则不传该参数
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络的子网ID，基础网络则不传该参数。入参设置该参数的同时，必须设置相应的VpcId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 付费类型，取值范围：0-按量计费，1-包年包月，-1-按量计费+包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 单次请求返回的数量，最小值为1，最大值为100，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回结果集排序的字段，目前支持："ProjectId", "InstanceName", "CreateTime"，默认为升序排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回结果集排序方式，目前支持："ASC"或者"DESC"
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * 获取实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @return InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取实例类型，取值范围：0-所有实例,1-正式实例，2-临时实例, 3-只读实例，-1-正式实例+只读+灾备实例
     * @return InstanceType 实例类型，取值范围：0-所有实例,1-正式实例，2-临时实例, 3-只读实例，-1-正式实例+只读+灾备实例
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型，取值范围：0-所有实例,1-正式实例，2-临时实例, 3-只读实例，-1-正式实例+只读+灾备实例
     * @param InstanceType 实例类型，取值范围：0-所有实例,1-正式实例，2-临时实例, 3-只读实例，-1-正式实例+只读+灾备实例
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取集群类型，取值范围：0-副本集实例，1-分片实例，-1-所有实例
     * @return ClusterType 集群类型，取值范围：0-副本集实例，1-分片实例，-1-所有实例
     */
    public Integer getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型，取值范围：0-副本集实例，1-分片实例，-1-所有实例
     * @param ClusterType 集群类型，取值范围：0-副本集实例，1-分片实例，-1-所有实例
     */
    public void setClusterType(Integer ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取实例状态，取值范围：0-待初始化，1-流程执行中，2-实例有效，-2-实例已过期
     * @return Status 实例状态，取值范围：0-待初始化，1-流程执行中，2-实例有效，-2-实例已过期
     */
    public Integer [] getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态，取值范围：0-待初始化，1-流程执行中，2-实例有效，-2-实例已过期
     * @param Status 实例状态，取值范围：0-待初始化，1-流程执行中，2-实例有效，-2-实例已过期
     */
    public void setStatus(Integer [] Status) {
        this.Status = Status;
    }

    /**
     * 获取私有网络的ID，基础网络则不传该参数
     * @return VpcId 私有网络的ID，基础网络则不传该参数
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络的ID，基础网络则不传该参数
     * @param VpcId 私有网络的ID，基础网络则不传该参数
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络的子网ID，基础网络则不传该参数。入参设置该参数的同时，必须设置相应的VpcId
     * @return SubnetId 私有网络的子网ID，基础网络则不传该参数。入参设置该参数的同时，必须设置相应的VpcId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络的子网ID，基础网络则不传该参数。入参设置该参数的同时，必须设置相应的VpcId
     * @param SubnetId 私有网络的子网ID，基础网络则不传该参数。入参设置该参数的同时，必须设置相应的VpcId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取付费类型，取值范围：0-按量计费，1-包年包月，-1-按量计费+包年包月
     * @return PayMode 付费类型，取值范围：0-按量计费，1-包年包月，-1-按量计费+包年包月
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置付费类型，取值范围：0-按量计费，1-包年包月，-1-按量计费+包年包月
     * @param PayMode 付费类型，取值范围：0-按量计费，1-包年包月，-1-按量计费+包年包月
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取单次请求返回的数量，最小值为1，最大值为100，默认值为20
     * @return Limit 单次请求返回的数量，最小值为1，最大值为100，默认值为20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求返回的数量，最小值为1，最大值为100，默认值为20
     * @param Limit 单次请求返回的数量，最小值为1，最大值为100，默认值为20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量，默认值为0
     * @return Offset 偏移量，默认值为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认值为0
     * @param Offset 偏移量，默认值为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回结果集排序的字段，目前支持："ProjectId", "InstanceName", "CreateTime"，默认为升序排序
     * @return OrderBy 返回结果集排序的字段，目前支持："ProjectId", "InstanceName", "CreateTime"，默认为升序排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置返回结果集排序的字段，目前支持："ProjectId", "InstanceName", "CreateTime"，默认为升序排序
     * @param OrderBy 返回结果集排序的字段，目前支持："ProjectId", "InstanceName", "CreateTime"，默认为升序排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取返回结果集排序方式，目前支持："ASC"或者"DESC"
     * @return OrderByType 返回结果集排序方式，目前支持："ASC"或者"DESC"
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置返回结果集排序方式，目前支持："ASC"或者"DESC"
     * @param OrderByType 返回结果集排序方式，目前支持："ASC"或者"DESC"
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

