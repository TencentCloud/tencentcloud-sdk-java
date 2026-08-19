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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumptionDetailListResponse extends AbstractModel {

    /**
    * <p>资源消耗明细列表</p>
    */
    @SerializedName("ConsumptionDetailList")
    @Expose
    private ConsumptionDetail [] ConsumptionDetailList;

    /**
    * <p>总记录数，用于前端分页</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源消耗明细列表</p> 
     * @return ConsumptionDetailList <p>资源消耗明细列表</p>
     */
    public ConsumptionDetail [] getConsumptionDetailList() {
        return this.ConsumptionDetailList;
    }

    /**
     * Set <p>资源消耗明细列表</p>
     * @param ConsumptionDetailList <p>资源消耗明细列表</p>
     */
    public void setConsumptionDetailList(ConsumptionDetail [] ConsumptionDetailList) {
        this.ConsumptionDetailList = ConsumptionDetailList;
    }

    /**
     * Get <p>总记录数，用于前端分页</p> 
     * @return TotalCount <p>总记录数，用于前端分页</p>
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总记录数，用于前端分页</p>
     * @param TotalCount <p>总记录数，用于前端分页</p>
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeConsumptionDetailListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumptionDetailListResponse(DescribeConsumptionDetailListResponse source) {
        if (source.ConsumptionDetailList != null) {
            this.ConsumptionDetailList = new ConsumptionDetail[source.ConsumptionDetailList.length];
            for (int i = 0; i < source.ConsumptionDetailList.length; i++) {
                this.ConsumptionDetailList[i] = new ConsumptionDetail(source.ConsumptionDetailList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConsumptionDetailList.", this.ConsumptionDetailList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

