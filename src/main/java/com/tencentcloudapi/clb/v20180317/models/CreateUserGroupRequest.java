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

public class CreateUserGroupRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID。用户组将创建在该实例下。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>用户组名称。必填。同一模型路由实例下名称唯一，长度不超过255个字符。</p>
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * <p>建组时直接关联的预算 ID（须为已存在的 Budget）。关联后由该 Budget 统一管理本组的消费上限与限速。不传表示不关联预算，可建组后再用 AssociateBudget 关联。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。命中意图路由名时其内部真实模型自动豁免白名单。为空表示不授权任何意图路由。</p>
    */
    @SerializedName("IntentRouters")
    @Expose
    private String [] IntentRouters;

    /**
    * <p>建组时同时绑定的已有 Key ID 列表，最多100个。每个 Key 须属于同一模型路由实例。建组与绑定为一个原子异步任务，任一 Key 失败则整组创建回滚。不传表示建空组。</p>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。为空表示不在用户组层限制真实模型（按实例层白名单生效）。</p>
    */
    @SerializedName("Models")
    @Expose
    private String [] Models;

    /**
    * <p>标签列表，最多50个。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>模型路由实例ID。用户组将创建在该实例下。</p> 
     * @return ModelRouterId <p>模型路由实例ID。用户组将创建在该实例下。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。用户组将创建在该实例下。</p>
     * @param ModelRouterId <p>模型路由实例ID。用户组将创建在该实例下。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>用户组名称。必填。同一模型路由实例下名称唯一，长度不超过255个字符。</p> 
     * @return UserGroupName <p>用户组名称。必填。同一模型路由实例下名称唯一，长度不超过255个字符。</p>
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set <p>用户组名称。必填。同一模型路由实例下名称唯一，长度不超过255个字符。</p>
     * @param UserGroupName <p>用户组名称。必填。同一模型路由实例下名称唯一，长度不超过255个字符。</p>
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get <p>建组时直接关联的预算 ID（须为已存在的 Budget）。关联后由该 Budget 统一管理本组的消费上限与限速。不传表示不关联预算，可建组后再用 AssociateBudget 关联。</p> 
     * @return BudgetId <p>建组时直接关联的预算 ID（须为已存在的 Budget）。关联后由该 Budget 统一管理本组的消费上限与限速。不传表示不关联预算，可建组后再用 AssociateBudget 关联。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>建组时直接关联的预算 ID（须为已存在的 Budget）。关联后由该 Budget 统一管理本组的消费上限与限速。不传表示不关联预算，可建组后再用 AssociateBudget 关联。</p>
     * @param BudgetId <p>建组时直接关联的预算 ID（须为已存在的 Budget）。关联后由该 Budget 统一管理本组的消费上限与限速。不传表示不关联预算，可建组后再用 AssociateBudget 关联。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。命中意图路由名时其内部真实模型自动豁免白名单。为空表示不授权任何意图路由。</p> 
     * @return IntentRouters <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。命中意图路由名时其内部真实模型自动豁免白名单。为空表示不授权任何意图路由。</p>
     */
    public String [] getIntentRouters() {
        return this.IntentRouters;
    }

    /**
     * Set <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。命中意图路由名时其内部真实模型自动豁免白名单。为空表示不授权任何意图路由。</p>
     * @param IntentRouters <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。命中意图路由名时其内部真实模型自动豁免白名单。为空表示不授权任何意图路由。</p>
     */
    public void setIntentRouters(String [] IntentRouters) {
        this.IntentRouters = IntentRouters;
    }

    /**
     * Get <p>建组时同时绑定的已有 Key ID 列表，最多100个。每个 Key 须属于同一模型路由实例。建组与绑定为一个原子异步任务，任一 Key 失败则整组创建回滚。不传表示建空组。</p> 
     * @return KeyIds <p>建组时同时绑定的已有 Key ID 列表，最多100个。每个 Key 须属于同一模型路由实例。建组与绑定为一个原子异步任务，任一 Key 失败则整组创建回滚。不传表示建空组。</p>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>建组时同时绑定的已有 Key ID 列表，最多100个。每个 Key 须属于同一模型路由实例。建组与绑定为一个原子异步任务，任一 Key 失败则整组创建回滚。不传表示建空组。</p>
     * @param KeyIds <p>建组时同时绑定的已有 Key ID 列表，最多100个。每个 Key 须属于同一模型路由实例。建组与绑定为一个原子异步任务，任一 Key 失败则整组创建回滚。不传表示建空组。</p>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。为空表示不在用户组层限制真实模型（按实例层白名单生效）。</p> 
     * @return Models <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。为空表示不在用户组层限制真实模型（按实例层白名单生效）。</p>
     */
    public String [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。为空表示不在用户组层限制真实模型（按实例层白名单生效）。</p>
     * @param Models <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。为空表示不在用户组层限制真实模型（按实例层白名单生效）。</p>
     */
    public void setModels(String [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>标签列表，最多50个。</p> 
     * @return Tags <p>标签列表，最多50个。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表，最多50个。</p>
     * @param Tags <p>标签列表，最多50个。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserGroupRequest(CreateUserGroupRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.IntentRouters != null) {
            this.IntentRouters = new String[source.IntentRouters.length];
            for (int i = 0; i < source.IntentRouters.length; i++) {
                this.IntentRouters[i] = new String(source.IntentRouters[i]);
            }
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.Models != null) {
            this.Models = new String[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new String(source.Models[i]);
            }
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
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArraySimple(map, prefix + "IntentRouters.", this.IntentRouters);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamArraySimple(map, prefix + "Models.", this.Models);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

