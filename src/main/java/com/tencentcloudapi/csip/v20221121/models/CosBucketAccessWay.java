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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBucketAccessWay extends AbstractModel {

    /**
    * 可访问方式：
specify 指定用户
anonymous 可匿名访问
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 用户数
    */
    @SerializedName("AccessUserCount")
    @Expose
    private Long AccessUserCount;

    /**
    * ak数
    */
    @SerializedName("AccessAkCount")
    @Expose
    private Long AccessAkCount;

    /**
    * 角色数
    */
    @SerializedName("AccessRoleCount")
    @Expose
    private Long AccessRoleCount;

    /**
     * Get 可访问方式：
specify 指定用户
anonymous 可匿名访问 
     * @return AccessType 可访问方式：
specify 指定用户
anonymous 可匿名访问
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 可访问方式：
specify 指定用户
anonymous 可匿名访问
     * @param AccessType 可访问方式：
specify 指定用户
anonymous 可匿名访问
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 用户数 
     * @return AccessUserCount 用户数
     */
    public Long getAccessUserCount() {
        return this.AccessUserCount;
    }

    /**
     * Set 用户数
     * @param AccessUserCount 用户数
     */
    public void setAccessUserCount(Long AccessUserCount) {
        this.AccessUserCount = AccessUserCount;
    }

    /**
     * Get ak数 
     * @return AccessAkCount ak数
     */
    public Long getAccessAkCount() {
        return this.AccessAkCount;
    }

    /**
     * Set ak数
     * @param AccessAkCount ak数
     */
    public void setAccessAkCount(Long AccessAkCount) {
        this.AccessAkCount = AccessAkCount;
    }

    /**
     * Get 角色数 
     * @return AccessRoleCount 角色数
     */
    public Long getAccessRoleCount() {
        return this.AccessRoleCount;
    }

    /**
     * Set 角色数
     * @param AccessRoleCount 角色数
     */
    public void setAccessRoleCount(Long AccessRoleCount) {
        this.AccessRoleCount = AccessRoleCount;
    }

    public CosBucketAccessWay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketAccessWay(CosBucketAccessWay source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.AccessUserCount != null) {
            this.AccessUserCount = new Long(source.AccessUserCount);
        }
        if (source.AccessAkCount != null) {
            this.AccessAkCount = new Long(source.AccessAkCount);
        }
        if (source.AccessRoleCount != null) {
            this.AccessRoleCount = new Long(source.AccessRoleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessUserCount", this.AccessUserCount);
        this.setParamSimple(map, prefix + "AccessAkCount", this.AccessAkCount);
        this.setParamSimple(map, prefix + "AccessRoleCount", this.AccessRoleCount);

    }
}

