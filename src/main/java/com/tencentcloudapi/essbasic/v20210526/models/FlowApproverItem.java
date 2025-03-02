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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverItem extends AbstractModel {

    /**
    * 合同编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署方信息，如角色ID、角色名称等
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverItem [] Approvers;

    /**
     * Get 合同编号 
     * @return FlowId 合同编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同编号
     * @param FlowId 合同编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署方信息，如角色ID、角色名称等 
     * @return Approvers 签署方信息，如角色ID、角色名称等
     */
    public ApproverItem [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署方信息，如角色ID、角色名称等
     * @param Approvers 签署方信息，如角色ID、角色名称等
     */
    public void setApprovers(ApproverItem [] Approvers) {
        this.Approvers = Approvers;
    }

    public FlowApproverItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverItem(FlowApproverItem source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverItem[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverItem(source.Approvers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);

    }
}

