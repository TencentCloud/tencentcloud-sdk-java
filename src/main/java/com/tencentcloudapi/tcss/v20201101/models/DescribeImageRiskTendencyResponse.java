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

public class DescribeImageRiskTendencyResponse extends AbstractModel {

    /**
    * 本地镜像新增风险趋势信息列表
    */
    @SerializedName("ImageRiskTendencySet")
    @Expose
    private ImageRiskTendencyInfo [] ImageRiskTendencySet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本地镜像新增风险趋势信息列表 
     * @return ImageRiskTendencySet 本地镜像新增风险趋势信息列表
     */
    public ImageRiskTendencyInfo [] getImageRiskTendencySet() {
        return this.ImageRiskTendencySet;
    }

    /**
     * Set 本地镜像新增风险趋势信息列表
     * @param ImageRiskTendencySet 本地镜像新增风险趋势信息列表
     */
    public void setImageRiskTendencySet(ImageRiskTendencyInfo [] ImageRiskTendencySet) {
        this.ImageRiskTendencySet = ImageRiskTendencySet;
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

    public DescribeImageRiskTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRiskTendencyResponse(DescribeImageRiskTendencyResponse source) {
        if (source.ImageRiskTendencySet != null) {
            this.ImageRiskTendencySet = new ImageRiskTendencyInfo[source.ImageRiskTendencySet.length];
            for (int i = 0; i < source.ImageRiskTendencySet.length; i++) {
                this.ImageRiskTendencySet[i] = new ImageRiskTendencyInfo(source.ImageRiskTendencySet[i]);
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
        this.setParamArrayObj(map, prefix + "ImageRiskTendencySet.", this.ImageRiskTendencySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

