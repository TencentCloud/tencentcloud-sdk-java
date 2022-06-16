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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedUsers extends AbstractModel{

    /**
    * 失败用户标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedUserIdentification")
    @Expose
    private String FailedUserIdentification;

    /**
    * 导入的用户失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
     * Get 失败用户标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedUserIdentification 失败用户标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedUserIdentification() {
        return this.FailedUserIdentification;
    }

    /**
     * Set 失败用户标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedUserIdentification 失败用户标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedUserIdentification(String FailedUserIdentification) {
        this.FailedUserIdentification = FailedUserIdentification;
    }

    /**
     * Get 导入的用户失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason 导入的用户失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 导入的用户失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason 导入的用户失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    public FailedUsers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedUsers(FailedUsers source) {
        if (source.FailedUserIdentification != null) {
            this.FailedUserIdentification = new String(source.FailedUserIdentification);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedUserIdentification", this.FailedUserIdentification);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);

    }
}

