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

public class ImageInpaintingRemovalRequest extends AbstractModel {

    /**
    * 输入图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("InputImage")
    @Expose
    private String InputImage;

    /**
    * 输入图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * 消除区域 Mask 图 Base64 数据。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
    */
    @SerializedName("Mask")
    @Expose
    private String Mask;

    /**
    * 消除区域 Mask 图 Url。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
    */
    @SerializedName("MaskUrl")
    @Expose
    private String MaskUrl;

    /**
    * 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get 输入图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return InputImage 输入图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getInputImage() {
        return this.InputImage;
    }

    /**
     * Set 输入图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param InputImage 输入图 Base64 数据。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setInputImage(String InputImage) {
        this.InputImage = InputImage;
    }

    /**
     * Get 输入图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return InputUrl 输入图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set 输入图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param InputUrl 输入图 Url。
Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get 消除区域 Mask 图 Base64 数据。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。 
     * @return Mask 消除区域 Mask 图 Base64 数据。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     */
    public String getMask() {
        return this.Mask;
    }

    /**
     * Set 消除区域 Mask 图 Base64 数据。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     * @param Mask 消除区域 Mask 图 Base64 数据。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     */
    public void setMask(String Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 消除区域 Mask 图 Url。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。 
     * @return MaskUrl 消除区域 Mask 图 Url。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     */
    public String getMaskUrl() {
        return this.MaskUrl;
    }

    /**
     * Set 消除区域 Mask 图 Url。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     * @param MaskUrl 消除区域 Mask 图 Url。
Mask 为单通道灰度图，待消除部分呈白色区域，原图保持部分呈黑色区域。
Mask 的 Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
图片限制：Mask 分辨率需要和输入原图保持一致，转成 Base64 字符串后小于 6MB。
     */
    public void setMaskUrl(String MaskUrl) {
        this.MaskUrl = MaskUrl;
    }

    /**
     * Get 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。 
     * @return RspImgType 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
     * @param RspImgType 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * Get 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。 
     * @return LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
     * @param LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。 
     * @return LogoParam 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     * @param LogoParam 标识内容设置。
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public ImageInpaintingRemovalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInpaintingRemovalRequest(ImageInpaintingRemovalRequest source) {
        if (source.InputImage != null) {
            this.InputImage = new String(source.InputImage);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Mask != null) {
            this.Mask = new String(source.Mask);
        }
        if (source.MaskUrl != null) {
            this.MaskUrl = new String(source.MaskUrl);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputImage", this.InputImage);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "MaskUrl", this.MaskUrl);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

