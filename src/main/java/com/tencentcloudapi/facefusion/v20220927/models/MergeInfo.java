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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeInfo extends AbstractModel {

    /**
    * 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 输入图片url。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
    */
    @SerializedName("InputImageFaceRect")
    @Expose
    private FaceRect InputImageFaceRect;

    /**
    * 素材人脸ID，不填默认取最大人脸。
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
    * 模板中人脸位置信息(人脸框)，不填默认取最大人脸。此字段仅适用于图片融合自定义模板素材场景。
Width、Height >= 30。
    */
    @SerializedName("TemplateFaceRect")
    @Expose
    private FaceRect TemplateFaceRect;

    /**
     * Get 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png 
     * @return Image 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     * @param Image 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 输入图片url。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png 
     * @return Url 输入图片url。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 输入图片url。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     * @param Url 输入图片url。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●素材图片限制：图片中面部尺寸大于34 * 34；图片尺寸大于64 * 64。（图片编码之后可能会大30%左右，建议合理控制图片大小）。
●支持图片格式：支持jpg或png
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。 
     * @return InputImageFaceRect 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     */
    public FaceRect getInputImageFaceRect() {
        return this.InputImageFaceRect;
    }

    /**
     * Set 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     * @param InputImageFaceRect 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     */
    public void setInputImageFaceRect(FaceRect InputImageFaceRect) {
        this.InputImageFaceRect = InputImageFaceRect;
    }

    /**
     * Get 素材人脸ID，不填默认取最大人脸。 
     * @return TemplateFaceID 素材人脸ID，不填默认取最大人脸。
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set 素材人脸ID，不填默认取最大人脸。
     * @param TemplateFaceID 素材人脸ID，不填默认取最大人脸。
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
    }

    /**
     * Get 模板中人脸位置信息(人脸框)，不填默认取最大人脸。此字段仅适用于图片融合自定义模板素材场景。
Width、Height >= 30。 
     * @return TemplateFaceRect 模板中人脸位置信息(人脸框)，不填默认取最大人脸。此字段仅适用于图片融合自定义模板素材场景。
Width、Height >= 30。
     */
    public FaceRect getTemplateFaceRect() {
        return this.TemplateFaceRect;
    }

    /**
     * Set 模板中人脸位置信息(人脸框)，不填默认取最大人脸。此字段仅适用于图片融合自定义模板素材场景。
Width、Height >= 30。
     * @param TemplateFaceRect 模板中人脸位置信息(人脸框)，不填默认取最大人脸。此字段仅适用于图片融合自定义模板素材场景。
Width、Height >= 30。
     */
    public void setTemplateFaceRect(FaceRect TemplateFaceRect) {
        this.TemplateFaceRect = TemplateFaceRect;
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
        if (source.TemplateFaceRect != null) {
            this.TemplateFaceRect = new FaceRect(source.TemplateFaceRect);
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
        this.setParamObj(map, prefix + "TemplateFaceRect.", this.TemplateFaceRect);

    }
}

