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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationStatisticsAgentStatusResponse extends AbstractModel{

    /**
    * 统计结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusData")
    @Expose
    private String StatusData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统计结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusData 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusData() {
        return this.StatusData;
    }

    /**
     * Set 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusData 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusData(String StatusData) {
        this.StatusData = StatusData;
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

    public DescribeIntegrationStatisticsAgentStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationStatisticsAgentStatusResponse(DescribeIntegrationStatisticsAgentStatusResponse source) {
        if (source.StatusData != null) {
            this.StatusData = new String(source.StatusData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusData", this.StatusData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

