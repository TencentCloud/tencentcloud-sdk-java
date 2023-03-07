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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CountryCodeItem extends AbstractModel{

    /**
    * 国家英文名
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 国家中文名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ISO2标准国家/地区代码
    */
    @SerializedName("IOS2")
    @Expose
    private String IOS2;

    /**
    * ISO3标准国家/地区代码
    */
    @SerializedName("IOS3")
    @Expose
    private String IOS3;

    /**
    * 电话代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 国家英文名 
     * @return EnName 国家英文名
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 国家英文名
     * @param EnName 国家英文名
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 国家中文名 
     * @return Name 国家中文名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 国家中文名
     * @param Name 国家中文名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ISO2标准国家/地区代码 
     * @return IOS2 ISO2标准国家/地区代码
     */
    public String getIOS2() {
        return this.IOS2;
    }

    /**
     * Set ISO2标准国家/地区代码
     * @param IOS2 ISO2标准国家/地区代码
     */
    public void setIOS2(String IOS2) {
        this.IOS2 = IOS2;
    }

    /**
     * Get ISO3标准国家/地区代码 
     * @return IOS3 ISO3标准国家/地区代码
     */
    public String getIOS3() {
        return this.IOS3;
    }

    /**
     * Set ISO3标准国家/地区代码
     * @param IOS3 ISO3标准国家/地区代码
     */
    public void setIOS3(String IOS3) {
        this.IOS3 = IOS3;
    }

    /**
     * Get 电话代码 
     * @return Code 电话代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 电话代码
     * @param Code 电话代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public CountryCodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CountryCodeItem(CountryCodeItem source) {
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IOS2 != null) {
            this.IOS2 = new String(source.IOS2);
        }
        if (source.IOS3 != null) {
            this.IOS3 = new String(source.IOS3);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IOS2", this.IOS2);
        this.setParamSimple(map, prefix + "IOS3", this.IOS3);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

