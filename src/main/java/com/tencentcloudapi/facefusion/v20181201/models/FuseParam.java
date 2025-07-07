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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseParam extends AbstractModel {

    /**
    * 图片编码参数
    */
    @SerializedName("ImageCodecParam")
    @Expose
    private ImageCodecParam ImageCodecParam;

    /**
     * Get 图片编码参数 
     * @return ImageCodecParam 图片编码参数
     */
    public ImageCodecParam getImageCodecParam() {
        return this.ImageCodecParam;
    }

    /**
     * Set 图片编码参数
     * @param ImageCodecParam 图片编码参数
     */
    public void setImageCodecParam(ImageCodecParam ImageCodecParam) {
        this.ImageCodecParam = ImageCodecParam;
    }

    public FuseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseParam(FuseParam source) {
        if (source.ImageCodecParam != null) {
            this.ImageCodecParam = new ImageCodecParam(source.ImageCodecParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageCodecParam.", this.ImageCodecParam);

    }
}

