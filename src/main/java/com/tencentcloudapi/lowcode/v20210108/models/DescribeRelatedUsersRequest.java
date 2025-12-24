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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedUsersRequest extends AbstractModel {

    /**
    * 角色id
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 页面含量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 环境类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 新角色id
    */
    @SerializedName("RoleStringId")
    @Expose
    private String RoleStringId;

    /**
     * Get 角色id 
     * @return RoleId 角色id
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id
     * @param RoleId 角色id
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 页面含量 
     * @return PageSize 页面含量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面含量
     * @param PageSize 页面含量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 环境类型 
     * @return EnvType 环境类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型
     * @param EnvType 环境类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 新角色id 
     * @return RoleStringId 新角色id
     */
    public String getRoleStringId() {
        return this.RoleStringId;
    }

    /**
     * Set 新角色id
     * @param RoleStringId 新角色id
     */
    public void setRoleStringId(String RoleStringId) {
        this.RoleStringId = RoleStringId;
    }

    public DescribeRelatedUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedUsersRequest(DescribeRelatedUsersRequest source) {
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.RoleStringId != null) {
            this.RoleStringId = new String(source.RoleStringId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "RoleStringId", this.RoleStringId);

    }
}

