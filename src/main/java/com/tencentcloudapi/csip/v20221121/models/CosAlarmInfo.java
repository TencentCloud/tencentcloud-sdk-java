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

public class CosAlarmInfo extends AbstractModel {

    /**
    * appid

    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型 0-未知规则分类(Unknown), 1-异常行为(AbnormalBehavior), 2-权限过大(ExcessivePermission), 3-资源枚举(ResourceEnumerated), 4-匿名访问(AnonymousAccess)

    */
    @SerializedName("PolicyAbnormalType")
    @Expose
    private Long PolicyAbnormalType;

    /**
    * 风险等级：0:Normal, 1:Tip, 2:Low, 3:Middle, 4:High, 5:Critical
    */
    @SerializedName("PolicyRiskLevel")
    @Expose
    private Long PolicyRiskLevel;

    /**
    * 策略信息描述
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

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
    * 桶备注
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * 桶tag信息
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * 桶可访问属性
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private String BucketAccessWay;

    /**
    * 所属账号uin
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 所属账号昵称
    */
    @SerializedName("AccountNickName")
    @Expose
    private String AccountNickName;

    /**
    * 所属账号社身份 1 主 2子
    */
    @SerializedName("AccountIdentify")
    @Expose
    private Long AccountIdentify;

    /**
    * 子账号所属主账号昵称
    */
    @SerializedName("AccountMainNickName")
    @Expose
    private String AccountMainNickName;

    /**
    * 告警时间戳Unix时间单位毫秒
    */
    @SerializedName("AlarmTimestamp")
    @Expose
    private Long AlarmTimestamp;

    /**
    * 处置状态 0 未处理 1 标记处置 2标记忽略
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * 告警对象id
    */
    @SerializedName("AlarmId")
    @Expose
    private Long AlarmId;

    /**
    * 桶地域码值
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * 数据识别分类详情
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

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
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型 0-未知规则分类(Unknown), 1-异常行为(AbnormalBehavior), 2-权限过大(ExcessivePermission), 3-资源枚举(ResourceEnumerated), 4-匿名访问(AnonymousAccess)
 
     * @return PolicyAbnormalType 策略类型 0-未知规则分类(Unknown), 1-异常行为(AbnormalBehavior), 2-权限过大(ExcessivePermission), 3-资源枚举(ResourceEnumerated), 4-匿名访问(AnonymousAccess)

     */
    public Long getPolicyAbnormalType() {
        return this.PolicyAbnormalType;
    }

    /**
     * Set 策略类型 0-未知规则分类(Unknown), 1-异常行为(AbnormalBehavior), 2-权限过大(ExcessivePermission), 3-资源枚举(ResourceEnumerated), 4-匿名访问(AnonymousAccess)

     * @param PolicyAbnormalType 策略类型 0-未知规则分类(Unknown), 1-异常行为(AbnormalBehavior), 2-权限过大(ExcessivePermission), 3-资源枚举(ResourceEnumerated), 4-匿名访问(AnonymousAccess)

     */
    public void setPolicyAbnormalType(Long PolicyAbnormalType) {
        this.PolicyAbnormalType = PolicyAbnormalType;
    }

    /**
     * Get 风险等级：0:Normal, 1:Tip, 2:Low, 3:Middle, 4:High, 5:Critical 
     * @return PolicyRiskLevel 风险等级：0:Normal, 1:Tip, 2:Low, 3:Middle, 4:High, 5:Critical
     */
    public Long getPolicyRiskLevel() {
        return this.PolicyRiskLevel;
    }

    /**
     * Set 风险等级：0:Normal, 1:Tip, 2:Low, 3:Middle, 4:High, 5:Critical
     * @param PolicyRiskLevel 风险等级：0:Normal, 1:Tip, 2:Low, 3:Middle, 4:High, 5:Critical
     */
    public void setPolicyRiskLevel(Long PolicyRiskLevel) {
        this.PolicyRiskLevel = PolicyRiskLevel;
    }

