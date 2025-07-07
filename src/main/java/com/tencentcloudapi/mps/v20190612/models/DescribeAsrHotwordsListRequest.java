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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsListRequest extends AbstractModel {

    /**
    * 检索参数，根据热词库 id 查询
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * 检索参数，根据热词库名称查询
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
    * 返回记录条数，默认返回所有热词库
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 热词排序顺序

0：升序（默认）
1：降序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 根据某个字段排序，默认使用创建时间，使用非法字段视为默认情况

- CreateTime：创建时间排序
- UpdateTime：更新时间排序
- Name：热词库名称排序
- WordCount：热词数量排序
- HotwordsId：热词库 id 排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 0 临时热词 1 文件热词
    */
    @SerializedName("Types")
    @Expose
    private Long [] Types;

    /**
     * Get 检索参数，根据热词库 id 查询 
     * @return HotwordsId 检索参数，根据热词库 id 查询
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set 检索参数，根据热词库 id 查询
     * @param HotwordsId 检索参数，根据热词库 id 查询
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get 检索参数，根据热词库名称查询 
     * @return Name 检索参数，根据热词库名称查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检索参数，根据热词库名称查询
     * @param Name 检索参数，根据热词库名称查询
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
     * Get 返回记录条数，默认返回所有热词库 
     * @return Limit 返回记录条数，默认返回所有热词库
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认返回所有热词库
     * @param Limit 返回记录条数，默认返回所有热词库
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 热词排序顺序

0：升序（默认）
1：降序 
     * @return OrderType 热词排序顺序

0：升序（默认）
1：降序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 热词排序顺序

0：升序（默认）
1：降序
     * @param OrderType 热词排序顺序

0：升序（默认）
1：降序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 根据某个字段排序，默认使用创建时间，使用非法字段视为默认情况

- CreateTime：创建时间排序
- UpdateTime：更新时间排序
- Name：热词库名称排序
- WordCount：热词数量排序
- HotwordsId：热词库 id 排序 
     * @return OrderBy 根据某个字段排序，默认使用创建时间，使用非法字段视为默认情况

- CreateTime：创建时间排序
- UpdateTime：更新时间排序
- Name：热词库名称排序
- WordCount：热词数量排序
- HotwordsId：热词库 id 排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 根据某个字段排序，默认使用创建时间，使用非法字段视为默认情况

- CreateTime：创建时间排序
- UpdateTime：更新时间排序
- Name：热词库名称排序
- WordCount：热词数量排序
- HotwordsId：热词库 id 排序
     * @param OrderBy 根据某个字段排序，默认使用创建时间，使用非法字段视为默认情况

- CreateTime：创建时间排序
- UpdateTime：更新时间排序
- Name：热词库名称排序
- WordCount：热词数量排序
- HotwordsId：热词库 id 排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 0 临时热词 1 文件热词 
     * @return Types 0 临时热词 1 文件热词
     */
    public Long [] getTypes() {
        return this.Types;
    }

    /**
     * Set 0 临时热词 1 文件热词
     * @param Types 0 临时热词 1 文件热词
     */
    public void setTypes(Long [] Types) {
        this.Types = Types;
    }

    public DescribeAsrHotwordsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsListRequest(DescribeAsrHotwordsListRequest source) {
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
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Types != null) {
            this.Types = new Long[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new Long(source.Types[i]);
            }
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
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

