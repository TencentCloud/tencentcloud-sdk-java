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
    * <p>模版ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>副本数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>付费方式，POSTPAID_BY_HOUR按量后付费</p>
    */
    @SerializedName("ServiceChargeType")
    @Expose
    private String ServiceChargeType;

    /**
    * <p>描述了服务的超参数配置</p>
    */
    @SerializedName("HyperParam")
    @Expose
    private HyperParam HyperParam;

    /**
    * <p>网络设置</p>
    */
    @SerializedName("NetworkSetting")
    @Expose
    private NetworkSetting NetworkSetting;

    /**
     * Get <p>模版ID</p> 
     * @return TemplateId <p>模版ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模版ID</p>
     * @param TemplateId <p>模版ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>副本数</p> 
     * @return Replicas <p>副本数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本数</p>
     * @param Replicas <p>副本数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>付费方式，POSTPAID_BY_HOUR按量后付费</p> 
     * @return ServiceChargeType <p>付费方式，POSTPAID_BY_HOUR按量后付费</p>
     */
    public String getServiceChargeType() {
        return this.ServiceChargeType;
    }

    /**
     * Set <p>付费方式，POSTPAID_BY_HOUR按量后付费</p>
     * @param ServiceChargeType <p>付费方式，POSTPAID_BY_HOUR按量后付费</p>
     */
    public void setServiceChargeType(String ServiceChargeType) {
        this.ServiceChargeType = ServiceChargeType;
    }

    /**
     * Get <p>描述了服务的超参数配置</p> 
     * @return HyperParam <p>描述了服务的超参数配置</p>
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set <p>描述了服务的超参数配置</p>
     * @param HyperParam <p>描述了服务的超参数配置</p>
     */
    public void setHyperParam(HyperParam HyperParam) {
        this.HyperParam = HyperParam;
    }

    /**
     * Get <p>网络设置</p> 
     * @return NetworkSetting <p>网络设置</p>
     */
    public NetworkSetting getNetworkSetting() {
        return this.NetworkSetting;
    }

    /**
     * Set <p>网络设置</p>
     * @param NetworkSetting <p>网络设置</p>
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

