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

public class CreateKeysRequest extends AbstractModel {

    /**
    * <p>模型路由ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>需要绑定的预算信息，所有Key共用</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>Key列表</p>
    */
    @SerializedName("Keys")
    @Expose
    private InputKeyInfo [] Keys;

    /**
    * <p>批量创建Key的模式</p><p>枚举值：</p><ul><li>Generate： 平台生成Key</li><li>Import： 导入自带Key</li></ul><p>默认值：Generate</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>限速信息，所有Key共用</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForKey RateLimitConfig;

    /**
    * <p>标签。所有Key都会绑定该标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>需要关联的用户组ID</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
     * Get <p>模型路由ID</p> 
     * @return ModelRouterId <p>模型路由ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由ID</p>
     * @param ModelRouterId <p>模型路由ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>需要绑定的预算信息，所有Key共用</p> 
     * @return BudgetId <p>需要绑定的预算信息，所有Key共用</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>需要绑定的预算信息，所有Key共用</p>
     * @param BudgetId <p>需要绑定的预算信息，所有Key共用</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>Key列表</p> 
     * @return Keys <p>Key列表</p>
     */
    public InputKeyInfo [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>Key列表</p>
     * @param Keys <p>Key列表</p>
     */
    public void setKeys(InputKeyInfo [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>批量创建Key的模式</p><p>枚举值：</p><ul><li>Generate： 平台生成Key</li><li>Import： 导入自带Key</li></ul><p>默认值：Generate</p> 
     * @return Mode <p>批量创建Key的模式</p><p>枚举值：</p><ul><li>Generate： 平台生成Key</li><li>Import： 导入自带Key</li></ul><p>默认值：Generate</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>批量创建Key的模式</p><p>枚举值：</p><ul><li>Generate： 平台生成Key</li><li>Import： 导入自带Key</li></ul><p>默认值：Generate</p>
     * @param Mode <p>批量创建Key的模式</p><p>枚举值：</p><ul><li>Generate： 平台生成Key</li><li>Import： 导入自带Key</li></ul><p>默认值：Generate</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>限速信息，所有Key共用</p> 
     * @return RateLimitConfig <p>限速信息，所有Key共用</p>
     */
    public RateLimitConfigForKey getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速信息，所有Key共用</p>
     * @param RateLimitConfig <p>限速信息，所有Key共用</p>
     */
    public void setRateLimitConfig(RateLimitConfigForKey RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>标签。所有Key都会绑定该标签。</p> 
     * @return Tags <p>标签。所有Key都会绑定该标签。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签。所有Key都会绑定该标签。</p>
     * @param Tags <p>标签。所有Key都会绑定该标签。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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

    public CreateKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeysRequest(CreateKeysRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.Keys != null) {
            this.Keys = new InputKeyInfo[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new InputKeyInfo(source.Keys[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForKey(source.RateLimitConfig);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);

    }
}

