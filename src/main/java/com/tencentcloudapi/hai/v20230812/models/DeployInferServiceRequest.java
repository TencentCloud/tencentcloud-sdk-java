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

public class DeployInferServiceRequest extends AbstractModel {

    /**
    * 服务元数据信息，如服务名
    */
    @SerializedName("ServiceMetaData")
    @Expose
    private ServiceMetaData ServiceMetaData;

    /**
    * 资源相关信息
    */
    @SerializedName("ComputeInfo")
    @Expose
    private ComputeInfo ComputeInfo;

    /**
    * 服务部署信息
    */
    @SerializedName("DeploymentConfigs")
    @Expose
    private DeploymentConfig [] DeploymentConfigs;

    /**
    * 服务超参数配置
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
     * Get 服务元数据信息，如服务名 
     * @return ServiceMetaData 服务元数据信息，如服务名
     */
    public ServiceMetaData getServiceMetaData() {
        return this.ServiceMetaData;
    }

    /**
     * Set 服务元数据信息，如服务名
     * @param ServiceMetaData 服务元数据信息，如服务名
     */
    public void setServiceMetaData(ServiceMetaData ServiceMetaData) {
        this.ServiceMetaData = ServiceMetaData;
    }

    /**
     * Get 资源相关信息 
     * @return ComputeInfo 资源相关信息
     */
    public ComputeInfo getComputeInfo() {
        return this.ComputeInfo;
    }

    /**
     * Set 资源相关信息
     * @param ComputeInfo 资源相关信息
     */
    public void setComputeInfo(ComputeInfo ComputeInfo) {
        this.ComputeInfo = ComputeInfo;
    }

    /**
     * Get 服务部署信息 
     * @return DeploymentConfigs 服务部署信息
     */
    public DeploymentConfig [] getDeploymentConfigs() {
        return this.DeploymentConfigs;
    }

    /**
     * Set 服务部署信息
     * @param DeploymentConfigs 服务部署信息
     */
    public void setDeploymentConfigs(DeploymentConfig [] DeploymentConfigs) {
        this.DeploymentConfigs = DeploymentConfigs;
    }

    /**
     * Get 服务超参数配置 
     * @return HyperParam 服务超参数配置
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set 服务超参数配置
     * @param HyperParam 服务超参数配置
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

    public DeployInferServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployInferServiceRequest(DeployInferServiceRequest source) {
        if (source.ServiceMetaData != null) {
            this.ServiceMetaData = new ServiceMetaData(source.ServiceMetaData);
        }
        if (source.ComputeInfo != null) {
            this.ComputeInfo = new ComputeInfo(source.ComputeInfo);
        }
        if (source.DeploymentConfigs != null) {
            this.DeploymentConfigs = new DeploymentConfig[source.DeploymentConfigs.length];
            for (int i = 0; i < source.DeploymentConfigs.length; i++) {
                this.DeploymentConfigs[i] = new DeploymentConfig(source.DeploymentConfigs[i]);
            }
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
        this.setParamObj(map, prefix + "ServiceMetaData.", this.ServiceMetaData);
        this.setParamObj(map, prefix + "ComputeInfo.", this.ComputeInfo);
        this.setParamArrayObj(map, prefix + "DeploymentConfigs.", this.DeploymentConfigs);
        this.setParamObj(map, prefix + "HyperParam.", this.HyperParam);
        this.setParamObj(map, prefix + "NetworkSetting.", this.NetworkSetting);

    }
}

