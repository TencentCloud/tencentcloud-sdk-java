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

public class DescribeNetworkConnectionsRequest extends AbstractModel {

    /**
    * 网络配置类型
    */
    @SerializedName("NetworkConnectionType")
    @Expose
    private Long NetworkConnectionType;

    /**
    * 计算引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 数据源vpcid
    */
    @SerializedName("DatasourceConnectionVpcId")
    @Expose
    private String DatasourceConnectionVpcId;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 网络配置名称
    */
    @SerializedName("NetworkConnectionName")
    @Expose
    private String NetworkConnectionName;

    /**
     * Get 网络配置类型 
     * @return NetworkConnectionType 网络配置类型
     */
    public Long getNetworkConnectionType() {
        return this.NetworkConnectionType;
    }

    /**
     * Set 网络配置类型
     * @param NetworkConnectionType 网络配置类型
     */
    public void setNetworkConnectionType(Long NetworkConnectionType) {
        this.NetworkConnectionType = NetworkConnectionType;
    }

    /**
     * Get 计算引擎名称 
     * @return DataEngineName 计算引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 计算引擎名称
     * @param DataEngineName 计算引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 数据源vpcid 
     * @return DatasourceConnectionVpcId 数据源vpcid
     */
    public String getDatasourceConnectionVpcId() {
        return this.DatasourceConnectionVpcId;
    }

    /**
     * Set 数据源vpcid
     * @param DatasourceConnectionVpcId 数据源vpcid
     */
    public void setDatasourceConnectionVpcId(String DatasourceConnectionVpcId) {
        this.DatasourceConnectionVpcId = DatasourceConnectionVpcId;
    }

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 网络配置名称 
     * @return NetworkConnectionName 网络配置名称
     */
    public String getNetworkConnectionName() {
        return this.NetworkConnectionName;
    }

    /**
     * Set 网络配置名称
     * @param NetworkConnectionName 网络配置名称
     */
    public void setNetworkConnectionName(String NetworkConnectionName) {
        this.NetworkConnectionName = NetworkConnectionName;
    }

    public DescribeNetworkConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkConnectionsRequest(DescribeNetworkConnectionsRequest source) {
        if (source.NetworkConnectionType != null) {
            this.NetworkConnectionType = new Long(source.NetworkConnectionType);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.DatasourceConnectionVpcId != null) {
            this.DatasourceConnectionVpcId = new String(source.DatasourceConnectionVpcId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.NetworkConnectionName != null) {
            this.NetworkConnectionName = new String(source.NetworkConnectionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkConnectionType", this.NetworkConnectionType);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "DatasourceConnectionVpcId", this.DatasourceConnectionVpcId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NetworkConnectionName", this.NetworkConnectionName);

    }
}

