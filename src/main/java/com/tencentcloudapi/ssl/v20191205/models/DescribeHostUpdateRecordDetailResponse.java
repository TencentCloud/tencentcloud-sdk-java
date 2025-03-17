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

public class DescribeHostUpdateRecordDetailResponse extends AbstractModel {

    /**
    * 总数,如果取不到返回0
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 证书部署记录列表，如果取不到值返回空数组
    */
    @SerializedName("RecordDetailList")
    @Expose
    private UpdateRecordDetails [] RecordDetailList;

    /**
    * 成功总数,如果取不到返回0
    */
    @SerializedName("SuccessTotalCount")
    @Expose
    private Long SuccessTotalCount;

    /**
    * 失败总数,如果取不到返回0
    */
    @SerializedName("FailedTotalCount")
    @Expose
    private Long FailedTotalCount;

    /**
    * 部署中总数,如果取不到返回0
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
     * Get 总数,如果取不到返回0 
     * @return TotalCount 总数,如果取不到返回0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数,如果取不到返回0
     * @param TotalCount 总数,如果取不到返回0
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 证书部署记录列表，如果取不到值返回空数组 
     * @return RecordDetailList 证书部署记录列表，如果取不到值返回空数组
     */
    public UpdateRecordDetails [] getRecordDetailList() {
        return this.RecordDetailList;
    }

    /**
     * Set 证书部署记录列表，如果取不到值返回空数组
     * @param RecordDetailList 证书部署记录列表，如果取不到值返回空数组
     */
    public void setRecordDetailList(UpdateRecordDetails [] RecordDetailList) {
        this.RecordDetailList = RecordDetailList;
    }

    /**
     * Get 成功总数,如果取不到返回0 
     * @return SuccessTotalCount 成功总数,如果取不到返回0
     */
    public Long getSuccessTotalCount() {
        return this.SuccessTotalCount;
    }

    /**
     * Set 成功总数,如果取不到返回0
     * @param SuccessTotalCount 成功总数,如果取不到返回0
     */
    public void setSuccessTotalCount(Long SuccessTotalCount) {
        this.SuccessTotalCount = SuccessTotalCount;
    }

    /**
     * Get 失败总数,如果取不到返回0 
     * @return FailedTotalCount 失败总数,如果取不到返回0
     */
    public Long getFailedTotalCount() {
        return this.FailedTotalCount;
    }

    /**
     * Set 失败总数,如果取不到返回0
     * @param FailedTotalCount 失败总数,如果取不到返回0
     */
    public void setFailedTotalCount(Long FailedTotalCount) {
        this.FailedTotalCount = FailedTotalCount;
    }

    /**
     * Get 部署中总数,如果取不到返回0 
     * @return RunningTotalCount 部署中总数,如果取不到返回0
     */
    public Long getRunningTotalCount() {
        return this.RunningTotalCount;
    }

    /**
     * Set 部署中总数,如果取不到返回0
     * @param RunningTotalCount 部署中总数,如果取不到返回0
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

    public DescribeHostUpdateRecordDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordDetailResponse(DescribeHostUpdateRecordDetailResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordDetailList != null) {
            this.RecordDetailList = new UpdateRecordDetails[source.RecordDetailList.length];
            for (int i = 0; i < source.RecordDetailList.length; i++) {
                this.RecordDetailList[i] = new UpdateRecordDetails(source.RecordDetailList[i]);
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
        this.setParamArrayObj(map, prefix + "RecordDetailList.", this.RecordDetailList);
        this.setParamSimple(map, prefix + "SuccessTotalCount", this.SuccessTotalCount);
        this.setParamSimple(map, prefix + "FailedTotalCount", this.FailedTotalCount);
        this.setParamSimple(map, prefix + "RunningTotalCount", this.RunningTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

