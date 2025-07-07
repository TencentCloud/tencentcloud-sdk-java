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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryScanStatusOneKeyRequest extends AbstractModel {

    /**
    * 需要获取进度的镜像列表
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 是否获取全部镜像
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 需要获取进度的镜像列表Id
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * 获取进度的任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
     * Get 需要获取进度的镜像列表 
     * @return Images 需要获取进度的镜像列表
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 需要获取进度的镜像列表
     * @param Images 需要获取进度的镜像列表
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 是否获取全部镜像 
     * @return All 是否获取全部镜像
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否获取全部镜像
     * @param All 是否获取全部镜像
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 需要获取进度的镜像列表Id 
     * @return Id 需要获取进度的镜像列表Id
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 需要获取进度的镜像列表Id
     * @param Id 需要获取进度的镜像列表Id
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get 获取进度的任务ID 
     * @return TaskID 获取进度的任务ID
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 获取进度的任务ID
     * @param TaskID 获取进度的任务ID
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    public DescribeAssetImageRegistryScanStatusOneKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryScanStatusOneKeyRequest(DescribeAssetImageRegistryScanStatusOneKeyRequest source) {
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

