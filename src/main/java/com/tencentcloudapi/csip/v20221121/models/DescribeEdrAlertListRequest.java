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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrAlertListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>PolicyType - int - 是否必填：否 - 策略类型PolicyName - string - 是否必填：否 - 策略名称Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)PolicyAction- int - 是否必填：否 - 策略动作IsEnabled - int - 是否必填：否 - 是否生效</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>限制条数,默认10,最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方式: [ASC:升序|DESC:降序]</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>可选排序列: [LatestDetectTime]</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>PolicyType - int - 是否必填：否 - 策略类型PolicyName - string - 是否必填：否 - 策略名称Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)PolicyAction- int - 是否必填：否 - 策略动作IsEnabled - int - 是否必填：否 - 是否生效</p> 
     * @return Filters <p>PolicyType - int - 是否必填：否 - 策略类型PolicyName - string - 是否必填：否 - 策略名称Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)PolicyAction- int - 是否必填：否 - 策略动作IsEnabled - int - 是否必填：否 - 是否生效</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>PolicyType - int - 是否必填：否 - 策略类型PolicyName - string - 是否必填：否 - 策略名称Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)PolicyAction- int - 是否必填：否 - 策略动作IsEnabled - int - 是否必填：否 - 是否生效</p>
     * @param Filters <p>PolicyType - int - 是否必填：否 - 策略类型PolicyName - string - 是否必填：否 - 策略名称Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)PolicyAction- int - 是否必填：否 - 策略动作IsEnabled - int - 是否必填：否 - 是否生效</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>限制条数,默认10,最大100</p> 
     * @return Limit <p>限制条数,默认10,最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数,默认10,最大100</p>
     * @param Limit <p>限制条数,默认10,最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认0</p> 
     * @return Offset <p>偏移量,默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认0</p>
     * @param Offset <p>偏移量,默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方式: [ASC:升序|DESC:降序]</p> 
     * @return Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式: [ASC:升序|DESC:降序]</p>
     * @param Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>可选排序列: [LatestDetectTime]</p> 
     * @return By <p>可选排序列: [LatestDetectTime]</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>可选排序列: [LatestDetectTime]</p>
     * @param By <p>可选排序列: [LatestDetectTime]</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeEdrAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertListRequest(DescribeEdrAlertListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

