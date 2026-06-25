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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserOrg extends AbstractModel {

    /**
    * <p>ioa用户组织id</p>
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * <p>ioa用户组织名称</p>
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * <p>ioa用户组织id路径</p>
    */
    @SerializedName("OrgIdPath")
    @Expose
    private String OrgIdPath;

    /**
    * <p>ioa用户组织名称路径</p>
    */
    @SerializedName("OrgNamePath")
    @Expose
    private String OrgNamePath;

    /**
    * <p>ioa用户组织id下的用户数</p>
    */
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * <p>组织绑定的用户组 id 列表</p>
    */
    @SerializedName("BindGroupIds")
    @Expose
    private Long [] BindGroupIds;

    /**
     * Get <p>ioa用户组织id</p> 
     * @return OrgId <p>ioa用户组织id</p>
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>ioa用户组织id</p>
     * @param OrgId <p>ioa用户组织id</p>
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get <p>ioa用户组织名称</p> 
     * @return OrgName <p>ioa用户组织名称</p>
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set <p>ioa用户组织名称</p>
     * @param OrgName <p>ioa用户组织名称</p>
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get <p>ioa用户组织id路径</p> 
     * @return OrgIdPath <p>ioa用户组织id路径</p>
     */
    public String getOrgIdPath() {
        return this.OrgIdPath;
    }

    /**
     * Set <p>ioa用户组织id路径</p>
     * @param OrgIdPath <p>ioa用户组织id路径</p>
     */
    public void setOrgIdPath(String OrgIdPath) {
        this.OrgIdPath = OrgIdPath;
    }

    /**
     * Get <p>ioa用户组织名称路径</p> 
     * @return OrgNamePath <p>ioa用户组织名称路径</p>
     */
    public String getOrgNamePath() {
        return this.OrgNamePath;
    }

    /**
     * Set <p>ioa用户组织名称路径</p>
     * @param OrgNamePath <p>ioa用户组织名称路径</p>
     */
    public void setOrgNamePath(String OrgNamePath) {
        this.OrgNamePath = OrgNamePath;
    }

    /**
     * Get <p>ioa用户组织id下的用户数</p> 
     * @return UserTotal <p>ioa用户组织id下的用户数</p>
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set <p>ioa用户组织id下的用户数</p>
     * @param UserTotal <p>ioa用户组织id下的用户数</p>
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get <p>组织绑定的用户组 id 列表</p> 
     * @return BindGroupIds <p>组织绑定的用户组 id 列表</p>
     */
    public Long [] getBindGroupIds() {
        return this.BindGroupIds;
    }

    /**
     * Set <p>组织绑定的用户组 id 列表</p>
     * @param BindGroupIds <p>组织绑定的用户组 id 列表</p>
     */
    public void setBindGroupIds(Long [] BindGroupIds) {
        this.BindGroupIds = BindGroupIds;
    }

    public UserOrg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserOrg(UserOrg source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.OrgIdPath != null) {
            this.OrgIdPath = new String(source.OrgIdPath);
        }
        if (source.OrgNamePath != null) {
            this.OrgNamePath = new String(source.OrgNamePath);
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.BindGroupIds != null) {
            this.BindGroupIds = new Long[source.BindGroupIds.length];
            for (int i = 0; i < source.BindGroupIds.length; i++) {
                this.BindGroupIds[i] = new Long(source.BindGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "OrgIdPath", this.OrgIdPath);
        this.setParamSimple(map, prefix + "OrgNamePath", this.OrgNamePath);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamArraySimple(map, prefix + "BindGroupIds.", this.BindGroupIds);

    }
}

