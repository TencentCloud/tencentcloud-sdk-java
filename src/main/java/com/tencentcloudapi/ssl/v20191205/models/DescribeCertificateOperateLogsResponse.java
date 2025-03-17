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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateOperateLogsResponse extends AbstractModel {

    /**
    * 当前查询条件日志总数。
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 本次请求返回的日志数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 证书操作日志列表。
    */
    @SerializedName("OperateLogs")
    @Expose
    private OperationLog [] OperateLogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前查询条件日志总数。 
     * @return AllTotal 当前查询条件日志总数。
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set 当前查询条件日志总数。
     * @param AllTotal 当前查询条件日志总数。
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get 本次请求返回的日志数量。 
     * @return TotalCount 本次请求返回的日志数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 本次请求返回的日志数量。
     * @param TotalCount 本次请求返回的日志数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 证书操作日志列表。 
     * @return OperateLogs 证书操作日志列表。
     */
    public OperationLog [] getOperateLogs() {
        return this.OperateLogs;
    }

    /**
     * Set 证书操作日志列表。
     * @param OperateLogs 证书操作日志列表。
     */
    public void setOperateLogs(OperationLog [] OperateLogs) {
        this.OperateLogs = OperateLogs;
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

    public DescribeCertificateOperateLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateOperateLogsResponse(DescribeCertificateOperateLogsResponse source) {
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OperateLogs != null) {
            this.OperateLogs = new OperationLog[source.OperateLogs.length];
            for (int i = 0; i < source.OperateLogs.length; i++) {
                this.OperateLogs[i] = new OperationLog(source.OperateLogs[i]);
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
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "OperateLogs.", this.OperateLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

