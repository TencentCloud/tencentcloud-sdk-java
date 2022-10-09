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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuccessCreateStaffData extends AbstractModel{

    /**
    * 员工名
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 员工手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 员工在电子签平台的id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 员工名 
     * @return DisplayName 员工名
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 员工名
     * @param DisplayName 员工名
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 员工手机号 
     * @return Mobile 员工手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 员工手机号
     * @param Mobile 员工手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 员工在电子签平台的id 
     * @return UserId 员工在电子签平台的id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在电子签平台的id
     * @param UserId 员工在电子签平台的id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public SuccessCreateStaffData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuccessCreateStaffData(SuccessCreateStaffData source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

