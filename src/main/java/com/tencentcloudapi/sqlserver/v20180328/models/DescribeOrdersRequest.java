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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrdersRequest extends AbstractModel{

    /**
    * 订单数组。发货时会返回订单名字，利用该订单名字调用DescribeOrders接口查询发货情况
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get 订单数组。发货时会返回订单名字，利用该订单名字调用DescribeOrders接口查询发货情况 
     * @return DealNames 订单数组。发货时会返回订单名字，利用该订单名字调用DescribeOrders接口查询发货情况
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单数组。发货时会返回订单名字，利用该订单名字调用DescribeOrders接口查询发货情况
     * @param DealNames 订单数组。发货时会返回订单名字，利用该订单名字调用DescribeOrders接口查询发货情况
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

