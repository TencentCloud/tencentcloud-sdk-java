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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSampleSnapshotTemplatesResponse extends AbstractModel {

    /**
    * 符合过滤条件的记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 采样截图模板详情列表。
    */
    @SerializedName("SampleSnapshotTemplateSet")
    @Expose
    private SampleSnapshotTemplate [] SampleSnapshotTemplateSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合过滤条件的记录总数。 
     * @return TotalCount 符合过滤条件的记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合过滤条件的记录总数。
     * @param TotalCount 符合过滤条件的记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 采样截图模板详情列表。 
     * @return SampleSnapshotTemplateSet 采样截图模板详情列表。
     */
    public SampleSnapshotTemplate [] getSampleSnapshotTemplateSet() {
        return this.SampleSnapshotTemplateSet;
    }

    /**
     * Set 采样截图模板详情列表。
     * @param SampleSnapshotTemplateSet 采样截图模板详情列表。
     */
    public void setSampleSnapshotTemplateSet(SampleSnapshotTemplate [] SampleSnapshotTemplateSet) {
        this.SampleSnapshotTemplateSet = SampleSnapshotTemplateSet;
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

    public DescribeSampleSnapshotTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleSnapshotTemplatesResponse(DescribeSampleSnapshotTemplatesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SampleSnapshotTemplateSet != null) {
            this.SampleSnapshotTemplateSet = new SampleSnapshotTemplate[source.SampleSnapshotTemplateSet.length];
            for (int i = 0; i < source.SampleSnapshotTemplateSet.length; i++) {
                this.SampleSnapshotTemplateSet[i] = new SampleSnapshotTemplate(source.SampleSnapshotTemplateSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SampleSnapshotTemplateSet.", this.SampleSnapshotTemplateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

