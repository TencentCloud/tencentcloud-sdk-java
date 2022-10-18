/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OIDCConfigAuthenticationOptions extends AbstractModel{

    /**
    * 创建身份提供商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreateOIDCConfig")
    @Expose
    private Boolean AutoCreateOIDCConfig;

    /**
    * 创建身份提供商的ClientId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreateClientId")
    @Expose
    private String [] AutoCreateClientId;

    /**
    * 创建PodIdentityWebhook组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoInstallPodIdentityWebhookAddon")
    @Expose
    private Boolean AutoInstallPodIdentityWebhookAddon;

    /**
     * Get 创建身份提供商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreateOIDCConfig 创建身份提供商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoCreateOIDCConfig() {
        return this.AutoCreateOIDCConfig;
    }

    /**
     * Set 创建身份提供商
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreateOIDCConfig 创建身份提供商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreateOIDCConfig(Boolean AutoCreateOIDCConfig) {
        this.AutoCreateOIDCConfig = AutoCreateOIDCConfig;
    }

    /**
     * Get 创建身份提供商的ClientId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreateClientId 创建身份提供商的ClientId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAutoCreateClientId() {
        return this.AutoCreateClientId;
    }

    /**
     * Set 创建身份提供商的ClientId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreateClientId 创建身份提供商的ClientId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreateClientId(String [] AutoCreateClientId) {
        this.AutoCreateClientId = AutoCreateClientId;
    }

    /**
     * Get 创建PodIdentityWebhook组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoInstallPodIdentityWebhookAddon 创建PodIdentityWebhook组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoInstallPodIdentityWebhookAddon() {
        return this.AutoInstallPodIdentityWebhookAddon;
    }

    /**
     * Set 创建PodIdentityWebhook组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoInstallPodIdentityWebhookAddon 创建PodIdentityWebhook组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoInstallPodIdentityWebhookAddon(Boolean AutoInstallPodIdentityWebhookAddon) {
        this.AutoInstallPodIdentityWebhookAddon = AutoInstallPodIdentityWebhookAddon;
    }

    public OIDCConfigAuthenticationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OIDCConfigAuthenticationOptions(OIDCConfigAuthenticationOptions source) {
        if (source.AutoCreateOIDCConfig != null) {
            this.AutoCreateOIDCConfig = new Boolean(source.AutoCreateOIDCConfig);
        }
        if (source.AutoCreateClientId != null) {
            this.AutoCreateClientId = new String[source.AutoCreateClientId.length];
            for (int i = 0; i < source.AutoCreateClientId.length; i++) {
                this.AutoCreateClientId[i] = new String(source.AutoCreateClientId[i]);
            }
        }
        if (source.AutoInstallPodIdentityWebhookAddon != null) {
            this.AutoInstallPodIdentityWebhookAddon = new Boolean(source.AutoInstallPodIdentityWebhookAddon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCreateOIDCConfig", this.AutoCreateOIDCConfig);
        this.setParamArraySimple(map, prefix + "AutoCreateClientId.", this.AutoCreateClientId);
        this.setParamSimple(map, prefix + "AutoInstallPodIdentityWebhookAddon", this.AutoInstallPodIdentityWebhookAddon);

    }
}

