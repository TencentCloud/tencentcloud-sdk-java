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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePrometheusAlertGroupStateRequest extends AbstractModel {

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 告警分组ID列表，形如alert-xxxx
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 告警分组状态
2 -- 启用
3 -- 禁用
    */
    @SerializedName("GroupState")
    @Expose
    private Long GroupState;

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 告警分组ID列表，形如alert-xxxx 
     * @return GroupIds 告警分组ID列表，形如alert-xxxx
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 告警分组ID列表，形如alert-xxxx
     * @param GroupIds 告警分组ID列表，形如alert-xxxx
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 告警分组状态
2 -- 启用
3 -- 禁用 
     * @return GroupState 告警分组状态
2 -- 启用
3 -- 禁用
     */
    public Long getGroupState() {
        return this.GroupState;
    }

    /**
     * Set 告警分组状态
2 -- 启用
3 -- 禁用
     * @param GroupState 告警分组状态
2 -- 启用
3 -- 禁用
     */
    public void setGroupState(Long GroupState) {
        this.GroupState = GroupState;
    }

    public UpdatePrometheusAlertGroupStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAlertGroupStateRequest(UpdatePrometheusAlertGroupStateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.GroupState != null) {
            this.GroupState = new Long(source.GroupState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "GroupState", this.GroupState);

    }
}

