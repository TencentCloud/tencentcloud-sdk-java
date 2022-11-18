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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModelServicePartialConfigRequest extends AbstractModel{

    /**
    * 在线推理服务Id，需已存在
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 更新后服务不重启，定时停止的配置
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * 更新后服务不重启，服务对应限流限频配置
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
     * Get 在线推理服务Id，需已存在 
     * @return ServiceId 在线推理服务Id，需已存在
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 在线推理服务Id，需已存在
     * @param ServiceId 在线推理服务Id，需已存在
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 更新后服务不重启，定时停止的配置 
     * @return ScheduledAction 更新后服务不重启，定时停止的配置
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set 更新后服务不重启，定时停止的配置
     * @param ScheduledAction 更新后服务不重启，定时停止的配置
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get 更新后服务不重启，服务对应限流限频配置 
     * @return ServiceLimit 更新后服务不重启，服务对应限流限频配置
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set 更新后服务不重启，服务对应限流限频配置
     * @param ServiceLimit 更新后服务不重启，服务对应限流限频配置
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    public ModifyModelServicePartialConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelServicePartialConfigRequest(ModifyModelServicePartialConfigRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);

    }
}

