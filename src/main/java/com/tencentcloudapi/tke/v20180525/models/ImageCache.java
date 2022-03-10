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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageCache extends AbstractModel{

    /**
    * 镜像缓存Id
    */
    @SerializedName("ImageCacheId")
    @Expose
    private String ImageCacheId;

    /**
    * 镜像缓存名称
    */
    @SerializedName("ImageCacheName")
    @Expose
    private String ImageCacheName;

    /**
    * 镜像缓存大小。单位：GiB
    */
    @SerializedName("ImageCacheSize")
    @Expose
    private Long ImageCacheSize;

    /**
    * 镜像缓存包含的镜像列表
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireDateTime")
    @Expose
    private String ExpireDateTime;

    /**
    * 镜像缓存事件信息
    */
    @SerializedName("Events")
    @Expose
    private ImageCacheEvent [] Events;

    /**
    * 最新一次匹配到镜像缓存的时间
    */
    @SerializedName("LastMatchedTime")
    @Expose
    private String LastMatchedTime;

    /**
    * 镜像缓存对应的快照Id
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 镜像缓存状态，可能取值：
Pending：创建中
Ready：创建完成
Failed：创建失败
Updating：更新中
UpdateFailed：更新失败
只有状态为Ready时，才能正常使用镜像缓存
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 镜像缓存Id 
     * @return ImageCacheId 镜像缓存Id
     */
    public String getImageCacheId() {
        return this.ImageCacheId;
    }

    /**
     * Set 镜像缓存Id
     * @param ImageCacheId 镜像缓存Id
     */
    public void setImageCacheId(String ImageCacheId) {
        this.ImageCacheId = ImageCacheId;
    }

    /**
     * Get 镜像缓存名称 
     * @return ImageCacheName 镜像缓存名称
     */
    public String getImageCacheName() {
        return this.ImageCacheName;
    }

    /**
     * Set 镜像缓存名称
     * @param ImageCacheName 镜像缓存名称
     */
    public void setImageCacheName(String ImageCacheName) {
        this.ImageCacheName = ImageCacheName;
    }

    /**
     * Get 镜像缓存大小。单位：GiB 
     * @return ImageCacheSize 镜像缓存大小。单位：GiB
     */
    public Long getImageCacheSize() {
        return this.ImageCacheSize;
    }

    /**
     * Set 镜像缓存大小。单位：GiB
     * @param ImageCacheSize 镜像缓存大小。单位：GiB
     */
    public void setImageCacheSize(Long ImageCacheSize) {
        this.ImageCacheSize = ImageCacheSize;
    }

    /**
     * Get 镜像缓存包含的镜像列表 
     * @return Images 镜像缓存包含的镜像列表
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 镜像缓存包含的镜像列表
     * @param Images 镜像缓存包含的镜像列表
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireDateTime 到期时间
     */
    public String getExpireDateTime() {
        return this.ExpireDateTime;
    }

    /**
     * Set 到期时间
     * @param ExpireDateTime 到期时间
     */
    public void setExpireDateTime(String ExpireDateTime) {
        this.ExpireDateTime = ExpireDateTime;
    }

    /**
     * Get 镜像缓存事件信息 
     * @return Events 镜像缓存事件信息
     */
    public ImageCacheEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set 镜像缓存事件信息
     * @param Events 镜像缓存事件信息
     */
    public void setEvents(ImageCacheEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get 最新一次匹配到镜像缓存的时间 
     * @return LastMatchedTime 最新一次匹配到镜像缓存的时间
     */
    public String getLastMatchedTime() {
        return this.LastMatchedTime;
    }

    /**
     * Set 最新一次匹配到镜像缓存的时间
     * @param LastMatchedTime 最新一次匹配到镜像缓存的时间
     */
    public void setLastMatchedTime(String LastMatchedTime) {
        this.LastMatchedTime = LastMatchedTime;
    }

    /**
     * Get 镜像缓存对应的快照Id 
     * @return SnapshotId 镜像缓存对应的快照Id
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 镜像缓存对应的快照Id
     * @param SnapshotId 镜像缓存对应的快照Id
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 镜像缓存状态，可能取值：
Pending：创建中
Ready：创建完成
Failed：创建失败
Updating：更新中
UpdateFailed：更新失败
只有状态为Ready时，才能正常使用镜像缓存 
     * @return Status 镜像缓存状态，可能取值：
Pending：创建中
Ready：创建完成
Failed：创建失败
Updating：更新中
UpdateFailed：更新失败
只有状态为Ready时，才能正常使用镜像缓存
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 镜像缓存状态，可能取值：
Pending：创建中
Ready：创建完成
Failed：创建失败
Updating：更新中
UpdateFailed：更新失败
只有状态为Ready时，才能正常使用镜像缓存
     * @param Status 镜像缓存状态，可能取值：
Pending：创建中
Ready：创建完成
Failed：创建失败
Updating：更新中
UpdateFailed：更新失败
只有状态为Ready时，才能正常使用镜像缓存
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ImageCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageCache(ImageCache source) {
        if (source.ImageCacheId != null) {
            this.ImageCacheId = new String(source.ImageCacheId);
        }
        if (source.ImageCacheName != null) {
            this.ImageCacheName = new String(source.ImageCacheName);
        }
        if (source.ImageCacheSize != null) {
            this.ImageCacheSize = new Long(source.ImageCacheSize);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.ExpireDateTime != null) {
            this.ExpireDateTime = new String(source.ExpireDateTime);
        }
        if (source.Events != null) {
            this.Events = new ImageCacheEvent[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new ImageCacheEvent(source.Events[i]);
            }
        }
        if (source.LastMatchedTime != null) {
            this.LastMatchedTime = new String(source.LastMatchedTime);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCacheId", this.ImageCacheId);
        this.setParamSimple(map, prefix + "ImageCacheName", this.ImageCacheName);
        this.setParamSimple(map, prefix + "ImageCacheSize", this.ImageCacheSize);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "ExpireDateTime", this.ExpireDateTime);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "LastMatchedTime", this.LastMatchedTime);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

