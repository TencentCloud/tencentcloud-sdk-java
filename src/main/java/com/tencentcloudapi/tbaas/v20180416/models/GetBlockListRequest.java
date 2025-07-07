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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetBlockListRequest extends AbstractModel {

    /**
    * 模块名称，固定字段：block
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名称，固定字段：block_list
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 通道ID，固定字段：0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 组织ID，固定字段：0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 需要查询的通道名称，可在通道详情或列表中获取
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

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
     * Get 模块名称，固定字段：block 
     * @return Module 模块名称，固定字段：block
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名称，固定字段：block
     * @param Module 模块名称，固定字段：block
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名称，固定字段：block_list 
     * @return Operation 操作名称，固定字段：block_list
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名称，固定字段：block_list
     * @param Operation 操作名称，固定字段：block_list
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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

    public GetBlockListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBlockListRequest(GetBlockListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

