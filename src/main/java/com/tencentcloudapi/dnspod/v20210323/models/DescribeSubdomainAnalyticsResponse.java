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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubdomainAnalyticsResponse extends AbstractModel{

    /**
    * 当前统计维度解析量小计
    */
    @SerializedName("Data")
    @Expose
    private DomainAnalyticsDetail [] Data;

    /**
    * 子域名解析量统计查询信息
    */
    @SerializedName("Info")
    @Expose
    private SubdomainAnalyticsInfo Info;

    /**
    * 子域名别名解析量统计信息
    */
    @SerializedName("AliasData")
    @Expose
    private SubdomainAliasAnalyticsItem [] AliasData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前统计维度解析量小计 
     * @return Data 当前统计维度解析量小计
     */
    public DomainAnalyticsDetail [] getData() {
        return this.Data;
    }

    /**
     * Set 当前统计维度解析量小计
     * @param Data 当前统计维度解析量小计
     */
    public void setData(DomainAnalyticsDetail [] Data) {
        this.Data = Data;
    }

    /**
     * Get 子域名解析量统计查询信息 
     * @return Info 子域名解析量统计查询信息
     */
    public SubdomainAnalyticsInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 子域名解析量统计查询信息
     * @param Info 子域名解析量统计查询信息
     */
    public void setInfo(SubdomainAnalyticsInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 子域名别名解析量统计信息 
     * @return AliasData 子域名别名解析量统计信息
     */
    public SubdomainAliasAnalyticsItem [] getAliasData() {
        return this.AliasData;
    }

    /**
     * Set 子域名别名解析量统计信息
     * @param AliasData 子域名别名解析量统计信息
     */
    public void setAliasData(SubdomainAliasAnalyticsItem [] AliasData) {
        this.AliasData = AliasData;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSubdomainAnalyticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubdomainAnalyticsResponse(DescribeSubdomainAnalyticsResponse source) {
        if (source.Data != null) {
            this.Data = new DomainAnalyticsDetail[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DomainAnalyticsDetail(source.Data[i]);
            }
        }
        if (source.Info != null) {
            this.Info = new SubdomainAnalyticsInfo(source.Info);
        }
        if (source.AliasData != null) {
            this.AliasData = new SubdomainAliasAnalyticsItem[source.AliasData.length];
            for (int i = 0; i < source.AliasData.length; i++) {
                this.AliasData[i] = new SubdomainAliasAnalyticsItem(source.AliasData[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamArrayObj(map, prefix + "AliasData.", this.AliasData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

