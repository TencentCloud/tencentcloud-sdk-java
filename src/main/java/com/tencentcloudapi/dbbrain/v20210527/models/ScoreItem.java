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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreItem extends AbstractModel{

    /**
    * 异常诊断项名称。
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * 诊断项分类，取值包括：可用性、可维护性、性能及可靠性。
    */
    @SerializedName("IssueType")
    @Expose
    private String IssueType;

    /**
    * 健康等级，取值包括：信息、提示、告警、严重、致命。
    */
    @SerializedName("TopSeverity")
    @Expose
    private String TopSeverity;

    /**
    * 该异常诊断项出现次数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 扣分分数。
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
     * Get 异常诊断项名称。 
     * @return DiagItem 异常诊断项名称。
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set 异常诊断项名称。
     * @param DiagItem 异常诊断项名称。
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get 诊断项分类，取值包括：可用性、可维护性、性能及可靠性。 
     * @return IssueType 诊断项分类，取值包括：可用性、可维护性、性能及可靠性。
     */
    public String getIssueType() {
        return this.IssueType;
    }

    /**
     * Set 诊断项分类，取值包括：可用性、可维护性、性能及可靠性。
     * @param IssueType 诊断项分类，取值包括：可用性、可维护性、性能及可靠性。
     */
    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get 健康等级，取值包括：信息、提示、告警、严重、致命。 
     * @return TopSeverity 健康等级，取值包括：信息、提示、告警、严重、致命。
     */
    public String getTopSeverity() {
        return this.TopSeverity;
    }

    /**
     * Set 健康等级，取值包括：信息、提示、告警、严重、致命。
     * @param TopSeverity 健康等级，取值包括：信息、提示、告警、严重、致命。
     */
    public void setTopSeverity(String TopSeverity) {
        this.TopSeverity = TopSeverity;
    }

    /**
     * Get 该异常诊断项出现次数。 
     * @return Count 该异常诊断项出现次数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该异常诊断项出现次数。
     * @param Count 该异常诊断项出现次数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 扣分分数。 
     * @return ScoreLost 扣分分数。
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set 扣分分数。
     * @param ScoreLost 扣分分数。
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    public ScoreItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreItem(ScoreItem source) {
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.IssueType != null) {
            this.IssueType = new String(source.IssueType);
        }
        if (source.TopSeverity != null) {
            this.TopSeverity = new String(source.TopSeverity);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "TopSeverity", this.TopSeverity);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);

    }
}

