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

public class UebaRule extends AbstractModel {

    /**
    * 策略id
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 策略类型
0:系统策略
1:自定义策略
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 策略等级
0:提示
1:低危
2:中危
3:高危
4:严重
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * 策略内容
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * 策略开关
    */
    @SerializedName("RuleStatus")
    @Expose
    private Boolean RuleStatus;

    /**
    * 命中次数
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * 所属账号Appid
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 多账号，成员ID
    */
    @SerializedName("MemberID")
    @Expose
    private String MemberID;

    /**
    * Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 自定义规则具体内容
    */
    @SerializedName("CustomRuleDetail")
    @Expose
    private UebaCustomRule CustomRuleDetail;

    /**
    * 云类型
腾讯云：0
aws：1
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get 策略id 
     * @return RuleID 策略id
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 策略id
     * @param RuleID 策略id
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 策略类型
0:系统策略
1:自定义策略 
     * @return RuleType 策略类型
0:系统策略
1:自定义策略
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 策略类型
0:系统策略
1:自定义策略
     * @param RuleType 策略类型
0:系统策略
1:自定义策略
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 策略等级
0:提示
1:低危
2:中危
3:高危
4:严重 
     * @return RuleLevel 策略等级
0:提示
1:低危
2:中危
3:高危
4:严重
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set 策略等级
0:提示
1:低危
2:中危
3:高危
4:严重
     * @param RuleLevel 策略等级
0:提示
1:低危
2:中危
3:高危
4:严重
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get 策略内容 
     * @return RuleContent 策略内容
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set 策略内容
     * @param RuleContent 策略内容
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get 策略开关 
     * @return RuleStatus 策略开关
     */
    public Boolean getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 策略开关
     * @param RuleStatus 策略开关
     */
    public void setRuleStatus(Boolean RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 命中次数 
     * @return HitCount 命中次数
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set 命中次数
     * @param HitCount 命中次数
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get 所属账号Appid 
     * @return AppID 所属账号Appid
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 所属账号Appid
     * @param AppID 所属账号Appid
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 多账号，成员ID 
     * @return MemberID 多账号，成员ID
     */
    public String getMemberID() {
        return this.MemberID;
    }

    /**
     * Set 多账号，成员ID
     * @param MemberID 多账号，成员ID
     */
    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    /**
     * Get Uin 
     * @return Uin Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin
     * @param Uin Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 自定义规则具体内容 
     * @return CustomRuleDetail 自定义规则具体内容
     */
    public UebaCustomRule getCustomRuleDetail() {
        return this.CustomRuleDetail;
    }

    /**
     * Set 自定义规则具体内容
     * @param CustomRuleDetail 自定义规则具体内容
     */
    public void setCustomRuleDetail(UebaCustomRule CustomRuleDetail) {
        this.CustomRuleDetail = CustomRuleDetail;
    }

    /**
     * Get 云类型
腾讯云：0
aws：1 
     * @return CloudType 云类型
腾讯云：0
aws：1
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云类型
腾讯云：0
aws：1
     * @param CloudType 云类型
腾讯云：0
aws：1
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public UebaRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaRule(UebaRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new Long(source.RuleLevel);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Boolean(source.RuleStatus);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.MemberID != null) {
            this.MemberID = new String(source.MemberID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.CustomRuleDetail != null) {
            this.CustomRuleDetail = new UebaCustomRule(source.CustomRuleDetail);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "MemberID", this.MemberID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamObj(map, prefix + "CustomRuleDetail.", this.CustomRuleDetail);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

