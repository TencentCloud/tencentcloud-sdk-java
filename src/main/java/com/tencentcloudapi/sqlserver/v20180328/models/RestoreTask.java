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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreTask extends AbstractModel {

    /**
    * 目标实例ID
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 目标实例名称
    */
    @SerializedName("TargetInstanceName")
    @Expose
    private String TargetInstanceName;

    /**
    * 目标实例状态。取值范围：
1：申请中
2：运行中
3：受限运行中 (主备切换中)
4：已隔离
5：回收中
6：已回收
7：任务执行中 (实例做备份、回档等操作)
8：已下线
9：实例扩容中
10：实例迁移中
11：只读
12：重启中
    */
    @SerializedName("TargetInstanceStatus")
    @Expose
    private Long TargetInstanceStatus;

    /**
    * 目标实例所在地域
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 回档记录ID
    */
    @SerializedName("RestoreId")
    @Expose
    private Long RestoreId;

    /**
    * 回档到目标实例的类型，0-当前实例，1-已有实例，2-全新实例
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 回档方式，0-按照时间点回档，1-按照备份集回档
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 回档目标时间
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

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
    * 回档状态，0-初始化，1-运行中，2-成功，3-失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 回档异步任务ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get 目标实例ID 
     * @return TargetInstanceId 目标实例ID
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 目标实例ID
     * @param TargetInstanceId 目标实例ID
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get 目标实例名称 
     * @return TargetInstanceName 目标实例名称
     */
    public String getTargetInstanceName() {
        return this.TargetInstanceName;
    }

    /**
     * Set 目标实例名称
     * @param TargetInstanceName 目标实例名称
     */
    public void setTargetInstanceName(String TargetInstanceName) {
        this.TargetInstanceName = TargetInstanceName;
    }

    /**
     * Get 目标实例状态。取值范围：
1：申请中
2：运行中
3：受限运行中 (主备切换中)
4：已隔离
5：回收中
6：已回收
7：任务执行中 (实例做备份、回档等操作)
8：已下线
9：实例扩容中
10：实例迁移中
11：只读
12：重启中 
     * @return TargetInstanceStatus 目标实例状态。取值范围：
1：申请中
2：运行中
3：受限运行中 (主备切换中)
4：已隔离
5：回收中
6：已回收
7：任务执行中 (实例做备份、回档等操作)
8：已下线
9：实例扩容中
10：实例迁移中
11：只读
12：重启中
     */
    public Long getTargetInstanceStatus() {
        return this.TargetInstanceStatus;
    }

    /**
     * Set 目标实例状态。取值范围：
1：申请中
2：运行中
3：受限运行中 (主备切换中)
4：已隔离
5：回收中
6：已回收
7：任务执行中 (实例做备份、回档等操作)
8：已下线
9：实例扩容中
10：实例迁移中
11：只读
12：重启中
     * @param TargetInstanceStatus 目标实例状态。取值范围：
1：申请中
2：运行中
3：受限运行中 (主备切换中)
4：已隔离
5：回收中
6：已回收
7：任务执行中 (实例做备份、回档等操作)
8：已下线
9：实例扩容中
10：实例迁移中
11：只读
12：重启中
     */
    public void setTargetInstanceStatus(Long TargetInstanceStatus) {
        this.TargetInstanceStatus = TargetInstanceStatus;
    }

    /**
     * Get 目标实例所在地域 
     * @return TargetRegion 目标实例所在地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 目标实例所在地域
     * @param TargetRegion 目标实例所在地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 回档记录ID 
     * @return RestoreId 回档记录ID
     */
    public Long getRestoreId() {
        return this.RestoreId;
    }

    /**
     * Set 回档记录ID
     * @param RestoreId 回档记录ID
     */
    public void setRestoreId(Long RestoreId) {
        this.RestoreId = RestoreId;
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
     * Get 回档目标时间 
     * @return RestoreTime 回档目标时间
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set 回档目标时间
     * @param RestoreTime 回档目标时间
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
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

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.TargetInstanceName != null) {
            this.TargetInstanceName = new String(source.TargetInstanceName);
        }
        if (source.TargetInstanceStatus != null) {
            this.TargetInstanceStatus = new Long(source.TargetInstanceStatus);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.RestoreId != null) {
            this.RestoreId = new Long(source.RestoreId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "TargetInstanceName", this.TargetInstanceName);
        this.setParamSimple(map, prefix + "TargetInstanceStatus", this.TargetInstanceStatus);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "RestoreId", this.RestoreId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

