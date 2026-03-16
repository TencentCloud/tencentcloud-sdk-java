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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkActivationStatusInfo extends AbstractModel {

    /**
    * 设备ID，产品ID_设备名称
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 过期时间，秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * TWeTalk类型：1-基础版；2-高级版；3-多模态；
    */
    @SerializedName("ServiceType")
    @Expose
    private Long ServiceType;

    /**
     * Get 设备ID，产品ID_设备名称 
     * @return DeviceId 设备ID，产品ID_设备名称
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID，产品ID_设备名称
     * @param DeviceId 设备ID，产品ID_设备名称
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 过期时间，秒级时间戳 
     * @return ExpireTime 过期时间，秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，秒级时间戳
     * @param ExpireTime 过期时间，秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get TWeTalk类型：1-基础版；2-高级版；3-多模态； 
     * @return ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public Long getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set TWeTalk类型：1-基础版；2-高级版；3-多模态；
     * @param ServiceType TWeTalk类型：1-基础版；2-高级版；3-多模态；
     */
    public void setServiceType(Long ServiceType) {
        this.ServiceType = ServiceType;
    }

    public TalkActivationStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkActivationStatusInfo(TalkActivationStatusInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new Long(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

