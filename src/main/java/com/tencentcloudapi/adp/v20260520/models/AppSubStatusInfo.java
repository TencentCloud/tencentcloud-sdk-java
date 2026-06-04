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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppSubStatusInfo extends AbstractModel {

    /**
    * 审批记录ID (当sub_status_list包含PUBLISH_APPROVING时有效)
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * 应用子状态列表 (可能同时处于多个子状态)
    */
    @SerializedName("SubStatusList")
    @Expose
    private Long [] SubStatusList;

    /**
     * Get 审批记录ID (当sub_status_list包含PUBLISH_APPROVING时有效) 
     * @return ApprovalId 审批记录ID (当sub_status_list包含PUBLISH_APPROVING时有效)
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set 审批记录ID (当sub_status_list包含PUBLISH_APPROVING时有效)
     * @param ApprovalId 审批记录ID (当sub_status_list包含PUBLISH_APPROVING时有效)
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get 应用子状态列表 (可能同时处于多个子状态) 
     * @return SubStatusList 应用子状态列表 (可能同时处于多个子状态)
     */
    public Long [] getSubStatusList() {
        return this.SubStatusList;
    }

    /**
     * Set 应用子状态列表 (可能同时处于多个子状态)
     * @param SubStatusList 应用子状态列表 (可能同时处于多个子状态)
     */
    public void setSubStatusList(Long [] SubStatusList) {
        this.SubStatusList = SubStatusList;
    }

    public AppSubStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppSubStatusInfo(AppSubStatusInfo source) {
        if (source.ApprovalId != null) {
            this.ApprovalId = new String(source.ApprovalId);
        }
        if (source.SubStatusList != null) {
            this.SubStatusList = new Long[source.SubStatusList.length];
            for (int i = 0; i < source.SubStatusList.length; i++) {
                this.SubStatusList[i] = new Long(source.SubStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalId", this.ApprovalId);
        this.setParamArraySimple(map, prefix + "SubStatusList.", this.SubStatusList);

    }
}

