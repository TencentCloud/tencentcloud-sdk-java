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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalRecord extends AbstractModel {

    /**
    * 检索结果的元数据
    */
    @SerializedName("Metadata")
    @Expose
    private RetrievalRecordMetadata Metadata;

    /**
    * 检索到的标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 检索到的内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 检索结果的元数据 
     * @return Metadata 检索结果的元数据
     */
    public RetrievalRecordMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 检索结果的元数据
     * @param Metadata 检索结果的元数据
     */
    public void setMetadata(RetrievalRecordMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 检索到的标题 
     * @return Title 检索到的标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 检索到的标题
     * @param Title 检索到的标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 检索到的内容 
     * @return Content 检索到的内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 检索到的内容
     * @param Content 检索到的内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public RetrievalRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalRecord(RetrievalRecord source) {
        if (source.Metadata != null) {
            this.Metadata = new RetrievalRecordMetadata(source.Metadata);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

