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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSecretsRequest extends AbstractModel{

    /**
    * 查询列表的起始位置，以0开始，不设置默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次查询返回的最大数量，0或不设置则使用默认值 20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 根据凭据状态进行过滤，默认为0表示查询全部，1 表示查询Enabed 凭据列表，2表示查询Disabled 凭据列表， 3 表示查询PendingDelete 凭据列表。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 根据凭据名称进行过滤，为空表示不过滤。
    */
    @SerializedName("SearchSecretName")
    @Expose
    private String SearchSecretName;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get 查询列表的起始位置，以0开始，不设置默认为0。 
     * @return Offset 查询列表的起始位置，以0开始，不设置默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询列表的起始位置，以0开始，不设置默认为0。
     * @param Offset 查询列表的起始位置，以0开始，不设置默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次查询返回的最大数量，0或不设置则使用默认值 20。 
     * @return Limit 单次查询返回的最大数量，0或不设置则使用默认值 20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的最大数量，0或不设置则使用默认值 20。
     * @param Limit 单次查询返回的最大数量，0或不设置则使用默认值 20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。 
     * @return OrderType 根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。
     * @param OrderType 根据创建时间的排序方式，0或者不设置则使用降序排序， 1 表示升序排序。
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 根据凭据状态进行过滤，默认为0表示查询全部，1 表示查询Enabed 凭据列表，2表示查询Disabled 凭据列表， 3 表示查询PendingDelete 凭据列表。 
     * @return State 根据凭据状态进行过滤，默认为0表示查询全部，1 表示查询Enabed 凭据列表，2表示查询Disabled 凭据列表， 3 表示查询PendingDelete 凭据列表。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 根据凭据状态进行过滤，默认为0表示查询全部，1 表示查询Enabed 凭据列表，2表示查询Disabled 凭据列表， 3 表示查询PendingDelete 凭据列表。
     * @param State 根据凭据状态进行过滤，默认为0表示查询全部，1 表示查询Enabed 凭据列表，2表示查询Disabled 凭据列表， 3 表示查询PendingDelete 凭据列表。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 根据凭据名称进行过滤，为空表示不过滤。 
     * @return SearchSecretName 根据凭据名称进行过滤，为空表示不过滤。
     */
    public String getSearchSecretName() {
        return this.SearchSecretName;
    }

    /**
     * Set 根据凭据名称进行过滤，为空表示不过滤。
     * @param SearchSecretName 根据凭据名称进行过滤，为空表示不过滤。
     */
    public void setSearchSecretName(String SearchSecretName) {
        this.SearchSecretName = SearchSecretName;
    }

    /**
     * Get 标签过滤条件 
     * @return TagFilters 标签过滤条件
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤条件
     * @param TagFilters 标签过滤条件
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SearchSecretName", this.SearchSecretName);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

