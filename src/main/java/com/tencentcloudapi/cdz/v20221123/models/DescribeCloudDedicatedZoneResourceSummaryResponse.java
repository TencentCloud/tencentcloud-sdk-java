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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudDedicatedZoneResourceSummaryResponse extends AbstractModel {

    /**
    * 资源水位详情
    */
    @SerializedName("ResourceSummarySet")
    @Expose
    private CloudDedicatedZoneResourceSummaryInfo [] ResourceSummarySet;

    /**
    * 资源水位扩展信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源水位详情 
     * @return ResourceSummarySet 资源水位详情
     */
    public CloudDedicatedZoneResourceSummaryInfo [] getResourceSummarySet() {
        return this.ResourceSummarySet;
    }

    /**
     * Set 资源水位详情
     * @param ResourceSummarySet 资源水位详情
     */
    public void setResourceSummarySet(CloudDedicatedZoneResourceSummaryInfo [] ResourceSummarySet) {
        this.ResourceSummarySet = ResourceSummarySet;
    }

    /**
     * Get 资源水位扩展信息 
     * @return ExtraInfo 资源水位扩展信息
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 资源水位扩展信息
     * @param ExtraInfo 资源水位扩展信息
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
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

    public DescribeCloudDedicatedZoneResourceSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudDedicatedZoneResourceSummaryResponse(DescribeCloudDedicatedZoneResourceSummaryResponse source) {
        if (source.ResourceSummarySet != null) {
            this.ResourceSummarySet = new CloudDedicatedZoneResourceSummaryInfo[source.ResourceSummarySet.length];
            for (int i = 0; i < source.ResourceSummarySet.length; i++) {
                this.ResourceSummarySet[i] = new CloudDedicatedZoneResourceSummaryInfo(source.ResourceSummarySet[i]);
            }
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResourceSummarySet.", this.ResourceSummarySet);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

