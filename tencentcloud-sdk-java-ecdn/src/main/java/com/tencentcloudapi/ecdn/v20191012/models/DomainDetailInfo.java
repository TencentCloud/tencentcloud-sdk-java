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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainDetailInfo extends AbstractModel{

    /**
    * 域名ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 腾讯云账号ID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 加速域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名CName。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 域名状态，pending，rejected，processing， online，offline，deleted分别表示审核中，审核未通过，审核通过部署中，已开启，已关闭，已删除。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 域名创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 域名更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 源站配置。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * 节点缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Https配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * 加速区域，mainland，overseas或global。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 域名锁定状态，normal、global 分别表示未被锁定，全球锁定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
     * Get 域名ID。 
     * @return ResourceId 域名ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 域名ID。
     * @param ResourceId 域名ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 腾讯云账号ID。 
     * @return AppId 腾讯云账号ID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云账号ID。
     * @param AppId 腾讯云账号ID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 加速域名。 
     * @return Domain 加速域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 加速域名。
     * @param Domain 加速域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名CName。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname 域名CName。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 域名CName。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname 域名CName。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 域名状态，pending，rejected，processing， online，offline，deleted分别表示审核中，审核未通过，审核通过部署中，已开启，已关闭，已删除。 
     * @return Status 域名状态，pending，rejected，processing， online，offline，deleted分别表示审核中，审核未通过，审核通过部署中，已开启，已关闭，已删除。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态，pending，rejected，processing， online，offline，deleted分别表示审核中，审核未通过，审核通过部署中，已开启，已关闭，已删除。
     * @param Status 域名状态，pending，rejected，processing， online，offline，deleted分别表示审核中，审核未通过，审核通过部署中，已开启，已关闭，已删除。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 域名创建时间。 
     * @return CreateTime 域名创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 域名创建时间。
     * @param CreateTime 域名创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 域名更新时间。 
     * @return UpdateTime 域名更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 域名更新时间。
     * @param UpdateTime 域名更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 源站配置。 
     * @return Origin 源站配置。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置。
     * @param Origin 源站配置。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFilter IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFilter IP黑白名单配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpFreqLimit IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpFreqLimit IP限频配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseHeader 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseHeader 源站响应头部配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get 节点缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 节点缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 节点缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存规则配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Https配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disable 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disable 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect 访问协议强制跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get 加速区域，mainland，overseas或global。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 加速区域，mainland，overseas或global。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，mainland，overseas或global。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 加速区域，mainland，overseas或global。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 域名锁定状态，normal、global 分别表示未被锁定，全球锁定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Readonly 域名锁定状态，normal、global 分别表示未被锁定，全球锁定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set 域名锁定状态，normal、global 分别表示未被锁定，全球锁定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Readonly 域名锁定状态，normal、global 分别表示未被锁定，全球锁定。
注意：此字段可能返回 null，表示取不到有效值。
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);

    }
}

