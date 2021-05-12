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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogDataRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 客户端 Host 列表。
    */
    @SerializedName("UserHosts")
    @Expose
    private String [] UserHosts;

    /**
    * 客户端 用户名 列表。
    */
    @SerializedName("UserNames")
    @Expose
    private String [] UserNames;

    /**
    * 访问的 数据库 列表。
    */
    @SerializedName("DataBases")
    @Expose
    private String [] DataBases;

    /**
    * 排序字段。当前支持：Timestamp,QueryTime,LockTime,RowsExamined,RowsSent 。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 升序还是降序排列。当前支持：ASC,DESC 。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一次性返回的记录数量，默认为100，最大为400。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 仅在实例为主实例或者灾备实例时生效，可选值：slave，代表拉取从机的日志。
    */
    @SerializedName("InstType")
    @Expose
    private String InstType;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间戳。 
     * @return StartTime 开始时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳。
     * @param StartTime 开始时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳。 
     * @return EndTime 结束时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳。
     * @param EndTime 结束时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 客户端 Host 列表。 
     * @return UserHosts 客户端 Host 列表。
     */
    public String [] getUserHosts() {
        return this.UserHosts;
    }

    /**
     * Set 客户端 Host 列表。
     * @param UserHosts 客户端 Host 列表。
     */
    public void setUserHosts(String [] UserHosts) {
        this.UserHosts = UserHosts;
    }

    /**
     * Get 客户端 用户名 列表。 
     * @return UserNames 客户端 用户名 列表。
     */
    public String [] getUserNames() {
        return this.UserNames;
    }

    /**
     * Set 客户端 用户名 列表。
     * @param UserNames 客户端 用户名 列表。
     */
    public void setUserNames(String [] UserNames) {
        this.UserNames = UserNames;
    }

    /**
     * Get 访问的 数据库 列表。 
     * @return DataBases 访问的 数据库 列表。
     */
    public String [] getDataBases() {
        return this.DataBases;
    }

    /**
     * Set 访问的 数据库 列表。
     * @param DataBases 访问的 数据库 列表。
     */
    public void setDataBases(String [] DataBases) {
        this.DataBases = DataBases;
    }

    /**
     * Get 排序字段。当前支持：Timestamp,QueryTime,LockTime,RowsExamined,RowsSent 。 
     * @return SortBy 排序字段。当前支持：Timestamp,QueryTime,LockTime,RowsExamined,RowsSent 。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段。当前支持：Timestamp,QueryTime,LockTime,RowsExamined,RowsSent 。
     * @param SortBy 排序字段。当前支持：Timestamp,QueryTime,LockTime,RowsExamined,RowsSent 。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 升序还是降序排列。当前支持：ASC,DESC 。 
     * @return OrderBy 升序还是降序排列。当前支持：ASC,DESC 。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 升序还是降序排列。当前支持：ASC,DESC 。
     * @param OrderBy 升序还是降序排列。当前支持：ASC,DESC 。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一次性返回的记录数量，默认为100，最大为400。 
     * @return Limit 一次性返回的记录数量，默认为100，最大为400。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一次性返回的记录数量，默认为100，最大为400。
     * @param Limit 一次性返回的记录数量，默认为100，最大为400。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 仅在实例为主实例或者灾备实例时生效，可选值：slave，代表拉取从机的日志。 
     * @return InstType 仅在实例为主实例或者灾备实例时生效，可选值：slave，代表拉取从机的日志。
     */
    public String getInstType() {
        return this.InstType;
    }

    /**
     * Set 仅在实例为主实例或者灾备实例时生效，可选值：slave，代表拉取从机的日志。
     * @param InstType 仅在实例为主实例或者灾备实例时生效，可选值：slave，代表拉取从机的日志。
     */
    public void setInstType(String InstType) {
        this.InstType = InstType;
    }

    public DescribeSlowLogDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogDataRequest(DescribeSlowLogDataRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.UserHosts != null) {
            this.UserHosts = new String[source.UserHosts.length];
            for (int i = 0; i < source.UserHosts.length; i++) {
                this.UserHosts[i] = new String(source.UserHosts[i]);
            }
        }
        if (source.UserNames != null) {
            this.UserNames = new String[source.UserNames.length];
            for (int i = 0; i < source.UserNames.length; i++) {
                this.UserNames[i] = new String(source.UserNames[i]);
            }
        }
        if (source.DataBases != null) {
            this.DataBases = new String[source.DataBases.length];
            for (int i = 0; i < source.DataBases.length; i++) {
                this.DataBases[i] = new String(source.DataBases[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstType != null) {
            this.InstType = new String(source.InstType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "UserHosts.", this.UserHosts);
        this.setParamArraySimple(map, prefix + "UserNames.", this.UserNames);
        this.setParamArraySimple(map, prefix + "DataBases.", this.DataBases);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstType", this.InstType);

    }
}

