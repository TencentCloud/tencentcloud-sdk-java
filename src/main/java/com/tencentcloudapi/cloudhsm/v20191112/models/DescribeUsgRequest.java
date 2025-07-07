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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsgRequest extends AbstractModel {

    /**
    * 偏移量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，支持安全组id
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 偏移量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。 
     * @return Offset 偏移量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     * @param Offset 偏移量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。 
     * @return Limit 返回量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     * @param Limit 返回量，当Offset和Limit均为0时将一次性返回用户所有的安全组列表。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，支持安全组id 
     * @return SearchWord 过滤条件，支持安全组id
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 过滤条件，支持安全组id
     * @param SearchWord 过滤条件，支持安全组id
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeUsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsgRequest(DescribeUsgRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

