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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRiskDnsPolicyListRequest extends AbstractModel{

    /**
    * <li>PolicyType - int - 是否必填：否 - 策略类型</li>
<li>PolicyName - string - 是否必填：否 - 策略名称</li>
<li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li>
<li>PolicyAction- int - 是否必填：否 - 策略动作</li>
<li>IsEnabled - int - 是否必填：否 - 是否生效</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式: [ASC:升序|DESC:降序]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选排序列: [PolicyName|HostType]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>PolicyType - int - 是否必填：否 - 策略类型</li>
<li>PolicyName - string - 是否必填：否 - 策略名称</li>
<li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li>
<li>PolicyAction- int - 是否必填：否 - 策略动作</li>
<li>IsEnabled - int - 是否必填：否 - 是否生效</li> 
     * @return Filters <li>PolicyType - int - 是否必填：否 - 策略类型</li>
<li>PolicyName - string - 是否必填：否 - 策略名称</li>
<li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li>
<li>PolicyAction- int - 是否必填：否 - 策略动作</li>
<li>IsEnabled - int - 是否必填：否 - 是否生效</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>PolicyType - int - 是否必填：否 - 策略类型</li>
<li>PolicyName - string - 是否必填：否 - 策略名称</li>
<li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li>
<li>PolicyAction- int - 是否必填：否 - 策略动作</li>
<li>IsEnabled - int - 是否必填：否 - 是否生效</li>
     * @param Filters <li>PolicyType - int - 是否必填：否 - 策略类型</li>
<li>PolicyName - string - 是否必填：否 - 策略名称</li>
<li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li>
<li>PolicyAction- int - 是否必填：否 - 策略动作</li>
<li>IsEnabled - int - 是否必填：否 - 是否生效</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式: [ASC:升序|DESC:降序] 
     * @return Order 排序方式: [ASC:升序|DESC:降序]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式: [ASC:升序|DESC:降序]
     * @param Order 排序方式: [ASC:升序|DESC:降序]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选排序列: [PolicyName|HostType] 
     * @return By 可选排序列: [PolicyName|HostType]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序列: [PolicyName|HostType]
     * @param By 可选排序列: [PolicyName|HostType]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRiskDnsPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRiskDnsPolicyListRequest(ExportRiskDnsPolicyListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

