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

public class ModifyImageAuthorizedRequest extends AbstractModel{

    /**
    * 本地镜像是否全部授权的标识，优先权高于根据本地镜像ids授权。等于true时需UpdatedLocalImageCnt大于0。
    */
    @SerializedName("AllLocalImages")
    @Expose
    private Boolean AllLocalImages;

    /**
    * 仓库镜像是否全部授权的标识，优先权高于根据镜像ids授权。等于true时需UpdatedRegistryImageCnt大于0。
    */
    @SerializedName("AllRegistryImages")
    @Expose
    private Boolean AllRegistryImages;

    /**
    * 指定操作授权的本地镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略。
    */
    @SerializedName("UpdatedLocalImageCnt")
    @Expose
    private Long UpdatedLocalImageCnt;

    /**
    * 指定操作授权的仓库镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略；
    */
    @SerializedName("UpdatedRegistryImageCnt")
    @Expose
    private Long UpdatedRegistryImageCnt;

    /**
    * 根据满足条件的本地镜像授权,本地镜像来源；ASSETIMAGE:本地镜像列表；IMAGEALL:同步本地镜像；AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要
    */
    @SerializedName("ImageSourceType")
    @Expose
    private String ImageSourceType;

    /**
    * 根据满足条件的本地镜像授权，AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要。
    */
    @SerializedName("LocalImageFilter")
    @Expose
    private AssetFilters [] LocalImageFilter;

    /**
    * 根据满足条件的仓库镜像授权，AllRegistryImages为false且RegistryImageIds为空和UpdatedRegistryImageCnt大于0时，需要。
    */
    @SerializedName("RegistryImageFilter")
    @Expose
    private AssetFilters [] RegistryImageFilter;

    /**
    * 根据满足条件的镜像授权,同时排除的本地镜像。
    */
    @SerializedName("ExcludeLocalImageIds")
    @Expose
    private String [] ExcludeLocalImageIds;

    /**
    * 根据满足条件的镜像授权,同时排除的仓库镜像。
    */
    @SerializedName("ExcludeRegistryImageIds")
    @Expose
    private String [] ExcludeRegistryImageIds;

    /**
    * 根据本地镜像ids授权，优先权高于根据满足条件的镜像授权。AllLocalImages为false且LocalImageFilter为空和UpdatedLocalImageCnt大于0时，需要。
    */
    @SerializedName("LocalImageIds")
    @Expose
    private String [] LocalImageIds;

    /**
    * 根据仓库镜像Ids授权，优先权高于根据满足条件的镜像授。AllRegistryImages为false且RegistryImageFilter为空和UpdatedRegistryImageCnt大于0时，需要。
    */
    @SerializedName("RegistryImageIds")
    @Expose
    private String [] RegistryImageIds;

    /**
    * 是否仅最新的镜像；RegistryImageFilter不为空且UpdatedRegistryImageCnt大于0时仓库镜像需要。
    */
    @SerializedName("OnlyShowLatest")
    @Expose
    private Boolean OnlyShowLatest;

    /**
     * Get 本地镜像是否全部授权的标识，优先权高于根据本地镜像ids授权。等于true时需UpdatedLocalImageCnt大于0。 
     * @return AllLocalImages 本地镜像是否全部授权的标识，优先权高于根据本地镜像ids授权。等于true时需UpdatedLocalImageCnt大于0。
     */
    public Boolean getAllLocalImages() {
        return this.AllLocalImages;
    }

    /**
     * Set 本地镜像是否全部授权的标识，优先权高于根据本地镜像ids授权。等于true时需UpdatedLocalImageCnt大于0。
     * @param AllLocalImages 本地镜像是否全部授权的标识，优先权高于根据本地镜像ids授权。等于true时需UpdatedLocalImageCnt大于0。
     */
    public void setAllLocalImages(Boolean AllLocalImages) {
        this.AllLocalImages = AllLocalImages;
    }

    /**
     * Get 仓库镜像是否全部授权的标识，优先权高于根据镜像ids授权。等于true时需UpdatedRegistryImageCnt大于0。 
     * @return AllRegistryImages 仓库镜像是否全部授权的标识，优先权高于根据镜像ids授权。等于true时需UpdatedRegistryImageCnt大于0。
     */
    public Boolean getAllRegistryImages() {
        return this.AllRegistryImages;
    }

