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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RolePolicie extends AbstractModel {

    /**
    * 策略ID。
    */
    @SerializedName("RolePolicyId")
    @Expose
    private Long RolePolicyId;

    /**
    * 权限策略名称
    */
    @SerializedName("RolePolicyName")
    @Expose
    private String RolePolicyName;

    /**
    * 权限策略类型
    */
    @SerializedName("RolePolicyType")
    @Expose
    private String RolePolicyType;

    /**
    * 自定义策略内容。仅自定义策略返回该参数。
    */
    @SerializedName("RolePolicyDocument")
    @Expose
    private String RolePolicyDocument;

    /**
    * 权限策略被添加到权限配置的时间。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get 策略ID。 
     * @return RolePolicyId 策略ID。
     */
    public Long getRolePolicyId() {
        return this.RolePolicyId;
    }

    /**
     * Set 策略ID。
     * @param RolePolicyId 策略ID。
     */
    public void setRolePolicyId(Long RolePolicyId) {
        this.RolePolicyId = RolePolicyId;
    }

    /**
     * Get 权限策略名称 
     * @return RolePolicyName 权限策略名称
     */
    public String getRolePolicyName() {
        return this.RolePolicyName;
    }

    /**
     * Set 权限策略名称
     * @param RolePolicyName 权限策略名称
     */
    public void setRolePolicyName(String RolePolicyName) {
        this.RolePolicyName = RolePolicyName;
    }

    /**
     * Get 权限策略类型 
     * @return RolePolicyType 权限策略类型
     */
    public String getRolePolicyType() {
        return this.RolePolicyType;
    }

    /**
     * Set 权限策略类型
     * @param RolePolicyType 权限策略类型
     */
    public void setRolePolicyType(String RolePolicyType) {
        this.RolePolicyType = RolePolicyType;
    }

    /**
     * Get 自定义策略内容。仅自定义策略返回该参数。 
     * @return RolePolicyDocument 自定义策略内容。仅自定义策略返回该参数。
     */
    public String getRolePolicyDocument() {
        return this.RolePolicyDocument;
    }

    /**
     * Set 自定义策略内容。仅自定义策略返回该参数。
     * @param RolePolicyDocument 自定义策略内容。仅自定义策略返回该参数。
     */
    public void setRolePolicyDocument(String RolePolicyDocument) {
        this.RolePolicyDocument = RolePolicyDocument;
    }

    /**
     * Get 权限策略被添加到权限配置的时间。 
     * @return AddTime 权限策略被添加到权限配置的时间。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 权限策略被添加到权限配置的时间。
     * @param AddTime 权限策略被添加到权限配置的时间。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public RolePolicie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePolicie(RolePolicie source) {
        if (source.RolePolicyId != null) {
            this.RolePolicyId = new Long(source.RolePolicyId);
        }
        if (source.RolePolicyName != null) {
            this.RolePolicyName = new String(source.RolePolicyName);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyDocument != null) {
            this.RolePolicyDocument = new String(source.RolePolicyDocument);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RolePolicyId", this.RolePolicyId);
        this.setParamSimple(map, prefix + "RolePolicyName", this.RolePolicyName);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamSimple(map, prefix + "RolePolicyDocument", this.RolePolicyDocument);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

