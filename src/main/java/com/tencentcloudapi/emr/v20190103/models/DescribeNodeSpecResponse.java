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

public class DescribeNodeSpecResponse extends AbstractModel {

    /**
    * <p>节点规格类型</p>
    */
    @SerializedName("NodeSpecs")
    @Expose
    private DescribeNodeSpec [] NodeSpecs;

    /**
    * <p>机型架构信息</p>
    */
    @SerializedName("Architectures")
    @Expose
    private ArchitectureInfo [] Architectures;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>节点规格类型</p> 
     * @return NodeSpecs <p>节点规格类型</p>
     */
    public DescribeNodeSpec [] getNodeSpecs() {
        return this.NodeSpecs;
    }

    /**
     * Set <p>节点规格类型</p>
     * @param NodeSpecs <p>节点规格类型</p>
     */
    public void setNodeSpecs(DescribeNodeSpec [] NodeSpecs) {
        this.NodeSpecs = NodeSpecs;
    }

    /**
     * Get <p>机型架构信息</p> 
     * @return Architectures <p>机型架构信息</p>
     */
    public ArchitectureInfo [] getArchitectures() {
        return this.Architectures;
    }

    /**
     * Set <p>机型架构信息</p>
     * @param Architectures <p>机型架构信息</p>
     */
    public void setArchitectures(ArchitectureInfo [] Architectures) {
        this.Architectures = Architectures;
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

    public DescribeNodeSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeSpecResponse(DescribeNodeSpecResponse source) {
        if (source.NodeSpecs != null) {
            this.NodeSpecs = new DescribeNodeSpec[source.NodeSpecs.length];
            for (int i = 0; i < source.NodeSpecs.length; i++) {
                this.NodeSpecs[i] = new DescribeNodeSpec(source.NodeSpecs[i]);
            }
        }
        if (source.Architectures != null) {
            this.Architectures = new ArchitectureInfo[source.Architectures.length];
            for (int i = 0; i < source.Architectures.length; i++) {
                this.Architectures[i] = new ArchitectureInfo(source.Architectures[i]);
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
        this.setParamArrayObj(map, prefix + "NodeSpecs.", this.NodeSpecs);
        this.setParamArrayObj(map, prefix + "Architectures.", this.Architectures);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

