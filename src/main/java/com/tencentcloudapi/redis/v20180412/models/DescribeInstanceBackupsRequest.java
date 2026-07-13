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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel {

    /**
    * <p>每页输出的备份列表大小。默认大小为20，最大值为 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备份任务的状态：<br>1：备份在流程中。<br>2：备份正常。<br>3：备份转RDB文件处理中。<br>4：已完成RDB转换。<br>-1：备份已过期。<br>-2：备份已删除。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>实例名称，支持根据实例名称模糊搜索。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get <p>每页输出的备份列表大小。默认大小为20，最大值为 100。</p> 
     * @return Limit <p>每页输出的备份列表大小。默认大小为20，最大值为 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页输出的备份列表大小。默认大小为20，最大值为 100。</p>
     * @param Limit <p>每页输出的备份列表大小。默认大小为20，最大值为 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p> 
     * @return Offset <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     * @param Offset <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。</p> 
     * @return InstanceId <p>待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。</p>
     * @param InstanceId <p>待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p> 
     * @return BeginTime <p>开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     * @param BeginTime <p>开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p> 
     * @return EndTime <p>结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     * @param EndTime <p>结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表，查询时间最大跨度30天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备份任务的状态：<br>1：备份在流程中。<br>2：备份正常。<br>3：备份转RDB文件处理中。<br>4：已完成RDB转换。<br>-1：备份已过期。<br>-2：备份已删除。</p> 
     * @return Status <p>备份任务的状态：<br>1：备份在流程中。<br>2：备份正常。<br>3：备份转RDB文件处理中。<br>4：已完成RDB转换。<br>-1：备份已过期。<br>-2：备份已删除。</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份任务的状态：<br>1：备份在流程中。<br>2：备份正常。<br>3：备份转RDB文件处理中。<br>4：已完成RDB转换。<br>-1：备份已过期。<br>-2：备份已删除。</p>
     * @param Status <p>备份任务的状态：<br>1：备份在流程中。<br>2：备份正常。<br>3：备份转RDB文件处理中。<br>4：已完成RDB转换。<br>-1：备份已过期。<br>-2：备份已删除。</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例名称，支持根据实例名称模糊搜索。</p> 
     * @return InstanceName <p>实例名称，支持根据实例名称模糊搜索。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称，支持根据实例名称模糊搜索。</p>
     * @param InstanceName <p>实例名称，支持根据实例名称模糊搜索。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public DescribeInstanceBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsRequest(DescribeInstanceBackupsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

