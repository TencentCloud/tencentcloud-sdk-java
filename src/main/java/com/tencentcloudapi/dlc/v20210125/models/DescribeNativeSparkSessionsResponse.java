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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNativeSparkSessionsResponse extends AbstractModel {

    /**
    * spark session列表
    */
    @SerializedName("SparkSessionsList")
    @Expose
    private SparkSessionInfo [] SparkSessionsList;

    /**
    * 资源组总规格
    */
    @SerializedName("TotalSpec")
    @Expose
    private Long TotalSpec;

    /**
    * 资源组当前可用规格
    */
    @SerializedName("TotalAvailable")
    @Expose
    private Long TotalAvailable;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get spark session列表 
     * @return SparkSessionsList spark session列表
     */
    public SparkSessionInfo [] getSparkSessionsList() {
        return this.SparkSessionsList;
    }

    /**
     * Set spark session列表
     * @param SparkSessionsList spark session列表
     */
    public void setSparkSessionsList(SparkSessionInfo [] SparkSessionsList) {
        this.SparkSessionsList = SparkSessionsList;
    }

    /**
     * Get 资源组总规格 
     * @return TotalSpec 资源组总规格
     */
    public Long getTotalSpec() {
        return this.TotalSpec;
    }

    /**
     * Set 资源组总规格
     * @param TotalSpec 资源组总规格
     */
    public void setTotalSpec(Long TotalSpec) {
        this.TotalSpec = TotalSpec;
    }

    /**
     * Get 资源组当前可用规格 
     * @return TotalAvailable 资源组当前可用规格
     */
    public Long getTotalAvailable() {
        return this.TotalAvailable;
    }

    /**
     * Set 资源组当前可用规格
     * @param TotalAvailable 资源组当前可用规格
     */
    public void setTotalAvailable(Long TotalAvailable) {
        this.TotalAvailable = TotalAvailable;
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

    public DescribeNativeSparkSessionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNativeSparkSessionsResponse(DescribeNativeSparkSessionsResponse source) {
        if (source.SparkSessionsList != null) {
            this.SparkSessionsList = new SparkSessionInfo[source.SparkSessionsList.length];
            for (int i = 0; i < source.SparkSessionsList.length; i++) {
                this.SparkSessionsList[i] = new SparkSessionInfo(source.SparkSessionsList[i]);
            }
        }
        if (source.TotalSpec != null) {
            this.TotalSpec = new Long(source.TotalSpec);
        }
        if (source.TotalAvailable != null) {
            this.TotalAvailable = new Long(source.TotalAvailable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SparkSessionsList.", this.SparkSessionsList);
        this.setParamSimple(map, prefix + "TotalSpec", this.TotalSpec);
        this.setParamSimple(map, prefix + "TotalAvailable", this.TotalAvailable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

