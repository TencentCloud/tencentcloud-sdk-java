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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsgAsGroupActivity extends AbstractModel{

    /**
    * 伸缩组活动 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 关联的伸缩组 ID
    */
    @SerializedName("RsgAsGroupId")
    @Expose
    private String RsgAsGroupId;

    /**
    * 活动类型
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 状态的编码
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * 状态的消息
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * 活动原因
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * 活动描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 活动开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 活动结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 活动创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 活动相关联的节点
    */
    @SerializedName("RsgAsActivityRelatedInstance")
    @Expose
    private RsgAsActivityRelatedInstance [] RsgAsActivityRelatedInstance;

    /**
    * 简略的状态消息
    */
    @SerializedName("StatusMessageSimplified")
    @Expose
    private String StatusMessageSimplified;

    /**
     * Get 伸缩组活动 ID 
     * @return Id 伸缩组活动 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 伸缩组活动 ID
     * @param Id 伸缩组活动 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 关联的伸缩组 ID 
     * @return RsgAsGroupId 关联的伸缩组 ID
     */
    public String getRsgAsGroupId() {
        return this.RsgAsGroupId;
    }

    /**
     * Set 关联的伸缩组 ID
     * @param RsgAsGroupId 关联的伸缩组 ID
     */
    public void setRsgAsGroupId(String RsgAsGroupId) {
        this.RsgAsGroupId = RsgAsGroupId;
    }

    /**
     * Get 活动类型 
     * @return ActivityType 活动类型
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 活动类型
     * @param ActivityType 活动类型
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 状态的编码 
     * @return StatusCode 状态的编码
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 状态的编码
     * @param StatusCode 状态的编码
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 状态的消息 
     * @return StatusMessage 状态的消息
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 状态的消息
     * @param StatusMessage 状态的消息
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get 活动原因 
     * @return Cause 活动原因
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set 活动原因
     * @param Cause 活动原因
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get 活动描述 
     * @return Description 活动描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 活动描述
     * @param Description 活动描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 活动开始时间 
     * @return StartTime 活动开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 活动开始时间
     * @param StartTime 活动开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 活动结束时间 
     * @return EndTime 活动结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 活动结束时间
     * @param EndTime 活动结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 活动创建时间 
     * @return CreateTime 活动创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 活动创建时间
     * @param CreateTime 活动创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 活动相关联的节点 
     * @return RsgAsActivityRelatedInstance 活动相关联的节点
     */
    public RsgAsActivityRelatedInstance [] getRsgAsActivityRelatedInstance() {
        return this.RsgAsActivityRelatedInstance;
    }

    /**
     * Set 活动相关联的节点
     * @param RsgAsActivityRelatedInstance 活动相关联的节点
     */
    public void setRsgAsActivityRelatedInstance(RsgAsActivityRelatedInstance [] RsgAsActivityRelatedInstance) {
        this.RsgAsActivityRelatedInstance = RsgAsActivityRelatedInstance;
    }

    /**
     * Get 简略的状态消息 
     * @return StatusMessageSimplified 简略的状态消息
     */
    public String getStatusMessageSimplified() {
        return this.StatusMessageSimplified;
    }

    /**
     * Set 简略的状态消息
     * @param StatusMessageSimplified 简略的状态消息
     */
    public void setStatusMessageSimplified(String StatusMessageSimplified) {
        this.StatusMessageSimplified = StatusMessageSimplified;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RsgAsGroupId", this.RsgAsGroupId);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RsgAsActivityRelatedInstance.", this.RsgAsActivityRelatedInstance);
        this.setParamSimple(map, prefix + "StatusMessageSimplified", this.StatusMessageSimplified);

    }
}

