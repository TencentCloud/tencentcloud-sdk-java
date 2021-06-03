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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowTrendRequest extends AbstractModel{

    /**
    * 需要获取流量趋势的域名, all表示所有域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 起始时间戳，精度秒
    */
    @SerializedName("StartTs")
    @Expose
    private Long StartTs;

    /**
    * 结束时间戳，精度秒
    */
    @SerializedName("EndTs")
    @Expose
    private Long EndTs;

    /**
     * Get 需要获取流量趋势的域名, all表示所有域名 
     * @return Domain 需要获取流量趋势的域名, all表示所有域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要获取流量趋势的域名, all表示所有域名
     * @param Domain 需要获取流量趋势的域名, all表示所有域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 起始时间戳，精度秒 
     * @return StartTs 起始时间戳，精度秒
     */
    public Long getStartTs() {
        return this.StartTs;
    }

    /**
     * Set 起始时间戳，精度秒
     * @param StartTs 起始时间戳，精度秒
     */
    public void setStartTs(Long StartTs) {
        this.StartTs = StartTs;
    }

    /**
     * Get 结束时间戳，精度秒 
     * @return EndTs 结束时间戳，精度秒
     */
    public Long getEndTs() {
        return this.EndTs;
    }

    /**
     * Set 结束时间戳，精度秒
     * @param EndTs 结束时间戳，精度秒
     */
    public void setEndTs(Long EndTs) {
        this.EndTs = EndTs;
    }

    public DescribeFlowTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowTrendRequest(DescribeFlowTrendRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTs != null) {
            this.StartTs = new Long(source.StartTs);
        }
        if (source.EndTs != null) {
            this.EndTs = new Long(source.EndTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);

    }
}

