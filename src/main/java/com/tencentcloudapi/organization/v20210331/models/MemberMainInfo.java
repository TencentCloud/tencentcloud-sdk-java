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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberMainInfo extends AbstractModel{

    /**
    * 成员uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 成员名称j
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
     * Get 成员uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberUin 成员uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberUin 成员uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 成员名称j
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberName 成员名称j
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set 成员名称j
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberName 成员名称j
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public MemberMainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberMainInfo(MemberMainInfo source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

