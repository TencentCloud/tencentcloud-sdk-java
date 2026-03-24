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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupPage extends AbstractModel {

    /**
    * 查询结果总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 规则组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private RuleGroup [] Items;

    /**
    * 已开启监控任务数量（在查询结果总量中）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorEnabledCount")
    @Expose
    private Long MonitorEnabledCount;

    /**
     * Get 查询结果总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 查询结果总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询结果总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 查询结果总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 规则组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 规则组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroup [] getItems() {
        return this.Items;
    }

    /**
     * Set 规则组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 规则组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(RuleGroup [] Items) {
        this.Items = Items;
    }

    /**
     * Get 已开启监控任务数量（在查询结果总量中）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorEnabledCount 已开启监控任务数量（在查询结果总量中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorEnabledCount() {
        return this.MonitorEnabledCount;
    }

    /**
     * Set 已开启监控任务数量（在查询结果总量中）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorEnabledCount 已开启监控任务数量（在查询结果总量中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorEnabledCount(Long MonitorEnabledCount) {
        this.MonitorEnabledCount = MonitorEnabledCount;
    }

    public RuleGroupPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupPage(RuleGroupPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new RuleGroup[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RuleGroup(source.Items[i]);
            }
        }
        if (source.MonitorEnabledCount != null) {
            this.MonitorEnabledCount = new Long(source.MonitorEnabledCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "MonitorEnabledCount", this.MonitorEnabledCount);

    }
}

