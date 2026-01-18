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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatasourceConnectionRequest extends AbstractModel {

    /**
    * 数据连接名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 数据连接类型
    */
    @SerializedName("DatasourceConnectionType")
    @Expose
    private String DatasourceConnectionType;

    /**
    * 数据连接属性
    */
    @SerializedName("DatasourceConnectionConfig")
    @Expose
    private DatasourceConnectionConfig DatasourceConnectionConfig;

    /**
    * 数据连接所属服务
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 数据连接描述
    */
    @SerializedName("DatasourceConnectionDesc")
    @Expose
    private String DatasourceConnectionDesc;

    /**
    * 数据引擎名称数组
    */
    @SerializedName("DataEngineNames")
    @Expose
    private String [] DataEngineNames;

    /**
    * 网络连接名称
    */
    @SerializedName("NetworkConnectionName")
    @Expose
    private String NetworkConnectionName;

    /**
    * 网络连接描述
    */
    @SerializedName("NetworkConnectionDesc")
    @Expose
    private String NetworkConnectionDesc;

    /**
    * 网络连接类型 （2-夸源型，4-增强型）
    */
    @SerializedName("NetworkConnectionType")
    @Expose
    private Long NetworkConnectionType;

    /**
    * 自定义配置
    */
    @SerializedName("CustomConfig")
    @Expose
    private CustomConfig [] CustomConfig;

    /**
     * Get 数据连接名称 
     * @return DatasourceConnectionName 数据连接名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据连接名称
     * @param DatasourceConnectionName 数据连接名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 数据连接类型 
     * @return DatasourceConnectionType 数据连接类型
     */
    public String getDatasourceConnectionType() {
        return this.DatasourceConnectionType;
    }

    /**
     * Set 数据连接类型
     * @param DatasourceConnectionType 数据连接类型
     */
    public void setDatasourceConnectionType(String DatasourceConnectionType) {
        this.DatasourceConnectionType = DatasourceConnectionType;
    }

    /**
     * Get 数据连接属性 
     * @return DatasourceConnectionConfig 数据连接属性
     */
    public DatasourceConnectionConfig getDatasourceConnectionConfig() {
        return this.DatasourceConnectionConfig;
    }

    /**
     * Set 数据连接属性
     * @param DatasourceConnectionConfig 数据连接属性
     */
    public void setDatasourceConnectionConfig(DatasourceConnectionConfig DatasourceConnectionConfig) {
        this.DatasourceConnectionConfig = DatasourceConnectionConfig;
    }

    /**
     * Get 数据连接所属服务 
     * @return ServiceType 数据连接所属服务
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 数据连接所属服务
     * @param ServiceType 数据连接所属服务
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 数据连接描述 
     * @return DatasourceConnectionDesc 数据连接描述
     */
    public String getDatasourceConnectionDesc() {
        return this.DatasourceConnectionDesc;
    }

    /**
     * Set 数据连接描述
     * @param DatasourceConnectionDesc 数据连接描述
     */
    public void setDatasourceConnectionDesc(String DatasourceConnectionDesc) {
        this.DatasourceConnectionDesc = DatasourceConnectionDesc;
    }

    /**
     * Get 数据引擎名称数组 
     * @return DataEngineNames 数据引擎名称数组
     */
    public String [] getDataEngineNames() {
        return this.DataEngineNames;
    }

    /**
     * Set 数据引擎名称数组
     * @param DataEngineNames 数据引擎名称数组
     */
    public void setDataEngineNames(String [] DataEngineNames) {
        this.DataEngineNames = DataEngineNames;
    }

    /**
     * Get 网络连接名称 
     * @return NetworkConnectionName 网络连接名称
     */
    public String getNetworkConnectionName() {
        return this.NetworkConnectionName;
    }

    /**
     * Set 网络连接名称
     * @param NetworkConnectionName 网络连接名称
     */
    public void setNetworkConnectionName(String NetworkConnectionName) {
        this.NetworkConnectionName = NetworkConnectionName;
    }

    /**
     * Get 网络连接描述 
     * @return NetworkConnectionDesc 网络连接描述
     */
    public String getNetworkConnectionDesc() {
        return this.NetworkConnectionDesc;
    }

    /**
     * Set 网络连接描述
     * @param NetworkConnectionDesc 网络连接描述
     */
    public void setNetworkConnectionDesc(String NetworkConnectionDesc) {
        this.NetworkConnectionDesc = NetworkConnectionDesc;
    }

    /**
     * Get 网络连接类型 （2-夸源型，4-增强型） 
     * @return NetworkConnectionType 网络连接类型 （2-夸源型，4-增强型）
     */
    public Long getNetworkConnectionType() {
        return this.NetworkConnectionType;
    }

    /**
     * Set 网络连接类型 （2-夸源型，4-增强型）
     * @param NetworkConnectionType 网络连接类型 （2-夸源型，4-增强型）
     */
    public void setNetworkConnectionType(Long NetworkConnectionType) {
        this.NetworkConnectionType = NetworkConnectionType;
    }

    /**
     * Get 自定义配置 
     * @return CustomConfig 自定义配置
     */
    public CustomConfig [] getCustomConfig() {
        return this.CustomConfig;
    }

    /**
     * Set 自定义配置
     * @param CustomConfig 自定义配置
     */
    public void setCustomConfig(CustomConfig [] CustomConfig) {
        this.CustomConfig = CustomConfig;
    }

    public CreateDatasourceConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatasourceConnectionRequest(CreateDatasourceConnectionRequest source) {
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DatasourceConnectionType != null) {
            this.DatasourceConnectionType = new String(source.DatasourceConnectionType);
        }
        if (source.DatasourceConnectionConfig != null) {
            this.DatasourceConnectionConfig = new DatasourceConnectionConfig(source.DatasourceConnectionConfig);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DatasourceConnectionDesc != null) {
            this.DatasourceConnectionDesc = new String(source.DatasourceConnectionDesc);
        }
        if (source.DataEngineNames != null) {
            this.DataEngineNames = new String[source.DataEngineNames.length];
            for (int i = 0; i < source.DataEngineNames.length; i++) {
                this.DataEngineNames[i] = new String(source.DataEngineNames[i]);
            }
        }
        if (source.NetworkConnectionName != null) {
            this.NetworkConnectionName = new String(source.NetworkConnectionName);
        }
        if (source.NetworkConnectionDesc != null) {
            this.NetworkConnectionDesc = new String(source.NetworkConnectionDesc);
        }
        if (source.NetworkConnectionType != null) {
            this.NetworkConnectionType = new Long(source.NetworkConnectionType);
        }
        if (source.CustomConfig != null) {
            this.CustomConfig = new CustomConfig[source.CustomConfig.length];
            for (int i = 0; i < source.CustomConfig.length; i++) {
                this.CustomConfig[i] = new CustomConfig(source.CustomConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DatasourceConnectionType", this.DatasourceConnectionType);
        this.setParamObj(map, prefix + "DatasourceConnectionConfig.", this.DatasourceConnectionConfig);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DatasourceConnectionDesc", this.DatasourceConnectionDesc);
        this.setParamArraySimple(map, prefix + "DataEngineNames.", this.DataEngineNames);
        this.setParamSimple(map, prefix + "NetworkConnectionName", this.NetworkConnectionName);
        this.setParamSimple(map, prefix + "NetworkConnectionDesc", this.NetworkConnectionDesc);
        this.setParamSimple(map, prefix + "NetworkConnectionType", this.NetworkConnectionType);
        this.setParamArrayObj(map, prefix + "CustomConfig.", this.CustomConfig);

    }
}

