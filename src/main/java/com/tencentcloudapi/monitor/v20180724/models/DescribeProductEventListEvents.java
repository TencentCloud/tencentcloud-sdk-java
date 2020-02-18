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

public class DescribeProductEventListEvents extends AbstractModel{

    /**
    * 事件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 事件中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCName")
    @Expose
    private String EventCName;

    /**
    * 事件英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventEName")
    @Expose
    private String EventEName;

    /**
    * 事件简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 产品中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCName")
    @Expose
    private String ProductCName;

    /**
    * 产品英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductEName")
    @Expose
    private String ProductEName;

    /**
    * 产品简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否支持告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportAlarm")
    @Expose
    private Long SupportAlarm;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 实例对象信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeProductEventListEventsDimensions [] Dimensions;

    /**
    * 实例对象附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionMsg")
    @Expose
    private DescribeProductEventListEventsDimensions [] AdditionMsg;

    /**
    * 是否配置告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAlarmConfig")
    @Expose
    private Long IsAlarmConfig;

    /**
    * 策略信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupInfo")
    @Expose
    private DescribeProductEventListEventsGroupInfo [] GroupInfo;

    /**
     * Get 事件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCName 事件中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventCName() {
        return this.EventCName;
    }

    /**
     * Set 事件中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCName 事件中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCName(String EventCName) {
        this.EventCName = EventCName;
    }

    /**
     * Get 事件英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventEName 事件英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventEName() {
        return this.EventEName;
    }

    /**
     * Set 事件英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventEName 事件英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventEName(String EventEName) {
        this.EventEName = EventEName;
    }

    /**
     * Get 事件简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 产品中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCName 产品中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCName() {
        return this.ProductCName;
    }

    /**
     * Set 产品中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCName 产品中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCName(String ProductCName) {
        this.ProductCName = ProductCName;
    }

    /**
     * Get 产品英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductEName 产品英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductEName() {
        return this.ProductEName;
    }

    /**
     * Set 产品英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductEName 产品英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductEName(String ProductEName) {
        this.ProductEName = ProductEName;
    }

    /**
     * Get 产品简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否支持告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportAlarm 是否支持告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportAlarm() {
        return this.SupportAlarm;
    }

    /**
     * Set 是否支持告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportAlarm 是否支持告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportAlarm(Long SupportAlarm) {
        this.SupportAlarm = SupportAlarm;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例对象信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions 实例对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeProductEventListEventsDimensions [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 实例对象信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions 实例对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(DescribeProductEventListEventsDimensions [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 实例对象附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionMsg 实例对象附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeProductEventListEventsDimensions [] getAdditionMsg() {
        return this.AdditionMsg;
    }

    /**
     * Set 实例对象附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionMsg 实例对象附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionMsg(DescribeProductEventListEventsDimensions [] AdditionMsg) {
        this.AdditionMsg = AdditionMsg;
    }

    /**
     * Get 是否配置告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAlarmConfig 是否配置告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAlarmConfig() {
        return this.IsAlarmConfig;
    }

    /**
     * Set 是否配置告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAlarmConfig 是否配置告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAlarmConfig(Long IsAlarmConfig) {
        this.IsAlarmConfig = IsAlarmConfig;
    }

    /**
     * Get 策略信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupInfo 策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeProductEventListEventsGroupInfo [] getGroupInfo() {
        return this.GroupInfo;
    }

    /**
     * Set 策略信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupInfo 策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupInfo(DescribeProductEventListEventsGroupInfo [] GroupInfo) {
        this.GroupInfo = GroupInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventCName", this.EventCName);
        this.setParamSimple(map, prefix + "EventEName", this.EventEName);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProductCName", this.ProductCName);
        this.setParamSimple(map, prefix + "ProductEName", this.ProductEName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SupportAlarm", this.SupportAlarm);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArrayObj(map, prefix + "AdditionMsg.", this.AdditionMsg);
        this.setParamSimple(map, prefix + "IsAlarmConfig", this.IsAlarmConfig);
        this.setParamArrayObj(map, prefix + "GroupInfo.", this.GroupInfo);

    }
}

