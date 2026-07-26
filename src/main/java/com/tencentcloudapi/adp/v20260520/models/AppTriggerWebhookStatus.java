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

public class AppTriggerWebhookStatus extends AbstractModel {

    /**
    * 
    */
    @SerializedName("WebhookUrl")
    @Expose
    private String WebhookUrl;

    /**
     * Get  
     * @return WebhookUrl 
     */
    public String getWebhookUrl() {
        return this.WebhookUrl;
    }

    /**
     * Set 
     * @param WebhookUrl 
     */
    public void setWebhookUrl(String WebhookUrl) {
        this.WebhookUrl = WebhookUrl;
    }

    public AppTriggerWebhookStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWebhookStatus(AppTriggerWebhookStatus source) {
        if (source.WebhookUrl != null) {
            this.WebhookUrl = new String(source.WebhookUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebhookUrl", this.WebhookUrl);

    }
}

