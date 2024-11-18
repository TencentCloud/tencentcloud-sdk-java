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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordLineListRequest extends AbstractModel {

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名套餐等级。  旧套餐：D_FREE、D_PLUS、D_EXTRA、D_EXPERT、D_ULTRA 、DP_EXTRA 分别对应免费套餐、个人豪华、企业 I、企业 II、企业 III、企业基础版。 新套餐：DP_FREE、DP_PLUS、DP_EXPERT、DP_ULTRA 分别对应新免费、专业版、企业版、尊享版。
    */
    @SerializedName("DomainGrade")
    @Expose
    private String DomainGrade;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名套餐等级。  旧套餐：D_FREE、D_PLUS、D_EXTRA、D_EXPERT、D_ULTRA 、DP_EXTRA 分别对应免费套餐、个人豪华、企业 I、企业 II、企业 III、企业基础版。 新套餐：DP_FREE、DP_PLUS、DP_EXPERT、DP_ULTRA 分别对应新免费、专业版、企业版、尊享版。 
     * @return DomainGrade 域名套餐等级。  旧套餐：D_FREE、D_PLUS、D_EXTRA、D_EXPERT、D_ULTRA 、DP_EXTRA 分别对应免费套餐、个人豪华、企业 I、企业 II、企业 III、企业基础版。 新套餐：DP_FREE、DP_PLUS、DP_EXPERT、DP_ULTRA 分别对应新免费、专业版、企业版、尊享版。
     */
    public String getDomainGrade() {
        return this.DomainGrade;
    }

    /**
     * Set 域名套餐等级。  旧套餐：D_FREE、D_PLUS、D_EXTRA、D_EXPERT、D_ULTRA 、DP_EXTRA 分别对应免费套餐、个人豪华、企业 I、企业 II、企业 III、企业基础版。 新套餐：DP_FREE、DP_PLUS、DP_EXPERT、DP_ULTRA 分别对应新免费、专业版、企业版、尊享版。
     * @param DomainGrade 域名套餐等级。  旧套餐：D_FREE、D_PLUS、D_EXTRA、D_EXPERT、D_ULTRA 、DP_EXTRA 分别对应免费套餐、个人豪华、企业 I、企业 II、企业 III、企业基础版。 新套餐：DP_FREE、DP_PLUS、DP_EXPERT、DP_ULTRA 分别对应新免费、专业版、企业版、尊享版。
     */
    public void setDomainGrade(String DomainGrade) {
        this.DomainGrade = DomainGrade;
    }

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeRecordLineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordLineListRequest(DescribeRecordLineListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainGrade != null) {
            this.DomainGrade = new String(source.DomainGrade);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainGrade", this.DomainGrade);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

