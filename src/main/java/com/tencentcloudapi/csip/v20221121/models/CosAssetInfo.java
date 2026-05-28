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

public class CosAssetInfo extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>cos桶名</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>cos region名</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>地域码值</p>
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * <p>cos桶备注</p>
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * <p>cos桶主账号所属者</p>
    */
    @SerializedName("BucketOwnerUin")
    @Expose
    private String BucketOwnerUin;

    /**
    * <p>cos主账号所属者昵称</p>
    */
    @SerializedName("BucketOwnerNickName")
    @Expose
    private String BucketOwnerNickName;

    /**
    * <p>cos桶标签详情</p>
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * <p>安全建议<br>1 暂无异常<br>2 建议加固<br>3 立即处理</p>
    */
    @SerializedName("BucketSecuritySuggestion")
    @Expose
    private Long BucketSecuritySuggestion;

    /**
    * <p>告警列表</p>
    */
    @SerializedName("BucketAlarmList")
    @Expose
    private CosRiskAlarmInfo [] BucketAlarmList;

    /**
    * <p>风险列表</p>
    */
    @SerializedName("BucketRiskList")
    @Expose
    private CosRiskAlarmInfo [] BucketRiskList;

    /**
    * <p>调用源ip数</p>
    */
    @SerializedName("BucketInvokeSourceIpCount")
    @Expose
    private Long BucketInvokeSourceIpCount;

    /**
    * <p>访问策略</p>
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private CosBucketAccessWay BucketAccessWay;

    /**
    * <p>创建时间Unix时间单位毫秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>最后访问时间Unix时间单位毫秒</p>
    */
    @SerializedName("LastAccessTime")
    @Expose
    private Long LastAccessTime;

    /**
    * <p>存储桶id</p>
    */
    @SerializedName("BucketId")
    @Expose
    private Long BucketId;

    /**
    * <p>0 关闭<br>1 开启</p>
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * <p>数据识别扫描信息</p>
    */
    @SerializedName("DataScanInfo")
    @Expose
    private CosAssetDataScanDetail DataScanInfo;

    /**
    * <p>存储桶Az类型</p><p>枚举值：</p><ul><li>MAZ： 多az</li><li>SAZ： 单az</li></ul>
    */
    @SerializedName("BucketAzType")
    @Expose
    private String BucketAzType;

    /**
    * <p>存储桶存储大小</p><p>默认值：0</p>
    */
    @SerializedName("BucketStorageSize")
    @Expose
    private Long BucketStorageSize;

    /**
    * <p>存储桶对象个数</p><p>默认值：0</p>
    */
    @SerializedName("BucketObjectCount")
    @Expose
    private Long BucketObjectCount;

    /**
    * <p>存储桶敏感识别采样率</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("IdentifySampleRate")
    @Expose
    private Float IdentifySampleRate;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>cos桶名</p> 
     * @return BucketName <p>cos桶名</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>cos桶名</p>
     * @param BucketName <p>cos桶名</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>cos region名</p> 
     * @return BucketRegion <p>cos region名</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>cos region名</p>
     * @param BucketRegion <p>cos region名</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>地域码值</p> 
     * @return BucketRegionCode <p>地域码值</p>
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set <p>地域码值</p>
     * @param BucketRegionCode <p>地域码值</p>
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get <p>cos桶备注</p> 
     * @return BucketMarker <p>cos桶备注</p>
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set <p>cos桶备注</p>
     * @param BucketMarker <p>cos桶备注</p>
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get <p>cos桶主账号所属者</p> 
     * @return BucketOwnerUin <p>cos桶主账号所属者</p>
     */
    public String getBucketOwnerUin() {
        return this.BucketOwnerUin;
    }

    /**
     * Set <p>cos桶主账号所属者</p>
     * @param BucketOwnerUin <p>cos桶主账号所属者</p>
     */
    public void setBucketOwnerUin(String BucketOwnerUin) {
        this.BucketOwnerUin = BucketOwnerUin;
    }

    /**
     * Get <p>cos主账号所属者昵称</p> 
     * @return BucketOwnerNickName <p>cos主账号所属者昵称</p>
     */
    public String getBucketOwnerNickName() {
        return this.BucketOwnerNickName;
    }

    /**
     * Set <p>cos主账号所属者昵称</p>
     * @param BucketOwnerNickName <p>cos主账号所属者昵称</p>
     */
    public void setBucketOwnerNickName(String BucketOwnerNickName) {
        this.BucketOwnerNickName = BucketOwnerNickName;
    }

    /**
     * Get <p>cos桶标签详情</p> 
     * @return BucketTagInfo <p>cos桶标签详情</p>
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set <p>cos桶标签详情</p>
     * @param BucketTagInfo <p>cos桶标签详情</p>
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get <p>安全建议<br>1 暂无异常<br>2 建议加固<br>3 立即处理</p> 
     * @return BucketSecuritySuggestion <p>安全建议<br>1 暂无异常<br>2 建议加固<br>3 立即处理</p>
     */
    public Long getBucketSecuritySuggestion() {
        return this.BucketSecuritySuggestion;
    }

    /**
     * Set <p>安全建议<br>1 暂无异常<br>2 建议加固<br>3 立即处理</p>
     * @param BucketSecuritySuggestion <p>安全建议<br>1 暂无异常<br>2 建议加固<br>3 立即处理</p>
     */
    public void setBucketSecuritySuggestion(Long BucketSecuritySuggestion) {
        this.BucketSecuritySuggestion = BucketSecuritySuggestion;
    }

    /**
     * Get <p>告警列表</p> 
     * @return BucketAlarmList <p>告警列表</p>
     */
    public CosRiskAlarmInfo [] getBucketAlarmList() {
        return this.BucketAlarmList;
    }

    /**
     * Set <p>告警列表</p>
     * @param BucketAlarmList <p>告警列表</p>
     */
    public void setBucketAlarmList(CosRiskAlarmInfo [] BucketAlarmList) {
        this.BucketAlarmList = BucketAlarmList;
    }

    /**
     * Get <p>风险列表</p> 
     * @return BucketRiskList <p>风险列表</p>
     */
    public CosRiskAlarmInfo [] getBucketRiskList() {
        return this.BucketRiskList;
    }

    /**
     * Set <p>风险列表</p>
     * @param BucketRiskList <p>风险列表</p>
     */
    public void setBucketRiskList(CosRiskAlarmInfo [] BucketRiskList) {
        this.BucketRiskList = BucketRiskList;
    }

    /**
     * Get <p>调用源ip数</p> 
     * @return BucketInvokeSourceIpCount <p>调用源ip数</p>
     */
    public Long getBucketInvokeSourceIpCount() {
        return this.BucketInvokeSourceIpCount;
    }

    /**
     * Set <p>调用源ip数</p>
     * @param BucketInvokeSourceIpCount <p>调用源ip数</p>
     */
    public void setBucketInvokeSourceIpCount(Long BucketInvokeSourceIpCount) {
        this.BucketInvokeSourceIpCount = BucketInvokeSourceIpCount;
    }

    /**
     * Get <p>访问策略</p> 
     * @return BucketAccessWay <p>访问策略</p>
     */
    public CosBucketAccessWay getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set <p>访问策略</p>
     * @param BucketAccessWay <p>访问策略</p>
     */
    public void setBucketAccessWay(CosBucketAccessWay BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get <p>创建时间Unix时间单位毫秒</p> 
     * @return CreateTime <p>创建时间Unix时间单位毫秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间Unix时间单位毫秒</p>
     * @param CreateTime <p>创建时间Unix时间单位毫秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后访问时间Unix时间单位毫秒</p> 
     * @return LastAccessTime <p>最后访问时间Unix时间单位毫秒</p>
     */
    public Long getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set <p>最后访问时间Unix时间单位毫秒</p>
     * @param LastAccessTime <p>最后访问时间Unix时间单位毫秒</p>
     */
    public void setLastAccessTime(Long LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get <p>存储桶id</p> 
     * @return BucketId <p>存储桶id</p>
     */
    public Long getBucketId() {
        return this.BucketId;
    }

    /**
     * Set <p>存储桶id</p>
     * @param BucketId <p>存储桶id</p>
     */
    public void setBucketId(Long BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get <p>0 关闭<br>1 开启</p> 
     * @return MonitorStatus <p>0 关闭<br>1 开启</p>
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set <p>0 关闭<br>1 开启</p>
     * @param MonitorStatus <p>0 关闭<br>1 开启</p>
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get <p>数据识别扫描信息</p> 
     * @return DataScanInfo <p>数据识别扫描信息</p>
     */
    public CosAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set <p>数据识别扫描信息</p>
     * @param DataScanInfo <p>数据识别扫描信息</p>
     */
    public void setDataScanInfo(CosAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
    }

    /**
     * Get <p>存储桶Az类型</p><p>枚举值：</p><ul><li>MAZ： 多az</li><li>SAZ： 单az</li></ul> 
     * @return BucketAzType <p>存储桶Az类型</p><p>枚举值：</p><ul><li>MAZ： 多az</li><li>SAZ： 单az</li></ul>
     */
    public String getBucketAzType() {
        return this.BucketAzType;
    }

    /**
     * Set <p>存储桶Az类型</p><p>枚举值：</p><ul><li>MAZ： 多az</li><li>SAZ： 单az</li></ul>
     * @param BucketAzType <p>存储桶Az类型</p><p>枚举值：</p><ul><li>MAZ： 多az</li><li>SAZ： 单az</li></ul>
     */
    public void setBucketAzType(String BucketAzType) {
        this.BucketAzType = BucketAzType;
    }

    /**
     * Get <p>存储桶存储大小</p><p>默认值：0</p> 
     * @return BucketStorageSize <p>存储桶存储大小</p><p>默认值：0</p>
     */
    public Long getBucketStorageSize() {
        return this.BucketStorageSize;
    }

    /**
     * Set <p>存储桶存储大小</p><p>默认值：0</p>
     * @param BucketStorageSize <p>存储桶存储大小</p><p>默认值：0</p>
     */
    public void setBucketStorageSize(Long BucketStorageSize) {
        this.BucketStorageSize = BucketStorageSize;
    }

    /**
     * Get <p>存储桶对象个数</p><p>默认值：0</p> 
     * @return BucketObjectCount <p>存储桶对象个数</p><p>默认值：0</p>
     */
    public Long getBucketObjectCount() {
        return this.BucketObjectCount;
    }

    /**
     * Set <p>存储桶对象个数</p><p>默认值：0</p>
     * @param BucketObjectCount <p>存储桶对象个数</p><p>默认值：0</p>
     */
    public void setBucketObjectCount(Long BucketObjectCount) {
        this.BucketObjectCount = BucketObjectCount;
    }

    /**
     * Get <p>存储桶敏感识别采样率</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return IdentifySampleRate <p>存储桶敏感识别采样率</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Float getIdentifySampleRate() {
        return this.IdentifySampleRate;
    }

    /**
     * Set <p>存储桶敏感识别采样率</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param IdentifySampleRate <p>存储桶敏感识别采样率</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setIdentifySampleRate(Float IdentifySampleRate) {
        this.IdentifySampleRate = IdentifySampleRate;
    }

    public CosAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetInfo(CosAssetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
        if (source.BucketOwnerUin != null) {
            this.BucketOwnerUin = new String(source.BucketOwnerUin);
        }
        if (source.BucketOwnerNickName != null) {
            this.BucketOwnerNickName = new String(source.BucketOwnerNickName);
        }
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.BucketSecuritySuggestion != null) {
            this.BucketSecuritySuggestion = new Long(source.BucketSecuritySuggestion);
        }
        if (source.BucketAlarmList != null) {
            this.BucketAlarmList = new CosRiskAlarmInfo[source.BucketAlarmList.length];
            for (int i = 0; i < source.BucketAlarmList.length; i++) {
                this.BucketAlarmList[i] = new CosRiskAlarmInfo(source.BucketAlarmList[i]);
            }
        }
        if (source.BucketRiskList != null) {
            this.BucketRiskList = new CosRiskAlarmInfo[source.BucketRiskList.length];
            for (int i = 0; i < source.BucketRiskList.length; i++) {
                this.BucketRiskList[i] = new CosRiskAlarmInfo(source.BucketRiskList[i]);
            }
        }
        if (source.BucketInvokeSourceIpCount != null) {
            this.BucketInvokeSourceIpCount = new Long(source.BucketInvokeSourceIpCount);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new CosBucketAccessWay(source.BucketAccessWay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new Long(source.LastAccessTime);
        }
        if (source.BucketId != null) {
            this.BucketId = new Long(source.BucketId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.DataScanInfo != null) {
            this.DataScanInfo = new CosAssetDataScanDetail(source.DataScanInfo);
        }
        if (source.BucketAzType != null) {
            this.BucketAzType = new String(source.BucketAzType);
        }
        if (source.BucketStorageSize != null) {
            this.BucketStorageSize = new Long(source.BucketStorageSize);
        }
        if (source.BucketObjectCount != null) {
            this.BucketObjectCount = new Long(source.BucketObjectCount);
        }
        if (source.IdentifySampleRate != null) {
            this.IdentifySampleRate = new Float(source.IdentifySampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketOwnerUin", this.BucketOwnerUin);
        this.setParamSimple(map, prefix + "BucketOwnerNickName", this.BucketOwnerNickName);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "BucketSecuritySuggestion", this.BucketSecuritySuggestion);
        this.setParamArrayObj(map, prefix + "BucketAlarmList.", this.BucketAlarmList);
        this.setParamArrayObj(map, prefix + "BucketRiskList.", this.BucketRiskList);
        this.setParamSimple(map, prefix + "BucketInvokeSourceIpCount", this.BucketInvokeSourceIpCount);
        this.setParamObj(map, prefix + "BucketAccessWay.", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamObj(map, prefix + "DataScanInfo.", this.DataScanInfo);
        this.setParamSimple(map, prefix + "BucketAzType", this.BucketAzType);
        this.setParamSimple(map, prefix + "BucketStorageSize", this.BucketStorageSize);
        this.setParamSimple(map, prefix + "BucketObjectCount", this.BucketObjectCount);
        this.setParamSimple(map, prefix + "IdentifySampleRate", this.IdentifySampleRate);

    }
}

