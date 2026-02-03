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

public class RenewLibraDBClustersRequest extends AbstractModel {

    /**
    * 时间间隔
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 分析集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 订单模式
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
     * Get 时间间隔 
     * @return TimeSpan 时间间隔
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间间隔
     * @param TimeSpan 时间间隔
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时间单位 
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 分析集群 ID 
     * @return ClusterId 分析集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群 ID
     * @param ClusterId 分析集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 订单模式 
     * @return DealMode 订单模式
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 订单模式
     * @param DealMode 订单模式
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public RenewLibraDBClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewLibraDBClustersRequest(RenewLibraDBClustersRequest source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

