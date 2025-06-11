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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserBaseInfo extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("UserBizId")
    @Expose
    private String UserBizId;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 用户ID 
     * @return UserBizId 用户ID
     */
    public String getUserBizId() {
        return this.UserBizId;
    }

    /**
     * Set 用户ID
     * @param UserBizId 用户ID
     */
    public void setUserBizId(String UserBizId) {
        this.UserBizId = UserBizId;
    }

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public UserBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserBaseInfo(UserBaseInfo source) {
        if (source.UserBizId != null) {
            this.UserBizId = new String(source.UserBizId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserBizId", this.UserBizId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

