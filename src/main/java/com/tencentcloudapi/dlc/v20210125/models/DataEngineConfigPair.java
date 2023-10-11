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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineConfigPair extends AbstractModel{

    /**
    * 配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigItem")
    @Expose
    private String ConfigItem;

    /**
    * 配置值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigValue")
    @Expose
    private String ConfigValue;

    /**
     * Get 配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigItem 配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigItem() {
        return this.ConfigItem;
    }

    /**
     * Set 配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigItem 配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigItem(String ConfigItem) {
        this.ConfigItem = ConfigItem;
    }

    /**
     * Get 配置值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigValue 配置值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigValue() {
        return this.ConfigValue;
    }

    /**
     * Set 配置值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigValue 配置值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigValue(String ConfigValue) {
        this.ConfigValue = ConfigValue;
    }

    public DataEngineConfigPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineConfigPair(DataEngineConfigPair source) {
        if (source.ConfigItem != null) {
            this.ConfigItem = new String(source.ConfigItem);
        }
        if (source.ConfigValue != null) {
            this.ConfigValue = new String(source.ConfigValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigItem", this.ConfigItem);
        this.setParamSimple(map, prefix + "ConfigValue", this.ConfigValue);

    }
}

