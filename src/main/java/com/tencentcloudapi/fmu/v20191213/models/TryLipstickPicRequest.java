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

public class TryLipstickPicRequest extends AbstractModel{

    /**
    * 唇色信息。 
您可以输入最多3个 LipColorInfo 来实现给一张图中的最多3张人脸试唇色。
    */
    @SerializedName("LipColorInfos")
    @Expose
    private LipColorInfo [] LipColorInfos;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过6M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url ，对应图片 base64 编码后大小不可超过6M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
     * Get 唇色信息。 
您可以输入最多3个 LipColorInfo 来实现给一张图中的最多3张人脸试唇色。 
     * @return LipColorInfos 唇色信息。 
您可以输入最多3个 LipColorInfo 来实现给一张图中的最多3张人脸试唇色。
     */
    public LipColorInfo [] getLipColorInfos() {
        return this.LipColorInfos;
    }

    /**
     * Set 唇色信息。 
您可以输入最多3个 LipColorInfo 来实现给一张图中的最多3张人脸试唇色。
     * @param LipColorInfos 唇色信息。 
您可以输入最多3个 LipColorInfo 来实现给一张图中的最多3张人脸试唇色。
     */
    public void setLipColorInfos(LipColorInfo [] LipColorInfos) {
        this.LipColorInfos = LipColorInfos;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过6M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据，base64 编码后大小不可超过6M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过6M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据，base64 编码后大小不可超过6M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url ，对应图片 base64 编码后大小不可超过6M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url ，对应图片 base64 编码后大小不可超过6M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url ，对应图片 base64 编码后大小不可超过6M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url ，对应图片 base64 编码后大小不可超过6M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。 
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。 
     * @return RspImgType 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。
     * @param RspImgType 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    public TryLipstickPicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TryLipstickPicRequest(TryLipstickPicRequest source) {
        if (source.LipColorInfos != null) {
            this.LipColorInfos = new LipColorInfo[source.LipColorInfos.length];
            for (int i = 0; i < source.LipColorInfos.length; i++) {
                this.LipColorInfos[i] = new LipColorInfo(source.LipColorInfos[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LipColorInfos.", this.LipColorInfos);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);

    }
}

