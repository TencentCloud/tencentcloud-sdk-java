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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Staff extends AbstractModel{

    /**
    * 员工在电子签平台的id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 显示的员工名
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 员工手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 员工邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 员工在第三方平台id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 员工角色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private StaffRole [] Roles;

    /**
    * 员工部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * 员工是否实名
    */
    @SerializedName("Verified")
    @Expose
    private Boolean Verified;

    /**
    * 员工创建时间戳
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 员工实名时间戳
    */
    @SerializedName("VerifiedOn")
    @Expose
    private Long VerifiedOn;

    /**
    * 员工是否离职：0-未离职，1-离职
    */
    @SerializedName("QuiteJob")
    @Expose
    private Long QuiteJob;

    /**
     * Get 员工在电子签平台的id 
     * @return UserId 员工在电子签平台的id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在电子签平台的id
     * @param UserId 员工在电子签平台的id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 显示的员工名 
     * @return DisplayName 显示的员工名
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 显示的员工名
     * @param DisplayName 显示的员工名
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 员工手机号 
     * @return Mobile 员工手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 员工手机号
     * @param Mobile 员工手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 员工邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 员工邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 员工邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 员工邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 员工在第三方平台id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 员工在第三方平台id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 员工在第三方平台id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 员工在第三方平台id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 员工角色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Roles 员工角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaffRole [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 员工角色
注意：此字段可能返回 null，表示取不到有效值。
     * @param Roles 员工角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoles(StaffRole [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 员工部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Department 员工部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set 员工部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param Department 员工部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get 员工是否实名 
     * @return Verified 员工是否实名
     */
    public Boolean getVerified() {
        return this.Verified;
    }

    /**
     * Set 员工是否实名
     * @param Verified 员工是否实名
     */
    public void setVerified(Boolean Verified) {
        this.Verified = Verified;
    }

    /**
     * Get 员工创建时间戳 
     * @return CreatedOn 员工创建时间戳
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 员工创建时间戳
     * @param CreatedOn 员工创建时间戳
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 员工实名时间戳 
     * @return VerifiedOn 员工实名时间戳
     */
    public Long getVerifiedOn() {
        return this.VerifiedOn;
    }

    /**
     * Set 员工实名时间戳
     * @param VerifiedOn 员工实名时间戳
     */
    public void setVerifiedOn(Long VerifiedOn) {
        this.VerifiedOn = VerifiedOn;
    }

    /**
     * Get 员工是否离职：0-未离职，1-离职 
     * @return QuiteJob 员工是否离职：0-未离职，1-离职
     */
    public Long getQuiteJob() {
        return this.QuiteJob;
    }

    /**
     * Set 员工是否离职：0-未离职，1-离职
     * @param QuiteJob 员工是否离职：0-未离职，1-离职
     */
    public void setQuiteJob(Long QuiteJob) {
        this.QuiteJob = QuiteJob;
    }

    public Staff() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Staff(Staff source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Roles != null) {
            this.Roles = new StaffRole[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new StaffRole(source.Roles[i]);
            }
        }
        if (source.Department != null) {
            this.Department = new Department(source.Department);
        }
        if (source.Verified != null) {
            this.Verified = new Boolean(source.Verified);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.VerifiedOn != null) {
            this.VerifiedOn = new Long(source.VerifiedOn);
        }
        if (source.QuiteJob != null) {
            this.QuiteJob = new Long(source.QuiteJob);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamObj(map, prefix + "Department.", this.Department);
        this.setParamSimple(map, prefix + "Verified", this.Verified);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "VerifiedOn", this.VerifiedOn);
        this.setParamSimple(map, prefix + "QuiteJob", this.QuiteJob);

    }
}

