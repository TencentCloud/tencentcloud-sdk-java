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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRestoreTaskRequest extends AbstractModel {

    /**
    * 源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 回档方式，0-按照时间点回档，1-按照备份集回档
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 回档的目标实例所在地域
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 回档状态，0-初始化，1-运行中，2-成功，3-失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为20
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，restoreTime-回档时间，startTime-任务开始时间，endTime-任务结束时间，默认按照任务开始时间降序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序规则（desc-降序，asc-升序），默认desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 回档异步任务ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get 源实例ID 
     * @return InstanceId 源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 源实例ID
     * @param InstanceId 源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 回档方式，0-按照时间点回档，1-按照备份集回档 
     * @return RestoreType 回档方式，0-按照时间点回档，1-按照备份集回档
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set 回档方式，0-按照时间点回档，1-按照备份集回档
     * @param RestoreType 回档方式，0-按照时间点回档，1-按照备份集回档
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get 回档的目标实例所在地域 
     * @return TargetRegion 回档的目标实例所在地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 回档的目标实例所在地域
     * @param TargetRegion 回档的目标实例所在地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例 
     * @return TargetType 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例
     * @param TargetType 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 回档状态，0-初始化，1-运行中，2-成功，3-失败 
     * @return Status 回档状态，0-初始化，1-运行中，2-成功，3-失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 回档状态，0-初始化，1-运行中，2-成功，3-失败
     * @param Status 回档状态，0-初始化，1-运行中，2-成功，3-失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为20 
     * @return Offset 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为20
     * @param Offset 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页 
     * @return Limit 分页返回，页编号，默认值为第0页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页
     * @param Limit 分页返回，页编号，默认值为第0页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，restoreTime-回档时间，startTime-任务开始时间，endTime-任务结束时间，默认按照任务开始时间降序 
     * @return OrderBy 排序字段，restoreTime-回档时间，startTime-任务开始时间，endTime-任务结束时间，默认按照任务开始时间降序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，restoreTime-回档时间，startTime-任务开始时间，endTime-任务结束时间，默认按照任务开始时间降序
     * @param OrderBy 排序字段，restoreTime-回档时间，startTime-任务开始时间，endTime-任务结束时间，默认按照任务开始时间降序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序规则（desc-降序，asc-升序），默认desc 
     * @return OrderByType 排序规则（desc-降序，asc-升序），默认desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序规则（desc-降序，asc-升序），默认desc
     * @param OrderByType 排序规则（desc-降序，asc-升序），默认desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 回档异步任务ID 
     * @return FlowId 回档异步任务ID
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 回档异步任务ID
     * @param FlowId 回档异步任务ID
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public DescribeRestoreTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRestoreTaskRequest(DescribeRestoreTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

