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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDeploymentRequest extends AbstractModel {

    /**
    * <p>待删除的 Deployment ID。</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
     * Get <p>待删除的 Deployment ID。</p> 
     * @return DeploymentId <p>待删除的 Deployment ID。</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>待删除的 Deployment ID。</p>
     * @param DeploymentId <p>待删除的 Deployment ID。</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    public DeleteDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeploymentRequest(DeleteDeploymentRequest source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);

    }
}

