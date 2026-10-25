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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceResponse extends AbstractModel {

    /**
    * <p>义SSM 服务资源 ID，供调用方保存并标识该服务资源。</p><p>参数格式：一期后付费为 ssm_ 加 AppId，如 ssm_1250000000。</p><p>默认值：留空。</p><p>返回时资源可能仍在发货，不代表服务已可用。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>计费交易订单号，用于核对本次开通订单</p><p>参数格式：留空；不承诺固定长度或纯数字格式。</p><p>默认值：留空。</p><p>来自计费返回的订单号；订单形成不代表发货完成。</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>义SSM 服务资源 ID，供调用方保存并标识该服务资源。</p><p>参数格式：一期后付费为 ssm_ 加 AppId，如 ssm_1250000000。</p><p>默认值：留空。</p><p>返回时资源可能仍在发货，不代表服务已可用。</p> 
     * @return ResourceId <p>义SSM 服务资源 ID，供调用方保存并标识该服务资源。</p><p>参数格式：一期后付费为 ssm_ 加 AppId，如 ssm_1250000000。</p><p>默认值：留空。</p><p>返回时资源可能仍在发货，不代表服务已可用。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>义SSM 服务资源 ID，供调用方保存并标识该服务资源。</p><p>参数格式：一期后付费为 ssm_ 加 AppId，如 ssm_1250000000。</p><p>默认值：留空。</p><p>返回时资源可能仍在发货，不代表服务已可用。</p>
     * @param ResourceId <p>义SSM 服务资源 ID，供调用方保存并标识该服务资源。</p><p>参数格式：一期后付费为 ssm_ 加 AppId，如 ssm_1250000000。</p><p>默认值：留空。</p><p>返回时资源可能仍在发货，不代表服务已可用。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>计费交易订单号，用于核对本次开通订单</p><p>参数格式：留空；不承诺固定长度或纯数字格式。</p><p>默认值：留空。</p><p>来自计费返回的订单号；订单形成不代表发货完成。</p> 
     * @return OrderId <p>计费交易订单号，用于核对本次开通订单</p><p>参数格式：留空；不承诺固定长度或纯数字格式。</p><p>默认值：留空。</p><p>来自计费返回的订单号；订单形成不代表发货完成。</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>计费交易订单号，用于核对本次开通订单</p><p>参数格式：留空；不承诺固定长度或纯数字格式。</p><p>默认值：留空。</p><p>来自计费返回的订单号；订单形成不代表发货完成。</p>
     * @param OrderId <p>计费交易订单号，用于核对本次开通订单</p><p>参数格式：留空；不承诺固定长度或纯数字格式。</p><p>默认值：留空。</p><p>来自计费返回的订单号；订单形成不代表发货完成。</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceResponse(CreateServiceResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

