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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizParams extends AbstractModel {

    /**
    * 字段中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * 字段英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * iceberg表是否启用高级配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAdvancedConfig")
    @Expose
    private String HasAdvancedConfig;

    /**
     * Get 字段中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameCn 字段中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set 字段中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameCn 字段中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get 字段英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameEn 字段英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 字段英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameEn 字段英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get iceberg表是否启用高级配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAdvancedConfig iceberg表是否启用高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHasAdvancedConfig() {
        return this.HasAdvancedConfig;
    }

    /**
     * Set iceberg表是否启用高级配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAdvancedConfig iceberg表是否启用高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAdvancedConfig(String HasAdvancedConfig) {
        this.HasAdvancedConfig = HasAdvancedConfig;
    }

    public BizParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizParams(BizParams source) {
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.HasAdvancedConfig != null) {
            this.HasAdvancedConfig = new String(source.HasAdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "HasAdvancedConfig", this.HasAdvancedConfig);

    }
}

