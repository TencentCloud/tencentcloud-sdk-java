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

public class DspmAccessRecord extends AbstractModel {

    /**
    * 资产信息
    */
    @SerializedName("Asset")
    @Expose
    private DspmDbAsset Asset;

    /**
    * 账号
    */
    @SerializedName("Accounts")
    @Expose
    private DspmAssetAccount [] Accounts;

    /**
    * 来源ip信息
    */
    @SerializedName("SourceIpList")
    @Expose
    private DspmIp [] SourceIpList;

    /**
    * 记录时间
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
    * 登录成功次数
    */
    @SerializedName("LoginSuccessCount")
    @Expose
    private Long LoginSuccessCount;

    /**
    * 登录失败次数
    */
    @SerializedName("LoginFailedCount")
    @Expose
    private Long LoginFailedCount;

    /**
     * Get 资产信息 
     * @return Asset 资产信息
     */
    public DspmDbAsset getAsset() {
        return this.Asset;
    }

    /**
     * Set 资产信息
     * @param Asset 资产信息
     */
    public void setAsset(DspmDbAsset Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 账号 
     * @return Accounts 账号
     */
    public DspmAssetAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 账号
     * @param Accounts 账号
     */
    public void setAccounts(DspmAssetAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 来源ip信息 
     * @return SourceIpList 来源ip信息
     */
    public DspmIp [] getSourceIpList() {
        return this.SourceIpList;
    }

    /**
     * Set 来源ip信息
     * @param SourceIpList 来源ip信息
     */
    public void setSourceIpList(DspmIp [] SourceIpList) {
        this.SourceIpList = SourceIpList;
    }

    /**
     * Get 记录时间 
     * @return RecordTime 记录时间
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set 记录时间
     * @param RecordTime 记录时间
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    /**
     * Get 登录成功次数 
     * @return LoginSuccessCount 登录成功次数
     */
    public Long getLoginSuccessCount() {
        return this.LoginSuccessCount;
    }

    /**
     * Set 登录成功次数
     * @param LoginSuccessCount 登录成功次数
     */
    public void setLoginSuccessCount(Long LoginSuccessCount) {
        this.LoginSuccessCount = LoginSuccessCount;
    }

    /**
     * Get 登录失败次数 
     * @return LoginFailedCount 登录失败次数
     */
    public Long getLoginFailedCount() {
        return this.LoginFailedCount;
    }

    /**
     * Set 登录失败次数
     * @param LoginFailedCount 登录失败次数
     */
    public void setLoginFailedCount(Long LoginFailedCount) {
        this.LoginFailedCount = LoginFailedCount;
    }

    public DspmAccessRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccessRecord(DspmAccessRecord source) {
        if (source.Asset != null) {
            this.Asset = new DspmDbAsset(source.Asset);
        }
        if (source.Accounts != null) {
            this.Accounts = new DspmAssetAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new DspmAssetAccount(source.Accounts[i]);
            }
        }
        if (source.SourceIpList != null) {
            this.SourceIpList = new DspmIp[source.SourceIpList.length];
            for (int i = 0; i < source.SourceIpList.length; i++) {
                this.SourceIpList[i] = new DspmIp(source.SourceIpList[i]);
            }
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
        if (source.LoginSuccessCount != null) {
            this.LoginSuccessCount = new Long(source.LoginSuccessCount);
        }
        if (source.LoginFailedCount != null) {
            this.LoginFailedCount = new Long(source.LoginFailedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Asset.", this.Asset);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamArrayObj(map, prefix + "SourceIpList.", this.SourceIpList);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);
        this.setParamSimple(map, prefix + "LoginSuccessCount", this.LoginSuccessCount);
        this.setParamSimple(map, prefix + "LoginFailedCount", this.LoginFailedCount);

    }
}

