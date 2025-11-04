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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDealDetailRequest extends AbstractModel {

    /**
    * 订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealId。
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;

    /**
    * 订单号，订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealName。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealId。 
     * @return DealIds 订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealId。
     * @deprecated
     */
    @Deprecated
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * Set 订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealId。
     * @param DealIds 订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealId。
     * @deprecated
     */
    @Deprecated
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
    }

    /**
     * Get 订单号，订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealName。 
     * @return DealName 订单号，订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealName。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号，订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealName。
     * @param DealName 订单号，订单交易ID数组，即 [CreateInstances](https://cloud.tencent.com/document/api/1520/86207) 的输出参数DealName。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public DescribeInstanceDealDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDealDetailRequest(DescribeInstanceDealDetailRequest source) {
        if (source.DealIds != null) {
            this.DealIds = new String[source.DealIds.length];
            for (int i = 0; i < source.DealIds.length; i++) {
                this.DealIds[i] = new String(source.DealIds[i]);
            }
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

