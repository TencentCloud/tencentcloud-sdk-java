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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageServiceRequest extends AbstractModel {

    /**
    * 云存服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 是否返回已结束的订单信息(已过期/已退订/已转移)
    */
    @SerializedName("GetFinishedOrder")
    @Expose
    private Boolean GetFinishedOrder;

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
     * Get 是否返回已结束的订单信息(已过期/已退订/已转移) 
     * @return GetFinishedOrder 是否返回已结束的订单信息(已过期/已退订/已转移)
     */
    public Boolean getGetFinishedOrder() {
        return this.GetFinishedOrder;
    }

    /**
     * Set 是否返回已结束的订单信息(已过期/已退订/已转移)
     * @param GetFinishedOrder 是否返回已结束的订单信息(已过期/已退订/已转移)
     */
    public void setGetFinishedOrder(Boolean GetFinishedOrder) {
        this.GetFinishedOrder = GetFinishedOrder;
    }

    public DescribeStorageServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageServiceRequest(DescribeStorageServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.GetFinishedOrder != null) {
            this.GetFinishedOrder = new Boolean(source.GetFinishedOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "GetFinishedOrder", this.GetFinishedOrder);

    }
}

