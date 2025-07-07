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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrint extends AbstractModel {

    /**
    * 默认为0，表示不启用声纹。1表示启用声纹，此时需要填写voiceprint id。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * VoicePrint Mode为1时需要填写，目前仅支持填写一个声纹id
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
     * Get 默认为0，表示不启用声纹。1表示启用声纹，此时需要填写voiceprint id。 
     * @return Mode 默认为0，表示不启用声纹。1表示启用声纹，此时需要填写voiceprint id。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 默认为0，表示不启用声纹。1表示启用声纹，此时需要填写voiceprint id。
     * @param Mode 默认为0，表示不启用声纹。1表示启用声纹，此时需要填写voiceprint id。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get VoicePrint Mode为1时需要填写，目前仅支持填写一个声纹id 
     * @return IdList VoicePrint Mode为1时需要填写，目前仅支持填写一个声纹id
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set VoicePrint Mode为1时需要填写，目前仅支持填写一个声纹id
     * @param IdList VoicePrint Mode为1时需要填写，目前仅支持填写一个声纹id
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    public VoicePrint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrint(VoicePrint source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

