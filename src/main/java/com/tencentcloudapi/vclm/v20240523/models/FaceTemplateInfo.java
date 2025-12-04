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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceTemplateInfo extends AbstractModel {

    /**
    * 角色ID。需要与MergeInfos中的TemplateFaceID依次对应。需要填数字，建议填"0"、"1"，依次累加。
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
    * 视频模板中要替换的人脸图片
    */
    @SerializedName("TemplateFaceImage")
    @Expose
    private Image TemplateFaceImage;

    /**
    * 视频模板中要替换的人脸图片的人脸框。不填默认取要替换的人脸图片中最大人脸。
    */
    @SerializedName("TemplateFaceRect")
    @Expose
    private FaceRect TemplateFaceRect;

    /**
     * Get 角色ID。需要与MergeInfos中的TemplateFaceID依次对应。需要填数字，建议填"0"、"1"，依次累加。 
     * @return TemplateFaceID 角色ID。需要与MergeInfos中的TemplateFaceID依次对应。需要填数字，建议填"0"、"1"，依次累加。
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set 角色ID。需要与MergeInfos中的TemplateFaceID依次对应。需要填数字，建议填"0"、"1"，依次累加。
     * @param TemplateFaceID 角色ID。需要与MergeInfos中的TemplateFaceID依次对应。需要填数字，建议填"0"、"1"，依次累加。
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
    }

    /**
     * Get 视频模板中要替换的人脸图片 
     * @return TemplateFaceImage 视频模板中要替换的人脸图片
     */
    public Image getTemplateFaceImage() {
        return this.TemplateFaceImage;
    }

    /**
     * Set 视频模板中要替换的人脸图片
     * @param TemplateFaceImage 视频模板中要替换的人脸图片
     */
    public void setTemplateFaceImage(Image TemplateFaceImage) {
        this.TemplateFaceImage = TemplateFaceImage;
    }

    /**
     * Get 视频模板中要替换的人脸图片的人脸框。不填默认取要替换的人脸图片中最大人脸。 
     * @return TemplateFaceRect 视频模板中要替换的人脸图片的人脸框。不填默认取要替换的人脸图片中最大人脸。
     */
    public FaceRect getTemplateFaceRect() {
        return this.TemplateFaceRect;
    }

    /**
     * Set 视频模板中要替换的人脸图片的人脸框。不填默认取要替换的人脸图片中最大人脸。
     * @param TemplateFaceRect 视频模板中要替换的人脸图片的人脸框。不填默认取要替换的人脸图片中最大人脸。
     */
    public void setTemplateFaceRect(FaceRect TemplateFaceRect) {
        this.TemplateFaceRect = TemplateFaceRect;
    }

    public FaceTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceTemplateInfo(FaceTemplateInfo source) {
        if (source.TemplateFaceID != null) {
            this.TemplateFaceID = new String(source.TemplateFaceID);
        }
        if (source.TemplateFaceImage != null) {
            this.TemplateFaceImage = new Image(source.TemplateFaceImage);
        }
        if (source.TemplateFaceRect != null) {
            this.TemplateFaceRect = new FaceRect(source.TemplateFaceRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateFaceID", this.TemplateFaceID);
        this.setParamObj(map, prefix + "TemplateFaceImage.", this.TemplateFaceImage);
        this.setParamObj(map, prefix + "TemplateFaceRect.", this.TemplateFaceRect);

    }
}

