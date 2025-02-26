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

public class DeleteKnowledgeDocumentSetRequest extends AbstractModel {

    /**
    * 知识库标识
    */
    @SerializedName("CollectionView")
    @Expose
    private String CollectionView;

    /**
    * 删除时制定的条件
    */
    @SerializedName("Query")
    @Expose
    private DocumentQuery Query;

    /**
     * Get 知识库标识 
     * @return CollectionView 知识库标识
     */
    public String getCollectionView() {
        return this.CollectionView;
    }

    /**
     * Set 知识库标识
     * @param CollectionView 知识库标识
     */
    public void setCollectionView(String CollectionView) {
        this.CollectionView = CollectionView;
    }

    /**
     * Get 删除时制定的条件 
     * @return Query 删除时制定的条件
     */
    public DocumentQuery getQuery() {
        return this.Query;
    }

    /**
     * Set 删除时制定的条件
     * @param Query 删除时制定的条件
     */
    public void setQuery(DocumentQuery Query) {
        this.Query = Query;
    }

    public DeleteKnowledgeDocumentSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteKnowledgeDocumentSetRequest(DeleteKnowledgeDocumentSetRequest source) {
        if (source.CollectionView != null) {
            this.CollectionView = new String(source.CollectionView);
        }
        if (source.Query != null) {
            this.Query = new DocumentQuery(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectionView", this.CollectionView);
        this.setParamObj(map, prefix + "Query.", this.Query);

    }
}

