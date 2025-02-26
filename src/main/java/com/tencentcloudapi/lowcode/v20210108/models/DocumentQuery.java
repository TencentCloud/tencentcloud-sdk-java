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

public class DocumentQuery extends AbstractModel {

    /**
    * 文件ids
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String [] DocumentSetId;

    /**
    * 文件名集合
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String [] DocumentSetName;

    /**
    * 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get 文件ids 
     * @return DocumentSetId 文件ids
     */
    public String [] getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 文件ids
     * @param DocumentSetId 文件ids
     */
    public void setDocumentSetId(String [] DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    /**
     * Get 文件名集合 
     * @return DocumentSetName 文件名集合
     */
    public String [] getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 文件名集合
     * @param DocumentSetName 文件名集合
     */
    public void setDocumentSetName(String [] DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式 
     * @return Filter 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式
     * @param Filter 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public DocumentQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentQuery(DocumentQuery source) {
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String[source.DocumentSetId.length];
            for (int i = 0; i < source.DocumentSetId.length; i++) {
                this.DocumentSetId[i] = new String(source.DocumentSetId[i]);
            }
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String[source.DocumentSetName.length];
            for (int i = 0; i < source.DocumentSetName.length; i++) {
                this.DocumentSetName[i] = new String(source.DocumentSetName[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DocumentSetId.", this.DocumentSetId);
        this.setParamArraySimple(map, prefix + "DocumentSetName.", this.DocumentSetName);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

