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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchFailInfo extends AbstractModel {

    /**
    * 自增唯一ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 开关名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 防火墙开关变动状态，小于0
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 自增唯一ID 
     * @return Id 自增唯一ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自增唯一ID
     * @param Id 自增唯一ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 开关名称 
     * @return Name 开关名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 开关名称
     * @param Name 开关名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 防火墙开关变动状态，小于0 
     * @return Status 防火墙开关变动状态，小于0
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 防火墙开关变动状态，小于0
     * @param Status 防火墙开关变动状态，小于0
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SwitchFailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchFailInfo(SwitchFailInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

