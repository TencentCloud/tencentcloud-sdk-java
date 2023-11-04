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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeInfo extends AbstractModel {

    /**
    * 输入图片base64。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 输入图片url。
Url、Image必须提供一个，如果都提供，只使用 Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 输入图片人脸位置信息（人脸框）。不填默认取输入图中最大人脸。
    */
    @SerializedName("InputImageFaceRect")
    @Expose
    private FaceRect InputImageFaceRect;

    /**
    * 素材人脸ID，不填默认取素材中最大人脸。
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
     * Get 输入图片base64。 
     * @return Image 输入图片base64。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 输入图片base64。
     * @param Image 输入图片base64。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 输入图片url。
Url、Image必须提供一个，如果都提供，只使用 Url。 
     * @return Url 输入图片url。
Url、Image必须提供一个，如果都提供，只使用 Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 输入图片url。
Url、Image必须提供一个，如果都提供，只使用 Url。
     * @param Url 输入图片url。
Url、Image必须提供一个，如果都提供，只使用 Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 输入图片人脸位置信息（人脸框）。不填默认取输入图中最大人脸。 
     * @return InputImageFaceRect 输入图片人脸位置信息（人脸框）。不填默认取输入图中最大人脸。
     */
    public FaceRect getInputImageFaceRect() {
        return this.InputImageFaceRect;
    }

    /**
     * Set 输入图片人脸位置信息（人脸框）。不填默认取输入图中最大人脸。
     * @param InputImageFaceRect 输入图片人脸位置信息（人脸框）。不填默认取输入图中最大人脸。
     */
    public void setInputImageFaceRect(FaceRect InputImageFaceRect) {
        this.InputImageFaceRect = InputImageFaceRect;
    }

    /**
     * Get 素材人脸ID，不填默认取素材中最大人脸。 
     * @return TemplateFaceID 素材人脸ID，不填默认取素材中最大人脸。
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set 素材人脸ID，不填默认取素材中最大人脸。
     * @param TemplateFaceID 素材人脸ID，不填默认取素材中最大人脸。
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
    }

    public MergeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeInfo(MergeInfo source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.InputImageFaceRect != null) {
            this.InputImageFaceRect = new FaceRect(source.InputImageFaceRect);
        }
        if (source.TemplateFaceID != null) {
            this.TemplateFaceID = new String(source.TemplateFaceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "InputImageFaceRect.", this.InputImageFaceRect);
        this.setParamSimple(map, prefix + "TemplateFaceID", this.TemplateFaceID);

    }
}

