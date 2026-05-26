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
    * <p>防护对象组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>防护对象组的应用范围</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>防护对象组备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>防护对象组名称</p> 
     * @return Name <p>防护对象组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>防护对象组名称</p>
     * @param Name <p>防护对象组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>防护对象组的应用范围</p> 
     * @return Domains <p>防护对象组的应用范围</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>防护对象组的应用范围</p>
     * @param Domains <p>防护对象组的应用范围</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>防护对象组备注</p> 
     * @return Remark <p>防护对象组备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>防护对象组备注</p>
     * @param Remark <p>防护对象组备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

