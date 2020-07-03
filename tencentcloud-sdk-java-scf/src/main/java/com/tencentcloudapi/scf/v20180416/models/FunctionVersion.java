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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionVersion extends AbstractModel{

    /**
    * 函数版本名称
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
     * Get 函数版本名称 
     * @return Version 函数版本名称
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 函数版本名称
     * @param Version 函数版本名称
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);

    }
}

