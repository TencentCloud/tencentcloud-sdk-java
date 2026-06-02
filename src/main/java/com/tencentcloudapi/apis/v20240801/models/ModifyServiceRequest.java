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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceRequest extends AbstractModel {

    /**
    * <p>实例</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>里约应用ID</p>
    */
    @SerializedName("PaasID")
    @Expose
    private String PaasID;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签</p>
    */
    @SerializedName("LabelIDs")
    @Expose
    private String [] LabelIDs;

    /**
    * <p>目录</p>
    */
    @SerializedName("CategoryIDs")
    @Expose
    private String [] CategoryIDs;

    /**
    * <p>鉴权方式</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>签名</p>
    */
    @SerializedName("SignType")
    @Expose
    private String SignType;

    /**
    * <p>登录方式</p>
    */
    @SerializedName("LoginTypes")
    @Expose
    private String [] LoginTypes;

    /**
    * <p>负载方式</p>
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * <p>公开路径</p>
    */
    @SerializedName("PubPath")
    @Expose
    private String PubPath;

    /**
    * <p>请求方法</p>
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * <p>是否https</p>
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>证书检查</p>
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>http协议类型</p>
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
    * <p>版本号</p>
    */
    @SerializedName("Versions")
    @Expose
    private VersionDTO [] Versions;

    /**
    * <p>目标路径</p>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>入参</p>
    */
    @SerializedName("RequestParamsValidatorStatus")
    @Expose
    private Boolean RequestParamsValidatorStatus;

    /**
    * <p>入参</p>
    */
    @SerializedName("RequestParamsValidatorJsonInfoT")
    @Expose
    private String RequestParamsValidatorJsonInfoT;

    /**
    * <p>出参</p>
    */
    @SerializedName("ResponseParamsValidatorStatus")
    @Expose
    private Boolean ResponseParamsValidatorStatus;

    /**
    * <p>出参</p>
    */
    @SerializedName("ResponseParamsValidatorJsonInfoT")
    @Expose
    private String ResponseParamsValidatorJsonInfoT;

    /**
    * <p>流量控制</p>
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>流量控制</p>
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>健康检查</p>
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private Boolean HealthCheckStatus;

    /**
    * <p>健康检查</p>
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfigDTO HealthCheckConfig;

    /**
    * <p>格式转换</p>
    */
    @SerializedName("SourceTypeStatus")
    @Expose
    private Boolean SourceTypeStatus;

    /**
    * <p>格式转换</p>
    */
    @SerializedName("SourceTypeConfig")
    @Expose
    private SourceTypeConfigDTO SourceTypeConfig;

    /**
    * <p>IP白名单</p>
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * <p>IP白名单</p>
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>IP黑名单</p>
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * <p>IP黑名单</p>
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * <p>插件</p>
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get <p>实例</p> 
     * @return InstanceID <p>实例</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例</p>
     * @param InstanceID <p>实例</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>里约应用ID</p> 
     * @return PaasID <p>里约应用ID</p>
     * @deprecated
     */
    @Deprecated
    public String getPaasID() {
        return this.PaasID;
    }

    /**
     * Set <p>里约应用ID</p>
     * @param PaasID <p>里约应用ID</p>
     * @deprecated
     */
    @Deprecated
    public void setPaasID(String PaasID) {
        this.PaasID = PaasID;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签</p> 
     * @return LabelIDs <p>标签</p>
     */
    public String [] getLabelIDs() {
        return this.LabelIDs;
    }

    /**
     * Set <p>标签</p>
     * @param LabelIDs <p>标签</p>
     */
    public void setLabelIDs(String [] LabelIDs) {
        this.LabelIDs = LabelIDs;
    }

    /**
     * Get <p>目录</p> 
     * @return CategoryIDs <p>目录</p>
     */
    public String [] getCategoryIDs() {
        return this.CategoryIDs;
    }

    /**
     * Set <p>目录</p>
     * @param CategoryIDs <p>目录</p>
     */
    public void setCategoryIDs(String [] CategoryIDs) {
        this.CategoryIDs = CategoryIDs;
    }

    /**
     * Get <p>鉴权方式</p> 
     * @return AuthType <p>鉴权方式</p>
     * @deprecated
     */
    @Deprecated
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>鉴权方式</p>
     * @param AuthType <p>鉴权方式</p>
     * @deprecated
     */
    @Deprecated
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>签名</p> 
     * @return SignType <p>签名</p>
     * @deprecated
     */
    @Deprecated
    public String getSignType() {
        return this.SignType;
    }

    /**
     * Set <p>签名</p>
     * @param SignType <p>签名</p>
     * @deprecated
     */
    @Deprecated
    public void setSignType(String SignType) {
        this.SignType = SignType;
    }

    /**
     * Get <p>登录方式</p> 
     * @return LoginTypes <p>登录方式</p>
     * @deprecated
     */
    @Deprecated
    public String [] getLoginTypes() {
        return this.LoginTypes;
    }

    /**
     * Set <p>登录方式</p>
     * @param LoginTypes <p>登录方式</p>
     * @deprecated
     */
    @Deprecated
    public void setLoginTypes(String [] LoginTypes) {
        this.LoginTypes = LoginTypes;
    }

    /**
     * Get <p>负载方式</p> 
     * @return TargetSelect <p>负载方式</p>
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set <p>负载方式</p>
     * @param TargetSelect <p>负载方式</p>
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get <p>公开路径</p> 
     * @return PubPath <p>公开路径</p>
     */
    public String getPubPath() {
        return this.PubPath;
    }

    /**
     * Set <p>公开路径</p>
     * @param PubPath <p>公开路径</p>
     */
    public void setPubPath(String PubPath) {
        this.PubPath = PubPath;
    }

    /**
     * Get <p>请求方法</p> 
     * @return RequestMethod <p>请求方法</p>
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set <p>请求方法</p>
     * @param RequestMethod <p>请求方法</p>
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get <p>是否https</p> 
     * @return HttpProtocolType <p>是否https</p>
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>是否https</p>
     * @param HttpProtocolType <p>是否https</p>
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>证书检查</p> 
     * @return CheckTargetCertsError <p>证书检查</p>
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>证书检查</p>
     * @param CheckTargetCertsError <p>证书检查</p>
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>http协议类型</p> 
     * @return HttpProtocolVersion <p>http协议类型</p>
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set <p>http协议类型</p>
     * @param HttpProtocolVersion <p>http协议类型</p>
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
    }

    /**
     * Get <p>版本号</p> 
     * @return Versions <p>版本号</p>
     */
    public VersionDTO [] getVersions() {
        return this.Versions;
    }

    /**
     * Set <p>版本号</p>
     * @param Versions <p>版本号</p>
     */
    public void setVersions(VersionDTO [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get <p>目标路径</p> 
     * @return TargetPath <p>目标路径</p>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
     * @param TargetPath <p>目标路径</p>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>入参</p> 
     * @return RequestParamsValidatorStatus <p>入参</p>
     */
    public Boolean getRequestParamsValidatorStatus() {
        return this.RequestParamsValidatorStatus;
    }

    /**
     * Set <p>入参</p>
     * @param RequestParamsValidatorStatus <p>入参</p>
     */
    public void setRequestParamsValidatorStatus(Boolean RequestParamsValidatorStatus) {
        this.RequestParamsValidatorStatus = RequestParamsValidatorStatus;
    }

    /**
     * Get <p>入参</p> 
     * @return RequestParamsValidatorJsonInfoT <p>入参</p>
     */
    public String getRequestParamsValidatorJsonInfoT() {
        return this.RequestParamsValidatorJsonInfoT;
    }

    /**
     * Set <p>入参</p>
     * @param RequestParamsValidatorJsonInfoT <p>入参</p>
     */
    public void setRequestParamsValidatorJsonInfoT(String RequestParamsValidatorJsonInfoT) {
        this.RequestParamsValidatorJsonInfoT = RequestParamsValidatorJsonInfoT;
    }

    /**
     * Get <p>出参</p> 
     * @return ResponseParamsValidatorStatus <p>出参</p>
     */
    public Boolean getResponseParamsValidatorStatus() {
        return this.ResponseParamsValidatorStatus;
    }

    /**
     * Set <p>出参</p>
     * @param ResponseParamsValidatorStatus <p>出参</p>
     */
    public void setResponseParamsValidatorStatus(Boolean ResponseParamsValidatorStatus) {
        this.ResponseParamsValidatorStatus = ResponseParamsValidatorStatus;
    }

    /**
     * Get <p>出参</p> 
     * @return ResponseParamsValidatorJsonInfoT <p>出参</p>
     */
    public String getResponseParamsValidatorJsonInfoT() {
        return this.ResponseParamsValidatorJsonInfoT;
    }

    /**
     * Set <p>出参</p>
     * @param ResponseParamsValidatorJsonInfoT <p>出参</p>
     */
    public void setResponseParamsValidatorJsonInfoT(String ResponseParamsValidatorJsonInfoT) {
        this.ResponseParamsValidatorJsonInfoT = ResponseParamsValidatorJsonInfoT;
    }

    /**
     * Get <p>流量控制</p> 
     * @return InvokeLimitConfigStatus <p>流量控制</p>
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>流量控制</p>
     * @param InvokeLimitConfigStatus <p>流量控制</p>
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>流量控制</p> 
     * @return InvokeLimitConfig <p>流量控制</p>
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>流量控制</p>
     * @param InvokeLimitConfig <p>流量控制</p>
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get <p>健康检查</p> 
     * @return HealthCheckStatus <p>健康检查</p>
     */
    public Boolean getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set <p>健康检查</p>
     * @param HealthCheckStatus <p>健康检查</p>
     */
    public void setHealthCheckStatus(Boolean HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    /**
     * Get <p>健康检查</p> 
     * @return HealthCheckConfig <p>健康检查</p>
     */
    public HealthCheckConfigDTO getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set <p>健康检查</p>
     * @param HealthCheckConfig <p>健康检查</p>
     */
    public void setHealthCheckConfig(HealthCheckConfigDTO HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get <p>格式转换</p> 
     * @return SourceTypeStatus <p>格式转换</p>
     */
    public Boolean getSourceTypeStatus() {
        return this.SourceTypeStatus;
    }

    /**
     * Set <p>格式转换</p>
     * @param SourceTypeStatus <p>格式转换</p>
     */
    public void setSourceTypeStatus(Boolean SourceTypeStatus) {
        this.SourceTypeStatus = SourceTypeStatus;
    }

    /**
     * Get <p>格式转换</p> 
     * @return SourceTypeConfig <p>格式转换</p>
     */
    public SourceTypeConfigDTO getSourceTypeConfig() {
        return this.SourceTypeConfig;
    }

    /**
     * Set <p>格式转换</p>
     * @param SourceTypeConfig <p>格式转换</p>
     */
    public void setSourceTypeConfig(SourceTypeConfigDTO SourceTypeConfig) {
        this.SourceTypeConfig = SourceTypeConfig;
    }

    /**
     * Get <p>IP白名单</p> 
     * @return IpWhiteStatus <p>IP白名单</p>
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set <p>IP白名单</p>
     * @param IpWhiteStatus <p>IP白名单</p>
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get <p>IP白名单</p> 
     * @return IpWhiteList <p>IP白名单</p>
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>IP白名单</p>
     * @param IpWhiteList <p>IP白名单</p>
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get <p>IP黑名单</p> 
     * @return IpBlackStatus <p>IP黑名单</p>
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set <p>IP黑名单</p>
     * @param IpBlackStatus <p>IP黑名单</p>
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get <p>IP黑名单</p> 
     * @return IpBlackList <p>IP黑名单</p>
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set <p>IP黑名单</p>
     * @param IpBlackList <p>IP黑名单</p>
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
    }

    /**
     * Get <p>插件</p> 
     * @return PluginConfigs <p>插件</p>
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set <p>插件</p>
     * @param PluginConfigs <p>插件</p>
     */
    public void setPluginConfigs(PluginConfigDTO [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
    }

    /**
     * Get <p>服务ID</p> 
     * @return ID <p>服务ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ID <p>服务ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public ModifyServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceRequest(ModifyServiceRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PaasID != null) {
            this.PaasID = new String(source.PaasID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LabelIDs != null) {
            this.LabelIDs = new String[source.LabelIDs.length];
            for (int i = 0; i < source.LabelIDs.length; i++) {
                this.LabelIDs[i] = new String(source.LabelIDs[i]);
            }
        }
        if (source.CategoryIDs != null) {
            this.CategoryIDs = new String[source.CategoryIDs.length];
            for (int i = 0; i < source.CategoryIDs.length; i++) {
                this.CategoryIDs[i] = new String(source.CategoryIDs[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.SignType != null) {
            this.SignType = new String(source.SignType);
        }
        if (source.LoginTypes != null) {
            this.LoginTypes = new String[source.LoginTypes.length];
            for (int i = 0; i < source.LoginTypes.length; i++) {
                this.LoginTypes[i] = new String(source.LoginTypes[i]);
            }
        }
        if (source.TargetSelect != null) {
            this.TargetSelect = new String(source.TargetSelect);
        }
        if (source.PubPath != null) {
            this.PubPath = new String(source.PubPath);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.HttpProtocolType != null) {
            this.HttpProtocolType = new String(source.HttpProtocolType);
        }
        if (source.CheckTargetCertsError != null) {
            this.CheckTargetCertsError = new Boolean(source.CheckTargetCertsError);
        }
        if (source.HttpProtocolVersion != null) {
            this.HttpProtocolVersion = new String(source.HttpProtocolVersion);
        }
        if (source.Versions != null) {
            this.Versions = new VersionDTO[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new VersionDTO(source.Versions[i]);
            }
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.RequestParamsValidatorStatus != null) {
            this.RequestParamsValidatorStatus = new Boolean(source.RequestParamsValidatorStatus);
        }
        if (source.RequestParamsValidatorJsonInfoT != null) {
            this.RequestParamsValidatorJsonInfoT = new String(source.RequestParamsValidatorJsonInfoT);
        }
        if (source.ResponseParamsValidatorStatus != null) {
            this.ResponseParamsValidatorStatus = new Boolean(source.ResponseParamsValidatorStatus);
        }
        if (source.ResponseParamsValidatorJsonInfoT != null) {
            this.ResponseParamsValidatorJsonInfoT = new String(source.ResponseParamsValidatorJsonInfoT);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new Boolean(source.HealthCheckStatus);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfigDTO(source.HealthCheckConfig);
        }
        if (source.SourceTypeStatus != null) {
            this.SourceTypeStatus = new Boolean(source.SourceTypeStatus);
        }
        if (source.SourceTypeConfig != null) {
            this.SourceTypeConfig = new SourceTypeConfigDTO(source.SourceTypeConfig);
        }
        if (source.IpWhiteStatus != null) {
            this.IpWhiteStatus = new Boolean(source.IpWhiteStatus);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.IpBlackStatus != null) {
            this.IpBlackStatus = new Boolean(source.IpBlackStatus);
        }
        if (source.IpBlackList != null) {
            this.IpBlackList = new String[source.IpBlackList.length];
            for (int i = 0; i < source.IpBlackList.length; i++) {
                this.IpBlackList[i] = new String(source.IpBlackList[i]);
            }
        }
        if (source.PluginConfigs != null) {
            this.PluginConfigs = new PluginConfigDTO[source.PluginConfigs.length];
            for (int i = 0; i < source.PluginConfigs.length; i++) {
                this.PluginConfigs[i] = new PluginConfigDTO(source.PluginConfigs[i]);
            }
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PaasID", this.PaasID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "LabelIDs.", this.LabelIDs);
        this.setParamArraySimple(map, prefix + "CategoryIDs.", this.CategoryIDs);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamArraySimple(map, prefix + "LoginTypes.", this.LoginTypes);
        this.setParamSimple(map, prefix + "TargetSelect", this.TargetSelect);
        this.setParamSimple(map, prefix + "PubPath", this.PubPath);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "HttpProtocolType", this.HttpProtocolType);
        this.setParamSimple(map, prefix + "CheckTargetCertsError", this.CheckTargetCertsError);
        this.setParamSimple(map, prefix + "HttpProtocolVersion", this.HttpProtocolVersion);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "RequestParamsValidatorStatus", this.RequestParamsValidatorStatus);
        this.setParamSimple(map, prefix + "RequestParamsValidatorJsonInfoT", this.RequestParamsValidatorJsonInfoT);
        this.setParamSimple(map, prefix + "ResponseParamsValidatorStatus", this.ResponseParamsValidatorStatus);
        this.setParamSimple(map, prefix + "ResponseParamsValidatorJsonInfoT", this.ResponseParamsValidatorJsonInfoT);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "SourceTypeStatus", this.SourceTypeStatus);
        this.setParamObj(map, prefix + "SourceTypeConfig.", this.SourceTypeConfig);
        this.setParamSimple(map, prefix + "IpWhiteStatus", this.IpWhiteStatus);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "IpBlackStatus", this.IpBlackStatus);
        this.setParamArraySimple(map, prefix + "IpBlackList.", this.IpBlackList);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

