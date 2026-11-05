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

public class SearchTaskResultRequest extends AbstractModel {

    /**
    * <p>搜索区间的开始时间，缺省时取结束时间前7天（含结束时间当日）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>搜索区间的结束时间。未指定时，默认取当前时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
    * <p>用户名，长度不超过20</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>姓名，长度不超过20</p>
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * <p>任务类型<br>1 手工运维任务<br>2 定时任务<br>3 账号推送任务</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long [] TaskType;

    /**
    * <p>查询偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页的页内记录数，默认为20，最大200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务</li><li>1： Windows 类型任务</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private Long [] Category;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>1： 执行中</li><li>2： 成功</li><li>3： 失败</li><li>4： 部分成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get <p>搜索区间的开始时间，缺省时取结束时间前7天（含结束时间当日）</p> 
     * @return StartTime <p>搜索区间的开始时间，缺省时取结束时间前7天（含结束时间当日）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>搜索区间的开始时间，缺省时取结束时间前7天（含结束时间当日）</p>
     * @param StartTime <p>搜索区间的开始时间，缺省时取结束时间前7天（含结束时间当日）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>搜索区间的结束时间。未指定时，默认取当前时间</p> 
     * @return EndTime <p>搜索区间的结束时间。未指定时，默认取当前时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>搜索区间的结束时间。未指定时，默认取当前时间</p>
     * @param EndTime <p>搜索区间的结束时间。未指定时，默认取当前时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get <p>用户名，长度不超过20</p> 
     * @return UserName <p>用户名，长度不超过20</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名，长度不超过20</p>
     * @param UserName <p>用户名，长度不超过20</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>姓名，长度不超过20</p> 
     * @return RealName <p>姓名，长度不超过20</p>
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set <p>姓名，长度不超过20</p>
     * @param RealName <p>姓名，长度不超过20</p>
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get <p>任务类型<br>1 手工运维任务<br>2 定时任务<br>3 账号推送任务</p> 
     * @return TaskType <p>任务类型<br>1 手工运维任务<br>2 定时任务<br>3 账号推送任务</p>
     */
    public Long [] getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型<br>1 手工运维任务<br>2 定时任务<br>3 账号推送任务</p>
     * @param TaskType <p>任务类型<br>1 手工运维任务<br>2 定时任务<br>3 账号推送任务</p>
     */
    public void setTaskType(Long [] TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>查询偏移</p> 
     * @return Offset <p>查询偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询偏移</p>
     * @param Offset <p>查询偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页的页内记录数，默认为20，最大200</p> 
     * @return Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页的页内记录数，默认为20，最大200</p>
     * @param Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务</li><li>1： Windows 类型任务</li></ul> 
     * @return Category <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务</li><li>1： Windows 类型任务</li></ul>
     */
    public Long [] getCategory() {
        return this.Category;
    }

    /**
     * Set <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务</li><li>1： Windows 类型任务</li></ul>
     * @param Category <p>任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型任务</li><li>1： Windows 类型任务</li></ul>
     */
    public void setCategory(Long [] Category) {
        this.Category = Category;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>1： 执行中</li><li>2： 成功</li><li>3： 失败</li><li>4： 部分成功</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>1： 执行中</li><li>2： 成功</li><li>3： 失败</li><li>4： 部分成功</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>1： 执行中</li><li>2： 成功</li><li>3： 失败</li><li>4： 部分成功</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>1： 执行中</li><li>2： 成功</li><li>3： 失败</li><li>4： 部分成功</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public SearchTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchTaskResultRequest(SearchTaskResultRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long[source.TaskType.length];
            for (int i = 0; i < source.TaskType.length; i++) {
                this.TaskType[i] = new Long(source.TaskType[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Category != null) {
            this.Category = new Long[source.Category.length];
            for (int i = 0; i < source.Category.length; i++) {
                this.Category[i] = new Long(source.Category[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamArraySimple(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Category.", this.Category);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

