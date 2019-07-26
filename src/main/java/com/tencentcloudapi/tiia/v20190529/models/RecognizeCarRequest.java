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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeCarRequest  extends AbstractModel{

    /**
    * 图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，支持PNG、JPG、JPEG、BMP格式，暂不支持GIF格式。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageUrl。

图片URL地址。支持的图片格式：PNG、JPG、JPEG、BMP，暂不支持GIF格式。支持的图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * 获取图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，支持PNG、JPG、JPEG、BMP格式，暂不支持GIF格式。
     * @return ImageBase64 图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，支持PNG、JPG、JPEG、BMP格式，暂不支持GIF格式。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * 设置图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，支持PNG、JPG、JPEG、BMP格式，暂不支持GIF格式。
     * @param ImageBase64 图片的BASE64值；
BASE64编码后的图片数据大小不超过3M，支持PNG、JPG、JPEG、BMP格式，暂不支持GIF格式。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * 获取图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageUrl。

图片URL地址。支持的图片格式：PNG、JPG、JPEG、BMP，暂不支持GIF格式。支持的图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。
     * @return ImageUrl 图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageUrl。

图片URL地址。支持的图片格式：PNG、JPG、JPEG、BMP，暂不支持GIF格式。支持的图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * 设置图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageUrl。

图片URL地址。支持的图片格式：PNG、JPG、JPEG、BMP，暂不支持GIF格式。支持的图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。
     * @param ImageUrl 图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageUrl。

图片URL地址。支持的图片格式：PNG、JPG、JPEG、BMP，暂不支持GIF格式。支持的图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

