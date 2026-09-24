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

public class BatchUpdateFirmwareRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * <p>固件新版本号</p>
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * <p>固件原版本号</p>
    */
    @SerializedName("FirmwareOriVersion")
    @Expose
    private String FirmwareOriVersion;

    /**
    * <p>升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式</p>
    */
    @SerializedName("UpgradeMethod")
    @Expose
    private Long UpgradeMethod;

    /**
    * <p>设备列表文件名称，根据文件列表升级固件需要填写此参数</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>设备列表的文件md5值</p>
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * <p>设备列表的文件大小值</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>需要升级的设备名称列表</p>
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * <p>固件升级任务，默认超时时间。 最小取值120秒，最大为900秒</p>
    */
    @SerializedName("TimeoutInterval")
    @Expose
    private Long TimeoutInterval;

    /**
    * <p>固件升级任务类型，默认静态升级值为空或1，动态升级值为7</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>任务延迟时间</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>是否覆盖，0不覆盖，1覆盖</p>
    */
    @SerializedName("OverrideMode")
    @Expose
    private Long OverrideMode;

    /**
    * <p>失败重试次数</p>
    */
    @SerializedName("MaxRetryNum")
    @Expose
    private Long MaxRetryNum;

    /**
    * <p>重试间隔min</p>
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * <p>固件模块</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>用户自定义信息</p>
    */
    @SerializedName("TaskUserDefine")
    @Expose
    private String TaskUserDefine;

    /**
    * <p>每分钟下发设备量</p>
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
    * <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。</p><p>单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。</p><p>单位：秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * Get <p>产品ID</p> 
     * @return ProductID <p>产品ID</p>
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductID <p>产品ID</p>
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get <p>固件新版本号</p> 
     * @return FirmwareVersion <p>固件新版本号</p>
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set <p>固件新版本号</p>
     * @param FirmwareVersion <p>固件新版本号</p>
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get <p>固件原版本号</p> 
     * @return FirmwareOriVersion <p>固件原版本号</p>
     */
    public String getFirmwareOriVersion() {
        return this.FirmwareOriVersion;
    }

    /**
     * Set <p>固件原版本号</p>
     * @param FirmwareOriVersion <p>固件原版本号</p>
     */
    public void setFirmwareOriVersion(String FirmwareOriVersion) {
        this.FirmwareOriVersion = FirmwareOriVersion;
    }

    /**
     * Get <p>升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式</p> 
     * @return UpgradeMethod <p>升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式</p>
     */
    public Long getUpgradeMethod() {
        return this.UpgradeMethod;
    }

    /**
     * Set <p>升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式</p>
     * @param UpgradeMethod <p>升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式</p>
     */
    public void setUpgradeMethod(Long UpgradeMethod) {
        this.UpgradeMethod = UpgradeMethod;
    }

    /**
     * Get <p>设备列表文件名称，根据文件列表升级固件需要填写此参数</p> 
     * @return FileName <p>设备列表文件名称，根据文件列表升级固件需要填写此参数</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>设备列表文件名称，根据文件列表升级固件需要填写此参数</p>
     * @param FileName <p>设备列表文件名称，根据文件列表升级固件需要填写此参数</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>设备列表的文件md5值</p> 
     * @return FileMd5 <p>设备列表的文件md5值</p>
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set <p>设备列表的文件md5值</p>
     * @param FileMd5 <p>设备列表的文件md5值</p>
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get <p>设备列表的文件大小值</p> 
     * @return FileSize <p>设备列表的文件大小值</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>设备列表的文件大小值</p>
     * @param FileSize <p>设备列表的文件大小值</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>需要升级的设备名称列表</p> 
     * @return DeviceNames <p>需要升级的设备名称列表</p>
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set <p>需要升级的设备名称列表</p>
     * @param DeviceNames <p>需要升级的设备名称列表</p>
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get <p>固件升级任务，默认超时时间。 最小取值120秒，最大为900秒</p> 
     * @return TimeoutInterval <p>固件升级任务，默认超时时间。 最小取值120秒，最大为900秒</p>
     */
    public Long getTimeoutInterval() {
        return this.TimeoutInterval;
    }

    /**
     * Set <p>固件升级任务，默认超时时间。 最小取值120秒，最大为900秒</p>
     * @param TimeoutInterval <p>固件升级任务，默认超时时间。 最小取值120秒，最大为900秒</p>
     */
    public void setTimeoutInterval(Long TimeoutInterval) {
        this.TimeoutInterval = TimeoutInterval;
    }

    /**
     * Get <p>固件升级任务类型，默认静态升级值为空或1，动态升级值为7</p> 
     * @return Type <p>固件升级任务类型，默认静态升级值为空或1，动态升级值为7</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>固件升级任务类型，默认静态升级值为空或1，动态升级值为7</p>
     * @param Type <p>固件升级任务类型，默认静态升级值为空或1，动态升级值为7</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>任务延迟时间</p> 
     * @return DelayTime <p>任务延迟时间</p>
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>任务延迟时间</p>
     * @param DelayTime <p>任务延迟时间</p>
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>是否覆盖，0不覆盖，1覆盖</p> 
     * @return OverrideMode <p>是否覆盖，0不覆盖，1覆盖</p>
     */
    public Long getOverrideMode() {
        return this.OverrideMode;
    }

    /**
     * Set <p>是否覆盖，0不覆盖，1覆盖</p>
     * @param OverrideMode <p>是否覆盖，0不覆盖，1覆盖</p>
     */
    public void setOverrideMode(Long OverrideMode) {
        this.OverrideMode = OverrideMode;
    }

    /**
     * Get <p>失败重试次数</p> 
     * @return MaxRetryNum <p>失败重试次数</p>
     */
    public Long getMaxRetryNum() {
        return this.MaxRetryNum;
    }

    /**
     * Set <p>失败重试次数</p>
     * @param MaxRetryNum <p>失败重试次数</p>
     */
    public void setMaxRetryNum(Long MaxRetryNum) {
        this.MaxRetryNum = MaxRetryNum;
    }

    /**
     * Get <p>重试间隔min</p> 
     * @return RetryInterval <p>重试间隔min</p>
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set <p>重试间隔min</p>
     * @param RetryInterval <p>重试间隔min</p>
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get <p>固件模块</p> 
     * @return FwType <p>固件模块</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>固件模块</p>
     * @param FwType <p>固件模块</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>用户自定义信息</p> 
     * @return TaskUserDefine <p>用户自定义信息</p>
     */
    public String getTaskUserDefine() {
        return this.TaskUserDefine;
    }

    /**
     * Set <p>用户自定义信息</p>
     * @param TaskUserDefine <p>用户自定义信息</p>
     */
    public void setTaskUserDefine(String TaskUserDefine) {
        this.TaskUserDefine = TaskUserDefine;
    }

    /**
     * Get <p>每分钟下发设备量</p> 
     * @return RateLimit <p>每分钟下发设备量</p>
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set <p>每分钟下发设备量</p>
     * @param RateLimit <p>每分钟下发设备量</p>
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。</p><p>单位：秒</p> 
     * @return EndTime <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。</p><p>单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。</p><p>单位：秒</p>
     * @param EndTime <p>任务截止时间，Unix 时间戳（单位：秒）。传入 0 或不传表示不设截止，任务按原重试/超时策略执行完毕。</p><p>单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。</p><p>单位：秒</p> 
     * @return StartTime <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。</p><p>单位：秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。</p><p>单位：秒</p>
     * @param StartTime <p>任务开始调度时间，Unix 时间戳（单位：秒）。传入 0 或不传时任务立即创建执行，与 DelayTime 同时传入时，本参数优先生效。</p><p>单位：秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public BatchUpdateFirmwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchUpdateFirmwareRequest(BatchUpdateFirmwareRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.FirmwareOriVersion != null) {
            this.FirmwareOriVersion = new String(source.FirmwareOriVersion);
        }
        if (source.UpgradeMethod != null) {
            this.UpgradeMethod = new Long(source.UpgradeMethod);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.TimeoutInterval != null) {
            this.TimeoutInterval = new Long(source.TimeoutInterval);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.OverrideMode != null) {
            this.OverrideMode = new Long(source.OverrideMode);
        }
        if (source.MaxRetryNum != null) {
            this.MaxRetryNum = new Long(source.MaxRetryNum);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "FirmwareOriVersion", this.FirmwareOriVersion);
        this.setParamSimple(map, prefix + "UpgradeMethod", this.UpgradeMethod);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "TimeoutInterval", this.TimeoutInterval);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "OverrideMode", this.OverrideMode);
        this.setParamSimple(map, prefix + "MaxRetryNum", this.MaxRetryNum);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "TaskUserDefine", this.TaskUserDefine);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

