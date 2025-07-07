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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GBDeviceSnapInfo extends AbstractModel {

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 下载地址，空值表示存储图片过期
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 图片大小，单位B
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 文件的创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 图片的接收时间
    */
    @SerializedName("ReceivedTime")
    @Expose
    private String ReceivedTime;

    /**
    * 预览地址，空值表示存储图片过期
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 国标信令会话ID，同时对应控制设备抓拍 ( ControlDeviceSnapshot )接口返回的request_id
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 下载地址，空值表示存储图片过期 
     * @return DownloadUrl 下载地址，空值表示存储图片过期
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载地址，空值表示存储图片过期
     * @param DownloadUrl 下载地址，空值表示存储图片过期
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 图片大小，单位B 
     * @return ImageSize 图片大小，单位B
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 图片大小，单位B
     * @param ImageSize 图片大小，单位B
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 文件的创建时间 
     * @return CreatedTime 文件的创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 文件的创建时间
     * @param CreatedTime 文件的创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 图片的接收时间 
     * @return ReceivedTime 图片的接收时间
     */
    public String getReceivedTime() {
        return this.ReceivedTime;
    }

    /**
     * Set 图片的接收时间
     * @param ReceivedTime 图片的接收时间
     */
    public void setReceivedTime(String ReceivedTime) {
        this.ReceivedTime = ReceivedTime;
    }

    /**
     * Get 预览地址，空值表示存储图片过期 
     * @return PreviewUrl 预览地址，空值表示存储图片过期
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 预览地址，空值表示存储图片过期
     * @param PreviewUrl 预览地址，空值表示存储图片过期
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 国标信令会话ID，同时对应控制设备抓拍 ( ControlDeviceSnapshot )接口返回的request_id 
     * @return SessionId 国标信令会话ID，同时对应控制设备抓拍 ( ControlDeviceSnapshot )接口返回的request_id
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 国标信令会话ID，同时对应控制设备抓拍 ( ControlDeviceSnapshot )接口返回的request_id
     * @param SessionId 国标信令会话ID，同时对应控制设备抓拍 ( ControlDeviceSnapshot )接口返回的request_id
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public GBDeviceSnapInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GBDeviceSnapInfo(GBDeviceSnapInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ReceivedTime != null) {
            this.ReceivedTime = new String(source.ReceivedTime);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ReceivedTime", this.ReceivedTime);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

