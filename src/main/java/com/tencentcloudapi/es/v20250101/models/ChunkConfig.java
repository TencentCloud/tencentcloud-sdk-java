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

public class ChunkConfig extends AbstractModel {

    /**
    * 最大分片长度
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
    * 分隔符列表
    */
    @SerializedName("Delimiters")
    @Expose
    private String [] Delimiters;

    /**
    * 相邻切片重合字符数，需要小于分片长度
    */
    @SerializedName("ChunkOverlap")
    @Expose
    private Long ChunkOverlap;

    /**
     * Get 最大分片长度 
     * @return MaxChunkSize 最大分片长度
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set 最大分片长度
     * @param MaxChunkSize 最大分片长度
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    /**
     * Get 分隔符列表 
     * @return Delimiters 分隔符列表
     */
    public String [] getDelimiters() {
        return this.Delimiters;
    }

    /**
     * Set 分隔符列表
     * @param Delimiters 分隔符列表
     */
    public void setDelimiters(String [] Delimiters) {
        this.Delimiters = Delimiters;
    }

    /**
     * Get 相邻切片重合字符数，需要小于分片长度 
     * @return ChunkOverlap 相邻切片重合字符数，需要小于分片长度
     */
    public Long getChunkOverlap() {
        return this.ChunkOverlap;
    }

    /**
     * Set 相邻切片重合字符数，需要小于分片长度
     * @param ChunkOverlap 相邻切片重合字符数，需要小于分片长度
     */
    public void setChunkOverlap(Long ChunkOverlap) {
        this.ChunkOverlap = ChunkOverlap;
    }

    public ChunkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkConfig(ChunkConfig source) {
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
        if (source.Delimiters != null) {
            this.Delimiters = new String[source.Delimiters.length];
            for (int i = 0; i < source.Delimiters.length; i++) {
                this.Delimiters[i] = new String(source.Delimiters[i]);
            }
        }
        if (source.ChunkOverlap != null) {
            this.ChunkOverlap = new Long(source.ChunkOverlap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);
        this.setParamArraySimple(map, prefix + "Delimiters.", this.Delimiters);
        this.setParamSimple(map, prefix + "ChunkOverlap", this.ChunkOverlap);

    }
}

