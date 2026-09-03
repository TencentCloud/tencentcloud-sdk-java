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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel {

    /**
    * <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/362/2353">云硬盘类型</a>。取值范围</p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><li>默认取值：CLOUD_PREMIUM。</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>系统盘大小，单位：GB。默认值为 50</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>是否加密系统盘。TRUE 表示加密，FALSE 表示不加密；具体盘型、地域及 KMS 规则由 CVM 校验。</p>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>系统盘加密使用的 KMS 密钥 ID。密钥有效性、权限以及与盘型和地域的适配性由 CVM 校验。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/362/2353">云硬盘类型</a>。取值范围</p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><li>默认取值：CLOUD_PREMIUM。</li> 
     * @return DiskType <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/362/2353">云硬盘类型</a>。取值范围</p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><li>默认取值：CLOUD_PREMIUM。</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/362/2353">云硬盘类型</a>。取值范围</p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><li>默认取值：CLOUD_PREMIUM。</li>
     * @param DiskType <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/362/2353">云硬盘类型</a>。取值范围</p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><li>默认取值：CLOUD_PREMIUM。</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>系统盘大小，单位：GB。默认值为 50</p> 
     * @return DiskSize <p>系统盘大小，单位：GB。默认值为 50</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>系统盘大小，单位：GB。默认值为 50</p>
     * @param DiskSize <p>系统盘大小，单位：GB。默认值为 50</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>是否加密系统盘。TRUE 表示加密，FALSE 表示不加密；具体盘型、地域及 KMS 规则由 CVM 校验。</p> 
     * @return Encrypt <p>是否加密系统盘。TRUE 表示加密，FALSE 表示不加密；具体盘型、地域及 KMS 规则由 CVM 校验。</p>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>是否加密系统盘。TRUE 表示加密，FALSE 表示不加密；具体盘型、地域及 KMS 规则由 CVM 校验。</p>
     * @param Encrypt <p>是否加密系统盘。TRUE 表示加密，FALSE 表示不加密；具体盘型、地域及 KMS 规则由 CVM 校验。</p>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>系统盘加密使用的 KMS 密钥 ID。密钥有效性、权限以及与盘型和地域的适配性由 CVM 校验。</p> 
     * @return KmsKeyId <p>系统盘加密使用的 KMS 密钥 ID。密钥有效性、权限以及与盘型和地域的适配性由 CVM 校验。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>系统盘加密使用的 KMS 密钥 ID。密钥有效性、权限以及与盘型和地域的适配性由 CVM 校验。</p>
     * @param KmsKeyId <p>系统盘加密使用的 KMS 密钥 ID。密钥有效性、权限以及与盘型和地域的适配性由 CVM 校验。</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    public SystemDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemDisk(SystemDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

