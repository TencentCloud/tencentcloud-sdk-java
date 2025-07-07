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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebContent extends AbstractModel {

    /**
    * 搜素问题	
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 网页内容	
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 切片索引
    */
    @SerializedName("ChunkIndex")
    @Expose
    private String ChunkIndex;

    /**
    * 分数
    */
    @SerializedName("Score")
    @Expose
    private String Score;

    /**
     * Get 搜素问题	 
     * @return Query 搜素问题	
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 搜素问题	
     * @param Query 搜素问题	
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 链接 
     * @return Url 链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 链接
     * @param Url 链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 网页内容	 
     * @return Content 网页内容	
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 网页内容	
     * @param Content 网页内容	
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 切片索引 
     * @return ChunkIndex 切片索引
     */
    public String getChunkIndex() {
        return this.ChunkIndex;
    }

    /**
     * Set 切片索引
     * @param ChunkIndex 切片索引
     */
    public void setChunkIndex(String ChunkIndex) {
        this.ChunkIndex = ChunkIndex;
    }

    /**
     * Get 分数 
     * @return Score 分数
     */
    public String getScore() {
        return this.Score;
    }

    /**
     * Set 分数
     * @param Score 分数
     */
    public void setScore(String Score) {
        this.Score = Score;
    }

    public WebContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebContent(WebContent source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ChunkIndex != null) {
            this.ChunkIndex = new String(source.ChunkIndex);
        }
        if (source.Score != null) {
            this.Score = new String(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ChunkIndex", this.ChunkIndex);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

