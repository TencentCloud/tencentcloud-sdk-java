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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageComponentListRequest extends AbstractModel{

    /**
    * 镜像ID
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
<li>ComponentName- String - 是否必填：否 - 镜像组件名称</li><li>ComponentVersion- String - 是否必填：否 - 镜像组件版本</li><li>ComponentType- String - 是否必填：否 - 镜像组件类型</li><li>VulLevel- String - 是否必填：否 - 漏洞威胁等级</li><li>HasVul- String - 是否必填：否 -是否有漏洞；true：是，false，否；不传或ALL ：全部</li>
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
    * 排序方式desc ，asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
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
<li>ComponentName- String - 是否必填：否 - 镜像组件名称</li><li>ComponentVersion- String - 是否必填：否 - 镜像组件版本</li><li>ComponentType- String - 是否必填：否 - 镜像组件类型</li><li>VulLevel- String - 是否必填：否 - 漏洞威胁等级</li><li>HasVul- String - 是否必填：否 -是否有漏洞；true：是，false，否；不传或ALL ：全部</li> 
     * @return Filters 过滤条件。
<li>ComponentName- String - 是否必填：否 - 镜像组件名称</li><li>ComponentVersion- String - 是否必填：否 - 镜像组件版本</li><li>ComponentType- String - 是否必填：否 - 镜像组件类型</li><li>VulLevel- String - 是否必填：否 - 漏洞威胁等级</li><li>HasVul- String - 是否必填：否 -是否有漏洞；true：是，false，否；不传或ALL ：全部</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>ComponentName- String - 是否必填：否 - 镜像组件名称</li><li>ComponentVersion- String - 是否必填：否 - 镜像组件版本</li><li>ComponentType- String - 是否必填：否 - 镜像组件类型</li><li>VulLevel- String - 是否必填：否 - 漏洞威胁等级</li><li>HasVul- String - 是否必填：否 -是否有漏洞；true：是，false，否；不传或ALL ：全部</li>
     * @param Filters 过滤条件。
<li>ComponentName- String - 是否必填：否 - 镜像组件名称</li><li>ComponentVersion- String - 是否必填：否 - 镜像组件版本</li><li>ComponentType- String - 是否必填：否 - 镜像组件类型</li><li>VulLevel- String - 是否必填：否 - 漏洞威胁等级</li><li>HasVul- String - 是否必填：否 -是否有漏洞；true：是，false，否；不传或ALL ：全部</li>
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
     * Get 排序方式desc ，asc 
     * @return Order 排序方式desc ，asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式desc ，asc
     * @param Order 排序方式desc ，asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeImageComponentListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageComponentListRequest(DescribeImageComponentListRequest source) {
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

