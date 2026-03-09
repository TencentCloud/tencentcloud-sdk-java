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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobRecordDetailsResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>数组</p>
    */
    @SerializedName("List")
    @Expose
    private DisplayJobRecordDetail [] List;

    /**
    * <p>持股路径</p>
    */
    @SerializedName("EnterpriseEquityPath")
    @Expose
    private Equity [] EnterpriseEquityPath;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总数</p> 
     * @return Total <p>总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总数</p>
     * @param Total <p>总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>数组</p> 
     * @return List <p>数组</p>
     */
    public DisplayJobRecordDetail [] getList() {
        return this.List;
    }

    /**
     * Set <p>数组</p>
     * @param List <p>数组</p>
     */
    public void setList(DisplayJobRecordDetail [] List) {
        this.List = List;
    }

    /**
     * Get <p>持股路径</p> 
     * @return EnterpriseEquityPath <p>持股路径</p>
     */
    public Equity [] getEnterpriseEquityPath() {
        return this.EnterpriseEquityPath;
    }

    /**
     * Set <p>持股路径</p>
     * @param EnterpriseEquityPath <p>持股路径</p>
     */
    public void setEnterpriseEquityPath(Equity [] EnterpriseEquityPath) {
        this.EnterpriseEquityPath = EnterpriseEquityPath;
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

    public DescribeJobRecordDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobRecordDetailsResponse(DescribeJobRecordDetailsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new DisplayJobRecordDetail[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DisplayJobRecordDetail(source.List[i]);
            }
        }
        if (source.EnterpriseEquityPath != null) {
            this.EnterpriseEquityPath = new Equity[source.EnterpriseEquityPath.length];
            for (int i = 0; i < source.EnterpriseEquityPath.length; i++) {
                this.EnterpriseEquityPath[i] = new Equity(source.EnterpriseEquityPath[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamArrayObj(map, prefix + "EnterpriseEquityPath.", this.EnterpriseEquityPath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

