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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastDestinationStatus extends AbstractModel{

    /**
    * 输出源 Id，由系统分配。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 输出源直播地址。
    */
    @SerializedName("PushUrl")
    @Expose
    private String PushUrl;

    /**
    * 输出源的状态。取值有：
<li> Working ：运行中；</li>
<li> Stopped：停止输出；</li>
<li> Failed：输出失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 输出源 Id，由系统分配。 
     * @return Id 输出源 Id，由系统分配。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 输出源 Id，由系统分配。
     * @param Id 输出源 Id，由系统分配。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 输出源直播地址。 
     * @return PushUrl 输出源直播地址。
     */
    public String getPushUrl() {
        return this.PushUrl;
    }

    /**
     * Set 输出源直播地址。
     * @param PushUrl 输出源直播地址。
     */
    public void setPushUrl(String PushUrl) {
        this.PushUrl = PushUrl;
    }

    /**
     * Get 输出源的状态。取值有：
<li> Working ：运行中；</li>
<li> Stopped：停止输出；</li>
<li> Failed：输出失败。</li> 
     * @return Status 输出源的状态。取值有：
<li> Working ：运行中；</li>
<li> Stopped：停止输出；</li>
<li> Failed：输出失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 输出源的状态。取值有：
<li> Working ：运行中；</li>
<li> Stopped：停止输出；</li>
<li> Failed：输出失败。</li>
     * @param Status 输出源的状态。取值有：
<li> Working ：运行中；</li>
<li> Stopped：停止输出；</li>
<li> Failed：输出失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public MediaCastDestinationStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastDestinationStatus(MediaCastDestinationStatus source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PushUrl != null) {
            this.PushUrl = new String(source.PushUrl);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PushUrl", this.PushUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

