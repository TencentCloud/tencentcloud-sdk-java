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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessIndexSettingsField extends AbstractModel {

    /**
    * 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfShards")
    @Expose
    private String NumberOfShards;

    /**
    * 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefreshInterval")
    @Expose
    private String RefreshInterval;

    /**
    * 自定义参数
    */
    @SerializedName("CustomSetting")
    @Expose
    private String CustomSetting;

    /**
     * Get 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfShards 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfShards() {
        return this.NumberOfShards;
    }

    /**
     * Set 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfShards 索引主分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfShards(String NumberOfShards) {
        this.NumberOfShards = NumberOfShards;
    }

    /**
     * Get 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefreshInterval 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefreshInterval 索引刷新频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefreshInterval(String RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    /**
     * Get 自定义参数 
     * @return CustomSetting 自定义参数
     */
    public String getCustomSetting() {
        return this.CustomSetting;
    }

    /**
     * Set 自定义参数
     * @param CustomSetting 自定义参数
     */
    public void setCustomSetting(String CustomSetting) {
        this.CustomSetting = CustomSetting;
    }

    public ServerlessIndexSettingsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessIndexSettingsField(ServerlessIndexSettingsField source) {
        if (source.NumberOfShards != null) {
            this.NumberOfShards = new String(source.NumberOfShards);
        }
        if (source.RefreshInterval != null) {
            this.RefreshInterval = new String(source.RefreshInterval);
        }
        if (source.CustomSetting != null) {
            this.CustomSetting = new String(source.CustomSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfShards", this.NumberOfShards);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);
        this.setParamSimple(map, prefix + "CustomSetting", this.CustomSetting);

    }
}

