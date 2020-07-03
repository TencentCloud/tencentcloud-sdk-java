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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiVersionArray extends AbstractModel{

    /**
    * App ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * App 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * App 包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
     * Get App ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId App ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set App ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId App ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get App 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName App 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set App 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName App 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get App 包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgVersion App 包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * Set App 包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgVersion App 包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);

    }
}

