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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicsRequest extends AbstractModel{

    /**
    * 查询值
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 本次查询的偏移位置，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本次返回结果的最大个数，默认为50，最大值为50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 查询值 
     * @return SearchWord 查询值
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 查询值
     * @param SearchWord 查询值
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 本次查询的偏移位置，默认为0 
     * @return Offset 本次查询的偏移位置，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 本次查询的偏移位置，默认为0
     * @param Offset 本次查询的偏移位置，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本次返回结果的最大个数，默认为50，最大值为50 
     * @return Limit 本次返回结果的最大个数，默认为50，最大值为50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次返回结果的最大个数，默认为50，最大值为50
     * @param Limit 本次返回结果的最大个数，默认为50，最大值为50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDatahubTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicsRequest(DescribeDatahubTopicsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
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
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

