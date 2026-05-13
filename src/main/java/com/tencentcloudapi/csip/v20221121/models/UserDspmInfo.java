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
    * APPID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 账号下数据库资产数量
    */
    @SerializedName("AssetNum")
    @Expose
    private Long AssetNum;

    /**
    * 账号下开启安全分析数据库资产数量
    */
    @SerializedName("UsedAssetNum")
    @Expose
    private Long UsedAssetNum;

    /**
    * 是否被共享，1-被共享，2-未被共享
    */
    @SerializedName("IsShared")
    @Expose
    private Long IsShared;

    /**
    * 是否单独购买，1-单独购买，2-未单独购买
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * 配额来源账号
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * 云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 账号是否隔离中
    */
    @SerializedName("IsIsolating")
    @Expose
    private Boolean IsIsolating;

    /**
    * 是否正在数据清理
    */
    @SerializedName("IsDataCleaning")
    @Expose
    private Boolean IsDataCleaning;

    /**
     * Get APPID 
     * @return AppID APPID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set APPID
     * @param AppID APPID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 账号下数据库资产数量 
     * @return AssetNum 账号下数据库资产数量
     */
    public Long getAssetNum() {
        return this.AssetNum;
    }

    /**
     * Set 账号下数据库资产数量
     * @param AssetNum 账号下数据库资产数量
     */
    public void setAssetNum(Long AssetNum) {
        this.AssetNum = AssetNum;
    }

    /**
     * Get 账号下开启安全分析数据库资产数量 
     * @return UsedAssetNum 账号下开启安全分析数据库资产数量
     */
    public Long getUsedAssetNum() {
        return this.UsedAssetNum;
    }

    /**
     * Set 账号下开启安全分析数据库资产数量
     * @param UsedAssetNum 账号下开启安全分析数据库资产数量
     */
    public void setUsedAssetNum(Long UsedAssetNum) {
        this.UsedAssetNum = UsedAssetNum;
    }

    /**
     * Get 是否被共享，1-被共享，2-未被共享 
     * @return IsShared 是否被共享，1-被共享，2-未被共享
     */
    public Long getIsShared() {
        return this.IsShared;
    }

    /**
     * Set 是否被共享，1-被共享，2-未被共享
     * @param IsShared 是否被共享，1-被共享，2-未被共享
     */
    public void setIsShared(Long IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get 是否单独购买，1-单独购买，2-未单独购买 
     * @return IsSelfBuy 是否单独购买，1-单独购买，2-未单独购买
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set 是否单独购买，1-单独购买，2-未单独购买
     * @param IsSelfBuy 是否单独购买，1-单独购买，2-未单独购买
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get 配额来源账号 
     * @return ShareFromAppID 配额来源账号
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set 配额来源账号
     * @param ShareFromAppID 配额来源账号
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get 云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云） 
     * @return CloudType 云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）
     * @param CloudType 云类型（0：腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云）
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 账号是否隔离中 
     * @return IsIsolating 账号是否隔离中
     */
    public Boolean getIsIsolating() {
        return this.IsIsolating;
    }

    /**
     * Set 账号是否隔离中
     * @param IsIsolating 账号是否隔离中
     */
    public void setIsIsolating(Boolean IsIsolating) {
        this.IsIsolating = IsIsolating;
    }

    /**
     * Get 是否正在数据清理 
     * @return IsDataCleaning 是否正在数据清理
     */
    public Boolean getIsDataCleaning() {
        return this.IsDataCleaning;
    }

    /**
     * Set 是否正在数据清理
     * @param IsDataCleaning 是否正在数据清理
     */
    public void setIsDataCleaning(Boolean IsDataCleaning) {
        this.IsDataCleaning = IsDataCleaning;
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

    }
}

