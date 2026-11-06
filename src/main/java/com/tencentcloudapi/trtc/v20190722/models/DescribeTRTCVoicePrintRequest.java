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

public class DescribeTRTCVoicePrintRequest extends AbstractModel {

    /**
    * SdkappId
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 分页起始偏移，0 或不传表示从第一条开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量，默认 20，最大 100；超过最大值会被截断到 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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

    /**
     * Get 分页起始偏移，0 或不传表示从第一条开始 
     * @return Offset 分页起始偏移，0 或不传表示从第一条开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始偏移，0 或不传表示从第一条开始
     * @param Offset 分页起始偏移，0 或不传表示从第一条开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量，默认 20，最大 100；超过最大值会被截断到 100 
     * @return Limit 每页返回数量，默认 20，最大 100；超过最大值会被截断到 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量，默认 20，最大 100；超过最大值会被截断到 100
     * @param Limit 每页返回数量，默认 20，最大 100；超过最大值会被截断到 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTRTCVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCVoicePrintRequest(DescribeTRTCVoicePrintRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

