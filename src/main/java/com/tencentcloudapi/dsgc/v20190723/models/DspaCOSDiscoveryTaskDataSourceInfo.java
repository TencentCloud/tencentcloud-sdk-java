/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaCOSDiscoveryTaskDataSourceInfo extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 代理地址
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String [] ProxyAddress;

    /**
    * 数据源名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 扫描任务条件
    */
    @SerializedName("Condition")
    @Expose
    private DspaDiscoveryTaskCOSCondition Condition;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 代理地址 
     * @return ProxyAddress 代理地址
     */
    public String [] getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set 代理地址
     * @param ProxyAddress 代理地址
     */
    public void setProxyAddress(String [] ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get 数据源名称 
     * @return DataSourceName 数据源名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
     * @param DataSourceName 数据源名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 扫描任务条件 
     * @return Condition 扫描任务条件
     */
    public DspaDiscoveryTaskCOSCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 扫描任务条件
     * @param Condition 扫描任务条件
     */
    public void setCondition(DspaDiscoveryTaskCOSCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    public DspaCOSDiscoveryTaskDataSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaCOSDiscoveryTaskDataSourceInfo(DspaCOSDiscoveryTaskDataSourceInfo source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new String[source.ProxyAddress.length];
            for (int i = 0; i < source.ProxyAddress.length; i++) {
                this.ProxyAddress[i] = new String(source.ProxyAddress[i]);
            }
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.Condition != null) {
            this.Condition = new DspaDiscoveryTaskCOSCondition(source.Condition);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamArraySimple(map, prefix + "ProxyAddress.", this.ProxyAddress);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);

    }
}

