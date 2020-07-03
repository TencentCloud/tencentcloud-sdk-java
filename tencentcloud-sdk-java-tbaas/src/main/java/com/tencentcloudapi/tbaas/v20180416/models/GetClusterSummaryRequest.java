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

public class GetClusterSummaryRequest extends AbstractModel{

    /**
    * 模块名称，固定字段：cluster_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名称，固定字段：cluster_summary
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
    * 组织ID，固定字段：0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 调用接口的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 模块名称，固定字段：cluster_mng 
     * @return Module 模块名称，固定字段：cluster_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名称，固定字段：cluster_mng
     * @param Module 模块名称，固定字段：cluster_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名称，固定字段：cluster_summary 
     * @return Operation 操作名称，固定字段：cluster_summary
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名称，固定字段：cluster_summary
     * @param Operation 操作名称，固定字段：cluster_summary
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

