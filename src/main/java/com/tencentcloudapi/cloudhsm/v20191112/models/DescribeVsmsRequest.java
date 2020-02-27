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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVsmsRequest extends AbstractModel{

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大数量 
     * @return Limit 最大数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大数量
     * @param Limit 最大数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询关键字 
     * @return SearchWord 查询关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 查询关键字
     * @param SearchWord 查询关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
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

