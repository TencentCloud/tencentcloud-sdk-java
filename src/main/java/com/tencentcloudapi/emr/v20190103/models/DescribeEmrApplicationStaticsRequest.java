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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmrApplicationStaticsRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 起始时间，时间戳（秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，时间戳（秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 过滤的队列名
    */
    @SerializedName("Queues")
    @Expose
    private String [] Queues;

    /**
    * 过滤的用户名
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 过滤的作业类型
    */
    @SerializedName("ApplicationTypes")
    @Expose
    private String [] ApplicationTypes;

    /**
    * 分组字段，可选：queue, user, applicationType
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * 排序字段，可选：sumMemorySeconds, sumVCoreSeconds, sumHDFSBytesWritten, sumHDFSBytesRead
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 是否顺序排序，0-逆序，1-正序
    */
    @SerializedName("IsAsc")
    @Expose
    private Long IsAsc;

    /**
    * 页号
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页容量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 起始时间，时间戳（秒） 
     * @return StartTime 起始时间，时间戳（秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，时间戳（秒）
     * @param StartTime 起始时间，时间戳（秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，时间戳（秒） 
     * @return EndTime 结束时间，时间戳（秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，时间戳（秒）
     * @param EndTime 结束时间，时间戳（秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤的队列名 
     * @return Queues 过滤的队列名
     */
    public String [] getQueues() {
        return this.Queues;
    }

    /**
     * Set 过滤的队列名
     * @param Queues 过滤的队列名
     */
    public void setQueues(String [] Queues) {
        this.Queues = Queues;
    }

    /**
     * Get 过滤的用户名 
     * @return Users 过滤的用户名
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 过滤的用户名
     * @param Users 过滤的用户名
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 过滤的作业类型 
     * @return ApplicationTypes 过滤的作业类型
     */
    public String [] getApplicationTypes() {
        return this.ApplicationTypes;
    }

    /**
     * Set 过滤的作业类型
     * @param ApplicationTypes 过滤的作业类型
     */
    public void setApplicationTypes(String [] ApplicationTypes) {
        this.ApplicationTypes = ApplicationTypes;
    }

    /**
     * Get 分组字段，可选：queue, user, applicationType 
     * @return GroupBy 分组字段，可选：queue, user, applicationType
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 分组字段，可选：queue, user, applicationType
     * @param GroupBy 分组字段，可选：queue, user, applicationType
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 排序字段，可选：sumMemorySeconds, sumVCoreSeconds, sumHDFSBytesWritten, sumHDFSBytesRead 
     * @return OrderBy 排序字段，可选：sumMemorySeconds, sumVCoreSeconds, sumHDFSBytesWritten, sumHDFSBytesRead
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选：sumMemorySeconds, sumVCoreSeconds, sumHDFSBytesWritten, sumHDFSBytesRead
     * @param OrderBy 排序字段，可选：sumMemorySeconds, sumVCoreSeconds, sumHDFSBytesWritten, sumHDFSBytesRead
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 是否顺序排序，0-逆序，1-正序 
     * @return IsAsc 是否顺序排序，0-逆序，1-正序
     */
    public Long getIsAsc() {
        return this.IsAsc;
    }

    /**
     * Set 是否顺序排序，0-逆序，1-正序
     * @param IsAsc 是否顺序排序，0-逆序，1-正序
     */
    public void setIsAsc(Long IsAsc) {
        this.IsAsc = IsAsc;
    }

    /**
     * Get 页号 
     * @return Offset 页号
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页号
     * @param Offset 页号
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页容量 
     * @return Limit 页容量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页容量
     * @param Limit 页容量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEmrApplicationStaticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrApplicationStaticsRequest(DescribeEmrApplicationStaticsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Queues != null) {
            this.Queues = new String[source.Queues.length];
            for (int i = 0; i < source.Queues.length; i++) {
                this.Queues[i] = new String(source.Queues[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.ApplicationTypes != null) {
            this.ApplicationTypes = new String[source.ApplicationTypes.length];
            for (int i = 0; i < source.ApplicationTypes.length; i++) {
                this.ApplicationTypes[i] = new String(source.ApplicationTypes[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.IsAsc != null) {
            this.IsAsc = new Long(source.IsAsc);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Queues.", this.Queues);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "ApplicationTypes.", this.ApplicationTypes);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "IsAsc", this.IsAsc);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

