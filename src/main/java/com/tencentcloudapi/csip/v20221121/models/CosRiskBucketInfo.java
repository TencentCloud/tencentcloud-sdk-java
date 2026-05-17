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

public class CosRiskBucketInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 桶地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 桶备注信息
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * 桶uin
    */
    @SerializedName("BucketUin")
    @Expose
    private String BucketUin;

    /**
    * uin昵称
    */
    @SerializedName("BucketNickName")
    @Expose
    private String BucketNickName;

    /**
    * uin主账号昵称
    */
    @SerializedName("BucketMainNickName")
    @Expose
    private String BucketMainNickName;

    /**
    * uin身份
    */
    @SerializedName("BucketIdentify")
    @Expose
    private Long BucketIdentify;

    /**
    * 风险检出时间Unix时间单位毫秒
    */
    @SerializedName("LastScanTimestamp")
    @Expose
    private Long LastScanTimestamp;

    /**
    * 状态信息
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * 风险名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 风险类型
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略级别
    */
    @SerializedName("PolicyLevel")
    @Expose
    private Long PolicyLevel;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * 访问方式
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private String BucketAccessWay;

    /**
    * 标签信息
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
    * cos地域码值
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * 是否开启自动监测状态 0 关闭 1 开启
    */
    @SerializedName("BucketMonitorStatus")
    @Expose
    private Long BucketMonitorStatus;

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
     * Get 桶名 
     * @return BucketName 桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名
     * @param BucketName 桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 桶地域 
     * @return BucketRegion 桶地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 桶地域
     * @param BucketRegion 桶地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 桶备注信息 
     * @return BucketMarker 桶备注信息
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set 桶备注信息
     * @param BucketMarker 桶备注信息
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get 桶uin 
     * @return BucketUin 桶uin
     */
    public String getBucketUin() {
        return this.BucketUin;
    }

    /**
     * Set 桶uin
     * @param BucketUin 桶uin
     */
    public void setBucketUin(String BucketUin) {
        this.BucketUin = BucketUin;
    }

    /**
     * Get uin昵称 
     * @return BucketNickName uin昵称
     */
    public String getBucketNickName() {
        return this.BucketNickName;
    }

    /**
     * Set uin昵称
     * @param BucketNickName uin昵称
     */
    public void setBucketNickName(String BucketNickName) {
        this.BucketNickName = BucketNickName;
    }

    /**
     * Get uin主账号昵称 
     * @return BucketMainNickName uin主账号昵称
     */
    public String getBucketMainNickName() {
        return this.BucketMainNickName;
    }

    /**
     * Set uin主账号昵称
     * @param BucketMainNickName uin主账号昵称
     */
    public void setBucketMainNickName(String BucketMainNickName) {
        this.BucketMainNickName = BucketMainNickName;
    }

    /**
     * Get uin身份 
     * @return BucketIdentify uin身份
     */
    public Long getBucketIdentify() {
        return this.BucketIdentify;
    }

    /**
     * Set uin身份
     * @param BucketIdentify uin身份
     */
    public void setBucketIdentify(Long BucketIdentify) {
        this.BucketIdentify = BucketIdentify;
    }

    /**
     * Get 风险检出时间Unix时间单位毫秒 
     * @return LastScanTimestamp 风险检出时间Unix时间单位毫秒
     */
    public Long getLastScanTimestamp() {
        return this.LastScanTimestamp;
    }

    /**
     * Set 风险检出时间Unix时间单位毫秒
     * @param LastScanTimestamp 风险检出时间Unix时间单位毫秒
     */
    public void setLastScanTimestamp(Long LastScanTimestamp) {
        this.LastScanTimestamp = LastScanTimestamp;
    }

    /**
     * Get 状态信息 
     * @return HandleStatus 状态信息
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 状态信息
     * @param HandleStatus 状态信息
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 风险名称 
     * @return PolicyName 风险名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 风险名称
     * @param PolicyName 风险名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 风险类型 
     * @return PolicyType 风险类型
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 风险类型
     * @param PolicyType 风险类型
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略级别 
     * @return PolicyLevel 策略级别
     */
    public Long getPolicyLevel() {
        return this.PolicyLevel;
    }

    /**
     * Set 策略级别
     * @param PolicyLevel 策略级别
     */
    public void setPolicyLevel(Long PolicyLevel) {
        this.PolicyLevel = PolicyLevel;
    }

    /**
     * Get 策略描述 
     * @return PolicyDescription 策略描述
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 策略描述
     * @param PolicyDescription 策略描述
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get 访问方式 
     * @return BucketAccessWay 访问方式
     */
    public String getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set 访问方式
     * @param BucketAccessWay 访问方式
     */
    public void setBucketAccessWay(String BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get 标签信息 
     * @return BucketTagInfo 标签信息
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set 标签信息
     * @param BucketTagInfo 标签信息
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get 风险id 
     * @return RiskId 风险id
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get cos地域码值 
     * @return BucketRegionCode cos地域码值
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set cos地域码值
     * @param BucketRegionCode cos地域码值
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get 是否开启自动监测状态 0 关闭 1 开启 
     * @return BucketMonitorStatus 是否开启自动监测状态 0 关闭 1 开启
     */
    public Long getBucketMonitorStatus() {
        return this.BucketMonitorStatus;
    }

    /**
     * Set 是否开启自动监测状态 0 关闭 1 开启
     * @param BucketMonitorStatus 是否开启自动监测状态 0 关闭 1 开启
     */
    public void setBucketMonitorStatus(Long BucketMonitorStatus) {
        this.BucketMonitorStatus = BucketMonitorStatus;
    }

    public CosRiskBucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskBucketInfo(CosRiskBucketInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
        if (source.BucketUin != null) {
            this.BucketUin = new String(source.BucketUin);
        }
        if (source.BucketNickName != null) {
            this.BucketNickName = new String(source.BucketNickName);
        }
        if (source.BucketMainNickName != null) {
            this.BucketMainNickName = new String(source.BucketMainNickName);
        }
        if (source.BucketIdentify != null) {
            this.BucketIdentify = new Long(source.BucketIdentify);
        }
        if (source.LastScanTimestamp != null) {
            this.LastScanTimestamp = new Long(source.LastScanTimestamp);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyLevel != null) {
            this.PolicyLevel = new Long(source.PolicyLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new String(source.BucketAccessWay);
        }
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMonitorStatus != null) {
            this.BucketMonitorStatus = new Long(source.BucketMonitorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketUin", this.BucketUin);
        this.setParamSimple(map, prefix + "BucketNickName", this.BucketNickName);
        this.setParamSimple(map, prefix + "BucketMainNickName", this.BucketMainNickName);
        this.setParamSimple(map, prefix + "BucketIdentify", this.BucketIdentify);
        this.setParamSimple(map, prefix + "LastScanTimestamp", this.LastScanTimestamp);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyLevel", this.PolicyLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "BucketAccessWay", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMonitorStatus", this.BucketMonitorStatus);

    }
}

