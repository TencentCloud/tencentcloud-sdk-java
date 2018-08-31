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

public class QueryRequest  extends AbstractModel{

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
    * 合约名称
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 使用的节点名称及对应组织名称
    */
    @SerializedName("Peers")
    @Expose
    private PeerSet [] Peers;

    /**
    * 函数名
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * 函数参数列表
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

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
     * 获取合约名称
     * @return ChaincodeName 合约名称
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * 设置合约名称
     * @param ChaincodeName 合约名称
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
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
     * 获取使用的节点名称及对应组织名称
     * @return Peers 使用的节点名称及对应组织名称
     */
    public PeerSet [] getPeers() {
        return this.Peers;
    }

    /**
     * 设置使用的节点名称及对应组织名称
     * @param Peers 使用的节点名称及对应组织名称
     */
    public void setPeers(PeerSet [] Peers) {
        this.Peers = Peers;
    }

    /**
     * 获取函数名
     * @return FuncName 函数名
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * 设置函数名
     * @param FuncName 函数名
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * 获取函数参数列表
     * @return Args 函数参数列表
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * 设置函数参数列表
     * @param Args 函数参数列表
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArrayObj(map, prefix + "Peers.", this.Peers);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);

    }
}

