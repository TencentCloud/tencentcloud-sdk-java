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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoLivenessCompareRequest extends AbstractModel{

    /**
    * 用于人脸比对照片的URL地址；图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。

图片仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 比对图片的32位Md5值。
    */
    @SerializedName("ImageMd5")
    @Expose
    private String ImageMd5;

    /**
    * 用于活体检测的视频Url 地址。视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。

视频仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 视频的32位Md5值。
    */
    @SerializedName("VideoMd5")
    @Expose
    private String VideoMd5;

    /**
    * 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * 数字模式传参：传数字验证码，需自定义四位数字验证码；
动作模式传参：传动作顺序，需自定义动作顺序(2,1 or 1,2)；
静默模式传参：空。
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
     * Get 用于人脸比对照片的URL地址；图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。

图片仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。 
     * @return ImageUrl 用于人脸比对照片的URL地址；图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。

图片仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 用于人脸比对照片的URL地址；图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。

图片仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     * @param ImageUrl 用于人脸比对照片的URL地址；图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。

图片仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 比对图片的32位Md5值。 
     * @return ImageMd5 比对图片的32位Md5值。
     */
    public String getImageMd5() {
        return this.ImageMd5;
    }

    /**
     * Set 比对图片的32位Md5值。
     * @param ImageMd5 比对图片的32位Md5值。
     */
    public void setImageMd5(String ImageMd5) {
        this.ImageMd5 = ImageMd5;
    }

    /**
     * Get 用于活体检测的视频Url 地址。视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。

视频仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。 
     * @return VideoUrl 用于活体检测的视频Url 地址。视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。

视频仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 用于活体检测的视频Url 地址。视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。

视频仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     * @param VideoUrl 用于活体检测的视频Url 地址。视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。

视频仅支持腾讯云同region的Cos地址，可保障更高的下载速度和稳定性，可使用CreateUploadUrl生成或自行购买Cos。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 视频的32位Md5值。 
     * @return VideoMd5 视频的32位Md5值。
     */
    public String getVideoMd5() {
        return this.VideoMd5;
    }

    /**
     * Set 视频的32位Md5值。
     * @param VideoMd5 视频的32位Md5值。
     */
    public void setVideoMd5(String VideoMd5) {
        this.VideoMd5 = VideoMd5;
    }

    /**
     * Get 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。 
     * @return LivenessType 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     * @param LivenessType 活体检测类型，取值：LIP/ACTION/SILENT。
LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get 数字模式传参：传数字验证码，需自定义四位数字验证码；
动作模式传参：传动作顺序，需自定义动作顺序(2,1 or 1,2)；
静默模式传参：空。 
     * @return ValidateData 数字模式传参：传数字验证码，需自定义四位数字验证码；
动作模式传参：传动作顺序，需自定义动作顺序(2,1 or 1,2)；
静默模式传参：空。
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set 数字模式传参：传数字验证码，需自定义四位数字验证码；
动作模式传参：传动作顺序，需自定义动作顺序(2,1 or 1,2)；
静默模式传参：空。
     * @param ValidateData 数字模式传参：传数字验证码，需自定义四位数字验证码；
动作模式传参：传动作顺序，需自定义动作顺序(2,1 or 1,2)；
静默模式传参：空。
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    public VideoLivenessCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoLivenessCompareRequest(VideoLivenessCompareRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageMd5 != null) {
            this.ImageMd5 = new String(source.ImageMd5);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMd5 != null) {
            this.VideoMd5 = new String(source.VideoMd5);
        }
        if (source.LivenessType != null) {
            this.LivenessType = new String(source.LivenessType);
        }
        if (source.ValidateData != null) {
            this.ValidateData = new String(source.ValidateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageMd5", this.ImageMd5);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMd5", this.VideoMd5);
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);

    }
}

