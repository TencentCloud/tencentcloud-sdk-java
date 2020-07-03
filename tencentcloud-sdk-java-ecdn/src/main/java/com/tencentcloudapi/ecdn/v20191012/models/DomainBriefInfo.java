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

public class DomainBriefInfo extends AbstractModel{

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
    * CDN加速域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名CName。
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
    * 源站配置详情。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * 加速区域，mainland，oversea或global。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 域名锁定状态，normal、global，分别表示未被锁定、全球锁定。
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
     * Get CDN加速域名。 
     * @return Domain CDN加速域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CDN加速域名。
     * @param Domain CDN加速域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名CName。 
     * @return Cname 域名CName。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 域名CName。
     * @param Cname 域名CName。
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
     * Get 源站配置详情。 
     * @return Origin 源站配置详情。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置详情。
     * @param Origin 源站配置详情。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读 
     * @return Disable 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读
     * @param Disable 域名封禁状态，normal，overdue，quota，malicious，ddos，idle，unlicensed，capping，readonly分别表示 正常，欠费停服，试用客户流量包耗尽，恶意用户，ddos攻击，无流量域名，未备案，带宽封顶，只读
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 加速区域，mainland，oversea或global。 
     * @return Area 加速区域，mainland，oversea或global。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，mainland，oversea或global。
     * @param Area 加速区域，mainland，oversea或global。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 域名锁定状态，normal、global，分别表示未被锁定、全球锁定。 
     * @return Readonly 域名锁定状态，normal、global，分别表示未被锁定、全球锁定。
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set 域名锁定状态，normal、global，分别表示未被锁定、全球锁定。
     * @param Readonly 域名锁定状态，normal、global，分别表示未被锁定、全球锁定。
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
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);

    }
}

