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

public class DescribeProductEventListRequest extends AbstractModel {

    /**
    * 接口模块名，固定值"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 产品类型过滤，例如"cvm"表示云服务器
    */
    @SerializedName("ProductName")
    @Expose
    private String [] ProductName;

    /**
    * 事件名称过滤，例如"guest_reboot"表示机器重启
    */
    @SerializedName("EventName")
    @Expose
    private String [] EventName;

    /**
    * 影响对象，例如"ins-19708ino"
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * 维度过滤，例如外网IP:10.0.0.1
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeProductEventListDimensions [] Dimensions;

    /**
    * 产品事件地域过滤参数，例如gz，各地域缩写可参见[地域列表](https://cloud.tencent.com/document/product/248/50863)
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * 事件类型过滤，取值范围["status_change","abnormal"]，分别表示状态变更、异常事件
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 事件状态过滤，取值范围["recover","alarm","-"]，分别表示已恢复、未恢复、无状态
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 项目ID过滤
    */
    @SerializedName("Project")
    @Expose
    private String [] Project;

    /**
    * 告警状态配置过滤，1表示已配置，0表示未配置
    */
    @SerializedName("IsAlarmConfig")
    @Expose
    private Long IsAlarmConfig;

    /**
    * 按更新时间排序，ASC表示升序，DESC表示降序，默认DESC
    */
    @SerializedName("TimeOrder")
    @Expose
    private String TimeOrder;

    /**
    * 起始时间，默认一天前的时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，默认当前时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 页偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回的数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 接口模块名，固定值"monitor" 
     * @return Module 接口模块名，固定值"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 接口模块名，固定值"monitor"
     * @param Module 接口模块名，固定值"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 产品类型过滤，例如"cvm"表示云服务器 
     * @return ProductName 产品类型过滤，例如"cvm"表示云服务器
     */
    public String [] getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品类型过滤，例如"cvm"表示云服务器
     * @param ProductName 产品类型过滤，例如"cvm"表示云服务器
     */
    public void setProductName(String [] ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 事件名称过滤，例如"guest_reboot"表示机器重启 
     * @return EventName 事件名称过滤，例如"guest_reboot"表示机器重启
     */
    public String [] getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称过滤，例如"guest_reboot"表示机器重启
     * @param EventName 事件名称过滤，例如"guest_reboot"表示机器重启
     */
    public void setEventName(String [] EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 影响对象，例如"ins-19708ino" 
     * @return InstanceId 影响对象，例如"ins-19708ino"
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 影响对象，例如"ins-19708ino"
     * @param InstanceId 影响对象，例如"ins-19708ino"
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 维度过滤，例如外网IP:10.0.0.1 
     * @return Dimensions 维度过滤，例如外网IP:10.0.0.1
     */
    public DescribeProductEventListDimensions [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度过滤，例如外网IP:10.0.0.1
     * @param Dimensions 维度过滤，例如外网IP:10.0.0.1
     */
    public void setDimensions(DescribeProductEventListDimensions [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 产品事件地域过滤参数，例如gz，各地域缩写可参见[地域列表](https://cloud.tencent.com/document/product/248/50863) 
     * @return RegionList 产品事件地域过滤参数，例如gz，各地域缩写可参见[地域列表](https://cloud.tencent.com/document/product/248/50863)
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 产品事件地域过滤参数，例如gz，各地域缩写可参见[地域列表](https://cloud.tencent.com/document/product/248/50863)
     * @param RegionList 产品事件地域过滤参数，例如gz，各地域缩写可参见[地域列表](https://cloud.tencent.com/document/product/248/50863)
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get 事件类型过滤，取值范围["status_change","abnormal"]，分别表示状态变更、异常事件 
     * @return Type 事件类型过滤，取值范围["status_change","abnormal"]，分别表示状态变更、异常事件
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 事件类型过滤，取值范围["status_change","abnormal"]，分别表示状态变更、异常事件
     * @param Type 事件类型过滤，取值范围["status_change","abnormal"]，分别表示状态变更、异常事件
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 事件状态过滤，取值范围["recover","alarm","-"]，分别表示已恢复、未恢复、无状态 
     * @return Status 事件状态过滤，取值范围["recover","alarm","-"]，分别表示已恢复、未恢复、无状态
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 事件状态过滤，取值范围["recover","alarm","-"]，分别表示已恢复、未恢复、无状态
     * @param Status 事件状态过滤，取值范围["recover","alarm","-"]，分别表示已恢复、未恢复、无状态
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 项目ID过滤 
     * @return Project 项目ID过滤
     */
    public String [] getProject() {
        return this.Project;
    }

    /**
     * Set 项目ID过滤
     * @param Project 项目ID过滤
     */
    public void setProject(String [] Project) {
        this.Project = Project;
    }

    /**
     * Get 告警状态配置过滤，1表示已配置，0表示未配置 
     * @return IsAlarmConfig 告警状态配置过滤，1表示已配置，0表示未配置
     */
    public Long getIsAlarmConfig() {
        return this.IsAlarmConfig;
    }

    /**
     * Set 告警状态配置过滤，1表示已配置，0表示未配置
     * @param IsAlarmConfig 告警状态配置过滤，1表示已配置，0表示未配置
     */
    public void setIsAlarmConfig(Long IsAlarmConfig) {
        this.IsAlarmConfig = IsAlarmConfig;
    }

    /**
     * Get 按更新时间排序，ASC表示升序，DESC表示降序，默认DESC 
     * @return TimeOrder 按更新时间排序，ASC表示升序，DESC表示降序，默认DESC
     */
    public String getTimeOrder() {
        return this.TimeOrder;
    }

    /**
     * Set 按更新时间排序，ASC表示升序，DESC表示降序，默认DESC
     * @param TimeOrder 按更新时间排序，ASC表示升序，DESC表示降序，默认DESC
     */
    public void setTimeOrder(String TimeOrder) {
        this.TimeOrder = TimeOrder;
    }

    /**
     * Get 起始时间，默认一天前的时间戳 
     * @return StartTime 起始时间，默认一天前的时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认一天前的时间戳
     * @param StartTime 起始时间，默认一天前的时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认当前时间戳 
     * @return EndTime 结束时间，默认当前时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认当前时间戳
     * @param EndTime 结束时间，默认当前时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页偏移量，默认0 
     * @return Offset 页偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量，默认0
     * @param Offset 页偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回的数量，默认20 
     * @return Limit 每页返回的数量，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回的数量，默认20
     * @param Limit 每页返回的数量，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeProductEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListRequest(DescribeProductEventListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ProductName != null) {
            this.ProductName = new String[source.ProductName.length];
            for (int i = 0; i < source.ProductName.length; i++) {
                this.ProductName[i] = new String(source.ProductName[i]);
            }
        }
        if (source.EventName != null) {
            this.EventName = new String[source.EventName.length];
            for (int i = 0; i < source.EventName.length; i++) {
                this.EventName[i] = new String(source.EventName[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DescribeProductEventListDimensions[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DescribeProductEventListDimensions(source.Dimensions[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new String[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new String(source.Project[i]);
            }
        }
        if (source.IsAlarmConfig != null) {
            this.IsAlarmConfig = new Long(source.IsAlarmConfig);
        }
        if (source.TimeOrder != null) {
            this.TimeOrder = new String(source.TimeOrder);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "ProductName.", this.ProductName);
        this.setParamArraySimple(map, prefix + "EventName.", this.EventName);
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "Project.", this.Project);
        this.setParamSimple(map, prefix + "IsAlarmConfig", this.IsAlarmConfig);
        this.setParamSimple(map, prefix + "TimeOrder", this.TimeOrder);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

