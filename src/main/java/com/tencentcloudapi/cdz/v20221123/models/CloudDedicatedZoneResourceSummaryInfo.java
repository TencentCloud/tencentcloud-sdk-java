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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudDedicatedZoneResourceSummaryInfo extends AbstractModel {

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 子产品名称
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * 资源统计详情
    */
    @SerializedName("Statistics")
    @Expose
    private CloudDedicatedZoneResourceStatisticsInfo [] Statistics;

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 子产品名称 
     * @return SubProductName 子产品名称
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set 子产品名称
     * @param SubProductName 子产品名称
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get 资源统计详情 
     * @return Statistics 资源统计详情
     */
    public CloudDedicatedZoneResourceStatisticsInfo [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 资源统计详情
     * @param Statistics 资源统计详情
     */
    public void setStatistics(CloudDedicatedZoneResourceStatisticsInfo [] Statistics) {
        this.Statistics = Statistics;
    }

    public CloudDedicatedZoneResourceSummaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudDedicatedZoneResourceSummaryInfo(CloudDedicatedZoneResourceSummaryInfo source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.Statistics != null) {
            this.Statistics = new CloudDedicatedZoneResourceStatisticsInfo[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new CloudDedicatedZoneResourceStatisticsInfo(source.Statistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);

    }
}

