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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanBindSecretStatus extends AbstractModel{

    /**
    * 使用计划绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 密钥详情列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKeyList")
    @Expose
    private UsagePlanBindSecret [] AccessKeyList;

    /**
     * Get 使用计划绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 使用计划绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 使用计划绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 使用计划绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 密钥详情列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKeyList 密钥详情列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsagePlanBindSecret [] getAccessKeyList() {
        return this.AccessKeyList;
    }

    /**
     * Set 密钥详情列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKeyList 密钥详情列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKeyList(UsagePlanBindSecret [] AccessKeyList) {
        this.AccessKeyList = AccessKeyList;
    }

    public UsagePlanBindSecretStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanBindSecretStatus(UsagePlanBindSecretStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccessKeyList != null) {
            this.AccessKeyList = new UsagePlanBindSecret[source.AccessKeyList.length];
            for (int i = 0; i < source.AccessKeyList.length; i++) {
                this.AccessKeyList[i] = new UsagePlanBindSecret(source.AccessKeyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AccessKeyList.", this.AccessKeyList);

    }
}

