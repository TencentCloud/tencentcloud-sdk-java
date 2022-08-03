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
    * xxx
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * xxx
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * xxx
    */
    @SerializedName("BrandStatus")
    @Expose
    private Long BrandStatus;

    /**
    * xxx
    */
    @SerializedName("BrandNote")
    @Expose
    private String BrandNote;

    /**
    * xxx
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
    * xxx
    */
    @SerializedName("TransferStatus")
    @Expose
    private Long TransferStatus;

    /**
    * xxx
    */
    @SerializedName("TransferNote")
    @Expose
    private String TransferNote;

    /**
     * Get xxx 
     * @return BrandName xxx
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set xxx
     * @param BrandName xxx
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get xxx 
     * @return BrandCertificateName xxx
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set xxx
     * @param BrandCertificateName xxx
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get xxx 
     * @return BrandStatus xxx
     */
    public Long getBrandStatus() {
        return this.BrandStatus;
    }

    /**
     * Set xxx
     * @param BrandStatus xxx
     */
    public void setBrandStatus(Long BrandStatus) {
        this.BrandStatus = BrandStatus;
    }

    /**
     * Get xxx 
     * @return BrandNote xxx
     */
    public String getBrandNote() {
        return this.BrandNote;
    }

    /**
     * Set xxx
     * @param BrandNote xxx
     */
    public void setBrandNote(String BrandNote) {
        this.BrandNote = BrandNote;
    }

    /**
     * Get xxx 
     * @return TransferName xxx
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set xxx
     * @param TransferName xxx
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    /**
     * Get xxx 
     * @return TransferStatus xxx
     */
    public Long getTransferStatus() {
        return this.TransferStatus;
    }

    /**
     * Set xxx
     * @param TransferStatus xxx
     */
    public void setTransferStatus(Long TransferStatus) {
        this.TransferStatus = TransferStatus;
    }

    /**
     * Get xxx 
     * @return TransferNote xxx
     */
    public String getTransferNote() {
        return this.TransferNote;
    }

    /**
     * Set xxx
     * @param TransferNote xxx
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

