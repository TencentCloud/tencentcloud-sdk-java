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

public class DisassociateGuardrailConfig extends AbstractModel {

    /**
    * <p>Guardrail 防护配置 ID。</p><p>可通过 DescribeModelRouterGuardrails 获取；DisassociateModelRouterGuardrails 使用该字段定位要解除关联的防护配置。</p>
    */
    @SerializedName("GuardrailId")
    @Expose
    private String GuardrailId;

    /**
     * Get <p>Guardrail 防护配置 ID。</p><p>可通过 DescribeModelRouterGuardrails 获取；DisassociateModelRouterGuardrails 使用该字段定位要解除关联的防护配置。</p> 
     * @return GuardrailId <p>Guardrail 防护配置 ID。</p><p>可通过 DescribeModelRouterGuardrails 获取；DisassociateModelRouterGuardrails 使用该字段定位要解除关联的防护配置。</p>
     */
    public String getGuardrailId() {
        return this.GuardrailId;
    }

    /**
     * Set <p>Guardrail 防护配置 ID。</p><p>可通过 DescribeModelRouterGuardrails 获取；DisassociateModelRouterGuardrails 使用该字段定位要解除关联的防护配置。</p>
     * @param GuardrailId <p>Guardrail 防护配置 ID。</p><p>可通过 DescribeModelRouterGuardrails 获取；DisassociateModelRouterGuardrails 使用该字段定位要解除关联的防护配置。</p>
     */
    public void setGuardrailId(String GuardrailId) {
        this.GuardrailId = GuardrailId;
    }

    public DisassociateGuardrailConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateGuardrailConfig(DisassociateGuardrailConfig source) {
        if (source.GuardrailId != null) {
            this.GuardrailId = new String(source.GuardrailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GuardrailId", this.GuardrailId);

    }
}

