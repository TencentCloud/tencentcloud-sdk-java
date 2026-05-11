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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSceneVideoTaskResponse extends AbstractModel {

    /**
    * <p>一些特殊场景的返回信息。</p>
    */
    @SerializedName("InfoList")
    @Expose
    private SceneVideoOutputInfo [] InfoList;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>DONE： 任务结束。</li><li>RUN： 任务运行中。</li><li>WAIT： 任务准备中。</li><li>FAIL： 任务失败。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>输出视频的分辨率。示例：720x1280。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>输出的视频Url。默认过期时间:12小时，请尽快拉取并转存。也可以使用私有Cos桶长期存储。</p>
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
     * Get <p>一些特殊场景的返回信息。</p> 
     * @return InfoList <p>一些特殊场景的返回信息。</p>
     */
    public SceneVideoOutputInfo [] getInfoList() {
        return this.InfoList;
    }

    /**
     * Set <p>一些特殊场景的返回信息。</p>
     * @param InfoList <p>一些特殊场景的返回信息。</p>
     */
    public void setInfoList(SceneVideoOutputInfo [] InfoList) {
        this.InfoList = InfoList;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>DONE： 任务结束。</li><li>RUN： 任务运行中。</li><li>WAIT： 任务准备中。</li><li>FAIL： 任务失败。</li></ul> 
     * @return Status <p>任务状态。</p><p>枚举值：</p><ul><li>DONE： 任务结束。</li><li>RUN： 任务运行中。</li><li>WAIT： 任务准备中。</li><li>FAIL： 任务失败。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>DONE： 任务结束。</li><li>RUN： 任务运行中。</li><li>WAIT： 任务准备中。</li><li>FAIL： 任务失败。</li></ul>
     * @param Status <p>任务状态。</p><p>枚举值：</p><ul><li>DONE： 任务结束。</li><li>RUN： 任务运行中。</li><li>WAIT： 任务准备中。</li><li>FAIL： 任务失败。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输出视频的分辨率。示例：720x1280。</p> 
     * @return Resolution <p>输出视频的分辨率。示例：720x1280。</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出视频的分辨率。示例：720x1280。</p>
     * @param Resolution <p>输出视频的分辨率。示例：720x1280。</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>输出的视频Url。默认过期时间:12小时，请尽快拉取并转存。也可以使用私有Cos桶长期存储。</p> 
     * @return VideoUrls <p>输出的视频Url。默认过期时间:12小时，请尽快拉取并转存。也可以使用私有Cos桶长期存储。</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p>输出的视频Url。默认过期时间:12小时，请尽快拉取并转存。也可以使用私有Cos桶长期存储。</p>
     * @param VideoUrls <p>输出的视频Url。默认过期时间:12小时，请尽快拉取并转存。也可以使用私有Cos桶长期存储。</p>
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

    public DescribeSceneVideoTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSceneVideoTaskResponse(DescribeSceneVideoTaskResponse source) {
        if (source.InfoList != null) {
            this.InfoList = new SceneVideoOutputInfo[source.InfoList.length];
            for (int i = 0; i < source.InfoList.length; i++) {
                this.InfoList[i] = new SceneVideoOutputInfo(source.InfoList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
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
        this.setParamArrayObj(map, prefix + "InfoList.", this.InfoList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArraySimple(map, prefix + "VideoUrls.", this.VideoUrls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

