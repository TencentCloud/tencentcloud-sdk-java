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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhaseData extends AbstractModel{

    /**
    * 启用头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadEnabled")
    @Expose
    private Boolean HeadEnabled;

    /**
    * 标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadTitle")
    @Expose
    private String HeadTitle;

    /**
    * 标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 小程序AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 小程序AppPath
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppPath")
    @Expose
    private String AppPath;

    /**
    * 小程序名称AppName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * Get 启用头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadEnabled 启用头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHeadEnabled() {
        return this.HeadEnabled;
    }

    /**
     * Set 启用头
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadEnabled 启用头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadEnabled(Boolean HeadEnabled) {
        this.HeadEnabled = HeadEnabled;
    }

    /**
     * Get 标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadTitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeadTitle() {
        return this.HeadTitle;
    }

    /**
     * Set 标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTitle(String HeadTitle) {
        this.HeadTitle = HeadTitle;
    }

    /**
     * Get 标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 小程序AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 小程序AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 小程序AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 小程序AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 小程序AppPath
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppPath 小程序AppPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppPath() {
        return this.AppPath;
    }

    /**
     * Set 小程序AppPath
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppPath 小程序AppPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppPath(String AppPath) {
        this.AppPath = AppPath;
    }

    /**
     * Get 小程序名称AppName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 小程序名称AppName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 小程序名称AppName
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 小程序名称AppName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public PhaseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhaseData(PhaseData source) {
        if (source.HeadEnabled != null) {
            this.HeadEnabled = new Boolean(source.HeadEnabled);
        }
        if (source.HeadTitle != null) {
            this.HeadTitle = new String(source.HeadTitle);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppPath != null) {
            this.AppPath = new String(source.AppPath);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeadEnabled", this.HeadEnabled);
        this.setParamSimple(map, prefix + "HeadTitle", this.HeadTitle);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppPath", this.AppPath);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

