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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Chunk extends AbstractModel {

    /**
    * <p>切片ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>切片内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>切片的字数</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>切片概要</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>分段类型</p><p>枚举值：</p><ul><li>0： 自动分段</li><li>1： 新建分段</li></ul>
    */
    @SerializedName("ChunkSource")
    @Expose
    private Long ChunkSource;

    /**
     * Get <p>切片ID</p> 
     * @return Id <p>切片ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>切片ID</p>
     * @param Id <p>切片ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>切片内容</p> 
     * @return Content <p>切片内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>切片内容</p>
     * @param Content <p>切片内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>切片的字数</p> 
     * @return Size <p>切片的字数</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>切片的字数</p>
     * @param Size <p>切片的字数</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>切片概要</p> 
     * @return Summary <p>切片概要</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>切片概要</p>
     * @param Summary <p>切片概要</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>分段类型</p><p>枚举值：</p><ul><li>0： 自动分段</li><li>1： 新建分段</li></ul> 
     * @return ChunkSource <p>分段类型</p><p>枚举值：</p><ul><li>0： 自动分段</li><li>1： 新建分段</li></ul>
     */
    public Long getChunkSource() {
        return this.ChunkSource;
    }

    /**
     * Set <p>分段类型</p><p>枚举值：</p><ul><li>0： 自动分段</li><li>1： 新建分段</li></ul>
     * @param ChunkSource <p>分段类型</p><p>枚举值：</p><ul><li>0： 自动分段</li><li>1： 新建分段</li></ul>
     */
    public void setChunkSource(Long ChunkSource) {
        this.ChunkSource = ChunkSource;
    }

    public Chunk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chunk(Chunk source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.ChunkSource != null) {
            this.ChunkSource = new Long(source.ChunkSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "ChunkSource", this.ChunkSource);

    }
}