    /**
     * Get 策略信息描述 
     * @return PolicyDescription 策略信息描述
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 策略信息描述
     * @param PolicyDescription 策略信息描述
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
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
     * Get 桶备注 
     * @return BucketMarker 桶备注
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set 桶备注
     * @param BucketMarker 桶备注
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get 桶tag信息 
     * @return BucketTagInfo 桶tag信息
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set 桶tag信息
     * @param BucketTagInfo 桶tag信息
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get 桶可访问属性 
     * @return BucketAccessWay 桶可访问属性
     */
    public String getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set 桶可访问属性
     * @param BucketAccessWay 桶可访问属性
     */
    public void setBucketAccessWay(String BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get 所属账号uin 
     * @return AccountUin 所属账号uin
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 所属账号uin
     * @param AccountUin 所属账号uin
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 所属账号昵称 
     * @return AccountNickName 所属账号昵称
     */
    public String getAccountNickName() {
        return this.AccountNickName;
    }

    /**
     * Set 所属账号昵称
     * @param AccountNickName 所属账号昵称
     */
    public void setAccountNickName(String AccountNickName) {
        this.AccountNickName = AccountNickName;
    }

    /**
     * Get 所属账号社身份 1 主 2子 
     * @return AccountIdentify 所属账号社身份 1 主 2子
     */
    public Long getAccountIdentify() {
        return this.AccountIdentify;
    }

    /**
     * Set 所属账号社身份 1 主 2子
     * @param AccountIdentify 所属账号社身份 1 主 2子
     */
    public void setAccountIdentify(Long AccountIdentify) {
        this.AccountIdentify = AccountIdentify;
    }

    /**
     * Get 子账号所属主账号昵称 
     * @return AccountMainNickName 子账号所属主账号昵称
     */
    public String getAccountMainNickName() {
        return this.AccountMainNickName;
    }

    /**
     * Set 子账号所属主账号昵称
     * @param AccountMainNickName 子账号所属主账号昵称
     */
    public void setAccountMainNickName(String AccountMainNickName) {
        this.AccountMainNickName = AccountMainNickName;
    }

    /**
     * Get 告警时间戳Unix时间单位毫秒 
     * @return AlarmTimestamp 告警时间戳Unix时间单位毫秒
     */
    public Long getAlarmTimestamp() {
        return this.AlarmTimestamp;
    }

    /**
     * Set 告警时间戳Unix时间单位毫秒
     * @param AlarmTimestamp 告警时间戳Unix时间单位毫秒
     */
    public void setAlarmTimestamp(Long AlarmTimestamp) {
        this.AlarmTimestamp = AlarmTimestamp;
    }

    /**
     * Get 处置状态 0 未处理 1 标记处置 2标记忽略 
     * @return HandleStatus 处置状态 0 未处理 1 标记处置 2标记忽略
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 处置状态 0 未处理 1 标记处置 2标记忽略
     * @param HandleStatus 处置状态 0 未处理 1 标记处置 2标记忽略
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 告警对象id 
     * @return AlarmId 告警对象id
     */
    public Long getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警对象id
     * @param AlarmId 告警对象id
     */
    public void setAlarmId(Long AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 桶地域码值 
     * @return BucketRegionCode 桶地域码值
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set 桶地域码值
     * @param BucketRegionCode 桶地域码值
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get 数据识别分类详情 
     * @return CategoryDetails 数据识别分类详情
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set 数据识别分类详情
     * @param CategoryDetails 数据识别分类详情
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    public CosAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAlarmInfo(CosAlarmInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyAbnormalType != null) {
            this.PolicyAbnormalType = new Long(source.PolicyAbnormalType);
        }
        if (source.PolicyRiskLevel != null) {
            this.PolicyRiskLevel = new Long(source.PolicyRiskLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
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
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new String(source.BucketAccessWay);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.AccountNickName != null) {
            this.AccountNickName = new String(source.AccountNickName);
        }
        if (source.AccountIdentify != null) {
            this.AccountIdentify = new Long(source.AccountIdentify);
        }
        if (source.AccountMainNickName != null) {
            this.AccountMainNickName = new String(source.AccountMainNickName);
        }
        if (source.AlarmTimestamp != null) {
            this.AlarmTimestamp = new Long(source.AlarmTimestamp);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new Long(source.AlarmId);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyAbnormalType", this.PolicyAbnormalType);
        this.setParamSimple(map, prefix + "PolicyRiskLevel", this.PolicyRiskLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "BucketAccessWay", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "AccountNickName", this.AccountNickName);
        this.setParamSimple(map, prefix + "AccountIdentify", this.AccountIdentify);
        this.setParamSimple(map, prefix + "AccountMainNickName", this.AccountMainNickName);
        this.setParamSimple(map, prefix + "AlarmTimestamp", this.AlarmTimestamp);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);

    }
}

