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
    * <p>运维任务结果日志ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>运维任务ID</p>
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * <p>运维任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>执行任务来源IP</p>
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * <p>运维任务所属用户</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>运维任务所属用户的姓名</p>
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * <p>运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>运维任务开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>运维任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务（默认类型）</li><li>1： Windows 类型任务</li></ul><p>默认值：0</p>
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
     * Get <p>运维任务结果日志ID</p> 
     * @return Id <p>运维任务结果日志ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>运维任务结果日志ID</p>
     * @param Id <p>运维任务结果日志ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>运维任务ID</p> 
     * @return OperationId <p>运维任务ID</p>
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set <p>运维任务ID</p>
     * @param OperationId <p>运维任务ID</p>
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get <p>运维任务名称</p> 
     * @return Name <p>运维任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>运维任务名称</p>
     * @param Name <p>运维任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>执行任务来源IP</p> 
     * @return FromIp <p>执行任务来源IP</p>
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set <p>执行任务来源IP</p>
     * @param FromIp <p>执行任务来源IP</p>
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get <p>运维任务所属用户</p> 
     * @return UserName <p>运维任务所属用户</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>运维任务所属用户</p>
     * @param UserName <p>运维任务所属用户</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>运维任务所属用户的姓名</p> 
     * @return RealName <p>运维任务所属用户的姓名</p>
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set <p>运维任务所属用户的姓名</p>
     * @param RealName <p>运维任务所属用户的姓名</p>
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get <p>运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败</p> 
     * @return Status <p>运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败</p>
     * @param Status <p>运维任务执行状态 1 - 执行中，2 - 成功，3 - 失败，4 - 部分失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>运维任务开始时间</p> 
     * @return StartTime <p>运维任务开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>运维任务开始时间</p>
     * @param StartTime <p>运维任务开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>运维任务结束时间</p> 
     * @return EndTime <p>运维任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>运维任务结束时间</p>
     * @param EndTime <p>运维任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务（默认类型）</li><li>1： Windows 类型任务</li></ul><p>默认值：0</p> 
     * @return Category <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务（默认类型）</li><li>1： Windows 类型任务</li></ul><p>默认值：0</p>
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务（默认类型）</li><li>1： Windows 类型任务</li></ul><p>默认值：0</p>
     * @param Category <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务（默认类型）</li><li>1： Windows 类型任务</li></ul><p>默认值：0</p>
     */
    public void setCategory(Long Category) {
        this.Category = Category;
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
        if (source.Category != null) {
            this.Category = new Long(source.Category);
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
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

