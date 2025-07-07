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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityIPGroupRequest extends AbstractModel {

    /**
    * 站点 Id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IP 组信息。
    */
    @SerializedName("IPGroup")
    @Expose
    private IPGroup IPGroup;

    /**
     * Get 站点 Id。 
     * @return ZoneId 站点 Id。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 Id。
     * @param ZoneId 站点 Id。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get IP 组信息。 
     * @return IPGroup IP 组信息。
     */
    public IPGroup getIPGroup() {
        return this.IPGroup;
    }

    /**
     * Set IP 组信息。
     * @param IPGroup IP 组信息。
     */
    public void setIPGroup(IPGroup IPGroup) {
        this.IPGroup = IPGroup;
    }

    public CreateSecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityIPGroupRequest(CreateSecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IPGroup != null) {
            this.IPGroup = new IPGroup(source.IPGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "IPGroup.", this.IPGroup);

    }
}

