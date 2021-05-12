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

public class StyleImageRequest extends AbstractModel{

    /**
    * 滤镜类型，取值如下： 
1.白茶；2 白皙；3.初夏；4.东京；5.告白；6.暖阳；7.蔷薇；8.清澄；9.清透；10.甜薄荷；11.默认；12.心动；13.哑灰；14.樱桃布丁；15.自然；16.清逸；17.黑白；18.水果；19.爱情；20.冬日；21.相片；22.夏日；23.香氛；24.魅惑；25.悸动；26.沙滩；27.街拍；28.甜美；29.初吻；30.午后。
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url ，对应图片 base64 编码后大小不可超过5M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。  
支持PNG、JPG、JPEG、BMP 等图片格式，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 滤镜效果，取值[0,100]，0表示无效果，100表示满滤镜效果。默认值为80。
    */
    @SerializedName("FilterDegree")
    @Expose
    private Long FilterDegree;

    /**
    * 返回图像方式（base64 或 url ) ，二选一。url有效期为1天。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
     * Get 滤镜类型，取值如下： 
1.白茶；2 白皙；3.初夏；4.东京；5.告白；6.暖阳；7.蔷薇；8.清澄；9.清透；10.甜薄荷；11.默认；12.心动；13.哑灰；14.樱桃布丁；15.自然；16.清逸；17.黑白；18.水果；19.爱情；20.冬日；21.相片；22.夏日；23.香氛；24.魅惑；25.悸动；26.沙滩；27.街拍；28.甜美；29.初吻；30.午后。 
     * @return FilterType 滤镜类型，取值如下： 
1.白茶；2 白皙；3.初夏；4.东京；5.告白；6.暖阳；7.蔷薇；8.清澄；9.清透；10.甜薄荷；11.默认；12.心动；13.哑灰；14.樱桃布丁；15.自然；16.清逸；17.黑白；18.水果；19.爱情；20.冬日；21.相片；22.夏日；23.香氛；24.魅惑；25.悸动；26.沙滩；27.街拍；28.甜美；29.初吻；30.午后。
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 滤镜类型，取值如下： 
1.白茶；2 白皙；3.初夏；4.东京；5.告白；6.暖阳；7.蔷薇；8.清澄；9.清透；10.甜薄荷；11.默认；12.心动；13.哑灰；14.樱桃布丁；15.自然；16.清逸；17.黑白；18.水果；19.爱情；20.冬日；21.相片；22.夏日；23.香氛；24.魅惑；25.悸动；26.沙滩；27.街拍；28.甜美；29.初吻；30.午后。
     * @param FilterType 滤镜类型，取值如下： 
1.白茶；2 白皙；3.初夏；4.东京；5.告白；6.暖阳；7.蔷薇；8.清澄；9.清透；10.甜薄荷；11.默认；12.心动；13.哑灰；14.樱桃布丁；15.自然；16.清逸；17.黑白；18.水果；19.爱情；20.冬日；21.相片；22.夏日；23.香氛；24.魅惑；25.悸动；26.沙滩；27.街拍；28.甜美；29.初吻；30.午后。
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

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
     * Get 图片的 Url ，对应图片 base64 编码后大小不可超过5M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。  
支持PNG、JPG、JPEG、BMP 等图片格式，不支持 GIF 图片。 
     * @return Url 图片的 Url ，对应图片 base64 编码后大小不可超过5M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。  
支持PNG、JPG、JPEG、BMP 等图片格式，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url ，对应图片 base64 编码后大小不可超过5M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。  
支持PNG、JPG、JPEG、BMP 等图片格式，不支持 GIF 图片。
     * @param Url 图片的 Url ，对应图片 base64 编码后大小不可超过5M。 
图片的 Url、Image必须提供一个，如果都提供，只使用 Url。  
图片存储于腾讯云的 Url 可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。  
支持PNG、JPG、JPEG、BMP 等图片格式，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 滤镜效果，取值[0,100]，0表示无效果，100表示满滤镜效果。默认值为80。 
     * @return FilterDegree 滤镜效果，取值[0,100]，0表示无效果，100表示满滤镜效果。默认值为80。
     */
    public Long getFilterDegree() {
        return this.FilterDegree;
    }

    /**
     * Set 滤镜效果，取值[0,100]，0表示无效果，100表示满滤镜效果。默认值为80。
     * @param FilterDegree 滤镜效果，取值[0,100]，0表示无效果，100表示满滤镜效果。默认值为80。
     */
    public void setFilterDegree(Long FilterDegree) {
        this.FilterDegree = FilterDegree;
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

    public StyleImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StyleImageRequest(StyleImageRequest source) {
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FilterDegree != null) {
            this.FilterDegree = new Long(source.FilterDegree);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FilterDegree", this.FilterDegree);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);

    }
}

