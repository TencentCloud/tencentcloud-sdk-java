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
    * 搜索区间的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 搜索区间的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
    * 用户名，长度不超过20
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名，长度不超过20
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 任务类型
1 手工运维任务
2 定时任务
3 账号推送任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long [] TaskType;

    /**
    * 查询偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的页内记录数，默认为20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 搜索区间的开始时间 
     * @return StartTime 搜索区间的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 搜索区间的开始时间
     * @param StartTime 搜索区间的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 搜索区间的结束时间 
     * @return EndTime 搜索区间的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 搜索区间的结束时间
     * @param EndTime 搜索区间的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 用户名，长度不超过20 
     * @return UserName 用户名，长度不超过20
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，长度不超过20
     * @param UserName 用户名，长度不超过20
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名，长度不超过20 
     * @return RealName 姓名，长度不超过20
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名，长度不超过20
     * @param RealName 姓名，长度不超过20
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 任务类型
1 手工运维任务
2 定时任务
3 账号推送任务 
     * @return TaskType 任务类型
1 手工运维任务
2 定时任务
3 账号推送任务
     */
    public Long [] getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
1 手工运维任务
2 定时任务
3 账号推送任务
     * @param TaskType 任务类型
1 手工运维任务
2 定时任务
3 账号推送任务
     */
    public void setTaskType(Long [] TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 查询偏移 
     * @return Offset 查询偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移
     * @param Offset 查询偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的页内记录数，默认为20，最大200 
     * @return Limit 分页的页内记录数，默认为20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的页内记录数，默认为20，最大200
     * @param Limit 分页的页内记录数，默认为20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

