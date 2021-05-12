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

public class GetPeerLogForUserRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：peer_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：peer_log_for_user
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
    * 调用合约的组织名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 节点名称
    */
    @SerializedName("PeerName")
    @Expose
    private String PeerName;

    /**
    * 日志开始时间，如"2020-11-24 19:49:25"
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 返回日志行数的最大值，系统设定该参数最大为1000，且一行日志的最大字节数是500，即最大返回50万个字节数的日志数据
    */
    @SerializedName("RowNum")
    @Expose
    private Long RowNum;

    /**
     * Get 模块名，本接口取值：peer_mng 
     * @return Module 模块名，本接口取值：peer_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：peer_mng
     * @param Module 模块名，本接口取值：peer_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：peer_log_for_user 
     * @return Operation 操作名，本接口取值：peer_log_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：peer_log_for_user
     * @param Operation 操作名，本接口取值：peer_log_for_user
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
     * Get 调用合约的组织名称 
     * @return GroupName 调用合约的组织名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 调用合约的组织名称
     * @param GroupName 调用合约的组织名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 节点名称 
     * @return PeerName 节点名称
     */
    public String getPeerName() {
        return this.PeerName;
    }

    /**
     * Set 节点名称
     * @param PeerName 节点名称
     */
    public void setPeerName(String PeerName) {
        this.PeerName = PeerName;
    }

    /**
     * Get 日志开始时间，如"2020-11-24 19:49:25" 
     * @return BeginTime 日志开始时间，如"2020-11-24 19:49:25"
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 日志开始时间，如"2020-11-24 19:49:25"
     * @param BeginTime 日志开始时间，如"2020-11-24 19:49:25"
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 返回日志行数的最大值，系统设定该参数最大为1000，且一行日志的最大字节数是500，即最大返回50万个字节数的日志数据 
     * @return RowNum 返回日志行数的最大值，系统设定该参数最大为1000，且一行日志的最大字节数是500，即最大返回50万个字节数的日志数据
     */
    public Long getRowNum() {
        return this.RowNum;
    }

    /**
     * Set 返回日志行数的最大值，系统设定该参数最大为1000，且一行日志的最大字节数是500，即最大返回50万个字节数的日志数据
     * @param RowNum 返回日志行数的最大值，系统设定该参数最大为1000，且一行日志的最大字节数是500，即最大返回50万个字节数的日志数据
     */
    public void setRowNum(Long RowNum) {
        this.RowNum = RowNum;
    }

    public GetPeerLogForUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPeerLogForUserRequest(GetPeerLogForUserRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PeerName != null) {
            this.PeerName = new String(source.PeerName);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.RowNum != null) {
            this.RowNum = new Long(source.RowNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PeerName", this.PeerName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "RowNum", this.RowNum);

    }
}

