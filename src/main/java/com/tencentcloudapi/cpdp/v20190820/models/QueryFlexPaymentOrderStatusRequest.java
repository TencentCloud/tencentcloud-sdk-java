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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFlexPaymentOrderStatusRequest extends AbstractModel {

    /**
    * 外部订单ID
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 外部订单ID 
     * @return OutOrderId 外部订单ID
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部订单ID
     * @param OutOrderId 外部订单ID
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 订单ID 
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryFlexPaymentOrderStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexPaymentOrderStatusRequest(QueryFlexPaymentOrderStatusRequest source) {
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

