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
    * <p>镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像</p>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>TCR镜像对应的地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>TCR镜像对应的实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>是否允许导出全部内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowSaveAllContent")
    @Expose
    private Boolean AllowSaveAllContent;

    /**
    * <p>镜像名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>是否支持数据构建</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDataPipeline")
    @Expose
    private Boolean SupportDataPipeline;

    /**
    * <p>镜像仓库用户名密码信息(仅当ImageType为CUSTOM第三方镜像的时候需要)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSecret")
    @Expose
    private ImageSecret ImageSecret;

    /**
     * Get <p>镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像</p> 
     * @return ImageType <p>镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像</p>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像</p>
     * @param ImageType <p>镜像类型：TCR为腾讯云TCR镜像; CCR为腾讯云TCR个人版镜像，PreSet为平台预置镜像，CUSTOM为第三方自定义镜像</p>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return ImageUrl <p>镜像地址</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>镜像地址</p>
     * @param ImageUrl <p>镜像地址</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>TCR镜像对应的地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryRegion <p>TCR镜像对应的地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>TCR镜像对应的地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryRegion <p>TCR镜像对应的地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>TCR镜像对应的实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId <p>TCR镜像对应的实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>TCR镜像对应的实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId <p>TCR镜像对应的实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>是否允许导出全部内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowSaveAllContent <p>是否允许导出全部内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowSaveAllContent() {
        return this.AllowSaveAllContent;
    }

    /**
     * Set <p>是否允许导出全部内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowSaveAllContent <p>是否允许导出全部内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowSaveAllContent(Boolean AllowSaveAllContent) {
        this.AllowSaveAllContent = AllowSaveAllContent;
    }

    /**
     * Get <p>镜像名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName <p>镜像名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName <p>镜像名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>是否支持数据构建</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDataPipeline <p>是否支持数据构建</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDataPipeline() {
        return this.SupportDataPipeline;
    }

    /**
     * Set <p>是否支持数据构建</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDataPipeline <p>是否支持数据构建</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDataPipeline(Boolean SupportDataPipeline) {
        this.SupportDataPipeline = SupportDataPipeline;
    }

    /**
     * Get <p>镜像仓库用户名密码信息(仅当ImageType为CUSTOM第三方镜像的时候需要)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSecret <p>镜像仓库用户名密码信息(仅当ImageType为CUSTOM第三方镜像的时候需要)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageSecret getImageSecret() {
        return this.ImageSecret;
    }

    /**
     * Set <p>镜像仓库用户名密码信息(仅当ImageType为CUSTOM第三方镜像的时候需要)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSecret <p>镜像仓库用户名密码信息(仅当ImageType为CUSTOM第三方镜像的时候需要)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSecret(ImageSecret ImageSecret) {
        this.ImageSecret = ImageSecret;
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
        if (source.ImageSecret != null) {
            this.ImageSecret = new ImageSecret(source.ImageSecret);
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
        this.setParamObj(map, prefix + "ImageSecret.", this.ImageSecret);

    }
}

