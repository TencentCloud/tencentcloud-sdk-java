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
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 是否需要返回可用区信息
    */
    @SerializedName("IncludeZoneStocks")
    @Expose
    private Boolean IncludeZoneStocks;

    /**
    * 实例机器类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 是否需要返回可用区信息 
     * @return IncludeZoneStocks 是否需要返回可用区信息
     */
    public Boolean getIncludeZoneStocks() {
        return this.IncludeZoneStocks;
    }

    /**
     * Set 是否需要返回可用区信息
     * @param IncludeZoneStocks 是否需要返回可用区信息
     */
    public void setIncludeZoneStocks(Boolean IncludeZoneStocks) {
        this.IncludeZoneStocks = IncludeZoneStocks;
    }

    /**
     * Get 实例机器类型 
     * @return DeviceType 实例机器类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例机器类型
     * @param DeviceType 实例机器类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "IncludeZoneStocks", this.IncludeZoneStocks);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

