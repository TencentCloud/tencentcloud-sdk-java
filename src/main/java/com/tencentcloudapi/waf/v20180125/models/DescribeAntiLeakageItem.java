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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiLeakageItem extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态值
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 匹配条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Strategies")
    @Expose
    private DescribeAntiInfoLeakRulesStrategyItem [] Strategies;

    /**
    * 匹配的URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态值 
     * @return Status 状态值
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值
     * @param Status 状态值
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 动作 
     * @return Action 动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作
     * @param Action 动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 匹配条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Strategies 匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeAntiInfoLeakRulesStrategyItem [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Strategies 匹配条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategies(DescribeAntiInfoLeakRulesStrategyItem [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 匹配的URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uri 匹配的URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 匹配的URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uri 匹配的URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public DescribeAntiLeakageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiLeakageItem(DescribeAntiLeakageItem source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new DescribeAntiInfoLeakRulesStrategyItem[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new DescribeAntiInfoLeakRulesStrategyItem(source.Strategies[i]);
            }
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

