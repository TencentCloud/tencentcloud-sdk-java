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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyTaskBrief extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主依赖配置，取值为：

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * 次依赖配置，取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * 区间、列表模式下的偏移量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 依赖执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private DependencyStrategyTask DependencyStrategy;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 主依赖配置，取值为：

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainCyclicConfig 主依赖配置，取值为：

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set 主依赖配置，取值为：

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainCyclicConfig 主依赖配置，取值为：

* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get 次依赖配置，取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubordinateCyclicConfig 次依赖配置，取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set 次依赖配置，取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubordinateCyclicConfig 次依赖配置，取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get 区间、列表模式下的偏移量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 区间、列表模式下的偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 区间、列表模式下的偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 区间、列表模式下的偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 依赖执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyStrategy 依赖执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyStrategyTask getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set 依赖执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyStrategy 依赖执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyStrategy(DependencyStrategyTask DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    public DependencyTaskBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyTaskBrief(DependencyTaskBrief source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new DependencyStrategyTask(source.DependencyStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "DependencyStrategy.", this.DependencyStrategy);

    }
}

