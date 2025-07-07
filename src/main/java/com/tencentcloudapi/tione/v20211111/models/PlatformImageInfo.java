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

public class PlatformImageInfo extends AbstractModel {

    /**
    * 框架名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 镜像类型: ccr or tcr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * TCR镜像示例所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * TCR镜像所属实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 框架版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * 支持的gpu列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportGpuList")
    @Expose
    private String [] SupportGpuList;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 业务属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAttributes")
    @Expose
    private Attribute [] ExtraAttributes;

    /**
    * 镜像适用场景Train/Inference/Notebook
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageRange")
    @Expose
    private String [] ImageRange;

    /**
    * 是否支持分布式部署
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDistributedDeploy")
    @Expose
    private Boolean SupportDistributedDeploy;

    /**
    * 支持的地域 all(所有地域)/autonomous(自动驾驶地域)/general(通用地域)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionScope")
    @Expose
    private String RegionScope;

    /**
     * Get 框架名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Framework 框架名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 框架名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Framework 框架名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get 镜像类型: ccr or tcr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageType 镜像类型: ccr or tcr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型: ccr or tcr
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageType 镜像类型: ccr or tcr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get TCR镜像示例所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryRegion TCR镜像示例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set TCR镜像示例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryRegion TCR镜像示例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get TCR镜像所属实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId TCR镜像所属实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set TCR镜像所属实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId TCR镜像所属实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
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
     * Get 镜像Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 框架版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get 支持的gpu列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportGpuList 支持的gpu列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportGpuList() {
        return this.SupportGpuList;
    }

    /**
     * Set 支持的gpu列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportGpuList 支持的gpu列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportGpuList(String [] SupportGpuList) {
        this.SupportGpuList = SupportGpuList;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 业务属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAttributes 业务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute [] getExtraAttributes() {
        return this.ExtraAttributes;
    }

    /**
     * Set 业务属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAttributes 业务属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAttributes(Attribute [] ExtraAttributes) {
        this.ExtraAttributes = ExtraAttributes;
    }

    /**
     * Get 镜像适用场景Train/Inference/Notebook
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageRange 镜像适用场景Train/Inference/Notebook
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageRange() {
        return this.ImageRange;
    }

    /**
     * Set 镜像适用场景Train/Inference/Notebook
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageRange 镜像适用场景Train/Inference/Notebook
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageRange(String [] ImageRange) {
        this.ImageRange = ImageRange;
    }

    /**
     * Get 是否支持分布式部署
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDistributedDeploy 是否支持分布式部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDistributedDeploy() {
        return this.SupportDistributedDeploy;
    }

    /**
     * Set 是否支持分布式部署
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDistributedDeploy 是否支持分布式部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDistributedDeploy(Boolean SupportDistributedDeploy) {
        this.SupportDistributedDeploy = SupportDistributedDeploy;
    }

    /**
     * Get 支持的地域 all(所有地域)/autonomous(自动驾驶地域)/general(通用地域)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionScope 支持的地域 all(所有地域)/autonomous(自动驾驶地域)/general(通用地域)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionScope() {
        return this.RegionScope;
    }

    /**
     * Set 支持的地域 all(所有地域)/autonomous(自动驾驶地域)/general(通用地域)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionScope 支持的地域 all(所有地域)/autonomous(自动驾驶地域)/general(通用地域)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionScope(String RegionScope) {
        this.RegionScope = RegionScope;
    }

    public PlatformImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformImageInfo(PlatformImageInfo source) {
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
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
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.SupportGpuList != null) {
            this.SupportGpuList = new String[source.SupportGpuList.length];
            for (int i = 0; i < source.SupportGpuList.length; i++) {
                this.SupportGpuList[i] = new String(source.SupportGpuList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ExtraAttributes != null) {
            this.ExtraAttributes = new Attribute[source.ExtraAttributes.length];
            for (int i = 0; i < source.ExtraAttributes.length; i++) {
                this.ExtraAttributes[i] = new Attribute(source.ExtraAttributes[i]);
            }
        }
        if (source.ImageRange != null) {
            this.ImageRange = new String[source.ImageRange.length];
            for (int i = 0; i < source.ImageRange.length; i++) {
                this.ImageRange[i] = new String(source.ImageRange[i]);
            }
        }
        if (source.SupportDistributedDeploy != null) {
            this.SupportDistributedDeploy = new Boolean(source.SupportDistributedDeploy);
        }
        if (source.RegionScope != null) {
            this.RegionScope = new String(source.RegionScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamArraySimple(map, prefix + "SupportGpuList.", this.SupportGpuList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ExtraAttributes.", this.ExtraAttributes);
        this.setParamArraySimple(map, prefix + "ImageRange.", this.ImageRange);
        this.setParamSimple(map, prefix + "SupportDistributedDeploy", this.SupportDistributedDeploy);
        this.setParamSimple(map, prefix + "RegionScope", this.RegionScope);

    }
}

