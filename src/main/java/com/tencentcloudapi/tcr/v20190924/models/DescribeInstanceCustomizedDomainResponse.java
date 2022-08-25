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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceCustomizedDomainResponse extends AbstractModel{

    /**
    * 域名信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainInfoList")
    @Expose
    private CustomizedDomainInfo [] DomainInfoList;

    /**
    * 总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainInfoList 域名信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomizedDomainInfo [] getDomainInfoList() {
        return this.DomainInfoList;
    }

    /**
     * Set 域名信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainInfoList 域名信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainInfoList(CustomizedDomainInfo [] DomainInfoList) {
        this.DomainInfoList = DomainInfoList;
    }

    /**
     * Get 总个数 
     * @return TotalCount 总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数
     * @param TotalCount 总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeInstanceCustomizedDomainResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceCustomizedDomainResponse(DescribeInstanceCustomizedDomainResponse source) {
        if (source.DomainInfoList != null) {
            this.DomainInfoList = new CustomizedDomainInfo[source.DomainInfoList.length];
            for (int i = 0; i < source.DomainInfoList.length; i++) {
                this.DomainInfoList[i] = new CustomizedDomainInfo(source.DomainInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainInfoList.", this.DomainInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

