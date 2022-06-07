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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingResourceGroupsRequest extends AbstractModel{

    /**
    * 资源组类型; 枚举值 TRAIN:训练 INFERENCE:推理
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter.Name: 枚举值: ResourceGroupId (资源组id列表)
                    ResourceGroupName (资源组名称列表)
Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为5，Filter.Values的上限为100
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签过滤
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 偏移量，默认为0；分页查询起始位置，如：Limit为100，第一页Offset为0，第二页OffSet为100....即每页左边为闭区间
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为30;
注意：小于0则默认为20；大于30则默认为30
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 支持模糊查找资源组id和资源组名
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 是否不展示节点列表; 
true: 不展示，false 展示；
默认为false
    */
    @SerializedName("DontShowInstanceSet")
    @Expose
    private Boolean DontShowInstanceSet;

    /**
     * Get 资源组类型; 枚举值 TRAIN:训练 INFERENCE:推理 
     * @return Type 资源组类型; 枚举值 TRAIN:训练 INFERENCE:推理
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源组类型; 枚举值 TRAIN:训练 INFERENCE:推理
     * @param Type 资源组类型; 枚举值 TRAIN:训练 INFERENCE:推理
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter.Name: 枚举值: ResourceGroupId (资源组id列表)
                    ResourceGroupName (资源组名称列表)
Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为5，Filter.Values的上限为100 
     * @return Filters Filter.Name: 枚举值: ResourceGroupId (资源组id列表)
                    ResourceGroupName (资源组名称列表)
Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为5，Filter.Values的上限为100
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.Name: 枚举值: ResourceGroupId (资源组id列表)
                    ResourceGroupName (资源组名称列表)
Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为5，Filter.Values的上限为100
     * @param Filters Filter.Name: 枚举值: ResourceGroupId (资源组id列表)
                    ResourceGroupName (资源组名称列表)
Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询
每次请求的Filters的上限为5，Filter.Values的上限为100
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 标签过滤 
     * @return TagFilters 标签过滤
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤
     * @param TagFilters 标签过滤
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 偏移量，默认为0；分页查询起始位置，如：Limit为100，第一页Offset为0，第二页OffSet为100....即每页左边为闭区间 
     * @return Offset 偏移量，默认为0；分页查询起始位置，如：Limit为100，第一页Offset为0，第二页OffSet为100....即每页左边为闭区间
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0；分页查询起始位置，如：Limit为100，第一页Offset为0，第二页OffSet为100....即每页左边为闭区间
     * @param Offset 偏移量，默认为0；分页查询起始位置，如：Limit为100，第一页Offset为0，第二页OffSet为100....即每页左边为闭区间
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为30;
注意：小于0则默认为20；大于30则默认为30 
     * @return Limit 返回数量，默认为20，最大值为30;
注意：小于0则默认为20；大于30则默认为30
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为30;
注意：小于0则默认为20；大于30则默认为30
     * @param Limit 返回数量，默认为20，最大值为30;
注意：小于0则默认为20；大于30则默认为30
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 支持模糊查找资源组id和资源组名 
     * @return SearchWord 支持模糊查找资源组id和资源组名
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 支持模糊查找资源组id和资源组名
     * @param SearchWord 支持模糊查找资源组id和资源组名
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 是否不展示节点列表; 
true: 不展示，false 展示；
默认为false 
     * @return DontShowInstanceSet 是否不展示节点列表; 
true: 不展示，false 展示；
默认为false
     */
    public Boolean getDontShowInstanceSet() {
        return this.DontShowInstanceSet;
    }

    /**
     * Set 是否不展示节点列表; 
true: 不展示，false 展示；
默认为false
     * @param DontShowInstanceSet 是否不展示节点列表; 
true: 不展示，false 展示；
默认为false
     */
    public void setDontShowInstanceSet(Boolean DontShowInstanceSet) {
        this.DontShowInstanceSet = DontShowInstanceSet;
    }

    public DescribeBillingResourceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingResourceGroupsRequest(DescribeBillingResourceGroupsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
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
        if (source.DontShowInstanceSet != null) {
            this.DontShowInstanceSet = new Boolean(source.DontShowInstanceSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "DontShowInstanceSet", this.DontShowInstanceSet);

    }
}

