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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddInstanceResult extends AbstractModel{

    /**
    * 添加集群失败的节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * 添加集群成功的节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccInstanceIds")
    @Expose
    private String [] SuccInstanceIds;

    /**
    * 添加集群超时的节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutInstanceIds")
    @Expose
    private String [] TimeoutInstanceIds;

    /**
     * Get 添加集群失败的节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedInstanceIds 添加集群失败的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set 添加集群失败的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedInstanceIds 添加集群失败的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
    }

    /**
     * Get 添加集群成功的节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccInstanceIds 添加集群成功的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccInstanceIds() {
        return this.SuccInstanceIds;
    }

    /**
     * Set 添加集群成功的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccInstanceIds 添加集群成功的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccInstanceIds(String [] SuccInstanceIds) {
        this.SuccInstanceIds = SuccInstanceIds;
    }

    /**
     * Get 添加集群超时的节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutInstanceIds 添加集群超时的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTimeoutInstanceIds() {
        return this.TimeoutInstanceIds;
    }

    /**
     * Set 添加集群超时的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutInstanceIds 添加集群超时的节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutInstanceIds(String [] TimeoutInstanceIds) {
        this.TimeoutInstanceIds = TimeoutInstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamArraySimple(map, prefix + "SuccInstanceIds.", this.SuccInstanceIds);
        this.setParamArraySimple(map, prefix + "TimeoutInstanceIds.", this.TimeoutInstanceIds);

    }
}

