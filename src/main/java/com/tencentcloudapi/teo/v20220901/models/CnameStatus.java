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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnameStatus extends AbstractModel {

    /**
    * 记录名称。
    */
    @SerializedName("RecordName")
    @Expose
    private String RecordName;

    /**
    * CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * CNAME 状态信息，取值有：
<li>active：生效；</li>
<li>moved：不生效；</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 记录名称。 
     * @return RecordName 记录名称。
     */
    public String getRecordName() {
        return this.RecordName;
    }

    /**
     * Set 记录名称。
     * @param RecordName 记录名称。
     */
    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    /**
     * Get CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname CNAME 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get CNAME 状态信息，取值有：
<li>active：生效；</li>
<li>moved：不生效；</li> 
     * @return Status CNAME 状态信息，取值有：
<li>active：生效；</li>
<li>moved：不生效；</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CNAME 状态信息，取值有：
<li>active：生效；</li>
<li>moved：不生效；</li>
     * @param Status CNAME 状态信息，取值有：
<li>active：生效；</li>
<li>moved：不生效；</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CnameStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CnameStatus(CnameStatus source) {
        if (source.RecordName != null) {
            this.RecordName = new String(source.RecordName);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordName", this.RecordName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

