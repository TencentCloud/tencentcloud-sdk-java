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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProtectGroupRequest extends AbstractModel {

    /**
    * 防护对象组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 防护对象组的应用范围
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 防护对象组备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 防护对象组名称 
     * @return Name 防护对象组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 防护对象组名称
     * @param Name 防护对象组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 防护对象组的应用范围 
     * @return Domains 防护对象组的应用范围
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 防护对象组的应用范围
     * @param Domains 防护对象组的应用范围
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 防护对象组备注 
     * @return Remark 防护对象组备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 防护对象组备注
     * @param Remark 防护对象组备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateProtectGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProtectGroupRequest(CreateProtectGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

