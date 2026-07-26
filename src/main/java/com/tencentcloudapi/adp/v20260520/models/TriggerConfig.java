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

public class TriggerConfig extends AbstractModel {

    /**
    * <p>定时器配置</p>
    */
    @SerializedName("ScheduledConfig")
    @Expose
    private AppTriggerScheduleConfig ScheduledConfig;

    /**
    * <p>Webhook配置</p>
    */
    @SerializedName("WebhookConfig")
    @Expose
    private AppTriggerWebhookConfig WebhookConfig;

    /**
     * Get <p>定时器配置</p> 
     * @return ScheduledConfig <p>定时器配置</p>
     */
    public AppTriggerScheduleConfig getScheduledConfig() {
        return this.ScheduledConfig;
    }

    /**
     * Set <p>定时器配置</p>
     * @param ScheduledConfig <p>定时器配置</p>
     */
    public void setScheduledConfig(AppTriggerScheduleConfig ScheduledConfig) {
        this.ScheduledConfig = ScheduledConfig;
    }

    /**
     * Get <p>Webhook配置</p> 
     * @return WebhookConfig <p>Webhook配置</p>
     */
    public AppTriggerWebhookConfig getWebhookConfig() {
        return this.WebhookConfig;
    }

    /**
     * Set <p>Webhook配置</p>
     * @param WebhookConfig <p>Webhook配置</p>
     */
    public void setWebhookConfig(AppTriggerWebhookConfig WebhookConfig) {
        this.WebhookConfig = WebhookConfig;
    }

    public TriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerConfig(TriggerConfig source) {
        if (source.ScheduledConfig != null) {
            this.ScheduledConfig = new AppTriggerScheduleConfig(source.ScheduledConfig);
        }
        if (source.WebhookConfig != null) {
            this.WebhookConfig = new AppTriggerWebhookConfig(source.WebhookConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScheduledConfig.", this.ScheduledConfig);
        this.setParamObj(map, prefix + "WebhookConfig.", this.WebhookConfig);

    }
}

