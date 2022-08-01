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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCheckSummaryResponse extends AbstractModel{

    /**
    * 检查点汇总信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckSummarySet")
    @Expose
    private CheckSummary [] CheckSummarySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检查点汇总信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckSummarySet 检查点汇总信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckSummary [] getCheckSummarySet() {
        return this.CheckSummarySet;
    }

    /**
     * Set 检查点汇总信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckSummarySet 检查点汇总信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckSummarySet(CheckSummary [] CheckSummarySet) {
        this.CheckSummarySet = CheckSummarySet;
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

    public DescribeCheckSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckSummaryResponse(DescribeCheckSummaryResponse source) {
        if (source.CheckSummarySet != null) {
            this.CheckSummarySet = new CheckSummary[source.CheckSummarySet.length];
            for (int i = 0; i < source.CheckSummarySet.length; i++) {
                this.CheckSummarySet[i] = new CheckSummary(source.CheckSummarySet[i]);
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
        this.setParamArrayObj(map, prefix + "CheckSummarySet.", this.CheckSummarySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

