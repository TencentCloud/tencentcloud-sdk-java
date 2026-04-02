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
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 路径重写
    */
    @SerializedName("PathRewrite")
    @Expose
    private HTTPServicePathRewrite PathRewrite;

    /**
    * 上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
    */
    @SerializedName("UpstreamResourceType")
    @Expose
    private String UpstreamResourceType;

    /**
    * 上游服务名
    */
    @SerializedName("UpstreamResourceName")
    @Expose
    private String UpstreamResourceName;

    /**
    * 是否开启安全域名
    */
    @SerializedName("EnableSafeDomain")
    @Expose
    private Boolean EnableSafeDomain;

    /**
    * 是否开启身份认证
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 是否开启路径透传
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
    * 扩展字段，内部包含headers处理等
    */
    @SerializedName("Extension")
    @Expose
    private HTTPServiceExtension Extension;

    /**
    * 路由创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 路由更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse 
     * @return UpstreamResourceType 上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     */
    public String getUpstreamResourceType() {
        return this.UpstreamResourceType;
    }

    /**
     * Set 上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     * @param UpstreamResourceType 上游服务类型。SCF: 云函数，CBR: 云托管，STATIC_STORE: 静态托管，WEB_SCF: WEB云函数，LH: Lighthouse
     */
    public void setUpstreamResourceType(String UpstreamResourceType) {
        this.UpstreamResourceType = UpstreamResourceType;
    }

    /**
     * Get 上游服务名 
     * @return UpstreamResourceName 上游服务名
     */
    public String getUpstreamResourceName() {
        return this.UpstreamResourceName;
    }

    /**
     * Set 上游服务名
     * @param UpstreamResourceName 上游服务名
     */
    public void setUpstreamResourceName(String UpstreamResourceName) {
        this.UpstreamResourceName = UpstreamResourceName;
    }

    /**
     * Get 是否开启安全域名 
     * @return EnableSafeDomain 是否开启安全域名
     */
    public Boolean getEnableSafeDomain() {
        return this.EnableSafeDomain;
    }

    /**
     * Set 是否开启安全域名
     * @param EnableSafeDomain 是否开启安全域名
     */
    public void setEnableSafeDomain(Boolean EnableSafeDomain) {
        this.EnableSafeDomain = EnableSafeDomain;
    }

    /**
     * Get 是否开启身份认证 
     * @return EnableAuth 是否开启身份认证
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 是否开启身份认证
     * @param EnableAuth 是否开启身份认证
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 是否开启路径透传 
     * @return EnablePathTransmission 是否开启路径透传
     */
    public Boolean getEnablePathTransmission() {
        return this.EnablePathTransmission;
    }

    /**
     * Set 是否开启路径透传
     * @param EnablePathTransmission 是否开启路径透传
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

    /**
     * Get 扩展字段，内部包含headers处理等 
     * @return Extension 扩展字段，内部包含headers处理等
     */
    public HTTPServiceExtension getExtension() {
        return this.Extension;
    }

    /**
     * Set 扩展字段，内部包含headers处理等
     * @param Extension 扩展字段，内部包含headers处理等
     */
    public void setExtension(HTTPServiceExtension Extension) {
        this.Extension = Extension;
    }

    /**
     * Get 路由创建时间 
     * @return CreateTime 路由创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 路由创建时间
     * @param CreateTime 路由创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 路由更新时间 
     * @return UpdateTime 路由更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 路由更新时间
     * @param UpdateTime 路由更新时间
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

