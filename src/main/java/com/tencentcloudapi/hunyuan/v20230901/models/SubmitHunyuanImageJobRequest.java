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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuanImageJobRequest extends AbstractModel {

    /**
    * 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 反向提示词。 
推荐使用中文。最多可传1024个 utf-8 字符。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 绘画风格。
请在 [混元生图风格列表](https://cloud.tencent.com/document/product/1729/105846) 中选择期望的风格，传入风格编号。
不传默认不指定风格。
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * 生成图分辨率。
支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3），不传默认使用1024:1024。
如果上传 ContentImage 参考图，分辨率仅支持：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1），不传将自动适配分辨率。如果参考图被用于做风格转换，将生成保持原图长宽比例且长边为1024的图片，指定的分辨率不生效。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 图片生成数量。
支持1 ~ 4张，默认生成1张。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 超分选项，默认不做超分，可选开启。
 x2：2倍超分
 x4：4倍超分
在 Resolution 的基础上按比例提高分辨率，例如1024:1024开启2倍超分后将得到2048:2048。
    */
    @SerializedName("Clarity")
    @Expose
    private String Clarity;

    /**
    * 用于引导内容的参考图。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("ContentImage")
    @Expose
    private Image ContentImage;

    /**
    * prompt 扩写开关。1为开启，0为关闭，不传默认开启。
开启扩写后，将自动扩写原始输入的 prompt 并使用扩写后的 prompt 生成图片，返回生成图片结果时将一并返回扩写后的 prompt 文本。
如果关闭扩写，将直接使用原始输入的 prompt 生成图片。如果上传了参考图，扩写关闭不生效，将保持开启。
建议开启，在多数场景下可提升生成图片效果、丰富生成图片细节。
    */
    @SerializedName("Revise")
    @Expose
    private Long Revise;

    /**
    * 随机种子，默认随机。
不传：随机种子生成。
正数：固定种子生成。
扩写开启时固定种子不生效，将保持随机。
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * 为生成结果图添加显式水印标识的开关，默认为1。  
1：添加。  
0：不添加。  
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
     * Get 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。 
     * @return Prompt 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。
     * @param Prompt 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 反向提示词。 
推荐使用中文。最多可传1024个 utf-8 字符。 
     * @return NegativePrompt 反向提示词。 
推荐使用中文。最多可传1024个 utf-8 字符。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 反向提示词。 
推荐使用中文。最多可传1024个 utf-8 字符。
     * @param NegativePrompt 反向提示词。 
推荐使用中文。最多可传1024个 utf-8 字符。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get 绘画风格。
请在 [混元生图风格列表](https://cloud.tencent.com/document/product/1729/105846) 中选择期望的风格，传入风格编号。
不传默认不指定风格。 
     * @return Style 绘画风格。
请在 [混元生图风格列表](https://cloud.tencent.com/document/product/1729/105846) 中选择期望的风格，传入风格编号。
不传默认不指定风格。
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 绘画风格。
请在 [混元生图风格列表](https://cloud.tencent.com/document/product/1729/105846) 中选择期望的风格，传入风格编号。
不传默认不指定风格。
     * @param Style 绘画风格。
请在 [混元生图风格列表](https://cloud.tencent.com/document/product/1729/105846) 中选择期望的风格，传入风格编号。
不传默认不指定风格。
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get 生成图分辨率。
支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3），不传默认使用1024:1024。
如果上传 ContentImage 参考图，分辨率仅支持：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1），不传将自动适配分辨率。如果参考图被用于做风格转换，将生成保持原图长宽比例且长边为1024的图片，指定的分辨率不生效。 
     * @return Resolution 生成图分辨率。
支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3），不传默认使用1024:1024。
如果上传 ContentImage 参考图，分辨率仅支持：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1），不传将自动适配分辨率。如果参考图被用于做风格转换，将生成保持原图长宽比例且长边为1024的图片，指定的分辨率不生效。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成图分辨率。
支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3），不传默认使用1024:1024。
如果上传 ContentImage 参考图，分辨率仅支持：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1），不传将自动适配分辨率。如果参考图被用于做风格转换，将生成保持原图长宽比例且长边为1024的图片，指定的分辨率不生效。
     * @param Resolution 生成图分辨率。
支持生成以下分辨率的图片：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1）、720:1280（9:16）、1280:720（16:9）、768:1280（3:5）、1280:768（5:3），不传默认使用1024:1024。
如果上传 ContentImage 参考图，分辨率仅支持：768:768（1:1）、768:1024（3:4）、1024:768（4:3）、1024:1024（1:1），不传将自动适配分辨率。如果参考图被用于做风格转换，将生成保持原图长宽比例且长边为1024的图片，指定的分辨率不生效。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 图片生成数量。
支持1 ~ 4张，默认生成1张。 
     * @return Num 图片生成数量。
支持1 ~ 4张，默认生成1张。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 图片生成数量。
支持1 ~ 4张，默认生成1张。
     * @param Num 图片生成数量。
支持1 ~ 4张，默认生成1张。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 超分选项，默认不做超分，可选开启。
 x2：2倍超分
 x4：4倍超分
在 Resolution 的基础上按比例提高分辨率，例如1024:1024开启2倍超分后将得到2048:2048。 
     * @return Clarity 超分选项，默认不做超分，可选开启。
 x2：2倍超分
 x4：4倍超分
在 Resolution 的基础上按比例提高分辨率，例如1024:1024开启2倍超分后将得到2048:2048。
     */
    public String getClarity() {
        return this.Clarity;
    }

    /**
     * Set 超分选项，默认不做超分，可选开启。
 x2：2倍超分
 x4：4倍超分
在 Resolution 的基础上按比例提高分辨率，例如1024:1024开启2倍超分后将得到2048:2048。
     * @param Clarity 超分选项，默认不做超分，可选开启。
 x2：2倍超分
 x4：4倍超分
在 Resolution 的基础上按比例提高分辨率，例如1024:1024开启2倍超分后将得到2048:2048。
     */
    public void setClarity(String Clarity) {
        this.Clarity = Clarity;
    }

    /**
     * Get 用于引导内容的参考图。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return ContentImage 用于引导内容的参考图。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public Image getContentImage() {
        return this.ContentImage;
    }

    /**
     * Set 用于引导内容的参考图。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param ContentImage 用于引导内容的参考图。
图片限制：单边分辨率小于5000，转成 Base64 字符串后小于 8MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setContentImage(Image ContentImage) {
        this.ContentImage = ContentImage;
    }

    /**
     * Get prompt 扩写开关。1为开启，0为关闭，不传默认开启。
开启扩写后，将自动扩写原始输入的 prompt 并使用扩写后的 prompt 生成图片，返回生成图片结果时将一并返回扩写后的 prompt 文本。
如果关闭扩写，将直接使用原始输入的 prompt 生成图片。如果上传了参考图，扩写关闭不生效，将保持开启。
建议开启，在多数场景下可提升生成图片效果、丰富生成图片细节。 
     * @return Revise prompt 扩写开关。1为开启，0为关闭，不传默认开启。
开启扩写后，将自动扩写原始输入的 prompt 并使用扩写后的 prompt 生成图片，返回生成图片结果时将一并返回扩写后的 prompt 文本。
如果关闭扩写，将直接使用原始输入的 prompt 生成图片。如果上传了参考图，扩写关闭不生效，将保持开启。
建议开启，在多数场景下可提升生成图片效果、丰富生成图片细节。
     */
    public Long getRevise() {
        return this.Revise;
    }

    /**
     * Set prompt 扩写开关。1为开启，0为关闭，不传默认开启。
开启扩写后，将自动扩写原始输入的 prompt 并使用扩写后的 prompt 生成图片，返回生成图片结果时将一并返回扩写后的 prompt 文本。
如果关闭扩写，将直接使用原始输入的 prompt 生成图片。如果上传了参考图，扩写关闭不生效，将保持开启。
建议开启，在多数场景下可提升生成图片效果、丰富生成图片细节。
     * @param Revise prompt 扩写开关。1为开启，0为关闭，不传默认开启。
开启扩写后，将自动扩写原始输入的 prompt 并使用扩写后的 prompt 生成图片，返回生成图片结果时将一并返回扩写后的 prompt 文本。
如果关闭扩写，将直接使用原始输入的 prompt 生成图片。如果上传了参考图，扩写关闭不生效，将保持开启。
建议开启，在多数场景下可提升生成图片效果、丰富生成图片细节。
     */
    public void setRevise(Long Revise) {
        this.Revise = Revise;
    }

    /**
     * Get 随机种子，默认随机。
不传：随机种子生成。
正数：固定种子生成。
扩写开启时固定种子不生效，将保持随机。 
     * @return Seed 随机种子，默认随机。
不传：随机种子生成。
正数：固定种子生成。
扩写开启时固定种子不生效，将保持随机。
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 随机种子，默认随机。
不传：随机种子生成。
正数：固定种子生成。
扩写开启时固定种子不生效，将保持随机。
     * @param Seed 随机种子，默认随机。
不传：随机种子生成。
正数：固定种子生成。
扩写开启时固定种子不生效，将保持随机。
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 为生成结果图添加显式水印标识的开关，默认为1。  
1：添加。  
0：不添加。  
其他数值：默认按1处理。  
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。 
     * @return LogoAdd 为生成结果图添加显式水印标识的开关，默认为1。  
1：添加。  
0：不添加。  
其他数值：默认按1处理。  
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成结果图添加显式水印标识的开关，默认为1。  
1：添加。  
0：不添加。  
其他数值：默认按1处理。  
建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。
     * @param LogoAdd 为生成结果图添加显式水印标识的开关，默认为1。  
1：添加。  
0：不添加。  
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

    public SubmitHunyuanImageJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanImageJobRequest(SubmitHunyuanImageJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Clarity != null) {
            this.Clarity = new String(source.Clarity);
        }
        if (source.ContentImage != null) {
            this.ContentImage = new Image(source.ContentImage);
        }
        if (source.Revise != null) {
            this.Revise = new Long(source.Revise);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Clarity", this.Clarity);
        this.setParamObj(map, prefix + "ContentImage.", this.ContentImage);
        this.setParamSimple(map, prefix + "Revise", this.Revise);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

