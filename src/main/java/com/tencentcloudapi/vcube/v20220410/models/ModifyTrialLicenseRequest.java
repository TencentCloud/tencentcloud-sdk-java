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

public class ModifyTrialLicenseRequest extends AbstractModel {

    /**
    * 授权ID
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
     * Get 授权ID 
     * @return LicenseId 授权ID
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set 授权ID
     * @param LicenseId 授权ID
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    public ModifyTrialLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTrialLicenseRequest(ModifyTrialLicenseRequest source) {
        if (source.LicenseId != null) {
            this.LicenseId = new String(source.LicenseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);

    }
}

