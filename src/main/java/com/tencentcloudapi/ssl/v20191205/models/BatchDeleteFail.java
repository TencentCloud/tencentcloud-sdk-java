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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteFail extends AbstractModel {

    /**
    * 失败的证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
     * Get 失败的证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertId 失败的证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 失败的证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertId 失败的证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public BatchDeleteFail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteFail(BatchDeleteFail source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Msg", this.Msg);

    }
}

