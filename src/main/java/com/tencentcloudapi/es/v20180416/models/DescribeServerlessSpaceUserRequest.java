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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessSpaceUserRequest extends AbstractModel {

    /**
    * 空间的ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 游标
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用户名列表过滤
    */
    @SerializedName("UserNames")
    @Expose
    private String [] UserNames;

    /**
    * 用户类型
    */
    @SerializedName("UserTypes")
    @Expose
    private Long [] UserTypes;

    /**
    * 权限类型
    */
    @SerializedName("PrivilegeTypes")
    @Expose
    private Long [] PrivilegeTypes;

    /**
     * Get 空间的ID 
     * @return SpaceId 空间的ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间的ID
     * @param SpaceId 空间的ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 游标 
     * @return Offset 游标
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 游标
     * @param Offset 游标
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页条数 
     * @return Limit 页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页条数
     * @param Limit 页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用户名列表过滤 
     * @return UserNames 用户名列表过滤
     */
    public String [] getUserNames() {
        return this.UserNames;
    }

    /**
     * Set 用户名列表过滤
     * @param UserNames 用户名列表过滤
     */
    public void setUserNames(String [] UserNames) {
        this.UserNames = UserNames;
    }

    /**
     * Get 用户类型 
     * @return UserTypes 用户类型
     */
    public Long [] getUserTypes() {
        return this.UserTypes;
    }

    /**
     * Set 用户类型
     * @param UserTypes 用户类型
     */
    public void setUserTypes(Long [] UserTypes) {
        this.UserTypes = UserTypes;
    }

    /**
     * Get 权限类型 
     * @return PrivilegeTypes 权限类型
     */
    public Long [] getPrivilegeTypes() {
        return this.PrivilegeTypes;
    }

    /**
     * Set 权限类型
     * @param PrivilegeTypes 权限类型
     */
    public void setPrivilegeTypes(Long [] PrivilegeTypes) {
        this.PrivilegeTypes = PrivilegeTypes;
    }

    public DescribeServerlessSpaceUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessSpaceUserRequest(DescribeServerlessSpaceUserRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UserNames != null) {
            this.UserNames = new String[source.UserNames.length];
            for (int i = 0; i < source.UserNames.length; i++) {
                this.UserNames[i] = new String(source.UserNames[i]);
            }
        }
        if (source.UserTypes != null) {
            this.UserTypes = new Long[source.UserTypes.length];
            for (int i = 0; i < source.UserTypes.length; i++) {
                this.UserTypes[i] = new Long(source.UserTypes[i]);
            }
        }
        if (source.PrivilegeTypes != null) {
            this.PrivilegeTypes = new Long[source.PrivilegeTypes.length];
            for (int i = 0; i < source.PrivilegeTypes.length; i++) {
                this.PrivilegeTypes[i] = new Long(source.PrivilegeTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "UserNames.", this.UserNames);
        this.setParamArraySimple(map, prefix + "UserTypes.", this.UserTypes);
        this.setParamArraySimple(map, prefix + "PrivilegeTypes.", this.PrivilegeTypes);

    }
}

