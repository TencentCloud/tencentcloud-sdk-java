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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonImageInfo extends AbstractModel{

    /**
    * 人脸图片ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 自定义人脸图片的URL，存储在IVLDCustomPreson存储桶内
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
    * 自定义人脸图片处理错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 自定义人脸图片处理错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get 人脸图片ID 
     * @return ImageId 人脸图片ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 人脸图片ID
     * @param ImageId 人脸图片ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 自定义人脸图片的URL，存储在IVLDCustomPreson存储桶内 
     * @return ImageURL 自定义人脸图片的URL，存储在IVLDCustomPreson存储桶内
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 自定义人脸图片的URL，存储在IVLDCustomPreson存储桶内
     * @param ImageURL 自定义人脸图片的URL，存储在IVLDCustomPreson存储桶内
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    /**
     * Get 自定义人脸图片处理错误码 
     * @return ErrorCode 自定义人脸图片处理错误码
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 自定义人脸图片处理错误码
     * @param ErrorCode 自定义人脸图片处理错误码
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 自定义人脸图片处理错误信息 
     * @return ErrorMsg 自定义人脸图片处理错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 自定义人脸图片处理错误信息
     * @param ErrorMsg 自定义人脸图片处理错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public PersonImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonImageInfo(PersonImageInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageURL != null) {
            this.ImageURL = new String(source.ImageURL);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

