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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertHistoryItem extends AbstractModel{

    /**
    * 告警名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 告警开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 告警内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 告警状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 触发的规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleItem")
    @Expose
    private String RuleItem;

    /**
    * 告警渠道的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 告警渠道的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 告警名称 
     * @return RuleName 告警名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 告警名称
     * @param RuleName 告警名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 告警开始时间 
     * @return StartTime 告警开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 告警开始时间
     * @param StartTime 告警开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 告警内容 
     * @return Content 告警内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 告警内容
     * @param Content 告警内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 告警状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 告警状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 告警状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 告警状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 触发的规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleItem 触发的规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleItem() {
        return this.RuleItem;
    }

    /**
     * Set 触发的规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleItem 触发的规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleItem(String RuleItem) {
        this.RuleItem = RuleItem;
    }

    /**
     * Get 告警渠道的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 告警渠道的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 告警渠道的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 告警渠道的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 告警渠道的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 告警渠道的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 告警渠道的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 告警渠道的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public PrometheusAlertHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertHistoryItem(PrometheusAlertHistoryItem source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RuleItem != null) {
            this.RuleItem = new String(source.RuleItem);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RuleItem", this.RuleItem);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

