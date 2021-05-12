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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupBindedGatewaysRequest extends AbstractModel{

    /**
    * API 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 翻页查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页查询每页记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get API 分组ID 
     * @return GroupId API 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set API 分组ID
     * @param GroupId API 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 翻页查询偏移量 
     * @return Offset 翻页查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页查询偏移量
     * @param Offset 翻页查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页查询每页记录数 
     * @return Limit 翻页查询每页记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页查询每页记录数
     * @param Limit 翻页查询每页记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeGroupBindedGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupBindedGatewaysRequest(DescribeGroupBindedGatewaysRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

