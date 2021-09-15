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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckMobileAndNameRequest extends AbstractModel{

    /**
    * 调用方信息; 必选
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 调用方信息; 必选 
     * @return Caller 调用方信息; 必选
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息; 必选
     * @param Caller 调用方信息; 必选
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 手机号 
     * @return Mobile 手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号
     * @param Mobile 手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CheckMobileAndNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckMobileAndNameRequest(CheckMobileAndNameRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

