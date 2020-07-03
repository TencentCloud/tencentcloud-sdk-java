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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicesBindInfoRule extends AbstractModel{

    /**
    * 转发域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发域名ID。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 转发路径列表。
    */
    @SerializedName("LocationSet")
    @Expose
    private DevicesBindInfoLocation [] LocationSet;

    /**
     * Get 转发域名。 
     * @return Domain 转发域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发域名。
     * @param Domain 转发域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发域名ID。 
     * @return DomainId 转发域名ID。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 转发域名ID。
     * @param DomainId 转发域名ID。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 转发路径列表。 
     * @return LocationSet 转发路径列表。
     */
    public DevicesBindInfoLocation [] getLocationSet() {
        return this.LocationSet;
    }

    /**
     * Set 转发路径列表。
     * @param LocationSet 转发路径列表。
     */
    public void setLocationSet(DevicesBindInfoLocation [] LocationSet) {
        this.LocationSet = LocationSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamArrayObj(map, prefix + "LocationSet.", this.LocationSet);

    }
}

