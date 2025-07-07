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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomerGatewayRequest extends AbstractModel {

    /**
    * 对端网关ID，例如：bmcgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
     * Get 对端网关ID，例如：bmcgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。 
     * @return CustomerGatewayId 对端网关ID，例如：bmcgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set 对端网关ID，例如：bmcgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     * @param CustomerGatewayId 对端网关ID，例如：bmcgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    public DeleteCustomerGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomerGatewayRequest(DeleteCustomerGatewayRequest source) {
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);

    }
}

