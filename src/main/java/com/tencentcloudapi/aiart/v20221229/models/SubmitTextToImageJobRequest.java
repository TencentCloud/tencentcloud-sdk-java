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

public class SubmitTextToImageJobRequest extends AbstractModel {

    /**
    * 文本描述。 
算法将根据输入的文本智能生成与之相关的图像。 
不能为空，推荐使用中文。最多可传1024个 utf-8 字符。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 生成图分辨率，默认1024:1024：
 - 宽高维度均在 [512, 2048] 像素范围内;
 - 如果宽高乘积（即图像面积）超过 1024×1024 像素，则宽高维度须在 [1024, 2048] 像素范围内;
 - 宽高乘积（即图像面积）不超过 2048×2048 像素;
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

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
    * 是否开启prompt改写，为空时默认开启，改写预计会增加20s左右耗时。
0：关闭改写
1：开启改写
建议默认开启，如果关闭改写，需要调用方自己接改写，否则对生图效果有较大影响，改写方法可以参考：[改写](https://github.com/Tencent-Hunyuan/HunyuanImage-3.0/tree/main/PE)
示例值：1
    */
    @SerializedName("Revise")
    @Expose
    private Long Revise;

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
     * Get 生成图分辨率，默认1024:1024：
 - 宽高维度均在 [512, 2048] 像素范围内;
 - 如果宽高乘积（即图像面积）超过 1024×1024 像素，则宽高维度须在 [1024, 2048] 像素范围内;
 - 宽高乘积（即图像面积）不超过 2048×2048 像素; 
     * @return Resolution 生成图分辨率，默认1024:1024：
 - 宽高维度均在 [512, 2048] 像素范围内;
 - 如果宽高乘积（即图像面积）超过 1024×1024 像素，则宽高维度须在 [1024, 2048] 像素范围内;
 - 宽高乘积（即图像面积）不超过 2048×2048 像素;
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成图分辨率，默认1024:1024：
 - 宽高维度均在 [512, 2048] 像素范围内;
 - 如果宽高乘积（即图像面积）超过 1024×1024 像素，则宽高维度须在 [1024, 2048] 像素范围内;
 - 宽高乘积（即图像面积）不超过 2048×2048 像素;
     * @param Resolution 生成图分辨率，默认1024:1024：
 - 宽高维度均在 [512, 2048] 像素范围内;
 - 如果宽高乘积（即图像面积）超过 1024×1024 像素，则宽高维度须在 [1024, 2048] 像素范围内;
 - 宽高乘积（即图像面积）不超过 2048×2048 像素;
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
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

    /**
     * Get 是否开启prompt改写，为空时默认开启，改写预计会增加20s左右耗时。
0：关闭改写
1：开启改写
建议默认开启，如果关闭改写，需要调用方自己接改写，否则对生图效果有较大影响，改写方法可以参考：[改写](https://github.com/Tencent-Hunyuan/HunyuanImage-3.0/tree/main/PE)
示例值：1 
     * @return Revise 是否开启prompt改写，为空时默认开启，改写预计会增加20s左右耗时。
0：关闭改写
1：开启改写
建议默认开启，如果关闭改写，需要调用方自己接改写，否则对生图效果有较大影响，改写方法可以参考：[改写](https://github.com/Tencent-Hunyuan/HunyuanImage-3.0/tree/main/PE)
示例值：1
     */
    public Long getRevise() {
        return this.Revise;
    }

    /**
     * Set 是否开启prompt改写，为空时默认开启，改写预计会增加20s左右耗时。
0：关闭改写
1：开启改写
建议默认开启，如果关闭改写，需要调用方自己接改写，否则对生图效果有较大影响，改写方法可以参考：[改写](https://github.com/Tencent-Hunyuan/HunyuanImage-3.0/tree/main/PE)
示例值：1
     * @param Revise 是否开启prompt改写，为空时默认开启，改写预计会增加20s左右耗时。
0：关闭改写
1：开启改写
建议默认开启，如果关闭改写，需要调用方自己接改写，否则对生图效果有较大影响，改写方法可以参考：[改写](https://github.com/Tencent-Hunyuan/HunyuanImage-3.0/tree/main/PE)
示例值：1
     */
    public void setRevise(Long Revise) {
        this.Revise = Revise;
    }

    public SubmitTextToImageJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTextToImageJobRequest(SubmitTextToImageJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
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
        if (source.Revise != null) {
            this.Revise = new Long(source.Revise);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "Revise", this.Revise);

    }
}

