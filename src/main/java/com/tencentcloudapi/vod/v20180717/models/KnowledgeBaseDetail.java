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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeBaseDetail extends AbstractModel {

    /**
    * <p>知识库ID</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>关联的大模型解析模板</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>入库时间</p>
    */
    @SerializedName("ImportTime")
    @Expose
    private String ImportTime;

    /**
     * Get <p>知识库ID</p> 
     * @return KnowledgeBaseId <p>知识库ID</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>知识库ID</p>
     * @param KnowledgeBaseId <p>知识库ID</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>关联的大模型解析模板</p> 
     * @return Definition <p>关联的大模型解析模板</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>关联的大模型解析模板</p>
     * @param Definition <p>关联的大模型解析模板</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>入库时间</p> 
     * @return ImportTime <p>入库时间</p>
     */
    public String getImportTime() {
        return this.ImportTime;
    }

    /**
     * Set <p>入库时间</p>
     * @param ImportTime <p>入库时间</p>
     */
    public void setImportTime(String ImportTime) {
        this.ImportTime = ImportTime;
    }

    public KnowledgeBaseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBaseDetail(KnowledgeBaseDetail source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ImportTime != null) {
            this.ImportTime = new String(source.ImportTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ImportTime", this.ImportTime);

    }
}

