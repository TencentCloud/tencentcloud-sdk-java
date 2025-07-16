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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuanTo3DJobRequest extends AbstractModel {

    /**
    * 文生3D，3D内容的描述，中文正向提示词。
最多支持1024个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 输入图 Base64 数据。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 输入图Url。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64/ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 多视角的模型图片，视角参考值：
left：左视图；
right：右视图；
back：后视图；

每个视角仅限制一张图片。
●图片大小限制：编码后大小不可超过8M。
●图片分辨率限制：单边分辨率小于5000且大于128。
●支持图片格式：支持jpg或png
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * 生成模型的格式，仅限制生成一种格式。
生成模型文件组默认返回obj格式。
可选值：OBJ，GLB，STL，USDZ，FBX，MP4。
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * 是否开启 PBR材质生成，默认 false。
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
     * Get 文生3D，3D内容的描述，中文正向提示词。
最多支持1024个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。 
     * @return Prompt 文生3D，3D内容的描述，中文正向提示词。
最多支持1024个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 文生3D，3D内容的描述，中文正向提示词。
最多支持1024个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     * @param Prompt 文生3D，3D内容的描述，中文正向提示词。
最多支持1024个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 输入图 Base64 数据。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。 
     * @return ImageBase64 输入图 Base64 数据。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 输入图 Base64 数据。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     * @param ImageBase64 输入图 Base64 数据。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 输入图Url。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64/ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。 
     * @return ImageUrl 输入图Url。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64/ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 输入图Url。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64/ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     * @param ImageUrl 输入图Url。
大小：单边分辨率要求不小于128，不大于5000。大小不超过8m（base64编码后会大30%左右，建议实际输入图片不超过6m）
格式：jpg，png，jpeg，webp。
ImageBase64/ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 多视角的模型图片，视角参考值：
left：左视图；
right：右视图；
back：后视图；

每个视角仅限制一张图片。
●图片大小限制：编码后大小不可超过8M。
●图片分辨率限制：单边分辨率小于5000且大于128。
●支持图片格式：支持jpg或png 
     * @return MultiViewImages 多视角的模型图片，视角参考值：
left：左视图；
right：右视图；
back：后视图；

每个视角仅限制一张图片。
●图片大小限制：编码后大小不可超过8M。
●图片分辨率限制：单边分辨率小于5000且大于128。
●支持图片格式：支持jpg或png
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set 多视角的模型图片，视角参考值：
left：左视图；
right：右视图；
back：后视图；

每个视角仅限制一张图片。
●图片大小限制：编码后大小不可超过8M。
●图片分辨率限制：单边分辨率小于5000且大于128。
●支持图片格式：支持jpg或png
     * @param MultiViewImages 多视角的模型图片，视角参考值：
left：左视图；
right：右视图；
back：后视图；

每个视角仅限制一张图片。
●图片大小限制：编码后大小不可超过8M。
●图片分辨率限制：单边分辨率小于5000且大于128。
●支持图片格式：支持jpg或png
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get 生成模型的格式，仅限制生成一种格式。
生成模型文件组默认返回obj格式。
可选值：OBJ，GLB，STL，USDZ，FBX，MP4。 
     * @return ResultFormat 生成模型的格式，仅限制生成一种格式。
生成模型文件组默认返回obj格式。
可选值：OBJ，GLB，STL，USDZ，FBX，MP4。
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set 生成模型的格式，仅限制生成一种格式。
生成模型文件组默认返回obj格式。
可选值：OBJ，GLB，STL，USDZ，FBX，MP4。
     * @param ResultFormat 生成模型的格式，仅限制生成一种格式。
生成模型文件组默认返回obj格式。
可选值：OBJ，GLB，STL，USDZ，FBX，MP4。
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get 是否开启 PBR材质生成，默认 false。 
     * @return EnablePBR 是否开启 PBR材质生成，默认 false。
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set 是否开启 PBR材质生成，默认 false。
     * @param EnablePBR 是否开启 PBR材质生成，默认 false。
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
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
        if (source.MultiViewImages != null) {
            this.MultiViewImages = new ViewImage[source.MultiViewImages.length];
            for (int i = 0; i < source.MultiViewImages.length; i++) {
                this.MultiViewImages[i] = new ViewImage(source.MultiViewImages[i]);
            }
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);

    }
}

