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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleHlsClipResponse extends AbstractModel {

    /**
    * <p>裁剪后的视频地址。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>裁剪后的视频元信息。目前<code>Size</code>，<code>Rotate</code>，<code>VideoDuration</code>，<code>AudioDuration</code> 几个字段暂时缺省，没有真实数据。</p>
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>剪辑固化后的视频的媒体文件的唯一标识。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>剪辑固化后的视频任务流 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>裁剪后的视频地址。</p> 
     * @return Url <p>裁剪后的视频地址。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>裁剪后的视频地址。</p>
     * @param Url <p>裁剪后的视频地址。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>裁剪后的视频元信息。目前<code>Size</code>，<code>Rotate</code>，<code>VideoDuration</code>，<code>AudioDuration</code> 几个字段暂时缺省，没有真实数据。</p> 
     * @return MetaData <p>裁剪后的视频元信息。目前<code>Size</code>，<code>Rotate</code>，<code>VideoDuration</code>，<code>AudioDuration</code> 几个字段暂时缺省，没有真实数据。</p>
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>裁剪后的视频元信息。目前<code>Size</code>，<code>Rotate</code>，<code>VideoDuration</code>，<code>AudioDuration</code> 几个字段暂时缺省，没有真实数据。</p>
     * @param MetaData <p>裁剪后的视频元信息。目前<code>Size</code>，<code>Rotate</code>，<code>VideoDuration</code>，<code>AudioDuration</code> 几个字段暂时缺省，没有真实数据。</p>
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>剪辑固化后的视频的媒体文件的唯一标识。</p> 
     * @return FileId <p>剪辑固化后的视频的媒体文件的唯一标识。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>剪辑固化后的视频的媒体文件的唯一标识。</p>
     * @param FileId <p>剪辑固化后的视频的媒体文件的唯一标识。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>剪辑固化后的视频任务流 ID。</p> 
     * @return TaskId <p>剪辑固化后的视频任务流 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>剪辑固化后的视频任务流 ID。</p>
     * @param TaskId <p>剪辑固化后的视频任务流 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public SimpleHlsClipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleHlsClipResponse(SimpleHlsClipResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

