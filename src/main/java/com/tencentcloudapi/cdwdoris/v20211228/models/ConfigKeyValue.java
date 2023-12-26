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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigKeyValue extends AbstractModel {

    /**
    * key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 1-只读，2-可修改但不可删除，3-可删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Display")
    @Expose
    private Long Display;

    /**
    * 0不支持 1支持热更新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportHotUpdate")
    @Expose
    private Long SupportHotUpdate;

    /**
     * Get key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyName key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set key
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyName key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 1-只读，2-可修改但不可删除，3-可删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Display 1-只读，2-可修改但不可删除，3-可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisplay() {
        return this.Display;
    }

    /**
     * Set 1-只读，2-可修改但不可删除，3-可删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Display 1-只读，2-可修改但不可删除，3-可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplay(Long Display) {
        this.Display = Display;
    }

    /**
     * Get 0不支持 1支持热更新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportHotUpdate 0不支持 1支持热更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportHotUpdate() {
        return this.SupportHotUpdate;
    }

    /**
     * Set 0不支持 1支持热更新
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportHotUpdate 0不支持 1支持热更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportHotUpdate(Long SupportHotUpdate) {
        this.SupportHotUpdate = SupportHotUpdate;
    }

    public ConfigKeyValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigKeyValue(ConfigKeyValue source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Display != null) {
            this.Display = new Long(source.Display);
        }
        if (source.SupportHotUpdate != null) {
            this.SupportHotUpdate = new Long(source.SupportHotUpdate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "SupportHotUpdate", this.SupportHotUpdate);

    }
}

