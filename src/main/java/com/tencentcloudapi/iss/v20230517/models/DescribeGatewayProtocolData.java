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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayProtocolData extends AbstractModel {

    /**
    * 接入协议的字典码
    */
    @SerializedName("TypeCode")
    @Expose
    private String TypeCode;

    /**
    * 接入协议类型值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 接入协议的类型描述
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 协议值文本
    */
    @SerializedName("ValueText")
    @Expose
    private String ValueText;

    /**
     * Get 接入协议的字典码 
     * @return TypeCode 接入协议的字典码
     */
    public String getTypeCode() {
        return this.TypeCode;
    }

    /**
     * Set 接入协议的字典码
     * @param TypeCode 接入协议的字典码
     */
    public void setTypeCode(String TypeCode) {
        this.TypeCode = TypeCode;
    }

    /**
     * Get 接入协议类型值 
     * @return Value 接入协议类型值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 接入协议类型值
     * @param Value 接入协议类型值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 接入协议的类型描述 
     * @return Label 接入协议的类型描述
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 接入协议的类型描述
     * @param Label 接入协议的类型描述
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 协议值文本 
     * @return ValueText 协议值文本
     */
    public String getValueText() {
        return this.ValueText;
    }

    /**
     * Set 协议值文本
     * @param ValueText 协议值文本
     */
    public void setValueText(String ValueText) {
        this.ValueText = ValueText;
    }

    public DescribeGatewayProtocolData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayProtocolData(DescribeGatewayProtocolData source) {
        if (source.TypeCode != null) {
            this.TypeCode = new String(source.TypeCode);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.ValueText != null) {
            this.ValueText = new String(source.ValueText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeCode", this.TypeCode);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "ValueText", this.ValueText);

    }
}

