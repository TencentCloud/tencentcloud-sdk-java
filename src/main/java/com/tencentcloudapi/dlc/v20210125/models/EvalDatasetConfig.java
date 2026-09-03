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

public class EvalDatasetConfig extends AbstractModel {

    /**
    * <p>验证集模式：none / split / separate</p>
    */
    @SerializedName("EvalMode")
    @Expose
    private String EvalMode;

    /**
    * <p>自动拆分比例（1-20，即 1%-20%），仅 split 生效</p>
    */
    @SerializedName("EvalSplitRatio")
    @Expose
    private Float EvalSplitRatio;

    /**
    * <p>独立验证数据集 ID（dataset 表），仅 separate 生效；与 Catalog 二选一</p>
    */
    @SerializedName("EvalDatasetId")
    @Expose
    private String EvalDatasetId;

    /**
    * <p>验证数据集名称（dataset 表 name 字段，与 EvalDatasetId 配对）</p>
    */
    @SerializedName("EvalDatasetName")
    @Expose
    private String EvalDatasetName;

    /**
    * <p>原始 Catalog 卷定义 JSON（仅 separate 生效，无数据集 ID 时使用，直接并入顶层 Catalog；与 EvalDatasetId 二选一）</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>验证用单文件名（可选，JSONL/parquet 文件名，位于挂载目录下；仅基于单个文件验证时指定）</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get <p>验证集模式：none / split / separate</p> 
     * @return EvalMode <p>验证集模式：none / split / separate</p>
     */
    public String getEvalMode() {
        return this.EvalMode;
    }

    /**
     * Set <p>验证集模式：none / split / separate</p>
     * @param EvalMode <p>验证集模式：none / split / separate</p>
     */
    public void setEvalMode(String EvalMode) {
        this.EvalMode = EvalMode;
    }

    /**
     * Get <p>自动拆分比例（1-20，即 1%-20%），仅 split 生效</p> 
     * @return EvalSplitRatio <p>自动拆分比例（1-20，即 1%-20%），仅 split 生效</p>
     */
    public Float getEvalSplitRatio() {
        return this.EvalSplitRatio;
    }

    /**
     * Set <p>自动拆分比例（1-20，即 1%-20%），仅 split 生效</p>
     * @param EvalSplitRatio <p>自动拆分比例（1-20，即 1%-20%），仅 split 生效</p>
     */
    public void setEvalSplitRatio(Float EvalSplitRatio) {
        this.EvalSplitRatio = EvalSplitRatio;
    }

    /**
     * Get <p>独立验证数据集 ID（dataset 表），仅 separate 生效；与 Catalog 二选一</p> 
     * @return EvalDatasetId <p>独立验证数据集 ID（dataset 表），仅 separate 生效；与 Catalog 二选一</p>
     */
    public String getEvalDatasetId() {
        return this.EvalDatasetId;
    }

    /**
     * Set <p>独立验证数据集 ID（dataset 表），仅 separate 生效；与 Catalog 二选一</p>
     * @param EvalDatasetId <p>独立验证数据集 ID（dataset 表），仅 separate 生效；与 Catalog 二选一</p>
     */
    public void setEvalDatasetId(String EvalDatasetId) {
        this.EvalDatasetId = EvalDatasetId;
    }

    /**
     * Get <p>验证数据集名称（dataset 表 name 字段，与 EvalDatasetId 配对）</p> 
     * @return EvalDatasetName <p>验证数据集名称（dataset 表 name 字段，与 EvalDatasetId 配对）</p>
     */
    public String getEvalDatasetName() {
        return this.EvalDatasetName;
    }

    /**
     * Set <p>验证数据集名称（dataset 表 name 字段，与 EvalDatasetId 配对）</p>
     * @param EvalDatasetName <p>验证数据集名称（dataset 表 name 字段，与 EvalDatasetId 配对）</p>
     */
    public void setEvalDatasetName(String EvalDatasetName) {
        this.EvalDatasetName = EvalDatasetName;
    }

    /**
     * Get <p>原始 Catalog 卷定义 JSON（仅 separate 生效，无数据集 ID 时使用，直接并入顶层 Catalog；与 EvalDatasetId 二选一）</p> 
     * @return Catalog <p>原始 Catalog 卷定义 JSON（仅 separate 生效，无数据集 ID 时使用，直接并入顶层 Catalog；与 EvalDatasetId 二选一）</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>原始 Catalog 卷定义 JSON（仅 separate 生效，无数据集 ID 时使用，直接并入顶层 Catalog；与 EvalDatasetId 二选一）</p>
     * @param Catalog <p>原始 Catalog 卷定义 JSON（仅 separate 生效，无数据集 ID 时使用，直接并入顶层 Catalog；与 EvalDatasetId 二选一）</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>验证用单文件名（可选，JSONL/parquet 文件名，位于挂载目录下；仅基于单个文件验证时指定）</p> 
     * @return FileName <p>验证用单文件名（可选，JSONL/parquet 文件名，位于挂载目录下；仅基于单个文件验证时指定）</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>验证用单文件名（可选，JSONL/parquet 文件名，位于挂载目录下；仅基于单个文件验证时指定）</p>
     * @param FileName <p>验证用单文件名（可选，JSONL/parquet 文件名，位于挂载目录下；仅基于单个文件验证时指定）</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public EvalDatasetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvalDatasetConfig(EvalDatasetConfig source) {
        if (source.EvalMode != null) {
            this.EvalMode = new String(source.EvalMode);
        }
        if (source.EvalSplitRatio != null) {
            this.EvalSplitRatio = new Float(source.EvalSplitRatio);
        }
        if (source.EvalDatasetId != null) {
            this.EvalDatasetId = new String(source.EvalDatasetId);
        }
        if (source.EvalDatasetName != null) {
            this.EvalDatasetName = new String(source.EvalDatasetName);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvalMode", this.EvalMode);
        this.setParamSimple(map, prefix + "EvalSplitRatio", this.EvalSplitRatio);
        this.setParamSimple(map, prefix + "EvalDatasetId", this.EvalDatasetId);
        this.setParamSimple(map, prefix + "EvalDatasetName", this.EvalDatasetName);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

