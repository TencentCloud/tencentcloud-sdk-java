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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceWhitelistItem extends AbstractModel{

    /**
    * 白名单项的ID。
    */
    @SerializedName("WhitelistItemId")
    @Expose
    private Long WhitelistItemId;

    /**
    * 客户检测项的ID。
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * 检测项的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合规标准的名称。
    */
    @SerializedName("StandardName")
    @Expose
    private String StandardName;

    /**
    * 合规标准的ID。
    */
    @SerializedName("StandardId")
    @Expose
    private Long StandardId;

    /**
    * 检测项影响的资产的数目。
    */
    @SerializedName("AffectedAssetCount")
    @Expose
    private Long AffectedAssetCount;

    /**
    * 最后更新的时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 加入到白名单的时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get 白名单项的ID。 
     * @return WhitelistItemId 白名单项的ID。
     */
    public Long getWhitelistItemId() {
        return this.WhitelistItemId;
    }

    /**
     * Set 白名单项的ID。
     * @param WhitelistItemId 白名单项的ID。
     */
    public void setWhitelistItemId(Long WhitelistItemId) {
        this.WhitelistItemId = WhitelistItemId;
    }

    /**
     * Get 客户检测项的ID。 
     * @return CustomerPolicyItemId 客户检测项的ID。
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set 客户检测项的ID。
     * @param CustomerPolicyItemId 客户检测项的ID。
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get 检测项的名称。 
     * @return Name 检测项的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检测项的名称。
     * @param Name 检测项的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合规标准的名称。 
     * @return StandardName 合规标准的名称。
     */
    public String getStandardName() {
        return this.StandardName;
    }

    /**
     * Set 合规标准的名称。
     * @param StandardName 合规标准的名称。
     */
    public void setStandardName(String StandardName) {
        this.StandardName = StandardName;
    }

    /**
     * Get 合规标准的ID。 
     * @return StandardId 合规标准的ID。
     */
    public Long getStandardId() {
        return this.StandardId;
    }

    /**
     * Set 合规标准的ID。
     * @param StandardId 合规标准的ID。
     */
    public void setStandardId(Long StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get 检测项影响的资产的数目。 
     * @return AffectedAssetCount 检测项影响的资产的数目。
     */
    public Long getAffectedAssetCount() {
        return this.AffectedAssetCount;
    }

    /**
     * Set 检测项影响的资产的数目。
     * @param AffectedAssetCount 检测项影响的资产的数目。
     */
    public void setAffectedAssetCount(Long AffectedAssetCount) {
        this.AffectedAssetCount = AffectedAssetCount;
    }

    /**
     * Get 最后更新的时间 
     * @return LastUpdateTime 最后更新的时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新的时间
     * @param LastUpdateTime 最后更新的时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 加入到白名单的时间 
     * @return InsertTime 加入到白名单的时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 加入到白名单的时间
     * @param InsertTime 加入到白名单的时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public ComplianceWhitelistItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceWhitelistItem(ComplianceWhitelistItem source) {
        if (source.WhitelistItemId != null) {
            this.WhitelistItemId = new Long(source.WhitelistItemId);
        }
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StandardName != null) {
            this.StandardName = new String(source.StandardName);
        }
        if (source.StandardId != null) {
            this.StandardId = new Long(source.StandardId);
        }
        if (source.AffectedAssetCount != null) {
            this.AffectedAssetCount = new Long(source.AffectedAssetCount);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhitelistItemId", this.WhitelistItemId);
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StandardName", this.StandardName);
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "AffectedAssetCount", this.AffectedAssetCount);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

