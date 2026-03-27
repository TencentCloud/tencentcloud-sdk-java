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

public class HTTPServiceRouteParam extends AbstractModel {

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 上游服务类型。创建时必填，修改时可选填。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
    */
    @SerializedName("UpstreamResourceType")
    @Expose
    private String UpstreamResourceType;

    /**
    * 上游服务名。创建时必填，修改时可选填
    */
    @SerializedName("UpstreamResourceName")
    @Expose
    private String UpstreamResourceName;

    /**
    * 路径重写
    */
    @SerializedName("PathRewrite")
    @Expose
    private HTTPServicePathRewrite PathRewrite;

    /**
    * 是否开启安全域名。默认开启
    */
    @SerializedName("EnableSafeDomain")
    @Expose
    private Boolean EnableSafeDomain;

    /**
    * 是否开启身份认证。默认关闭
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 是否开启路径透传。默认关闭
    */
    @SerializedName("EnablePathTransmission")
    @Expose
    private Boolean EnablePathTransmission;

    /**
    * QPS限频策略
    */
    @SerializedName("QPSPolicy")
    @Expose
    private HTTPServiceRouteQPSPolicy QPSPolicy;

    /**
    * 是否开启路由
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 上游服务类型。创建时必填，修改时可选填。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse 
     * @return UpstreamResourceType 上游服务类型。创建时必填，修改时可选填。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     */
    public String getUpstreamResourceType() {
        return this.UpstreamResourceType;
    }

    /**
     * Set 上游服务类型。创建时必填，修改时可选填。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     * @param UpstreamResourceType 上游服务类型。创建时必填，修改时可选填。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     */
    public void setUpstreamResourceType(String UpstreamResourceType) {
        this.UpstreamResourceType = UpstreamResourceType;
    }

    /**
     * Get 上游服务名。创建时必填，修改时可选填 
     * @return UpstreamResourceName 上游服务名。创建时必填，修改时可选填
     */
    public String getUpstreamResourceName() {
        return this.UpstreamResourceName;
    }

    /**
     * Set 上游服务名。创建时必填，修改时可选填
     * @param UpstreamResourceName 上游服务名。创建时必填，修改时可选填
     */
    public void setUpstreamResourceName(String UpstreamResourceName) {
        this.UpstreamResourceName = UpstreamResourceName;
    }

    /**
     * Get 路径重写 
     * @return PathRewrite 路径重写
     */
    public HTTPServicePathRewrite getPathRewrite() {
        return this.PathRewrite;
    }

    /**
     * Set 路径重写
     * @param PathRewrite 路径重写
     */
    public void setPathRewrite(HTTPServicePathRewrite PathRewrite) {
        this.PathRewrite = PathRewrite;
    }

    /**
     * Get 是否开启安全域名。默认开启 
     * @return EnableSafeDomain 是否开启安全域名。默认开启
     */
    public Boolean getEnableSafeDomain() {
        return this.EnableSafeDomain;
    }

    /**
     * Set 是否开启安全域名。默认开启
     * @param EnableSafeDomain 是否开启安全域名。默认开启
     */
    public void setEnableSafeDomain(Boolean EnableSafeDomain) {
        this.EnableSafeDomain = EnableSafeDomain;
    }

    /**
     * Get 是否开启身份认证。默认关闭 
     * @return EnableAuth 是否开启身份认证。默认关闭
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 是否开启身份认证。默认关闭
     * @param EnableAuth 是否开启身份认证。默认关闭
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 是否开启路径透传。默认关闭 
     * @return EnablePathTransmission 是否开启路径透传。默认关闭
     */
    public Boolean getEnablePathTransmission() {
        return this.EnablePathTransmission;
    }

    /**
     * Set 是否开启路径透传。默认关闭
     * @param EnablePathTransmission 是否开启路径透传。默认关闭
     */
    public void setEnablePathTransmission(Boolean EnablePathTransmission) {
        this.EnablePathTransmission = EnablePathTransmission;
    }

    /**
     * Get QPS限频策略 
     * @return QPSPolicy QPS限频策略
     */
    public HTTPServiceRouteQPSPolicy getQPSPolicy() {
        return this.QPSPolicy;
    }

    /**
     * Set QPS限频策略
     * @param QPSPolicy QPS限频策略
     */
    public void setQPSPolicy(HTTPServiceRouteQPSPolicy QPSPolicy) {
        this.QPSPolicy = QPSPolicy;
    }

    /**
     * Get 是否开启路由 
     * @return Enable 是否开启路由
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启路由
     * @param Enable 是否开启路由
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public HTTPServiceRouteParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceRouteParam(HTTPServiceRouteParam source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.UpstreamResourceType != null) {
            this.UpstreamResourceType = new String(source.UpstreamResourceType);
        }
        if (source.UpstreamResourceName != null) {
            this.UpstreamResourceName = new String(source.UpstreamResourceName);
        }
        if (source.PathRewrite != null) {
            this.PathRewrite = new HTTPServicePathRewrite(source.PathRewrite);
        }
        if (source.EnableSafeDomain != null) {
            this.EnableSafeDomain = new Boolean(source.EnableSafeDomain);
        }
        if (source.EnableAuth != null) {
            this.EnableAuth = new Boolean(source.EnableAuth);
        }
        if (source.EnablePathTransmission != null) {
            this.EnablePathTransmission = new Boolean(source.EnablePathTransmission);
        }
        if (source.QPSPolicy != null) {
            this.QPSPolicy = new HTTPServiceRouteQPSPolicy(source.QPSPolicy);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "UpstreamResourceType", this.UpstreamResourceType);
        this.setParamSimple(map, prefix + "UpstreamResourceName", this.UpstreamResourceName);
        this.setParamObj(map, prefix + "PathRewrite.", this.PathRewrite);
        this.setParamSimple(map, prefix + "EnableSafeDomain", this.EnableSafeDomain);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "EnablePathTransmission", this.EnablePathTransmission);
        this.setParamObj(map, prefix + "QPSPolicy.", this.QPSPolicy);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

