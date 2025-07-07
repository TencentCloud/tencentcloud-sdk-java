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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceSpaceInfo extends AbstractModel {

    /**
    * 空间Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 空间名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 空间级别
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 空间编码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 空间Id 
     * @return Id 空间Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 空间Id
     * @param Id 空间Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 空间名字 
     * @return Name 空间名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 空间名字
     * @param Name 空间名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 空间级别 
     * @return Level 空间级别
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 空间级别
     * @param Level 空间级别
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 空间编码 
     * @return Code 空间编码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 空间编码
     * @param Code 空间编码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public DeviceSpaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceSpaceInfo(DeviceSpaceInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

