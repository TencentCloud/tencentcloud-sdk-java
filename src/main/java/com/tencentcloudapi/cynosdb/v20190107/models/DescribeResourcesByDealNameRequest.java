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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesByDealNameRequest extends AbstractModel {

    /**
    * 计费订单ID（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 计费订单ID列表，可以一次查询若干条订单ID对应资源信息（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get 计费订单ID（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。 
     * @return DealName 计费订单ID（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 计费订单ID（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     * @param DealName 计费订单ID（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 计费订单ID列表，可以一次查询若干条订单ID对应资源信息（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。 
     * @return DealNames 计费订单ID列表，可以一次查询若干条订单ID对应资源信息（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 计费订单ID列表，可以一次查询若干条订单ID对应资源信息（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     * @param DealNames 计费订单ID列表，可以一次查询若干条订单ID对应资源信息（如果计费还没回调业务发货，可能出现错误码InvalidParameterValue.DealNameNotFound，这种情况需要业务重试DescribeResourcesByDealName接口直到成功）。
DealName与DealNames至少应输入一项，两者都传时以DealName为准。
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    public DescribeResourcesByDealNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcesByDealNameRequest(DescribeResourcesByDealNameRequest source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
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
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

