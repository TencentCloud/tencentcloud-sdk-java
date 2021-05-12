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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentCustomizedPortraitPicRequest extends AbstractModel{

    /**
    * 此参数为分割选项，请根据需要选择自己所想从图片中分割的部分。注意所有选项均为非必选，如未选择则值默认为false, 但是必须要保证多于一个选项的描述为true。
    */
    @SerializedName("SegmentationOptions")
    @Expose
    private SegmentationOptions SegmentationOptions;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。
图片分辨率须小于2000*2000。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url 。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片分辨率须小于2000*2000 ，图片 base64 编码后大小不可超过5M。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 此参数为分割选项，请根据需要选择自己所想从图片中分割的部分。注意所有选项均为非必选，如未选择则值默认为false, 但是必须要保证多于一个选项的描述为true。 
     * @return SegmentationOptions 此参数为分割选项，请根据需要选择自己所想从图片中分割的部分。注意所有选项均为非必选，如未选择则值默认为false, 但是必须要保证多于一个选项的描述为true。
     */
    public SegmentationOptions getSegmentationOptions() {
        return this.SegmentationOptions;
    }

    /**
     * Set 此参数为分割选项，请根据需要选择自己所想从图片中分割的部分。注意所有选项均为非必选，如未选择则值默认为false, 但是必须要保证多于一个选项的描述为true。
     * @param SegmentationOptions 此参数为分割选项，请根据需要选择自己所想从图片中分割的部分。注意所有选项均为非必选，如未选择则值默认为false, 但是必须要保证多于一个选项的描述为true。
     */
    public void setSegmentationOptions(SegmentationOptions SegmentationOptions) {
        this.SegmentationOptions = SegmentationOptions;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
图片分辨率须小于2000*2000。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。
图片分辨率须小于2000*2000。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
图片分辨率须小于2000*2000。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。
图片分辨率须小于2000*2000。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片分辨率须小于2000*2000 ，图片 base64 编码后大小不可超过5M。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url 。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片分辨率须小于2000*2000 ，图片 base64 编码后大小不可超过5M。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片分辨率须小于2000*2000 ，图片 base64 编码后大小不可超过5M。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url 。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片分辨率须小于2000*2000 ，图片 base64 编码后大小不可超过5M。 
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public SegmentCustomizedPortraitPicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentCustomizedPortraitPicRequest(SegmentCustomizedPortraitPicRequest source) {
        if (source.SegmentationOptions != null) {
            this.SegmentationOptions = new SegmentationOptions(source.SegmentationOptions);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SegmentationOptions.", this.SegmentationOptions);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

