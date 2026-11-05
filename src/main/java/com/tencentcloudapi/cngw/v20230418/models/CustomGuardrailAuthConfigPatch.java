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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailAuthConfigPatch extends AbstractModel {

    /**
    * <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。审核引擎鉴权方式，必须显式选择 none（无鉴权）或 api_key（Header 密钥）；无鉴权也必须填写 none，不再自动补齐。api_key 时 HeaderName 和 ApiKey 必填；与客户端访问网关的鉴权独立。</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填的有效 HTTP Header 名，例如 X-Audit-Key 或 Authorization；禁止协议保留头。AuthType=none 时不得填写。</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填，作为 Header 完整值原样发送；如需 Bearer，调用方自行填写前缀。修改时省略可沿用已保存密钥；不能用 HasApiKey 代替真实密钥。</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>true 表示清除已保存密钥，不能与 ApiKey 同时传入。仅传 ClearApiKey=true 时同时切换为 none 并清空鉴权 Header；也可通过 AuthType=none 清除既有密钥。</p><p>修改时省略本字段保留原值。</p>
    */
    @SerializedName("ClearApiKey")
    @Expose
    private Boolean ClearApiKey;

    /**
     * Get <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。审核引擎鉴权方式，必须显式选择 none（无鉴权）或 api_key（Header 密钥）；无鉴权也必须填写 none，不再自动补齐。api_key 时 HeaderName 和 ApiKey 必填；与客户端访问网关的鉴权独立。</p> 
     * @return AuthType <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。审核引擎鉴权方式，必须显式选择 none（无鉴权）或 api_key（Header 密钥）；无鉴权也必须填写 none，不再自动补齐。api_key 时 HeaderName 和 ApiKey 必填；与客户端访问网关的鉴权独立。</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。审核引擎鉴权方式，必须显式选择 none（无鉴权）或 api_key（Header 密钥）；无鉴权也必须填写 none，不再自动补齐。api_key 时 HeaderName 和 ApiKey 必填；与客户端访问网关的鉴权独立。</p>
     * @param AuthType <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。审核引擎鉴权方式，必须显式选择 none（无鉴权）或 api_key（Header 密钥）；无鉴权也必须填写 none，不再自动补齐。api_key 时 HeaderName 和 ApiKey 必填；与客户端访问网关的鉴权独立。</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填的有效 HTTP Header 名，例如 X-Audit-Key 或 Authorization；禁止协议保留头。AuthType=none 时不得填写。</p> 
     * @return HeaderName <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填的有效 HTTP Header 名，例如 X-Audit-Key 或 Authorization；禁止协议保留头。AuthType=none 时不得填写。</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填的有效 HTTP Header 名，例如 X-Audit-Key 或 Authorization；禁止协议保留头。AuthType=none 时不得填写。</p>
     * @param HeaderName <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填的有效 HTTP Header 名，例如 X-Audit-Key 或 Authorization；禁止协议保留头。AuthType=none 时不得填写。</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填，作为 Header 完整值原样发送；如需 Bearer，调用方自行填写前缀。修改时省略可沿用已保存密钥；不能用 HasApiKey 代替真实密钥。</p> 
     * @return ApiKey <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填，作为 Header 完整值原样发送；如需 Bearer，调用方自行填写前缀。修改时省略可沿用已保存密钥；不能用 HasApiKey 代替真实密钥。</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填，作为 Header 完整值原样发送；如需 Bearer，调用方自行填写前缀。修改时省略可沿用已保存密钥；不能用 HasApiKey 代替真实密钥。</p>
     * @param ApiKey <p>局部更新：省略本字段保留原值；显式填写须满足枚举及条件必填约束。AuthType=api_key 时必填，作为 Header 完整值原样发送；如需 Bearer，调用方自行填写前缀。修改时省略可沿用已保存密钥；不能用 HasApiKey 代替真实密钥。</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>true 表示清除已保存密钥，不能与 ApiKey 同时传入。仅传 ClearApiKey=true 时同时切换为 none 并清空鉴权 Header；也可通过 AuthType=none 清除既有密钥。</p><p>修改时省略本字段保留原值。</p> 
     * @return ClearApiKey <p>true 表示清除已保存密钥，不能与 ApiKey 同时传入。仅传 ClearApiKey=true 时同时切换为 none 并清空鉴权 Header；也可通过 AuthType=none 清除既有密钥。</p><p>修改时省略本字段保留原值。</p>
     */
    public Boolean getClearApiKey() {
        return this.ClearApiKey;
    }

    /**
     * Set <p>true 表示清除已保存密钥，不能与 ApiKey 同时传入。仅传 ClearApiKey=true 时同时切换为 none 并清空鉴权 Header；也可通过 AuthType=none 清除既有密钥。</p><p>修改时省略本字段保留原值。</p>
     * @param ClearApiKey <p>true 表示清除已保存密钥，不能与 ApiKey 同时传入。仅传 ClearApiKey=true 时同时切换为 none 并清空鉴权 Header；也可通过 AuthType=none 清除既有密钥。</p><p>修改时省略本字段保留原值。</p>
     */
    public void setClearApiKey(Boolean ClearApiKey) {
        this.ClearApiKey = ClearApiKey;
    }

    public CustomGuardrailAuthConfigPatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailAuthConfigPatch(CustomGuardrailAuthConfigPatch source) {
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.ClearApiKey != null) {
            this.ClearApiKey = new Boolean(source.ClearApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "ClearApiKey", this.ClearApiKey);

    }
}

