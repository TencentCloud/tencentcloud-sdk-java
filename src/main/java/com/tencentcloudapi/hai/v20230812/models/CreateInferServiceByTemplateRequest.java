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

public class CreateInferServiceByTemplateRequest extends AbstractModel {

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 副本数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 付费方式，POSTPAID_BY_HOUR按量后付费
    */
    @SerializedName("ServiceChargeType")
    @Expose
    private String ServiceChargeType;

    /**
    * 描述了服务的超参数配置
    */
    @SerializedName("HyperParam")
    @Expose
    private HyperParam HyperParam;

    /**
    * 网络设置
    */
    @SerializedName("NetworkSetting")
    @Expose
    private NetworkSetting NetworkSetting;

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

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
     * Get 副本数 
     * @return Replicas 副本数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 副本数
     * @param Replicas 副本数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 付费方式，POSTPAID_BY_HOUR按量后付费 
     * @return ServiceChargeType 付费方式，POSTPAID_BY_HOUR按量后付费
     */
    public String getServiceChargeType() {
        return this.ServiceChargeType;
    }

    /**
     * Set 付费方式，POSTPAID_BY_HOUR按量后付费
     * @param ServiceChargeType 付费方式，POSTPAID_BY_HOUR按量后付费
     */
    public void setServiceChargeType(String ServiceChargeType) {
        this.ServiceChargeType = ServiceChargeType;
    }

    /**
     * Get 描述了服务的超参数配置 
     * @return HyperParam 描述了服务的超参数配置
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set 描述了服务的超参数配置
     * @param HyperParam 描述了服务的超参数配置
     */
    public void setHyperParam(HyperParam HyperParam) {
        this.HyperParam = HyperParam;
    }

    /**
     * Get 网络设置 
     * @return NetworkSetting 网络设置
     */
    public NetworkSetting getNetworkSetting() {
        return this.NetworkSetting;
    }

    /**
     * Set 网络设置
     * @param NetworkSetting 网络设置
     */
    public void setNetworkSetting(NetworkSetting NetworkSetting) {
        this.NetworkSetting = NetworkSetting;
    }

    public CreateInferServiceByTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferServiceByTemplateRequest(CreateInferServiceByTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.ServiceChargeType != null) {
            this.ServiceChargeType = new String(source.ServiceChargeType);
        }
        if (source.HyperParam != null) {
            this.HyperParam = new HyperParam(source.HyperParam);
        }
        if (source.NetworkSetting != null) {
            this.NetworkSetting = new NetworkSetting(source.NetworkSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "ServiceChargeType", this.ServiceChargeType);
        this.setParamObj(map, prefix + "HyperParam.", this.HyperParam);
        this.setParamObj(map, prefix + "NetworkSetting.", this.NetworkSetting);

    }
}

