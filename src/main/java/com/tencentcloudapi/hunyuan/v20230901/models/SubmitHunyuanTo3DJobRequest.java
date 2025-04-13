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

public class SubmitHunyuanTo3DJobRequest extends AbstractModel {

    /**
    * 3D内容的描述，中文正向提示词。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 输入图 Base64 数据。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 输入图Url。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 生成数量。默认1，当前限制只能为1。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 3D内容的描述，中文正向提示词。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。 
     * @return Prompt 3D内容的描述，中文正向提示词。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 3D内容的描述，中文正向提示词。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     * @param Prompt 3D内容的描述，中文正向提示词。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 输入图 Base64 数据。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。 
     * @return ImageBase64 输入图 Base64 数据。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 输入图 Base64 数据。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     * @param ImageBase64 输入图 Base64 数据。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 输入图Url。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。 
     * @return ImageUrl 输入图Url。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 输入图Url。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     * @param ImageUrl 输入图Url。最多支持200个 utf-8 字符，ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 生成数量。默认1，当前限制只能为1。 
     * @return Num 生成数量。默认1，当前限制只能为1。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 生成数量。默认1，当前限制只能为1。
     * @param Num 生成数量。默认1，当前限制只能为1。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public SubmitHunyuanTo3DJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DJobRequest(SubmitHunyuanTo3DJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