    /**
     * Set 仓库镜像是否全部授权的标识，优先权高于根据镜像ids授权。等于true时需UpdatedRegistryImageCnt大于0。
     * @param AllRegistryImages 仓库镜像是否全部授权的标识，优先权高于根据镜像ids授权。等于true时需UpdatedRegistryImageCnt大于0。
     */
    public void setAllRegistryImages(Boolean AllRegistryImages) {
        this.AllRegistryImages = AllRegistryImages;
    }

    /**
     * Get 指定操作授权的本地镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略。 
     * @return UpdatedLocalImageCnt 指定操作授权的本地镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略。
     */
    public Long getUpdatedLocalImageCnt() {
        return this.UpdatedLocalImageCnt;
    }

    /**
     * Set 指定操作授权的本地镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略。
     * @param UpdatedLocalImageCnt 指定操作授权的本地镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略。
     */
    public void setUpdatedLocalImageCnt(Long UpdatedLocalImageCnt) {
        this.UpdatedLocalImageCnt = UpdatedLocalImageCnt;
    }

    /**
     * Get 指定操作授权的仓库镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略； 
     * @return UpdatedRegistryImageCnt 指定操作授权的仓库镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略；
     */
    public Long getUpdatedRegistryImageCnt() {
        return this.UpdatedRegistryImageCnt;
    }

    /**
     * Set 指定操作授权的仓库镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略；
     * @param UpdatedRegistryImageCnt 指定操作授权的仓库镜像数量，判断优先权最高，实际多出的镜像随机忽略，实际不足的部分也忽略；
     */
    public void setUpdatedRegistryImageCnt(Long UpdatedRegistryImageCnt) {
        this.UpdatedRegistryImageCnt = UpdatedRegistryImageCnt;
    }

    /**
     * Get 根据满足条件的本地镜像授权,本地镜像来源；ASSETIMAGE:本地镜像列表；IMAGEALL:同步本地镜像；AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要 
     * @return ImageSourceType 根据满足条件的本地镜像授权,本地镜像来源；ASSETIMAGE:本地镜像列表；IMAGEALL:同步本地镜像；AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要
     */
    public String getImageSourceType() {
        return this.ImageSourceType;
    }

    /**
     * Set 根据满足条件的本地镜像授权,本地镜像来源；ASSETIMAGE:本地镜像列表；IMAGEALL:同步本地镜像；AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要
     * @param ImageSourceType 根据满足条件的本地镜像授权,本地镜像来源；ASSETIMAGE:本地镜像列表；IMAGEALL:同步本地镜像；AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要
     */
    public void setImageSourceType(String ImageSourceType) {
        this.ImageSourceType = ImageSourceType;
    }

    /**
     * Get 根据满足条件的本地镜像授权，AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要。 
     * @return LocalImageFilter 根据满足条件的本地镜像授权，AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要。
     */
    public AssetFilters [] getLocalImageFilter() {
        return this.LocalImageFilter;
    }

    /**
     * Set 根据满足条件的本地镜像授权，AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要。
     * @param LocalImageFilter 根据满足条件的本地镜像授权，AllLocalImages为false且LocalImageIds为空和UpdatedLocalImageCnt大于0时，需要。
     */
    public void setLocalImageFilter(AssetFilters [] LocalImageFilter) {
        this.LocalImageFilter = LocalImageFilter;
    }

    /**
     * Get 根据满足条件的仓库镜像授权，AllRegistryImages为false且RegistryImageIds为空和UpdatedRegistryImageCnt大于0时，需要。 
     * @return RegistryImageFilter 根据满足条件的仓库镜像授权，AllRegistryImages为false且RegistryImageIds为空和UpdatedRegistryImageCnt大于0时，需要。
     */
    public AssetFilters [] getRegistryImageFilter() {
        return this.RegistryImageFilter;
    }

    /**
     * Set 根据满足条件的仓库镜像授权，AllRegistryImages为false且RegistryImageIds为空和UpdatedRegistryImageCnt大于0时，需要。
     * @param RegistryImageFilter 根据满足条件的仓库镜像授权，AllRegistryImages为false且RegistryImageIds为空和UpdatedRegistryImageCnt大于0时，需要。
     */
    public void setRegistryImageFilter(AssetFilters [] RegistryImageFilter) {
        this.RegistryImageFilter = RegistryImageFilter;
    }

