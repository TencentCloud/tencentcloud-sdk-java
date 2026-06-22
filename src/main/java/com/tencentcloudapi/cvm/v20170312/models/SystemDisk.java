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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel {

    /**
    * <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/213/4952">存储概述</a>。取值范围：<br></p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><br>默认取值：当前有库存的硬盘类型。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>系统盘ID。<br>该参数目前仅用于 <a href="https://cloud.tencent.com/document/product/213/15728">DescribeInstances</a> 等查询类接口的返回参数，不可用于 <a href="https://cloud.tencent.com/document/product/213/15730">RunInstances</a> 等写接口的入参。</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>系统盘大小，单位：GiB。默认值为 50</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>所属的独享集群ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>磁盘名称，长度不超过128 个字符。</p>
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * <p>系统盘是否加密。取值范围：true：加密false：不加密默认取值：false该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/213/4952">存储概述</a>。取值范围：<br></p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><br>默认取值：当前有库存的硬盘类型。 
     * @return DiskType <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/213/4952">存储概述</a>。取值范围：<br></p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><br>默认取值：当前有库存的硬盘类型。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/213/4952">存储概述</a>。取值范围：<br></p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><br>默认取值：当前有库存的硬盘类型。
     * @param DiskType <p>系统盘类型。系统盘类型限制详见<a href="https://cloud.tencent.com/document/product/213/4952">存储概述</a>。取值范围：<br></p><li>LOCAL_BASIC：本地硬盘</li><li>LOCAL_SSD：本地SSD硬盘</li><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_BSSD：通用型SSD云硬盘</li><li>CLOUD_HSSD：增强型SSD云硬盘</li><li>CLOUD_TSSD：极速型SSD云硬盘</li><br>默认取值：当前有库存的硬盘类型。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>系统盘ID。<br>该参数目前仅用于 <a href="https://cloud.tencent.com/document/product/213/15728">DescribeInstances</a> 等查询类接口的返回参数，不可用于 <a href="https://cloud.tencent.com/document/product/213/15730">RunInstances</a> 等写接口的入参。</p> 
     * @return DiskId <p>系统盘ID。<br>该参数目前仅用于 <a href="https://cloud.tencent.com/document/product/213/15728">DescribeInstances</a> 等查询类接口的返回参数，不可用于 <a href="https://cloud.tencent.com/document/product/213/15730">RunInstances</a> 等写接口的入参。</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>系统盘ID。<br>该参数目前仅用于 <a href="https://cloud.tencent.com/document/product/213/15728">DescribeInstances</a> 等查询类接口的返回参数，不可用于 <a href="https://cloud.tencent.com/document/product/213/15730">RunInstances</a> 等写接口的入参。</p>
     * @param DiskId <p>系统盘ID。<br>该参数目前仅用于 <a href="https://cloud.tencent.com/document/product/213/15728">DescribeInstances</a> 等查询类接口的返回参数，不可用于 <a href="https://cloud.tencent.com/document/product/213/15730">RunInstances</a> 等写接口的入参。</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>系统盘大小，单位：GiB。默认值为 50</p> 
     * @return DiskSize <p>系统盘大小，单位：GiB。默认值为 50</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>系统盘大小，单位：GiB。默认值为 50</p>
     * @param DiskSize <p>系统盘大小，单位：GiB。默认值为 50</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>所属的独享集群ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId <p>所属的独享集群ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>所属的独享集群ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId <p>所属的独享集群ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>磁盘名称，长度不超过128 个字符。</p> 
     * @return DiskName <p>磁盘名称，长度不超过128 个字符。</p>
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set <p>磁盘名称，长度不超过128 个字符。</p>
     * @param DiskName <p>磁盘名称，长度不超过128 个字符。</p>
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get <p>系统盘是否加密。取值范围：true：加密false：不加密默认取值：false该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p> 
     * @return Encrypt <p>系统盘是否加密。取值范围：true：加密false：不加密默认取值：false该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>系统盘是否加密。取值范围：true：加密false：不加密默认取值：false该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
     * @param Encrypt <p>系统盘是否加密。取值范围：true：加密false：不加密默认取值：false该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p> 
     * @return KmsKeyId <p>自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
     * @param KmsKeyId <p>自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。该参数目前仅用于 RunInstances 接口。当前参数灰度中。</p>
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
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
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
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

