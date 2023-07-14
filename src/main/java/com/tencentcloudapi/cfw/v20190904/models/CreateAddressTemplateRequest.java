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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateRequest extends AbstractModel{

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Type为1，ip模板eg：1.1.1.1,2.2.2.2；
Type为5，域名模板eg：www.qq.com,www.tencent.com
    */
    @SerializedName("IpString")
    @Expose
    private String IpString;

    /**
    * 1 ip模板
5 域名模板
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述 
     * @return Detail 模板描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 模板描述
     * @param Detail 模板描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Type为1，ip模板eg：1.1.1.1,2.2.2.2；
Type为5，域名模板eg：www.qq.com,www.tencent.com 
     * @return IpString Type为1，ip模板eg：1.1.1.1,2.2.2.2；
Type为5，域名模板eg：www.qq.com,www.tencent.com
     */
    public String getIpString() {
        return this.IpString;
    }

    /**
     * Set Type为1，ip模板eg：1.1.1.1,2.2.2.2；
Type为5，域名模板eg：www.qq.com,www.tencent.com
     * @param IpString Type为1，ip模板eg：1.1.1.1,2.2.2.2；
Type为5，域名模板eg：www.qq.com,www.tencent.com
     */
    public void setIpString(String IpString) {
        this.IpString = IpString;
    }

    /**
     * Get 1 ip模板
5 域名模板 
     * @return Type 1 ip模板
5 域名模板
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1 ip模板
5 域名模板
     * @param Type 1 ip模板
5 域名模板
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public CreateAddressTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressTemplateRequest(CreateAddressTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.IpString != null) {
            this.IpString = new String(source.IpString);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "IpString", this.IpString);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

