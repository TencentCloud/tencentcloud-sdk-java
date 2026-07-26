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

public class DescribeCloneViralTaskResponse extends AbstractModel {

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>失败时返回错误信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>当任务状态为 DONE时，返回视频Url列表，视频存储24小时</p>
    */
    @SerializedName("VideoUrls")
    @Expose
    private String [] VideoUrls;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 等待中</li><li>RUN： 执行中</li><li>FAIL： 任务失败</li><li>DONE： 任务成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>失败时返回错误信息</p> 
     * @return Message <p>失败时返回错误信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>失败时返回错误信息</p>
     * @param Message <p>失败时返回错误信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>当任务状态为 DONE时，返回视频Url列表，视频存储24小时</p> 
     * @return VideoUrls <p>当任务状态为 DONE时，返回视频Url列表，视频存储24小时</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p>当任务状态为 DONE时，返回视频Url列表，视频存储24小时</p>
     * @param VideoUrls <p>当任务状态为 DONE时，返回视频Url列表，视频存储24小时</p>
     */
    public void setVideoUrls(String [] VideoUrls) {
        this.VideoUrls = VideoUrls;
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

    public DescribeCloneViralTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneViralTaskResponse(DescribeCloneViralTaskResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.VideoUrls != null) {
            this.VideoUrls = new String[source.VideoUrls.length];
            for (int i = 0; i < source.VideoUrls.length; i++) {
                this.VideoUrls[i] = new String(source.VideoUrls[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArraySimple(map, prefix + "VideoUrls.", this.VideoUrls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

