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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalRecordMetadata extends AbstractModel {

    /**
    * 结果的类型。
- `DOC`：文档
- `QA`：问答对
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检索结果的来源。
- `SEMANTIC`：从语义检索中得到的结果
- `FULL_TEXT`：从全文检索中得到的结果
    */
    @SerializedName("ResultSource")
    @Expose
    private String ResultSource;

    /**
    * 切片在文档中的页码，仅部分文档支持
    */
    @SerializedName("ChunkPageNumbers")
    @Expose
    private Long [] ChunkPageNumbers;

    /**
     * Get 结果的类型。
- `DOC`：文档
- `QA`：问答对 
     * @return Type 结果的类型。
- `DOC`：文档
- `QA`：问答对
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 结果的类型。
- `DOC`：文档
- `QA`：问答对
     * @param Type 结果的类型。
- `DOC`：文档
- `QA`：问答对
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 检索结果的来源。
- `SEMANTIC`：从语义检索中得到的结果
- `FULL_TEXT`：从全文检索中得到的结果 
     * @return ResultSource 检索结果的来源。
- `SEMANTIC`：从语义检索中得到的结果
- `FULL_TEXT`：从全文检索中得到的结果
     */
    public String getResultSource() {
        return this.ResultSource;
    }

    /**
     * Set 检索结果的来源。
- `SEMANTIC`：从语义检索中得到的结果
- `FULL_TEXT`：从全文检索中得到的结果
     * @param ResultSource 检索结果的来源。
- `SEMANTIC`：从语义检索中得到的结果
- `FULL_TEXT`：从全文检索中得到的结果
     */
    public void setResultSource(String ResultSource) {
        this.ResultSource = ResultSource;
    }

    /**
     * Get 切片在文档中的页码，仅部分文档支持 
     * @return ChunkPageNumbers 切片在文档中的页码，仅部分文档支持
     */
    public Long [] getChunkPageNumbers() {
        return this.ChunkPageNumbers;
    }

    /**
     * Set 切片在文档中的页码，仅部分文档支持
     * @param ChunkPageNumbers 切片在文档中的页码，仅部分文档支持
     */
    public void setChunkPageNumbers(Long [] ChunkPageNumbers) {
        this.ChunkPageNumbers = ChunkPageNumbers;
    }

    public RetrievalRecordMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalRecordMetadata(RetrievalRecordMetadata source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResultSource != null) {
            this.ResultSource = new String(source.ResultSource);
        }
        if (source.ChunkPageNumbers != null) {
            this.ChunkPageNumbers = new Long[source.ChunkPageNumbers.length];
            for (int i = 0; i < source.ChunkPageNumbers.length; i++) {
                this.ChunkPageNumbers[i] = new Long(source.ChunkPageNumbers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResultSource", this.ResultSource);
        this.setParamArraySimple(map, prefix + "ChunkPageNumbers.", this.ChunkPageNumbers);

    }
}

