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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceMetaData extends AbstractModel {

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>付费方式：POSTPAID_BY_HOUR 按量后付费，PREPAID_BY_MONTH 包年包月，SPOT 竞价售卖（竞价需先调用 BidSpotInferService 对套餐出价）</p>
    */
    @SerializedName("ServiceChargeType")
    @Expose
    private String ServiceChargeType;

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>付费方式：POSTPAID_BY_HOUR 按量后付费，PREPAID_BY_MONTH 包年包月，SPOT 竞价售卖（竞价需先调用 BidSpotInferService 对套餐出价）</p> 
     * @return ServiceChargeType <p>付费方式：POSTPAID_BY_HOUR 按量后付费，PREPAID_BY_MONTH 包年包月，SPOT 竞价售卖（竞价需先调用 BidSpotInferService 对套餐出价）</p>
     */
    public String getServiceChargeType() {
        return this.ServiceChargeType;
    }

    /**
     * Set <p>付费方式：POSTPAID_BY_HOUR 按量后付费，PREPAID_BY_MONTH 包年包月，SPOT 竞价售卖（竞价需先调用 BidSpotInferService 对套餐出价）</p>
     * @param ServiceChargeType <p>付费方式：POSTPAID_BY_HOUR 按量后付费，PREPAID_BY_MONTH 包年包月，SPOT 竞价售卖（竞价需先调用 BidSpotInferService 对套餐出价）</p>
     */
    public void setServiceChargeType(String ServiceChargeType) {
        this.ServiceChargeType = ServiceChargeType;
    }

    public ServiceMetaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceMetaData(ServiceMetaData source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceChargeType != null) {
            this.ServiceChargeType = new String(source.ServiceChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceChargeType", this.ServiceChargeType);

    }
}

