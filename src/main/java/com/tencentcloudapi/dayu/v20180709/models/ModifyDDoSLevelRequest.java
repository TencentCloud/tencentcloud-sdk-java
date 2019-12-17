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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSLevelRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * =get表示读取防护等级；=set表示修改防护等级
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 防护等级，取值[low,middle,high]；当Method=set时必填
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get =get表示读取防护等级；=set表示修改防护等级 
     * @return Method =get表示读取防护等级；=set表示修改防护等级
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set =get表示读取防护等级；=set表示修改防护等级
     * @param Method =get表示读取防护等级；=set表示修改防护等级
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 防护等级，取值[low,middle,high]；当Method=set时必填 
     * @return DDoSLevel 防护等级，取值[low,middle,high]；当Method=set时必填
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set 防护等级，取值[low,middle,high]；当Method=set时必填
     * @param DDoSLevel 防护等级，取值[low,middle,high]；当Method=set时必填
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);

    }
}

