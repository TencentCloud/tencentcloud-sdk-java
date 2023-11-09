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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateTDRMKeyRequest extends AbstractModel {

    /**
    * 使用的DRM方案类型，接口取值 NORMALAES 。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 加密的track列表，接口取值 SD 。
    */
    @SerializedName("Tracks")
    @Expose
    private String [] Tracks;

    /**
    * 一个加密内容的唯一标识。
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 内容类型。接口取值 LiveVideo 。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
     * Get 使用的DRM方案类型，接口取值 NORMALAES 。 
     * @return DrmType 使用的DRM方案类型，接口取值 NORMALAES 。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 使用的DRM方案类型，接口取值 NORMALAES 。
     * @param DrmType 使用的DRM方案类型，接口取值 NORMALAES 。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get 加密的track列表，接口取值 SD 。 
     * @return Tracks 加密的track列表，接口取值 SD 。
     */
    public String [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 加密的track列表，接口取值 SD 。
     * @param Tracks 加密的track列表，接口取值 SD 。
     */
    public void setTracks(String [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get 一个加密内容的唯一标识。 
     * @return ContentId 一个加密内容的唯一标识。
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 一个加密内容的唯一标识。
     * @param ContentId 一个加密内容的唯一标识。
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 内容类型。接口取值 LiveVideo 。 
     * @return ContentType 内容类型。接口取值 LiveVideo 。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容类型。接口取值 LiveVideo 。
     * @param ContentType 内容类型。接口取值 LiveVideo 。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    public GenerateTDRMKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateTDRMKeyRequest(GenerateTDRMKeyRequest source) {
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Tracks != null) {
            this.Tracks = new String[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new String(source.Tracks[i]);
            }
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamArraySimple(map, prefix + "Tracks.", this.Tracks);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

