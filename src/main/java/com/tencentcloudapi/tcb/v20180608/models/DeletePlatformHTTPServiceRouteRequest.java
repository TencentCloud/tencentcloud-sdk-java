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

public class DeletePlatformHTTPServiceRouteRequest extends AbstractModel {

    /**
    * <p>平台id</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>路径列表。为空则表示删除此域名和所有路由</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

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
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>路径列表。为空则表示删除此域名和所有路由</p> 
     * @return Paths <p>路径列表。为空则表示删除此域名和所有路由</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>路径列表。为空则表示删除此域名和所有路由</p>
     * @param Paths <p>路径列表。为空则表示删除此域名和所有路由</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    public DeletePlatformHTTPServiceRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePlatformHTTPServiceRouteRequest(DeletePlatformHTTPServiceRouteRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);

    }
}

