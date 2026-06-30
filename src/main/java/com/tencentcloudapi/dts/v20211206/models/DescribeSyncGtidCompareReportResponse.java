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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSyncGtidCompareReportResponse extends AbstractModel {

    /**
    * 校验结论
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * 校验状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 校验类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 不一致详情
    */
    @SerializedName("Detail")
    @Expose
    private DifferenceDetails [] Detail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 校验结论 
     * @return Conclusion 校验结论
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 校验结论
     * @param Conclusion 校验结论
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get 校验状态 
     * @return Status 校验状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验状态
     * @param Status 校验状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 校验类型 
     * @return Type 校验类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 校验类型
     * @param Type 校验类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 不一致详情 
     * @return Detail 不一致详情
     */
    public DifferenceDetails [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 不一致详情
     * @param Detail 不一致详情
     */
    public void setDetail(DifferenceDetails [] Detail) {
        this.Detail = Detail;
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

    public DescribeSyncGtidCompareReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncGtidCompareReportResponse(DescribeSyncGtidCompareReportResponse source) {
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Detail != null) {
            this.Detail = new DifferenceDetails[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new DifferenceDetails(source.Detail[i]);
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
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

