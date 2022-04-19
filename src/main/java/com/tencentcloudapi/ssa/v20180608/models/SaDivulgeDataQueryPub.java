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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaDivulgeDataQueryPub extends AbstractModel{

    /**
    * Id信息
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 监控源 0:全部 1:GitHub 2:暗网 默认值1
    */
    @SerializedName("DivulgeSoure")
    @Expose
    private String DivulgeSoure;

    /**
    * 受影响资产
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * 命中主题集下的规则topic名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 命中主题集下的规则topic唯一id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 命中主题集下的自定义规则策略
    */
    @SerializedName("RuleWord")
    @Expose
    private String RuleWord;

    /**
    * 扫描监测url
    */
    @SerializedName("ScanUrl")
    @Expose
    private String ScanUrl;

    /**
    * 扫描监测命中次数
    */
    @SerializedName("ScanCount")
    @Expose
    private String ScanCount;

    /**
    * 风险等级 -1:未知 1:低危 2:中危 3:高危 4:严重
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 安全事件处理状态 -1:未知 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 安全事件发生时间
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 事件插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 事件更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Id信息 
     * @return Id Id信息
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id信息
     * @param Id Id信息
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 监控源 0:全部 1:GitHub 2:暗网 默认值1 
     * @return DivulgeSoure 监控源 0:全部 1:GitHub 2:暗网 默认值1
     */
    public String getDivulgeSoure() {
        return this.DivulgeSoure;
    }

    /**
     * Set 监控源 0:全部 1:GitHub 2:暗网 默认值1
     * @param DivulgeSoure 监控源 0:全部 1:GitHub 2:暗网 默认值1
     */
    public void setDivulgeSoure(String DivulgeSoure) {
        this.DivulgeSoure = DivulgeSoure;
    }

    /**
     * Get 受影响资产 
     * @return Asset 受影响资产
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set 受影响资产
     * @param Asset 受影响资产
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 命中主题集下的规则topic名称 
     * @return RuleName 命中主题集下的规则topic名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 命中主题集下的规则topic名称
     * @param RuleName 命中主题集下的规则topic名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 命中主题集下的规则topic唯一id 
     * @return RuleId 命中主题集下的规则topic唯一id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 命中主题集下的规则topic唯一id
     * @param RuleId 命中主题集下的规则topic唯一id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 命中主题集下的自定义规则策略 
     * @return RuleWord 命中主题集下的自定义规则策略
     */
    public String getRuleWord() {
        return this.RuleWord;
    }

    /**
     * Set 命中主题集下的自定义规则策略
     * @param RuleWord 命中主题集下的自定义规则策略
     */
    public void setRuleWord(String RuleWord) {
        this.RuleWord = RuleWord;
    }

    /**
     * Get 扫描监测url 
     * @return ScanUrl 扫描监测url
     */
    public String getScanUrl() {
        return this.ScanUrl;
    }

    /**
     * Set 扫描监测url
     * @param ScanUrl 扫描监测url
     */
    public void setScanUrl(String ScanUrl) {
        this.ScanUrl = ScanUrl;
    }

    /**
     * Get 扫描监测命中次数 
     * @return ScanCount 扫描监测命中次数
     */
    public String getScanCount() {
        return this.ScanCount;
    }

    /**
     * Set 扫描监测命中次数
     * @param ScanCount 扫描监测命中次数
     */
    public void setScanCount(String ScanCount) {
        this.ScanCount = ScanCount;
    }

    /**
     * Get 风险等级 -1:未知 1:低危 2:中危 3:高危 4:严重 
     * @return Level 风险等级 -1:未知 1:低危 2:中危 3:高危 4:严重
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级 -1:未知 1:低危 2:中危 3:高危 4:严重
     * @param Level 风险等级 -1:未知 1:低危 2:中危 3:高危 4:严重
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 安全事件处理状态 -1:未知 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任 
     * @return Status 安全事件处理状态 -1:未知 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 安全事件处理状态 -1:未知 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     * @param Status 安全事件处理状态 -1:未知 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 安全事件发生时间 
     * @return EventTime 安全事件发生时间
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 安全事件发生时间
     * @param EventTime 安全事件发生时间
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件插入时间 
     * @return InsertTime 事件插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 事件插入时间
     * @param InsertTime 事件插入时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 事件更新时间 
     * @return UpdateTime 事件更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 事件更新时间
     * @param UpdateTime 事件更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SaDivulgeDataQueryPub() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaDivulgeDataQueryPub(SaDivulgeDataQueryPub source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.DivulgeSoure != null) {
            this.DivulgeSoure = new String(source.DivulgeSoure);
        }
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleWord != null) {
            this.RuleWord = new String(source.RuleWord);
        }
        if (source.ScanUrl != null) {
            this.ScanUrl = new String(source.ScanUrl);
        }
        if (source.ScanCount != null) {
            this.ScanCount = new String(source.ScanCount);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "DivulgeSoure", this.DivulgeSoure);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleWord", this.RuleWord);
        this.setParamSimple(map, prefix + "ScanUrl", this.ScanUrl);
        this.setParamSimple(map, prefix + "ScanCount", this.ScanCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

