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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVSuggestionsRequest extends AbstractModel{

    /**
    * 联想关键词
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get 联想关键词 
     * @return KeyWord 联想关键词
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 联想关键词
     * @param KeyWord 联想关键词
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public DescribeKTVSuggestionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVSuggestionsRequest(DescribeKTVSuggestionsRequest source) {
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

