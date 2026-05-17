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
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * cos桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * cos region名
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 地域码值
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * cos桶备注
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * cos桶主账号所属者
    */
    @SerializedName("BucketOwnerUin")
    @Expose
    private String BucketOwnerUin;

    /**
    * cos主账号所属者昵称
    */
    @SerializedName("BucketOwnerNickName")
    @Expose
    private String BucketOwnerNickName;

    /**
    * cos桶标签详情
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * 安全建议
1 暂无异常
2 建议加固
3 立即处理
    */
    @SerializedName("BucketSecuritySuggestion")
    @Expose
    private Long BucketSecuritySuggestion;

    /**
    * 告警列表
    */
    @SerializedName("BucketAlarmList")
    @Expose
    private CosRiskAlarmInfo [] BucketAlarmList;

    /**
    * 风险列表
    */
    @SerializedName("BucketRiskList")
    @Expose
    private CosRiskAlarmInfo [] BucketRiskList;

    /**
    * 调用源ip数
    */
    @SerializedName("BucketInvokeSourceIpCount")
    @Expose
    private Long BucketInvokeSourceIpCount;

    /**
    * 访问策略
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private CosBucketAccessWay BucketAccessWay;

    /**
    * 创建时间Unix时间单位毫秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后访问时间Unix时间单位毫秒
    */
    @SerializedName("LastAccessTime")
    @Expose
    private Long LastAccessTime;

    /**
    * 存储桶id
    */
    @SerializedName("BucketId")
    @Expose
    private Long BucketId;

    /**
    * 0 关闭
1 开启
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 数据识别扫描信息
    */
    @SerializedName("DataScanInfo")
    @Expose
    private CosAssetDataScanDetail DataScanInfo;

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get cos桶名 
     * @return BucketName cos桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set cos桶名
     * @param BucketName cos桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get cos region名 
     * @return BucketRegion cos region名
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set cos region名
     * @param BucketRegion cos region名
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 地域码值 
     * @return BucketRegionCode 地域码值
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set 地域码值
     * @param BucketRegionCode 地域码值
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get cos桶备注 
     * @return BucketMarker cos桶备注
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set cos桶备注
     * @param BucketMarker cos桶备注
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get cos桶主账号所属者 
     * @return BucketOwnerUin cos桶主账号所属者
     */
    public String getBucketOwnerUin() {
        return this.BucketOwnerUin;
    }

    /**
     * Set cos桶主账号所属者
     * @param BucketOwnerUin cos桶主账号所属者
     */
    public void setBucketOwnerUin(String BucketOwnerUin) {
        this.BucketOwnerUin = BucketOwnerUin;
    }

    /**
     * Get cos主账号所属者昵称 
     * @return BucketOwnerNickName cos主账号所属者昵称
     */
    public String getBucketOwnerNickName() {
        return this.BucketOwnerNickName;
    }

    /**
     * Set cos主账号所属者昵称
     * @param BucketOwnerNickName cos主账号所属者昵称
     */
    public void setBucketOwnerNickName(String BucketOwnerNickName) {
        this.BucketOwnerNickName = BucketOwnerNickName;
    }

    /**
     * Get cos桶标签详情 
     * @return BucketTagInfo cos桶标签详情
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set cos桶标签详情
     * @param BucketTagInfo cos桶标签详情
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get 安全建议
1 暂无异常
2 建议加固
3 立即处理 
     * @return BucketSecuritySuggestion 安全建议
1 暂无异常
2 建议加固
3 立即处理
     */
    public Long getBucketSecuritySuggestion() {
        return this.BucketSecuritySuggestion;
    }

    /**
     * Set 安全建议
1 暂无异常
2 建议加固
3 立即处理
     * @param BucketSecuritySuggestion 安全建议
1 暂无异常
2 建议加固
3 立即处理
     */
    public void setBucketSecuritySuggestion(Long BucketSecuritySuggestion) {
        this.BucketSecuritySuggestion = BucketSecuritySuggestion;
    }

    /**
     * Get 告警列表 
     * @return BucketAlarmList 告警列表
     */
    public CosRiskAlarmInfo [] getBucketAlarmList() {
        return this.BucketAlarmList;
    }

    /**
     * Set 告警列表
     * @param BucketAlarmList 告警列表
     */
    public void setBucketAlarmList(CosRiskAlarmInfo [] BucketAlarmList) {
        this.BucketAlarmList = BucketAlarmList;
    }

    /**
     * Get 风险列表 
     * @return BucketRiskList 风险列表
     */
    public CosRiskAlarmInfo [] getBucketRiskList() {
        return this.BucketRiskList;
    }

    /**
     * Set 风险列表
     * @param BucketRiskList 风险列表
     */
    public void setBucketRiskList(CosRiskAlarmInfo [] BucketRiskList) {
        this.BucketRiskList = BucketRiskList;
    }

    /**
     * Get 调用源ip数 
     * @return BucketInvokeSourceIpCount 调用源ip数
     */
    public Long getBucketInvokeSourceIpCount() {
        return this.BucketInvokeSourceIpCount;
    }

    /**
     * Set 调用源ip数
     * @param BucketInvokeSourceIpCount 调用源ip数
     */
    public void setBucketInvokeSourceIpCount(Long BucketInvokeSourceIpCount) {
        this.BucketInvokeSourceIpCount = BucketInvokeSourceIpCount;
    }

    /**
     * Get 访问策略 
     * @return BucketAccessWay 访问策略
     */
    public CosBucketAccessWay getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set 访问策略
     * @param BucketAccessWay 访问策略
     */
    public void setBucketAccessWay(CosBucketAccessWay BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get 创建时间Unix时间单位毫秒 
     * @return CreateTime 创建时间Unix时间单位毫秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间Unix时间单位毫秒
     * @param CreateTime 创建时间Unix时间单位毫秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后访问时间Unix时间单位毫秒 
     * @return LastAccessTime 最后访问时间Unix时间单位毫秒
     */
    public Long getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最后访问时间Unix时间单位毫秒
     * @param LastAccessTime 最后访问时间Unix时间单位毫秒
     */
    public void setLastAccessTime(Long LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get 存储桶id 
     * @return BucketId 存储桶id
     */
    public Long getBucketId() {
        return this.BucketId;
    }

    /**
     * Set 存储桶id
     * @param BucketId 存储桶id
     */
    public void setBucketId(Long BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get 0 关闭
1 开启 
     * @return MonitorStatus 0 关闭
1 开启
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 0 关闭
1 开启
     * @param MonitorStatus 0 关闭
1 开启
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 数据识别扫描信息 
     * @return DataScanInfo 数据识别扫描信息
     */
    public CosAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set 数据识别扫描信息
     * @param DataScanInfo 数据识别扫描信息
     */
    public void setDataScanInfo(CosAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
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

    }
}

