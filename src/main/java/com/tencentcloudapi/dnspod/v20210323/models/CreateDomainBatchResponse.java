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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainBatchResponse extends AbstractModel {

    /**
    * 批量添加域名信息
    */
    @SerializedName("DetailList")
    @Expose
    private CreateDomainBatchDetail [] DetailList;

    /**
    * 批量任务的ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量添加域名信息 
     * @return DetailList 批量添加域名信息
     */
    public CreateDomainBatchDetail [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set 批量添加域名信息
     * @param DetailList 批量添加域名信息
     */
    public void setDetailList(CreateDomainBatchDetail [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get 批量任务的ID 
     * @return JobId 批量任务的ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 批量任务的ID
     * @param JobId 批量任务的ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
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

    public CreateDomainBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainBatchResponse(CreateDomainBatchResponse source) {
        if (source.DetailList != null) {
            this.DetailList = new CreateDomainBatchDetail[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new CreateDomainBatchDetail(source.DetailList[i]);
            }
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

