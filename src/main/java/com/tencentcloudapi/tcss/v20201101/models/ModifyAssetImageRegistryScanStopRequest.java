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

public class ModifyAssetImageRegistryScanStopRequest extends AbstractModel{

    /**
    * 是否扫描全部镜像
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 扫描的镜像列表
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 扫描的镜像列表
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 不要扫描的镜像列表，与Filters配合使用
    */
    @SerializedName("ExcludeImageList")
    @Expose
    private Long [] ExcludeImageList;

    /**
    * 是否仅扫描各repository最新版本的镜像
    */
    @SerializedName("OnlyScanLatest")
    @Expose
    private Boolean OnlyScanLatest;

    /**
     * Get 是否扫描全部镜像 
     * @return All 是否扫描全部镜像
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否扫描全部镜像
     * @param All 是否扫描全部镜像
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 扫描的镜像列表 
     * @return Images 扫描的镜像列表
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 扫描的镜像列表
     * @param Images 扫描的镜像列表
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 扫描的镜像列表 
     * @return Id 扫描的镜像列表
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 扫描的镜像列表
     * @param Id 扫描的镜像列表
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 不要扫描的镜像列表，与Filters配合使用 
     * @return ExcludeImageList 不要扫描的镜像列表，与Filters配合使用
     */
    public Long [] getExcludeImageList() {
        return this.ExcludeImageList;
    }

    /**
     * Set 不要扫描的镜像列表，与Filters配合使用
     * @param ExcludeImageList 不要扫描的镜像列表，与Filters配合使用
     */
    public void setExcludeImageList(Long [] ExcludeImageList) {
        this.ExcludeImageList = ExcludeImageList;
    }

    /**
     * Get 是否仅扫描各repository最新版本的镜像 
     * @return OnlyScanLatest 是否仅扫描各repository最新版本的镜像
     */
    public Boolean getOnlyScanLatest() {
        return this.OnlyScanLatest;
    }

    /**
     * Set 是否仅扫描各repository最新版本的镜像
     * @param OnlyScanLatest 是否仅扫描各repository最新版本的镜像
     */
    public void setOnlyScanLatest(Boolean OnlyScanLatest) {
        this.OnlyScanLatest = OnlyScanLatest;
    }

    public ModifyAssetImageRegistryScanStopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetImageRegistryScanStopRequest(ModifyAssetImageRegistryScanStopRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageList != null) {
            this.ExcludeImageList = new Long[source.ExcludeImageList.length];
            for (int i = 0; i < source.ExcludeImageList.length; i++) {
                this.ExcludeImageList[i] = new Long(source.ExcludeImageList[i]);
            }
        }
        if (source.OnlyScanLatest != null) {
            this.OnlyScanLatest = new Boolean(source.OnlyScanLatest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageList.", this.ExcludeImageList);
        this.setParamSimple(map, prefix + "OnlyScanLatest", this.OnlyScanLatest);

    }
}

