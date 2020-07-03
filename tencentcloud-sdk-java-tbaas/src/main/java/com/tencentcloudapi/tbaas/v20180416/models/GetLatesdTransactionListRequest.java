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

public class GetLatesdTransactionListRequest extends AbstractModel{

    /**
    * 模块名称，固定字段：transaction
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名称，固定字段：latest_transaction_list
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 组织ID，固定字段：0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 通道ID，固定字段：0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 获取的最新交易的区块数量，取值范围1~5
    */
    @SerializedName("LatestBlockNumber")
    @Expose
    private Long LatestBlockNumber;

    /**
    * 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 需要查询的通道名称，可在通道详情或列表中获取
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要获取的起始交易偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 需要获取的交易数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 模块名称，固定字段：transaction 
     * @return Module 模块名称，固定字段：transaction
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名称，固定字段：transaction
     * @param Module 模块名称，固定字段：transaction
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名称，固定字段：latest_transaction_list 
     * @return Operation 操作名称，固定字段：latest_transaction_list
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名称，固定字段：latest_transaction_list
     * @param Operation 操作名称，固定字段：latest_transaction_list
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 组织ID，固定字段：0 
     * @return GroupId 组织ID，固定字段：0
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 组织ID，固定字段：0
     * @param GroupId 组织ID，固定字段：0
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道ID，固定字段：0 
     * @return ChannelId 通道ID，固定字段：0
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID，固定字段：0
     * @param ChannelId 通道ID，固定字段：0
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 获取的最新交易的区块数量，取值范围1~5 
     * @return LatestBlockNumber 获取的最新交易的区块数量，取值范围1~5
     */
    public Long getLatestBlockNumber() {
        return this.LatestBlockNumber;
    }

    /**
     * Set 获取的最新交易的区块数量，取值范围1~5
     * @param LatestBlockNumber 获取的最新交易的区块数量，取值范围1~5
     */
    public void setLatestBlockNumber(Long LatestBlockNumber) {
        this.LatestBlockNumber = LatestBlockNumber;
    }

    /**
     * Get 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称 
     * @return GroupName 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 需要查询的通道名称，可在通道详情或列表中获取 
     * @return ChannelName 需要查询的通道名称，可在通道详情或列表中获取
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 需要查询的通道名称，可在通道详情或列表中获取
     * @param ChannelName 需要查询的通道名称，可在通道详情或列表中获取
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
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
     * Get 需要获取的起始交易偏移 
     * @return Offset 需要获取的起始交易偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 需要获取的起始交易偏移
     * @param Offset 需要获取的起始交易偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 需要获取的交易数量 
     * @return Limit 需要获取的交易数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要获取的交易数量
     * @param Limit 需要获取的交易数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "LatestBlockNumber", this.LatestBlockNumber);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

