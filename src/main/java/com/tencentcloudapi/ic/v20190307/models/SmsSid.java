/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsSid extends AbstractModel {

    /**
    * 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 信息流水ID
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
     * Get 卡片ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Iccid 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Iccid 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 信息流水ID 
     * @return Sid 信息流水ID
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 信息流水ID
     * @param Sid 信息流水ID
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public SmsSid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsSid(SmsSid source) {
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Sid", this.Sid);

    }
}

