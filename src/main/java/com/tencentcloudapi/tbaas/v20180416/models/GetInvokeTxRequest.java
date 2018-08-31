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

public class GetInvokeTxRequest  extends AbstractModel{

    /**
    * 模块名
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * cluster标识
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 节点名称
    */
    @SerializedName("PeerName")
    @Expose
    private String PeerName;

    /**
    * 节点所属组织名称
    */
    @SerializedName("PeerGroup")
    @Expose
    private String PeerGroup;

    /**
    * 事务ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
     * 获取模块名
     * @return Module 模块名
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名
     * @param Module 模块名
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取cluster标识
     * @return ClusterId cluster标识
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置cluster标识
     * @param ClusterId cluster标识
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取通道名称
     * @return ChannelName 通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * 设置通道名称
     * @param ChannelName 通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * 获取节点名称
     * @return PeerName 节点名称
     */
    public String getPeerName() {
        return this.PeerName;
    }

    /**
     * 设置节点名称
     * @param PeerName 节点名称
     */
    public void setPeerName(String PeerName) {
        this.PeerName = PeerName;
    }

    /**
     * 获取节点所属组织名称
     * @return PeerGroup 节点所属组织名称
     */
    public String getPeerGroup() {
        return this.PeerGroup;
    }

    /**
     * 设置节点所属组织名称
     * @param PeerGroup 节点所属组织名称
     */
    public void setPeerGroup(String PeerGroup) {
        this.PeerGroup = PeerGroup;
    }

    /**
     * 获取事务ID
     * @return TxId 事务ID
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * 设置事务ID
     * @param TxId 事务ID
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PeerName", this.PeerName);
        this.setParamSimple(map, prefix + "PeerGroup", this.PeerGroup);
        this.setParamSimple(map, prefix + "TxId", this.TxId);

    }
}

