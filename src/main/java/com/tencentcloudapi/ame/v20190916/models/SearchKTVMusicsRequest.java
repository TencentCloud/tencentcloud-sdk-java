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
    * 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的起始偏移量，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序方式。默认按照匹配度排序
<li> Sort.Field 可选 CreateTime</li>
<li> Sort.Order 可选 Desc </li>
<li> 当 KeyWord 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 标签 ID 集合，匹配集合指定所有 ID 。
<li>数组长度限制：10。</li>
    */
    @SerializedName("TagIds")
    @Expose
    private String [] TagIds;

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
     * Get 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000。 
     * @return Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000。
     * @param Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Limit 分页返回的起始偏移量，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Limit 分页返回的起始偏移量，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序方式。默认按照匹配度排序
<li> Sort.Field 可选 CreateTime</li>
<li> Sort.Order 可选 Desc </li>
<li> 当 KeyWord 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li> 
     * @return Sort 排序方式。默认按照匹配度排序
<li> Sort.Field 可选 CreateTime</li>
<li> Sort.Order 可选 Desc </li>
<li> 当 KeyWord 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。默认按照匹配度排序
<li> Sort.Field 可选 CreateTime</li>
<li> Sort.Order 可选 Desc </li>
<li> 当 KeyWord 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     * @param Sort 排序方式。默认按照匹配度排序
<li> Sort.Field 可选 CreateTime</li>
<li> Sort.Order 可选 Desc </li>
<li> 当 KeyWord 不为空时，Sort.Field 字段无效， 搜索结果将以匹配度排序。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 标签 ID 集合，匹配集合指定所有 ID 。
<li>数组长度限制：10。</li> 
     * @return TagIds 标签 ID 集合，匹配集合指定所有 ID 。
<li>数组长度限制：10。</li>
     */
    public String [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set 标签 ID 集合，匹配集合指定所有 ID 。
<li>数组长度限制：10。</li>
     * @param TagIds 标签 ID 集合，匹配集合指定所有 ID 。
<li>数组长度限制：10。</li>
     */
    public void setTagIds(String [] TagIds) {
        this.TagIds = TagIds;
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
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.TagIds != null) {
            this.TagIds = new String[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new String(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

