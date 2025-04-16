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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Users extends AbstractModel {

    /**
    * 用户信息集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSet")
    @Expose
    private UserMessage [] UserSet;

    /**
    * 用户总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 用户信息集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSet 用户信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserMessage [] getUserSet() {
        return this.UserSet;
    }

    /**
     * Set 用户信息集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSet 用户信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSet(UserMessage [] UserSet) {
        this.UserSet = UserSet;
    }

    /**
     * Get 用户总数 
     * @return TotalCount 用户总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 用户总数
     * @param TotalCount 用户总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public Users() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Users(Users source) {
        if (source.UserSet != null) {
            this.UserSet = new UserMessage[source.UserSet.length];
            for (int i = 0; i < source.UserSet.length; i++) {
                this.UserSet[i] = new UserMessage(source.UserSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UserSet.", this.UserSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

