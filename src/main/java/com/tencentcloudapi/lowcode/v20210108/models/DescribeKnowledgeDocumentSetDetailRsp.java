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

public class DescribeKnowledgeDocumentSetDetailRsp extends AbstractModel {

    /**
    * 获取的数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 文档信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSet")
    @Expose
    private KnowledgeDocumentSet DocumentSet;

    /**
     * Get 获取的数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 获取的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 获取的数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 获取的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 文档信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSet 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeDocumentSet getDocumentSet() {
        return this.DocumentSet;
    }

    /**
     * Set 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSet 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSet(KnowledgeDocumentSet DocumentSet) {
        this.DocumentSet = DocumentSet;
    }

    public DescribeKnowledgeDocumentSetDetailRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeDocumentSetDetailRsp(DescribeKnowledgeDocumentSetDetailRsp source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DocumentSet != null) {
            this.DocumentSet = new KnowledgeDocumentSet(source.DocumentSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "DocumentSet.", this.DocumentSet);

    }
}

