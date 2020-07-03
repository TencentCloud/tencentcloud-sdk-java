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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetInvokeTxRequest extends AbstractModel{

    /**
    * 模块名，固定字段：transaction
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：query_txid
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 业务所属通道名称，可在通道详情或列表中获取
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 执行该查询交易的节点名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
    */
    @SerializedName("PeerName")
    @Expose
    private String PeerName;

    /**
    * 执行该查询交易的节点所属组织名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
    */
    @SerializedName("PeerGroup")
    @Expose
    private String PeerGroup;

    /**
    * 交易ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 模块名，固定字段：transaction 
     * @return Module 模块名，固定字段：transaction
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：transaction
     * @param Module 模块名，固定字段：transaction
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：query_txid 
     * @return Operation 操作名，固定字段：query_txid
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：query_txid
     * @param Operation 操作名，固定字段：query_txid
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 区块链网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 区块链网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 业务所属通道名称，可在通道详情或列表中获取 
     * @return ChannelName 业务所属通道名称，可在通道详情或列表中获取
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 业务所属通道名称，可在通道详情或列表中获取
     * @param ChannelName 业务所属通道名称，可在通道详情或列表中获取
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 执行该查询交易的节点名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称 
     * @return PeerName 执行该查询交易的节点名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     */
    public String getPeerName() {
        return this.PeerName;
    }

    /**
     * Set 执行该查询交易的节点名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     * @param PeerName 执行该查询交易的节点名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     */
    public void setPeerName(String PeerName) {
        this.PeerName = PeerName;
    }

    /**
     * Get 执行该查询交易的节点所属组织名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称 
     * @return PeerGroup 执行该查询交易的节点所属组织名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     */
    public String getPeerGroup() {
        return this.PeerGroup;
    }

    /**
     * Set 执行该查询交易的节点所属组织名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     * @param PeerGroup 执行该查询交易的节点所属组织名称，可以在通道详情中获取该通道上的节点名称极其所属组织名称
     */
    public void setPeerGroup(String PeerGroup) {
        this.PeerGroup = PeerGroup;
    }

    /**
     * Get 交易ID 
     * @return TxId 交易ID
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set 交易ID
     * @param TxId 交易ID
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称 
     * @return GroupName 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 调用合约的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PeerName", this.PeerName);
        this.setParamSimple(map, prefix + "PeerGroup", this.PeerGroup);
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

