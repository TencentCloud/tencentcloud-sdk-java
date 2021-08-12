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

public class MediaReplacementInfo extends AbstractModel{

    /**
    * 替换的媒体类型，取值有：
<li>CMEMaterialId：替换的媒体类型为媒体 ID；</li>
<li>ImageUrl：替换的媒体类型为图片 URL；</li>

注：默认为 CMEMaterialId 。
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * 媒体 ID。
当媒体类型取值为 CMEMaterialId 时有效。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 媒体 URL。
当媒体类型取值为 ImageUrl 时有效，
图片仅支持 jpg、png 格式，且大小不超过 2M 。
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * 替换媒体选取的开始时间，单位为秒，默认为 0。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 预处理操作。
注：目前该功能暂不支持，请勿使用。
    */
    @SerializedName("PreprocessOperation")
    @Expose
    private MediaPreprocessOperation PreprocessOperation;

    /**
     * Get 替换的媒体类型，取值有：
<li>CMEMaterialId：替换的媒体类型为媒体 ID；</li>
<li>ImageUrl：替换的媒体类型为图片 URL；</li>

注：默认为 CMEMaterialId 。 
     * @return MediaType 替换的媒体类型，取值有：
<li>CMEMaterialId：替换的媒体类型为媒体 ID；</li>
<li>ImageUrl：替换的媒体类型为图片 URL；</li>

注：默认为 CMEMaterialId 。
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set 替换的媒体类型，取值有：
<li>CMEMaterialId：替换的媒体类型为媒体 ID；</li>
<li>ImageUrl：替换的媒体类型为图片 URL；</li>

注：默认为 CMEMaterialId 。
     * @param MediaType 替换的媒体类型，取值有：
<li>CMEMaterialId：替换的媒体类型为媒体 ID；</li>
<li>ImageUrl：替换的媒体类型为图片 URL；</li>

注：默认为 CMEMaterialId 。
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get 媒体 ID。
当媒体类型取值为 CMEMaterialId 时有效。 
     * @return MaterialId 媒体 ID。
当媒体类型取值为 CMEMaterialId 时有效。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 媒体 ID。
当媒体类型取值为 CMEMaterialId 时有效。
     * @param MaterialId 媒体 ID。
当媒体类型取值为 CMEMaterialId 时有效。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 媒体 URL。
当媒体类型取值为 ImageUrl 时有效，
图片仅支持 jpg、png 格式，且大小不超过 2M 。 
     * @return MediaUrl 媒体 URL。
当媒体类型取值为 ImageUrl 时有效，
图片仅支持 jpg、png 格式，且大小不超过 2M 。
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set 媒体 URL。
当媒体类型取值为 ImageUrl 时有效，
图片仅支持 jpg、png 格式，且大小不超过 2M 。
     * @param MediaUrl 媒体 URL。
当媒体类型取值为 ImageUrl 时有效，
图片仅支持 jpg、png 格式，且大小不超过 2M 。
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get 替换媒体选取的开始时间，单位为秒，默认为 0。 
     * @return StartTimeOffset 替换媒体选取的开始时间，单位为秒，默认为 0。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 替换媒体选取的开始时间，单位为秒，默认为 0。
     * @param StartTimeOffset 替换媒体选取的开始时间，单位为秒，默认为 0。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 预处理操作。
注：目前该功能暂不支持，请勿使用。 
     * @return PreprocessOperation 预处理操作。
注：目前该功能暂不支持，请勿使用。
     */
    public MediaPreprocessOperation getPreprocessOperation() {
        return this.PreprocessOperation;
    }

    /**
     * Set 预处理操作。
注：目前该功能暂不支持，请勿使用。
     * @param PreprocessOperation 预处理操作。
注：目前该功能暂不支持，请勿使用。
     */
    public void setPreprocessOperation(MediaPreprocessOperation PreprocessOperation) {
        this.PreprocessOperation = PreprocessOperation;
    }

    public MediaReplacementInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaReplacementInfo(MediaReplacementInfo source) {
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.MediaUrl != null) {
            this.MediaUrl = new String(source.MediaUrl);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.PreprocessOperation != null) {
            this.PreprocessOperation = new MediaPreprocessOperation(source.PreprocessOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamObj(map, prefix + "PreprocessOperation.", this.PreprocessOperation);

    }
}

