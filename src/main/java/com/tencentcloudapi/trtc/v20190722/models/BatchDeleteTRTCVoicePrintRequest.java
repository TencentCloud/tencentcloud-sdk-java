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

public class BatchDeleteTRTCVoicePrintRequest extends AbstractModel {

    /**
    * 待批量删除的声纹 ID 列表，最多 50 个；请求内自动去重；按 (AppId, SdkAppId, VoicePrintId) 做数据隔离
    */
    @SerializedName("VoicePrintIds")
    @Expose
    private String [] VoicePrintIds;

    /**
    * SdkappId
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
     * Get 待批量删除的声纹 ID 列表，最多 50 个；请求内自动去重；按 (AppId, SdkAppId, VoicePrintId) 做数据隔离 
     * @return VoicePrintIds 待批量删除的声纹 ID 列表，最多 50 个；请求内自动去重；按 (AppId, SdkAppId, VoicePrintId) 做数据隔离
     */
    public String [] getVoicePrintIds() {
        return this.VoicePrintIds;
    }

    /**
     * Set 待批量删除的声纹 ID 列表，最多 50 个；请求内自动去重；按 (AppId, SdkAppId, VoicePrintId) 做数据隔离
     * @param VoicePrintIds 待批量删除的声纹 ID 列表，最多 50 个；请求内自动去重；按 (AppId, SdkAppId, VoicePrintId) 做数据隔离
     */
    public void setVoicePrintIds(String [] VoicePrintIds) {
        this.VoicePrintIds = VoicePrintIds;
    }

    /**
     * Get SdkappId 
     * @return SdkAppId SdkappId
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkappId
     * @param SdkAppId SdkappId
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public BatchDeleteTRTCVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteTRTCVoicePrintRequest(BatchDeleteTRTCVoicePrintRequest source) {
        if (source.VoicePrintIds != null) {
            this.VoicePrintIds = new String[source.VoicePrintIds.length];
            for (int i = 0; i < source.VoicePrintIds.length; i++) {
                this.VoicePrintIds[i] = new String(source.VoicePrintIds[i]);
            }
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VoicePrintIds.", this.VoicePrintIds);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

