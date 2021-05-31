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

public class SearchKTVMusicsRequest extends AbstractModel{

    /**
    * 搜索关键词
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 分页游标
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页页长
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 搜索关键词 
     * @return KeyWord 搜索关键词
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 搜索关键词
     * @param KeyWord 搜索关键词
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 分页游标 
     * @return Offset 分页游标
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页游标
     * @param Offset 分页游标
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页页长 
     * @return Limit 分页页长
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页页长
     * @param Limit 分页页长
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public SearchKTVMusicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchKTVMusicsRequest(SearchKTVMusicsRequest source) {
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