    /**
     * Get 根据满足条件的镜像授权,同时排除的本地镜像。 
     * @return ExcludeLocalImageIds 根据满足条件的镜像授权,同时排除的本地镜像。
     */
    public String [] getExcludeLocalImageIds() {
        return this.ExcludeLocalImageIds;
    }

    /**
     * Set 根据满足条件的镜像授权,同时排除的本地镜像。
     * @param ExcludeLocalImageIds 根据满足条件的镜像授权,同时排除的本地镜像。
     */
    public void setExcludeLocalImageIds(String [] ExcludeLocalImageIds) {
        this.ExcludeLocalImageIds = ExcludeLocalImageIds;
    }

    /**
     * Get 根据满足条件的镜像授权,同时排除的仓库镜像。 
     * @return ExcludeRegistryImageIds 根据满足条件的镜像授权,同时排除的仓库镜像。
     */
    public String [] getExcludeRegistryImageIds() {
        return this.ExcludeRegistryImageIds;
    }

    /**
     * Set 根据满足条件的镜像授权,同时排除的仓库镜像。
     * @param ExcludeRegistryImageIds 根据满足条件的镜像授权,同时排除的仓库镜像。
     */
    public void setExcludeRegistryImageIds(String [] ExcludeRegistryImageIds) {
        this.ExcludeRegistryImageIds = ExcludeRegistryImageIds;
    }

    /**
     * Get 根据本地镜像ids授权，优先权高于根据满足条件的镜像授权。AllLocalImages为false且LocalImageFilter为空和UpdatedLocalImageCnt大于0时，需要。 
     * @return LocalImageIds 根据本地镜像ids授权，优先权高于根据满足条件的镜像授权。AllLocalImages为false且LocalImageFilter为空和UpdatedLocalImageCnt大于0时，需要。
     */
    public String [] getLocalImageIds() {
        return this.LocalImageIds;
    }

    /**
     * Set 根据本地镜像ids授权，优先权高于根据满足条件的镜像授权。AllLocalImages为false且LocalImageFilter为空和UpdatedLocalImageCnt大于0时，需要。
     * @param LocalImageIds 根据本地镜像ids授权，优先权高于根据满足条件的镜像授权。AllLocalImages为false且LocalImageFilter为空和UpdatedLocalImageCnt大于0时，需要。
     */
    public void setLocalImageIds(String [] LocalImageIds) {
        this.LocalImageIds = LocalImageIds;
    }

    /**
     * Get 根据仓库镜像Ids授权，优先权高于根据满足条件的镜像授。AllRegistryImages为false且RegistryImageFilter为空和UpdatedRegistryImageCnt大于0时，需要。 
     * @return RegistryImageIds 根据仓库镜像Ids授权，优先权高于根据满足条件的镜像授。AllRegistryImages为false且RegistryImageFilter为空和UpdatedRegistryImageCnt大于0时，需要。
     */
    public String [] getRegistryImageIds() {
        return this.RegistryImageIds;
    }

    /**
     * Set 根据仓库镜像Ids授权，优先权高于根据满足条件的镜像授。AllRegistryImages为false且RegistryImageFilter为空和UpdatedRegistryImageCnt大于0时，需要。
     * @param RegistryImageIds 根据仓库镜像Ids授权，优先权高于根据满足条件的镜像授。AllRegistryImages为false且RegistryImageFilter为空和UpdatedRegistryImageCnt大于0时，需要。
     */
    public void setRegistryImageIds(String [] RegistryImageIds) {
        this.RegistryImageIds = RegistryImageIds;
    }

    /**
     * Get 是否仅最新的镜像；RegistryImageFilter不为空且UpdatedRegistryImageCnt大于0时仓库镜像需要。 
     * @return OnlyShowLatest 是否仅最新的镜像；RegistryImageFilter不为空且UpdatedRegistryImageCnt大于0时仓库镜像需要。
     */
    public Boolean getOnlyShowLatest() {
        return this.OnlyShowLatest;
    }

    /**
     * Set 是否仅最新的镜像；RegistryImageFilter不为空且UpdatedRegistryImageCnt大于0时仓库镜像需要。
     * @param OnlyShowLatest 是否仅最新的镜像；RegistryImageFilter不为空且UpdatedRegistryImageCnt大于0时仓库镜像需要。
     */
    public void setOnlyShowLatest(Boolean OnlyShowLatest) {
        this.OnlyShowLatest = OnlyShowLatest;
    }

