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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeOrderCertificateRequest extends AbstractModel{

    /**
    * 要下载授权书的订单id
    */
    @SerializedName("OrderIds")
    @Expose
    private String [] OrderIds;

    /**
     * Get 要下载授权书的订单id 
     * @return OrderIds 要下载授权书的订单id
     */
    public String [] getOrderIds() {
        return this.OrderIds;
    }

    /**
     * Set 要下载授权书的订单id
     * @param OrderIds 要下载授权书的订单id
     */
    public void setOrderIds(String [] OrderIds) {
        this.OrderIds = OrderIds;
    }

    public BatchDescribeOrderCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeOrderCertificateRequest(BatchDescribeOrderCertificateRequest source) {
        if (source.OrderIds != null) {
            this.OrderIds = new String[source.OrderIds.length];
            for (int i = 0; i < source.OrderIds.length; i++) {
                this.OrderIds[i] = new String(source.OrderIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OrderIds.", this.OrderIds);

    }
}

