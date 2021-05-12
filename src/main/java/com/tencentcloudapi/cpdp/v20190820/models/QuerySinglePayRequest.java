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

public class QuerySinglePayRequest extends AbstractModel{

    /**
    * 业务流水号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 业务流水号 
     * @return SerialNumber 业务流水号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 业务流水号
     * @param SerialNumber 业务流水号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QuerySinglePayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySinglePayRequest(QuerySinglePayRequest source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

