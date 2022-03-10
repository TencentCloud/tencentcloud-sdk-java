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

public class CreateImageCacheRequest extends AbstractModel{

    /**
    * 用于制作镜像缓存的容器镜像列表
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 实例所属子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例所属VPC Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 镜像缓存名称
    */
    @SerializedName("ImageCacheName")
    @Expose
    private String ImageCacheName;

    /**
    * 安全组Id
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 镜像仓库凭证数组
    */
    @SerializedName("ImageRegistryCredentials")
    @Expose
    private ImageRegistryCredential [] ImageRegistryCredentials;

    /**
    * 用来绑定容器实例的已有EIP
    */
    @SerializedName("ExistedEipId")
    @Expose
    private String ExistedEipId;

    /**
    * 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
    */
    @SerializedName("AutoCreateEip")
    @Expose
    private Boolean AutoCreateEip;

    /**
    * 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
    */
    @SerializedName("AutoCreateEipAttribute")
    @Expose
    private EipAttribute AutoCreateEipAttribute;

    /**
    * 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
    */
    @SerializedName("ImageCacheSize")
    @Expose
    private Long ImageCacheSize;

    /**
    * 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
     * Get 用于制作镜像缓存的容器镜像列表 
     * @return Images 用于制作镜像缓存的容器镜像列表
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 用于制作镜像缓存的容器镜像列表
     * @param Images 用于制作镜像缓存的容器镜像列表
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 实例所属子网Id 
     * @return SubnetId 实例所属子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例所属子网Id
     * @param SubnetId 实例所属子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例所属VPC Id 
     * @return VpcId 实例所属VPC Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所属VPC Id
     * @param VpcId 实例所属VPC Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get 安全组Id 
     * @return SecurityGroupIds 安全组Id
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组Id
     * @param SecurityGroupIds 安全组Id
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 镜像仓库凭证数组 
     * @return ImageRegistryCredentials 镜像仓库凭证数组
     */
    public ImageRegistryCredential [] getImageRegistryCredentials() {
        return this.ImageRegistryCredentials;
    }

    /**
     * Set 镜像仓库凭证数组
     * @param ImageRegistryCredentials 镜像仓库凭证数组
     */
    public void setImageRegistryCredentials(ImageRegistryCredential [] ImageRegistryCredentials) {
        this.ImageRegistryCredentials = ImageRegistryCredentials;
    }

    /**
     * Get 用来绑定容器实例的已有EIP 
     * @return ExistedEipId 用来绑定容器实例的已有EIP
     */
    public String getExistedEipId() {
        return this.ExistedEipId;
    }

    /**
     * Set 用来绑定容器实例的已有EIP
     * @param ExistedEipId 用来绑定容器实例的已有EIP
     */
    public void setExistedEipId(String ExistedEipId) {
        this.ExistedEipId = ExistedEipId;
    }

    /**
     * Get 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥 
     * @return AutoCreateEip 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     */
    public Boolean getAutoCreateEip() {
        return this.AutoCreateEip;
    }

    /**
     * Set 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     * @param AutoCreateEip 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     */
    public void setAutoCreateEip(Boolean AutoCreateEip) {
        this.AutoCreateEip = AutoCreateEip;
    }

    /**
     * Get 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥 
     * @return AutoCreateEipAttribute 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     */
    public EipAttribute getAutoCreateEipAttribute() {
        return this.AutoCreateEipAttribute;
    }

    /**
     * Set 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     * @param AutoCreateEipAttribute 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     */
    public void setAutoCreateEipAttribute(EipAttribute AutoCreateEipAttribute) {
        this.AutoCreateEipAttribute = AutoCreateEipAttribute;
    }

    /**
     * Get 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。 
     * @return ImageCacheSize 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     */
    public Long getImageCacheSize() {
        return this.ImageCacheSize;
    }

    /**
     * Set 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     * @param ImageCacheSize 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     */
    public void setImageCacheSize(Long ImageCacheSize) {
        this.ImageCacheSize = ImageCacheSize;
    }

    /**
     * Get 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。 
     * @return RetentionDays 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     * @param RetentionDays 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    public CreateImageCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageCacheRequest(CreateImageCacheRequest source) {
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ImageCacheName != null) {
            this.ImageCacheName = new String(source.ImageCacheName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ImageRegistryCredentials != null) {
            this.ImageRegistryCredentials = new ImageRegistryCredential[source.ImageRegistryCredentials.length];
            for (int i = 0; i < source.ImageRegistryCredentials.length; i++) {
                this.ImageRegistryCredentials[i] = new ImageRegistryCredential(source.ImageRegistryCredentials[i]);
            }
        }
        if (source.ExistedEipId != null) {
            this.ExistedEipId = new String(source.ExistedEipId);
        }
        if (source.AutoCreateEip != null) {
            this.AutoCreateEip = new Boolean(source.AutoCreateEip);
        }
        if (source.AutoCreateEipAttribute != null) {
            this.AutoCreateEipAttribute = new EipAttribute(source.AutoCreateEipAttribute);
        }
        if (source.ImageCacheSize != null) {
            this.ImageCacheSize = new Long(source.ImageCacheSize);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ImageCacheName", this.ImageCacheName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "ImageRegistryCredentials.", this.ImageRegistryCredentials);
        this.setParamSimple(map, prefix + "ExistedEipId", this.ExistedEipId);
        this.setParamSimple(map, prefix + "AutoCreateEip", this.AutoCreateEip);
        this.setParamObj(map, prefix + "AutoCreateEipAttribute.", this.AutoCreateEipAttribute);
        this.setParamSimple(map, prefix + "ImageCacheSize", this.ImageCacheSize);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);

    }
}

