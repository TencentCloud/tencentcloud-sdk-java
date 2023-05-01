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

public class ApplyFlexWechatPreAuthRequest extends AbstractModel{

    /**
    * 商家核身单号
    */
    @SerializedName("AuthNo")
    @Expose
    private String AuthNo;

    /**
    * 微信用户标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 用工单位名称
    */
    @SerializedName("EmployerName")
    @Expose
    private String EmployerName;

    /**
    * 用户姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户证件号
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
    * 用工类型
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
    */
    @SerializedName("EmploymentType")
    @Expose
    private String EmploymentType;

    /**
    * 核身类型
SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 环境类型
test 测试
release 生产
sandbox 沙箱
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 商家核身单号 
     * @return AuthNo 商家核身单号
     */
    public String getAuthNo() {
        return this.AuthNo;
    }

    /**
     * Set 商家核身单号
     * @param AuthNo 商家核身单号
     */
    public void setAuthNo(String AuthNo) {
        this.AuthNo = AuthNo;
    }

    /**
     * Get 微信用户标识 
     * @return OpenId 微信用户标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 微信用户标识
     * @param OpenId 微信用户标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 用工单位名称 
     * @return EmployerName 用工单位名称
     */
    public String getEmployerName() {
        return this.EmployerName;
    }

    /**
     * Set 用工单位名称
     * @param EmployerName 用工单位名称
     */
    public void setEmployerName(String EmployerName) {
        this.EmployerName = EmployerName;
    }

    /**
     * Get 用户姓名 
     * @return UserName 用户姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户姓名
     * @param UserName 用户姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户证件号 
     * @return IdNo 用户证件号
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 用户证件号
     * @param IdNo 用户证件号
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * Get 用工类型
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系 
     * @return EmploymentType 用工类型
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     */
    public String getEmploymentType() {
        return this.EmploymentType;
    }

    /**
     * Set 用工类型
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     * @param EmploymentType 用工类型
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     */
    public void setEmploymentType(String EmploymentType) {
        this.EmploymentType = EmploymentType;
    }

    /**
     * Get 核身类型
SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型 
     * @return AuthType 核身类型
SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 核身类型
SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     * @param AuthType 核身类型
SIGN_IN：考勤、签到打卡类型
INSURANCE：投保类型
CONTRACT：签约类型
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 环境类型
test 测试
release 生产
sandbox 沙箱 
     * @return Environment 环境类型
test 测试
release 生产
sandbox 沙箱
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
test 测试
release 生产
sandbox 沙箱
     * @param Environment 环境类型
test 测试
release 生产
sandbox 沙箱
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public ApplyFlexWechatPreAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyFlexWechatPreAuthRequest(ApplyFlexWechatPreAuthRequest source) {
        if (source.AuthNo != null) {
            this.AuthNo = new String(source.AuthNo);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.EmployerName != null) {
            this.EmployerName = new String(source.EmployerName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
        if (source.EmploymentType != null) {
            this.EmploymentType = new String(source.EmploymentType);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNo", this.AuthNo);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "EmployerName", this.EmployerName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);
        this.setParamSimple(map, prefix + "EmploymentType", this.EmploymentType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

