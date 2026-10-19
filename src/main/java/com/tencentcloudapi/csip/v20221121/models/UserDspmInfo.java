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

public class UserDspmInfo extends AbstractModel {

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
    * <p>账号下数据库资产数量</p>
    */
    @SerializedName("AssetNum")
    @Expose
    private Long AssetNum;

    /**
    * <p>账号下开启安全分析数据库资产数量</p>
    */
    @SerializedName("UsedAssetNum")
    @Expose
    private Long UsedAssetNum;

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
    * <p>云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>账号是否隔离中</p>
    */
    @SerializedName("IsIsolating")
    @Expose
    private Boolean IsIsolating;

    /**
    * <p>是否正在数据清理</p>
    */
    @SerializedName("IsDataCleaning")
    @Expose
    private Boolean IsDataCleaning;

    /**
    * <p>集团账号角色（member-普通成员/admin-管理员/delegatedAdmin-委派管理员），非集团账号为空</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>所属部门名称，未分配部门或非集团账号为空</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

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
     * Get <p>账号下数据库资产数量</p> 
     * @return AssetNum <p>账号下数据库资产数量</p>
     */
    public Long getAssetNum() {
        return this.AssetNum;
    }

    /**
     * Set <p>账号下数据库资产数量</p>
     * @param AssetNum <p>账号下数据库资产数量</p>
     */
    public void setAssetNum(Long AssetNum) {
        this.AssetNum = AssetNum;
    }

    /**
     * Get <p>账号下开启安全分析数据库资产数量</p> 
     * @return UsedAssetNum <p>账号下开启安全分析数据库资产数量</p>
     */
    public Long getUsedAssetNum() {
        return this.UsedAssetNum;
    }

    /**
     * Set <p>账号下开启安全分析数据库资产数量</p>
     * @param UsedAssetNum <p>账号下开启安全分析数据库资产数量</p>
     */
    public void setUsedAssetNum(Long UsedAssetNum) {
        this.UsedAssetNum = UsedAssetNum;
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
     * Get <p>云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）</p> 
     * @return CloudType <p>云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）</p>
     * @param CloudType <p>云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>账号是否隔离中</p> 
     * @return IsIsolating <p>账号是否隔离中</p>
     */
    public Boolean getIsIsolating() {
        return this.IsIsolating;
    }

    /**
     * Set <p>账号是否隔离中</p>
     * @param IsIsolating <p>账号是否隔离中</p>
     */
    public void setIsIsolating(Boolean IsIsolating) {
        this.IsIsolating = IsIsolating;
    }

    /**
     * Get <p>是否正在数据清理</p> 
     * @return IsDataCleaning <p>是否正在数据清理</p>
     */
    public Boolean getIsDataCleaning() {
        return this.IsDataCleaning;
    }

    /**
     * Set <p>是否正在数据清理</p>
     * @param IsDataCleaning <p>是否正在数据清理</p>
     */
    public void setIsDataCleaning(Boolean IsDataCleaning) {
        this.IsDataCleaning = IsDataCleaning;
    }

    /**
     * Get <p>集团账号角色（member-普通成员/admin-管理员/delegatedAdmin-委派管理员），非集团账号为空</p> 
     * @return Role <p>集团账号角色（member-普通成员/admin-管理员/delegatedAdmin-委派管理员），非集团账号为空</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>集团账号角色（member-普通成员/admin-管理员/delegatedAdmin-委派管理员），非集团账号为空</p>
     * @param Role <p>集团账号角色（member-普通成员/admin-管理员/delegatedAdmin-委派管理员），非集团账号为空</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>所属部门名称，未分配部门或非集团账号为空</p> 
     * @return NodeName <p>所属部门名称，未分配部门或非集团账号为空</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>所属部门名称，未分配部门或非集团账号为空</p>
     * @param NodeName <p>所属部门名称，未分配部门或非集团账号为空</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public UserDspmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDspmInfo(UserDspmInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.AssetNum != null) {
            this.AssetNum = new Long(source.AssetNum);
        }
        if (source.UsedAssetNum != null) {
            this.UsedAssetNum = new Long(source.UsedAssetNum);
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
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.IsIsolating != null) {
            this.IsIsolating = new Boolean(source.IsIsolating);
        }
        if (source.IsDataCleaning != null) {
            this.IsDataCleaning = new Boolean(source.IsDataCleaning);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "AssetNum", this.AssetNum);
        this.setParamSimple(map, prefix + "UsedAssetNum", this.UsedAssetNum);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "IsIsolating", this.IsIsolating);
        this.setParamSimple(map, prefix + "IsDataCleaning", this.IsDataCleaning);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

