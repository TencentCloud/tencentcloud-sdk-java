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

public class DatasetMount extends AbstractModel {

    /**
    * <p>数据集ID</p>
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * <p>数据集名称</p>
    */
    @SerializedName("DatasetName")
    @Expose
    private String DatasetName;

    /**
    * <p>挂载信息</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>验证集信息</p>
    */
    @SerializedName("Eval")
    @Expose
    private EvalDatasetConfig Eval;

    /**
    * <p>数据集为单个文件时，若需挂载单个文件，需提供文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get <p>数据集ID</p> 
     * @return DatasetId <p>数据集ID</p>
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set <p>数据集ID</p>
     * @param DatasetId <p>数据集ID</p>
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get <p>数据集名称</p> 
     * @return DatasetName <p>数据集名称</p>
     */
    public String getDatasetName() {
        return this.DatasetName;
    }

    /**
     * Set <p>数据集名称</p>
     * @param DatasetName <p>数据集名称</p>
     */
    public void setDatasetName(String DatasetName) {
        this.DatasetName = DatasetName;
    }

    /**
     * Get <p>挂载信息</p> 
     * @return Catalog <p>挂载信息</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>挂载信息</p>
     * @param Catalog <p>挂载信息</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>验证集信息</p> 
     * @return Eval <p>验证集信息</p>
     */
    public EvalDatasetConfig getEval() {
        return this.Eval;
    }

    /**
     * Set <p>验证集信息</p>
     * @param Eval <p>验证集信息</p>
     */
    public void setEval(EvalDatasetConfig Eval) {
        this.Eval = Eval;
    }

    /**
     * Get <p>数据集为单个文件时，若需挂载单个文件，需提供文件名</p> 
     * @return FileName <p>数据集为单个文件时，若需挂载单个文件，需提供文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>数据集为单个文件时，若需挂载单个文件，需提供文件名</p>
     * @param FileName <p>数据集为单个文件时，若需挂载单个文件，需提供文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public DatasetMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasetMount(DatasetMount source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.DatasetName != null) {
            this.DatasetName = new String(source.DatasetName);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Eval != null) {
            this.Eval = new EvalDatasetConfig(source.Eval);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "DatasetName", this.DatasetName);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamObj(map, prefix + "Eval.", this.Eval);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

