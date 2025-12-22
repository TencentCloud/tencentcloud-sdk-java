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

public class DependencyStrategyDs extends AbstractModel {

    /**
    * 等待上游任务实例策略：EXECUTING（执行）；WAITING（等待）

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PollingNullStrategy")
    @Expose
    private String PollingNullStrategy;

    /**
    * 仅当PollingNullStrategy为EXECUTING时才需要填本字段，List类型：NOT_EXIST（默认，在分钟依赖分钟/小时依赖小时的情况下，父实例不在下游实例调度时间范围内）；PARENT_EXPIRED（父实例失败）；PARENT_TIMEOUT（父实例超时）。以上场景满足任一条件即可通过该父任务实例依赖判断，除以上场景外均需等待父实例。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDependencyExecutingStrategies")
    @Expose
    private String [] TaskDependencyExecutingStrategies;

    /**
    * 仅当TaskDependencyExecutingStrategies中包含PARENT_TIMEOUT时才需要填本字段，下游任务依赖父实例执行超时时间，单位：分钟。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDependencyExecutingTimeoutValue")
    @Expose
    private Long TaskDependencyExecutingTimeoutValue;

    /**
    * 超时依赖策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyConfigTimeoutTypeList")
    @Expose
    private DependencyConfigTimeoutDTO [] DependencyConfigTimeoutTypeList;

    /**
     * Get 等待上游任务实例策略：EXECUTING（执行）；WAITING（等待）

注意：此字段可能返回 null，表示取不到有效值。 
     * @return PollingNullStrategy 等待上游任务实例策略：EXECUTING（执行）；WAITING（等待）

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPollingNullStrategy() {
        return this.PollingNullStrategy;
    }

    /**
     * Set 等待上游任务实例策略：EXECUTING（执行）；WAITING（等待）

注意：此字段可能返回 null，表示取不到有效值。
     * @param PollingNullStrategy 等待上游任务实例策略：EXECUTING（执行）；WAITING（等待）

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPollingNullStrategy(String PollingNullStrategy) {
        this.PollingNullStrategy = PollingNullStrategy;
    }

    /**
     * Get 仅当PollingNullStrategy为EXECUTING时才需要填本字段，List类型：NOT_EXIST（默认，在分钟依赖分钟/小时依赖小时的情况下，父实例不在下游实例调度时间范围内）；PARENT_EXPIRED（父实例失败）；PARENT_TIMEOUT（父实例超时）。以上场景满足任一条件即可通过该父任务实例依赖判断，除以上场景外均需等待父实例。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDependencyExecutingStrategies 仅当PollingNullStrategy为EXECUTING时才需要填本字段，List类型：NOT_EXIST（默认，在分钟依赖分钟/小时依赖小时的情况下，父实例不在下游实例调度时间范围内）；PARENT_EXPIRED（父实例失败）；PARENT_TIMEOUT（父实例超时）。以上场景满足任一条件即可通过该父任务实例依赖判断，除以上场景外均需等待父实例。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskDependencyExecutingStrategies() {
        return this.TaskDependencyExecutingStrategies;
    }

    /**
     * Set 仅当PollingNullStrategy为EXECUTING时才需要填本字段，List类型：NOT_EXIST（默认，在分钟依赖分钟/小时依赖小时的情况下，父实例不在下游实例调度时间范围内）；PARENT_EXPIRED（父实例失败）；PARENT_TIMEOUT（父实例超时）。以上场景满足任一条件即可通过该父任务实例依赖判断，除以上场景外均需等待父实例。

注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDependencyExecutingStrategies 仅当PollingNullStrategy为EXECUTING时才需要填本字段，List类型：NOT_EXIST（默认，在分钟依赖分钟/小时依赖小时的情况下，父实例不在下游实例调度时间范围内）；PARENT_EXPIRED（父实例失败）；PARENT_TIMEOUT（父实例超时）。以上场景满足任一条件即可通过该父任务实例依赖判断，除以上场景外均需等待父实例。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDependencyExecutingStrategies(String [] TaskDependencyExecutingStrategies) {
        this.TaskDependencyExecutingStrategies = TaskDependencyExecutingStrategies;
    }

    /**
     * Get 仅当TaskDependencyExecutingStrategies中包含PARENT_TIMEOUT时才需要填本字段，下游任务依赖父实例执行超时时间，单位：分钟。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDependencyExecutingTimeoutValue 仅当TaskDependencyExecutingStrategies中包含PARENT_TIMEOUT时才需要填本字段，下游任务依赖父实例执行超时时间，单位：分钟。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskDependencyExecutingTimeoutValue() {
        return this.TaskDependencyExecutingTimeoutValue;
    }

    /**
     * Set 仅当TaskDependencyExecutingStrategies中包含PARENT_TIMEOUT时才需要填本字段，下游任务依赖父实例执行超时时间，单位：分钟。

注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDependencyExecutingTimeoutValue 仅当TaskDependencyExecutingStrategies中包含PARENT_TIMEOUT时才需要填本字段，下游任务依赖父实例执行超时时间，单位：分钟。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDependencyExecutingTimeoutValue(Long TaskDependencyExecutingTimeoutValue) {
        this.TaskDependencyExecutingTimeoutValue = TaskDependencyExecutingTimeoutValue;
    }

    /**
     * Get 超时依赖策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyConfigTimeoutTypeList 超时依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyConfigTimeoutDTO [] getDependencyConfigTimeoutTypeList() {
        return this.DependencyConfigTimeoutTypeList;
    }

    /**
     * Set 超时依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyConfigTimeoutTypeList 超时依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyConfigTimeoutTypeList(DependencyConfigTimeoutDTO [] DependencyConfigTimeoutTypeList) {
        this.DependencyConfigTimeoutTypeList = DependencyConfigTimeoutTypeList;
    }

    public DependencyStrategyDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyStrategyDs(DependencyStrategyDs source) {
        if (source.PollingNullStrategy != null) {
            this.PollingNullStrategy = new String(source.PollingNullStrategy);
        }
        if (source.TaskDependencyExecutingStrategies != null) {
            this.TaskDependencyExecutingStrategies = new String[source.TaskDependencyExecutingStrategies.length];
            for (int i = 0; i < source.TaskDependencyExecutingStrategies.length; i++) {
                this.TaskDependencyExecutingStrategies[i] = new String(source.TaskDependencyExecutingStrategies[i]);
            }
        }
        if (source.TaskDependencyExecutingTimeoutValue != null) {
            this.TaskDependencyExecutingTimeoutValue = new Long(source.TaskDependencyExecutingTimeoutValue);
        }
        if (source.DependencyConfigTimeoutTypeList != null) {
            this.DependencyConfigTimeoutTypeList = new DependencyConfigTimeoutDTO[source.DependencyConfigTimeoutTypeList.length];
            for (int i = 0; i < source.DependencyConfigTimeoutTypeList.length; i++) {
                this.DependencyConfigTimeoutTypeList[i] = new DependencyConfigTimeoutDTO(source.DependencyConfigTimeoutTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PollingNullStrategy", this.PollingNullStrategy);
        this.setParamArraySimple(map, prefix + "TaskDependencyExecutingStrategies.", this.TaskDependencyExecutingStrategies);
        this.setParamSimple(map, prefix + "TaskDependencyExecutingTimeoutValue", this.TaskDependencyExecutingTimeoutValue);
        this.setParamArrayObj(map, prefix + "DependencyConfigTimeoutTypeList.", this.DependencyConfigTimeoutTypeList);

    }
}

