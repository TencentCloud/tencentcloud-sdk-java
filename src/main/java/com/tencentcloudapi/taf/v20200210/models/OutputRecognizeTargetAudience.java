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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRecognizeTargetAudience extends AbstractModel{

    /**
    * 返回码（0，成功，其他失败）
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 返回码对应的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 返回模型结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private OutputRecognizeTargetAudienceValue [] Value;

    /**
     * Get 返回码（0，成功，其他失败） 
     * @return Code 返回码（0，成功，其他失败）
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 返回码（0，成功，其他失败）
     * @param Code 返回码（0，成功，其他失败）
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 返回码对应的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 返回码对应的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 返回码对应的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 返回码对应的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 返回模型结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 返回模型结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputRecognizeTargetAudienceValue [] getValue() {
        return this.Value;
    }

    /**
     * Set 返回模型结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 返回模型结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(OutputRecognizeTargetAudienceValue [] Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Value.", this.Value);

    }
}

