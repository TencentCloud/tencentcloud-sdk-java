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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareTaskResponse extends AbstractModel {

    /**
    * <p>固件任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>固件任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>固件任务创建时间，单位：秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>固件任务升级类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）</p>
    */
    @SerializedName("UpgradeMode")
    @Expose
    private String UpgradeMode;

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回</p>
    */
    @SerializedName("OriginalVersion")
    @Expose
    private String OriginalVersion;

    /**
    * <p>创建账号ID</p>
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * <p>创建账号ID昵称</p>
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * <p>延迟时间</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>超时时间</p>
    */
    @SerializedName("TimeoutInterval")
    @Expose
    private Long TimeoutInterval;

    /**
    * <p>静默升级or用户确认升级</p>
    */
    @SerializedName("UpgradeMethod")
    @Expose
    private Long UpgradeMethod;

    /**
    * <p>最大重试次数</p>
    */
    @SerializedName("MaxRetryNum")
    @Expose
    private Long MaxRetryNum;

    /**
    * <p>固件类型</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>重试间隔时间单位min</p>
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * <p>是否覆盖任务</p>
    */
    @SerializedName("OverrideMode")
    @Expose
    private Long OverrideMode;

    /**
    * <p>用户自定义消息</p>
    */
    @SerializedName("TaskUserDefine")
    @Expose
    private String TaskUserDefine;

    /**
    * <p>每分钟发送设备量</p>
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
    * <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。 </p><p>单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。 </p><p>单位：秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>固件任务ID</p> 
     * @return TaskId <p>固件任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>固件任务ID</p>
     * @param TaskId <p>固件任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>固件任务状态</p> 
     * @return Status <p>固件任务状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>固件任务状态</p>
     * @param Status <p>固件任务状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>固件任务创建时间，单位：秒</p> 
     * @return CreateTime <p>固件任务创建时间，单位：秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>固件任务创建时间，单位：秒</p>
     * @param CreateTime <p>固件任务创建时间，单位：秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>固件任务升级类型</p> 
     * @return Type <p>固件任务升级类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>固件任务升级类型</p>
     * @param Type <p>固件任务升级类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>产品名称</p> 
     * @return ProductName <p>产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductName <p>产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）</p> 
     * @return UpgradeMode <p>固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）</p>
     */
    public String getUpgradeMode() {
        return this.UpgradeMode;
    }

    /**
     * Set <p>固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）</p>
     * @param UpgradeMode <p>固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）</p>
     */
    public void setUpgradeMode(String UpgradeMode) {
        this.UpgradeMode = UpgradeMode;
    }

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回</p> 
     * @return OriginalVersion <p>原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回</p>
     */
    public String getOriginalVersion() {
        return this.OriginalVersion;
    }

    /**
     * Set <p>原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回</p>
     * @param OriginalVersion <p>原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回</p>
     */
    public void setOriginalVersion(String OriginalVersion) {
        this.OriginalVersion = OriginalVersion;
    }

    /**
     * Get <p>创建账号ID</p> 
     * @return CreateUserId <p>创建账号ID</p>
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set <p>创建账号ID</p>
     * @param CreateUserId <p>创建账号ID</p>
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get <p>创建账号ID昵称</p> 
     * @return CreatorNickName <p>创建账号ID昵称</p>
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set <p>创建账号ID昵称</p>
     * @param CreatorNickName <p>创建账号ID昵称</p>
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get <p>延迟时间</p> 
     * @return DelayTime <p>延迟时间</p>
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延迟时间</p>
     * @param DelayTime <p>延迟时间</p>
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>超时时间</p> 
     * @return TimeoutInterval <p>超时时间</p>
     */
    public Long getTimeoutInterval() {
        return this.TimeoutInterval;
    }

    /**
     * Set <p>超时时间</p>
     * @param TimeoutInterval <p>超时时间</p>
     */
    public void setTimeoutInterval(Long TimeoutInterval) {
        this.TimeoutInterval = TimeoutInterval;
    }

    /**
     * Get <p>静默升级or用户确认升级</p> 
     * @return UpgradeMethod <p>静默升级or用户确认升级</p>
     */
    public Long getUpgradeMethod() {
        return this.UpgradeMethod;
    }

    /**
     * Set <p>静默升级or用户确认升级</p>
     * @param UpgradeMethod <p>静默升级or用户确认升级</p>
     */
    public void setUpgradeMethod(Long UpgradeMethod) {
        this.UpgradeMethod = UpgradeMethod;
    }

    /**
     * Get <p>最大重试次数</p> 
     * @return MaxRetryNum <p>最大重试次数</p>
     */
    public Long getMaxRetryNum() {
        return this.MaxRetryNum;
    }

    /**
     * Set <p>最大重试次数</p>
     * @param MaxRetryNum <p>最大重试次数</p>
     */
    public void setMaxRetryNum(Long MaxRetryNum) {
        this.MaxRetryNum = MaxRetryNum;
    }

    /**
     * Get <p>固件类型</p> 
     * @return FwType <p>固件类型</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>固件类型</p>
     * @param FwType <p>固件类型</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>重试间隔时间单位min</p> 
     * @return RetryInterval <p>重试间隔时间单位min</p>
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set <p>重试间隔时间单位min</p>
     * @param RetryInterval <p>重试间隔时间单位min</p>
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get <p>是否覆盖任务</p> 
     * @return OverrideMode <p>是否覆盖任务</p>
     */
    public Long getOverrideMode() {
        return this.OverrideMode;
    }

    /**
     * Set <p>是否覆盖任务</p>
     * @param OverrideMode <p>是否覆盖任务</p>
     */
    public void setOverrideMode(Long OverrideMode) {
        this.OverrideMode = OverrideMode;
    }

    /**
     * Get <p>用户自定义消息</p> 
     * @return TaskUserDefine <p>用户自定义消息</p>
     */
    public String getTaskUserDefine() {
        return this.TaskUserDefine;
    }

    /**
     * Set <p>用户自定义消息</p>
     * @param TaskUserDefine <p>用户自定义消息</p>
     */
    public void setTaskUserDefine(String TaskUserDefine) {
        this.TaskUserDefine = TaskUserDefine;
    }

    /**
     * Get <p>每分钟发送设备量</p> 
     * @return RateLimit <p>每分钟发送设备量</p>
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set <p>每分钟发送设备量</p>
     * @param RateLimit <p>每分钟发送设备量</p>
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。 </p><p>单位：秒</p> 
     * @return EndTime <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。 </p><p>单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。 </p><p>单位：秒</p>
     * @param EndTime <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。 </p><p>单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。 </p><p>单位：秒</p> 
     * @return StartTime <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。 </p><p>单位：秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。 </p><p>单位：秒</p>
     * @param StartTime <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。 </p><p>单位：秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFirmwareTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTaskResponse(DescribeFirmwareTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.UpgradeMode != null) {
            this.UpgradeMode = new String(source.UpgradeMode);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.OriginalVersion != null) {
            this.OriginalVersion = new String(source.OriginalVersion);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CreatorNickName != null) {
            this.CreatorNickName = new String(source.CreatorNickName);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.TimeoutInterval != null) {
            this.TimeoutInterval = new Long(source.TimeoutInterval);
        }
        if (source.UpgradeMethod != null) {
            this.UpgradeMethod = new Long(source.UpgradeMethod);
        }
        if (source.MaxRetryNum != null) {
            this.MaxRetryNum = new Long(source.MaxRetryNum);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.OverrideMode != null) {
            this.OverrideMode = new Long(source.OverrideMode);
        }
        if (source.TaskUserDefine != null) {
            this.TaskUserDefine = new String(source.TaskUserDefine);
        }
        if (source.RateLimit != null) {
            this.RateLimit = new Long(source.RateLimit);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "UpgradeMode", this.UpgradeMode);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OriginalVersion", this.OriginalVersion);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CreatorNickName", this.CreatorNickName);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "TimeoutInterval", this.TimeoutInterval);
        this.setParamSimple(map, prefix + "UpgradeMethod", this.UpgradeMethod);
        this.setParamSimple(map, prefix + "MaxRetryNum", this.MaxRetryNum);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "OverrideMode", this.OverrideMode);
        this.setParamSimple(map, prefix + "TaskUserDefine", this.TaskUserDefine);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

