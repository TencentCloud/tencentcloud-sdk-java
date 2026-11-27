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

public class ModifyProtectionRequest extends AbstractModel {

    /**
    * <p>防护实例 ID。</p>
    */
    @SerializedName("ProtectionId")
    @Expose
    private String ProtectionId;

    /**
    * <p>防护实例名称。</p><p>入参限制：防护实例名称最多 60 个字符，同一主账号下不可重名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>防护实例 ID。</p> 
     * @return ProtectionId <p>防护实例 ID。</p>
     */
    public String getProtectionId() {
        return this.ProtectionId;
    }

    /**
     * Set <p>防护实例 ID。</p>
     * @param ProtectionId <p>防护实例 ID。</p>
     */
    public void setProtectionId(String ProtectionId) {
        this.ProtectionId = ProtectionId;
    }

    /**
     * Get <p>防护实例名称。</p><p>入参限制：防护实例名称最多 60 个字符，同一主账号下不可重名。</p> 
     * @return Name <p>防护实例名称。</p><p>入参限制：防护实例名称最多 60 个字符，同一主账号下不可重名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>防护实例名称。</p><p>入参限制：防护实例名称最多 60 个字符，同一主账号下不可重名。</p>
     * @param Name <p>防护实例名称。</p><p>入参限制：防护实例名称最多 60 个字符，同一主账号下不可重名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionRequest(ModifyProtectionRequest source) {
        if (source.ProtectionId != null) {
            this.ProtectionId = new String(source.ProtectionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectionId", this.ProtectionId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

