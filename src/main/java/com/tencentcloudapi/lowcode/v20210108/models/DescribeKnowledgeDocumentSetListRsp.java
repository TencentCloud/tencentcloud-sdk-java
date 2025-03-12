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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKnowledgeDocumentSetListRsp extends AbstractModel {

    /**
    * 文件集
    */
    @SerializedName("DocumentSets")
    @Expose
    private QureyKnowledgeDocumentSet [] DocumentSets;

    /**
    * 条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 文件集 
     * @return DocumentSets 文件集
     */
    public QureyKnowledgeDocumentSet [] getDocumentSets() {
        return this.DocumentSets;
    }

    /**
     * Set 文件集
     * @param DocumentSets 文件集
     */
    public void setDocumentSets(QureyKnowledgeDocumentSet [] DocumentSets) {
        this.DocumentSets = DocumentSets;
    }

    /**
     * Get 条数 
     * @return Count 条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 条数
     * @param Count 条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DescribeKnowledgeDocumentSetListRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeDocumentSetListRsp(DescribeKnowledgeDocumentSetListRsp source) {
        if (source.DocumentSets != null) {
            this.DocumentSets = new QureyKnowledgeDocumentSet[source.DocumentSets.length];
            for (int i = 0; i < source.DocumentSets.length; i++) {
                this.DocumentSets[i] = new QureyKnowledgeDocumentSet(source.DocumentSets[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DocumentSets.", this.DocumentSets);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

