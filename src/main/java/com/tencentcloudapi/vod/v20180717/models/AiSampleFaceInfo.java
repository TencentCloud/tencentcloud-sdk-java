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

public class AiSampleFaceInfo extends AbstractModel{

    /**
    * 人脸图片 ID。
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 人脸图片地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 人脸图片 ID。 
     * @return FaceId 人脸图片 ID。
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸图片 ID。
     * @param FaceId 人脸图片 ID。
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 人脸图片地址。 
     * @return Url 人脸图片地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 人脸图片地址。
     * @param Url 人脸图片地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

