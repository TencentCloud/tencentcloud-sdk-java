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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewResourceQuotaDetail extends AbstractModel {

    /**
    * <p>南北向带宽与流量详情数据。</p>
    */
    @SerializedName("NorthSouthDetail")
    @Expose
    private OverviewNorthSouthDetail NorthSouthDetail;

    /**
    * <p>东西向带宽与流量详情数据。</p>
    */
    @SerializedName("EastWestDetail")
    @Expose
    private OverviewEastWestDetail EastWestDetail;

    /**
    * <p>NDR 带宽与流量详情数据。</p>
    */
    @SerializedName("NDRDetail")
    @Expose
    private OverviewNDRDetail NDRDetail;

    /**
    * <p>账号下资源、实例、规则和扩容配额详情数据。</p>
    */
    @SerializedName("QuotaDetail")
    @Expose
    private OverviewQuotaDetail QuotaDetail;

    /**
    * <p>日志存储使用量、保留天数和各类日志容量详情数据。</p>
    */
    @SerializedName("LogStorageDetail")
    @Expose
    private OverviewLogStorageDetail LogStorageDetail;

    /**
     * Get <p>南北向带宽与流量详情数据。</p> 
     * @return NorthSouthDetail <p>南北向带宽与流量详情数据。</p>
     */
    public OverviewNorthSouthDetail getNorthSouthDetail() {
        return this.NorthSouthDetail;
    }

    /**
     * Set <p>南北向带宽与流量详情数据。</p>
     * @param NorthSouthDetail <p>南北向带宽与流量详情数据。</p>
     */
    public void setNorthSouthDetail(OverviewNorthSouthDetail NorthSouthDetail) {
        this.NorthSouthDetail = NorthSouthDetail;
    }

    /**
     * Get <p>东西向带宽与流量详情数据。</p> 
     * @return EastWestDetail <p>东西向带宽与流量详情数据。</p>
     */
    public OverviewEastWestDetail getEastWestDetail() {
        return this.EastWestDetail;
    }

    /**
     * Set <p>东西向带宽与流量详情数据。</p>
     * @param EastWestDetail <p>东西向带宽与流量详情数据。</p>
     */
    public void setEastWestDetail(OverviewEastWestDetail EastWestDetail) {
        this.EastWestDetail = EastWestDetail;
    }

    /**
     * Get <p>NDR 带宽与流量详情数据。</p> 
     * @return NDRDetail <p>NDR 带宽与流量详情数据。</p>
     */
    public OverviewNDRDetail getNDRDetail() {
        return this.NDRDetail;
    }

    /**
     * Set <p>NDR 带宽与流量详情数据。</p>
     * @param NDRDetail <p>NDR 带宽与流量详情数据。</p>
     */
    public void setNDRDetail(OverviewNDRDetail NDRDetail) {
        this.NDRDetail = NDRDetail;
    }

    /**
     * Get <p>账号下资源、实例、规则和扩容配额详情数据。</p> 
     * @return QuotaDetail <p>账号下资源、实例、规则和扩容配额详情数据。</p>
     */
    public OverviewQuotaDetail getQuotaDetail() {
        return this.QuotaDetail;
    }

    /**
     * Set <p>账号下资源、实例、规则和扩容配额详情数据。</p>
     * @param QuotaDetail <p>账号下资源、实例、规则和扩容配额详情数据。</p>
     */
    public void setQuotaDetail(OverviewQuotaDetail QuotaDetail) {
        this.QuotaDetail = QuotaDetail;
    }

    /**
     * Get <p>日志存储使用量、保留天数和各类日志容量详情数据。</p> 
     * @return LogStorageDetail <p>日志存储使用量、保留天数和各类日志容量详情数据。</p>
     */
    public OverviewLogStorageDetail getLogStorageDetail() {
        return this.LogStorageDetail;
    }

    /**
     * Set <p>日志存储使用量、保留天数和各类日志容量详情数据。</p>
     * @param LogStorageDetail <p>日志存储使用量、保留天数和各类日志容量详情数据。</p>
     */
    public void setLogStorageDetail(OverviewLogStorageDetail LogStorageDetail) {
        this.LogStorageDetail = LogStorageDetail;
    }

    public OverviewResourceQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewResourceQuotaDetail(OverviewResourceQuotaDetail source) {
        if (source.NorthSouthDetail != null) {
            this.NorthSouthDetail = new OverviewNorthSouthDetail(source.NorthSouthDetail);
        }
        if (source.EastWestDetail != null) {
            this.EastWestDetail = new OverviewEastWestDetail(source.EastWestDetail);
        }
        if (source.NDRDetail != null) {
            this.NDRDetail = new OverviewNDRDetail(source.NDRDetail);
        }
        if (source.QuotaDetail != null) {
            this.QuotaDetail = new OverviewQuotaDetail(source.QuotaDetail);
        }
        if (source.LogStorageDetail != null) {
            this.LogStorageDetail = new OverviewLogStorageDetail(source.LogStorageDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NorthSouthDetail.", this.NorthSouthDetail);
        this.setParamObj(map, prefix + "EastWestDetail.", this.EastWestDetail);
        this.setParamObj(map, prefix + "NDRDetail.", this.NDRDetail);
        this.setParamObj(map, prefix + "QuotaDetail.", this.QuotaDetail);
        this.setParamObj(map, prefix + "LogStorageDetail.", this.LogStorageDetail);

    }
}

