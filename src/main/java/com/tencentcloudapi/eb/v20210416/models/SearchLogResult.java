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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResult extends AbstractModel{

    /**
    * 单条日志上报时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志内容详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 事件来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleIds")
    @Expose
    private String RuleIds;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 事件状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 单条日志上报时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 单条日志上报时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 单条日志上报时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 单条日志上报时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志内容详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 日志内容详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 日志内容详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 日志内容详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 事件来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleIds 事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleIds 事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleIds(String RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subject 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subject 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 事件状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 事件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 事件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SearchLogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResult(SearchLogResult source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String(source.RuleIds);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleIds", this.RuleIds);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

