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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableLibCountRequest extends AbstractModel {

    /**
    * 订单编号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 订单编号 
     * @return OrderId 订单编号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单编号
     * @param OrderId 订单编号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public DescribeAvailableLibCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableLibCountRequest(DescribeAvailableLibCountRequest source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

