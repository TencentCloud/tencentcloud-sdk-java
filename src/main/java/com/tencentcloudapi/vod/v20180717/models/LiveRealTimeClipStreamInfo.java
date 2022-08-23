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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRealTimeClipStreamInfo extends AbstractModel{

    /**
    * 直播流类型，可选值：
<li>Original（原始流，<b>默认值</b>）。</li>
<li>Transcoding（转码流）。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 直播转码模板ID。
<b>当Type值为"Transcoding"时，必须填写。</b>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get 直播流类型，可选值：
<li>Original（原始流，<b>默认值</b>）。</li>
<li>Transcoding（转码流）。</li> 
     * @return Type 直播流类型，可选值：
<li>Original（原始流，<b>默认值</b>）。</li>
<li>Transcoding（转码流）。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 直播流类型，可选值：
<li>Original（原始流，<b>默认值</b>）。</li>
<li>Transcoding（转码流）。</li>
     * @param Type 直播流类型，可选值：
<li>Original（原始流，<b>默认值</b>）。</li>
<li>Transcoding（转码流）。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 直播转码模板ID。
<b>当Type值为"Transcoding"时，必须填写。</b> 
     * @return TemplateId 直播转码模板ID。
<b>当Type值为"Transcoding"时，必须填写。</b>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 直播转码模板ID。
<b>当Type值为"Transcoding"时，必须填写。</b>
     * @param TemplateId 直播转码模板ID。
<b>当Type值为"Transcoding"时，必须填写。</b>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public LiveRealTimeClipStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipStreamInfo(LiveRealTimeClipStreamInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

