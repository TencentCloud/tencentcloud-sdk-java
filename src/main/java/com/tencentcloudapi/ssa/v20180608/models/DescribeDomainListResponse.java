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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainListResponse extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 无
    */
    @SerializedName("DomainInfoCollection")
    @Expose
    private DomainInfo [] DomainInfoCollection;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无 
     * @return Total 无
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 无
     * @param Total 无
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 无 
     * @return DomainInfoCollection 无
     */
    public DomainInfo [] getDomainInfoCollection() {
        return this.DomainInfoCollection;
    }

    /**
     * Set 无
     * @param DomainInfoCollection 无
     */
    public void setDomainInfoCollection(DomainInfo [] DomainInfoCollection) {
        this.DomainInfoCollection = DomainInfoCollection;
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

    public DescribeDomainListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainListResponse(DescribeDomainListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.DomainInfoCollection != null) {
            this.DomainInfoCollection = new DomainInfo[source.DomainInfoCollection.length];
            for (int i = 0; i < source.DomainInfoCollection.length; i++) {
                this.DomainInfoCollection[i] = new DomainInfo(source.DomainInfoCollection[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "DomainInfoCollection.", this.DomainInfoCollection);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

