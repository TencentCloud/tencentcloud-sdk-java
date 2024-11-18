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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewCertificate extends AbstractModel {

    /**
    * 刷新证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TempCertificate")
    @Expose
    private CertificateInfo TempCertificate;

    /**
     * Get 刷新证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TempCertificate 刷新证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateInfo getTempCertificate() {
        return this.TempCertificate;
    }

    /**
     * Set 刷新证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TempCertificate 刷新证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTempCertificate(CertificateInfo TempCertificate) {
        this.TempCertificate = TempCertificate;
    }

    public RenewCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewCertificate(RenewCertificate source) {
        if (source.TempCertificate != null) {
            this.TempCertificate = new CertificateInfo(source.TempCertificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TempCertificate.", this.TempCertificate);

    }
}

