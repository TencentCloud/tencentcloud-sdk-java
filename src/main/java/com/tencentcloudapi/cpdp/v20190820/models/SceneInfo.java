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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneInfo extends AbstractModel{

    /**
    * 语言代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocaleCode")
    @Expose
    private String LocaleCode;

    /**
    * 地区代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 用户IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserClientIp")
    @Expose
    private String UserClientIp;

    /**
     * Get 语言代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocaleCode 语言代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocaleCode() {
        return this.LocaleCode;
    }

    /**
     * Set 语言代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocaleCode 语言代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocaleCode(String LocaleCode) {
        this.LocaleCode = LocaleCode;
    }

    /**
     * Get 地区代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCode 地区代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地区代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCode 地区代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 用户IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserClientIp 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserClientIp() {
        return this.UserClientIp;
    }

    /**
     * Set 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserClientIp 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserClientIp(String UserClientIp) {
        this.UserClientIp = UserClientIp;
    }

    public SceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneInfo(SceneInfo source) {
        if (source.LocaleCode != null) {
            this.LocaleCode = new String(source.LocaleCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.UserClientIp != null) {
            this.UserClientIp = new String(source.UserClientIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocaleCode", this.LocaleCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "UserClientIp", this.UserClientIp);

    }
}

