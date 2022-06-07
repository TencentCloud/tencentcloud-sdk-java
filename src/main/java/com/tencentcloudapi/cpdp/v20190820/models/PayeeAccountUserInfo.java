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

public class PayeeAccountUserInfo extends AbstractModel{

    /**
    * 外部用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutUserId")
    @Expose
    private String OutUserId;

    /**
    * 用户类型
0:B端用户
1:C端用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 证件类型
0:身份证
1:社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdType")
    @Expose
    private Long IdType;

    /**
    * 证件号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 外部用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutUserId 外部用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutUserId() {
        return this.OutUserId;
    }

    /**
     * Set 外部用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutUserId 外部用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutUserId(String OutUserId) {
        this.OutUserId = OutUserId;
    }

    /**
     * Get 用户类型
0:B端用户
1:C端用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserType 用户类型
0:B端用户
1:C端用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型
0:B端用户
1:C端用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserType 用户类型
0:B端用户
1:C端用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 证件类型
0:身份证
1:社会信用代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdType 证件类型
0:身份证
1:社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdType() {
        return this.IdType;
    }

    /**
     * Set 证件类型
0:身份证
1:社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdType 证件类型
0:身份证
1:社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdType(Long IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 证件号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdNo 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 证件号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdNo 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public PayeeAccountUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeAccountUserInfo(PayeeAccountUserInfo source) {
        if (source.OutUserId != null) {
            this.OutUserId = new String(source.OutUserId);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.IdType != null) {
            this.IdType = new Long(source.IdType);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutUserId", this.OutUserId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

