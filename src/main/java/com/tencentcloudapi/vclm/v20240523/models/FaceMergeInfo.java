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

public class FaceMergeInfo extends AbstractModel {

    /**
    * 融合图片
    */
    @SerializedName("MergeFaceImage")
    @Expose
    private Image MergeFaceImage;

    /**
    * 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
    */
    @SerializedName("MergeFaceRect")
    @Expose
    private FaceRect MergeFaceRect;

    /**
    * 素材人脸ID，不填默认取上传图片中最大人脸。
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
     * Get 融合图片 
     * @return MergeFaceImage 融合图片
     */
    public Image getMergeFaceImage() {
        return this.MergeFaceImage;
    }

    /**
     * Set 融合图片
     * @param MergeFaceImage 融合图片
     */
    public void setMergeFaceImage(Image MergeFaceImage) {
        this.MergeFaceImage = MergeFaceImage;
    }

    /**
     * Get 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。 
     * @return MergeFaceRect 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     */
    public FaceRect getMergeFaceRect() {
        return this.MergeFaceRect;
    }

    /**
     * Set 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     * @param MergeFaceRect 上传的图片人脸位置信息（人脸框）
Width、Height >= 30。
     */
    public void setMergeFaceRect(FaceRect MergeFaceRect) {
        this.MergeFaceRect = MergeFaceRect;
    }

    /**
     * Get 素材人脸ID，不填默认取上传图片中最大人脸。 
     * @return TemplateFaceID 素材人脸ID，不填默认取上传图片中最大人脸。
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set 素材人脸ID，不填默认取上传图片中最大人脸。
     * @param TemplateFaceID 素材人脸ID，不填默认取上传图片中最大人脸。
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
    }

    public FaceMergeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceMergeInfo(FaceMergeInfo source) {
        if (source.MergeFaceImage != null) {
            this.MergeFaceImage = new Image(source.MergeFaceImage);
        }
        if (source.MergeFaceRect != null) {
            this.MergeFaceRect = new FaceRect(source.MergeFaceRect);
        }
        if (source.TemplateFaceID != null) {
            this.TemplateFaceID = new String(source.TemplateFaceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MergeFaceImage.", this.MergeFaceImage);
        this.setParamObj(map, prefix + "MergeFaceRect.", this.MergeFaceRect);
        this.setParamSimple(map, prefix + "TemplateFaceID", this.TemplateFaceID);

    }
}

