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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLinkSecurityGroupRequest extends AbstractModel {

    /**
    * 安全组Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 安全组名称，限制大小写、数字和下划线，长度[1, 32]，Region下唯一。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 白名单列表，最多10个。
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get 安全组Id。 
     * @return Id 安全组Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组Id。
     * @param Id 安全组Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 安全组名称，限制大小写、数字和下划线，长度[1, 32]，Region下唯一。 
     * @return Name 安全组名称，限制大小写、数字和下划线，长度[1, 32]，Region下唯一。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安全组名称，限制大小写、数字和下划线，长度[1, 32]，Region下唯一。
     * @param Name 安全组名称，限制大小写、数字和下划线，长度[1, 32]，Region下唯一。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 白名单列表，最多10个。 
     * @return Whitelist 白名单列表，最多10个。
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set 白名单列表，最多10个。
     * @param Whitelist 白名单列表，最多10个。
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    public ModifyStreamLinkSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLinkSecurityGroupRequest(ModifyStreamLinkSecurityGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}

