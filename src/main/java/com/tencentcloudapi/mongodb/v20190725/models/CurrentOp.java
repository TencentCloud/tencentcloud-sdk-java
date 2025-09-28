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

public class CurrentOp extends AbstractModel {

    /**
    * 操作序号。
    */
    @SerializedName("OpId")
    @Expose
    private Long OpId;

    /**
    * 操作所在的命名空间，形式如db.collection。
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * 操作执行语句。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 操作类型。
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 操作所在的分片名称。
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 操作所在的节点名称。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 操作详细信息。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 节点角色。
- primary：主节点。
- secondary：从节点。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 操作已执行时间（ms）。
    */
    @SerializedName("MicrosecsRunning")
    @Expose
    private Long MicrosecsRunning;

    /**
    * 当前操作所在节点信息。
    */
    @SerializedName("ExecNode")
    @Expose
    private String ExecNode;

    /**
     * Get 操作序号。 
     * @return OpId 操作序号。
     */
    public Long getOpId() {
        return this.OpId;
    }

    /**
     * Set 操作序号。
     * @param OpId 操作序号。
     */
    public void setOpId(Long OpId) {
        this.OpId = OpId;
    }

    /**
     * Get 操作所在的命名空间，形式如db.collection。 
     * @return Ns 操作所在的命名空间，形式如db.collection。
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set 操作所在的命名空间，形式如db.collection。
     * @param Ns 操作所在的命名空间，形式如db.collection。
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get 操作执行语句。 
     * @return Query 操作执行语句。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 操作执行语句。
     * @param Query 操作执行语句。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 操作类型。
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。 
     * @return Op 操作类型。
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作类型。
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     * @param Op 操作类型。
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 操作所在的分片名称。 
     * @return ReplicaSetName 操作所在的分片名称。
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set 操作所在的分片名称。
     * @param ReplicaSetName 操作所在的分片名称。
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get 操作所在的节点名称。 
     * @return NodeName 操作所在的节点名称。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 操作所在的节点名称。
     * @param NodeName 操作所在的节点名称。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 操作详细信息。 
     * @return Operation 操作详细信息。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作详细信息。
     * @param Operation 操作详细信息。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 节点角色。
- primary：主节点。
- secondary：从节点。 
     * @return State 节点角色。
- primary：主节点。
- secondary：从节点。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 节点角色。
- primary：主节点。
- secondary：从节点。
     * @param State 节点角色。
- primary：主节点。
- secondary：从节点。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 操作已执行时间（ms）。 
     * @return MicrosecsRunning 操作已执行时间（ms）。
     */
    public Long getMicrosecsRunning() {
        return this.MicrosecsRunning;
    }

    /**
     * Set 操作已执行时间（ms）。
     * @param MicrosecsRunning 操作已执行时间（ms）。
     */
    public void setMicrosecsRunning(Long MicrosecsRunning) {
        this.MicrosecsRunning = MicrosecsRunning;
    }

    /**
     * Get 当前操作所在节点信息。 
     * @return ExecNode 当前操作所在节点信息。
     */
    public String getExecNode() {
        return this.ExecNode;
    }

    /**
     * Set 当前操作所在节点信息。
     * @param ExecNode 当前操作所在节点信息。
     */
    public void setExecNode(String ExecNode) {
        this.ExecNode = ExecNode;
    }

    public CurrentOp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CurrentOp(CurrentOp source) {
        if (source.OpId != null) {
            this.OpId = new Long(source.OpId);
        }
        if (source.Ns != null) {
            this.Ns = new String(source.Ns);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.MicrosecsRunning != null) {
            this.MicrosecsRunning = new Long(source.MicrosecsRunning);
        }
        if (source.ExecNode != null) {
            this.ExecNode = new String(source.ExecNode);
        }
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
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MicrosecsRunning", this.MicrosecsRunning);
        this.setParamSimple(map, prefix + "ExecNode", this.ExecNode);

    }
}

