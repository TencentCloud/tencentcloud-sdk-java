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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContact extends AbstractModel{

    /**
    * 外部联系人的userId
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
    * 外部联系人性别 0-未知 1-男性 2-女性
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 外部联系人的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业或第三方服务商绑定了微信开发者ID有此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnionId")
    @Expose
    private String UnionId;

    /**
    * 外部联系人联系电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get 外部联系人的userId 
     * @return ExternalUserId 外部联系人的userId
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 外部联系人的userId
     * @param ExternalUserId 外部联系人的userId
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    /**
     * Get 外部联系人性别 0-未知 1-男性 2-女性 
     * @return Gender 外部联系人性别 0-未知 1-男性 2-女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 外部联系人性别 0-未知 1-男性 2-女性
     * @param Gender 外部联系人性别 0-未知 1-男性 2-女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 外部联系人的名称 
     * @return Name 外部联系人的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 外部联系人的名称
     * @param Name 外部联系人的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户 
     * @return Type 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
     * @param Type 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业或第三方服务商绑定了微信开发者ID有此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnionId 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业或第三方服务商绑定了微信开发者ID有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnionId() {
        return this.UnionId;
    }

    /**
     * Set 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业或第三方服务商绑定了微信开发者ID有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnionId 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业或第三方服务商绑定了微信开发者ID有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnionId(String UnionId) {
        this.UnionId = UnionId;
    }

    /**
     * Get 外部联系人联系电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 外部联系人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 外部联系人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 外部联系人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public ExternalContact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContact(ExternalContact source) {
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UnionId != null) {
            this.UnionId = new String(source.UnionId);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UnionId", this.UnionId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);

    }
}

