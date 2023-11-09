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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MutedAccountList extends AbstractModel {

    /**
    * 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberAccount")
    @Expose
    private String MemberAccount;

    /**
    * 禁言到的时间（使用 UTC 时间，即世界协调时间）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MutedUntil")
    @Expose
    private Long MutedUntil;

    /**
     * Get 用户 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberAccount 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberAccount() {
        return this.MemberAccount;
    }

    /**
     * Set 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberAccount 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberAccount(String MemberAccount) {
        this.MemberAccount = MemberAccount;
    }

    /**
     * Get 禁言到的时间（使用 UTC 时间，即世界协调时间）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MutedUntil 禁言到的时间（使用 UTC 时间，即世界协调时间）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMutedUntil() {
        return this.MutedUntil;
    }

    /**
     * Set 禁言到的时间（使用 UTC 时间，即世界协调时间）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MutedUntil 禁言到的时间（使用 UTC 时间，即世界协调时间）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMutedUntil(Long MutedUntil) {
        this.MutedUntil = MutedUntil;
    }

    public MutedAccountList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MutedAccountList(MutedAccountList source) {
        if (source.MemberAccount != null) {
            this.MemberAccount = new String(source.MemberAccount);
        }
        if (source.MutedUntil != null) {
            this.MutedUntil = new Long(source.MutedUntil);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberAccount", this.MemberAccount);
        this.setParamSimple(map, prefix + "MutedUntil", this.MutedUntil);

    }
}

