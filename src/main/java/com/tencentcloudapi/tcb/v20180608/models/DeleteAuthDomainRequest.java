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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAuthDomainRequest extends AbstractModel {

    /**
    * 开发者的环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 域名ID列表，支持批量
    */
    @SerializedName("DomainIds")
    @Expose
    private String [] DomainIds;

    /**
     * Get 开发者的环境ID 
     * @return EnvId 开发者的环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 开发者的环境ID
     * @param EnvId 开发者的环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 域名ID列表，支持批量 
     * @return DomainIds 域名ID列表，支持批量
     */
    public String [] getDomainIds() {
        return this.DomainIds;
    }

    /**
     * Set 域名ID列表，支持批量
     * @param DomainIds 域名ID列表，支持批量
     */
    public void setDomainIds(String [] DomainIds) {
        this.DomainIds = DomainIds;
    }

    public DeleteAuthDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAuthDomainRequest(DeleteAuthDomainRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DomainIds != null) {
            this.DomainIds = new String[source.DomainIds.length];
            for (int i = 0; i < source.DomainIds.length; i++) {
                this.DomainIds[i] = new String(source.DomainIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "DomainIds.", this.DomainIds);

    }
}

