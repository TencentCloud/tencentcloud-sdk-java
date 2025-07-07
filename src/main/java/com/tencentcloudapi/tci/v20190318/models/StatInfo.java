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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatInfo extends AbstractModel {

    /**
    * 词汇库中的单词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 单词出现在该音频中总次数
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 词汇库中的单词 
     * @return Keyword 词汇库中的单词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 词汇库中的单词
     * @param Keyword 词汇库中的单词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 单词出现在该音频中总次数 
     * @return Value 单词出现在该音频中总次数
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 单词出现在该音频中总次数
     * @param Value 单词出现在该音频中总次数
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public StatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatInfo(StatInfo source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

