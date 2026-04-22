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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectGroupRequest extends AbstractModel {

    /**
    * 查询防护对象的查询条件，如果为空则获取所有的防护对象组，支持按照 Name：对象组名称、Domain：绑定的域名、InstanceID：实例ID、ID：对象组ID、InstanceName：实例名称
    */
    @SerializedName("Filter")
    @Expose
    private FiltersItemNew [] Filter;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * 页尺寸，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持按照 "update_time"-更新时间、"create_time"-创建时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序类型desc-降序、asc-升序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 查询防护对象的查询条件，如果为空则获取所有的防护对象组，支持按照 Name：对象组名称、Domain：绑定的域名、InstanceID：实例ID、ID：对象组ID、InstanceName：实例名称 
     * @return Filter 查询防护对象的查询条件，如果为空则获取所有的防护对象组，支持按照 Name：对象组名称、Domain：绑定的域名、InstanceID：实例ID、ID：对象组ID、InstanceName：实例名称
     */
    public FiltersItemNew [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询防护对象的查询条件，如果为空则获取所有的防护对象组，支持按照 Name：对象组名称、Domain：绑定的域名、InstanceID：实例ID、ID：对象组ID、InstanceName：实例名称
     * @param Filter 查询防护对象的查询条件，如果为空则获取所有的防护对象组，支持按照 Name：对象组名称、Domain：绑定的域名、InstanceID：实例ID、ID：对象组ID、InstanceName：实例名称
     */
    public void setFilter(FiltersItemNew [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 偏移量，默认为0 
     * @return OffSet 偏移量，默认为0
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set 偏移量，默认为0
     * @param OffSet 偏移量，默认为0
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get 页尺寸，默认为10 
     * @return Limit 页尺寸，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页尺寸，默认为10
     * @param Limit 页尺寸，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持按照 "update_time"-更新时间、"create_time"-创建时间 
     * @return By 排序字段，支持按照 "update_time"-更新时间、"create_time"-创建时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，支持按照 "update_time"-更新时间、"create_time"-创建时间
     * @param By 排序字段，支持按照 "update_time"-更新时间、"create_time"-创建时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序类型desc-降序、asc-升序 
     * @return Order 排序类型desc-降序、asc-升序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序类型desc-降序、asc-升序
     * @param Order 排序类型desc-降序、asc-升序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeProtectGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectGroupRequest(DescribeProtectGroupRequest source) {
        if (source.Filter != null) {
            this.Filter = new FiltersItemNew[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new FiltersItemNew(source.Filter[i]);
            }
        }
        if (source.OffSet != null) {
            this.OffSet = new Long(source.OffSet);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "OffSet", this.OffSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

