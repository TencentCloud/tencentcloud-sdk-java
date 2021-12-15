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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscriptionStatusRequest extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 订阅状态 1：关闭订阅 2：开启订阅
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 订阅类型 Alarm:告警订阅 Catalog:目录订阅 MobilePosition:移动位置订阅
    */
    @SerializedName("SubscriptionItem")
    @Expose
    private String SubscriptionItem;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 订阅状态 1：关闭订阅 2：开启订阅 
     * @return Status 订阅状态 1：关闭订阅 2：开启订阅
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅状态 1：关闭订阅 2：开启订阅
     * @param Status 订阅状态 1：关闭订阅 2：开启订阅
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 订阅类型 Alarm:告警订阅 Catalog:目录订阅 MobilePosition:移动位置订阅 
     * @return SubscriptionItem 订阅类型 Alarm:告警订阅 Catalog:目录订阅 MobilePosition:移动位置订阅
     */
    public String getSubscriptionItem() {
        return this.SubscriptionItem;
    }

    /**
     * Set 订阅类型 Alarm:告警订阅 Catalog:目录订阅 MobilePosition:移动位置订阅
     * @param SubscriptionItem 订阅类型 Alarm:告警订阅 Catalog:目录订阅 MobilePosition:移动位置订阅
     */
    public void setSubscriptionItem(String SubscriptionItem) {
        this.SubscriptionItem = SubscriptionItem;
    }

    public ModifySubscriptionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscriptionStatusRequest(ModifySubscriptionStatusRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubscriptionItem != null) {
            this.SubscriptionItem = new String(source.SubscriptionItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubscriptionItem", this.SubscriptionItem);

    }
}

