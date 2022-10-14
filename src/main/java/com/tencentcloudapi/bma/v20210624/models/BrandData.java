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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrandData extends AbstractModel{

    /**
    * 商标名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 商标证明
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * 商标审核状态 1-审核中 2-审核未通过 3-审核通过
    */
    @SerializedName("BrandStatus")
    @Expose
    private Long BrandStatus;

    /**
    * 审核说明
    */
    @SerializedName("BrandNote")
    @Expose
    private String BrandNote;

    /**
    * 商标转让证明
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
    * 商标转让证明审核状态
    */
    @SerializedName("TransferStatus")
    @Expose
    private Long TransferStatus;

    /**
    * 审核说明 1-审核中 2-审核未通过 3-审核通过
    */
    @SerializedName("TransferNote")
    @Expose
    private String TransferNote;

    /**
     * Get 商标名称 
     * @return BrandName 商标名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 商标名称
     * @param BrandName 商标名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 商标证明 
     * @return BrandCertificateName 商标证明
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set 商标证明
     * @param BrandCertificateName 商标证明
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get 商标审核状态 1-审核中 2-审核未通过 3-审核通过 
     * @return BrandStatus 商标审核状态 1-审核中 2-审核未通过 3-审核通过
     */
    public Long getBrandStatus() {
        return this.BrandStatus;
    }

    /**
     * Set 商标审核状态 1-审核中 2-审核未通过 3-审核通过
     * @param BrandStatus 商标审核状态 1-审核中 2-审核未通过 3-审核通过
     */
    public void setBrandStatus(Long BrandStatus) {
        this.BrandStatus = BrandStatus;
    }

    /**
     * Get 审核说明 
     * @return BrandNote 审核说明
     */
    public String getBrandNote() {
        return this.BrandNote;
    }

    /**
     * Set 审核说明
     * @param BrandNote 审核说明
     */
    public void setBrandNote(String BrandNote) {
        this.BrandNote = BrandNote;
    }

    /**
     * Get 商标转让证明 
     * @return TransferName 商标转让证明
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set 商标转让证明
     * @param TransferName 商标转让证明
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    /**
     * Get 商标转让证明审核状态 
     * @return TransferStatus 商标转让证明审核状态
     */
    public Long getTransferStatus() {
        return this.TransferStatus;
    }

    /**
     * Set 商标转让证明审核状态
     * @param TransferStatus 商标转让证明审核状态
     */
    public void setTransferStatus(Long TransferStatus) {
        this.TransferStatus = TransferStatus;
    }

    /**
     * Get 审核说明 1-审核中 2-审核未通过 3-审核通过 
     * @return TransferNote 审核说明 1-审核中 2-审核未通过 3-审核通过
     */
    public String getTransferNote() {
        return this.TransferNote;
    }

    /**
     * Set 审核说明 1-审核中 2-审核未通过 3-审核通过
     * @param TransferNote 审核说明 1-审核中 2-审核未通过 3-审核通过
     */
    public void setTransferNote(String TransferNote) {
        this.TransferNote = TransferNote;
    }

    public BrandData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrandData(BrandData source) {
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BrandCertificateName != null) {
            this.BrandCertificateName = new String(source.BrandCertificateName);
        }
        if (source.BrandStatus != null) {
            this.BrandStatus = new Long(source.BrandStatus);
        }
        if (source.BrandNote != null) {
            this.BrandNote = new String(source.BrandNote);
        }
        if (source.TransferName != null) {
            this.TransferName = new String(source.TransferName);
        }
        if (source.TransferStatus != null) {
            this.TransferStatus = new Long(source.TransferStatus);
        }
        if (source.TransferNote != null) {
            this.TransferNote = new String(source.TransferNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BrandCertificateName", this.BrandCertificateName);
        this.setParamSimple(map, prefix + "BrandStatus", this.BrandStatus);
        this.setParamSimple(map, prefix + "BrandNote", this.BrandNote);
        this.setParamSimple(map, prefix + "TransferName", this.TransferName);
        this.setParamSimple(map, prefix + "TransferStatus", this.TransferStatus);
        this.setParamSimple(map, prefix + "TransferNote", this.TransferNote);

    }
}

