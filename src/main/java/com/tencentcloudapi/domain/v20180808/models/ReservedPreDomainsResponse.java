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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedPreDomainsResponse extends AbstractModel {

    /**
    * 预定成功域名列表
    */
    @SerializedName("SucDomainList")
    @Expose
    private String [] SucDomainList;

    /**
    * 预定失败域名列表
    */
    @SerializedName("FailDomainList")
    @Expose
    private FailReservedDomainInfo [] FailDomainList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预定成功域名列表 
     * @return SucDomainList 预定成功域名列表
     */
    public String [] getSucDomainList() {
        return this.SucDomainList;
    }

    /**
     * Set 预定成功域名列表
     * @param SucDomainList 预定成功域名列表
     */
    public void setSucDomainList(String [] SucDomainList) {
        this.SucDomainList = SucDomainList;
    }

    /**
     * Get 预定失败域名列表 
     * @return FailDomainList 预定失败域名列表
     */
    public FailReservedDomainInfo [] getFailDomainList() {
        return this.FailDomainList;
    }

    /**
     * Set 预定失败域名列表
     * @param FailDomainList 预定失败域名列表
     */
    public void setFailDomainList(FailReservedDomainInfo [] FailDomainList) {
        this.FailDomainList = FailDomainList;
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

    public ReservedPreDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedPreDomainsResponse(ReservedPreDomainsResponse source) {
        if (source.SucDomainList != null) {
            this.SucDomainList = new String[source.SucDomainList.length];
            for (int i = 0; i < source.SucDomainList.length; i++) {
                this.SucDomainList[i] = new String(source.SucDomainList[i]);
            }
        }
        if (source.FailDomainList != null) {
            this.FailDomainList = new FailReservedDomainInfo[source.FailDomainList.length];
            for (int i = 0; i < source.FailDomainList.length; i++) {
                this.FailDomainList[i] = new FailReservedDomainInfo(source.FailDomainList[i]);
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
        this.setParamArraySimple(map, prefix + "SucDomainList.", this.SucDomainList);
        this.setParamArrayObj(map, prefix + "FailDomainList.", this.FailDomainList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

