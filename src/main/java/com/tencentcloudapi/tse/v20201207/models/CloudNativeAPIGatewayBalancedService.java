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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayBalancedService extends AbstractModel {

    /**
    * 服务 ID，作为入参时，必填
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 服务名称，作为入参时，无意义
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Upstream 名称，作为入参时，无意义
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * 百分比，10 即 10%，范围0-100
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get 服务 ID，作为入参时，必填 
     * @return ServiceID 服务 ID，作为入参时，必填
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 服务 ID，作为入参时，必填
     * @param ServiceID 服务 ID，作为入参时，必填
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 服务名称，作为入参时，无意义 
     * @return ServiceName 服务名称，作为入参时，无意义
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称，作为入参时，无意义
     * @param ServiceName 服务名称，作为入参时，无意义
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Upstream 名称，作为入参时，无意义 
     * @return UpstreamName Upstream 名称，作为入参时，无意义
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set Upstream 名称，作为入参时，无意义
     * @param UpstreamName Upstream 名称，作为入参时，无意义
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get 百分比，10 即 10%，范围0-100 
     * @return Percent 百分比，10 即 10%，范围0-100
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比，10 即 10%，范围0-100
     * @param Percent 百分比，10 即 10%，范围0-100
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    public CloudNativeAPIGatewayBalancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayBalancedService(CloudNativeAPIGatewayBalancedService source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

