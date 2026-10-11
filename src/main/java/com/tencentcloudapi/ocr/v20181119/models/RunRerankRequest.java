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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerankRequest extends AbstractModel {

    /**
    * <p>选择模型。<br>0：Rerank-2b<br>1：Rerank-0.6b</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>查询内容。用于匹配的query，即用户检索意图。</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>文档内容列表。</p>
    */
    @SerializedName("Docs")
    @Expose
    private String [] Docs;

    /**
     * Get <p>选择模型。<br>0：Rerank-2b<br>1：Rerank-0.6b</p> 
     * @return Model <p>选择模型。<br>0：Rerank-2b<br>1：Rerank-0.6b</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>选择模型。<br>0：Rerank-2b<br>1：Rerank-0.6b</p>
     * @param Model <p>选择模型。<br>0：Rerank-2b<br>1：Rerank-0.6b</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>查询内容。用于匹配的query，即用户检索意图。</p> 
     * @return Query <p>查询内容。用于匹配的query，即用户检索意图。</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询内容。用于匹配的query，即用户检索意图。</p>
     * @param Query <p>查询内容。用于匹配的query，即用户检索意图。</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>文档内容列表。</p> 
     * @return Docs <p>文档内容列表。</p>
     */
    public String [] getDocs() {
        return this.Docs;
    }

    /**
     * Set <p>文档内容列表。</p>
     * @param Docs <p>文档内容列表。</p>
     */
    public void setDocs(String [] Docs) {
        this.Docs = Docs;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Docs != null) {
            this.Docs = new String[source.Docs.length];
            for (int i = 0; i < source.Docs.length; i++) {
                this.Docs[i] = new String(source.Docs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Docs.", this.Docs);

    }
}

