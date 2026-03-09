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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGovernanceLaneGroupsRequest extends AbstractModel {

    /**
    * 引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 泳道组规则列表
    */
    @SerializedName("LaneGroups")
    @Expose
    private GovernanceLaneGroup [] LaneGroups;

    /**
     * Get 引擎实例ID 
     * @return InstanceId 引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 引擎实例ID
     * @param InstanceId 引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 泳道组规则列表 
     * @return LaneGroups 泳道组规则列表
     */
    public GovernanceLaneGroup [] getLaneGroups() {
        return this.LaneGroups;
    }

    /**
     * Set 泳道组规则列表
     * @param LaneGroups 泳道组规则列表
     */
    public void setLaneGroups(GovernanceLaneGroup [] LaneGroups) {
        this.LaneGroups = LaneGroups;
    }

    public CreateGovernanceLaneGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGovernanceLaneGroupsRequest(CreateGovernanceLaneGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LaneGroups != null) {
            this.LaneGroups = new GovernanceLaneGroup[source.LaneGroups.length];
            for (int i = 0; i < source.LaneGroups.length; i++) {
                this.LaneGroups[i] = new GovernanceLaneGroup(source.LaneGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "LaneGroups.", this.LaneGroups);

    }
}

