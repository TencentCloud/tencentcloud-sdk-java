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

public class CreateAssetImageRegistryScanTaskRequest extends AbstractModel {

    /**
    * <p>是否扫描全部镜像</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>扫描的镜像列表</p>
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * <p>扫描类型数组</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>扫描的镜像列表</p>
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>不需要扫描的镜像列表, 与Filters配合使用</p>
    */
    @SerializedName("ExcludeImageList")
    @Expose
    private Long [] ExcludeImageList;

    /**
    * <p>是否仅扫描各repository最新版的镜像, 与Filters配合使用</p>
    */
    @SerializedName("OnlyScanLatest")
    @Expose
    private Boolean OnlyScanLatest;

    /**
    * <p>任务超时时长</p><p>单位：秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get <p>是否扫描全部镜像</p> 
     * @return All <p>是否扫描全部镜像</p>
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>是否扫描全部镜像</p>
     * @param All <p>是否扫描全部镜像</p>
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>扫描的镜像列表</p> 
     * @return Images <p>扫描的镜像列表</p>
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>扫描的镜像列表</p>
     * @param Images <p>扫描的镜像列表</p>
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>扫描类型数组</p> 
     * @return ScanType <p>扫描类型数组</p>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>扫描类型数组</p>
     * @param ScanType <p>扫描类型数组</p>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>扫描的镜像列表</p> 
     * @return Id <p>扫描的镜像列表</p>
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set <p>扫描的镜像列表</p>
     * @param Id <p>扫描的镜像列表</p>
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>不需要扫描的镜像列表, 与Filters配合使用</p> 
     * @return ExcludeImageList <p>不需要扫描的镜像列表, 与Filters配合使用</p>
     */
    public Long [] getExcludeImageList() {
        return this.ExcludeImageList;
    }

    /**
     * Set <p>不需要扫描的镜像列表, 与Filters配合使用</p>
     * @param ExcludeImageList <p>不需要扫描的镜像列表, 与Filters配合使用</p>
     */
    public void setExcludeImageList(Long [] ExcludeImageList) {
        this.ExcludeImageList = ExcludeImageList;
    }

    /**
     * Get <p>是否仅扫描各repository最新版的镜像, 与Filters配合使用</p> 
     * @return OnlyScanLatest <p>是否仅扫描各repository最新版的镜像, 与Filters配合使用</p>
     */
    public Boolean getOnlyScanLatest() {
        return this.OnlyScanLatest;
    }

    /**
     * Set <p>是否仅扫描各repository最新版的镜像, 与Filters配合使用</p>
     * @param OnlyScanLatest <p>是否仅扫描各repository最新版的镜像, 与Filters配合使用</p>
     */
    public void setOnlyScanLatest(Boolean OnlyScanLatest) {
        this.OnlyScanLatest = OnlyScanLatest;
    }

    /**
     * Get <p>任务超时时长</p><p>单位：秒</p> 
     * @return Timeout <p>任务超时时长</p><p>单位：秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>任务超时时长</p><p>单位：秒</p>
     * @param Timeout <p>任务超时时长</p><p>单位：秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateAssetImageRegistryScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageRegistryScanTaskRequest(CreateAssetImageRegistryScanTaskRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
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
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageList.", this.ExcludeImageList);
        this.setParamSimple(map, prefix + "OnlyScanLatest", this.OnlyScanLatest);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

