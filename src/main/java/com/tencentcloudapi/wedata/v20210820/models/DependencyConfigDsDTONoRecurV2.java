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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyConfigDsDTONoRecurV2 extends AbstractModel {

    /**
    * ParentTask任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTask")
    @Expose
    private TaskDsDTONoRecurV2 ParentTask;

    /**
    * SonTask任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SonTask")
    @Expose
    private TaskDsDTONoRecurV2 SonTask;

    /**
    * the dependency config
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * SubordinateCyclicConfig配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * DependencyStrategy策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private DependencyStrategyDs DependencyStrategy;

    /**
     * Get ParentTask任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTask ParentTask任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTONoRecurV2 getParentTask() {
        return this.ParentTask;
    }

    /**
     * Set ParentTask任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTask ParentTask任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTask(TaskDsDTONoRecurV2 ParentTask) {
        this.ParentTask = ParentTask;
    }

    /**
     * Get SonTask任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SonTask SonTask任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTONoRecurV2 getSonTask() {
        return this.SonTask;
    }

    /**
     * Set SonTask任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param SonTask SonTask任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSonTask(TaskDsDTONoRecurV2 SonTask) {
        this.SonTask = SonTask;
    }

    /**
     * Get the dependency config
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainCyclicConfig the dependency config
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set the dependency config
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainCyclicConfig the dependency config
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get SubordinateCyclicConfig配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubordinateCyclicConfig SubordinateCyclicConfig配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set SubordinateCyclicConfig配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubordinateCyclicConfig SubordinateCyclicConfig配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get DependencyStrategy策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyStrategy DependencyStrategy策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyStrategyDs getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set DependencyStrategy策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyStrategy DependencyStrategy策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyStrategy(DependencyStrategyDs DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    public DependencyConfigDsDTONoRecurV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyConfigDsDTONoRecurV2(DependencyConfigDsDTONoRecurV2 source) {
        if (source.ParentTask != null) {
            this.ParentTask = new TaskDsDTONoRecurV2(source.ParentTask);
        }
        if (source.SonTask != null) {
            this.SonTask = new TaskDsDTONoRecurV2(source.SonTask);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new DependencyStrategyDs(source.DependencyStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ParentTask.", this.ParentTask);
        this.setParamObj(map, prefix + "SonTask.", this.SonTask);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamObj(map, prefix + "DependencyStrategy.", this.DependencyStrategy);

    }
}

