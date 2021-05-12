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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryBillDownloadURLData extends AbstractModel{

    /**
    * 统一对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillDownloadURL")
    @Expose
    private String BillDownloadURL;

    /**
    * 渠道原始对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalBillDownloadURL")
    @Expose
    private String OriginalBillDownloadURL;

    /**
     * Get 统一对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillDownloadURL 统一对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillDownloadURL() {
        return this.BillDownloadURL;
    }

    /**
     * Set 统一对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillDownloadURL 统一对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillDownloadURL(String BillDownloadURL) {
        this.BillDownloadURL = BillDownloadURL;
    }

    /**
     * Get 渠道原始对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalBillDownloadURL 渠道原始对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalBillDownloadURL() {
        return this.OriginalBillDownloadURL;
    }

    /**
     * Set 渠道原始对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalBillDownloadURL 渠道原始对账单下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalBillDownloadURL(String OriginalBillDownloadURL) {
        this.OriginalBillDownloadURL = OriginalBillDownloadURL;
    }

    public QueryBillDownloadURLData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBillDownloadURLData(QueryBillDownloadURLData source) {
        if (source.BillDownloadURL != null) {
            this.BillDownloadURL = new String(source.BillDownloadURL);
        }
        if (source.OriginalBillDownloadURL != null) {
            this.OriginalBillDownloadURL = new String(source.OriginalBillDownloadURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillDownloadURL", this.BillDownloadURL);
        this.setParamSimple(map, prefix + "OriginalBillDownloadURL", this.OriginalBillDownloadURL);

    }
}

