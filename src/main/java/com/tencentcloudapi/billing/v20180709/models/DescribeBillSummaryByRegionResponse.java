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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByRegionResponse  extends AbstractModel{

    /**
    * 数据是否准备好，0未准备好，1准备好
    */
    @SerializedName("Ready")
    @Expose
    private Integer Ready;

    /**
    * 各地域花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryOverview")
    @Expose
    private RegionSummaryOverviewItem [] SummaryOverview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取数据是否准备好，0未准备好，1准备好
     * @return Ready 数据是否准备好，0未准备好，1准备好
     */
    public Integer getReady() {
        return this.Ready;
    }

    /**
     * 设置数据是否准备好，0未准备好，1准备好
     * @param Ready 数据是否准备好，0未准备好，1准备好
     */
    public void setReady(Integer Ready) {
        this.Ready = Ready;
    }

    /**
     * 获取各地域花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     * @return SummaryOverview 各地域花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * 设置各地域花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryOverview 各地域花费分布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryOverview(RegionSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
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
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

