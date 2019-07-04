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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainPlayInfoListResponse  extends AbstractModel{

    /**
    * 数据时间，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 实时总带宽。
    */
    @SerializedName("TotalBandwidth")
    @Expose
    private Float TotalBandwidth;

    /**
    * 实时总流量。
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * TotalRequest。
    */
    @SerializedName("TotalRequest")
    @Expose
    private Integer TotalRequest;

    /**
    * 实时总连接数。
    */
    @SerializedName("TotalOnline")
    @Expose
    private Integer TotalOnline;

    /**
    * 分域名的数据情况。
    */
    @SerializedName("DomainInfoList")
    @Expose
    private DomainInfoList [] DomainInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取数据时间，格式为yyyy-mm-dd HH:MM:SS。
     * @return Time 数据时间，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置数据时间，格式为yyyy-mm-dd HH:MM:SS。
     * @param Time 数据时间，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 获取实时总带宽。
     * @return TotalBandwidth 实时总带宽。
     */
    public Float getTotalBandwidth() {
        return this.TotalBandwidth;
    }

    /**
     * 设置实时总带宽。
     * @param TotalBandwidth 实时总带宽。
     */
    public void setTotalBandwidth(Float TotalBandwidth) {
        this.TotalBandwidth = TotalBandwidth;
    }

    /**
     * 获取实时总流量。
     * @return TotalFlux 实时总流量。
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * 设置实时总流量。
     * @param TotalFlux 实时总流量。
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * 获取TotalRequest。
     * @return TotalRequest TotalRequest。
     */
    public Integer getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * 设置TotalRequest。
     * @param TotalRequest TotalRequest。
     */
    public void setTotalRequest(Integer TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * 获取实时总连接数。
     * @return TotalOnline 实时总连接数。
     */
    public Integer getTotalOnline() {
        return this.TotalOnline;
    }

    /**
     * 设置实时总连接数。
     * @param TotalOnline 实时总连接数。
     */
    public void setTotalOnline(Integer TotalOnline) {
        this.TotalOnline = TotalOnline;
    }

    /**
     * 获取分域名的数据情况。
     * @return DomainInfoList 分域名的数据情况。
     */
    public DomainInfoList [] getDomainInfoList() {
        return this.DomainInfoList;
    }

    /**
     * 设置分域名的数据情况。
     * @param DomainInfoList 分域名的数据情况。
     */
    public void setDomainInfoList(DomainInfoList [] DomainInfoList) {
        this.DomainInfoList = DomainInfoList;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TotalBandwidth", this.TotalBandwidth);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "TotalOnline", this.TotalOnline);
        this.setParamArrayObj(map, prefix + "DomainInfoList.", this.DomainInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

