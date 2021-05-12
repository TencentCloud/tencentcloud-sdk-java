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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefundStorageServiceRequest extends AbstractModel{

    /**
    * 云存服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 云存子订单ID。如果指定子订单ID,则仅退订该子订单，如果未指定子定单ID，则退订所有子订单
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 云存服务ID 
     * @return ServiceId 云存服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 云存服务ID
     * @param ServiceId 云存服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 云存子订单ID。如果指定子订单ID,则仅退订该子订单，如果未指定子定单ID，则退订所有子订单 
     * @return OrderId 云存子订单ID。如果指定子订单ID,则仅退订该子订单，如果未指定子定单ID，则退订所有子订单
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 云存子订单ID。如果指定子订单ID,则仅退订该子订单，如果未指定子定单ID，则退订所有子订单
     * @param OrderId 云存子订单ID。如果指定子订单ID,则仅退订该子订单，如果未指定子定单ID，则退订所有子订单
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public RefundStorageServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundStorageServiceRequest(RefundStorageServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

