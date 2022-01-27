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

public class DescribeKTVSingersRequest extends AbstractModel{

    /**
    * 歌手id集合，精确匹配歌手id
<li> 数组长度限制10</li>
    */
    @SerializedName("SingerIds")
    @Expose
    private String [] SingerIds;

    /**
    * 歌手性别集合，不传为全部，精确匹配歌手性别类型，
<li>数组长度限制1</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回性别分类信息列表中，分类英文名</li>
    */
    @SerializedName("Genders")
    @Expose
    private String [] Genders;

    /**
    * 歌手区域集合，不传为全部，精确匹配歌手区域
<li>数组长度限制10</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回的区域分类信息列表中，分类英文名</li>
    */
    @SerializedName("Areas")
    @Expose
    private String [] Areas;

    /**
    * 排序方式。默认按照播放数倒序
<li> Sort.Field 可选 PlayCount。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 歌手id集合，精确匹配歌手id
<li> 数组长度限制10</li> 
     * @return SingerIds 歌手id集合，精确匹配歌手id
<li> 数组长度限制10</li>
     */
    public String [] getSingerIds() {
        return this.SingerIds;
    }

    /**
     * Set 歌手id集合，精确匹配歌手id
<li> 数组长度限制10</li>
     * @param SingerIds 歌手id集合，精确匹配歌手id
<li> 数组长度限制10</li>
     */
    public void setSingerIds(String [] SingerIds) {
        this.SingerIds = SingerIds;
    }

    /**
     * Get 歌手性别集合，不传为全部，精确匹配歌手性别类型，
<li>数组长度限制1</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回性别分类信息列表中，分类英文名</li> 
     * @return Genders 歌手性别集合，不传为全部，精确匹配歌手性别类型，
<li>数组长度限制1</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回性别分类信息列表中，分类英文名</li>
     */
    public String [] getGenders() {
        return this.Genders;
    }

    /**
     * Set 歌手性别集合，不传为全部，精确匹配歌手性别类型，
<li>数组长度限制1</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回性别分类信息列表中，分类英文名</li>
     * @param Genders 歌手性别集合，不传为全部，精确匹配歌手性别类型，
<li>数组长度限制1</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回性别分类信息列表中，分类英文名</li>
     */
    public void setGenders(String [] Genders) {
        this.Genders = Genders;
    }

    /**
     * Get 歌手区域集合，不传为全部，精确匹配歌手区域
<li>数组长度限制10</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回的区域分类信息列表中，分类英文名</li> 
     * @return Areas 歌手区域集合，不传为全部，精确匹配歌手区域
<li>数组长度限制10</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回的区域分类信息列表中，分类英文名</li>
     */
    public String [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 歌手区域集合，不传为全部，精确匹配歌手区域
<li>数组长度限制10</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回的区域分类信息列表中，分类英文名</li>
     * @param Areas 歌手区域集合，不传为全部，精确匹配歌手区域
<li>数组长度限制10</li>
<li>取值范围：直播互动曲库歌手分类信息接口，返回的区域分类信息列表中，分类英文名</li>
     */
    public void setAreas(String [] Areas) {
        this.Areas = Areas;
    }

    /**
     * Get 排序方式。默认按照播放数倒序
<li> Sort.Field 可选 PlayCount。</li> 
     * @return Sort 排序方式。默认按照播放数倒序
<li> Sort.Field 可选 PlayCount。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。默认按照播放数倒序
<li> Sort.Field 可选 PlayCount。</li>
     * @param Sort 排序方式。默认按照播放数倒序
<li> Sort.Field 可选 PlayCount。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeKTVSingersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVSingersRequest(DescribeKTVSingersRequest source) {
        if (source.SingerIds != null) {
            this.SingerIds = new String[source.SingerIds.length];
            for (int i = 0; i < source.SingerIds.length; i++) {
                this.SingerIds[i] = new String(source.SingerIds[i]);
            }
        }
        if (source.Genders != null) {
            this.Genders = new String[source.Genders.length];
            for (int i = 0; i < source.Genders.length; i++) {
                this.Genders[i] = new String(source.Genders[i]);
            }
        }
        if (source.Areas != null) {
            this.Areas = new String[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new String(source.Areas[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
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
        this.setParamArraySimple(map, prefix + "SingerIds.", this.SingerIds);
        this.setParamArraySimple(map, prefix + "Genders.", this.Genders);
        this.setParamArraySimple(map, prefix + "Areas.", this.Areas);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

