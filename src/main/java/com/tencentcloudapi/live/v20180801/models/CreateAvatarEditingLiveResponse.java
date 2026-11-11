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

public class CreateAvatarEditingLiveResponse extends AbstractModel {

    /**
    * <p>实时编辑会话ID</p>
    */
    @SerializedName("LiveId")
    @Expose
    private String LiveId;

    /**
    * <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>通道ID，这里是待编辑的直播流的源ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实时编辑会话ID</p> 
     * @return LiveId <p>实时编辑会话ID</p>
     */
    public String getLiveId() {
        return this.LiveId;
    }

    /**
     * Set <p>实时编辑会话ID</p>
     * @param LiveId <p>实时编辑会话ID</p>
     */
    public void setLiveId(String LiveId) {
        this.LiveId = LiveId;
    }

    /**
     * Get <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li></ul> 
     * @return Status <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li></ul>
     * @param Status <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>通道ID，这里是待编辑的直播流的源ID</p> 
     * @return ChannelId <p>通道ID，这里是待编辑的直播流的源ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID，这里是待编辑的直播流的源ID</p>
     * @param ChannelId <p>通道ID，这里是待编辑的直播流的源ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
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

    public CreateAvatarEditingLiveResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAvatarEditingLiveResponse(CreateAvatarEditingLiveResponse source) {
        if (source.LiveId != null) {
            this.LiveId = new String(source.LiveId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveId", this.LiveId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

