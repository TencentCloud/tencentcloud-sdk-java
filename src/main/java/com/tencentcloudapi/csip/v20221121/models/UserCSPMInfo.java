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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCSPMInfo extends AbstractModel {

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>CSPM扫描配额</p>
    */
    @SerializedName("CSPMNum")
    @Expose
    private Long CSPMNum;

    /**
    * <p>已消耗CSPM扫描配额</p>
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * <p>赠送CSPM扫描配额</p>
    */
    @SerializedName("GrantedCSPMNum")
    @Expose
    private Long GrantedCSPMNum;

    /**
    * <p>是否被共享，1-被共享，2-未被共享</p>
    */
    @SerializedName("IsShared")
    @Expose
    private Long IsShared;

    /**
    * <p>是否单独购买，1-单独购买，2-未单独购买</p>
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * <p>配额来源账号</p>
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * <p>角色:member:成员;admin:管理员;delegatedAdmin:委派管理员</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>所在部门</p>
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
     * Get <p>APPID</p> 
     * @return AppID <p>APPID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>APPID</p>
     * @param AppID <p>APPID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>UIN</p> 
     * @return Uin <p>UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>UIN</p>
     * @param Uin <p>UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>CSPM扫描配额</p> 
     * @return CSPMNum <p>CSPM扫描配额</p>
     */
    public Long getCSPMNum() {
        return this.CSPMNum;
    }

    /**
     * Set <p>CSPM扫描配额</p>
     * @param CSPMNum <p>CSPM扫描配额</p>
     */
    public void setCSPMNum(Long CSPMNum) {
        this.CSPMNum = CSPMNum;
    }

    /**
     * Get <p>已消耗CSPM扫描配额</p> 
     * @return UsedCount <p>已消耗CSPM扫描配额</p>
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set <p>已消耗CSPM扫描配额</p>
     * @param UsedCount <p>已消耗CSPM扫描配额</p>
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get <p>赠送CSPM扫描配额</p> 
     * @return GrantedCSPMNum <p>赠送CSPM扫描配额</p>
     */
    public Long getGrantedCSPMNum() {
        return this.GrantedCSPMNum;
    }

    /**
     * Set <p>赠送CSPM扫描配额</p>
     * @param GrantedCSPMNum <p>赠送CSPM扫描配额</p>
     */
    public void setGrantedCSPMNum(Long GrantedCSPMNum) {
        this.GrantedCSPMNum = GrantedCSPMNum;
    }

    /**
     * Get <p>是否被共享，1-被共享，2-未被共享</p> 
     * @return IsShared <p>是否被共享，1-被共享，2-未被共享</p>
     */
    public Long getIsShared() {
        return this.IsShared;
    }

    /**
     * Set <p>是否被共享，1-被共享，2-未被共享</p>
     * @param IsShared <p>是否被共享，1-被共享，2-未被共享</p>
     */
    public void setIsShared(Long IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get <p>是否单独购买，1-单独购买，2-未单独购买</p> 
     * @return IsSelfBuy <p>是否单独购买，1-单独购买，2-未单独购买</p>
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set <p>是否单独购买，1-单独购买，2-未单独购买</p>
     * @param IsSelfBuy <p>是否单独购买，1-单独购买，2-未单独购买</p>
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get <p>配额来源账号</p> 
     * @return ShareFromAppID <p>配额来源账号</p>
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set <p>配额来源账号</p>
     * @param ShareFromAppID <p>配额来源账号</p>
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get <p>角色:member:成员;admin:管理员;delegatedAdmin:委派管理员</p> 
     * @return Role <p>角色:member:成员;admin:管理员;delegatedAdmin:委派管理员</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色:member:成员;admin:管理员;delegatedAdmin:委派管理员</p>
     * @param Role <p>角色:member:成员;admin:管理员;delegatedAdmin:委派管理员</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>所在部门</p> 
     * @return Department <p>所在部门</p>
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>所在部门</p>
     * @param Department <p>所在部门</p>
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public UserCSPMInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserCSPMInfo(UserCSPMInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.CSPMNum != null) {
            this.CSPMNum = new Long(source.CSPMNum);
        }
        if (source.UsedCount != null) {
            this.UsedCount = new Long(source.UsedCount);
        }
        if (source.GrantedCSPMNum != null) {
            this.GrantedCSPMNum = new Long(source.GrantedCSPMNum);
        }
        if (source.IsShared != null) {
            this.IsShared = new Long(source.IsShared);
        }
        if (source.IsSelfBuy != null) {
            this.IsSelfBuy = new Long(source.IsSelfBuy);
        }
        if (source.ShareFromAppID != null) {
            this.ShareFromAppID = new Long(source.ShareFromAppID);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "CSPMNum", this.CSPMNum);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamSimple(map, prefix + "GrantedCSPMNum", this.GrantedCSPMNum);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Department", this.Department);

    }
}

