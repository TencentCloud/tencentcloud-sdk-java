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

public class SubmitGlamPicJobRequest extends AbstractModel {

    /**
    * 美照模板图 URL。
图片限制：模板图中最多出现5张人脸，单边分辨率大于300，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("TemplateUrl")
    @Expose
    private String TemplateUrl;

    /**
    * 用户图 URL 列表，以及模板图中需要替换成用户的人脸框信息。
一张美照中可包含1 ~ 5个用户形象。每个用户需上传1 ~ 6张照片，仅支持单人照。
模板图中的人脸数量需要大于等于用户个数。如果不传每个用户在模板图中的人脸框位置，默认按照模板图人脸框从大到小的顺序进行替换。如需自定义顺序，需要依次上传每个用户在模板图中的人脸框位置。
图片限制：每张图片转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的用户图。
    */
    @SerializedName("FaceInfos")
    @Expose
    private FaceInfo [] FaceInfos;

    /**
    * 美照生成数量。
支持1 ~ 4张，默认生成4张。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 美照生成风格。
仅对单人美照生效，单人可支持选择不同风格。需按照美照生成数量，在数组中逐一填入每张美照的风格名称。如果不传，默认取不重复的随机风格顺序。
多人美照只支持 balanced 一种风格，该参数不生效。
可选风格：<ul><li>real：面部相似度更高。</li><li>balanced：平衡面部真实感和美观度。</li><li>textured：脸部皮肤更具真实感。</li><li>beautiful：脸部美观度更高。</li></ul>
    */
    @SerializedName("Style")
    @Expose
    private String [] Style;

    /**
    * 相似度系数，越高越像用户图。
取值范围[0, 1]，默认为0.6。
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 超分选项，默认不做超分，可选开启。
x2：2倍超分
x4：4倍超分
    */
    @SerializedName("Clarity")
    @Expose
    private String Clarity;

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
     * Get 美照模板图 URL。
图片限制：模板图中最多出现5张人脸，单边分辨率大于300，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return TemplateUrl 美照模板图 URL。
图片限制：模板图中最多出现5张人脸，单边分辨率大于300，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getTemplateUrl() {
        return this.TemplateUrl;
    }

    /**
     * Set 美照模板图 URL。
图片限制：模板图中最多出现5张人脸，单边分辨率大于300，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param TemplateUrl 美照模板图 URL。
图片限制：模板图中最多出现5张人脸，单边分辨率大于300，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setTemplateUrl(String TemplateUrl) {
        this.TemplateUrl = TemplateUrl;
    }

    /**
     * Get 用户图 URL 列表，以及模板图中需要替换成用户的人脸框信息。
一张美照中可包含1 ~ 5个用户形象。每个用户需上传1 ~ 6张照片，仅支持单人照。
模板图中的人脸数量需要大于等于用户个数。如果不传每个用户在模板图中的人脸框位置，默认按照模板图人脸框从大到小的顺序进行替换。如需自定义顺序，需要依次上传每个用户在模板图中的人脸框位置。
图片限制：每张图片转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的用户图。 
     * @return FaceInfos 用户图 URL 列表，以及模板图中需要替换成用户的人脸框信息。
一张美照中可包含1 ~ 5个用户形象。每个用户需上传1 ~ 6张照片，仅支持单人照。
模板图中的人脸数量需要大于等于用户个数。如果不传每个用户在模板图中的人脸框位置，默认按照模板图人脸框从大到小的顺序进行替换。如需自定义顺序，需要依次上传每个用户在模板图中的人脸框位置。
图片限制：每张图片转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的用户图。
     */
    public FaceInfo [] getFaceInfos() {
        return this.FaceInfos;
    }

    /**
     * Set 用户图 URL 列表，以及模板图中需要替换成用户的人脸框信息。
一张美照中可包含1 ~ 5个用户形象。每个用户需上传1 ~ 6张照片，仅支持单人照。
模板图中的人脸数量需要大于等于用户个数。如果不传每个用户在模板图中的人脸框位置，默认按照模板图人脸框从大到小的顺序进行替换。如需自定义顺序，需要依次上传每个用户在模板图中的人脸框位置。
图片限制：每张图片转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的用户图。
     * @param FaceInfos 用户图 URL 列表，以及模板图中需要替换成用户的人脸框信息。
一张美照中可包含1 ~ 5个用户形象。每个用户需上传1 ~ 6张照片，仅支持单人照。
模板图中的人脸数量需要大于等于用户个数。如果不传每个用户在模板图中的人脸框位置，默认按照模板图人脸框从大到小的顺序进行替换。如需自定义顺序，需要依次上传每个用户在模板图中的人脸框位置。
图片限制：每张图片转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的用户图。
     */
    public void setFaceInfos(FaceInfo [] FaceInfos) {
        this.FaceInfos = FaceInfos;
    }

