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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrgData extends AbstractModel {

    /**
    * 组织 ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 组织名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组织父节点 ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 组织层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 组织结构
    */
    @SerializedName("ParentIds")
    @Expose
    private String ParentIds;

    /**
    * 设备总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 设备在线数量
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
     * Get 组织 ID 
     * @return OrganizationId 组织 ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 组织 ID
     * @param OrganizationId 组织 ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 组织名称 
     * @return Name 组织名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组织名称
     * @param Name 组织名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组织父节点 ID 
     * @return ParentId 组织父节点 ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 组织父节点 ID
     * @param ParentId 组织父节点 ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 组织层级 
     * @return Level 组织层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 组织层级
     * @param Level 组织层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 用户ID 
     * @return AppId 用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 组织结构 
     * @return ParentIds 组织结构
     */
    public String getParentIds() {
        return this.ParentIds;
    }

    /**
     * Set 组织结构
     * @param ParentIds 组织结构
     */
    public void setParentIds(String ParentIds) {
        this.ParentIds = ParentIds;
    }

    /**
     * Get 设备总数 
     * @return Total 设备总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 设备总数
     * @param Total 设备总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 设备在线数量 
     * @return Online 设备在线数量
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 设备在线数量
     * @param Online 设备在线数量
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    public UpdateOrgData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrgData(UpdateOrgData source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ParentIds != null) {
            this.ParentIds = new String(source.ParentIds);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ParentIds", this.ParentIds);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

