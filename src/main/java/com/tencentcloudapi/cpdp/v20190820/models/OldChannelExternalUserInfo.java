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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OldChannelExternalUserInfo extends AbstractModel{

    /**
    * 渠道方用户类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalUserType")
    @Expose
    private String ChannelExternalUserType;

    /**
    * 渠道方用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalUserId")
    @Expose
    private String ChannelExternalUserId;

    /**
     * Get 渠道方用户类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalUserType 渠道方用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalUserType() {
        return this.ChannelExternalUserType;
    }

    /**
     * Set 渠道方用户类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalUserType 渠道方用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalUserType(String ChannelExternalUserType) {
        this.ChannelExternalUserType = ChannelExternalUserType;
    }

    /**
     * Get 渠道方用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalUserId 渠道方用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalUserId() {
        return this.ChannelExternalUserId;
    }

    /**
     * Set 渠道方用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalUserId 渠道方用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalUserId(String ChannelExternalUserId) {
        this.ChannelExternalUserId = ChannelExternalUserId;
    }

    public OldChannelExternalUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldChannelExternalUserInfo(OldChannelExternalUserInfo source) {
        if (source.ChannelExternalUserType != null) {
            this.ChannelExternalUserType = new String(source.ChannelExternalUserType);
        }
        if (source.ChannelExternalUserId != null) {
            this.ChannelExternalUserId = new String(source.ChannelExternalUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelExternalUserType", this.ChannelExternalUserType);
        this.setParamSimple(map, prefix + "ChannelExternalUserId", this.ChannelExternalUserId);

    }
}

