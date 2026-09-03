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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInferenceServiceRequest extends AbstractModel {

    /**
    * <p>推理服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>删除关联的 APIKeys</p>
    */
    @SerializedName("DeleteBoundApiKeys")
    @Expose
    private Boolean DeleteBoundApiKeys;

    /**
     * Get <p>推理服务ID</p> 
     * @return ServiceId <p>推理服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务ID</p>
     * @param ServiceId <p>推理服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>删除关联的 APIKeys</p> 
     * @return DeleteBoundApiKeys <p>删除关联的 APIKeys</p>
     */
    public Boolean getDeleteBoundApiKeys() {
        return this.DeleteBoundApiKeys;
    }

    /**
     * Set <p>删除关联的 APIKeys</p>
     * @param DeleteBoundApiKeys <p>删除关联的 APIKeys</p>
     */
    public void setDeleteBoundApiKeys(Boolean DeleteBoundApiKeys) {
        this.DeleteBoundApiKeys = DeleteBoundApiKeys;
    }

    public DeleteInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInferenceServiceRequest(DeleteInferenceServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.DeleteBoundApiKeys != null) {
            this.DeleteBoundApiKeys = new Boolean(source.DeleteBoundApiKeys);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "DeleteBoundApiKeys", this.DeleteBoundApiKeys);

    }
}

