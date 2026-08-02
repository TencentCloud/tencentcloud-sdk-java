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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseOverview extends AbstractModel {

    /**
    * <p>激活码统计信息</p>
    */
    @SerializedName("ActivationLicense")
    @Expose
    private ActivationLicense [] ActivationLicense;

    /**
    * <p>激活码类型</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
     * Get <p>激活码统计信息</p> 
     * @return ActivationLicense <p>激活码统计信息</p>
     */
    public ActivationLicense [] getActivationLicense() {
        return this.ActivationLicense;
    }

    /**
     * Set <p>激活码统计信息</p>
     * @param ActivationLicense <p>激活码统计信息</p>
     */
    public void setActivationLicense(ActivationLicense [] ActivationLicense) {
        this.ActivationLicense = ActivationLicense;
    }

    /**
     * Get <p>激活码类型</p> 
     * @return LicenseType <p>激活码类型</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>激活码类型</p>
     * @param LicenseType <p>激活码类型</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    public LicenseOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseOverview(LicenseOverview source) {
        if (source.ActivationLicense != null) {
            this.ActivationLicense = new ActivationLicense[source.ActivationLicense.length];
            for (int i = 0; i < source.ActivationLicense.length; i++) {
                this.ActivationLicense[i] = new ActivationLicense(source.ActivationLicense[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ActivationLicense.", this.ActivationLicense);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

