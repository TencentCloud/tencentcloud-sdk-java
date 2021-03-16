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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Invocation extends AbstractModel{

    /**
    * 执行活动ID。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
    */
    @SerializedName("InvocationStatus")
    @Expose
    private String InvocationStatus;

    /**
    * 执行任务信息列表。
    */
    @SerializedName("InvocationTaskBasicInfoSet")
    @Expose
    private InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet;

    /**
    * 执行活动描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 执行活动开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 执行活动结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行活动创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 执行活动更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 执行活动ID。 
     * @return InvocationId 执行活动ID。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 执行活动ID。
     * @param InvocationId 执行活动ID。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get 命令ID。 
     * @return CommandId 命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
     * @param CommandId 命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败 
     * @return InvocationStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     */
    public String getInvocationStatus() {
        return this.InvocationStatus;
    }

    /**
     * Set 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     * @param InvocationStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     */
    public void setInvocationStatus(String InvocationStatus) {
        this.InvocationStatus = InvocationStatus;
    }

    /**
     * Get 执行任务信息列表。 
     * @return InvocationTaskBasicInfoSet 执行任务信息列表。
     */
    public InvocationTaskBasicInfo [] getInvocationTaskBasicInfoSet() {
        return this.InvocationTaskBasicInfoSet;
    }

    /**
     * Set 执行任务信息列表。
     * @param InvocationTaskBasicInfoSet 执行任务信息列表。
     */
    public void setInvocationTaskBasicInfoSet(InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet) {
        this.InvocationTaskBasicInfoSet = InvocationTaskBasicInfoSet;
    }

    /**
     * Get 执行活动描述。 
     * @return Description 执行活动描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 执行活动描述。
     * @param Description 执行活动描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 执行活动开始时间。 
     * @return StartTime 执行活动开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 执行活动开始时间。
     * @param StartTime 执行活动开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行活动结束时间。 
     * @return EndTime 执行活动结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 执行活动结束时间。
     * @param EndTime 执行活动结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行活动创建时间。 
     * @return CreatedTime 执行活动创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 执行活动创建时间。
     * @param CreatedTime 执行活动创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 执行活动更新时间。 
     * @return UpdatedTime 执行活动更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 执行活动更新时间。
     * @param UpdatedTime 执行活动更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "InvocationStatus", this.InvocationStatus);
        this.setParamArrayObj(map, prefix + "InvocationTaskBasicInfoSet.", this.InvocationTaskBasicInfoSet);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

