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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrieveKnowledgeRealtimeRequest extends AbstractModel {

    /**
    * 知识库ID。
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 用于检索的文本。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 实时文件ID列表。
    */
    @SerializedName("DocIds")
    @Expose
    private String [] DocIds;

    /**
    * 检索方法，默认使用`HYBRID`混合检索。
- `SEMANTIC`：语义检索
- `FULL_TEXT`：全文检索
- `HYBRID`：混合检索
    */
    @SerializedName("RetrievalMethod")
    @Expose
    private String RetrievalMethod;

    /**
    * 检索设置。
    */
    @SerializedName("RetrievalSetting")
    @Expose
    private RetrievalSetting RetrievalSetting;

    /**
     * Get 知识库ID。 
     * @return KnowledgeBaseId 知识库ID。
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库ID。
     * @param KnowledgeBaseId 知识库ID。
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 用于检索的文本。 
     * @return Query 用于检索的文本。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用于检索的文本。
     * @param Query 用于检索的文本。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 实时文件ID列表。 
     * @return DocIds 实时文件ID列表。
     */
    public String [] getDocIds() {
        return this.DocIds;
    }

    /**
     * Set 实时文件ID列表。
     * @param DocIds 实时文件ID列表。
     */
    public void setDocIds(String [] DocIds) {
        this.DocIds = DocIds;
    }

    /**
     * Get 检索方法，默认使用`HYBRID`混合检索。
- `SEMANTIC`：语义检索
- `FULL_TEXT`：全文检索
- `HYBRID`：混合检索 
     * @return RetrievalMethod 检索方法，默认使用`HYBRID`混合检索。
- `SEMANTIC`：语义检索
- `FULL_TEXT`：全文检索
- `HYBRID`：混合检索
     */
    public String getRetrievalMethod() {
        return this.RetrievalMethod;
    }

    /**
     * Set 检索方法，默认使用`HYBRID`混合检索。
- `SEMANTIC`：语义检索
- `FULL_TEXT`：全文检索
- `HYBRID`：混合检索
     * @param RetrievalMethod 检索方法，默认使用`HYBRID`混合检索。
- `SEMANTIC`：语义检索
- `FULL_TEXT`：全文检索
- `HYBRID`：混合检索
     */
    public void setRetrievalMethod(String RetrievalMethod) {
        this.RetrievalMethod = RetrievalMethod;
    }

    /**
     * Get 检索设置。 
     * @return RetrievalSetting 检索设置。
     */
    public RetrievalSetting getRetrievalSetting() {
        return this.RetrievalSetting;
    }

    /**
     * Set 检索设置。
     * @param RetrievalSetting 检索设置。
     */
    public void setRetrievalSetting(RetrievalSetting RetrievalSetting) {
        this.RetrievalSetting = RetrievalSetting;
    }

    public RetrieveKnowledgeRealtimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrieveKnowledgeRealtimeRequest(RetrieveKnowledgeRealtimeRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.DocIds != null) {
            this.DocIds = new String[source.DocIds.length];
            for (int i = 0; i < source.DocIds.length; i++) {
                this.DocIds[i] = new String(source.DocIds[i]);
            }
        }
        if (source.RetrievalMethod != null) {
            this.RetrievalMethod = new String(source.RetrievalMethod);
        }
        if (source.RetrievalSetting != null) {
            this.RetrievalSetting = new RetrievalSetting(source.RetrievalSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "DocIds.", this.DocIds);
        this.setParamSimple(map, prefix + "RetrievalMethod", this.RetrievalMethod);
        this.setParamObj(map, prefix + "RetrievalSetting.", this.RetrievalSetting);

    }
}

