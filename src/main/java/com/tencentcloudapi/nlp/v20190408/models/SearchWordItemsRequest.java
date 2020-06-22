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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchWordItemsRequest extends AbstractModel{

    /**
    * 待检索的词条集合。
    */
    @SerializedName("WordItems")
    @Expose
    private WordItem [] WordItems;

    /**
    * 自定义词库ID。
    */
    @SerializedName("DictId")
    @Expose
    private String DictId;

    /**
     * Get 待检索的词条集合。 
     * @return WordItems 待检索的词条集合。
     */
    public WordItem [] getWordItems() {
        return this.WordItems;
    }

    /**
     * Set 待检索的词条集合。
     * @param WordItems 待检索的词条集合。
     */
    public void setWordItems(WordItem [] WordItems) {
        this.WordItems = WordItems;
    }

    /**
     * Get 自定义词库ID。 
     * @return DictId 自定义词库ID。
     */
    public String getDictId() {
        return this.DictId;
    }

    /**
     * Set 自定义词库ID。
     * @param DictId 自定义词库ID。
     */
    public void setDictId(String DictId) {
        this.DictId = DictId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WordItems.", this.WordItems);
        this.setParamSimple(map, prefix + "DictId", this.DictId);

    }
}

