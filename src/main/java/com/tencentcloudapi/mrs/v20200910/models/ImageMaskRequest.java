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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageMaskRequest extends AbstractModel {

    /**
    * 图片信息,目前只支持传图片base64
    */
    @SerializedName("Image")
    @Expose
    private ImageInfo Image;

    /**
    * 图片脱敏选项, 不传默认都脱敏
    */
    @SerializedName("MaskFlag")
    @Expose
    private ImageMaskFlags MaskFlag;

    /**
    * 是否自动矫正图片方向
    */
    @SerializedName("AutoFixImageDirection")
    @Expose
    private Boolean AutoFixImageDirection;

    /**
     * Get 图片信息,目前只支持传图片base64 
     * @return Image 图片信息,目前只支持传图片base64
     */
    public ImageInfo getImage() {
        return this.Image;
    }

    /**
     * Set 图片信息,目前只支持传图片base64
     * @param Image 图片信息,目前只支持传图片base64
     */
    public void setImage(ImageInfo Image) {
        this.Image = Image;
    }

    /**
     * Get 图片脱敏选项, 不传默认都脱敏 
     * @return MaskFlag 图片脱敏选项, 不传默认都脱敏
     */
    public ImageMaskFlags getMaskFlag() {
        return this.MaskFlag;
    }

    /**
     * Set 图片脱敏选项, 不传默认都脱敏
     * @param MaskFlag 图片脱敏选项, 不传默认都脱敏
     */
    public void setMaskFlag(ImageMaskFlags MaskFlag) {
        this.MaskFlag = MaskFlag;
    }

    /**
     * Get 是否自动矫正图片方向 
     * @return AutoFixImageDirection 是否自动矫正图片方向
     */
    public Boolean getAutoFixImageDirection() {
        return this.AutoFixImageDirection;
    }

    /**
     * Set 是否自动矫正图片方向
     * @param AutoFixImageDirection 是否自动矫正图片方向
     */
    public void setAutoFixImageDirection(Boolean AutoFixImageDirection) {
        this.AutoFixImageDirection = AutoFixImageDirection;
    }

    public ImageMaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMaskRequest(ImageMaskRequest source) {
        if (source.Image != null) {
            this.Image = new ImageInfo(source.Image);
        }
        if (source.MaskFlag != null) {
            this.MaskFlag = new ImageMaskFlags(source.MaskFlag);
        }
        if (source.AutoFixImageDirection != null) {
            this.AutoFixImageDirection = new Boolean(source.AutoFixImageDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "MaskFlag.", this.MaskFlag);
        this.setParamSimple(map, prefix + "AutoFixImageDirection", this.AutoFixImageDirection);

    }
}

