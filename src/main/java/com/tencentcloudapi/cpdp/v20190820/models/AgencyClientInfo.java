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

public class AgencyClientInfo extends AbstractModel{

    /**
    * 经办人姓名，存在经办人必输
    */
    @SerializedName("AgencyClientName")
    @Expose
    private String AgencyClientName;

    /**
    * 经办人证件类型，存在经办人必输
    */
    @SerializedName("AgencyClientGlobalType")
    @Expose
    private String AgencyClientGlobalType;

    /**
    * 经办人证件号，存在经办人必输
    */
    @SerializedName("AgencyClientGlobalId")
    @Expose
    private String AgencyClientGlobalId;

    /**
    * 经办人手机号，存在经办人必输
    */
    @SerializedName("AgencyClientMobile")
    @Expose
    private String AgencyClientMobile;

    /**
     * Get 经办人姓名，存在经办人必输 
     * @return AgencyClientName 经办人姓名，存在经办人必输
     */
    public String getAgencyClientName() {
        return this.AgencyClientName;
    }

    /**
     * Set 经办人姓名，存在经办人必输
     * @param AgencyClientName 经办人姓名，存在经办人必输
     */
    public void setAgencyClientName(String AgencyClientName) {
        this.AgencyClientName = AgencyClientName;
    }

    /**
     * Get 经办人证件类型，存在经办人必输 
     * @return AgencyClientGlobalType 经办人证件类型，存在经办人必输
     */
    public String getAgencyClientGlobalType() {
        return this.AgencyClientGlobalType;
    }

    /**
     * Set 经办人证件类型，存在经办人必输
     * @param AgencyClientGlobalType 经办人证件类型，存在经办人必输
     */
    public void setAgencyClientGlobalType(String AgencyClientGlobalType) {
        this.AgencyClientGlobalType = AgencyClientGlobalType;
    }

    /**
     * Get 经办人证件号，存在经办人必输 
     * @return AgencyClientGlobalId 经办人证件号，存在经办人必输
     */
    public String getAgencyClientGlobalId() {
        return this.AgencyClientGlobalId;
    }

    /**
     * Set 经办人证件号，存在经办人必输
     * @param AgencyClientGlobalId 经办人证件号，存在经办人必输
     */
    public void setAgencyClientGlobalId(String AgencyClientGlobalId) {
        this.AgencyClientGlobalId = AgencyClientGlobalId;
    }

    /**
     * Get 经办人手机号，存在经办人必输 
     * @return AgencyClientMobile 经办人手机号，存在经办人必输
     */
    public String getAgencyClientMobile() {
        return this.AgencyClientMobile;
    }

    /**
     * Set 经办人手机号，存在经办人必输
     * @param AgencyClientMobile 经办人手机号，存在经办人必输
     */
    public void setAgencyClientMobile(String AgencyClientMobile) {
        this.AgencyClientMobile = AgencyClientMobile;
    }

    public AgencyClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgencyClientInfo(AgencyClientInfo source) {
        if (source.AgencyClientName != null) {
            this.AgencyClientName = new String(source.AgencyClientName);
        }
        if (source.AgencyClientGlobalType != null) {
            this.AgencyClientGlobalType = new String(source.AgencyClientGlobalType);
        }
        if (source.AgencyClientGlobalId != null) {
            this.AgencyClientGlobalId = new String(source.AgencyClientGlobalId);
        }
        if (source.AgencyClientMobile != null) {
            this.AgencyClientMobile = new String(source.AgencyClientMobile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgencyClientName", this.AgencyClientName);
        this.setParamSimple(map, prefix + "AgencyClientGlobalType", this.AgencyClientGlobalType);
        this.setParamSimple(map, prefix + "AgencyClientGlobalId", this.AgencyClientGlobalId);
        this.setParamSimple(map, prefix + "AgencyClientMobile", this.AgencyClientMobile);

    }
}

