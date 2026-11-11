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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicIndex extends AbstractModel {

    /**
    * <p>键值索引自动配置开关</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>索引的分词符，其中的每个字符代表一个分词符；<br>仅支持英文符号、\n\t\r及转义符\；<br>注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义</p>
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
     * Get <p>键值索引自动配置开关</p> 
     * @return Status <p>键值索引自动配置开关</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>键值索引自动配置开关</p>
     * @param Status <p>键值索引自动配置开关</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>索引的分词符，其中的每个字符代表一个分词符；<br>仅支持英文符号、\n\t\r及转义符\；<br>注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义</p> 
     * @return Tokenizer <p>索引的分词符，其中的每个字符代表一个分词符；<br>仅支持英文符号、\n\t\r及转义符\；<br>注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义</p>
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set <p>索引的分词符，其中的每个字符代表一个分词符；<br>仅支持英文符号、\n\t\r及转义符\；<br>注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义</p>
     * @param Tokenizer <p>索引的分词符，其中的每个字符代表一个分词符；<br>仅支持英文符号、\n\t\r及转义符\；<br>注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义</p>
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    public DynamicIndex() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicIndex(DynamicIndex source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);

    }
}

