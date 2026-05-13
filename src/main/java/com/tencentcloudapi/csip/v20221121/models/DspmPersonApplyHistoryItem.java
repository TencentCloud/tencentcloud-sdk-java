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

public class DspmPersonApplyHistoryItem extends AbstractModel {

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 姓名
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 访问权限生效时间。
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 访问权限失效时间。
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 访问权限有效时间。单位毫秒。
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * 权限信息。
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 是否有效。0-无效；1-有效。
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

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
     * Get 姓名 
     * @return PersonName 姓名
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 姓名
     * @param PersonName 姓名
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 访问权限生效时间。 
     * @return ValidateFrom 访问权限生效时间。
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 访问权限生效时间。
     * @param ValidateFrom 访问权限生效时间。
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 访问权限失效时间。 
     * @return ValidateTo 访问权限失效时间。
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 访问权限失效时间。
     * @param ValidateTo 访问权限失效时间。
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 访问权限有效时间。单位毫秒。 
     * @return ValidatePeriod 访问权限有效时间。单位毫秒。
     */
    public Long getValidatePeriod() {
        return this.ValidatePeriod;
    }

    /**
     * Set 访问权限有效时间。单位毫秒。
     * @param ValidatePeriod 访问权限有效时间。单位毫秒。
     */
    public void setValidatePeriod(Long ValidatePeriod) {
        this.ValidatePeriod = ValidatePeriod;
    }

    /**
     * Get 权限信息。 
     * @return Privilege 权限信息。
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 权限信息。
     * @param Privilege 权限信息。
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 是否有效。0-无效；1-有效。 
     * @return ValidStatus 是否有效。0-无效；1-有效。
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 是否有效。0-无效；1-有效。
     * @param ValidStatus 是否有效。0-无效；1-有效。
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public DspmPersonApplyHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmPersonApplyHistoryItem(DspmPersonApplyHistoryItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

