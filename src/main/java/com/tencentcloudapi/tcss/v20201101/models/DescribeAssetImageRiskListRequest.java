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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRiskListRequest extends AbstractModel {

    /**
    * 镜像id
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Level- String - 是否必填：否 - 风险级别 1,2,3,4，</li>
<li>Behavior - String - 是否必填：否 - 风险行为 1,2,3,4</li>
<li>Type - String - 是否必填：否 - 风险类型  1,2,</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 镜像id 
     * @return ImageID 镜像id
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像id
     * @param ImageID 镜像id
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Level- String - 是否必填：否 - 风险级别 1,2,3,4，</li>
<li>Behavior - String - 是否必填：否 - 风险行为 1,2,3,4</li>
<li>Type - String - 是否必填：否 - 风险类型  1,2,</li> 
     * @return Filters 过滤条件。
<li>Level- String - 是否必填：否 - 风险级别 1,2,3,4，</li>
<li>Behavior - String - 是否必填：否 - 风险行为 1,2,3,4</li>
<li>Type - String - 是否必填：否 - 风险类型  1,2,</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Level- String - 是否必填：否 - 风险级别 1,2,3,4，</li>
<li>Behavior - String - 是否必填：否 - 风险行为 1,2,3,4</li>
<li>Type - String - 是否必填：否 - 风险类型  1,2,</li>
     * @param Filters 过滤条件。
<li>Level- String - 是否必填：否 - 风险级别 1,2,3,4，</li>
<li>Behavior - String - 是否必填：否 - 风险行为 1,2,3,4</li>
<li>Type - String - 是否必填：否 - 风险类型  1,2,</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAssetImageRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRiskListRequest(DescribeAssetImageRiskListRequest source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