    /**
     * Get 美照生成数量。
支持1 ~ 4张，默认生成4张。 
     * @return Num 美照生成数量。
支持1 ~ 4张，默认生成4张。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 美照生成数量。
支持1 ~ 4张，默认生成4张。
     * @param Num 美照生成数量。
支持1 ~ 4张，默认生成4张。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 美照生成风格。
仅对单人美照生效，单人可支持选择不同风格。需按照美照生成数量，在数组中逐一填入每张美照的风格名称。如果不传，默认取不重复的随机风格顺序。
多人美照只支持 balanced 一种风格，该参数不生效。
可选风格：<ul><li>real：面部相似度更高。</li><li>balanced：平衡面部真实感和美观度。</li><li>textured：脸部皮肤更具真实感。</li><li>beautiful：脸部美观度更高。</li></ul> 
     * @return Style 美照生成风格。
仅对单人美照生效，单人可支持选择不同风格。需按照美照生成数量，在数组中逐一填入每张美照的风格名称。如果不传，默认取不重复的随机风格顺序。
多人美照只支持 balanced 一种风格，该参数不生效。
可选风格：<ul><li>real：面部相似度更高。</li><li>balanced：平衡面部真实感和美观度。</li><li>textured：脸部皮肤更具真实感。</li><li>beautiful：脸部美观度更高。</li></ul>
     */
    public String [] getStyle() {
        return this.Style;
    }

    /**
     * Set 美照生成风格。
仅对单人美照生效，单人可支持选择不同风格。需按照美照生成数量，在数组中逐一填入每张美照的风格名称。如果不传，默认取不重复的随机风格顺序。
多人美照只支持 balanced 一种风格，该参数不生效。
可选风格：<ul><li>real：面部相似度更高。</li><li>balanced：平衡面部真实感和美观度。</li><li>textured：脸部皮肤更具真实感。</li><li>beautiful：脸部美观度更高。</li></ul>
     * @param Style 美照生成风格。
仅对单人美照生效，单人可支持选择不同风格。需按照美照生成数量，在数组中逐一填入每张美照的风格名称。如果不传，默认取不重复的随机风格顺序。
多人美照只支持 balanced 一种风格，该参数不生效。
可选风格：<ul><li>real：面部相似度更高。</li><li>balanced：平衡面部真实感和美观度。</li><li>textured：脸部皮肤更具真实感。</li><li>beautiful：脸部美观度更高。</li></ul>
     */
    public void setStyle(String [] Style) {
        this.Style = Style;
    }

    /**
     * Get 相似度系数，越高越像用户图。
取值范围[0, 1]，默认为0.6。 
     * @return Similarity 相似度系数，越高越像用户图。
取值范围[0, 1]，默认为0.6。
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 相似度系数，越高越像用户图。
取值范围[0, 1]，默认为0.6。
     * @param Similarity 相似度系数，越高越像用户图。
取值范围[0, 1]，默认为0.6。
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get 超分选项，默认不做超分，可选开启。
x2：2倍超分
x4：4倍超分 
     * @return Clarity 超分选项，默认不做超分，可选开启。
x2：2倍超分
x4：4倍超分
     */
    public String getClarity() {
        return this.Clarity;
    }

    /**
     * Set 超分选项，默认不做超分，可选开启。
x2：2倍超分
x4：4倍超分
     * @param Clarity 超分选项，默认不做超分，可选开启。
x2：2倍超分
x4：4倍超分
     */
    public void setClarity(String Clarity) {
        this.Clarity = Clarity;
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

    public SubmitGlamPicJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitGlamPicJobRequest(SubmitGlamPicJobRequest source) {
        if (source.TemplateUrl != null) {
            this.TemplateUrl = new String(source.TemplateUrl);
        }
        if (source.FaceInfos != null) {
            this.FaceInfos = new FaceInfo[source.FaceInfos.length];
            for (int i = 0; i < source.FaceInfos.length; i++) {
                this.FaceInfos[i] = new FaceInfo(source.FaceInfos[i]);
            }
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Style != null) {
            this.Style = new String[source.Style.length];
            for (int i = 0; i < source.Style.length; i++) {
                this.Style[i] = new String(source.Style[i]);
            }
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.Clarity != null) {
            this.Clarity = new String(source.Clarity);
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
        this.setParamSimple(map, prefix + "TemplateUrl", this.TemplateUrl);
        this.setParamArrayObj(map, prefix + "FaceInfos.", this.FaceInfos);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamArraySimple(map, prefix + "Style.", this.Style);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "Clarity", this.Clarity);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

