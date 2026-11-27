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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceProtection extends AbstractModel {

    /**
    * <p>防护资源的资源六段式标识。</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>该资源绑定的防护实例 ID。</p>
    */
    @SerializedName("ProtectionId")
    @Expose
    private String ProtectionId;

    /**
     * Get <p>防护资源的资源六段式标识。</p> 
     * @return Resource <p>防护资源的资源六段式标识。</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>防护资源的资源六段式标识。</p>
     * @param Resource <p>防护资源的资源六段式标识。</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>该资源绑定的防护实例 ID。</p> 
     * @return ProtectionId <p>该资源绑定的防护实例 ID。</p>
     */
    public String getProtectionId() {
        return this.ProtectionId;
    }

    /**
     * Set <p>该资源绑定的防护实例 ID。</p>
     * @param ProtectionId <p>该资源绑定的防护实例 ID。</p>
     */
    public void setProtectionId(String ProtectionId) {
        this.ProtectionId = ProtectionId;
    }

    public ResourceProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceProtection(ResourceProtection source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ProtectionId != null) {
            this.ProtectionId = new String(source.ProtectionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "ProtectionId", this.ProtectionId);

    }
}

