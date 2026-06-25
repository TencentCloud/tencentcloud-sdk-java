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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>Key名称</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>限速配置</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForKey RateLimitConfig;

    /**
    * <p>关联的积分预算ID</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>需要关联的用户组ID</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>模型路由实例ID</p> 
     * @return ModelRouterId <p>模型路由实例ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID</p>
     * @param ModelRouterId <p>模型路由实例ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>Key名称</p> 
     * @return KeyName <p>Key名称</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>Key名称</p>
     * @param KeyName <p>Key名称</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>限速配置</p> 
     * @return RateLimitConfig <p>限速配置</p>
     */
    public RateLimitConfigForKey getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速配置</p>
     * @param RateLimitConfig <p>限速配置</p>
     */
    public void setRateLimitConfig(RateLimitConfigForKey RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>关联的积分预算ID</p> 
     * @return BudgetId <p>关联的积分预算ID</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>关联的积分预算ID</p>
     * @param BudgetId <p>关联的积分预算ID</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>需要关联的用户组ID</p> 
     * @return UserGroupId <p>需要关联的用户组ID</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>需要关联的用户组ID</p>
     * @param UserGroupId <p>需要关联的用户组ID</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyRequest(CreateKeyRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForKey(source.RateLimitConfig);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

