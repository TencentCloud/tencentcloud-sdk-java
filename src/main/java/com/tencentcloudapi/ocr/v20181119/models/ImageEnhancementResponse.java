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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEnhancementResponse extends AbstractModel{

    /**
    * 图片数据标识：
“origin”：原图
“preprocess”:预处理后的图
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 图片数据，返回预处理后图像或原图像base64字符
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片数据标识：
“origin”：原图
“preprocess”:预处理后的图 
     * @return ImageTag 图片数据标识：
“origin”：原图
“preprocess”:预处理后的图
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 图片数据标识：
“origin”：原图
“preprocess”:预处理后的图
     * @param ImageTag 图片数据标识：
“origin”：原图
“preprocess”:预处理后的图
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 图片数据，返回预处理后图像或原图像base64字符 
     * @return Image 图片数据，返回预处理后图像或原图像base64字符
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片数据，返回预处理后图像或原图像base64字符
     * @param Image 图片数据，返回预处理后图像或原图像base64字符
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ImageEnhancementResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEnhancementResponse(ImageEnhancementResponse source) {
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

