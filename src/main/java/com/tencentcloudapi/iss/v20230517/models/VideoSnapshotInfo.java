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

public class VideoSnapshotInfo extends AbstractModel {

    /**
    * <p>图片Id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>截图配置Id</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>截图配置名称</p>
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * <p>通道Id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>通道名称</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>图片Url</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片Url有效期</p>
    */
    @SerializedName("ImageUrlExpires")
    @Expose
    private Long ImageUrlExpires;

    /**
    * <p>截图时间点</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>图片大小</p><p>单位：字节</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get <p>图片Id</p> 
     * @return ImageId <p>图片Id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>图片Id</p>
     * @param ImageId <p>图片Id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>截图配置Id</p> 
     * @return ConfigId <p>截图配置Id</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>截图配置Id</p>
     * @param ConfigId <p>截图配置Id</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>截图配置名称</p> 
     * @return ConfigName <p>截图配置名称</p>
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set <p>截图配置名称</p>
     * @param ConfigName <p>截图配置名称</p>
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get <p>通道Id</p> 
     * @return ChannelId <p>通道Id</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道Id</p>
     * @param ChannelId <p>通道Id</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>通道名称</p> 
     * @return ChannelName <p>通道名称</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>通道名称</p>
     * @param ChannelName <p>通道名称</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul> 
     * @return Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     * @param Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>图片Url</p> 
     * @return ImageUrl <p>图片Url</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片Url</p>
     * @param ImageUrl <p>图片Url</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片Url有效期</p> 
     * @return ImageUrlExpires <p>图片Url有效期</p>
     */
    public Long getImageUrlExpires() {
        return this.ImageUrlExpires;
    }

    /**
     * Set <p>图片Url有效期</p>
     * @param ImageUrlExpires <p>图片Url有效期</p>
     */
    public void setImageUrlExpires(Long ImageUrlExpires) {
        this.ImageUrlExpires = ImageUrlExpires;
    }

    /**
     * Get <p>截图时间点</p> 
     * @return Timestamp <p>截图时间点</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>截图时间点</p>
     * @param Timestamp <p>截图时间点</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>图片大小</p><p>单位：字节</p> 
     * @return FileSize <p>图片大小</p><p>单位：字节</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>图片大小</p><p>单位：字节</p>
     * @param FileSize <p>图片大小</p><p>单位：字节</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public VideoSnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSnapshotInfo(VideoSnapshotInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageUrlExpires != null) {
            this.ImageUrlExpires = new Long(source.ImageUrlExpires);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageUrlExpires", this.ImageUrlExpires);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

