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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployCertificateRecordRollbackRequest extends AbstractModel {

    /**
    * 待重试部署记录ID, 就是通过DeployCertificateInstance返回的DeployRecordId
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
     * Get 待重试部署记录ID, 就是通过DeployCertificateInstance返回的DeployRecordId 
     * @return DeployRecordId 待重试部署记录ID, 就是通过DeployCertificateInstance返回的DeployRecordId
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 待重试部署记录ID, 就是通过DeployCertificateInstance返回的DeployRecordId
     * @param DeployRecordId 待重试部署记录ID, 就是通过DeployCertificateInstance返回的DeployRecordId
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    public DeployCertificateRecordRollbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployCertificateRecordRollbackRequest(DeployCertificateRecordRollbackRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);

    }
}

