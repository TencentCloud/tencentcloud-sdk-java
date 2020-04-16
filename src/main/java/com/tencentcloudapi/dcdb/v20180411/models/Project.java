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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 资源拥有者（主账号）uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 应用Id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建者uin
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 来源平台
    */
    @SerializedName("SrcPlat")
    @Expose
    private String SrcPlat;

    /**
    * 来源AppId
    */
    @SerializedName("SrcAppId")
    @Expose
    private Long SrcAppId;

    /**
    * 项目状态,0正常，-1关闭。默认项目为3
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否默认项目，1 是，0 不是
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 描述信息
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源拥有者（主账号）uin 
     * @return OwnerUin 资源拥有者（主账号）uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 资源拥有者（主账号）uin
     * @param OwnerUin 资源拥有者（主账号）uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 应用Id 
     * @return AppId 应用Id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用Id
     * @param AppId 应用Id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建者uin 
     * @return CreatorUin 创建者uin
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者uin
     * @param CreatorUin 创建者uin
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 来源平台 
     * @return SrcPlat 来源平台
     */
    public String getSrcPlat() {
        return this.SrcPlat;
    }

    /**
     * Set 来源平台
     * @param SrcPlat 来源平台
     */
    public void setSrcPlat(String SrcPlat) {
        this.SrcPlat = SrcPlat;
    }

    /**
     * Get 来源AppId 
     * @return SrcAppId 来源AppId
     */
    public Long getSrcAppId() {
        return this.SrcAppId;
    }

    /**
     * Set 来源AppId
     * @param SrcAppId 来源AppId
     */
    public void setSrcAppId(Long SrcAppId) {
        this.SrcAppId = SrcAppId;
    }

    /**
     * Get 项目状态,0正常，-1关闭。默认项目为3 
     * @return Status 项目状态,0正常，-1关闭。默认项目为3
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态,0正常，-1关闭。默认项目为3
     * @param Status 项目状态,0正常，-1关闭。默认项目为3
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否默认项目，1 是，0 不是 
     * @return IsDefault 是否默认项目，1 是，0 不是
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认项目，1 是，0 不是
     * @param IsDefault 是否默认项目，1 是，0 不是
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 描述信息 
     * @return Info 描述信息
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 描述信息
     * @param Info 描述信息
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "SrcPlat", this.SrcPlat);
        this.setParamSimple(map, prefix + "SrcAppId", this.SrcAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

