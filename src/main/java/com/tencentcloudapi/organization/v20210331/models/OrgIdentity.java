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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgIdentity extends AbstractModel {

    /**
    * 身份ID。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 身份名称。
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 身份策略。
    */
    @SerializedName("IdentityPolicy")
    @Expose
    private IdentityPolicy [] IdentityPolicy;

    /**
    * 身份类型。 1-预设、 2-自定义
    */
    @SerializedName("IdentityType")
    @Expose
    private Long IdentityType;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 身份ID。 
     * @return IdentityId 身份ID。
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 身份ID。
     * @param IdentityId 身份ID。
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 身份名称。 
     * @return IdentityAliasName 身份名称。
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set 身份名称。
     * @param IdentityAliasName 身份名称。
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 身份策略。 
     * @return IdentityPolicy 身份策略。
     */
    public IdentityPolicy [] getIdentityPolicy() {
        return this.IdentityPolicy;
    }

    /**
     * Set 身份策略。
     * @param IdentityPolicy 身份策略。
     */
    public void setIdentityPolicy(IdentityPolicy [] IdentityPolicy) {
        this.IdentityPolicy = IdentityPolicy;
    }

    /**
     * Get 身份类型。 1-预设、 2-自定义 
     * @return IdentityType 身份类型。 1-预设、 2-自定义
     */
    public Long getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set 身份类型。 1-预设、 2-自定义
     * @param IdentityType 身份类型。 1-预设、 2-自定义
     */
    public void setIdentityType(Long IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public OrgIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgIdentity(OrgIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IdentityPolicy != null) {
            this.IdentityPolicy = new IdentityPolicy[source.IdentityPolicy.length];
            for (int i = 0; i < source.IdentityPolicy.length; i++) {
                this.IdentityPolicy[i] = new IdentityPolicy(source.IdentityPolicy[i]);
            }
        }
        if (source.IdentityType != null) {
            this.IdentityType = new Long(source.IdentityType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "IdentityPolicy.", this.IdentityPolicy);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

