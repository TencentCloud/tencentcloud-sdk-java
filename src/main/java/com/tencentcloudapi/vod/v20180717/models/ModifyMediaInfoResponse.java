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

public class ModifyMediaInfoResponse extends AbstractModel {

    /**
    * 新的视频封面 URL。
* 注意：仅当请求携带 CoverData 时此返回值有效。 *
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 新增的字幕信息。
    */
    @SerializedName("AddedSubtitleSet")
    @Expose
    private MediaSubtitleItem [] AddedSubtitleSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 新的视频封面 URL。
* 注意：仅当请求携带 CoverData 时此返回值有效。 * 
     * @return CoverUrl 新的视频封面 URL。
* 注意：仅当请求携带 CoverData 时此返回值有效。 *
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 新的视频封面 URL。
* 注意：仅当请求携带 CoverData 时此返回值有效。 *
     * @param CoverUrl 新的视频封面 URL。
* 注意：仅当请求携带 CoverData 时此返回值有效。 *
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 新增的字幕信息。 
     * @return AddedSubtitleSet 新增的字幕信息。
     */
    public MediaSubtitleItem [] getAddedSubtitleSet() {
        return this.AddedSubtitleSet;
    }

    /**
     * Set 新增的字幕信息。
     * @param AddedSubtitleSet 新增的字幕信息。
     */
    public void setAddedSubtitleSet(MediaSubtitleItem [] AddedSubtitleSet) {
        this.AddedSubtitleSet = AddedSubtitleSet;
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

    public ModifyMediaInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaInfoResponse(ModifyMediaInfoResponse source) {
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.AddedSubtitleSet != null) {
            this.AddedSubtitleSet = new MediaSubtitleItem[source.AddedSubtitleSet.length];
            for (int i = 0; i < source.AddedSubtitleSet.length; i++) {
                this.AddedSubtitleSet[i] = new MediaSubtitleItem(source.AddedSubtitleSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamArrayObj(map, prefix + "AddedSubtitleSet.", this.AddedSubtitleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

