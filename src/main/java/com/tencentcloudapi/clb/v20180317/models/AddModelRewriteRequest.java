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

public class AddModelRewriteRequest extends AbstractModel {

    /**
    * <p>模型路由实例 ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>源模型名（重写规则的 key）。</p><p>长度 1-255 字符；支持特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p><p>不允许使用 <code>IntentRouter/</code> 前缀（大小写不敏感），即 IntentRouter 不能作为 source。</p>
    */
    @SerializedName("SourceModel")
    @Expose
    private String SourceModel;

    /**
    * <p>目标模型名（重写规则的 value）。</p><p>长度 1-255 字符；必须是已关联到该模型路由实例的模型（含 IntentRouter/* 也需先通过 AssociateModels 关联）。</p><p>不允许使用 <code>default</code>；不允许与 SourceModel 相同（大小写不敏感）。</p>
    */
    @SerializedName("TargetModel")
    @Expose
    private String TargetModel;

    /**
     * Get <p>模型路由实例 ID。</p> 
     * @return ModelRouterId <p>模型路由实例 ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例 ID。</p>
     * @param ModelRouterId <p>模型路由实例 ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>源模型名（重写规则的 key）。</p><p>长度 1-255 字符；支持特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p><p>不允许使用 <code>IntentRouter/</code> 前缀（大小写不敏感），即 IntentRouter 不能作为 source。</p> 
     * @return SourceModel <p>源模型名（重写规则的 key）。</p><p>长度 1-255 字符；支持特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p><p>不允许使用 <code>IntentRouter/</code> 前缀（大小写不敏感），即 IntentRouter 不能作为 source。</p>
     */
    public String getSourceModel() {
        return this.SourceModel;
    }

    /**
     * Set <p>源模型名（重写规则的 key）。</p><p>长度 1-255 字符；支持特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p><p>不允许使用 <code>IntentRouter/</code> 前缀（大小写不敏感），即 IntentRouter 不能作为 source。</p>
     * @param SourceModel <p>源模型名（重写规则的 key）。</p><p>长度 1-255 字符；支持特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p><p>不允许使用 <code>IntentRouter/</code> 前缀（大小写不敏感），即 IntentRouter 不能作为 source。</p>
     */
    public void setSourceModel(String SourceModel) {
        this.SourceModel = SourceModel;
    }

    /**
     * Get <p>目标模型名（重写规则的 value）。</p><p>长度 1-255 字符；必须是已关联到该模型路由实例的模型（含 IntentRouter/* 也需先通过 AssociateModels 关联）。</p><p>不允许使用 <code>default</code>；不允许与 SourceModel 相同（大小写不敏感）。</p> 
     * @return TargetModel <p>目标模型名（重写规则的 value）。</p><p>长度 1-255 字符；必须是已关联到该模型路由实例的模型（含 IntentRouter/* 也需先通过 AssociateModels 关联）。</p><p>不允许使用 <code>default</code>；不允许与 SourceModel 相同（大小写不敏感）。</p>
     */
    public String getTargetModel() {
        return this.TargetModel;
    }

    /**
     * Set <p>目标模型名（重写规则的 value）。</p><p>长度 1-255 字符；必须是已关联到该模型路由实例的模型（含 IntentRouter/* 也需先通过 AssociateModels 关联）。</p><p>不允许使用 <code>default</code>；不允许与 SourceModel 相同（大小写不敏感）。</p>
     * @param TargetModel <p>目标模型名（重写规则的 value）。</p><p>长度 1-255 字符；必须是已关联到该模型路由实例的模型（含 IntentRouter/* 也需先通过 AssociateModels 关联）。</p><p>不允许使用 <code>default</code>；不允许与 SourceModel 相同（大小写不敏感）。</p>
     */
    public void setTargetModel(String TargetModel) {
        this.TargetModel = TargetModel;
    }

    public AddModelRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddModelRewriteRequest(AddModelRewriteRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.SourceModel != null) {
            this.SourceModel = new String(source.SourceModel);
        }
        if (source.TargetModel != null) {
            this.TargetModel = new String(source.TargetModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "SourceModel", this.SourceModel);
        this.setParamSimple(map, prefix + "TargetModel", this.TargetModel);

    }
}

