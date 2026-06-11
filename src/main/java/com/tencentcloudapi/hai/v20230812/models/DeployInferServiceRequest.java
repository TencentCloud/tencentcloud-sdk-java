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
    * <p>服务元数据信息，如服务名</p>
    */
    @SerializedName("ServiceMetaData")
    @Expose
    private ServiceMetaData ServiceMetaData;

    /**
    * <p>资源相关信息</p>
    */
    @SerializedName("ComputeInfo")
    @Expose
    private ComputeInfo ComputeInfo;

    /**
    * <p>服务部署信息</p>
    */
    @SerializedName("DeploymentConfigs")
    @Expose
    private DeploymentConfig [] DeploymentConfigs;

    /**
    * <p>服务超参数配置</p>
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
    * <p>安全类型</p><p>枚举值：</p><ul><li>STANDARD： 标准推理</li><li>CONFIDENTIAL： 可信推理</li></ul>
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
     * Get <p>服务元数据信息，如服务名</p> 
     * @return ServiceMetaData <p>服务元数据信息，如服务名</p>
     */
    public ServiceMetaData getServiceMetaData() {
        return this.ServiceMetaData;
    }

    /**
     * Set <p>服务元数据信息，如服务名</p>
     * @param ServiceMetaData <p>服务元数据信息，如服务名</p>
     */
    public void setServiceMetaData(ServiceMetaData ServiceMetaData) {
        this.ServiceMetaData = ServiceMetaData;
    }

    /**
     * Get <p>资源相关信息</p> 
     * @return ComputeInfo <p>资源相关信息</p>
     */
    public ComputeInfo getComputeInfo() {
        return this.ComputeInfo;
    }

    /**
     * Set <p>资源相关信息</p>
     * @param ComputeInfo <p>资源相关信息</p>
     */
    public void setComputeInfo(ComputeInfo ComputeInfo) {
        this.ComputeInfo = ComputeInfo;
    }

    /**
     * Get <p>服务部署信息</p> 
     * @return DeploymentConfigs <p>服务部署信息</p>
     */
    public DeploymentConfig [] getDeploymentConfigs() {
        return this.DeploymentConfigs;
    }

    /**
     * Set <p>服务部署信息</p>
     * @param DeploymentConfigs <p>服务部署信息</p>
     */
    public void setDeploymentConfigs(DeploymentConfig [] DeploymentConfigs) {
        this.DeploymentConfigs = DeploymentConfigs;
    }

    /**
     * Get <p>服务超参数配置</p> 
     * @return HyperParam <p>服务超参数配置</p>
     */
    public HyperParam getHyperParam() {
        return this.HyperParam;
    }

    /**
     * Set <p>服务超参数配置</p>
     * @param HyperParam <p>服务超参数配置</p>
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

    /**
     * Get <p>安全类型</p><p>枚举值：</p><ul><li>STANDARD： 标准推理</li><li>CONFIDENTIAL： 可信推理</li></ul> 
     * @return SecurityType <p>安全类型</p><p>枚举值：</p><ul><li>STANDARD： 标准推理</li><li>CONFIDENTIAL： 可信推理</li></ul>
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set <p>安全类型</p><p>枚举值：</p><ul><li>STANDARD： 标准推理</li><li>CONFIDENTIAL： 可信推理</li></ul>
     * @param SecurityType <p>安全类型</p><p>枚举值：</p><ul><li>STANDARD： 标准推理</li><li>CONFIDENTIAL： 可信推理</li></ul>
     */
    public void setSecurityType(String SecurityType) {
        this.SecurityType = SecurityType;
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
        if (source.SecurityType != null) {
            this.SecurityType = new String(source.SecurityType);
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
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);

    }
}

