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

public class CreateMerchantResult extends AbstractModel{

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 响应消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 创建商户结果数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private CreateMerchantResultData Data;

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 响应消息 
     * @return Message 响应消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 响应消息
     * @param Message 响应消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 创建商户结果数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 创建商户结果数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateMerchantResultData getData() {
        return this.Data;
    }

    /**
     * Set 创建商户结果数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 创建商户结果数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(CreateMerchantResultData Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

