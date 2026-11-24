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

public class AppTriggerWebhookConfigExt extends AbstractModel {

    /**
    * 访问外部平台的 OAuth 凭证 ID，不能为空。
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * <p>绑定凭证的只读摘要；创建和修改时忽略</p>
    */
    @SerializedName("Credential")
    @Expose
    private AppTriggerWebhookCredential Credential;

    /**
    * 工蜂配置，仅 WebhookProvider=1 时使用，与 TAPDConfig 互斥。
    */
    @SerializedName("GongfengConfig")
    @Expose
    private AppTriggerGongfengWebhookConfig GongfengConfig;

    /**
    * TAPD 配置，仅 WebhookProvider=2 时使用，与 GongfengConfig 互斥。
    */
    @SerializedName("TAPDConfig")
    @Expose
    private AppTriggerTAPDWebhookConfig TAPDConfig;

    /**
     * Get 访问外部平台的 OAuth 凭证 ID，不能为空。 
     * @return CredentialId 访问外部平台的 OAuth 凭证 ID，不能为空。
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 访问外部平台的 OAuth 凭证 ID，不能为空。
     * @param CredentialId 访问外部平台的 OAuth 凭证 ID，不能为空。
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get <p>绑定凭证的只读摘要；创建和修改时忽略</p> 
     * @return Credential <p>绑定凭证的只读摘要；创建和修改时忽略</p>
     */
    public AppTriggerWebhookCredential getCredential() {
        return this.Credential;
    }

    /**
     * Set <p>绑定凭证的只读摘要；创建和修改时忽略</p>
     * @param Credential <p>绑定凭证的只读摘要；创建和修改时忽略</p>
     */
    public void setCredential(AppTriggerWebhookCredential Credential) {
        this.Credential = Credential;
    }

    /**
     * Get 工蜂配置，仅 WebhookProvider=1 时使用，与 TAPDConfig 互斥。 
     * @return GongfengConfig 工蜂配置，仅 WebhookProvider=1 时使用，与 TAPDConfig 互斥。
     */
    public AppTriggerGongfengWebhookConfig getGongfengConfig() {
        return this.GongfengConfig;
    }

    /**
     * Set 工蜂配置，仅 WebhookProvider=1 时使用，与 TAPDConfig 互斥。
     * @param GongfengConfig 工蜂配置，仅 WebhookProvider=1 时使用，与 TAPDConfig 互斥。
     */
    public void setGongfengConfig(AppTriggerGongfengWebhookConfig GongfengConfig) {
        this.GongfengConfig = GongfengConfig;
    }

    /**
     * Get TAPD 配置，仅 WebhookProvider=2 时使用，与 GongfengConfig 互斥。 
     * @return TAPDConfig TAPD 配置，仅 WebhookProvider=2 时使用，与 GongfengConfig 互斥。
     */
    public AppTriggerTAPDWebhookConfig getTAPDConfig() {
        return this.TAPDConfig;
    }

    /**
     * Set TAPD 配置，仅 WebhookProvider=2 时使用，与 GongfengConfig 互斥。
     * @param TAPDConfig TAPD 配置，仅 WebhookProvider=2 时使用，与 GongfengConfig 互斥。
     */
    public void setTAPDConfig(AppTriggerTAPDWebhookConfig TAPDConfig) {
        this.TAPDConfig = TAPDConfig;
    }

    public AppTriggerWebhookConfigExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWebhookConfigExt(AppTriggerWebhookConfigExt source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.Credential != null) {
            this.Credential = new AppTriggerWebhookCredential(source.Credential);
        }
        if (source.GongfengConfig != null) {
            this.GongfengConfig = new AppTriggerGongfengWebhookConfig(source.GongfengConfig);
        }
        if (source.TAPDConfig != null) {
            this.TAPDConfig = new AppTriggerTAPDWebhookConfig(source.TAPDConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamObj(map, prefix + "Credential.", this.Credential);
        this.setParamObj(map, prefix + "GongfengConfig.", this.GongfengConfig);
        this.setParamObj(map, prefix + "TAPDConfig.", this.TAPDConfig);

    }
}

