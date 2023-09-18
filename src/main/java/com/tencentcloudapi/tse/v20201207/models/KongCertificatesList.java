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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongCertificatesList extends AbstractModel{

    /**
    * 证书列表总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificatesList")
    @Expose
    private KongCertificatesPreview [] CertificatesList;

    /**
    * 证书列表总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
     * Get 证书列表总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 证书列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 证书列表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 证书列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificatesList 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KongCertificatesPreview [] getCertificatesList() {
        return this.CertificatesList;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificatesList 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificatesList(KongCertificatesPreview [] CertificatesList) {
        this.CertificatesList = CertificatesList;
    }

    /**
     * Get 证书列表总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pages 证书列表总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 证书列表总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pages 证书列表总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    public KongCertificatesList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongCertificatesList(KongCertificatesList source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CertificatesList != null) {
            this.CertificatesList = new KongCertificatesPreview[source.CertificatesList.length];
            for (int i = 0; i < source.CertificatesList.length; i++) {
                this.CertificatesList[i] = new KongCertificatesPreview(source.CertificatesList[i]);
            }
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "CertificatesList.", this.CertificatesList);
        this.setParamSimple(map, prefix + "Pages", this.Pages);

    }
}

