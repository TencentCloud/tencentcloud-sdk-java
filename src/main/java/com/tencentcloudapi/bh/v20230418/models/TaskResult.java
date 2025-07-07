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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResult extends AbstractModel {

    /**
    * 运维任务结果日志ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 运维任务ID
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 运维任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行任务来源IP
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 运维任务所属用户
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 运维任务所属用户的姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 运维任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运维任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 运维任务结果日志ID 
     * @return Id 运维任务结果日志ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 运维任务结果日志ID
     * @param Id 运维任务结果日志ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 运维任务ID 
     * @return OperationId 运维任务ID
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 运维任务ID
     * @param OperationId 运维任务ID
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 运维任务名称 
     * @return Name 运维任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运维任务名称
     * @param Name 运维任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行任务来源IP 
     * @return FromIp 执行任务来源IP
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set 执行任务来源IP
     * @param FromIp 执行任务来源IP
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 运维任务所属用户 
     * @return UserName 运维任务所属用户
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 运维任务所属用户
     * @param UserName 运维任务所属用户
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 运维任务所属用户的姓名 
     * @return RealName 运维任务所属用户的姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 运维任务所属用户的姓名
     * @param RealName 运维任务所属用户的姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败 
     * @return Status 运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败
     * @param Status 运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 运维任务开始时间 
     * @return StartTime 运维任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 运维任务开始时间
     * @param StartTime 运维任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运维任务结束时间 
     * @return EndTime 运维任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 运维任务结束时间
     * @param EndTime 运维任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResult(TaskResult source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

