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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeSetRsp extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 知识库列表
    */
    @SerializedName("KnowledgeSets")
    @Expose
    private KnowledgeSet [] KnowledgeSets;

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 知识库列表 
     * @return KnowledgeSets 知识库列表
     */
    public KnowledgeSet [] getKnowledgeSets() {
        return this.KnowledgeSets;
    }

    /**
     * Set 知识库列表
     * @param KnowledgeSets 知识库列表
     */
    public void setKnowledgeSets(KnowledgeSet [] KnowledgeSets) {
        this.KnowledgeSets = KnowledgeSets;
    }

    public KnowledgeSetRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSetRsp(KnowledgeSetRsp source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.KnowledgeSets != null) {
            this.KnowledgeSets = new KnowledgeSet[source.KnowledgeSets.length];
            for (int i = 0; i < source.KnowledgeSets.length; i++) {
                this.KnowledgeSets[i] = new KnowledgeSet(source.KnowledgeSets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "KnowledgeSets.", this.KnowledgeSets);

    }
}

