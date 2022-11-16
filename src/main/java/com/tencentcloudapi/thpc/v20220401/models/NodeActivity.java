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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeActivity extends AbstractModel{

    /**
    * 节点活动所在的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
    * 节点活动状态。取值范围：<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>FAILED：活动失败
    */
    @SerializedName("NodeActivityStatus")
    @Expose
    private String NodeActivityStatus;

    /**
    * 节点活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeActivityStatusCode")
    @Expose
    private String NodeActivityStatusCode;

    /**
    * 节点活动状态原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeActivityStatusReason")
    @Expose
    private String NodeActivityStatusReason;

    /**
     * Get 节点活动所在的实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInstanceId 节点活动所在的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set 节点活动所在的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInstanceId 节点活动所在的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Get 节点活动状态。取值范围：<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>FAILED：活动失败 
     * @return NodeActivityStatus 节点活动状态。取值范围：<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>FAILED：活动失败
     */
    public String getNodeActivityStatus() {
        return this.NodeActivityStatus;
    }

    /**
     * Set 节点活动状态。取值范围：<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>FAILED：活动失败
     * @param NodeActivityStatus 节点活动状态。取值范围：<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>FAILED：活动失败
     */
    public void setNodeActivityStatus(String NodeActivityStatus) {
        this.NodeActivityStatus = NodeActivityStatus;
    }

    /**
     * Get 节点活动状态码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeActivityStatusCode 节点活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeActivityStatusCode() {
        return this.NodeActivityStatusCode;
    }

    /**
     * Set 节点活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeActivityStatusCode 节点活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeActivityStatusCode(String NodeActivityStatusCode) {
        this.NodeActivityStatusCode = NodeActivityStatusCode;
    }

    /**
     * Get 节点活动状态原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeActivityStatusReason 节点活动状态原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeActivityStatusReason() {
        return this.NodeActivityStatusReason;
    }

    /**
     * Set 节点活动状态原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeActivityStatusReason 节点活动状态原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeActivityStatusReason(String NodeActivityStatusReason) {
        this.NodeActivityStatusReason = NodeActivityStatusReason;
    }

    public NodeActivity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeActivity(NodeActivity source) {
        if (source.NodeInstanceId != null) {
            this.NodeInstanceId = new String(source.NodeInstanceId);
        }
        if (source.NodeActivityStatus != null) {
            this.NodeActivityStatus = new String(source.NodeActivityStatus);
        }
        if (source.NodeActivityStatusCode != null) {
            this.NodeActivityStatusCode = new String(source.NodeActivityStatusCode);
        }
        if (source.NodeActivityStatusReason != null) {
            this.NodeActivityStatusReason = new String(source.NodeActivityStatusReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeInstanceId", this.NodeInstanceId);
        this.setParamSimple(map, prefix + "NodeActivityStatus", this.NodeActivityStatus);
        this.setParamSimple(map, prefix + "NodeActivityStatusCode", this.NodeActivityStatusCode);
        this.setParamSimple(map, prefix + "NodeActivityStatusReason", this.NodeActivityStatusReason);

    }
}

