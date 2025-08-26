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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerankRequest extends AbstractModel {

    /**
    * 说明：查询内容
备注：用于匹配的query
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 说明：文档列表
备注：最多60个，Query字段和Docs字段的总长度上限为2000字符
    */
    @SerializedName("Docs")
    @Expose
    private String [] Docs;

    /**
    * 说明：模型名称
备注：仅一个模型可选
默认值：lke-reranker-base
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get 说明：查询内容
备注：用于匹配的query 
     * @return Query 说明：查询内容
备注：用于匹配的query
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 说明：查询内容
备注：用于匹配的query
     * @param Query 说明：查询内容
备注：用于匹配的query
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 说明：文档列表
备注：最多60个，Query字段和Docs字段的总长度上限为2000字符 
     * @return Docs 说明：文档列表
备注：最多60个，Query字段和Docs字段的总长度上限为2000字符
     */
    public String [] getDocs() {
        return this.Docs;
    }

    /**
     * Set 说明：文档列表
备注：最多60个，Query字段和Docs字段的总长度上限为2000字符
     * @param Docs 说明：文档列表
备注：最多60个，Query字段和Docs字段的总长度上限为2000字符
     */
    public void setDocs(String [] Docs) {
        this.Docs = Docs;
    }

    /**
     * Get 说明：模型名称
备注：仅一个模型可选
默认值：lke-reranker-base 
     * @return Model 说明：模型名称
备注：仅一个模型可选
默认值：lke-reranker-base
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 说明：模型名称
备注：仅一个模型可选
默认值：lke-reranker-base
     * @param Model 说明：模型名称
备注：仅一个模型可选
默认值：lke-reranker-base
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Docs != null) {
            this.Docs = new String[source.Docs.length];
            for (int i = 0; i < source.Docs.length; i++) {
                this.Docs[i] = new String(source.Docs[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Docs.", this.Docs);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

