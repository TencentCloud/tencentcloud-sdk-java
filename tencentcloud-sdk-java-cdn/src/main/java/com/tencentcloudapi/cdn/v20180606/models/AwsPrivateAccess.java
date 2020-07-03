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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AwsPrivateAccess extends AbstractModel{

    /**
    * 开关，on/off。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 访问ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 密钥。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get 开关，on/off。 
     * @return Switch 开关，on/off。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，on/off。
     * @param Switch 开关，on/off。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 访问ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey 访问ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey 访问ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 密钥。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 密钥。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

