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

public class DescribeKnowledgeDocumentSetDetailRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 知识库标识
    */
    @SerializedName("CollectionView")
    @Expose
    private String CollectionView;

    /**
    * 文件名
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String DocumentSetName;

    /**
    * 文件id
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String DocumentSetId;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

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
     * Get 文件名 
     * @return DocumentSetName 文件名
     */
    public String getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 文件名
     * @param DocumentSetName 文件名
     */
    public void setDocumentSetName(String DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 文件id 
     * @return DocumentSetId 文件id
     */
    public String getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 文件id
     * @param DocumentSetId 文件id
     */
    public void setDocumentSetId(String DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    public DescribeKnowledgeDocumentSetDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeDocumentSetDetailRequest(DescribeKnowledgeDocumentSetDetailRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.CollectionView != null) {
            this.CollectionView = new String(source.CollectionView);
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String(source.DocumentSetName);
        }
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String(source.DocumentSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "CollectionView", this.CollectionView);
        this.setParamSimple(map, prefix + "DocumentSetName", this.DocumentSetName);
        this.setParamSimple(map, prefix + "DocumentSetId", this.DocumentSetId);

    }
}