    public ModifyImageAuthorizedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageAuthorizedRequest(ModifyImageAuthorizedRequest source) {
        if (source.AllLocalImages != null) {
            this.AllLocalImages = new Boolean(source.AllLocalImages);
        }
        if (source.AllRegistryImages != null) {
            this.AllRegistryImages = new Boolean(source.AllRegistryImages);
        }
        if (source.UpdatedLocalImageCnt != null) {
            this.UpdatedLocalImageCnt = new Long(source.UpdatedLocalImageCnt);
        }
        if (source.UpdatedRegistryImageCnt != null) {
            this.UpdatedRegistryImageCnt = new Long(source.UpdatedRegistryImageCnt);
        }
        if (source.ImageSourceType != null) {
            this.ImageSourceType = new String(source.ImageSourceType);
        }
        if (source.LocalImageFilter != null) {
            this.LocalImageFilter = new AssetFilters[source.LocalImageFilter.length];
            for (int i = 0; i < source.LocalImageFilter.length; i++) {
                this.LocalImageFilter[i] = new AssetFilters(source.LocalImageFilter[i]);
            }
        }
        if (source.RegistryImageFilter != null) {
            this.RegistryImageFilter = new AssetFilters[source.RegistryImageFilter.length];
            for (int i = 0; i < source.RegistryImageFilter.length; i++) {
                this.RegistryImageFilter[i] = new AssetFilters(source.RegistryImageFilter[i]);
            }
        }
        if (source.ExcludeLocalImageIds != null) {
            this.ExcludeLocalImageIds = new String[source.ExcludeLocalImageIds.length];
            for (int i = 0; i < source.ExcludeLocalImageIds.length; i++) {
                this.ExcludeLocalImageIds[i] = new String(source.ExcludeLocalImageIds[i]);
            }
        }
        if (source.ExcludeRegistryImageIds != null) {
            this.ExcludeRegistryImageIds = new String[source.ExcludeRegistryImageIds.length];
            for (int i = 0; i < source.ExcludeRegistryImageIds.length; i++) {
                this.ExcludeRegistryImageIds[i] = new String(source.ExcludeRegistryImageIds[i]);
            }
        }
        if (source.LocalImageIds != null) {
            this.LocalImageIds = new String[source.LocalImageIds.length];
            for (int i = 0; i < source.LocalImageIds.length; i++) {
                this.LocalImageIds[i] = new String(source.LocalImageIds[i]);
            }
        }
        if (source.RegistryImageIds != null) {
            this.RegistryImageIds = new String[source.RegistryImageIds.length];
            for (int i = 0; i < source.RegistryImageIds.length; i++) {
                this.RegistryImageIds[i] = new String(source.RegistryImageIds[i]);
            }
        }
        if (source.OnlyShowLatest != null) {
            this.OnlyShowLatest = new Boolean(source.OnlyShowLatest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllLocalImages", this.AllLocalImages);
        this.setParamSimple(map, prefix + "AllRegistryImages", this.AllRegistryImages);
        this.setParamSimple(map, prefix + "UpdatedLocalImageCnt", this.UpdatedLocalImageCnt);
        this.setParamSimple(map, prefix + "UpdatedRegistryImageCnt", this.UpdatedRegistryImageCnt);
        this.setParamSimple(map, prefix + "ImageSourceType", this.ImageSourceType);
        this.setParamArrayObj(map, prefix + "LocalImageFilter.", this.LocalImageFilter);
        this.setParamArrayObj(map, prefix + "RegistryImageFilter.", this.RegistryImageFilter);
        this.setParamArraySimple(map, prefix + "ExcludeLocalImageIds.", this.ExcludeLocalImageIds);
        this.setParamArraySimple(map, prefix + "ExcludeRegistryImageIds.", this.ExcludeRegistryImageIds);
        this.setParamArraySimple(map, prefix + "LocalImageIds.", this.LocalImageIds);
        this.setParamArraySimple(map, prefix + "RegistryImageIds.", this.RegistryImageIds);
        this.setParamSimple(map, prefix + "OnlyShowLatest", this.OnlyShowLatest);

    }
}

