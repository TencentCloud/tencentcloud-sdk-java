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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDynamicInstanceListResponse extends AbstractModel {

    /**
    * <p>RayCluster 集群列表</p>
    */
    @SerializedName("DynamicInstanceList")
    @Expose
    private RayCluster [] DynamicInstanceList;

    /**
    * <p>服务访问url</p>
    */
    @SerializedName("WebUIInfos")
    @Expose
    private WebUIInfo [] WebUIInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>RayCluster 集群列表</p> 
     * @return DynamicInstanceList <p>RayCluster 集群列表</p>
     */
    public RayCluster [] getDynamicInstanceList() {
        return this.DynamicInstanceList;
    }

    /**
     * Set <p>RayCluster 集群列表</p>
     * @param DynamicInstanceList <p>RayCluster 集群列表</p>
     */
    public void setDynamicInstanceList(RayCluster [] DynamicInstanceList) {
        this.DynamicInstanceList = DynamicInstanceList;
    }

    /**
     * Get <p>服务访问url</p> 
     * @return WebUIInfos <p>服务访问url</p>
     */
    public WebUIInfo [] getWebUIInfos() {
        return this.WebUIInfos;
    }

    /**
     * Set <p>服务访问url</p>
     * @param WebUIInfos <p>服务访问url</p>
     */
    public void setWebUIInfos(WebUIInfo [] WebUIInfos) {
        this.WebUIInfos = WebUIInfos;
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

    public DescribeDynamicInstanceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDynamicInstanceListResponse(DescribeDynamicInstanceListResponse source) {
        if (source.DynamicInstanceList != null) {
            this.DynamicInstanceList = new RayCluster[source.DynamicInstanceList.length];
            for (int i = 0; i < source.DynamicInstanceList.length; i++) {
                this.DynamicInstanceList[i] = new RayCluster(source.DynamicInstanceList[i]);
            }
        }
        if (source.WebUIInfos != null) {
            this.WebUIInfos = new WebUIInfo[source.WebUIInfos.length];
            for (int i = 0; i < source.WebUIInfos.length; i++) {
                this.WebUIInfos[i] = new WebUIInfo(source.WebUIInfos[i]);
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
        this.setParamArrayObj(map, prefix + "DynamicInstanceList.", this.DynamicInstanceList);
        this.setParamArrayObj(map, prefix + "WebUIInfos.", this.WebUIInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

