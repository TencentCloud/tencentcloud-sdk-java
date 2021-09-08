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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceTerminateInstancesResponse extends AbstractModel{

    /**
    * 退款详情。
    */
    @SerializedName("InstanceRefundsSet")
    @Expose
    private InstanceRefund [] InstanceRefundsSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 退款详情。 
     * @return InstanceRefundsSet 退款详情。
     */
    public InstanceRefund [] getInstanceRefundsSet() {
        return this.InstanceRefundsSet;
    }

    /**
     * Set 退款详情。
     * @param InstanceRefundsSet 退款详情。
     */
    public void setInstanceRefundsSet(InstanceRefund [] InstanceRefundsSet) {
        this.InstanceRefundsSet = InstanceRefundsSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InquiryPriceTerminateInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceTerminateInstancesResponse(InquiryPriceTerminateInstancesResponse source) {
        if (source.InstanceRefundsSet != null) {
            this.InstanceRefundsSet = new InstanceRefund[source.InstanceRefundsSet.length];
            for (int i = 0; i < source.InstanceRefundsSet.length; i++) {
                this.InstanceRefundsSet[i] = new InstanceRefund(source.InstanceRefundsSet[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceRefundsSet.", this.InstanceRefundsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

