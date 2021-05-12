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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LookupAttribute extends AbstractModel{

    /**
    * AttributeKey的有效取值范围是:RequestId、EventName、ReadOnly、Username、ResourceType、ResourceName和AccessKeyId，EventId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeKey")
    @Expose
    private String AttributeKey;

    /**
    * AttributeValue的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeValue")
    @Expose
    private String AttributeValue;

    /**
     * Get AttributeKey的有效取值范围是:RequestId、EventName、ReadOnly、Username、ResourceType、ResourceName和AccessKeyId，EventId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeKey AttributeKey的有效取值范围是:RequestId、EventName、ReadOnly、Username、ResourceType、ResourceName和AccessKeyId，EventId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttributeKey() {
        return this.AttributeKey;
    }

    /**
     * Set AttributeKey的有效取值范围是:RequestId、EventName、ReadOnly、Username、ResourceType、ResourceName和AccessKeyId，EventId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeKey AttributeKey的有效取值范围是:RequestId、EventName、ReadOnly、Username、ResourceType、ResourceName和AccessKeyId，EventId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeKey(String AttributeKey) {
        this.AttributeKey = AttributeKey;
    }

    /**
     * Get AttributeValue的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeValue AttributeValue的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttributeValue() {
        return this.AttributeValue;
    }

    /**
     * Set AttributeValue的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeValue AttributeValue的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeValue(String AttributeValue) {
        this.AttributeValue = AttributeValue;
    }

    public LookupAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LookupAttribute(LookupAttribute source) {
        if (source.AttributeKey != null) {
            this.AttributeKey = new String(source.AttributeKey);
        }
        if (source.AttributeValue != null) {
            this.AttributeValue = new String(source.AttributeValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeKey", this.AttributeKey);
        this.setParamSimple(map, prefix + "AttributeValue", this.AttributeValue);

    }
}

