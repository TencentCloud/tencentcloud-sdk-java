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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastEvent extends AbstractModel {

    /**
    * 媒体转推 ID。
    */
    @SerializedName("CastId")
    @Expose
    private String CastId;

    /**
    * 转推状态，取值有：
<li>Working ：运行中；</li>
<li>Scheduled ：等待定时时间到达后启动；</li>
<li>Stopped ：已经停止转推；</li>
<li>Idle ：空闲。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 媒体转推 ID。 
     * @return CastId 媒体转推 ID。
     */
    public String getCastId() {
        return this.CastId;
    }

    /**
     * Set 媒体转推 ID。
     * @param CastId 媒体转推 ID。
     */
    public void setCastId(String CastId) {
        this.CastId = CastId;
    }

    /**
     * Get 转推状态，取值有：
<li>Working ：运行中；</li>
<li>Scheduled ：等待定时时间到达后启动；</li>
<li>Stopped ：已经停止转推；</li>
<li>Idle ：空闲。</li> 
     * @return Status 转推状态，取值有：
<li>Working ：运行中；</li>
<li>Scheduled ：等待定时时间到达后启动；</li>
<li>Stopped ：已经停止转推；</li>
<li>Idle ：空闲。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 转推状态，取值有：
<li>Working ：运行中；</li>
<li>Scheduled ：等待定时时间到达后启动；</li>
<li>Stopped ：已经停止转推；</li>
<li>Idle ：空闲。</li>
     * @param Status 转推状态，取值有：
<li>Working ：运行中；</li>
<li>Scheduled ：等待定时时间到达后启动；</li>
<li>Stopped ：已经停止转推；</li>
<li>Idle ：空闲。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public MediaCastEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastEvent(MediaCastEvent source) {
        if (source.CastId != null) {
            this.CastId = new String(source.CastId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CastId", this.CastId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

