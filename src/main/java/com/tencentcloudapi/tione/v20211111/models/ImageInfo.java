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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * 镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 镜像地址
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * TCR镜像对应的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * TCR镜像对应的实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 是否允许导出全部内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowSaveAllContent")
    @Expose
    private Boolean AllowSaveAllContent;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 是否支持数据构建
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDataPipeline")
    @Expose
    private Boolean SupportDataPipeline;

    /**
     * Get 镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像 
     * @return ImageType 镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像
     * @param ImageType 镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 镜像地址 
     * @return ImageUrl 镜像地址
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像地址
     * @param ImageUrl 镜像地址
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get TCR镜像对应的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryRegion TCR镜像对应的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set TCR镜像对应的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryRegion TCR镜像对应的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get TCR镜像对应的实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId TCR镜像对应的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set TCR镜像对应的实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId TCR镜像对应的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 是否允许导出全部内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowSaveAllContent 是否允许导出全部内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowSaveAllContent() {
        return this.AllowSaveAllContent;
    }

    /**
     * Set 是否允许导出全部内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowSaveAllContent 是否允许导出全部内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowSaveAllContent(Boolean AllowSaveAllContent) {
        this.AllowSaveAllContent = AllowSaveAllContent;
    }

    /**
     * Get 镜像名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 是否支持数据构建
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDataPipeline 是否支持数据构建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDataPipeline() {
        return this.SupportDataPipeline;
    }

    /**
     * Set 是否支持数据构建
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDataPipeline 是否支持数据构建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDataPipeline(Boolean SupportDataPipeline) {
        this.SupportDataPipeline = SupportDataPipeline;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.AllowSaveAllContent != null) {
            this.AllowSaveAllContent = new Boolean(source.AllowSaveAllContent);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.SupportDataPipeline != null) {
            this.SupportDataPipeline = new Boolean(source.SupportDataPipeline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "AllowSaveAllContent", this.AllowSaveAllContent);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "SupportDataPipeline", this.SupportDataPipeline);

    }
}

