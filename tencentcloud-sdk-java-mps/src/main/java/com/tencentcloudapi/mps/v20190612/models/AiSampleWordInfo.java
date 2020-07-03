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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSampleWordInfo extends AbstractModel{

    /**
    * 关键词，长度限制：20 个字符。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 关键词标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 关键词，长度限制：20 个字符。 
     * @return Keyword 关键词，长度限制：20 个字符。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词，长度限制：20 个字符。
     * @param Keyword 关键词，长度限制：20 个字符。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 关键词标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li> 
     * @return Tags 关键词标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 关键词标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     * @param Tags 关键词标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

