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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageToVideoGeneralJobRequest extends AbstractModel {

    /**
    * 输入图片
Base64 和 Url 必须提供一个，如果都提供以ImageUrl为准。
上传图url大小不超过 8M
支持jpg，png，jpeg，webp，bmp，tiff 格式
单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 为生成视频添加标识的开关，默认为1，0 需前往 控制台 申请开启显示标识自主完成方可生效。  1：添加标识；  0：不添加标识；  其他数值：默认按1处理。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 默认在生成视频的右下角添加“ AI 生成”字样，如需替换为其他的标识图片，需前往 控制台 申请开启显示标识自主完成。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get 输入图片
Base64 和 Url 必须提供一个，如果都提供以ImageUrl为准。
上传图url大小不超过 8M
支持jpg，png，jpeg，webp，bmp，tiff 格式
单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1 
     * @return Image 输入图片
Base64 和 Url 必须提供一个，如果都提供以ImageUrl为准。
上传图url大小不超过 8M
支持jpg，png，jpeg，webp，bmp，tiff 格式
单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set 输入图片
Base64 和 Url 必须提供一个，如果都提供以ImageUrl为准。
上传图url大小不超过 8M
支持jpg，png，jpeg，webp，bmp，tiff 格式
单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     * @param Image 输入图片
Base64 和 Url 必须提供一个，如果都提供以ImageUrl为准。
上传图url大小不超过 8M
支持jpg，png，jpeg，webp，bmp，tiff 格式
单边分辨率不超过5000，不小于50，长宽限制1:4 ~ 4:1
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。 
     * @return Prompt 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
     * @param Prompt 视频内容的描述，中文正向提示词。最多支持200个 utf-8 字符（首尾空格不计入字符数）。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 为生成视频添加标识的开关，默认为1，0 需前往 控制台 申请开启显示标识自主完成方可生效。  1：添加标识；  0：不添加标识；  其他数值：默认按1处理。 
     * @return LogoAdd 为生成视频添加标识的开关，默认为1，0 需前往 控制台 申请开启显示标识自主完成方可生效。  1：添加标识；  0：不添加标识；  其他数值：默认按1处理。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成视频添加标识的开关，默认为1，0 需前往 控制台 申请开启显示标识自主完成方可生效。  1：添加标识；  0：不添加标识；  其他数值：默认按1处理。
     * @param LogoAdd 为生成视频添加标识的开关，默认为1，0 需前往 控制台 申请开启显示标识自主完成方可生效。  1：添加标识；  0：不添加标识；  其他数值：默认按1处理。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 默认在生成视频的右下角添加“ AI 生成”字样，如需替换为其他的标识图片，需前往 控制台 申请开启显示标识自主完成。 
     * @return LogoParam 默认在生成视频的右下角添加“ AI 生成”字样，如需替换为其他的标识图片，需前往 控制台 申请开启显示标识自主完成。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 默认在生成视频的右下角添加“ AI 生成”字样，如需替换为其他的标识图片，需前往 控制台 申请开启显示标识自主完成。
     * @param LogoParam 默认在生成视频的右下角添加“ AI 生成”字样，如需替换为其他的标识图片，需前往 控制台 申请开启显示标识自主完成。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitImageToVideoGeneralJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageToVideoGeneralJobRequest(SubmitImageToVideoGeneralJobRequest source) {
        if (source.Image != null) {
            this.Image = new Image(source.Image);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
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
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

