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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceWafStatus extends AbstractModel {

    /**
    *  服务的名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务的 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 服务的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    *  服务是否开启 WAF 防护
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get  服务的名字 
     * @return Name  服务的名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set  服务的名字
     * @param Name  服务的名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务的 ID 
     * @return Id 服务的 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务的 ID
     * @param Id 服务的 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 服务的类型 
     * @return Type 服务的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务的类型
     * @param Type 服务的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  服务是否开启 WAF 防护 
     * @return Status  服务是否开启 WAF 防护
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set  服务是否开启 WAF 防护
     * @param Status  服务是否开启 WAF 防护
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ServiceWafStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceWafStatus(ServiceWafStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

