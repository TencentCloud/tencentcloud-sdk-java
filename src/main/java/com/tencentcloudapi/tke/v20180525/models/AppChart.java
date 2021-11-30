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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppChart extends AbstractModel{

    /**
    * chart名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * chart的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * chart的版本
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
     * Get chart名称 
     * @return Name chart名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set chart名称
     * @param Name chart名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get chart的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label chart的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set chart的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label chart的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get chart的版本 
     * @return LatestVersion chart的版本
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set chart的版本
     * @param LatestVersion chart的版本
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    public AppChart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppChart(AppChart source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);

    }
}

