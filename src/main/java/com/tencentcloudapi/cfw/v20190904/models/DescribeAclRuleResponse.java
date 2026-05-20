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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAclRuleResponse extends AbstractModel {

    /**
    * <p>总条数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>nat访问控制列表数据</p>
    */
    @SerializedName("Data")
    @Expose
    private DescAcItem [] Data;

    /**
    * <p>未过滤的总条数</p>
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总条数</p> 
     * @return Total <p>总条数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总条数</p>
     * @param Total <p>总条数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>nat访问控制列表数据</p> 
     * @return Data <p>nat访问控制列表数据</p>
     */
    public DescAcItem [] getData() {
        return this.Data;
    }

    /**
     * Set <p>nat访问控制列表数据</p>
     * @param Data <p>nat访问控制列表数据</p>
     */
    public void setData(DescAcItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>未过滤的总条数</p> 
     * @return AllTotal <p>未过滤的总条数</p>
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set <p>未过滤的总条数</p>
     * @param AllTotal <p>未过滤的总条数</p>
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
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

    public DescribeAclRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclRuleResponse(DescribeAclRuleResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DescAcItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DescAcItem(source.Data[i]);
            }
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

