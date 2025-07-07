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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrdersRequest extends AbstractModel {

    /**
    * 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。 
     * @return DealNames 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     * @param DealNames 待查询的长订单号列表，创建实例、续费实例、扩容实例接口返回。
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    public DescribeOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrdersRequest(DescribeOrdersRequest source) {
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

