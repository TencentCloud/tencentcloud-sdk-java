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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BriefDomain extends AbstractModel{

    /**
    * 域名 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 腾讯云账号 ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 加速域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名对应的 CNAME 地址
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 项目 ID，可前往腾讯云项目管理页面查看
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 域名创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 域名更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 源站配置详情
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
     * Get 域名 ID 
     * @return ResourceId 域名 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 域名 ID
     * @param ResourceId 域名 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 腾讯云账号 ID 
     * @return AppId 腾讯云账号 ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云账号 ID
     * @param AppId 腾讯云账号 ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 加速域名 
     * @return Domain 加速域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 加速域名
     * @param Domain 加速域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名对应的 CNAME 地址 
     * @return Cname 域名对应的 CNAME 地址
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 域名对应的 CNAME 地址
     * @param Cname 域名对应的 CNAME 地址
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭 
     * @return Status 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     * @param Status 加速服务状态
rejected：域名审核未通过，域名备案过期/被注销导致
processing：部署中
online：已启动
offline：已关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 项目 ID，可前往腾讯云项目管理页面查看 
     * @return ProjectId 项目 ID，可前往腾讯云项目管理页面查看
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，可前往腾讯云项目管理页面查看
     * @param ProjectId 项目 ID，可前往腾讯云项目管理页面查看
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速 
     * @return ServiceType 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     * @param ServiceType 域名业务类型
web：静态加速
download：下载加速
media：流媒体点播加速
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 域名创建时间 
     * @return CreateTime 域名创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 域名创建时间
     * @param CreateTime 域名创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 域名更新时间 
     * @return UpdateTime 域名更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 域名更新时间
     * @param UpdateTime 域名更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 源站配置详情 
     * @return Origin 源站配置详情
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置详情
     * @param Origin 源站配置详情
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定 
     * @return Disable 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
     * @param Disable 域名封禁状态
normal：正常状态
overdue：账号欠费导致域名关闭，充值完成后可自行启动加速服务
malicious：域名出现恶意行为，强制关闭加速服务
ddos：域名被大规模 DDoS 攻击，关闭加速服务
idle：域名超过 90 天内无任何操作、数据产生，判定为不活跃域名自动关闭加速服务，可自行启动加速服务
unlicensed：域名未备案/备案注销，自动关闭加速服务，备案完成后可自行启动加速服务
capping：触发配置的带宽阈值上限
readonly：域名存在特殊配置，被锁定
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速 
     * @return Area 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
     * @param Area 加速区域
mainland：中国境内加速
overseas：中国境外加速
global：全球加速
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定 
     * @return Readonly 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
     * @param Readonly 域名锁定状态
normal：未锁定
mainland：中国境内锁定
overseas：中国境外锁定
global：全球锁定
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);

    }
}

