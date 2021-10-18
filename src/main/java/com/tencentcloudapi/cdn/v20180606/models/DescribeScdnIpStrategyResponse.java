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

public class DescribeScdnIpStrategyResponse extends AbstractModel{

    /**
    * IP策略列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpStrategyList")
    @Expose
    private ScdnIpStrategy [] IpStrategyList;

    /**
    * 配置的策略条数
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get IP策略列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpStrategyList IP策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnIpStrategy [] getIpStrategyList() {
        return this.IpStrategyList;
    }

    /**
     * Set IP策略列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpStrategyList IP策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpStrategyList(ScdnIpStrategy [] IpStrategyList) {
        this.IpStrategyList = IpStrategyList;
    }

    /**
     * Get 配置的策略条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 配置的策略条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 配置的策略条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 配置的策略条数
注意：此字段可能返回 null，表示取不到有效值。
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

    public DescribeScdnIpStrategyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnIpStrategyResponse(DescribeScdnIpStrategyResponse source) {
        if (source.IpStrategyList != null) {
            this.IpStrategyList = new ScdnIpStrategy[source.IpStrategyList.length];
            for (int i = 0; i < source.IpStrategyList.length; i++) {
                this.IpStrategyList[i] = new ScdnIpStrategy(source.IpStrategyList[i]);
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
        this.setParamArrayObj(map, prefix + "IpStrategyList.", this.IpStrategyList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

