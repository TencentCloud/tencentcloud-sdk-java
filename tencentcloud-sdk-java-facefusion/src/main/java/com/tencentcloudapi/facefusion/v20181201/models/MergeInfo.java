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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeInfo extends AbstractModel{

    /**
    * 输入图片base64
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 输入图片url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 上传的图片人脸位置信息（人脸框）
    */
    @SerializedName("InputImageFaceRect")
    @Expose
    private FaceRect InputImageFaceRect;

    /**
    * 控制台上传的素材人脸ID
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
     * Get 输入图片base64 
     * @return Image 输入图片base64
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 输入图片base64
     * @param Image 输入图片base64
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 输入图片url 
     * @return Url 输入图片url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 输入图片url
     * @param Url 输入图片url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 上传的图片人脸位置信息（人脸框） 
     * @return InputImageFaceRect 上传的图片人脸位置信息（人脸框）
     */
    public FaceRect getInputImageFaceRect() {
        return this.InputImageFaceRect;
    }

    /**
     * Set 上传的图片人脸位置信息（人脸框）
     * @param InputImageFaceRect 上传的图片人脸位置信息（人脸框）
     */
    public void setInputImageFaceRect(FaceRect InputImageFaceRect) {
        this.InputImageFaceRect = InputImageFaceRect;
    }

    /**
     * Get 控制台上传的素材人脸ID 
     * @return TemplateFaceID 控制台上传的素材人脸ID
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set 控制台上传的素材人脸ID
     * @param TemplateFaceID 控制台上传的素材人脸ID
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
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

