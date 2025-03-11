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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductSKUListResponse extends AbstractModel {

    /**
    * 查询总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * mqtt商品配置信息
    */
    @SerializedName("MQTTProductSkuList")
    @Expose
    private ProductSkuItem [] MQTTProductSkuList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询总数 
     * @return TotalCount 查询总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询总数
     * @param TotalCount 查询总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get mqtt商品配置信息 
     * @return MQTTProductSkuList mqtt商品配置信息
     */
    public ProductSkuItem [] getMQTTProductSkuList() {
        return this.MQTTProductSkuList;
    }

    /**
     * Set mqtt商品配置信息
     * @param MQTTProductSkuList mqtt商品配置信息
     */
    public void setMQTTProductSkuList(ProductSkuItem [] MQTTProductSkuList) {
        this.MQTTProductSkuList = MQTTProductSkuList;
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

    public DescribeProductSKUListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductSKUListResponse(DescribeProductSKUListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MQTTProductSkuList != null) {
            this.MQTTProductSkuList = new ProductSkuItem[source.MQTTProductSkuList.length];
            for (int i = 0; i < source.MQTTProductSkuList.length; i++) {
                this.MQTTProductSkuList[i] = new ProductSkuItem(source.MQTTProductSkuList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "MQTTProductSkuList.", this.MQTTProductSkuList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

