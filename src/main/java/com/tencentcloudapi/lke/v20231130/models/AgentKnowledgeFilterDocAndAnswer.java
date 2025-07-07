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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentKnowledgeFilterDocAndAnswer extends AbstractModel {

    /**
    * 文档ID列表
    */
    @SerializedName("DocBizIds")
    @Expose
    private String [] DocBizIds;

    /**
    * 问答
    */
    @SerializedName("AllQa")
    @Expose
    private Boolean AllQa;

    /**
     * Get 文档ID列表 
     * @return DocBizIds 文档ID列表
     */
    public String [] getDocBizIds() {
        return this.DocBizIds;
    }

    /**
     * Set 文档ID列表
     * @param DocBizIds 文档ID列表
     */
    public void setDocBizIds(String [] DocBizIds) {
        this.DocBizIds = DocBizIds;
    }

    /**
     * Get 问答 
     * @return AllQa 问答
     */
    public Boolean getAllQa() {
        return this.AllQa;
    }

    /**
     * Set 问答
     * @param AllQa 问答
     */
    public void setAllQa(Boolean AllQa) {
        this.AllQa = AllQa;
    }

    public AgentKnowledgeFilterDocAndAnswer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentKnowledgeFilterDocAndAnswer(AgentKnowledgeFilterDocAndAnswer source) {
        if (source.DocBizIds != null) {
            this.DocBizIds = new String[source.DocBizIds.length];
            for (int i = 0; i < source.DocBizIds.length; i++) {
                this.DocBizIds[i] = new String(source.DocBizIds[i]);
            }
        }
        if (source.AllQa != null) {
            this.AllQa = new Boolean(source.AllQa);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DocBizIds.", this.DocBizIds);
        this.setParamSimple(map, prefix + "AllQa", this.AllQa);

    }
}

