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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTopWafDataResponse extends AbstractModel{

    /**
    * 攻击类型统计
    */
    @SerializedName("TopTypeData")
    @Expose
    private ScdnTypeData [] TopTypeData;

    /**
    * IP统计
    */
    @SerializedName("TopIpData")
    @Expose
    private ScdnTopData [] TopIpData;

    /**
    * URL统计
    */
    @SerializedName("TopUrlData")
    @Expose
    private ScdnTopUrlData [] TopUrlData;

    /**
    * 域名统计
    */
    @SerializedName("TopDomainData")
    @Expose
    private ScdnTopDomainData [] TopDomainData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 攻击类型统计 
     * @return TopTypeData 攻击类型统计
     */
    public ScdnTypeData [] getTopTypeData() {
        return this.TopTypeData;
    }

    /**
     * Set 攻击类型统计
     * @param TopTypeData 攻击类型统计
     */
    public void setTopTypeData(ScdnTypeData [] TopTypeData) {
        this.TopTypeData = TopTypeData;
    }

    /**
     * Get IP统计 
     * @return TopIpData IP统计
     */
    public ScdnTopData [] getTopIpData() {
        return this.TopIpData;
    }

    /**
     * Set IP统计
     * @param TopIpData IP统计
     */
    public void setTopIpData(ScdnTopData [] TopIpData) {
        this.TopIpData = TopIpData;
    }

    /**
     * Get URL统计 
     * @return TopUrlData URL统计
     */
    public ScdnTopUrlData [] getTopUrlData() {
        return this.TopUrlData;
    }

    /**
     * Set URL统计
     * @param TopUrlData URL统计
     */
    public void setTopUrlData(ScdnTopUrlData [] TopUrlData) {
        this.TopUrlData = TopUrlData;
    }

    /**
     * Get 域名统计 
     * @return TopDomainData 域名统计
     */
    public ScdnTopDomainData [] getTopDomainData() {
        return this.TopDomainData;
    }

    /**
     * Set 域名统计
     * @param TopDomainData 域名统计
     */
    public void setTopDomainData(ScdnTopDomainData [] TopDomainData) {
        this.TopDomainData = TopDomainData;
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

    public ListTopWafDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopWafDataResponse(ListTopWafDataResponse source) {
        if (source.TopTypeData != null) {
            this.TopTypeData = new ScdnTypeData[source.TopTypeData.length];
            for (int i = 0; i < source.TopTypeData.length; i++) {
                this.TopTypeData[i] = new ScdnTypeData(source.TopTypeData[i]);
            }
        }
        if (source.TopIpData != null) {
            this.TopIpData = new ScdnTopData[source.TopIpData.length];
            for (int i = 0; i < source.TopIpData.length; i++) {
                this.TopIpData[i] = new ScdnTopData(source.TopIpData[i]);
            }
        }
        if (source.TopUrlData != null) {
            this.TopUrlData = new ScdnTopUrlData[source.TopUrlData.length];
            for (int i = 0; i < source.TopUrlData.length; i++) {
                this.TopUrlData[i] = new ScdnTopUrlData(source.TopUrlData[i]);
            }
        }
        if (source.TopDomainData != null) {
            this.TopDomainData = new ScdnTopDomainData[source.TopDomainData.length];
            for (int i = 0; i < source.TopDomainData.length; i++) {
                this.TopDomainData[i] = new ScdnTopDomainData(source.TopDomainData[i]);
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
        this.setParamArrayObj(map, prefix + "TopTypeData.", this.TopTypeData);
        this.setParamArrayObj(map, prefix + "TopIpData.", this.TopIpData);
        this.setParamArrayObj(map, prefix + "TopUrlData.", this.TopUrlData);
        this.setParamArrayObj(map, prefix + "TopDomainData.", this.TopDomainData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

