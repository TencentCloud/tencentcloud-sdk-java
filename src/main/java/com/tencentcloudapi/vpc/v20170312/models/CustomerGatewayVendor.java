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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomerGatewayVendor extends AbstractModel{

    /**
    * 平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 软件版本。
    */
    @SerializedName("SoftwareVersion")
    @Expose
    private String SoftwareVersion;

    /**
    * 供应商名称。
    */
    @SerializedName("VendorName")
    @Expose
    private String VendorName;

    /**
     * Get 平台。 
     * @return Platform 平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台。
     * @param Platform 平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 软件版本。 
     * @return SoftwareVersion 软件版本。
     */
    public String getSoftwareVersion() {
        return this.SoftwareVersion;
    }

    /**
     * Set 软件版本。
     * @param SoftwareVersion 软件版本。
     */
    public void setSoftwareVersion(String SoftwareVersion) {
        this.SoftwareVersion = SoftwareVersion;
    }

    /**
     * Get 供应商名称。 
     * @return VendorName 供应商名称。
     */
    public String getVendorName() {
        return this.VendorName;
    }

    /**
     * Set 供应商名称。
     * @param VendorName 供应商名称。
     */
    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoftwareVersion", this.SoftwareVersion);
        this.setParamSimple(map, prefix + "VendorName", this.VendorName);

    }
}

