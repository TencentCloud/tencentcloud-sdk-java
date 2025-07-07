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

public class FullTextInfo extends AbstractModel {

    /**
    * 是否大小写敏感
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * 全文索引的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * 是否包含中文
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
     * Get 是否大小写敏感 
     * @return CaseSensitive 是否大小写敏感
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 是否大小写敏感
     * @param CaseSensitive 是否大小写敏感
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get 全文索引的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义 
     * @return Tokenizer 全文索引的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set 全文索引的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     * @param Tokenizer 全文索引的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get 是否包含中文 
     * @return ContainZH 是否包含中文
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set 是否包含中文
     * @param ContainZH 是否包含中文
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    public FullTextInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FullTextInfo(FullTextInfo source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);

    }
}

