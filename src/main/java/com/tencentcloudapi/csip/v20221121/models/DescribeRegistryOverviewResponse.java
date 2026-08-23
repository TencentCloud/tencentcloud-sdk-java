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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegistryOverviewResponse extends AbstractModel {

    /**
    * <p>镜像仓库总数</p>
    */
    @SerializedName("RegistryCount")
    @Expose
    private Long RegistryCount;

    /**
    * <p>连接镜像仓库失败数</p>
    */
    @SerializedName("RegistryConnectFailedCount")
    @Expose
    private Long RegistryConnectFailedCount;

    /**
    * <p>镜像仓库类型数列表</p>
    */
    @SerializedName("RegistryTypeList")
    @Expose
    private ImageRegistryTypeCountItem [] RegistryTypeList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>镜像仓库总数</p> 
     * @return RegistryCount <p>镜像仓库总数</p>
     */
    public Long getRegistryCount() {
        return this.RegistryCount;
    }

    /**
     * Set <p>镜像仓库总数</p>
     * @param RegistryCount <p>镜像仓库总数</p>
     */
    public void setRegistryCount(Long RegistryCount) {
        this.RegistryCount = RegistryCount;
    }

    /**
     * Get <p>连接镜像仓库失败数</p> 
     * @return RegistryConnectFailedCount <p>连接镜像仓库失败数</p>
     */
    public Long getRegistryConnectFailedCount() {
        return this.RegistryConnectFailedCount;
    }

    /**
     * Set <p>连接镜像仓库失败数</p>
     * @param RegistryConnectFailedCount <p>连接镜像仓库失败数</p>
     */
    public void setRegistryConnectFailedCount(Long RegistryConnectFailedCount) {
        this.RegistryConnectFailedCount = RegistryConnectFailedCount;
    }

    /**
     * Get <p>镜像仓库类型数列表</p> 
     * @return RegistryTypeList <p>镜像仓库类型数列表</p>
     */
    public ImageRegistryTypeCountItem [] getRegistryTypeList() {
        return this.RegistryTypeList;
    }

    /**
     * Set <p>镜像仓库类型数列表</p>
     * @param RegistryTypeList <p>镜像仓库类型数列表</p>
     */
    public void setRegistryTypeList(ImageRegistryTypeCountItem [] RegistryTypeList) {
        this.RegistryTypeList = RegistryTypeList;
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

    public DescribeRegistryOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryOverviewResponse(DescribeRegistryOverviewResponse source) {
        if (source.RegistryCount != null) {
            this.RegistryCount = new Long(source.RegistryCount);
        }
        if (source.RegistryConnectFailedCount != null) {
            this.RegistryConnectFailedCount = new Long(source.RegistryConnectFailedCount);
        }
        if (source.RegistryTypeList != null) {
            this.RegistryTypeList = new ImageRegistryTypeCountItem[source.RegistryTypeList.length];
            for (int i = 0; i < source.RegistryTypeList.length; i++) {
                this.RegistryTypeList[i] = new ImageRegistryTypeCountItem(source.RegistryTypeList[i]);
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
        this.setParamSimple(map, prefix + "RegistryCount", this.RegistryCount);
        this.setParamSimple(map, prefix + "RegistryConnectFailedCount", this.RegistryConnectFailedCount);
        this.setParamArrayObj(map, prefix + "RegistryTypeList.", this.RegistryTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

