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
    * Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * EventName
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * DivulgeSoure
    */
    @SerializedName("DivulgeSoure")
    @Expose
    private String DivulgeSoure;

    /**
    * Asset
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * RuleName
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * RuleId
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * RuleWord
    */
    @SerializedName("RuleWord")
    @Expose
    private String RuleWord;

    /**
    * ScanUrl
    */
    @SerializedName("ScanUrl")
    @Expose
    private String ScanUrl;

    /**
    * ScanCount
    */
    @SerializedName("ScanCount")
    @Expose
    private String ScanCount;

    /**
    * Level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * EventTime
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * InsertTime
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * UpdateTime
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Id 
     * @return Id Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get AppId 
     * @return AppId AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
     * @param AppId AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get EventName 
     * @return EventName EventName
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set EventName
     * @param EventName EventName
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get DivulgeSoure 
     * @return DivulgeSoure DivulgeSoure
     */
    public String getDivulgeSoure() {
        return this.DivulgeSoure;
    }

    /**
     * Set DivulgeSoure
     * @param DivulgeSoure DivulgeSoure
     */
    public void setDivulgeSoure(String DivulgeSoure) {
        this.DivulgeSoure = DivulgeSoure;
    }

    /**
     * Get Asset 
     * @return Asset Asset
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set Asset
     * @param Asset Asset
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get RuleName 
     * @return RuleName RuleName
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set RuleName
     * @param RuleName RuleName
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get RuleId 
     * @return RuleId RuleId
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set RuleId
     * @param RuleId RuleId
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get RuleWord 
     * @return RuleWord RuleWord
     */
    public String getRuleWord() {
        return this.RuleWord;
    }

    /**
     * Set RuleWord
     * @param RuleWord RuleWord
     */
    public void setRuleWord(String RuleWord) {
        this.RuleWord = RuleWord;
    }

    /**
     * Get ScanUrl 
     * @return ScanUrl ScanUrl
     */
    public String getScanUrl() {
        return this.ScanUrl;
    }

    /**
     * Set ScanUrl
     * @param ScanUrl ScanUrl
     */
    public void setScanUrl(String ScanUrl) {
        this.ScanUrl = ScanUrl;
    }

    /**
     * Get ScanCount 
     * @return ScanCount ScanCount
     */
    public String getScanCount() {
        return this.ScanCount;
    }

    /**
     * Set ScanCount
     * @param ScanCount ScanCount
     */
    public void setScanCount(String ScanCount) {
        this.ScanCount = ScanCount;
    }

    /**
     * Get Level 
     * @return Level Level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Level
     * @param Level Level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get EventTime 
     * @return EventTime EventTime
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set EventTime
     * @param EventTime EventTime
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get InsertTime 
     * @return InsertTime InsertTime
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set InsertTime
     * @param InsertTime InsertTime
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get UpdateTime 
     * @return UpdateTime UpdateTime
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set UpdateTime
     * @param UpdateTime UpdateTime
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

