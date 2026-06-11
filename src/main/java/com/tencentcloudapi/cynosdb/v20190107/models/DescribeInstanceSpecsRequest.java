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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSpecsRequest extends AbstractModel {

    /**
    * <p>数据库类型，取值范围: </p><li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>是否需要返回可用区信息</p>
    */
    @SerializedName("IncludeZoneStocks")
    @Expose
    private Boolean IncludeZoneStocks;

    /**
    * <p>实例机器类型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>集群级别，可空。例如 P0, P1</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
     * Get <p>数据库类型，取值范围: </p><li> MYSQL </li> 
     * @return DbType <p>数据库类型，取值范围: </p><li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型，取值范围: </p><li> MYSQL </li>
     * @param DbType <p>数据库类型，取值范围: </p><li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>是否需要返回可用区信息</p> 
     * @return IncludeZoneStocks <p>是否需要返回可用区信息</p>
     */
    public Boolean getIncludeZoneStocks() {
        return this.IncludeZoneStocks;
    }

    /**
     * Set <p>是否需要返回可用区信息</p>
     * @param IncludeZoneStocks <p>是否需要返回可用区信息</p>
     */
    public void setIncludeZoneStocks(Boolean IncludeZoneStocks) {
        this.IncludeZoneStocks = IncludeZoneStocks;
    }

    /**
     * Get <p>实例机器类型</p> 
     * @return DeviceType <p>实例机器类型</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机器类型</p>
     * @param DeviceType <p>实例机器类型</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>集群级别，可空。例如 P0, P1</p> 
     * @return ClusterLevel <p>集群级别，可空。例如 P0, P1</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>集群级别，可空。例如 P0, P1</p>
     * @param ClusterLevel <p>集群级别，可空。例如 P0, P1</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    public DescribeInstanceSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSpecsRequest(DescribeInstanceSpecsRequest source) {
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.IncludeZoneStocks != null) {
            this.IncludeZoneStocks = new Boolean(source.IncludeZoneStocks);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "IncludeZoneStocks", this.IncludeZoneStocks);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);

    }
}

