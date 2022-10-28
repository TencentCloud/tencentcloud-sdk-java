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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceNodePropertyResponse extends AbstractModel{

    /**
    * Mongos节点属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mongos")
    @Expose
    private NodeProperty [] Mongos;

    /**
    * 副本集节点信息。
    */
    @SerializedName("ReplicateSets")
    @Expose
    private ReplicateSetInfo [] ReplicateSets;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Mongos节点属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mongos Mongos节点属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeProperty [] getMongos() {
        return this.Mongos;
    }

    /**
     * Set Mongos节点属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mongos Mongos节点属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongos(NodeProperty [] Mongos) {
        this.Mongos = Mongos;
    }

    /**
     * Get 副本集节点信息。 
     * @return ReplicateSets 副本集节点信息。
     */
    public ReplicateSetInfo [] getReplicateSets() {
        return this.ReplicateSets;
    }

    /**
     * Set 副本集节点信息。
     * @param ReplicateSets 副本集节点信息。
     */
    public void setReplicateSets(ReplicateSetInfo [] ReplicateSets) {
        this.ReplicateSets = ReplicateSets;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

