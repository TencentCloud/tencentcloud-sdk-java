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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrderAndDownloadsRequest extends AbstractModel{

    /**
    * ImageId必填，单张购买，所有必填，会员身份可以省略部分参数
    */
    @SerializedName("ImageInfos")
    @Expose
    private ImageInfo [] ImageInfos;

    /**
     * Get ImageId必填，单张购买，所有必填，会员身份可以省略部分参数 
     * @return ImageInfos ImageId必填，单张购买，所有必填，会员身份可以省略部分参数
     */
    public ImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set ImageId必填，单张购买，所有必填，会员身份可以省略部分参数
     * @param ImageInfos ImageId必填，单张购买，所有必填，会员身份可以省略部分参数
     */
    public void setImageInfos(ImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    public CreateOrderAndDownloadsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderAndDownloadsRequest(CreateOrderAndDownloadsRequest source) {
        if (source.ImageInfos != null) {
            this.ImageInfos = new ImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new ImageInfo(source.ImageInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);

    }
}

