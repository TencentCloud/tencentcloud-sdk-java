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

public class CreateApiKeyRequest extends AbstractModel {

    /**
    * <p>API Key 名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>绑定的推理服务ID（可选，为空表示创建后不绑定任何服务）</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get <p>API Key 名称</p> 
     * @return Name <p>API Key 名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>API Key 名称</p>
     * @param Name <p>API Key 名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>绑定的推理服务ID（可选，为空表示创建后不绑定任何服务）</p> 
     * @return ServiceId <p>绑定的推理服务ID（可选，为空表示创建后不绑定任何服务）</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>绑定的推理服务ID（可选，为空表示创建后不绑定任何服务）</p>
     * @param ServiceId <p>绑定的推理服务ID（可选，为空表示创建后不绑定任何服务）</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public CreateApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiKeyRequest(CreateApiKeyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

