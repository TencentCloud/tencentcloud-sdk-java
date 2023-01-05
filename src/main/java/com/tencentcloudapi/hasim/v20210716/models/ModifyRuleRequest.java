/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel{

    /**
    * 自动化规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型：用量类(101 当月|102有效期内)、位置类(201行政区|202移动距离)、网络质量类(301网络盲点)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否激活
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
    * 触发动作：1 邮件 2 API请求 3 微信 4 停卡 5 地图标识为盲点
    */
    @SerializedName("Notice")
    @Expose
    private Long Notice;

    /**
    * 自动化规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 推送的API地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 用量阈值
    */
    @SerializedName("DataThreshold")
    @Expose
    private Long DataThreshold;

    /**
    * 行政区类型：1. 省份 2. 城市 3. 区
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * 心跳移动距离阈值
    */
    @SerializedName("Distance")
    @Expose
    private Long Distance;

    /**
    * 信号强度阈值
    */
    @SerializedName("SignalStrength")
    @Expose
    private Long SignalStrength;

    /**
    * 标签ID集合
    */
    @SerializedName("TagIDs")
    @Expose
    private Long [] TagIDs;

    /**
    * 资费计划
    */
    @SerializedName("SalePlan")
    @Expose
    private String SalePlan;

    /**
    * 具体的账号
    */
    @SerializedName("UinAccount")
    @Expose
    private String UinAccount;

    /**
     * Get 自动化规则名称 
     * @return Name 自动化规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自动化规则名称
     * @param Name 自动化规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则类型：用量类(101 当月|102有效期内)、位置类(201行政区|202移动距离)、网络质量类(301网络盲点) 
     * @return Type 规则类型：用量类(101 当月|102有效期内)、位置类(201行政区|202移动距离)、网络质量类(301网络盲点)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 规则类型：用量类(101 当月|102有效期内)、位置类(201行政区|202移动距离)、网络质量类(301网络盲点)
     * @param Type 规则类型：用量类(101 当月|102有效期内)、位置类(201行政区|202移动距离)、网络质量类(301网络盲点)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否激活 
     * @return IsActive 是否激活
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否激活
     * @param IsActive 是否激活
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 触发动作：1 邮件 2 API请求 3 微信 4 停卡 5 地图标识为盲点 
     * @return Notice 触发动作：1 邮件 2 API请求 3 微信 4 停卡 5 地图标识为盲点
     */
    public Long getNotice() {
        return this.Notice;
    }

    /**
     * Set 触发动作：1 邮件 2 API请求 3 微信 4 停卡 5 地图标识为盲点
     * @param Notice 触发动作：1 邮件 2 API请求 3 微信 4 停卡 5 地图标识为盲点
     */
    public void setNotice(Long Notice) {
        this.Notice = Notice;
    }

    /**
     * Get 自动化规则ID 
     * @return RuleID 自动化规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 自动化规则ID
     * @param RuleID 自动化规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 推送的API地址 
     * @return Url 推送的API地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 推送的API地址
     * @param Url 推送的API地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 用量阈值 
     * @return DataThreshold 用量阈值
     */
    public Long getDataThreshold() {
        return this.DataThreshold;
    }

    /**
     * Set 用量阈值
     * @param DataThreshold 用量阈值
     */
    public void setDataThreshold(Long DataThreshold) {
        this.DataThreshold = DataThreshold;
    }

    /**
     * Get 行政区类型：1. 省份 2. 城市 3. 区 
     * @return District 行政区类型：1. 省份 2. 城市 3. 区
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set 行政区类型：1. 省份 2. 城市 3. 区
     * @param District 行政区类型：1. 省份 2. 城市 3. 区
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get 心跳移动距离阈值 
     * @return Distance 心跳移动距离阈值
     */
    public Long getDistance() {
        return this.Distance;
    }

    /**
     * Set 心跳移动距离阈值
     * @param Distance 心跳移动距离阈值
     */
    public void setDistance(Long Distance) {
        this.Distance = Distance;
    }

    /**
     * Get 信号强度阈值 
     * @return SignalStrength 信号强度阈值
     */
    public Long getSignalStrength() {
        return this.SignalStrength;
    }

    /**
     * Set 信号强度阈值
     * @param SignalStrength 信号强度阈值
     */
    public void setSignalStrength(Long SignalStrength) {
        this.SignalStrength = SignalStrength;
    }

    /**
     * Get 标签ID集合 
     * @return TagIDs 标签ID集合
     */
    public Long [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set 标签ID集合
     * @param TagIDs 标签ID集合
     */
    public void setTagIDs(Long [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get 资费计划 
     * @return SalePlan 资费计划
     */
    public String getSalePlan() {
        return this.SalePlan;
    }

    /**
     * Set 资费计划
     * @param SalePlan 资费计划
     */
    public void setSalePlan(String SalePlan) {
        this.SalePlan = SalePlan;
    }

    /**
     * Get 具体的账号 
     * @return UinAccount 具体的账号
     */
    public String getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set 具体的账号
     * @param UinAccount 具体的账号
     */
    public void setUinAccount(String UinAccount) {
        this.UinAccount = UinAccount;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
        if (source.Notice != null) {
            this.Notice = new Long(source.Notice);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DataThreshold != null) {
            this.DataThreshold = new Long(source.DataThreshold);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Distance != null) {
            this.Distance = new Long(source.Distance);
        }
        if (source.SignalStrength != null) {
            this.SignalStrength = new Long(source.SignalStrength);
        }
        if (source.TagIDs != null) {
            this.TagIDs = new Long[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new Long(source.TagIDs[i]);
            }
        }
        if (source.SalePlan != null) {
            this.SalePlan = new String(source.SalePlan);
        }
        if (source.UinAccount != null) {
            this.UinAccount = new String(source.UinAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "Notice", this.Notice);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DataThreshold", this.DataThreshold);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Distance", this.Distance);
        this.setParamSimple(map, prefix + "SignalStrength", this.SignalStrength);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "SalePlan", this.SalePlan);
        this.setParamSimple(map, prefix + "UinAccount", this.UinAccount);

    }
}

