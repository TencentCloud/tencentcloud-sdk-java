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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceInfo extends AbstractModel {

    /**
    * 用户图 URL 列表
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * 模版图人脸坐标。
    */
    @SerializedName("TemplateFaceRect")
    @Expose
    private Rect TemplateFaceRect;

    /**
     * Get 用户图 URL 列表 
     * @return ImageUrls 用户图 URL 列表
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set 用户图 URL 列表
     * @param ImageUrls 用户图 URL 列表
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get 模版图人脸坐标。 
     * @return TemplateFaceRect 模版图人脸坐标。
     */
    public Rect getTemplateFaceRect() {
        return this.TemplateFaceRect;
    }

    /**
     * Set 模版图人脸坐标。
     * @param TemplateFaceRect 模版图人脸坐标。
     */
    public void setTemplateFaceRect(Rect TemplateFaceRect) {
        this.TemplateFaceRect = TemplateFaceRect;
    }

    public FaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceInfo(FaceInfo source) {
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.TemplateFaceRect != null) {
            this.TemplateFaceRect = new Rect(source.TemplateFaceRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamObj(map, prefix + "TemplateFaceRect.", this.TemplateFaceRect);

    }
}

