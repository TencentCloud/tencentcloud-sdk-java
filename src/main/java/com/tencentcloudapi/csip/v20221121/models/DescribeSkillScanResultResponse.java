/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillScanResultResponse extends AbstractModel {

    /**
    * 检测状态
枚举值：
SUCCESS：检测完成，有结果
SCANNING：检测进行中
NOT_FOUND：无检测记录
FAILED：检测失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 检测结果详情。Status=SUCCESS 时大部分字段有值；Status=SCANNING 时仅包含 ContentHash 和 CreatedAt；Status=FAILED 时仅包含 ContentHash、FailedAt 和 Message；Status=NOT_FOUND 时仅包含 ContentHash
    */
    @SerializedName("Data")
    @Expose
    private SkillScanItem Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测状态
枚举值：
SUCCESS：检测完成，有结果
SCANNING：检测进行中
NOT_FOUND：无检测记录
FAILED：检测失败 
     * @return Status 检测状态
枚举值：
SUCCESS：检测完成，有结果
SCANNING：检测进行中
NOT_FOUND：无检测记录
FAILED：检测失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 检测状态
枚举值：
SUCCESS：检测完成，有结果
SCANNING：检测进行中
NOT_FOUND：无检测记录
FAILED：检测失败
     * @param Status 检测状态
枚举值：
SUCCESS：检测完成，有结果
SCANNING：检测进行中
NOT_FOUND：无检测记录
FAILED：检测失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 检测结果详情。Status=SUCCESS 时大部分字段有值；Status=SCANNING 时仅包含 ContentHash 和 CreatedAt；Status=FAILED 时仅包含 ContentHash、FailedAt 和 Message；Status=NOT_FOUND 时仅包含 ContentHash 
     * @return Data 检测结果详情。Status=SUCCESS 时大部分字段有值；Status=SCANNING 时仅包含 ContentHash 和 CreatedAt；Status=FAILED 时仅包含 ContentHash、FailedAt 和 Message；Status=NOT_FOUND 时仅包含 ContentHash
     */
    public SkillScanItem getData() {
        return this.Data;
    }

    /**
     * Set 检测结果详情。Status=SUCCESS 时大部分字段有值；Status=SCANNING 时仅包含 ContentHash 和 CreatedAt；Status=FAILED 时仅包含 ContentHash、FailedAt 和 Message；Status=NOT_FOUND 时仅包含 ContentHash
     * @param Data 检测结果详情。Status=SUCCESS 时大部分字段有值；Status=SCANNING 时仅包含 ContentHash 和 CreatedAt；Status=FAILED 时仅包含 ContentHash、FailedAt 和 Message；Status=NOT_FOUND 时仅包含 ContentHash
     */
    public void setData(SkillScanItem Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSkillScanResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanResultResponse(DescribeSkillScanResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Data != null) {
            this.Data = new SkillScanItem(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

