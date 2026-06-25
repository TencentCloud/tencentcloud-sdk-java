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

public class ModifyUserGroupAttributesRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>待修改的用户组ID。不可为「未分组」虚拟分组 ugrp-ungrouped。</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>用户组关联的预算ID。不传则不修改预算关联；传入有效 budget-xxx 则将该用户组关联到此预算（若已关联其它预算则替换为本预算）。仅支持关联/替换，不支持解绑——解绑请用 DisassociateBudget。预算与组内 Key、所属实例的预算各自独立判定。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。不传则不修改；传入即整体覆盖。</p>
    */
    @SerializedName("IntentRouters")
    @Expose
    private String [] IntentRouters;

    /**
    * <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。不传则不修改；传入即整体覆盖。</p>
    */
    @SerializedName("Models")
    @Expose
    private String [] Models;

    /**
    * <p>用户组名称。不传则不修改；传入时长度不超过255个字符、同实例下唯一。</p>
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
     * Get <p>模型路由实例ID。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>待修改的用户组ID。不可为「未分组」虚拟分组 ugrp-ungrouped。</p> 
     * @return UserGroupId <p>待修改的用户组ID。不可为「未分组」虚拟分组 ugrp-ungrouped。</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>待修改的用户组ID。不可为「未分组」虚拟分组 ugrp-ungrouped。</p>
     * @param UserGroupId <p>待修改的用户组ID。不可为「未分组」虚拟分组 ugrp-ungrouped。</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>用户组关联的预算ID。不传则不修改预算关联；传入有效 budget-xxx 则将该用户组关联到此预算（若已关联其它预算则替换为本预算）。仅支持关联/替换，不支持解绑——解绑请用 DisassociateBudget。预算与组内 Key、所属实例的预算各自独立判定。</p> 
     * @return BudgetId <p>用户组关联的预算ID。不传则不修改预算关联；传入有效 budget-xxx 则将该用户组关联到此预算（若已关联其它预算则替换为本预算）。仅支持关联/替换，不支持解绑——解绑请用 DisassociateBudget。预算与组内 Key、所属实例的预算各自独立判定。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>用户组关联的预算ID。不传则不修改预算关联；传入有效 budget-xxx 则将该用户组关联到此预算（若已关联其它预算则替换为本预算）。仅支持关联/替换，不支持解绑——解绑请用 DisassociateBudget。预算与组内 Key、所属实例的预算各自独立判定。</p>
     * @param BudgetId <p>用户组关联的预算ID。不传则不修改预算关联；传入有效 budget-xxx 则将该用户组关联到此预算（若已关联其它预算则替换为本预算）。仅支持关联/替换，不支持解绑——解绑请用 DisassociateBudget。预算与组内 Key、所属实例的预算各自独立判定。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。不传则不修改；传入即整体覆盖。</p> 
     * @return IntentRouters <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。不传则不修改；传入即整体覆盖。</p>
     */
    public String [] getIntentRouters() {
        return this.IntentRouters;
    }

    /**
     * Set <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。不传则不修改；传入即整体覆盖。</p>
     * @param IntentRouters <p>用户组意图路由白名单（ir-xxx）。每一项须为该实例已创建的意图路由名。不传则不修改；传入即整体覆盖。</p>
     */
    public void setIntentRouters(String [] IntentRouters) {
        this.IntentRouters = IntentRouters;
    }

    /**
     * Get <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。不传则不修改；传入即整体覆盖。</p> 
     * @return Models <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。不传则不修改；传入即整体覆盖。</p>
     */
    public String [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。不传则不修改；传入即整体覆盖。</p>
     * @param Models <p>用户组真实模型白名单。每一项须为该实例已关联的模型名。不传则不修改；传入即整体覆盖。</p>
     */
    public void setModels(String [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>用户组名称。不传则不修改；传入时长度不超过255个字符、同实例下唯一。</p> 
     * @return UserGroupName <p>用户组名称。不传则不修改；传入时长度不超过255个字符、同实例下唯一。</p>
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set <p>用户组名称。不传则不修改；传入时长度不超过255个字符、同实例下唯一。</p>
     * @param UserGroupName <p>用户组名称。不传则不修改；传入时长度不超过255个字符、同实例下唯一。</p>
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    public ModifyUserGroupAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserGroupAttributesRequest(ModifyUserGroupAttributesRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
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
        if (source.Models != null) {
            this.Models = new String[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new String(source.Models[i]);
            }
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArraySimple(map, prefix + "IntentRouters.", this.IntentRouters);
        this.setParamArraySimple(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);

    }
}

