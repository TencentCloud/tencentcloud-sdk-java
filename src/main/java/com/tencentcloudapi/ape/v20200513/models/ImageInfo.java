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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel{

    /**
    * 图片Id
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 授权场景Id
    */
    @SerializedName("LicenseScopeId")
    @Expose
    private Long LicenseScopeId;

    /**
    * 尺寸名称Id
    */
    @SerializedName("DimensionsNameId")
    @Expose
    private Long DimensionsNameId;

    /**
     * Get 图片Id 
     * @return ImageId 图片Id
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 图片Id
     * @param ImageId 图片Id
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 授权场景Id 
     * @return LicenseScopeId 授权场景Id
     */
    public Long getLicenseScopeId() {
        return this.LicenseScopeId;
    }

    /**
     * Set 授权场景Id
     * @param LicenseScopeId 授权场景Id
     */
    public void setLicenseScopeId(Long LicenseScopeId) {
        this.LicenseScopeId = LicenseScopeId;
    }

    /**
     * Get 尺寸名称Id 
     * @return DimensionsNameId 尺寸名称Id
     */
    public Long getDimensionsNameId() {
        return this.DimensionsNameId;
    }

    /**
     * Set 尺寸名称Id
     * @param DimensionsNameId 尺寸名称Id
     */
    public void setDimensionsNameId(Long DimensionsNameId) {
        this.DimensionsNameId = DimensionsNameId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LicenseScopeId", this.LicenseScopeId);
        this.setParamSimple(map, prefix + "DimensionsNameId", this.DimensionsNameId);

    }
}

