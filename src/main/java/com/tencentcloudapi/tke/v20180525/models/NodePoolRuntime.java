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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePoolRuntime extends AbstractModel {

    /**
    * 节点池ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeType")
    @Expose
    private String RuntimeType;

    /**
    * 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 节点池名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolName")
    @Expose
    private String NodePoolName;

    /**
     * Get 节点池ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolId 节点池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolId 节点池ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 运行时类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeType(String RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get 运行时版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeVersion 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeVersion 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 节点池名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolName 节点池名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolName() {
        return this.NodePoolName;
    }

    /**
     * Set 节点池名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolName 节点池名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolName(String NodePoolName) {
        this.NodePoolName = NodePoolName;
    }

    public NodePoolRuntime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePoolRuntime(NodePoolRuntime source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.RuntimeType != null) {
            this.RuntimeType = new String(source.RuntimeType);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.NodePoolName != null) {
            this.NodePoolName = new String(source.NodePoolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "NodePoolName", this.NodePoolName);

    }
}

