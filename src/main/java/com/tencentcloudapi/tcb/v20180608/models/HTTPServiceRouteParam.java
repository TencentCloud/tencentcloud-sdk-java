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
    * <p>路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>上游服务类型。创建时必填，修改时可选填</p><p>枚举值：</p><ul><li>SCF： 云函数</li><li>CBR： 云托管</li><li>STATIC_STORE： 静态托管</li><li>WEB_SCF： web云函数</li><li>LH： Lighthouse</li></ul>
    */
    @SerializedName("UpstreamResourceType")
    @Expose
    private String UpstreamResourceType;

    /**
    * <p>上游服务名。创建时必填，修改时可选填</p>
    */
    @SerializedName("UpstreamResourceName")
    @Expose
    private String UpstreamResourceName;

    /**
    * <p>路径重写</p>
    */
    @SerializedName("PathRewrite")
    @Expose
    private HTTPServicePathRewrite PathRewrite;

    /**
    * <p>是否开启安全域名。默认开启</p>
    */
    @SerializedName("EnableSafeDomain")
    @Expose
    private Boolean EnableSafeDomain;

    /**
    * <p>是否开启身份认证。默认关闭</p>
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * <p>是否开启路径透传。默认关闭</p>
    */
    @SerializedName("EnablePathTransmission")
    @Expose
    private Boolean EnablePathTransmission;

    /**
    * <p>QPS限频策略</p>
    */
    @SerializedName("QPSPolicy")
    @Expose
    private HTTPServiceRouteQPSPolicy QPSPolicy;

    /**
    * <p>是否开启路由</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>扩展字段，内部包含headers处理等</p>
    */
    @SerializedName("Extension")
    @Expose
    private HTTPServiceExtension Extension;

    /**
     * Get <p>路径</p> 
     * @return Path <p>路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>路径</p>
     * @param Path <p>路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>上游服务类型。创建时必填，修改时可选填</p><p>枚举值：</p><ul><li>SCF： 云函数</li><li>CBR： 云托管</li><li>STATIC_STORE： 静态托管</li><li>WEB_SCF： web云函数</li><li>LH： Lighthouse</li></ul> 
     * @return UpstreamResourceType <p>上游服务类型。创建时必填，修改时可选填</p><p>枚举值：</p><ul><li>SCF： 云函数</li><li>CBR： 云托管</li><li>STATIC_STORE： 静态托管</li><li>WEB_SCF： web云函数</li><li>LH： Lighthouse</li></ul>
     */
    public String getUpstreamResourceType() {
        return this.UpstreamResourceType;
    }

    /**
     * Set <p>上游服务类型。创建时必填，修改时可选填</p><p>枚举值：</p><ul><li>SCF： 云函数</li><li>CBR： 云托管</li><li>STATIC_STORE： 静态托管</li><li>WEB_SCF： web云函数</li><li>LH： Lighthouse</li></ul>
     * @param UpstreamResourceType <p>上游服务类型。创建时必填，修改时可选填</p><p>枚举值：</p><ul><li>SCF： 云函数</li><li>CBR： 云托管</li><li>STATIC_STORE： 静态托管</li><li>WEB_SCF： web云函数</li><li>LH： Lighthouse</li></ul>
     */
    public void setUpstreamResourceType(String UpstreamResourceType) {
        this.UpstreamResourceType = UpstreamResourceType;
    }

    /**
     * Get <p>上游服务名。创建时必填，修改时可选填</p> 
     * @return UpstreamResourceName <p>上游服务名。创建时必填，修改时可选填</p>
     */
    public String getUpstreamResourceName() {
        return this.UpstreamResourceName;
    }

    /**
     * Set <p>上游服务名。创建时必填，修改时可选填</p>
     * @param UpstreamResourceName <p>上游服务名。创建时必填，修改时可选填</p>
     */
    public void setUpstreamResourceName(String UpstreamResourceName) {
        this.UpstreamResourceName = UpstreamResourceName;
    }

    /**
     * Get <p>路径重写</p> 
     * @return PathRewrite <p>路径重写</p>
     */
    public HTTPServicePathRewrite getPathRewrite() {
        return this.PathRewrite;
    }

    /**
     * Set <p>路径重写</p>
     * @param PathRewrite <p>路径重写</p>
     */
    public void setPathRewrite(HTTPServicePathRewrite PathRewrite) {
        this.PathRewrite = PathRewrite;
    }

    /**
     * Get <p>是否开启安全域名。默认开启</p> 
     * @return EnableSafeDomain <p>是否开启安全域名。默认开启</p>
     */
    public Boolean getEnableSafeDomain() {
        return this.EnableSafeDomain;
    }

    /**
     * Set <p>是否开启安全域名。默认开启</p>
     * @param EnableSafeDomain <p>是否开启安全域名。默认开启</p>
     */
    public void setEnableSafeDomain(Boolean EnableSafeDomain) {
        this.EnableSafeDomain = EnableSafeDomain;
    }

    /**
     * Get <p>是否开启身份认证。默认关闭</p> 
     * @return EnableAuth <p>是否开启身份认证。默认关闭</p>
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set <p>是否开启身份认证。默认关闭</p>
     * @param EnableAuth <p>是否开启身份认证。默认关闭</p>
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get <p>是否开启路径透传。默认关闭</p> 
     * @return EnablePathTransmission <p>是否开启路径透传。默认关闭</p>
     */
    public Boolean getEnablePathTransmission() {
        return this.EnablePathTransmission;
    }

    /**
     * Set <p>是否开启路径透传。默认关闭</p>
     * @param EnablePathTransmission <p>是否开启路径透传。默认关闭</p>
     */
    public void setEnablePathTransmission(Boolean EnablePathTransmission) {
        this.EnablePathTransmission = EnablePathTransmission;
    }

    /**
     * Get <p>QPS限频策略</p> 
     * @return QPSPolicy <p>QPS限频策略</p>
     */
    public HTTPServiceRouteQPSPolicy getQPSPolicy() {
        return this.QPSPolicy;
    }

    /**
     * Set <p>QPS限频策略</p>
     * @param QPSPolicy <p>QPS限频策略</p>
     */
    public void setQPSPolicy(HTTPServiceRouteQPSPolicy QPSPolicy) {
        this.QPSPolicy = QPSPolicy;
    }

    /**
     * Get <p>是否开启路由</p> 
     * @return Enable <p>是否开启路由</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启路由</p>
     * @param Enable <p>是否开启路由</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>扩展字段，内部包含headers处理等</p> 
     * @return Extension <p>扩展字段，内部包含headers处理等</p>
     */
    public HTTPServiceExtension getExtension() {
        return this.Extension;
    }

    /**
     * Set <p>扩展字段，内部包含headers处理等</p>
     * @param Extension <p>扩展字段，内部包含headers处理等</p>
     */
    public void setExtension(HTTPServiceExtension Extension) {
        this.Extension = Extension;
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
        if (source.Extension != null) {
            this.Extension = new HTTPServiceExtension(source.Extension);
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
        this.setParamObj(map, prefix + "Extension.", this.Extension);

    }
}

