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

public class TriggerStatus extends AbstractModel {

    /**
    * <p>定时器状态</p>
    */
    @SerializedName("ScheduledStatus")
    @Expose
    private AppTriggerScheduleStatus ScheduledStatus;

    /**
    * <p>Webhook状态</p>
    */
    @SerializedName("WebhookStatus")
    @Expose
    private AppTriggerWebhookStatus WebhookStatus;

    /**
     * Get <p>定时器状态</p> 
     * @return ScheduledStatus <p>定时器状态</p>
     */
    public AppTriggerScheduleStatus getScheduledStatus() {
        return this.ScheduledStatus;
    }

    /**
     * Set <p>定时器状态</p>
     * @param ScheduledStatus <p>定时器状态</p>
     */
    public void setScheduledStatus(AppTriggerScheduleStatus ScheduledStatus) {
        this.ScheduledStatus = ScheduledStatus;
    }

    /**
     * Get <p>Webhook状态</p> 
     * @return WebhookStatus <p>Webhook状态</p>
     */
    public AppTriggerWebhookStatus getWebhookStatus() {
        return this.WebhookStatus;
    }

    /**
     * Set <p>Webhook状态</p>
     * @param WebhookStatus <p>Webhook状态</p>
     */
    public void setWebhookStatus(AppTriggerWebhookStatus WebhookStatus) {
        this.WebhookStatus = WebhookStatus;
    }

    public TriggerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerStatus(TriggerStatus source) {
        if (source.ScheduledStatus != null) {
            this.ScheduledStatus = new AppTriggerScheduleStatus(source.ScheduledStatus);
        }
        if (source.WebhookStatus != null) {
            this.WebhookStatus = new AppTriggerWebhookStatus(source.WebhookStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScheduledStatus.", this.ScheduledStatus);
        this.setParamObj(map, prefix + "WebhookStatus.", this.WebhookStatus);

    }
}

