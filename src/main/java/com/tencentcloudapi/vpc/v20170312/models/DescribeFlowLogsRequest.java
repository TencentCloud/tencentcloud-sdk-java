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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowLogsRequest  extends AbstractModel{

    /**
    * 私用网络ID或者统一ID，建议使用统一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志唯一ID
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * 流日志实例名字
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流日志采集类型，ACCEPT|REJECT|ALL
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 流日志存储ID
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * 流日志存储ID状态
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 升序（asc）还是降序（desc）,默认：desc
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 每页行数，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取私用网络ID或者统一ID，建议使用统一ID
     * @return VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私用网络ID或者统一ID，建议使用统一ID
     * @param VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取流日志唯一ID
     * @return FlowLogId 流日志唯一ID
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * 设置流日志唯一ID
     * @param FlowLogId 流日志唯一ID
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * 获取流日志实例名字
     * @return FlowLogName 流日志实例名字
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * 设置流日志实例名字
     * @param FlowLogName 流日志实例名字
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * 获取流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     * @return ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * 设置流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     * @param ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * 获取资源唯一ID
     * @return ResourceId 资源唯一ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置资源唯一ID
     * @param ResourceId 资源唯一ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取流日志采集类型，ACCEPT|REJECT|ALL
     * @return TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * 设置流日志采集类型，ACCEPT|REJECT|ALL
     * @param TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * 获取流日志存储ID
     * @return CloudLogId 流日志存储ID
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * 设置流日志存储ID
     * @param CloudLogId 流日志存储ID
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * 获取流日志存储ID状态
     * @return CloudLogState 流日志存储ID状态
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * 设置流日志存储ID状态
     * @param CloudLogState 流日志存储ID状态
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * 获取按某个字段排序,支持字段：flowLogName,createTime，默认按createTime
     * @return OrderField 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置按某个字段排序,支持字段：flowLogName,createTime，默认按createTime
     * @param OrderField 按某个字段排序,支持字段：flowLogName,createTime，默认按createTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取升序（asc）还是降序（desc）,默认：desc
     * @return OrderDirection 升序（asc）还是降序（desc）,默认：desc
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * 设置升序（asc）还是降序（desc）,默认：desc
     * @param OrderDirection 升序（asc）还是降序（desc）,默认：desc
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * 获取偏移量，默认为0。
     * @return Offset 偏移量，默认为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页行数，默认为10
     * @return Limit 每页行数，默认为10
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页行数，默认为10
     * @param Limit 每页行数，默认为10
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogState", this.CloudLogState);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

