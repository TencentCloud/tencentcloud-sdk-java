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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHealthCheckTemplatesResponse extends AbstractModel {

    /**
    * 健康检查模板列表。
    */
    @SerializedName("HealthCheckTemplates")
    @Expose
    private HealthCheckTemplate [] HealthCheckTemplates;

    /**
    * 下一次查询的Token值，如果当前是最后一页，返回为空。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 经过筛选后查询到的健康检查模板总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 健康检查模板列表。 
     * @return HealthCheckTemplates 健康检查模板列表。
     */
    public HealthCheckTemplate [] getHealthCheckTemplates() {
        return this.HealthCheckTemplates;
    }

    /**
     * Set 健康检查模板列表。
     * @param HealthCheckTemplates 健康检查模板列表。
     */
    public void setHealthCheckTemplates(HealthCheckTemplate [] HealthCheckTemplates) {
        this.HealthCheckTemplates = HealthCheckTemplates;
    }

    /**
     * Get 下一次查询的Token值，如果当前是最后一页，返回为空。 
     * @return NextToken 下一次查询的Token值，如果当前是最后一页，返回为空。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一次查询的Token值，如果当前是最后一页，返回为空。
     * @param NextToken 下一次查询的Token值，如果当前是最后一页，返回为空。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 经过筛选后查询到的健康检查模板总数。 
     * @return TotalCount 经过筛选后查询到的健康检查模板总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 经过筛选后查询到的健康检查模板总数。
     * @param TotalCount 经过筛选后查询到的健康检查模板总数。
     */
    public void setTotalCount(Long TotalCount) {
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

    public DescribeHealthCheckTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHealthCheckTemplatesResponse(DescribeHealthCheckTemplatesResponse source) {
        if (source.HealthCheckTemplates != null) {
            this.HealthCheckTemplates = new HealthCheckTemplate[source.HealthCheckTemplates.length];
            for (int i = 0; i < source.HealthCheckTemplates.length; i++) {
                this.HealthCheckTemplates[i] = new HealthCheckTemplate(source.HealthCheckTemplates[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HealthCheckTemplates.", this.HealthCheckTemplates);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

