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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>分页参数，每页返回的数量，取值1~100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页参数，页偏移量，从0开始计数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>按策略名搜索</p>
    */
    @SerializedName("Like")
    @Expose
    private String Like;

    /**
    * <p>实例分组id</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * <p>按更新时间排序, asc 或者 desc</p>
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * <p>项目id列表</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>告警策略类型列表</p>
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * <p>是否过滤无接收人策略组, 1表示过滤, 0表示不过滤</p>
    */
    @SerializedName("FilterUnuseReceiver")
    @Expose
    private Long FilterUnuseReceiver;

    /**
    * <p>过滤条件, 接收组列表</p>
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * <p>过滤条件, 接收人列表</p>
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private String [] ReceiverUserList;

    /**
    * <p>维度组合字段(json字符串), 例如[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-6e4b2aaa&quot;}]]</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>模板策略组id, 多个id用逗号分隔</p>
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private String ConditionTempGroupId;

    /**
    * <p>过滤条件, 接收人或者接收组, user表示接收人, group表示接收组</p>
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * <p>过滤条件，告警策略是否已启动或停止</p>
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>分页参数，每页返回的数量，取值1~100</p> 
     * @return Limit <p>分页参数，每页返回的数量，取值1~100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页参数，每页返回的数量，取值1~100</p>
     * @param Limit <p>分页参数，每页返回的数量，取值1~100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页参数，页偏移量，从0开始计数</p> 
     * @return Offset <p>分页参数，页偏移量，从0开始计数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页参数，页偏移量，从0开始计数</p>
     * @param Offset <p>分页参数，页偏移量，从0开始计数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>按策略名搜索</p> 
     * @return Like <p>按策略名搜索</p>
     */
    public String getLike() {
        return this.Like;
    }

    /**
     * Set <p>按策略名搜索</p>
     * @param Like <p>按策略名搜索</p>
     */
    public void setLike(String Like) {
        this.Like = Like;
    }

    /**
     * Get <p>实例分组id</p> 
     * @return InstanceGroupId <p>实例分组id</p>
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例分组id</p>
     * @param InstanceGroupId <p>实例分组id</p>
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>按更新时间排序, asc 或者 desc</p> 
     * @return UpdateTimeOrder <p>按更新时间排序, asc 或者 desc</p>
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set <p>按更新时间排序, asc 或者 desc</p>
     * @param UpdateTimeOrder <p>按更新时间排序, asc 或者 desc</p>
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get <p>项目id列表</p> 
     * @return ProjectIds <p>项目id列表</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目id列表</p>
     * @param ProjectIds <p>项目id列表</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>告警策略类型列表</p> 
     * @return ViewNames <p>告警策略类型列表</p>
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set <p>告警策略类型列表</p>
     * @param ViewNames <p>告警策略类型列表</p>
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get <p>是否过滤无接收人策略组, 1表示过滤, 0表示不过滤</p> 
     * @return FilterUnuseReceiver <p>是否过滤无接收人策略组, 1表示过滤, 0表示不过滤</p>
     */
    public Long getFilterUnuseReceiver() {
        return this.FilterUnuseReceiver;
    }

    /**
     * Set <p>是否过滤无接收人策略组, 1表示过滤, 0表示不过滤</p>
     * @param FilterUnuseReceiver <p>是否过滤无接收人策略组, 1表示过滤, 0表示不过滤</p>
     */
    public void setFilterUnuseReceiver(Long FilterUnuseReceiver) {
        this.FilterUnuseReceiver = FilterUnuseReceiver;
    }

    /**
     * Get <p>过滤条件, 接收组列表</p> 
     * @return Receivers <p>过滤条件, 接收组列表</p>
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set <p>过滤条件, 接收组列表</p>
     * @param Receivers <p>过滤条件, 接收组列表</p>
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get <p>过滤条件, 接收人列表</p> 
     * @return ReceiverUserList <p>过滤条件, 接收人列表</p>
     */
    public String [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set <p>过滤条件, 接收人列表</p>
     * @param ReceiverUserList <p>过滤条件, 接收人列表</p>
     */
    public void setReceiverUserList(String [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get <p>维度组合字段(json字符串), 例如[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-6e4b2aaa&quot;}]]</p> 
     * @return Dimensions <p>维度组合字段(json字符串), 例如[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-6e4b2aaa&quot;}]]</p>
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>维度组合字段(json字符串), 例如[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-6e4b2aaa&quot;}]]</p>
     * @param Dimensions <p>维度组合字段(json字符串), 例如[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-6e4b2aaa&quot;}]]</p>
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>模板策略组id, 多个id用逗号分隔</p> 
     * @return ConditionTempGroupId <p>模板策略组id, 多个id用逗号分隔</p>
     */
    public String getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set <p>模板策略组id, 多个id用逗号分隔</p>
     * @param ConditionTempGroupId <p>模板策略组id, 多个id用逗号分隔</p>
     */
    public void setConditionTempGroupId(String ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Get <p>过滤条件, 接收人或者接收组, user表示接收人, group表示接收组</p> 
     * @return ReceiverType <p>过滤条件, 接收人或者接收组, user表示接收人, group表示接收组</p>
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set <p>过滤条件, 接收人或者接收组, user表示接收人, group表示接收组</p>
     * @param ReceiverType <p>过滤条件, 接收人或者接收组, user表示接收人, group表示接收组</p>
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get <p>过滤条件，告警策略是否已启动或停止</p> 
     * @return IsOpen <p>过滤条件，告警策略是否已启动或停止</p>
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>过滤条件，告警策略是否已启动或停止</p>
     * @param IsOpen <p>过滤条件，告警策略是否已启动或停止</p>
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    public DescribePolicyGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListRequest(DescribePolicyGroupListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Like != null) {
            this.Like = new String(source.Like);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.UpdateTimeOrder != null) {
            this.UpdateTimeOrder = new String(source.UpdateTimeOrder);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.ViewNames != null) {
            this.ViewNames = new String[source.ViewNames.length];
            for (int i = 0; i < source.ViewNames.length; i++) {
                this.ViewNames[i] = new String(source.ViewNames[i]);
            }
        }
        if (source.FilterUnuseReceiver != null) {
            this.FilterUnuseReceiver = new Long(source.FilterUnuseReceiver);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.ReceiverUserList != null) {
            this.ReceiverUserList = new String[source.ReceiverUserList.length];
            for (int i = 0; i < source.ReceiverUserList.length; i++) {
                this.ReceiverUserList[i] = new String(source.ReceiverUserList[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.ConditionTempGroupId != null) {
            this.ConditionTempGroupId = new String(source.ConditionTempGroupId);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
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

