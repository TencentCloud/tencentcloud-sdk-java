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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPromptTemplateRequest extends AbstractModel {

    /**
    * <p>空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>提示词模板ID</p>
    */
    @SerializedName("PromptTemplateId")
    @Expose
    private String PromptTemplateId;

    /**
    * <p>要更新的字段掩码</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>提示词规格</p>
    */
    @SerializedName("Spec")
    @Expose
    private PromptTemplateSpec Spec;

    /**
     * Get <p>空间ID</p> 
     * @return SpaceId <p>空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间ID</p>
     * @param SpaceId <p>空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>提示词模板ID</p> 
     * @return PromptTemplateId <p>提示词模板ID</p>
     */
    public String getPromptTemplateId() {
        return this.PromptTemplateId;
    }

    /**
     * Set <p>提示词模板ID</p>
     * @param PromptTemplateId <p>提示词模板ID</p>
     */
    public void setPromptTemplateId(String PromptTemplateId) {
        this.PromptTemplateId = PromptTemplateId;
    }

    /**
     * Get <p>要更新的字段掩码</p> 
     * @return UpdateMask <p>要更新的字段掩码</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>要更新的字段掩码</p>
     * @param UpdateMask <p>要更新的字段掩码</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>提示词规格</p> 
     * @return Spec <p>提示词规格</p>
     */
    public PromptTemplateSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>提示词规格</p>
     * @param Spec <p>提示词规格</p>
     */
    public void setSpec(PromptTemplateSpec Spec) {
        this.Spec = Spec;
    }

    public ModifyPromptTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPromptTemplateRequest(ModifyPromptTemplateRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.PromptTemplateId != null) {
            this.PromptTemplateId = new String(source.PromptTemplateId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.Spec != null) {
            this.Spec = new PromptTemplateSpec(source.Spec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "PromptTemplateId", this.PromptTemplateId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamObj(map, prefix + "Spec.", this.Spec);

    }
}

