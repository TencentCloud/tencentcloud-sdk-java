/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLicenseRequest extends AbstractModel {

    /**
    * License 功能模块 Id
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
    * 资源包 Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get License 功能模块 Id 
     * @return LicenseId License 功能模块 Id
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set License 功能模块 Id
     * @param LicenseId License 功能模块 Id
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 资源包 Id 
     * @return ResourceId 资源包 Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源包 Id
     * @param ResourceId 资源包 Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ModifyLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseRequest(ModifyLicenseRequest source) {
        if (source.LicenseId != null) {
            this.LicenseId = new String(source.LicenseId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

