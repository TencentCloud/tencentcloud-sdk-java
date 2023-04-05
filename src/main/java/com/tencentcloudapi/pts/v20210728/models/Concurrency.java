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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Concurrency extends AbstractModel{

    /**
    * 多阶段配置数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stages")
    @Expose
    private Stage [] Stages;

    /**
    * 运行次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IterationCount")
    @Expose
    private Long IterationCount;

    /**
    * 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * 优雅终止任务的等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GracefulStopSeconds")
    @Expose
    private Long GracefulStopSeconds;

    /**
    * 资源数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private Long Resources;

    /**
     * Get 多阶段配置数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stages 多阶段配置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Stage [] getStages() {
        return this.Stages;
    }

    /**
     * Set 多阶段配置数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stages 多阶段配置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStages(Stage [] Stages) {
        this.Stages = Stages;
    }

    /**
     * Get 运行次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IterationCount 运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIterationCount() {
        return this.IterationCount;
    }

    /**
     * Set 运行次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IterationCount 运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIterationCount(Long IterationCount) {
        this.IterationCount = IterationCount;
    }

    /**
     * Get 最大RPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestsPerSecond 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestsPerSecond 最大RPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get 优雅终止任务的等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GracefulStopSeconds 优雅终止任务的等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGracefulStopSeconds() {
        return this.GracefulStopSeconds;
    }

    /**
     * Set 优雅终止任务的等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param GracefulStopSeconds 优雅终止任务的等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGracefulStopSeconds(Long GracefulStopSeconds) {
        this.GracefulStopSeconds = GracefulStopSeconds;
    }

    /**
     * Get 资源数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 资源数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResources() {
        return this.Resources;
    }

    /**
     * Set 资源数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 资源数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(Long Resources) {
        this.Resources = Resources;
    }

    public Concurrency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Concurrency(Concurrency source) {
        if (source.Stages != null) {
            this.Stages = new Stage[source.Stages.length];
            for (int i = 0; i < source.Stages.length; i++) {
                this.Stages[i] = new Stage(source.Stages[i]);
            }
        }
        if (source.IterationCount != null) {
            this.IterationCount = new Long(source.IterationCount);
        }
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.GracefulStopSeconds != null) {
            this.GracefulStopSeconds = new Long(source.GracefulStopSeconds);
        }
        if (source.Resources != null) {
            this.Resources = new Long(source.Resources);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Stages.", this.Stages);
        this.setParamSimple(map, prefix + "IterationCount", this.IterationCount);
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "GracefulStopSeconds", this.GracefulStopSeconds);
        this.setParamSimple(map, prefix + "Resources", this.Resources);

    }
}

