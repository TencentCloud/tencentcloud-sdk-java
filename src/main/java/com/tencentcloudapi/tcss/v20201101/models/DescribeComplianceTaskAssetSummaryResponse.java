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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceTaskAssetSummaryResponse extends AbstractModel {

    /**
    * 返回用户的状态，

USER_UNINIT: 用户未初始化。
USER_INITIALIZING，表示用户正在初始化环境。
USER_NORMAL: 正常状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 返回各类资产的汇总信息的列表。
    */
    @SerializedName("AssetSummaryList")
    @Expose
    private ComplianceAssetSummary [] AssetSummaryList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回用户的状态，

USER_UNINIT: 用户未初始化。
USER_INITIALIZING，表示用户正在初始化环境。
USER_NORMAL: 正常状态。 
     * @return Status 返回用户的状态，

USER_UNINIT: 用户未初始化。
USER_INITIALIZING，表示用户正在初始化环境。
USER_NORMAL: 正常状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 返回用户的状态，

USER_UNINIT: 用户未初始化。
USER_INITIALIZING，表示用户正在初始化环境。
USER_NORMAL: 正常状态。
     * @param Status 返回用户的状态，

USER_UNINIT: 用户未初始化。
USER_INITIALIZING，表示用户正在初始化环境。
USER_NORMAL: 正常状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 返回各类资产的汇总信息的列表。 
     * @return AssetSummaryList 返回各类资产的汇总信息的列表。
     */
    public ComplianceAssetSummary [] getAssetSummaryList() {
        return this.AssetSummaryList;
    }

    /**
     * Set 返回各类资产的汇总信息的列表。
     * @param AssetSummaryList 返回各类资产的汇总信息的列表。
     */
    public void setAssetSummaryList(ComplianceAssetSummary [] AssetSummaryList) {
        this.AssetSummaryList = AssetSummaryList;
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

    public DescribeComplianceTaskAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskAssetSummaryResponse(DescribeComplianceTaskAssetSummaryResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AssetSummaryList != null) {
            this.AssetSummaryList = new ComplianceAssetSummary[source.AssetSummaryList.length];
            for (int i = 0; i < source.AssetSummaryList.length; i++) {
                this.AssetSummaryList[i] = new ComplianceAssetSummary(source.AssetSummaryList[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "AssetSummaryList.", this.AssetSummaryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

