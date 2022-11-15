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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupTable extends AbstractModel{

    /**
    * 表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInfo")
    @Expose
    private RuleGroupTableInnerInfo TableInfo;

    /**
    * 规则组调度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroups")
    @Expose
    private RuleGroupSchedulerInfo [] RuleGroups;

    /**
    * 订阅者信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subscriptions")
    @Expose
    private RuleGroupSubscribe [] Subscriptions;

    /**
     * Get 表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInfo 表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupTableInnerInfo getTableInfo() {
        return this.TableInfo;
    }

    /**
     * Set 表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInfo 表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInfo(RuleGroupTableInnerInfo TableInfo) {
        this.TableInfo = TableInfo;
    }

    /**
     * Get 规则组调度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroups 规则组调度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupSchedulerInfo [] getRuleGroups() {
        return this.RuleGroups;
    }

    /**
     * Set 规则组调度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroups 规则组调度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroups(RuleGroupSchedulerInfo [] RuleGroups) {
        this.RuleGroups = RuleGroups;
    }

    /**
     * Get 订阅者信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subscriptions 订阅者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupSubscribe [] getSubscriptions() {
        return this.Subscriptions;
    }

    /**
     * Set 订阅者信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subscriptions 订阅者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptions(RuleGroupSubscribe [] Subscriptions) {
        this.Subscriptions = Subscriptions;
    }

    public RuleGroupTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupTable(RuleGroupTable source) {
        if (source.TableInfo != null) {
            this.TableInfo = new RuleGroupTableInnerInfo(source.TableInfo);
        }
        if (source.RuleGroups != null) {
            this.RuleGroups = new RuleGroupSchedulerInfo[source.RuleGroups.length];
            for (int i = 0; i < source.RuleGroups.length; i++) {
                this.RuleGroups[i] = new RuleGroupSchedulerInfo(source.RuleGroups[i]);
            }
        }
        if (source.Subscriptions != null) {
            this.Subscriptions = new RuleGroupSubscribe[source.Subscriptions.length];
            for (int i = 0; i < source.Subscriptions.length; i++) {
                this.Subscriptions[i] = new RuleGroupSubscribe(source.Subscriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableInfo.", this.TableInfo);
        this.setParamArrayObj(map, prefix + "RuleGroups.", this.RuleGroups);
        this.setParamArrayObj(map, prefix + "Subscriptions.", this.Subscriptions);

    }
}

