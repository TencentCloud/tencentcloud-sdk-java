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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CropImageRequest extends AbstractModel {

    /**
    * 需要裁剪区域的宽度，与Height共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片宽度的像素值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 需要裁剪区域的高度，与Width共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片高度的像素值。
宽高比例（Width : Height）会简化为最简分数，即如果Width输入10、Height输入20，会简化为1：2。
Width : Height建议取值在[1, 2.5]之间，超过这个范围可能会影响效果。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 图片URL地址。 
图片限制： 
• 图片格式：PNG、JPG、JPEG。 
• 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
建议：
• 图片像素：大于50*50像素，否则影响识别效果。
• 长宽比：长边：短边<5。 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片经过Base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
注意：图片需要Base64编码，并且要去掉编码头部。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 需要裁剪区域的宽度，与Height共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片宽度的像素值。 
     * @return Width 需要裁剪区域的宽度，与Height共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片宽度的像素值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 需要裁剪区域的宽度，与Height共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片宽度的像素值。
     * @param Width 需要裁剪区域的宽度，与Height共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片宽度的像素值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 需要裁剪区域的高度，与Width共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片高度的像素值。
宽高比例（Width : Height）会简化为最简分数，即如果Width输入10、Height输入20，会简化为1：2。
Width : Height建议取值在[1, 2.5]之间，超过这个范围可能会影响效果。 
     * @return Height 需要裁剪区域的高度，与Width共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片高度的像素值。
宽高比例（Width : Height）会简化为最简分数，即如果Width输入10、Height输入20，会简化为1：2。
Width : Height建议取值在[1, 2.5]之间，超过这个范围可能会影响效果。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 需要裁剪区域的高度，与Width共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片高度的像素值。
宽高比例（Width : Height）会简化为最简分数，即如果Width输入10、Height输入20，会简化为1：2。
Width : Height建议取值在[1, 2.5]之间，超过这个范围可能会影响效果。
     * @param Height 需要裁剪区域的高度，与Width共同组成所需裁剪的图片宽高比例。
输入数字请大于0、小于图片高度的像素值。
宽高比例（Width : Height）会简化为最简分数，即如果Width输入10、Height输入20，会简化为1：2。
Width : Height建议取值在[1, 2.5]之间，超过这个范围可能会影响效果。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 图片URL地址。 
图片限制： 
• 图片格式：PNG、JPG、JPEG。 
• 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
建议：
• 图片像素：大于50*50像素，否则影响识别效果。
• 长宽比：长边：短边<5。 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。 
     * @return ImageUrl 图片URL地址。 
图片限制： 
• 图片格式：PNG、JPG、JPEG。 
• 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
建议：
• 图片像素：大于50*50像素，否则影响识别效果。
• 长宽比：长边：短边<5。 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片URL地址。 
图片限制： 
• 图片格式：PNG、JPG、JPEG。 
• 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
建议：
• 图片像素：大于50*50像素，否则影响识别效果。
• 长宽比：长边：短边<5。 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     * @param ImageUrl 图片URL地址。 
图片限制： 
• 图片格式：PNG、JPG、JPEG。 
• 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
建议：
• 图片像素：大于50*50像素，否则影响识别效果。
• 长宽比：长边：短边<5。 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片经过Base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
注意：图片需要Base64编码，并且要去掉编码头部。 
     * @return ImageBase64 图片经过Base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
注意：图片需要Base64编码，并且要去掉编码头部。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片经过Base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
注意：图片需要Base64编码，并且要去掉编码头部。
     * @param ImageBase64 图片经过Base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
注意：图片需要Base64编码，并且要去掉编码头部。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public CropImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CropImageRequest(CropImageRequest source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

