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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllNodeResourceSpec extends AbstractModel{

    /**
    * 描述Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private NodeResourceSpec MasterResourceSpec;

    /**
    * 描述Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private NodeResourceSpec CoreResourceSpec;

    /**
    * 描述Taskr节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private NodeResourceSpec TaskResourceSpec;

    /**
    * 描述Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private NodeResourceSpec CommonResourceSpec;

    /**
    * Master节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * Corer节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Task节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Common节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
     * Get 描述Master节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterResourceSpec 描述Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeResourceSpec getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set 描述Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterResourceSpec 描述Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterResourceSpec(NodeResourceSpec MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get 描述Core节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreResourceSpec 描述Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeResourceSpec getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set 描述Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreResourceSpec 描述Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreResourceSpec(NodeResourceSpec CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get 描述Taskr节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskResourceSpec 描述Taskr节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeResourceSpec getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set 描述Taskr节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskResourceSpec 描述Taskr节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskResourceSpec(NodeResourceSpec TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get 描述Common节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonResourceSpec 描述Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeResourceSpec getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set 描述Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonResourceSpec 描述Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonResourceSpec(NodeResourceSpec CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * Get Master节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterCount Master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterCount Master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get Corer节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreCount Corer节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Corer节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreCount Corer节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Task节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount Task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount Task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Common节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonCount Common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set Common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonCount Common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonCount(Long CommonCount) {
        this.CommonCount = CommonCount;
    }

    public AllNodeResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllNodeResourceSpec(AllNodeResourceSpec source) {
        if (source.MasterResourceSpec != null) {
            this.MasterResourceSpec = new NodeResourceSpec(source.MasterResourceSpec);
        }
        if (source.CoreResourceSpec != null) {
            this.CoreResourceSpec = new NodeResourceSpec(source.CoreResourceSpec);
        }
        if (source.TaskResourceSpec != null) {
            this.TaskResourceSpec = new NodeResourceSpec(source.TaskResourceSpec);
        }
        if (source.CommonResourceSpec != null) {
            this.CommonResourceSpec = new NodeResourceSpec(source.CommonResourceSpec);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CommonCount != null) {
            this.CommonCount = new Long(source.CommonCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MasterResourceSpec.", this.MasterResourceSpec);
        this.setParamObj(map, prefix + "CoreResourceSpec.", this.CoreResourceSpec);
        this.setParamObj(map, prefix + "TaskResourceSpec.", this.TaskResourceSpec);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CommonCount", this.CommonCount);

    }
}

