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

public class HTTPServiceRoute extends AbstractModel {

    /**
    * <p>路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>路径重写规则</p>
    */
    @SerializedName("PathRewrite")
    @Expose
    private HTTPServicePathRewrite PathRewrite;

    /**
    * <p>上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse</p>
    */
    @SerializedName("UpstreamResourceType")
    @Expose
    private String UpstreamResourceType;

    /**
    * <p>上游服务名</p>
    */
    @SerializedName("UpstreamResourceName")
    @Expose
    private String UpstreamResourceName;

    /**
    * <p>是否开启安全域名</p>
    */
    @SerializedName("EnableSafeDomain")
    @Expose
    private Boolean EnableSafeDomain;

    /**
    * <p>是否开启身份认证</p>
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * <p>是否开启路径透传</p>
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
    * <p>路由创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>路由更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get <p>路径重写规则</p> 
     * @return PathRewrite <p>路径重写规则</p>
     */
    public HTTPServicePathRewrite getPathRewrite() {
        return this.PathRewrite;
    }

    /**
     * Set <p>路径重写规则</p>
     * @param PathRewrite <p>路径重写规则</p>
     */
    public void setPathRewrite(HTTPServicePathRewrite PathRewrite) {
        this.PathRewrite = PathRewrite;
    }

    /**
     * Get <p>上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse</p> 
     * @return UpstreamResourceType <p>上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse</p>
     */
    public String getUpstreamResourceType() {
        return this.UpstreamResourceType;
    }

    /**
     * Set <p>上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse</p>
     * @param UpstreamResourceType <p>上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse</p>
     */
    public void setUpstreamResourceType(String UpstreamResourceType) {
        this.UpstreamResourceType = UpstreamResourceType;
    }

    /**
     * Get <p>上游服务名</p> 
     * @return UpstreamResourceName <p>上游服务名</p>
     */
    public String getUpstreamResourceName() {
        return this.UpstreamResourceName;
    }

    /**
     * Set <p>上游服务名</p>
     * @param UpstreamResourceName <p>上游服务名</p>
     */
    public void setUpstreamResourceName(String UpstreamResourceName) {
        this.UpstreamResourceName = UpstreamResourceName;
    }

    /**
     * Get <p>是否开启安全域名</p> 
     * @return EnableSafeDomain <p>是否开启安全域名</p>
     */
    public Boolean getEnableSafeDomain() {
        return this.EnableSafeDomain;
    }

    /**
     * Set <p>是否开启安全域名</p>
     * @param EnableSafeDomain <p>是否开启安全域名</p>
     */
    public void setEnableSafeDomain(Boolean EnableSafeDomain) {
        this.EnableSafeDomain = EnableSafeDomain;
    }

    /**
     * Get <p>是否开启身份认证</p> 
     * @return EnableAuth <p>是否开启身份认证</p>
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set <p>是否开启身份认证</p>
     * @param EnableAuth <p>是否开启身份认证</p>
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get <p>是否开启路径透传</p> 
     * @return EnablePathTransmission <p>是否开启路径透传</p>
     */
    public Boolean getEnablePathTransmission() {
        return this.EnablePathTransmission;
    }

    /**
     * Set <p>是否开启路径透传</p>
     * @param EnablePathTransmission <p>是否开启路径透传</p>
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

    /**
     * Get <p>路由创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p> 
     * @return CreateTime <p>路由创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>路由创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     * @param CreateTime <p>路由创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>路由更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p> 
     * @return UpdateTime <p>路由更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>路由更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     * @param UpdateTime <p>路由更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HTTPServiceRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceRoute(HTTPServiceRoute source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.PathRewrite != null) {
            this.PathRewrite = new HTTPServicePathRewrite(source.PathRewrite);
        }
        if (source.UpstreamResourceType != null) {
            this.UpstreamResourceType = new String(source.UpstreamResourceType);
        }
        if (source.UpstreamResourceName != null) {
            this.UpstreamResourceName = new String(source.UpstreamResourceName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "PathRewrite.", this.PathRewrite);
        this.setParamSimple(map, prefix + "UpstreamResourceType", this.UpstreamResourceType);
        this.setParamSimple(map, prefix + "UpstreamResourceName", this.UpstreamResourceName);
        this.setParamSimple(map, prefix + "EnableSafeDomain", this.EnableSafeDomain);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "EnablePathTransmission", this.EnablePathTransmission);
        this.setParamObj(map, prefix + "QPSPolicy.", this.QPSPolicy);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "Extension.", this.Extension);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

