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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautifyPicRequest extends AbstractModel{

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。 
Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
    */
    @SerializedName("Whitening")
    @Expose
    private Long Whitening;

    /**
    * 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值10。
    */
    @SerializedName("Smoothing")
    @Expose
    private Long Smoothing;

    /**
    * 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
    */
    @SerializedName("FaceLifting")
    @Expose
    private Long FaceLifting;

    /**
    * 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
    */
    @SerializedName("EyeEnlarging")
    @Expose
    private Long EyeEnlarging;

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。 
Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。 
Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。 
Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。 
Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。 
     * @return Whitening 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     */
    public Long getWhitening() {
        return this.Whitening;
    }

    /**
     * Set 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     * @param Whitening 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     */
    public void setWhitening(Long Whitening) {
        this.Whitening = Whitening;
    }

    /**
     * Get 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值10。 
     * @return Smoothing 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值10。
     */
    public Long getSmoothing() {
        return this.Smoothing;
    }

    /**
     * Set 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值10。
     * @param Smoothing 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值10。
     */
    public void setSmoothing(Long Smoothing) {
        this.Smoothing = Smoothing;
    }

    /**
     * Get 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。 
     * @return FaceLifting 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     */
    public Long getFaceLifting() {
        return this.FaceLifting;
    }

    /**
     * Set 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     * @param FaceLifting 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     */
    public void setFaceLifting(Long FaceLifting) {
        this.FaceLifting = FaceLifting;
    }

    /**
     * Get 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。 
     * @return EyeEnlarging 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     */
    public Long getEyeEnlarging() {
        return this.EyeEnlarging;
    }

    /**
     * Set 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     * @param EyeEnlarging 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     */
    public void setEyeEnlarging(Long EyeEnlarging) {
        this.EyeEnlarging = EyeEnlarging;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Whitening", this.Whitening);
        this.setParamSimple(map, prefix + "Smoothing", this.Smoothing);
        this.setParamSimple(map, prefix + "FaceLifting", this.FaceLifting);
        this.setParamSimple(map, prefix + "EyeEnlarging", this.EyeEnlarging);

    }
}

