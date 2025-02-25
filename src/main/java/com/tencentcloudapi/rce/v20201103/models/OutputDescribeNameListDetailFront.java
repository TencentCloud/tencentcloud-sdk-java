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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDescribeNameListDetailFront extends AbstractModel {

    /**
    * 错误码，0 表示成功，非0表示失败错误码。 0：成功 1002：参数错误 4300：未开通服务 6000：系统内部错误
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 列表详情信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private OutputDescribeNameListDetail Value;

    /**
     * Get 错误码，0 表示成功，非0表示失败错误码。 0：成功 1002：参数错误 4300：未开通服务 6000：系统内部错误 
     * @return Code 错误码，0 表示成功，非0表示失败错误码。 0：成功 1002：参数错误 4300：未开通服务 6000：系统内部错误
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码，0 表示成功，非0表示失败错误码。 0：成功 1002：参数错误 4300：未开通服务 6000：系统内部错误
     * @param Code 错误码，0 表示成功，非0表示失败错误码。 0：成功 1002：参数错误 4300：未开通服务 6000：系统内部错误
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 错误信息 
     * @return Message 错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息
     * @param Message 错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 列表详情信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 列表详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputDescribeNameListDetail getValue() {
        return this.Value;
    }

    /**
     * Set 列表详情信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 列表详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(OutputDescribeNameListDetail Value) {
        this.Value = Value;
    }

    public OutputDescribeNameListDetailFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDescribeNameListDetailFront(OutputDescribeNameListDetailFront source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new OutputDescribeNameListDetail(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

