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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackTypeRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>Source - String - 是否必填：是 - 加白的模块，rasp：漏洞防御，memshell_inject：内存马注入</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为10，最大值为1000。
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
    * 排序字段，目前有：Id，默认按照Id排序，可以不传
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序升序还是倒序，DESC有ASC、
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 过滤条件。
<li>Source - String - 是否必填：是 - 加白的模块，rasp：漏洞防御，memshell_inject：内存马注入</li>
 
     * @return Filters 过滤条件。
<li>Source - String - 是否必填：是 - 加白的模块，rasp：漏洞防御，memshell_inject：内存马注入</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Source - String - 是否必填：是 - 加白的模块，rasp：漏洞防御，memshell_inject：内存马注入</li>

     * @param Filters 过滤条件。
<li>Source - String - 是否必填：是 - 加白的模块，rasp：漏洞防御，memshell_inject：内存马注入</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为10，最大值为1000。 
     * @return Limit 返回数量，默认为10，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为1000。
     * @param Limit 返回数量，默认为10，最大值为1000。
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
     * Get 排序字段，目前有：Id，默认按照Id排序，可以不传 
     * @return By 排序字段，目前有：Id，默认按照Id排序，可以不传
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，目前有：Id，默认按照Id排序，可以不传
     * @param By 排序字段，目前有：Id，默认按照Id排序，可以不传
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序升序还是倒序，DESC有ASC、 
     * @return Order 排序升序还是倒序，DESC有ASC、
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序升序还是倒序，DESC有ASC、
     * @param Order 排序升序还是倒序，DESC有ASC、
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAttackTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackTypeRequest(DescribeAttackTypeRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

