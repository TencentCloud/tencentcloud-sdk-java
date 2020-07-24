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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 分页参数，每页返回的数量，取值1~100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，页偏移量，从0开始计数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按策略名搜索
    */
    @SerializedName("Like")
    @Expose
    private String Like;

    /**
    * 实例分组id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 按更新时间排序, asc 或者 desc
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * 项目id列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 告警策略类型列表
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * 是否过滤无接收人策略组, 1表示过滤, 0表示不过滤
    */
    @SerializedName("FilterUnuseReceiver")
    @Expose
    private Long FilterUnuseReceiver;

    /**
    * 过滤条件, 接收组列表
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 过滤条件, 接收人列表
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private String [] ReceiverUserList;

    /**
    * 维度组合字段(json字符串), 例如[[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]]
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 模板策略组id, 多个id用逗号分隔
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private String ConditionTempGroupId;

    /**
    * 过滤条件, 接收人或者接收组, user表示接收人, group表示接收组
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 过滤条件，告警策略是否已启动或停止
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 分页参数，每页返回的数量，取值1~100 
     * @return Limit 分页参数，每页返回的数量，取值1~100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的数量，取值1~100
     * @param Limit 分页参数，每页返回的数量，取值1~100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，页偏移量，从0开始计数 
     * @return Offset 分页参数，页偏移量，从0开始计数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移量，从0开始计数
     * @param Offset 分页参数，页偏移量，从0开始计数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按策略名搜索 
     * @return Like 按策略名搜索
     */
    public String getLike() {
        return this.Like;
    }

    /**
     * Set 按策略名搜索
     * @param Like 按策略名搜索
     */
    public void setLike(String Like) {
        this.Like = Like;
    }

    /**
     * Get 实例分组id 
     * @return InstanceGroupId 实例分组id
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组id
     * @param InstanceGroupId 实例分组id
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 按更新时间排序, asc 或者 desc 
     * @return UpdateTimeOrder 按更新时间排序, asc 或者 desc
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set 按更新时间排序, asc 或者 desc
     * @param UpdateTimeOrder 按更新时间排序, asc 或者 desc
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get 项目id列表 
     * @return ProjectIds 项目id列表
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目id列表
     * @param ProjectIds 项目id列表
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 告警策略类型列表 
     * @return ViewNames 告警策略类型列表
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set 告警策略类型列表
     * @param ViewNames 告警策略类型列表
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get 是否过滤无接收人策略组, 1表示过滤, 0表示不过滤 
     * @return FilterUnuseReceiver 是否过滤无接收人策略组, 1表示过滤, 0表示不过滤
     */
    public Long getFilterUnuseReceiver() {
        return this.FilterUnuseReceiver;
    }

    /**
     * Set 是否过滤无接收人策略组, 1表示过滤, 0表示不过滤
     * @param FilterUnuseReceiver 是否过滤无接收人策略组, 1表示过滤, 0表示不过滤
     */
    public void setFilterUnuseReceiver(Long FilterUnuseReceiver) {
        this.FilterUnuseReceiver = FilterUnuseReceiver;
    }

    /**
     * Get 过滤条件, 接收组列表 
     * @return Receivers 过滤条件, 接收组列表
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 过滤条件, 接收组列表
     * @param Receivers 过滤条件, 接收组列表
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 过滤条件, 接收人列表 
     * @return ReceiverUserList 过滤条件, 接收人列表
     */
    public String [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set 过滤条件, 接收人列表
     * @param ReceiverUserList 过滤条件, 接收人列表
     */
    public void setReceiverUserList(String [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get 维度组合字段(json字符串), 例如[[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]] 
     * @return Dimensions 维度组合字段(json字符串), 例如[[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]]
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度组合字段(json字符串), 例如[[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]]
     * @param Dimensions 维度组合字段(json字符串), 例如[[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]]
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 模板策略组id, 多个id用逗号分隔 
     * @return ConditionTempGroupId 模板策略组id, 多个id用逗号分隔
     */
    public String getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set 模板策略组id, 多个id用逗号分隔
     * @param ConditionTempGroupId 模板策略组id, 多个id用逗号分隔
     */
    public void setConditionTempGroupId(String ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Get 过滤条件, 接收人或者接收组, user表示接收人, group表示接收组 
     * @return ReceiverType 过滤条件, 接收人或者接收组, user表示接收人, group表示接收组
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 过滤条件, 接收人或者接收组, user表示接收人, group表示接收组
     * @param ReceiverType 过滤条件, 接收人或者接收组, user表示接收人, group表示接收组
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 过滤条件，告警策略是否已启动或停止 
     * @return IsOpen 过滤条件，告警策略是否已启动或停止
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 过滤条件，告警策略是否已启动或停止
     * @param IsOpen 过滤条件，告警策略是否已启动或停止
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Like", this.Like);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ViewNames.", this.ViewNames);
        this.setParamSimple(map, prefix + "FilterUnuseReceiver", this.FilterUnuseReceiver);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);

    }
}

