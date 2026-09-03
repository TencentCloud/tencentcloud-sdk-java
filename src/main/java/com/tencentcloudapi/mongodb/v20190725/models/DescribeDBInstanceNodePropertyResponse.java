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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceNodePropertyResponse extends AbstractModel {

    /**
    * <p>Mongos节点属性。</p>
    */
    @SerializedName("Mongos")
    @Expose
    private NodeProperty [] Mongos;

    /**
    * <p>副本集节点信息。</p>
    */
    @SerializedName("ReplicateSets")
    @Expose
    private ReplicateSetInfo [] ReplicateSets;

    /**
    * <p>Dynamo节点信息</p>
    */
    @SerializedName("DynamoProxies")
    @Expose
    private NodeProperty [] DynamoProxies;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Mongos节点属性。</p> 
     * @return Mongos <p>Mongos节点属性。</p>
     */
    public NodeProperty [] getMongos() {
        return this.Mongos;
    }

    /**
     * Set <p>Mongos节点属性。</p>
     * @param Mongos <p>Mongos节点属性。</p>
     */
    public void setMongos(NodeProperty [] Mongos) {
        this.Mongos = Mongos;
    }

    /**
     * Get <p>副本集节点信息。</p> 
     * @return ReplicateSets <p>副本集节点信息。</p>
     */
    public ReplicateSetInfo [] getReplicateSets() {
        return this.ReplicateSets;
    }

    /**
     * Set <p>副本集节点信息。</p>
     * @param ReplicateSets <p>副本集节点信息。</p>
     */
    public void setReplicateSets(ReplicateSetInfo [] ReplicateSets) {
        this.ReplicateSets = ReplicateSets;
    }

    /**
     * Get <p>Dynamo节点信息</p> 
     * @return DynamoProxies <p>Dynamo节点信息</p>
     */
    public NodeProperty [] getDynamoProxies() {
        return this.DynamoProxies;
    }

    /**
     * Set <p>Dynamo节点信息</p>
     * @param DynamoProxies <p>Dynamo节点信息</p>
     */
    public void setDynamoProxies(NodeProperty [] DynamoProxies) {
        this.DynamoProxies = DynamoProxies;
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

    public DescribeDBInstanceNodePropertyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceNodePropertyResponse(DescribeDBInstanceNodePropertyResponse source) {
        if (source.Mongos != null) {
            this.Mongos = new NodeProperty[source.Mongos.length];
            for (int i = 0; i < source.Mongos.length; i++) {
                this.Mongos[i] = new NodeProperty(source.Mongos[i]);
            }
        }
        if (source.ReplicateSets != null) {
            this.ReplicateSets = new ReplicateSetInfo[source.ReplicateSets.length];
            for (int i = 0; i < source.ReplicateSets.length; i++) {
                this.ReplicateSets[i] = new ReplicateSetInfo(source.ReplicateSets[i]);
            }
        }
        if (source.DynamoProxies != null) {
            this.DynamoProxies = new NodeProperty[source.DynamoProxies.length];
            for (int i = 0; i < source.DynamoProxies.length; i++) {
                this.DynamoProxies[i] = new NodeProperty(source.DynamoProxies[i]);
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
        this.setParamArrayObj(map, prefix + "Mongos.", this.Mongos);
        this.setParamArrayObj(map, prefix + "ReplicateSets.", this.ReplicateSets);
        this.setParamArrayObj(map, prefix + "DynamoProxies.", this.DynamoProxies);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

