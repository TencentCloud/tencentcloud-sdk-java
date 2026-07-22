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

public class CreateMetaDatabaseRequest extends AbstractModel {

    /**
    * 数据源名称，默认DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 元数据库基本信息
    */
    @SerializedName("MetaDatabaseInfo")
    @Expose
    private MetaDatabaseInfo MetaDatabaseInfo;

    /**
    * 数据治理配置项
    */
    @SerializedName("GovernPolicy")
    @Expose
    private DataGovernPolicy GovernPolicy;

    /**
    * 智能数据治理配置
    */
    @SerializedName("SmartPolicy")
    @Expose
    private SmartPolicy SmartPolicy;

    /**
     * Get 数据源名称，默认DataLakeCatalog 
     * @return DatasourceConnectionName 数据源名称，默认DataLakeCatalog
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称，默认DataLakeCatalog
     * @param DatasourceConnectionName 数据源名称，默认DataLakeCatalog
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 元数据库基本信息 
     * @return MetaDatabaseInfo 元数据库基本信息
     */
    public MetaDatabaseInfo getMetaDatabaseInfo() {
        return this.MetaDatabaseInfo;
    }

    /**
     * Set 元数据库基本信息
     * @param MetaDatabaseInfo 元数据库基本信息
     */
    public void setMetaDatabaseInfo(MetaDatabaseInfo MetaDatabaseInfo) {
        this.MetaDatabaseInfo = MetaDatabaseInfo;
    }

    /**
     * Get 数据治理配置项 
     * @return GovernPolicy 数据治理配置项
     */
    public DataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set 数据治理配置项
     * @param GovernPolicy 数据治理配置项
     */
    public void setGovernPolicy(DataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    /**
     * Get 智能数据治理配置 
     * @return SmartPolicy 智能数据治理配置
     */
    public SmartPolicy getSmartPolicy() {
        return this.SmartPolicy;
    }

    /**
     * Set 智能数据治理配置
     * @param SmartPolicy 智能数据治理配置
     */
    public void setSmartPolicy(SmartPolicy SmartPolicy) {
        this.SmartPolicy = SmartPolicy;
    }

    public CreateMetaDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetaDatabaseRequest(CreateMetaDatabaseRequest source) {
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.MetaDatabaseInfo != null) {
            this.MetaDatabaseInfo = new MetaDatabaseInfo(source.MetaDatabaseInfo);
        }
        if (source.GovernPolicy != null) {
            this.GovernPolicy = new DataGovernPolicy(source.GovernPolicy);
        }
        if (source.SmartPolicy != null) {
            this.SmartPolicy = new SmartPolicy(source.SmartPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamObj(map, prefix + "MetaDatabaseInfo.", this.MetaDatabaseInfo);
        this.setParamObj(map, prefix + "GovernPolicy.", this.GovernPolicy);
        this.setParamObj(map, prefix + "SmartPolicy.", this.SmartPolicy);

    }
}

