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

public class SeeTaskFaceInfo extends AbstractModel {

    /**
    * 人脸裁剪图下载 URL，仅在请求 FileURLExpireTime 时返回
    */
    @SerializedName("CropImageURL")
    @Expose
    private String CropImageURL;

    /**
    * 人脸 ID
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 人员 ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人脸所在画面的毫秒级 UNIX 时间戳
    */
    @SerializedName("TimestampMs")
    @Expose
    private Long TimestampMs;

    /**
     * Get 人脸裁剪图下载 URL，仅在请求 FileURLExpireTime 时返回 
     * @return CropImageURL 人脸裁剪图下载 URL，仅在请求 FileURLExpireTime 时返回
     */
    public String getCropImageURL() {
        return this.CropImageURL;
    }

    /**
     * Set 人脸裁剪图下载 URL，仅在请求 FileURLExpireTime 时返回
     * @param CropImageURL 人脸裁剪图下载 URL，仅在请求 FileURLExpireTime 时返回
     */
    public void setCropImageURL(String CropImageURL) {
        this.CropImageURL = CropImageURL;
    }

    /**
     * Get 人脸 ID 
     * @return FaceId 人脸 ID
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸 ID
     * @param FaceId 人脸 ID
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 人员 ID 
     * @return PersonId 人员 ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员 ID
     * @param PersonId 人员 ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人脸所在画面的毫秒级 UNIX 时间戳 
     * @return TimestampMs 人脸所在画面的毫秒级 UNIX 时间戳
     */
    public Long getTimestampMs() {
        return this.TimestampMs;
    }

    /**
     * Set 人脸所在画面的毫秒级 UNIX 时间戳
     * @param TimestampMs 人脸所在画面的毫秒级 UNIX 时间戳
     */
    public void setTimestampMs(Long TimestampMs) {
        this.TimestampMs = TimestampMs;
    }

    public SeeTaskFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeTaskFaceInfo(SeeTaskFaceInfo source) {
        if (source.CropImageURL != null) {
            this.CropImageURL = new String(source.CropImageURL);
        }
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.TimestampMs != null) {
            this.TimestampMs = new Long(source.TimestampMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CropImageURL", this.CropImageURL);
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "TimestampMs", this.TimestampMs);

    }
}

