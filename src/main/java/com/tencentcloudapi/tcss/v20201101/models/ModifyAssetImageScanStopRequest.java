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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetImageScanStopRequest extends AbstractModel{

    /**
    * 任务id；任务id，镜像id和根据过滤条件筛选三选一。
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 镜像id；任务id，镜像id和根据过滤条件筛选三选一。
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 根据过滤条件筛选出镜像；任务id，镜像id和根据过滤条件筛选三选一。
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 根据过滤条件筛选出镜像，再排除个别镜像
    */
    @SerializedName("ExcludeImageIds")
    @Expose
    private String ExcludeImageIds;

    /**
     * Get 任务id；任务id，镜像id和根据过滤条件筛选三选一。 
     * @return TaskID 任务id；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id；任务id，镜像id和根据过滤条件筛选三选一。
     * @param TaskID 任务id；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 镜像id；任务id，镜像id和根据过滤条件筛选三选一。 
     * @return Images 镜像id；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 镜像id；任务id，镜像id和根据过滤条件筛选三选一。
     * @param Images 镜像id；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 根据过滤条件筛选出镜像；任务id，镜像id和根据过滤条件筛选三选一。 
     * @return Filters 根据过滤条件筛选出镜像；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 根据过滤条件筛选出镜像；任务id，镜像id和根据过滤条件筛选三选一。
     * @param Filters 根据过滤条件筛选出镜像；任务id，镜像id和根据过滤条件筛选三选一。
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 根据过滤条件筛选出镜像，再排除个别镜像 
     * @return ExcludeImageIds 根据过滤条件筛选出镜像，再排除个别镜像
     */
    public String getExcludeImageIds() {
        return this.ExcludeImageIds;
    }

    /**
     * Set 根据过滤条件筛选出镜像，再排除个别镜像
     * @param ExcludeImageIds 根据过滤条件筛选出镜像，再排除个别镜像
     */
    public void setExcludeImageIds(String ExcludeImageIds) {
        this.ExcludeImageIds = ExcludeImageIds;
    }

    public ModifyAssetImageScanStopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetImageScanStopRequest(ModifyAssetImageScanStopRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageIds != null) {
            this.ExcludeImageIds = new String(source.ExcludeImageIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ExcludeImageIds", this.ExcludeImageIds);

    }
}

