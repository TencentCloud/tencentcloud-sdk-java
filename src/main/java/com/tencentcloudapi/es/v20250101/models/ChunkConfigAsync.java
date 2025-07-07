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

public class ChunkConfigAsync extends AbstractModel {

    /**
    * 最大分片长度
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

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

    public ChunkConfigAsync() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkConfigAsync(ChunkConfigAsync source) {
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);

    }
}

