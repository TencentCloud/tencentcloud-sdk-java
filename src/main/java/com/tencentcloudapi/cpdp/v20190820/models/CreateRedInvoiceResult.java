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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedInvoiceResult extends AbstractModel {

    /**
    * 错误消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 红票数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private CreateRedInvoiceResultData [] Data;

    /**
     * Get 错误消息 
     * @return Message 错误消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误消息
     * @param Message 错误消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 错误码 
     * @return Code 错误码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
     * @param Code 错误码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 红票数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 红票数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateRedInvoiceResultData [] getData() {
        return this.Data;
    }

    /**
     * Set 红票数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 红票数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(CreateRedInvoiceResultData [] Data) {
        this.Data = Data;
    }

    public CreateRedInvoiceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedInvoiceResult(CreateRedInvoiceResult source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Data != null) {
            this.Data = new CreateRedInvoiceResultData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new CreateRedInvoiceResultData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

