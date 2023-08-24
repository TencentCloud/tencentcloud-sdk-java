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

public class DescribeDomainCountInfoResponse extends AbstractModel{

    /**
    * 域名总数
    */
    @SerializedName("AllDomain")
    @Expose
    private Long AllDomain;

    /**
    * 最近发现时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 接入域名总数
    */
    @SerializedName("WafDomainCount")
    @Expose
    private Long WafDomainCount;

    /**
    * 剩下配额
    */
    @SerializedName("LeftDomainCount")
    @Expose
    private Long LeftDomainCount;

    /**
    * 开启防护域名数
    */
    @SerializedName("OpenWafDomain")
    @Expose
    private Long OpenWafDomain;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名总数 
     * @return AllDomain 域名总数
     */
    public Long getAllDomain() {
        return this.AllDomain;
    }

    /**
     * Set 域名总数
     * @param AllDomain 域名总数
     */
    public void setAllDomain(Long AllDomain) {
        this.AllDomain = AllDomain;
    }

    /**
     * Get 最近发现时间 
     * @return UpdateTime 最近发现时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近发现时间
     * @param UpdateTime 最近发现时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 接入域名总数 
     * @return WafDomainCount 接入域名总数
     */
    public Long getWafDomainCount() {
        return this.WafDomainCount;
    }

    /**
     * Set 接入域名总数
     * @param WafDomainCount 接入域名总数
     */
    public void setWafDomainCount(Long WafDomainCount) {
        this.WafDomainCount = WafDomainCount;
    }

    /**
     * Get 剩下配额 
     * @return LeftDomainCount 剩下配额
     */
    public Long getLeftDomainCount() {
        return this.LeftDomainCount;
    }

    /**
     * Set 剩下配额
     * @param LeftDomainCount 剩下配额
     */
    public void setLeftDomainCount(Long LeftDomainCount) {
        this.LeftDomainCount = LeftDomainCount;
    }

    /**
     * Get 开启防护域名数 
     * @return OpenWafDomain 开启防护域名数
     */
    public Long getOpenWafDomain() {
        return this.OpenWafDomain;
    }

    /**
     * Set 开启防护域名数
     * @param OpenWafDomain 开启防护域名数
     */
    public void setOpenWafDomain(Long OpenWafDomain) {
        this.OpenWafDomain = OpenWafDomain;
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

    public DescribeDomainCountInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainCountInfoResponse(DescribeDomainCountInfoResponse source) {
        if (source.AllDomain != null) {
            this.AllDomain = new Long(source.AllDomain);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.WafDomainCount != null) {
            this.WafDomainCount = new Long(source.WafDomainCount);
        }
        if (source.LeftDomainCount != null) {
            this.LeftDomainCount = new Long(source.LeftDomainCount);
        }
        if (source.OpenWafDomain != null) {
            this.OpenWafDomain = new Long(source.OpenWafDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllDomain", this.AllDomain);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "WafDomainCount", this.WafDomainCount);
        this.setParamSimple(map, prefix + "LeftDomainCount", this.LeftDomainCount);
        this.setParamSimple(map, prefix + "OpenWafDomain", this.OpenWafDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

