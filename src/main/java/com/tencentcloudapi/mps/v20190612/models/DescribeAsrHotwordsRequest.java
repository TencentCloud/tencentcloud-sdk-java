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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsRequest extends AbstractModel {

    /**
    * 需要查询的热词库 id
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * 热词库名称，
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页偏移量，默认值：0。

    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 热词排序字段，目前可选值为

- Default：默认文件中的顺序
- Weight：权重排序
- Lexical：热词文本排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 热词排序顺序 0：升序（默认） 1：降序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
     * Get 需要查询的热词库 id
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name** 
     * @return HotwordsId 需要查询的热词库 id
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set 需要查询的热词库 id
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     * @param HotwordsId 需要查询的热词库 id
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get 热词库名称，
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name** 
     * @return Name 热词库名称，
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词库名称，
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     * @param Name 热词库名称，
**注意：HotwordsId 与 Name 必须选择填写一个，如果同时填写，HotwordsId 优先级高于 Name**
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 热词排序字段，目前可选值为

- Default：默认文件中的顺序
- Weight：权重排序
- Lexical：热词文本排序 
     * @return OrderBy 热词排序字段，目前可选值为

- Default：默认文件中的顺序
- Weight：权重排序
- Lexical：热词文本排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 热词排序字段，目前可选值为

- Default：默认文件中的顺序
- Weight：权重排序
- Lexical：热词文本排序
     * @param OrderBy 热词排序字段，目前可选值为

- Default：默认文件中的顺序
- Weight：权重排序
- Lexical：热词文本排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 热词排序顺序 0：升序（默认） 1：降序 
     * @return OrderType 热词排序顺序 0：升序（默认） 1：降序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 热词排序顺序 0：升序（默认） 1：降序
     * @param OrderType 热词排序顺序 0：升序（默认） 1：降序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeAsrHotwordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsRequest(DescribeAsrHotwordsRequest source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

