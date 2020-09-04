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

public class CurrentOp extends AbstractModel{

    /**
    * 操作序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpId")
    @Expose
    private Long OpId;

    /**
    * 操作所在的命名空间，形式如db.collection
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * 操作执行语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 操作类型，可能的取值：aggregate、count、delete、distinct、find、findAndModify、getMore、insert、mapReduce、update和command
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 操作所在的分片名称
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 筛选条件，节点状态，可能的取值为：Primary、Secondary
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 操作详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 操作所在的节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 操作已执行时间（ms）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicrosecsRunning")
    @Expose
    private Long MicrosecsRunning;

    /**
     * Get 操作序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpId 操作序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpId() {
        return this.OpId;
    }

    /**
     * Set 操作序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpId 操作序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpId(Long OpId) {
        this.OpId = OpId;
    }

    /**
     * Get 操作所在的命名空间，形式如db.collection
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ns 操作所在的命名空间，形式如db.collection
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set 操作所在的命名空间，形式如db.collection
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ns 操作所在的命名空间，形式如db.collection
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get 操作执行语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Query 操作执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 操作执行语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Query 操作执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 操作类型，可能的取值：aggregate、count、delete、distinct、find、findAndModify、getMore、insert、mapReduce、update和command
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Op 操作类型，可能的取值：aggregate、count、delete、distinct、find、findAndModify、getMore、insert、mapReduce、update和command
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作类型，可能的取值：aggregate、count、delete、distinct、find、findAndModify、getMore、insert、mapReduce、update和command
注意：此字段可能返回 null，表示取不到有效值。
     * @param Op 操作类型，可能的取值：aggregate、count、delete、distinct、find、findAndModify、getMore、insert、mapReduce、update和command
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 操作所在的分片名称 
     * @return ReplicaSetName 操作所在的分片名称
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set 操作所在的分片名称
     * @param ReplicaSetName 操作所在的分片名称
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get 筛选条件，节点状态，可能的取值为：Primary、Secondary
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 筛选条件，节点状态，可能的取值为：Primary、Secondary
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 筛选条件，节点状态，可能的取值为：Primary、Secondary
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 筛选条件，节点状态，可能的取值为：Primary、Secondary
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 操作详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 操作详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 操作详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 操作所在的节点名称 
     * @return NodeName 操作所在的节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 操作所在的节点名称
     * @param NodeName 操作所在的节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 操作已执行时间（ms）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicrosecsRunning 操作已执行时间（ms）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMicrosecsRunning() {
        return this.MicrosecsRunning;
    }

    /**
     * Set 操作已执行时间（ms）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicrosecsRunning 操作已执行时间（ms）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicrosecsRunning(Long MicrosecsRunning) {
        this.MicrosecsRunning = MicrosecsRunning;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpId", this.OpId);
        this.setParamSimple(map, prefix + "Ns", this.Ns);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "MicrosecsRunning", this.MicrosecsRunning);

    }
}

