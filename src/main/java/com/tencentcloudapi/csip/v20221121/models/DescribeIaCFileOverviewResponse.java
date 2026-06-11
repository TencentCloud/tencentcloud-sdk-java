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

public class DescribeIaCFileOverviewResponse extends AbstractModel {

    /**
    * <p>文件数量</p>
    */
    @SerializedName("TotalFile")
    @Expose
    private Long TotalFile;

    /**
    * <p>风险文件数量(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
    */
    @SerializedName("RiskFile")
    @Expose
    private KeyValueInt [] RiskFile;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文件数量</p> 
     * @return TotalFile <p>文件数量</p>
     */
    public Long getTotalFile() {
        return this.TotalFile;
    }

    /**
     * Set <p>文件数量</p>
     * @param TotalFile <p>文件数量</p>
     */
    public void setTotalFile(Long TotalFile) {
        this.TotalFile = TotalFile;
    }

    /**
     * Get <p>风险文件数量(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p> 
     * @return RiskFile <p>风险文件数量(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     */
    public KeyValueInt [] getRiskFile() {
        return this.RiskFile;
    }

    /**
     * Set <p>风险文件数量(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     * @param RiskFile <p>风险文件数量(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     */
    public void setRiskFile(KeyValueInt [] RiskFile) {
        this.RiskFile = RiskFile;
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

    public DescribeIaCFileOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIaCFileOverviewResponse(DescribeIaCFileOverviewResponse source) {
        if (source.TotalFile != null) {
            this.TotalFile = new Long(source.TotalFile);
        }
        if (source.RiskFile != null) {
            this.RiskFile = new KeyValueInt[source.RiskFile.length];
            for (int i = 0; i < source.RiskFile.length; i++) {
                this.RiskFile[i] = new KeyValueInt(source.RiskFile[i]);
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
        this.setParamSimple(map, prefix + "TotalFile", this.TotalFile);
        this.setParamArrayObj(map, prefix + "RiskFile.", this.RiskFile);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

