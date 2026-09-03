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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecommendedAdvancedParams extends AbstractModel {

    /**
    * <p>是否启用 trust_remote_code</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRemoteCode")
    @Expose
    private Boolean EnableRemoteCode;

    /**
    * <p>GPU 显存利用率（百分比，例如 90 表示 90%）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuMemoryUtilization")
    @Expose
    private Long GpuMemoryUtilization;

    /**
    * <p>Tensor 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TensorParallelSize")
    @Expose
    private Long TensorParallelSize;

    /**
    * <p>Pipeline 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PipelineParallelSize")
    @Expose
    private Long PipelineParallelSize;

    /**
    * <p>Data 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataParallelSize")
    @Expose
    private Long DataParallelSize;

    /**
    * <p>推理引擎参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineArgs")
    @Expose
    private RecommendedKeyValue [] EngineArgs;

    /**
    * <p>环境变量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvVars")
    @Expose
    private RecommendedKeyValue [] EnvVars;

    /**
    * <p>Ray Actor Options 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RayOptions")
    @Expose
    private RecommendedKeyValue [] RayOptions;

    /**
     * Get <p>是否启用 trust_remote_code</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRemoteCode <p>是否启用 trust_remote_code</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRemoteCode() {
        return this.EnableRemoteCode;
    }

    /**
     * Set <p>是否启用 trust_remote_code</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRemoteCode <p>是否启用 trust_remote_code</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRemoteCode(Boolean EnableRemoteCode) {
        this.EnableRemoteCode = EnableRemoteCode;
    }

    /**
     * Get <p>GPU 显存利用率（百分比，例如 90 表示 90%）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuMemoryUtilization <p>GPU 显存利用率（百分比，例如 90 表示 90%）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuMemoryUtilization() {
        return this.GpuMemoryUtilization;
    }

    /**
     * Set <p>GPU 显存利用率（百分比，例如 90 表示 90%）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuMemoryUtilization <p>GPU 显存利用率（百分比，例如 90 表示 90%）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuMemoryUtilization(Long GpuMemoryUtilization) {
        this.GpuMemoryUtilization = GpuMemoryUtilization;
    }

    /**
     * Get <p>Tensor 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TensorParallelSize <p>Tensor 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTensorParallelSize() {
        return this.TensorParallelSize;
    }

    /**
     * Set <p>Tensor 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TensorParallelSize <p>Tensor 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTensorParallelSize(Long TensorParallelSize) {
        this.TensorParallelSize = TensorParallelSize;
    }

    /**
     * Get <p>Pipeline 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PipelineParallelSize <p>Pipeline 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPipelineParallelSize() {
        return this.PipelineParallelSize;
    }

    /**
     * Set <p>Pipeline 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PipelineParallelSize <p>Pipeline 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPipelineParallelSize(Long PipelineParallelSize) {
        this.PipelineParallelSize = PipelineParallelSize;
    }

    /**
     * Get <p>Data 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataParallelSize <p>Data 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataParallelSize() {
        return this.DataParallelSize;
    }

    /**
     * Set <p>Data 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataParallelSize <p>Data 并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataParallelSize(Long DataParallelSize) {
        this.DataParallelSize = DataParallelSize;
    }

    /**
     * Get <p>推理引擎参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineArgs <p>推理引擎参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecommendedKeyValue [] getEngineArgs() {
        return this.EngineArgs;
    }

    /**
     * Set <p>推理引擎参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineArgs <p>推理引擎参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineArgs(RecommendedKeyValue [] EngineArgs) {
        this.EngineArgs = EngineArgs;
    }

    /**
     * Get <p>环境变量列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvVars <p>环境变量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecommendedKeyValue [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvVars <p>环境变量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvVars(RecommendedKeyValue [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>Ray Actor Options 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RayOptions <p>Ray Actor Options 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecommendedKeyValue [] getRayOptions() {
        return this.RayOptions;
    }

    /**
     * Set <p>Ray Actor Options 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RayOptions <p>Ray Actor Options 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRayOptions(RecommendedKeyValue [] RayOptions) {
        this.RayOptions = RayOptions;
    }

    public RecommendedAdvancedParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecommendedAdvancedParams(RecommendedAdvancedParams source) {
        if (source.EnableRemoteCode != null) {
            this.EnableRemoteCode = new Boolean(source.EnableRemoteCode);
        }
        if (source.GpuMemoryUtilization != null) {
            this.GpuMemoryUtilization = new Long(source.GpuMemoryUtilization);
        }
        if (source.TensorParallelSize != null) {
            this.TensorParallelSize = new Long(source.TensorParallelSize);
        }
        if (source.PipelineParallelSize != null) {
            this.PipelineParallelSize = new Long(source.PipelineParallelSize);
        }
        if (source.DataParallelSize != null) {
            this.DataParallelSize = new Long(source.DataParallelSize);
        }
        if (source.EngineArgs != null) {
            this.EngineArgs = new RecommendedKeyValue[source.EngineArgs.length];
            for (int i = 0; i < source.EngineArgs.length; i++) {
                this.EngineArgs[i] = new RecommendedKeyValue(source.EngineArgs[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new RecommendedKeyValue[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new RecommendedKeyValue(source.EnvVars[i]);
            }
        }
        if (source.RayOptions != null) {
            this.RayOptions = new RecommendedKeyValue[source.RayOptions.length];
            for (int i = 0; i < source.RayOptions.length; i++) {
                this.RayOptions[i] = new RecommendedKeyValue(source.RayOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRemoteCode", this.EnableRemoteCode);
        this.setParamSimple(map, prefix + "GpuMemoryUtilization", this.GpuMemoryUtilization);
        this.setParamSimple(map, prefix + "TensorParallelSize", this.TensorParallelSize);
        this.setParamSimple(map, prefix + "PipelineParallelSize", this.PipelineParallelSize);
        this.setParamSimple(map, prefix + "DataParallelSize", this.DataParallelSize);
        this.setParamArrayObj(map, prefix + "EngineArgs.", this.EngineArgs);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamArrayObj(map, prefix + "RayOptions.", this.RayOptions);

    }
}

