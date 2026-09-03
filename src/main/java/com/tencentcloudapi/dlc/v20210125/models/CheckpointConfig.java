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

public class CheckpointConfig extends AbstractModel {

    /**
    * <p>Checkpoint 产出存储的 Catalog 配置 JSON（结构同顶层 Catalog）</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>保存策略：steps / epoch / none，默认 steps；GRPO 仅支持 steps / none</p>
    */
    @SerializedName("SaveStrategy")
    @Expose
    private String SaveStrategy;

    /**
    * <p>保存频率（每 N 步或每 N epoch），默认 500</p>
    */
    @SerializedName("SaveFreq")
    @Expose
    private Long SaveFreq;

    /**
    * <p>最大保留数量，0 表示不限制，默认 3</p>
    */
    @SerializedName("MaxKeep")
    @Expose
    private Long MaxKeep;

    /**
    * <p>容器内输出目录回退值（可选；正常场景由 Checkpoint 挂载路径决定，仅在挂载路径为空时生效，默认 /workspace/output/{mode}）</p>
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
     * Get <p>Checkpoint 产出存储的 Catalog 配置 JSON（结构同顶层 Catalog）</p> 
     * @return Catalog <p>Checkpoint 产出存储的 Catalog 配置 JSON（结构同顶层 Catalog）</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>Checkpoint 产出存储的 Catalog 配置 JSON（结构同顶层 Catalog）</p>
     * @param Catalog <p>Checkpoint 产出存储的 Catalog 配置 JSON（结构同顶层 Catalog）</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>保存策略：steps / epoch / none，默认 steps；GRPO 仅支持 steps / none</p> 
     * @return SaveStrategy <p>保存策略：steps / epoch / none，默认 steps；GRPO 仅支持 steps / none</p>
     */
    public String getSaveStrategy() {
        return this.SaveStrategy;
    }

    /**
     * Set <p>保存策略：steps / epoch / none，默认 steps；GRPO 仅支持 steps / none</p>
     * @param SaveStrategy <p>保存策略：steps / epoch / none，默认 steps；GRPO 仅支持 steps / none</p>
     */
    public void setSaveStrategy(String SaveStrategy) {
        this.SaveStrategy = SaveStrategy;
    }

    /**
     * Get <p>保存频率（每 N 步或每 N epoch），默认 500</p> 
     * @return SaveFreq <p>保存频率（每 N 步或每 N epoch），默认 500</p>
     */
    public Long getSaveFreq() {
        return this.SaveFreq;
    }

    /**
     * Set <p>保存频率（每 N 步或每 N epoch），默认 500</p>
     * @param SaveFreq <p>保存频率（每 N 步或每 N epoch），默认 500</p>
     */
    public void setSaveFreq(Long SaveFreq) {
        this.SaveFreq = SaveFreq;
    }

    /**
     * Get <p>最大保留数量，0 表示不限制，默认 3</p> 
     * @return MaxKeep <p>最大保留数量，0 表示不限制，默认 3</p>
     */
    public Long getMaxKeep() {
        return this.MaxKeep;
    }

    /**
     * Set <p>最大保留数量，0 表示不限制，默认 3</p>
     * @param MaxKeep <p>最大保留数量，0 表示不限制，默认 3</p>
     */
    public void setMaxKeep(Long MaxKeep) {
        this.MaxKeep = MaxKeep;
    }

    /**
     * Get <p>容器内输出目录回退值（可选；正常场景由 Checkpoint 挂载路径决定，仅在挂载路径为空时生效，默认 /workspace/output/{mode}）</p> 
     * @return OutputDir <p>容器内输出目录回退值（可选；正常场景由 Checkpoint 挂载路径决定，仅在挂载路径为空时生效，默认 /workspace/output/{mode}）</p>
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>容器内输出目录回退值（可选；正常场景由 Checkpoint 挂载路径决定，仅在挂载路径为空时生效，默认 /workspace/output/{mode}）</p>
     * @param OutputDir <p>容器内输出目录回退值（可选；正常场景由 Checkpoint 挂载路径决定，仅在挂载路径为空时生效，默认 /workspace/output/{mode}）</p>
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    public CheckpointConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckpointConfig(CheckpointConfig source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.SaveStrategy != null) {
            this.SaveStrategy = new String(source.SaveStrategy);
        }
        if (source.SaveFreq != null) {
            this.SaveFreq = new Long(source.SaveFreq);
        }
        if (source.MaxKeep != null) {
            this.MaxKeep = new Long(source.MaxKeep);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "SaveStrategy", this.SaveStrategy);
        this.setParamSimple(map, prefix + "SaveFreq", this.SaveFreq);
        this.setParamSimple(map, prefix + "MaxKeep", this.MaxKeep);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);

    }
}

