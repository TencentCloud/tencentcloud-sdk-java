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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVoicePrintRequest extends AbstractModel {

    /**
    * 声纹信息ID
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
     * Get 声纹信息ID 
     * @return VoicePrintId 声纹信息ID
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 声纹信息ID
     * @param VoicePrintId 声纹信息ID
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    public DeleteVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVoicePrintRequest(DeleteVoicePrintRequest source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);

    }
}

