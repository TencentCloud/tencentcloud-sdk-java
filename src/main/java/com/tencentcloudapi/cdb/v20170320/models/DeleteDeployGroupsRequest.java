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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDeployGroupsRequest extends AbstractModel {

    /**
    * 要删除的置放群组 ID 列表。
    */
    @SerializedName("DeployGroupIds")
    @Expose
    private String [] DeployGroupIds;

    /**
     * Get 要删除的置放群组 ID 列表。 
     * @return DeployGroupIds 要删除的置放群组 ID 列表。
     */
    public String [] getDeployGroupIds() {
        return this.DeployGroupIds;
    }

    /**
     * Set 要删除的置放群组 ID 列表。
     * @param DeployGroupIds 要删除的置放群组 ID 列表。
     */
    public void setDeployGroupIds(String [] DeployGroupIds) {
        this.DeployGroupIds = DeployGroupIds;
    }

    public DeleteDeployGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeployGroupsRequest(DeleteDeployGroupsRequest source) {
        if (source.DeployGroupIds != null) {
            this.DeployGroupIds = new String[source.DeployGroupIds.length];
            for (int i = 0; i < source.DeployGroupIds.length; i++) {
                this.DeployGroupIds[i] = new String(source.DeployGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeployGroupIds.", this.DeployGroupIds);

    }
}

