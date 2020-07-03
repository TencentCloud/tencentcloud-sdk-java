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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWebhookTriggerRequest extends AbstractModel{

    /**
    * 实例 Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 触发器参数
    */
    @SerializedName("Trigger")
    @Expose
    private WebhookTrigger Trigger;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 实例 Id 
     * @return RegistryId 实例 Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例 Id
     * @param RegistryId 实例 Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 触发器参数 
     * @return Trigger 触发器参数
     */
    public WebhookTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 触发器参数
     * @param Trigger 触发器参数
     */
    public void setTrigger(WebhookTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

