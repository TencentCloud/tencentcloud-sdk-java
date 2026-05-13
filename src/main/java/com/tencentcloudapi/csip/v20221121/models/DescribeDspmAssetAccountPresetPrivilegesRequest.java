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

public class DescribeDspmAssetAccountPresetPrivilegesRequest extends AbstractModel {

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 地址 
     * @return Host 地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 地址
     * @param Host 地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 过滤器 
     * @return Filter 过滤器
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤器
     * @param Filter 过滤器
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeDspmAssetAccountPresetPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetAccountPresetPrivilegesRequest(DescribeDspmAssetAccountPresetPrivilegesRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

