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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateAvatarRequest extends AbstractModel {

    /**
    * 图像类型，默认为人像。
human：人像头像，仅支持人像图片输入，建议避免上传无人、多人、人像过小的图片。
pet：萌宠贴纸，仅支持动物图片输入，建议避免上传无动物、多动物、动物过小的图片。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 头像风格，仅在人像模式下生效。
若使用人像模式，请在  [百变头像风格列表](https://cloud.tencent.com/document/product/1668/107741) 中选择期望的风格，传入风格编号，不传默认使用 flower 风格。
若使用萌宠贴纸模式，无需选择风格，该参数不生效。
    */
    @SerializedName("Style")
    @Expose
    private String Style;

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
    * 输入人像图的质量检测开关，默认开启，仅在人像模式下生效。
1：开启
0：关闭
建议开启检测，可提升生成效果，关闭检测可能因输入图像质量较差导致生成效果受损。
开启后，将增强对输入图像的质量要求，如果输入图像单边分辨率<500、图像中人脸占比较小、存在多人、没有检测到人脸、人脸不完整、人脸遮挡等，将被拦截。
关闭后，将降低对输入图像的质量要求，如果图像中没有检测到人脸或人脸占比过小等，将被拦截。
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
    * 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
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
    * 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
     * Get 图像类型，默认为人像。
human：人像头像，仅支持人像图片输入，建议避免上传无人、多人、人像过小的图片。
pet：萌宠贴纸，仅支持动物图片输入，建议避免上传无动物、多动物、动物过小的图片。 
     * @return Type 图像类型，默认为人像。
human：人像头像，仅支持人像图片输入，建议避免上传无人、多人、人像过小的图片。
pet：萌宠贴纸，仅支持动物图片输入，建议避免上传无动物、多动物、动物过小的图片。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图像类型，默认为人像。
human：人像头像，仅支持人像图片输入，建议避免上传无人、多人、人像过小的图片。
pet：萌宠贴纸，仅支持动物图片输入，建议避免上传无动物、多动物、动物过小的图片。
     * @param Type 图像类型，默认为人像。
human：人像头像，仅支持人像图片输入，建议避免上传无人、多人、人像过小的图片。
pet：萌宠贴纸，仅支持动物图片输入，建议避免上传无动物、多动物、动物过小的图片。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 头像风格，仅在人像模式下生效。
若使用人像模式，请在  [百变头像风格列表](https://cloud.tencent.com/document/product/1668/107741) 中选择期望的风格，传入风格编号，不传默认使用 flower 风格。
若使用萌宠贴纸模式，无需选择风格，该参数不生效。 
     * @return Style 头像风格，仅在人像模式下生效。
若使用人像模式，请在  [百变头像风格列表](https://cloud.tencent.com/document/product/1668/107741) 中选择期望的风格，传入风格编号，不传默认使用 flower 风格。
若使用萌宠贴纸模式，无需选择风格，该参数不生效。
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 头像风格，仅在人像模式下生效。
若使用人像模式，请在  [百变头像风格列表](https://cloud.tencent.com/document/product/1668/107741) 中选择期望的风格，传入风格编号，不传默认使用 flower 风格。
若使用萌宠贴纸模式，无需选择风格，该参数不生效。
     * @param Style 头像风格，仅在人像模式下生效。
若使用人像模式，请在  [百变头像风格列表](https://cloud.tencent.com/document/product/1668/107741) 中选择期望的风格，传入风格编号，不传默认使用 flower 风格。
若使用萌宠贴纸模式，无需选择风格，该参数不生效。
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

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
     * Get 输入人像图的质量检测开关，默认开启，仅在人像模式下生效。
1：开启
0：关闭
建议开启检测，可提升生成效果，关闭检测可能因输入图像质量较差导致生成效果受损。
开启后，将增强对输入图像的质量要求，如果输入图像单边分辨率<500、图像中人脸占比较小、存在多人、没有检测到人脸、人脸不完整、人脸遮挡等，将被拦截。
关闭后，将降低对输入图像的质量要求，如果图像中没有检测到人脸或人脸占比过小等，将被拦截。 
     * @return Filter 输入人像图的质量检测开关，默认开启，仅在人像模式下生效。
1：开启
0：关闭
建议开启检测，可提升生成效果，关闭检测可能因输入图像质量较差导致生成效果受损。
开启后，将增强对输入图像的质量要求，如果输入图像单边分辨率<500、图像中人脸占比较小、存在多人、没有检测到人脸、人脸不完整、人脸遮挡等，将被拦截。
关闭后，将降低对输入图像的质量要求，如果图像中没有检测到人脸或人脸占比过小等，将被拦截。
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 输入人像图的质量检测开关，默认开启，仅在人像模式下生效。
1：开启
0：关闭
建议开启检测，可提升生成效果，关闭检测可能因输入图像质量较差导致生成效果受损。
开启后，将增强对输入图像的质量要求，如果输入图像单边分辨率<500、图像中人脸占比较小、存在多人、没有检测到人脸、人脸不完整、人脸遮挡等，将被拦截。
关闭后，将降低对输入图像的质量要求，如果图像中没有检测到人脸或人脸占比过小等，将被拦截。
     * @param Filter 输入人像图的质量检测开关，默认开启，仅在人像模式下生效。
1：开启
0：关闭
建议开启检测，可提升生成效果，关闭检测可能因输入图像质量较差导致生成效果受损。
开启后，将增强对输入图像的质量要求，如果输入图像单边分辨率<500、图像中人脸占比较小、存在多人、没有检测到人脸、人脸不完整、人脸遮挡等，将被拦截。
关闭后，将降低对输入图像的质量要求，如果图像中没有检测到人脸或人脸占比过小等，将被拦截。
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。 
     * @return LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
     * @param LogoAdd 为生成结果图添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示结果图是 AI 生成的图片。
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

    public GenerateAvatarRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateAvatarRequest(GenerateAvatarRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.InputImage != null) {
            this.InputImage = new String(source.InputImage);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "InputImage", this.InputImage);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);

    }
}

