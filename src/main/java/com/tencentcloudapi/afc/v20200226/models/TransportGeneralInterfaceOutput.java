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
package com.tencentcloudapi.afc.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransportGeneralInterfaceOutput extends AbstractModel{

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 回包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 公证处业务回包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotarizationData")
    @Expose
    private String NotarizationData;

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 回包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 回包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 回包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 回包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 公证处业务回包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotarizationData 公证处业务回包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotarizationData() {
        return this.NotarizationData;
    }

    /**
     * Set 公证处业务回包
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotarizationData 公证处业务回包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotarizationData(String NotarizationData) {
        this.NotarizationData = NotarizationData;
    }

    public TransportGeneralInterfaceOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransportGeneralInterfaceOutput(TransportGeneralInterfaceOutput source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NotarizationData != null) {
            this.NotarizationData = new String(source.NotarizationData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NotarizationData", this.NotarizationData);

    }
}

