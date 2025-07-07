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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostDeployRecordDetailResponse extends AbstractModel {

    /**
    * 部署记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 证书部署记录列表
    */
    @SerializedName("DeployRecordDetailList")
    @Expose
    private DeployRecordDetail [] DeployRecordDetailList;

    /**
    * 成功总数
    */
    @SerializedName("SuccessTotalCount")
    @Expose
    private Long SuccessTotalCount;

    /**
    * 失败总数
    */
    @SerializedName("FailedTotalCount")
    @Expose
    private Long FailedTotalCount;

    /**
    * 部署中总数
    */
    @SerializedName("RunningTotalCount")
    @Expose
    private Long RunningTotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 部署记录总数 
     * @return TotalCount 部署记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 部署记录总数
     * @param TotalCount 部署记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 证书部署记录列表 
     * @return DeployRecordDetailList 证书部署记录列表
     */
    public DeployRecordDetail [] getDeployRecordDetailList() {
        return this.DeployRecordDetailList;
    }

    /**
     * Set 证书部署记录列表
     * @param DeployRecordDetailList 证书部署记录列表
     */
    public void setDeployRecordDetailList(DeployRecordDetail [] DeployRecordDetailList) {
        this.DeployRecordDetailList = DeployRecordDetailList;
    }

    /**
     * Get 成功总数 
     * @return SuccessTotalCount 成功总数
     */
    public Long getSuccessTotalCount() {
        return this.SuccessTotalCount;
    }

    /**
     * Set 成功总数
     * @param SuccessTotalCount 成功总数
     */
    public void setSuccessTotalCount(Long SuccessTotalCount) {
        this.SuccessTotalCount = SuccessTotalCount;
    }

    /**
     * Get 失败总数 
     * @return FailedTotalCount 失败总数
     */
    public Long getFailedTotalCount() {
        return this.FailedTotalCount;
    }

    /**
     * Set 失败总数
     * @param FailedTotalCount 失败总数
     */
    public void setFailedTotalCount(Long FailedTotalCount) {
        this.FailedTotalCount = FailedTotalCount;
    }

    /**
     * Get 部署中总数 
     * @return RunningTotalCount 部署中总数
     */
    public Long getRunningTotalCount() {
        return this.RunningTotalCount;
    }

    /**
     * Set 部署中总数
     * @param RunningTotalCount 部署中总数
     */
    public void setRunningTotalCount(Long RunningTotalCount) {
        this.RunningTotalCount = RunningTotalCount;
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

    public DescribeHostDeployRecordDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostDeployRecordDetailResponse(DescribeHostDeployRecordDetailResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DeployRecordDetailList != null) {
            this.DeployRecordDetailList = new DeployRecordDetail[source.DeployRecordDetailList.length];
            for (int i = 0; i < source.DeployRecordDetailList.length; i++) {
                this.DeployRecordDetailList[i] = new DeployRecordDetail(source.DeployRecordDetailList[i]);
            }
        }
        if (source.SuccessTotalCount != null) {
            this.SuccessTotalCount = new Long(source.SuccessTotalCount);
        }
        if (source.FailedTotalCount != null) {
            this.FailedTotalCount = new Long(source.FailedTotalCount);
        }
        if (source.RunningTotalCount != null) {
            this.RunningTotalCount = new Long(source.RunningTotalCount);
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
        this.setParamArrayObj(map, prefix + "DeployRecordDetailList.", this.DeployRecordDetailList);
        this.setParamSimple(map, prefix + "SuccessTotalCount", this.SuccessTotalCount);
        this.setParamSimple(map, prefix + "FailedTotalCount", this.FailedTotalCount);
        this.setParamSimple(map, prefix + "RunningTotalCount", this.RunningTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

