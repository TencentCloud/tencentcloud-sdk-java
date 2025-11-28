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
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 固件新版本号
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 固件原版本号
    */
    @SerializedName("FirmwareOriVersion")
    @Expose
    private String FirmwareOriVersion;

    /**
    * 升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式
    */
    @SerializedName("UpgradeMethod")
    @Expose
    private Long UpgradeMethod;

    /**
    * 设备列表文件名称，根据文件列表升级固件需要填写此参数
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 设备列表的文件md5值
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 设备列表的文件大小值
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 需要升级的设备名称列表
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 固件升级任务，默认超时时间。 最小取值120秒，最大为900秒
    */
    @SerializedName("TimeoutInterval")
    @Expose
    private Long TimeoutInterval;

    /**
    * 固件升级任务类型，默认静态升级值为空或1，动态升级值为7
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 是否覆盖，0不覆盖，1覆盖
    */
    @SerializedName("OverrideMode")
    @Expose
    private Long OverrideMode;

    /**
    * 失败重试次数
    */
    @SerializedName("MaxRetryNum")
    @Expose
    private Long MaxRetryNum;

    /**
    * 重试间隔min
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 固件模块
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 用户自定义信息
    */
    @SerializedName("TaskUserDefine")
    @Expose
    private String TaskUserDefine;

    /**
    * 每分钟下发设备量
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 固件新版本号 
     * @return FirmwareVersion 固件新版本号
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 固件新版本号
     * @param FirmwareVersion 固件新版本号
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 固件原版本号 
     * @return FirmwareOriVersion 固件原版本号
     */
    public String getFirmwareOriVersion() {
        return this.FirmwareOriVersion;
    }

    /**
     * Set 固件原版本号
     * @param FirmwareOriVersion 固件原版本号
     */
    public void setFirmwareOriVersion(String FirmwareOriVersion) {
        this.FirmwareOriVersion = FirmwareOriVersion;
    }

    /**
     * Get 升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式 
     * @return UpgradeMethod 升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式
     */
    public Long getUpgradeMethod() {
        return this.UpgradeMethod;
    }

    /**
     * Set 升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式
     * @param UpgradeMethod 升级方式，0 静默升级  1 用户确认升级。 不填默认为静默升级方式
     */
    public void setUpgradeMethod(Long UpgradeMethod) {
        this.UpgradeMethod = UpgradeMethod;
    }

    /**
     * Get 设备列表文件名称，根据文件列表升级固件需要填写此参数 
     * @return FileName 设备列表文件名称，根据文件列表升级固件需要填写此参数
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 设备列表文件名称，根据文件列表升级固件需要填写此参数
     * @param FileName 设备列表文件名称，根据文件列表升级固件需要填写此参数
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 设备列表的文件md5值 
     * @return FileMd5 设备列表的文件md5值
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 设备列表的文件md5值
     * @param FileMd5 设备列表的文件md5值
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 设备列表的文件大小值 
     * @return FileSize 设备列表的文件大小值
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 设备列表的文件大小值
     * @param FileSize 设备列表的文件大小值
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 需要升级的设备名称列表 
     * @return DeviceNames 需要升级的设备名称列表
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 需要升级的设备名称列表
     * @param DeviceNames 需要升级的设备名称列表
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get 固件升级任务，默认超时时间。 最小取值120秒，最大为900秒 
     * @return TimeoutInterval 固件升级任务，默认超时时间。 最小取值120秒，最大为900秒
     */
    public Long getTimeoutInterval() {
        return this.TimeoutInterval;
    }

    /**
     * Set 固件升级任务，默认超时时间。 最小取值120秒，最大为900秒
     * @param TimeoutInterval 固件升级任务，默认超时时间。 最小取值120秒，最大为900秒
     */
    public void setTimeoutInterval(Long TimeoutInterval) {
        this.TimeoutInterval = TimeoutInterval;
    }

    /**
     * Get 固件升级任务类型，默认静态升级值为空或1，动态升级值为7 
     * @return Type 固件升级任务类型，默认静态升级值为空或1，动态升级值为7
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 固件升级任务类型，默认静态升级值为空或1，动态升级值为7
     * @param Type 固件升级任务类型，默认静态升级值为空或1，动态升级值为7
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务延迟时间 
     * @return DelayTime 任务延迟时间
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 任务延迟时间
     * @param DelayTime 任务延迟时间
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 是否覆盖，0不覆盖，1覆盖 
     * @return OverrideMode 是否覆盖，0不覆盖，1覆盖
     */
    public Long getOverrideMode() {
        return this.OverrideMode;
    }

    /**
     * Set 是否覆盖，0不覆盖，1覆盖
     * @param OverrideMode 是否覆盖，0不覆盖，1覆盖
     */
    public void setOverrideMode(Long OverrideMode) {
        this.OverrideMode = OverrideMode;
    }

    /**
     * Get 失败重试次数 
     * @return MaxRetryNum 失败重试次数
     */
    public Long getMaxRetryNum() {
        return this.MaxRetryNum;
    }

    /**
     * Set 失败重试次数
     * @param MaxRetryNum 失败重试次数
     */
    public void setMaxRetryNum(Long MaxRetryNum) {
        this.MaxRetryNum = MaxRetryNum;
    }

    /**
     * Get 重试间隔min 
     * @return RetryInterval 重试间隔min
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔min
     * @param RetryInterval 重试间隔min
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 固件模块 
     * @return FwType 固件模块
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件模块
     * @param FwType 固件模块
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 用户自定义信息 
     * @return TaskUserDefine 用户自定义信息
     */
    public String getTaskUserDefine() {
        return this.TaskUserDefine;
    }

    /**
     * Set 用户自定义信息
     * @param TaskUserDefine 用户自定义信息
     */
    public void setTaskUserDefine(String TaskUserDefine) {
        this.TaskUserDefine = TaskUserDefine;
    }

    /**
     * Get 每分钟下发设备量 
     * @return RateLimit 每分钟下发设备量
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 每分钟下发设备量
     * @param RateLimit 每分钟下发设备量
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
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

    }
}

