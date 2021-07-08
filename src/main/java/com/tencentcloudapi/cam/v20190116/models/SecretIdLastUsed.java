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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretIdLastUsed extends AbstractModel{

    /**
    * 密钥ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 最后访问日期(有1天延迟)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUsedDate")
    @Expose
    private String LastUsedDate;

    /**
     * Get 密钥ID 
     * @return SecretId 密钥ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 密钥ID
     * @param SecretId 密钥ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 最后访问日期(有1天延迟)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUsedDate 最后访问日期(有1天延迟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUsedDate() {
        return this.LastUsedDate;
    }

    /**
     * Set 最后访问日期(有1天延迟)
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUsedDate 最后访问日期(有1天延迟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUsedDate(String LastUsedDate) {
        this.LastUsedDate = LastUsedDate;
    }

    public SecretIdLastUsed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretIdLastUsed(SecretIdLastUsed source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.LastUsedDate != null) {
            this.LastUsedDate = new String(source.LastUsedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "LastUsedDate", this.LastUsedDate);

    }
}

