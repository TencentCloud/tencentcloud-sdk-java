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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomBlacklistResponse extends AbstractModel {

    /**
    * 收件人总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实际上传数量
    */
    @SerializedName("ValidCount")
    @Expose
    private Long ValidCount;

    /**
    * 数据过长数量
    */
    @SerializedName("TooLongCount")
    @Expose
    private Long TooLongCount;

    /**
    * 重复数量
    */
    @SerializedName("RepeatCount")
    @Expose
    private Long RepeatCount;

    /**
    * 格式不正确数量
    */
    @SerializedName("InvalidCount")
    @Expose
    private Long InvalidCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 收件人总数 
     * @return TotalCount 收件人总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 收件人总数
     * @param TotalCount 收件人总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实际上传数量 
     * @return ValidCount 实际上传数量
     */
    public Long getValidCount() {
        return this.ValidCount;
    }

    /**
     * Set 实际上传数量
     * @param ValidCount 实际上传数量
     */
    public void setValidCount(Long ValidCount) {
        this.ValidCount = ValidCount;
    }

    /**
     * Get 数据过长数量 
     * @return TooLongCount 数据过长数量
     */
    public Long getTooLongCount() {
        return this.TooLongCount;
    }

    /**
     * Set 数据过长数量
     * @param TooLongCount 数据过长数量
     */
    public void setTooLongCount(Long TooLongCount) {
        this.TooLongCount = TooLongCount;
    }

    /**
     * Get 重复数量 
     * @return RepeatCount 重复数量
     */
    public Long getRepeatCount() {
        return this.RepeatCount;
    }

    /**
     * Set 重复数量
     * @param RepeatCount 重复数量
     */
    public void setRepeatCount(Long RepeatCount) {
        this.RepeatCount = RepeatCount;
    }

    /**
     * Get 格式不正确数量 
     * @return InvalidCount 格式不正确数量
     */
    public Long getInvalidCount() {
        return this.InvalidCount;
    }

    /**
     * Set 格式不正确数量
     * @param InvalidCount 格式不正确数量
     */
    public void setInvalidCount(Long InvalidCount) {
        this.InvalidCount = InvalidCount;
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

    public CreateCustomBlacklistResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomBlacklistResponse(CreateCustomBlacklistResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ValidCount != null) {
            this.ValidCount = new Long(source.ValidCount);
        }
        if (source.TooLongCount != null) {
            this.TooLongCount = new Long(source.TooLongCount);
        }
        if (source.RepeatCount != null) {
            this.RepeatCount = new Long(source.RepeatCount);
        }
        if (source.InvalidCount != null) {
            this.InvalidCount = new Long(source.InvalidCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ValidCount", this.ValidCount);
        this.setParamSimple(map, prefix + "TooLongCount", this.TooLongCount);
        this.setParamSimple(map, prefix + "RepeatCount", this.RepeatCount);
        this.setParamSimple(map, prefix + "InvalidCount", this.InvalidCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

