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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);
        this.setParamArraySimple(map, prefix + "Delimiters.", this.Delimiters);

    }
}

