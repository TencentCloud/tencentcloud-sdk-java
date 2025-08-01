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

public class AssociateDatasourceHouseRequest extends AbstractModel {

    /**
    * 网络配置名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 数据源类型
    */
    @SerializedName("DatasourceConnectionType")
    @Expose
    private String DatasourceConnectionType;

    /**
    * 数据源网络配置
    */
    @SerializedName("DatasourceConnectionConfig")
    @Expose
    private DatasourceConnectionConfig DatasourceConnectionConfig;

    /**
    * 引擎名称，只允许绑定一个引擎
    */
    @SerializedName("DataEngineNames")
    @Expose
    private String [] DataEngineNames;

    /**
    * 网络类型，2-跨源型，4-增强型
    */
    @SerializedName("NetworkConnectionType")
    @Expose
    private Long NetworkConnectionType;

    /**
    * 网络配置描述
    */
    @SerializedName("NetworkConnectionDesc")
    @Expose
    private String NetworkConnectionDesc;

    /**
     * Get 网络配置名称 
     * @return DatasourceConnectionName 网络配置名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 网络配置名称
     * @param DatasourceConnectionName 网络配置名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 数据源类型 
     * @return DatasourceConnectionType 数据源类型
     */
    public String getDatasourceConnectionType() {
        return this.DatasourceConnectionType;
    }

    /**
     * Set 数据源类型
     * @param DatasourceConnectionType 数据源类型
     */
    public void setDatasourceConnectionType(String DatasourceConnectionType) {
        this.DatasourceConnectionType = DatasourceConnectionType;
    }

    /**
     * Get 数据源网络配置 
     * @return DatasourceConnectionConfig 数据源网络配置
     */
    public DatasourceConnectionConfig getDatasourceConnectionConfig() {
        return this.DatasourceConnectionConfig;
    }

    /**
     * Set 数据源网络配置
     * @param DatasourceConnectionConfig 数据源网络配置
     */
    public void setDatasourceConnectionConfig(DatasourceConnectionConfig DatasourceConnectionConfig) {
        this.DatasourceConnectionConfig = DatasourceConnectionConfig;
    }

    /**
     * Get 引擎名称，只允许绑定一个引擎 
     * @return DataEngineNames 引擎名称，只允许绑定一个引擎
     */
    public String [] getDataEngineNames() {
        return this.DataEngineNames;
    }

    /**
     * Set 引擎名称，只允许绑定一个引擎
     * @param DataEngineNames 引擎名称，只允许绑定一个引擎
     */
    public void setDataEngineNames(String [] DataEngineNames) {
        this.DataEngineNames = DataEngineNames;
    }

    /**
     * Get 网络类型，2-跨源型，4-增强型 
     * @return NetworkConnectionType 网络类型，2-跨源型，4-增强型
     */
    public Long getNetworkConnectionType() {
        return this.NetworkConnectionType;
    }

    /**
     * Set 网络类型，2-跨源型，4-增强型
     * @param NetworkConnectionType 网络类型，2-跨源型，4-增强型
     */
    public void setNetworkConnectionType(Long NetworkConnectionType) {
        this.NetworkConnectionType = NetworkConnectionType;
    }

    /**
     * Get 网络配置描述 
     * @return NetworkConnectionDesc 网络配置描述
     */
    public String getNetworkConnectionDesc() {
        return this.NetworkConnectionDesc;
    }

    /**
     * Set 网络配置描述
     * @param NetworkConnectionDesc 网络配置描述
     */
    public void setNetworkConnectionDesc(String NetworkConnectionDesc) {
        this.NetworkConnectionDesc = NetworkConnectionDesc;
    }

    public AssociateDatasourceHouseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateDatasourceHouseRequest(AssociateDatasourceHouseRequest source) {
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DatasourceConnectionType != null) {
            this.DatasourceConnectionType = new String(source.DatasourceConnectionType);
        }
        if (source.DatasourceConnectionConfig != null) {
            this.DatasourceConnectionConfig = new DatasourceConnectionConfig(source.DatasourceConnectionConfig);
        }
        if (source.DataEngineNames != null) {
            this.DataEngineNames = new String[source.DataEngineNames.length];
            for (int i = 0; i < source.DataEngineNames.length; i++) {
                this.DataEngineNames[i] = new String(source.DataEngineNames[i]);
            }
        }
        if (source.NetworkConnectionType != null) {
            this.NetworkConnectionType = new Long(source.NetworkConnectionType);
        }
        if (source.NetworkConnectionDesc != null) {
            this.NetworkConnectionDesc = new String(source.NetworkConnectionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DatasourceConnectionType", this.DatasourceConnectionType);
        this.setParamObj(map, prefix + "DatasourceConnectionConfig.", this.DatasourceConnectionConfig);
        this.setParamArraySimple(map, prefix + "DataEngineNames.", this.DataEngineNames);
        this.setParamSimple(map, prefix + "NetworkConnectionType", this.NetworkConnectionType);
        this.setParamSimple(map, prefix + "NetworkConnectionDesc", this.NetworkConnectionDesc);

    }
}

