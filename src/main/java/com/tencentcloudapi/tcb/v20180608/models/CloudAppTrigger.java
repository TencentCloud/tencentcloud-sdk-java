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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAppTrigger extends AbstractModel {

    /**
    * <p>webhook 配置</p>
    */
    @SerializedName("Webhook")
    @Expose
    private CloudAppWebHook Webhook;

    /**
     * Get <p>webhook 配置</p> 
     * @return Webhook <p>webhook 配置</p>
     */
    public CloudAppWebHook getWebhook() {
        return this.Webhook;
    }

    /**
     * Set <p>webhook 配置</p>
     * @param Webhook <p>webhook 配置</p>
     */
    public void setWebhook(CloudAppWebHook Webhook) {
        this.Webhook = Webhook;
    }

    public CloudAppTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppTrigger(CloudAppTrigger source) {
        if (source.Webhook != null) {
            this.Webhook = new CloudAppWebHook(source.Webhook);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Webhook.", this.Webhook);

    }
}

