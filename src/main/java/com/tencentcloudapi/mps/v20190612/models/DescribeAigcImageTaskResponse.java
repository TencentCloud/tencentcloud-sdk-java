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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcImageTaskResponse extends AbstractModel {

    /**
    * 任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当任务状态为 DONE时，返回的图片Url列表，图片存储12小时，请尽快取走使用。
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * 当任务状态为 FAIL时，返回失败信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。 
     * @return Status 任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。
     * @param Status 任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当任务状态为 DONE时，返回的图片Url列表，图片存储12小时，请尽快取走使用。 
     * @return ImageUrls 当任务状态为 DONE时，返回的图片Url列表，图片存储12小时，请尽快取走使用。
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set 当任务状态为 DONE时，返回的图片Url列表，图片存储12小时，请尽快取走使用。
     * @param ImageUrls 当任务状态为 DONE时，返回的图片Url列表，图片存储12小时，请尽快取走使用。
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get 当任务状态为 FAIL时，返回失败信息。 
     * @return Message 当任务状态为 FAIL时，返回失败信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 当任务状态为 FAIL时，返回失败信息。
     * @param Message 当任务状态为 FAIL时，返回失败信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public DescribeAigcImageTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcImageTaskResponse(DescribeAigcImageTaskResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
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
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

