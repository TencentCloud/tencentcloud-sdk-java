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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel{

    /**
    * 待操作的实例ID，可通过 DescribeInstance 接口返回值中的 InstanceId 获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 每页输出的备份列表大小，即每页输出的备份文件的数量，默认值20，取值范围为[1,100]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 备份列表分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询备份文件的开始时间，格式如：2017-02-08 16:46:34。查询实例在 [BeginTime, EndTime] 时间段内的备份列表。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 查询备份文件的结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内的备份列表。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份任务状态。<ul><li>1：备份在流程中。</li><li>2：备份正常。</li><li>3：备份转RDB文件处理中。</li><li>4：已完成RDB转换。</li><li>-1：备份已过期。</li><li>-2：备份已删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

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
     * Get 每页输出的备份列表大小，即每页输出的备份文件的数量，默认值20，取值范围为[1,100]。 
     * @return Limit 每页输出的备份列表大小，即每页输出的备份文件的数量，默认值20，取值范围为[1,100]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页输出的备份列表大小，即每页输出的备份文件的数量，默认值20，取值范围为[1,100]。
     * @param Limit 每页输出的备份列表大小，即每页输出的备份文件的数量，默认值20，取值范围为[1,100]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 备份列表分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。 
     * @return Offset 备份列表分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 备份列表分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     * @param Offset 备份列表分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询备份文件的开始时间，格式如：2017-02-08 16:46:34。查询实例在 [BeginTime, EndTime] 时间段内的备份列表。 
     * @return BeginTime 查询备份文件的开始时间，格式如：2017-02-08 16:46:34。查询实例在 [BeginTime, EndTime] 时间段内的备份列表。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 查询备份文件的开始时间，格式如：2017-02-08 16:46:34。查询实例在 [BeginTime, EndTime] 时间段内的备份列表。
     * @param BeginTime 查询备份文件的开始时间，格式如：2017-02-08 16:46:34。查询实例在 [BeginTime, EndTime] 时间段内的备份列表。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 查询备份文件的结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内的备份列表。 
     * @return EndTime 查询备份文件的结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内的备份列表。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询备份文件的结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内的备份列表。
     * @param EndTime 查询备份文件的结束时间，格式如：2017-02-08 19:09:26。查询实例在 [beginTime, endTime] 时间段内的备份列表。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份任务状态。<ul><li>1：备份在流程中。</li><li>2：备份正常。</li><li>3：备份转RDB文件处理中。</li><li>4：已完成RDB转换。</li><li>-1：备份已过期。</li><li>-2：备份已删除。</li></ul> 
     * @return Status 备份任务状态。<ul><li>1：备份在流程中。</li><li>2：备份正常。</li><li>3：备份转RDB文件处理中。</li><li>4：已完成RDB转换。</li><li>-1：备份已过期。</li><li>-2：备份已删除。</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 备份任务状态。<ul><li>1：备份在流程中。</li><li>2：备份正常。</li><li>3：备份转RDB文件处理中。</li><li>4：已完成RDB转换。</li><li>-1：备份已过期。</li><li>-2：备份已删除。</li></ul>
     * @param Status 备份任务状态。<ul><li>1：备份在流程中。</li><li>2：备份正常。</li><li>3：备份转RDB文件处理中。</li><li>4：已完成RDB转换。</li><li>-1：备份已过期。</li><li>-2：备份已删除。</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeInstanceBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsRequest(DescribeInstanceBackupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

