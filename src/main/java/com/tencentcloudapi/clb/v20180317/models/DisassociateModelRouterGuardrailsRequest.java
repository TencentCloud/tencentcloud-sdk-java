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

public class DisassociateModelRouterGuardrailsRequest extends AbstractModel {

    /**
    * <p>待解除关联的 Guardrail 防护配置列表。</p><p>每个元素只需要填写 GuardrailId。</p>
    */
    @SerializedName("Guardrails")
    @Expose
    private DisassociateGuardrailConfig [] Guardrails;

    /**
    * <p>模型路由实例 ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
     * Get <p>待解除关联的 Guardrail 防护配置列表。</p><p>每个元素只需要填写 GuardrailId。</p> 
     * @return Guardrails <p>待解除关联的 Guardrail 防护配置列表。</p><p>每个元素只需要填写 GuardrailId。</p>
     */
    public DisassociateGuardrailConfig [] getGuardrails() {
        return this.Guardrails;
    }

    /**
     * Set <p>待解除关联的 Guardrail 防护配置列表。</p><p>每个元素只需要填写 GuardrailId。</p>
     * @param Guardrails <p>待解除关联的 Guardrail 防护配置列表。</p><p>每个元素只需要填写 GuardrailId。</p>
     */
    public void setGuardrails(DisassociateGuardrailConfig [] Guardrails) {
        this.Guardrails = Guardrails;
    }

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

    public DisassociateModelRouterGuardrailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateModelRouterGuardrailsRequest(DisassociateModelRouterGuardrailsRequest source) {
        if (source.Guardrails != null) {
            this.Guardrails = new DisassociateGuardrailConfig[source.Guardrails.length];
            for (int i = 0; i < source.Guardrails.length; i++) {
                this.Guardrails[i] = new DisassociateGuardrailConfig(source.Guardrails[i]);
            }
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Guardrails.", this.Guardrails);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);

    }
}

