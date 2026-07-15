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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkSTTConfig extends AbstractModel {

    /**
    * 当前仅支持 `trtc`（使用 TRTC 内置语音识别）。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * `Type=trtc` 时生效。整体省略表示全部使用 TRTC 默认值。
    */
    @SerializedName("TRTC")
    @Expose
    private TalkSTTTRTC TRTC;

    /**
     * Get 当前仅支持 `trtc`（使用 TRTC 内置语音识别）。 
     * @return Type 当前仅支持 `trtc`（使用 TRTC 内置语音识别）。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 当前仅支持 `trtc`（使用 TRTC 内置语音识别）。
     * @param Type 当前仅支持 `trtc`（使用 TRTC 内置语音识别）。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get `Type=trtc` 时生效。整体省略表示全部使用 TRTC 默认值。 
     * @return TRTC `Type=trtc` 时生效。整体省略表示全部使用 TRTC 默认值。
     */
    public TalkSTTTRTC getTRTC() {
        return this.TRTC;
    }

    /**
     * Set `Type=trtc` 时生效。整体省略表示全部使用 TRTC 默认值。
     * @param TRTC `Type=trtc` 时生效。整体省略表示全部使用 TRTC 默认值。
     */
    public void setTRTC(TalkSTTTRTC TRTC) {
        this.TRTC = TRTC;
    }

    public TalkSTTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkSTTConfig(TalkSTTConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TRTC != null) {
            this.TRTC = new TalkSTTTRTC(source.TRTC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TRTC.", this.TRTC);

    }
}

