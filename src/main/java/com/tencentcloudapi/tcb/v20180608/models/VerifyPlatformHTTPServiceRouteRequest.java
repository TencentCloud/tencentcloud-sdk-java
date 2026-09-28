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

public class VerifyPlatformHTTPServiceRouteRequest extends AbstractModel {

    /**
    * <p>平台id</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>域名路由信息</p>
    */
    @SerializedName("Domain")
    @Expose
    private HTTPServiceDomainParam Domain;

    /**
     * Get <p>平台id</p> 
     * @return PlatformId <p>平台id</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>平台id</p>
     * @param PlatformId <p>平台id</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>域名路由信息</p> 
     * @return Domain <p>域名路由信息</p>
     */
    public HTTPServiceDomainParam getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名路由信息</p>
     * @param Domain <p>域名路由信息</p>
     */
    public void setDomain(HTTPServiceDomainParam Domain) {
        this.Domain = Domain;
    }

    public VerifyPlatformHTTPServiceRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPlatformHTTPServiceRouteRequest(VerifyPlatformHTTPServiceRouteRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Domain != null) {
            this.Domain = new HTTPServiceDomainParam(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamObj(map, prefix + "Domain.", this.Domain);

    }
}

