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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmAssetSecurityAnalyseStatus extends AbstractModel {

    /**
    * 资产所属账号app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资产实例Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 是否支持敏感数据识别。0 不支持；1 支持
    */
    @SerializedName("IdentifyScanSupported")
    @Expose
    private Long IdentifyScanSupported;

    /**
    * 是否支持日志投递。0-不支持 1-支持
    */
    @SerializedName("LogDeliverySupported")
    @Expose
    private Long LogDeliverySupported;

    /**
    * 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

    */
    @SerializedName("SecurityAnalyseStatus")
    @Expose
    private Long SecurityAnalyseStatus;

    /**
    * 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
    */
    @SerializedName("LogDeliveryStatus")
    @Expose
    private Long LogDeliveryStatus;

    /**
    * 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading,CdbRuleAuditEnabled
    */
    @SerializedName("LogDeliveryDisableReason")
    @Expose
    private String LogDeliveryDisableReason;

    /**
    * 当前实例的总日志数
    */
    @SerializedName("TotalAuditLogs")
    @Expose
    private Long TotalAuditLogs;

    /**
    * 已识别敏感数据项个数
    */
    @SerializedName("DataScanDetailRuleCount")
    @Expose
    private Long DataScanDetailRuleCount;

    /**
    * 操作错误信息
    */
    @SerializedName("OperationErrorMsg")
    @Expose
    private String OperationErrorMsg;

    /**
     * Get 资产所属账号app id 
     * @return AppId 资产所属账号app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资产所属账号app id
     * @param AppId 资产所属账号app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资产实例Id 
     * @return AssetId 资产实例Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产实例Id
     * @param AssetId 资产实例Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 是否支持敏感数据识别。0 不支持；1 支持 
     * @return IdentifyScanSupported 是否支持敏感数据识别。0 不支持；1 支持
     */
    public Long getIdentifyScanSupported() {
        return this.IdentifyScanSupported;
    }

    /**
     * Set 是否支持敏感数据识别。0 不支持；1 支持
     * @param IdentifyScanSupported 是否支持敏感数据识别。0 不支持；1 支持
     */
    public void setIdentifyScanSupported(Long IdentifyScanSupported) {
        this.IdentifyScanSupported = IdentifyScanSupported;
    }

    /**
     * Get 是否支持日志投递。0-不支持 1-支持 
     * @return LogDeliverySupported 是否支持日志投递。0-不支持 1-支持
     */
    public Long getLogDeliverySupported() {
        return this.LogDeliverySupported;
    }

    /**
     * Set 是否支持日志投递。0-不支持 1-支持
     * @param LogDeliverySupported 是否支持日志投递。0-不支持 1-支持
     */
    public void setLogDeliverySupported(Long LogDeliverySupported) {
        this.LogDeliverySupported = LogDeliverySupported;
    }

    /**
     * Get 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）
 
     * @return SecurityAnalyseStatus 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     */
    public Long getSecurityAnalyseStatus() {
        return this.SecurityAnalyseStatus;
    }

    /**
     * Set 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     * @param SecurityAnalyseStatus 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     */
    public void setSecurityAnalyseStatus(Long SecurityAnalyseStatus) {
        this.SecurityAnalyseStatus = SecurityAnalyseStatus;
    }

    /**
     * Get 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中 
     * @return LogDeliveryStatus 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     */
    public Long getLogDeliveryStatus() {
        return this.LogDeliveryStatus;
    }

    /**
     * Set 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     * @param LogDeliveryStatus 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     */
    public void setLogDeliveryStatus(Long LogDeliveryStatus) {
        this.LogDeliveryStatus = LogDeliveryStatus;
    }

    /**
     * Get 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading,CdbRuleAuditEnabled 
     * @return LogDeliveryDisableReason 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading,CdbRuleAuditEnabled
     */
    public String getLogDeliveryDisableReason() {
        return this.LogDeliveryDisableReason;
    }

    /**
     * Set 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading,CdbRuleAuditEnabled
     * @param LogDeliveryDisableReason 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading,CdbRuleAuditEnabled
     */
    public void setLogDeliveryDisableReason(String LogDeliveryDisableReason) {
        this.LogDeliveryDisableReason = LogDeliveryDisableReason;
    }

    /**
     * Get 当前实例的总日志数 
     * @return TotalAuditLogs 当前实例的总日志数
     */
    public Long getTotalAuditLogs() {
        return this.TotalAuditLogs;
    }

    /**
     * Set 当前实例的总日志数
     * @param TotalAuditLogs 当前实例的总日志数
     */
    public void setTotalAuditLogs(Long TotalAuditLogs) {
        this.TotalAuditLogs = TotalAuditLogs;
    }

    /**
     * Get 已识别敏感数据项个数 
     * @return DataScanDetailRuleCount 已识别敏感数据项个数
     */
    public Long getDataScanDetailRuleCount() {
        return this.DataScanDetailRuleCount;
    }

    /**
     * Set 已识别敏感数据项个数
     * @param DataScanDetailRuleCount 已识别敏感数据项个数
     */
    public void setDataScanDetailRuleCount(Long DataScanDetailRuleCount) {
        this.DataScanDetailRuleCount = DataScanDetailRuleCount;
    }

    /**
     * Get 操作错误信息 
     * @return OperationErrorMsg 操作错误信息
     */
    public String getOperationErrorMsg() {
        return this.OperationErrorMsg;
    }

    /**
     * Set 操作错误信息
     * @param OperationErrorMsg 操作错误信息
     */
    public void setOperationErrorMsg(String OperationErrorMsg) {
        this.OperationErrorMsg = OperationErrorMsg;
    }

    public DspmAssetSecurityAnalyseStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetSecurityAnalyseStatus(DspmAssetSecurityAnalyseStatus source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IdentifyScanSupported != null) {
            this.IdentifyScanSupported = new Long(source.IdentifyScanSupported);
        }
        if (source.LogDeliverySupported != null) {
            this.LogDeliverySupported = new Long(source.LogDeliverySupported);
        }
        if (source.SecurityAnalyseStatus != null) {
            this.SecurityAnalyseStatus = new Long(source.SecurityAnalyseStatus);
        }
        if (source.LogDeliveryStatus != null) {
            this.LogDeliveryStatus = new Long(source.LogDeliveryStatus);
        }
        if (source.LogDeliveryDisableReason != null) {
            this.LogDeliveryDisableReason = new String(source.LogDeliveryDisableReason);
        }
        if (source.TotalAuditLogs != null) {
            this.TotalAuditLogs = new Long(source.TotalAuditLogs);
        }
        if (source.DataScanDetailRuleCount != null) {
            this.DataScanDetailRuleCount = new Long(source.DataScanDetailRuleCount);
        }
        if (source.OperationErrorMsg != null) {
            this.OperationErrorMsg = new String(source.OperationErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdentifyScanSupported", this.IdentifyScanSupported);
        this.setParamSimple(map, prefix + "LogDeliverySupported", this.LogDeliverySupported);
        this.setParamSimple(map, prefix + "SecurityAnalyseStatus", this.SecurityAnalyseStatus);
        this.setParamSimple(map, prefix + "LogDeliveryStatus", this.LogDeliveryStatus);
        this.setParamSimple(map, prefix + "LogDeliveryDisableReason", this.LogDeliveryDisableReason);
        this.setParamSimple(map, prefix + "TotalAuditLogs", this.TotalAuditLogs);
        this.setParamSimple(map, prefix + "DataScanDetailRuleCount", this.DataScanDetailRuleCount);
        this.setParamSimple(map, prefix + "OperationErrorMsg", this.OperationErrorMsg);

    }
}

