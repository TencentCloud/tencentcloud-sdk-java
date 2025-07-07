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

public class DeletePolicyGroupRequest extends AbstractModel {

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id,即1.0的告警策略id,可以从策略详情获取
    */
    @SerializedName("GroupId")
    @Expose
    private Long [] GroupId;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略组id,即1.0的告警策略id,可以从策略详情获取 
     * @return GroupId 策略组id,即1.0的告警策略id,可以从策略详情获取
     */
    public Long [] getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id,即1.0的告警策略id,可以从策略详情获取
     * @param GroupId 策略组id,即1.0的告警策略id,可以从策略详情获取
     */
    public void setGroupId(Long [] GroupId) {
        this.GroupId = GroupId;
    }

    public DeletePolicyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePolicyGroupRequest(DeletePolicyGroupRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long[source.GroupId.length];
            for (int i = 0; i < source.GroupId.length; i++) {
                this.GroupId[i] = new Long(source.GroupId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "GroupId.", this.GroupId);

    }
}

