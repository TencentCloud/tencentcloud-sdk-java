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

public class SaDivulgeDataQueryPubRequest extends AbstractModel{

    /**
    * 模糊查询字段(针对appid或者uin)
    */
    @SerializedName("QueryKey")
    @Expose
    private String QueryKey;

    /**
    * 安全事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 监控源  0:全部 1:GitHub 2:暗网 默认值1
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
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询起始地址
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 查询个数
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get 模糊查询字段(针对appid或者uin) 
     * @return QueryKey 模糊查询字段(针对appid或者uin)
     */
    public String getQueryKey() {
        return this.QueryKey;
    }

    /**
     * Set 模糊查询字段(针对appid或者uin)
     * @param QueryKey 模糊查询字段(针对appid或者uin)
     */
    public void setQueryKey(String QueryKey) {
        this.QueryKey = QueryKey;
    }

    /**
     * Get 安全事件名称 
     * @return EventName 安全事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 安全事件名称
     * @param EventName 安全事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 监控源  0:全部 1:GitHub 2:暗网 默认值1 
     * @return DivulgeSoure 监控源  0:全部 1:GitHub 2:暗网 默认值1
     */
    public String getDivulgeSoure() {
        return this.DivulgeSoure;
    }

    /**
     * Set 监控源  0:全部 1:GitHub 2:暗网 默认值1
     * @param DivulgeSoure 监控源  0:全部 1:GitHub 2:暗网 默认值1
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
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询起始地址 
     * @return Offset 查询起始地址
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始地址
     * @param Offset 查询起始地址
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询个数 
     * @return Limit 查询个数
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数
     * @param Limit 查询个数
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    public SaDivulgeDataQueryPubRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaDivulgeDataQueryPubRequest(SaDivulgeDataQueryPubRequest source) {
        if (source.QueryKey != null) {
            this.QueryKey = new String(source.QueryKey);
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
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryKey", this.QueryKey);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "DivulgeSoure", this.DivulgeSoure);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

