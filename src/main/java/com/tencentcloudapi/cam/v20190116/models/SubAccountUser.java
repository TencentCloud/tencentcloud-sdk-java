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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAccountUser extends AbstractModel{

    /**
    * 子用户用户 ID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子用户用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子用户 UID，UID是用户作为消息接收人时的唯一标识，和 UIN 一样可以唯一标识一个用户，可通过接口https://cloud.tencent.com/document/api/598/53486 获取
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 子用户备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户类型(2:子用户;3:企业微信子用户;4:协作者;5:消息接收人)
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 最近登录IP
    */
    @SerializedName("LastLoginIp")
    @Expose
    private String LastLoginIp;

    /**
    * 最近登录时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
     * Get 子用户用户 ID 
     * @return Uin 子用户用户 ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 子用户用户 ID
     * @param Uin 子用户用户 ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户用户名 
     * @return Name 子用户用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子用户用户名
     * @param Name 子用户用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子用户 UID，UID是用户作为消息接收人时的唯一标识，和 UIN 一样可以唯一标识一个用户，可通过接口https://cloud.tencent.com/document/api/598/53486 获取 
     * @return Uid 子用户 UID，UID是用户作为消息接收人时的唯一标识，和 UIN 一样可以唯一标识一个用户，可通过接口https://cloud.tencent.com/document/api/598/53486 获取
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 子用户 UID，UID是用户作为消息接收人时的唯一标识，和 UIN 一样可以唯一标识一个用户，可通过接口https://cloud.tencent.com/document/api/598/53486 获取
     * @param Uid 子用户 UID，UID是用户作为消息接收人时的唯一标识，和 UIN 一样可以唯一标识一个用户，可通过接口https://cloud.tencent.com/document/api/598/53486 获取
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 子用户备注 
     * @return Remark 子用户备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 子用户备注
     * @param Remark 子用户备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户类型(2:子用户;3:企业微信子用户;4:协作者;5:消息接收人) 
     * @return UserType 用户类型(2:子用户;3:企业微信子用户;4:协作者;5:消息接收人)
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型(2:子用户;3:企业微信子用户;4:协作者;5:消息接收人)
     * @param UserType 用户类型(2:子用户;3:企业微信子用户;4:协作者;5:消息接收人)
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 最近登录IP 
     * @return LastLoginIp 最近登录IP
     */
    public String getLastLoginIp() {
        return this.LastLoginIp;
    }

    /**
     * Set 最近登录IP
     * @param LastLoginIp 最近登录IP
     */
    public void setLastLoginIp(String LastLoginIp) {
        this.LastLoginIp = LastLoginIp;
    }

    /**
     * Get 最近登录时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLoginTime 最近登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set 最近登录时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLoginTime 最近登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public SubAccountUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAccountUser(SubAccountUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.LastLoginIp != null) {
            this.LastLoginIp = new String(source.LastLoginIp);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);

    }
}

