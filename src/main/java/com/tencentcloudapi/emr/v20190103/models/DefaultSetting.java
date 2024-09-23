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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultSetting extends AbstractModel {

    /**
    * 名称，作为入参的key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 提示
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * key，用于展示，该配置对应与配置文件中的配置项
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Name对应的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 名称，作为入参的key 
     * @return Name 名称，作为入参的key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称，作为入参的key
     * @param Name 名称，作为入参的key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 提示 
     * @return Prompt 提示
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 提示
     * @param Prompt 提示
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get key，用于展示，该配置对应与配置文件中的配置项 
     * @return Key key，用于展示，该配置对应与配置文件中的配置项
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set key，用于展示，该配置对应与配置文件中的配置项
     * @param Key key，用于展示，该配置对应与配置文件中的配置项
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Name对应的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value Name对应的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Name对应的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value Name对应的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DefaultSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultSetting(DefaultSetting source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

