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

public class DspmAccessRecordId extends AbstractModel {

    /**
    * 来源ip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 资产列表
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资产账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 记录时间
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
     * Get 来源ip 
     * @return SourceIp 来源ip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 来源ip
     * @param SourceIp 来源ip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 资产列表 
     * @return AssetId 资产列表
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产列表
     * @param AssetId 资产列表
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产所在地域 
     * @return Region 资产所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资产所在地域
     * @param Region 资产所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资产账号 
     * @return Account 资产账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 资产账号
     * @param Account 资产账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 主机地址 
     * @return Host 主机地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机地址
     * @param Host 主机地址
     */
    public void setHost(String Host) {
        this.Host = Host;
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

    public DspmAccessRecordId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccessRecordId(DspmAccessRecordId source) {
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);

    }
}

