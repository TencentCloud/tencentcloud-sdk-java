/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 创建的账号名称。由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres，且不能由pg_或tencentdb_开头
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号类型。当前支持normal、tencentDBSuper两个输入。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 账号对应的密码。密码规则如下：
<li>长度8 ~ 32位，推荐使用12位以上的密码</li>
<li>不能以" / "开头</li>
<li>必须包含以下四项:</li>

小写字母 a ~ z           
大写字母 A ～ Z
数字 0 ～ 9
特殊字符 ()`~!@#$%^&*-+=_|{}[]:<>,.?/

    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 账号备注。只允许英文字母、数字、下划线、中划线，以及全体汉字，限60个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 账号是否开启CAM验证
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

    /**
     * Get 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 创建的账号名称。由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres，且不能由pg_或tencentdb_开头 
     * @return UserName 创建的账号名称。由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres，且不能由pg_或tencentdb_开头
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 创建的账号名称。由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres，且不能由pg_或tencentdb_开头
     * @param UserName 创建的账号名称。由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres，且不能由pg_或tencentdb_开头
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账号类型。当前支持normal、tencentDBSuper两个输入。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。 
     * @return Type 账号类型。当前支持normal、tencentDBSuper两个输入。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 账号类型。当前支持normal、tencentDBSuper两个输入。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     * @param Type 账号类型。当前支持normal、tencentDBSuper两个输入。normal指代普通用户，tencentDBSuper为拥有pg_tencentdb_superuser角色的账号。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 账号对应的密码。密码规则如下：
<li>长度8 ~ 32位，推荐使用12位以上的密码</li>
<li>不能以" / "开头</li>
<li>必须包含以下四项:</li>

小写字母 a ~ z           
大写字母 A ～ Z
数字 0 ～ 9
特殊字符 ()`~!@#$%^&*-+=_|{}[]:<>,.?/
 
     * @return Password 账号对应的密码。密码规则如下：
<li>长度8 ~ 32位，推荐使用12位以上的密码</li>
<li>不能以" / "开头</li>
<li>必须包含以下四项:</li>

小写字母 a ~ z           
大写字母 A ～ Z
数字 0 ～ 9
特殊字符 ()`~!@#$%^&*-+=_|{}[]:<>,.?/

     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账号对应的密码。密码规则如下：
<li>长度8 ~ 32位，推荐使用12位以上的密码</li>
<li>不能以" / "开头</li>
<li>必须包含以下四项:</li>

小写字母 a ~ z           
大写字母 A ～ Z
数字 0 ～ 9
特殊字符 ()`~!@#$%^&*-+=_|{}[]:<>,.?/

     * @param Password 账号对应的密码。密码规则如下：
<li>长度8 ~ 32位，推荐使用12位以上的密码</li>
<li>不能以" / "开头</li>
<li>必须包含以下四项:</li>

小写字母 a ~ z           
大写字母 A ～ Z
数字 0 ～ 9
特殊字符 ()`~!@#$%^&*-+=_|{}[]:<>,.?/

     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 账号备注。只允许英文字母、数字、下划线、中划线，以及全体汉字，限60个字符 
     * @return Remark 账号备注。只允许英文字母、数字、下划线、中划线，以及全体汉字，限60个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账号备注。只允许英文字母、数字、下划线、中划线，以及全体汉字，限60个字符
     * @param Remark 账号备注。只允许英文字母、数字、下划线、中划线，以及全体汉字，限60个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 账号是否开启CAM验证 
     * @return OpenCam 账号是否开启CAM验证
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set 账号是否开启CAM验证
     * @param OpenCam 账号是否开启CAM验证
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
    }

    public CreateAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountRequest(CreateAccountRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OpenCam != null) {
            this.OpenCam = new Boolean(source.OpenCam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OpenCam", this.OpenCam);

    }
}

