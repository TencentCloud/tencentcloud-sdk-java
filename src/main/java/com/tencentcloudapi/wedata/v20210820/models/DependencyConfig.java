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

public class DependencyConfig extends AbstractModel{

    /**
    * 仅五种周期运行依赖配置： HOUR,DAY,WEEK,MONTH,YEAR,CRONTAB,MINUTE
    */
    @SerializedName("DependConfType")
    @Expose
    private String DependConfType;

    /**
    * 依赖配置从属周期类型，CURRENT_HOUR，PREVIOUS_HOUR，CURRENT_DAY，PREVIOUS_DAY，PREVIOUS_WEEK，PREVIOUS_FRIDAY，PREVIOUS_WEEKEND，CURRENT_MONTH，PREVIOUS_MONTH，PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH，ALL_MONTH_OF_YEAR，ALL_DAY_OF_YEAR，CURRENT_YEAR，CURRENT，CURRENT_MINUTE，PREVIOUS_MINUTE_CYCLE，PREVIOUS_HOUR_CYCLE
    */
    @SerializedName("SubordinateCyclicType")
    @Expose
    private String SubordinateCyclicType;

    /**
    * WAITING，等待（默认策略）EXECUTING:执行
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private String DependencyStrategy;

    /**
    * 父任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTask")
    @Expose
    private TaskInnerInfo ParentTask;

    /**
    * 子任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SonTask")
    @Expose
    private TaskInnerInfo SonTask;

    /**
     * Get 仅五种周期运行依赖配置： HOUR,DAY,WEEK,MONTH,YEAR,CRONTAB,MINUTE 
     * @return DependConfType 仅五种周期运行依赖配置： HOUR,DAY,WEEK,MONTH,YEAR,CRONTAB,MINUTE
     */
    public String getDependConfType() {
        return this.DependConfType;
    }

    /**
     * Set 仅五种周期运行依赖配置： HOUR,DAY,WEEK,MONTH,YEAR,CRONTAB,MINUTE
     * @param DependConfType 仅五种周期运行依赖配置： HOUR,DAY,WEEK,MONTH,YEAR,CRONTAB,MINUTE
     */
    public void setDependConfType(String DependConfType) {
        this.DependConfType = DependConfType;
    }

    /**
     * Get 依赖配置从属周期类型，CURRENT_HOUR，PREVIOUS_HOUR，CURRENT_DAY，PREVIOUS_DAY，PREVIOUS_WEEK，PREVIOUS_FRIDAY，PREVIOUS_WEEKEND，CURRENT_MONTH，PREVIOUS_MONTH，PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH，ALL_MONTH_OF_YEAR，ALL_DAY_OF_YEAR，CURRENT_YEAR，CURRENT，CURRENT_MINUTE，PREVIOUS_MINUTE_CYCLE，PREVIOUS_HOUR_CYCLE 
     * @return SubordinateCyclicType 依赖配置从属周期类型，CURRENT_HOUR，PREVIOUS_HOUR，CURRENT_DAY，PREVIOUS_DAY，PREVIOUS_WEEK，PREVIOUS_FRIDAY，PREVIOUS_WEEKEND，CURRENT_MONTH，PREVIOUS_MONTH，PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH，ALL_MONTH_OF_YEAR，ALL_DAY_OF_YEAR，CURRENT_YEAR，CURRENT，CURRENT_MINUTE，PREVIOUS_MINUTE_CYCLE，PREVIOUS_HOUR_CYCLE
     */
    public String getSubordinateCyclicType() {
        return this.SubordinateCyclicType;
    }

    /**
     * Set 依赖配置从属周期类型，CURRENT_HOUR，PREVIOUS_HOUR，CURRENT_DAY，PREVIOUS_DAY，PREVIOUS_WEEK，PREVIOUS_FRIDAY，PREVIOUS_WEEKEND，CURRENT_MONTH，PREVIOUS_MONTH，PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH，ALL_MONTH_OF_YEAR，ALL_DAY_OF_YEAR，CURRENT_YEAR，CURRENT，CURRENT_MINUTE，PREVIOUS_MINUTE_CYCLE，PREVIOUS_HOUR_CYCLE
     * @param SubordinateCyclicType 依赖配置从属周期类型，CURRENT_HOUR，PREVIOUS_HOUR，CURRENT_DAY，PREVIOUS_DAY，PREVIOUS_WEEK，PREVIOUS_FRIDAY，PREVIOUS_WEEKEND，CURRENT_MONTH，PREVIOUS_MONTH，PREVIOUS_END_OF_MONTH
     * PREVIOUS_BEGIN_OF_MONTH，ALL_MONTH_OF_YEAR，ALL_DAY_OF_YEAR，CURRENT_YEAR，CURRENT，CURRENT_MINUTE，PREVIOUS_MINUTE_CYCLE，PREVIOUS_HOUR_CYCLE
     */
    public void setSubordinateCyclicType(String SubordinateCyclicType) {
        this.SubordinateCyclicType = SubordinateCyclicType;
    }

    /**
     * Get WAITING，等待（默认策略）EXECUTING:执行 
     * @return DependencyStrategy WAITING，等待（默认策略）EXECUTING:执行
     */
    public String getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set WAITING，等待（默认策略）EXECUTING:执行
     * @param DependencyStrategy WAITING，等待（默认策略）EXECUTING:执行
     */
    public void setDependencyStrategy(String DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    /**
     * Get 父任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTask 父任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInnerInfo getParentTask() {
        return this.ParentTask;
    }

    /**
     * Set 父任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTask 父任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTask(TaskInnerInfo ParentTask) {
        this.ParentTask = ParentTask;
    }

    /**
     * Get 子任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SonTask 子任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInnerInfo getSonTask() {
        return this.SonTask;
    }

    /**
     * Set 子任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SonTask 子任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSonTask(TaskInnerInfo SonTask) {
        this.SonTask = SonTask;
    }

    public DependencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyConfig(DependencyConfig source) {
        if (source.DependConfType != null) {
            this.DependConfType = new String(source.DependConfType);
        }
        if (source.SubordinateCyclicType != null) {
            this.SubordinateCyclicType = new String(source.SubordinateCyclicType);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new String(source.DependencyStrategy);
        }
        if (source.ParentTask != null) {
            this.ParentTask = new TaskInnerInfo(source.ParentTask);
        }
        if (source.SonTask != null) {
            this.SonTask = new TaskInnerInfo(source.SonTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DependConfType", this.DependConfType);
        this.setParamSimple(map, prefix + "SubordinateCyclicType", this.SubordinateCyclicType);
        this.setParamSimple(map, prefix + "DependencyStrategy", this.DependencyStrategy);
        this.setParamObj(map, prefix + "ParentTask.", this.ParentTask);
        this.setParamObj(map, prefix + "SonTask.", this.SonTask);

    }
}

