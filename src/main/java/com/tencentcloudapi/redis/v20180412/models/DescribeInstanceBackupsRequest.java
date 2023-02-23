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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel{

    /**
    * 每页输出的备份列表大小。默认大小为20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份任务的状态：
1：备份在流程中。
2：备份正常。
3：备份转RDB文件处理中。
4：已完成RDB转换。
-1：备份已过期。
-2：备份已删除。
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 实例名称，支持根据实例名称模糊搜索。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 每页输出的备份列表大小。默认大小为20，最大值为 100。 
     * @return Limit 每页输出的备份列表大小。默认大小为20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页输出的备份列表大小。默认大小为20，最大值为 100。
     * @param Limit 每页输出的备份列表大小。默认大小为20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。 
     * @return Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     * @param Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。 
     * @return InstanceId 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。
     * @param InstanceId 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。 
     * @return BeginTime 开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     * @param BeginTime 开始时间，格式如：2017-02-08 16:46:34。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。 
     * @return EndTime 结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     * @param EndTime 结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内开始备份的备份列表。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份任务的状态：
1：备份在流程中。
2：备份正常。
3：备份转RDB文件处理中。
4：已完成RDB转换。
-1：备份已过期。
-2：备份已删除。 
     * @return Status 备份任务的状态：
1：备份在流程中。
2：备份正常。
3：备份转RDB文件处理中。
4：已完成RDB转换。
-1：备份已过期。
-2：备份已删除。
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 备份任务的状态：
1：备份在流程中。
2：备份正常。
3：备份转RDB文件处理中。
4：已完成RDB转换。
-1：备份已过期。
-2：备份已删除。
     * @param Status 备份任务的状态：
1：备份在流程中。
2：备份正常。
3：备份转RDB文件处理中。
4：已完成RDB转换。
-1：备份已过期。
-2：备份已删除。
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 实例名称，支持根据实例名称模糊搜索。 
     * @return InstanceName 实例名称，支持根据实例名称模糊搜索。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，支持根据实例名称模糊搜索。
     * @param InstanceName 实例名称，支持根据实例名称模糊搜索。
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

