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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Admin extends AbstractModel {

    /**
    * 超管名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 超管手机号，打码显示
示例值：138****1569

    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
     * Get 超管名 
     * @return Name 超管名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 超管名
     * @param Name 超管名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 超管手机号，打码显示
示例值：138****1569
 
     * @return Mobile 超管手机号，打码显示
示例值：138****1569

     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 超管手机号，打码显示
示例值：138****1569

     * @param Mobile 超管手机号，打码显示
示例值：138****1569

     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public Admin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Admin(Admin source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);

    }
}

