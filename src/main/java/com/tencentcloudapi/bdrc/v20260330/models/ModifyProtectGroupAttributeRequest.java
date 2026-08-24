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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProtectGroupAttributeRequest extends AbstractModel {

    /**
    * 要修改属性的保护组id
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 保护组名称
    */
    @SerializedName("ProtectGroupName")
    @Expose
    private String ProtectGroupName;

    /**
     * Get 要修改属性的保护组id 
     * @return ProtectGroupId 要修改属性的保护组id
     */
    public String getProtectGroupId() {
        return this.ProtectGroupId;
    }

    /**
     * Set 要修改属性的保护组id
     * @param ProtectGroupId 要修改属性的保护组id
     */
    public void setProtectGroupId(String ProtectGroupId) {
        this.ProtectGroupId = ProtectGroupId;
    }

    /**
     * Get 保护组名称 
     * @return ProtectGroupName 保护组名称
     */
    public String getProtectGroupName() {
        return this.ProtectGroupName;
    }

    /**
     * Set 保护组名称
     * @param ProtectGroupName 保护组名称
     */
    public void setProtectGroupName(String ProtectGroupName) {
        this.ProtectGroupName = ProtectGroupName;
    }

    public ModifyProtectGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectGroupAttributeRequest(ModifyProtectGroupAttributeRequest source) {
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.ProtectGroupName != null) {
            this.ProtectGroupName = new String(source.ProtectGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "ProtectGroupName", this.ProtectGroupName);

    }
}

