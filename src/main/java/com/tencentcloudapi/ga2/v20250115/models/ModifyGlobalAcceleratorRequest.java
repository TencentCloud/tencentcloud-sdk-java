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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalAcceleratorRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 名称，最大长度不能超过60个字节。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息，最大长度不能超过100个字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 跨境类型。
    */
    @SerializedName("CrossBorderType")
    @Expose
    private String CrossBorderType;

    /**
    * 代表是否跨境服务承诺。
    */
    @SerializedName("CrossBorderPromiseFlag")
    @Expose
    private Boolean CrossBorderPromiseFlag;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 名称，最大长度不能超过60个字节。 
     * @return Name 名称，最大长度不能超过60个字节。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称，最大长度不能超过60个字节。
     * @param Name 名称，最大长度不能超过60个字节。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息，最大长度不能超过100个字节。 
     * @return Description 描述信息，最大长度不能超过100个字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息，最大长度不能超过100个字节。
     * @param Description 描述信息，最大长度不能超过100个字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 跨境类型。 
     * @return CrossBorderType 跨境类型。
     */
    public String getCrossBorderType() {
        return this.CrossBorderType;
    }

    /**
     * Set 跨境类型。
     * @param CrossBorderType 跨境类型。
     */
    public void setCrossBorderType(String CrossBorderType) {
        this.CrossBorderType = CrossBorderType;
    }

    /**
     * Get 代表是否跨境服务承诺。 
     * @return CrossBorderPromiseFlag 代表是否跨境服务承诺。
     */
    public Boolean getCrossBorderPromiseFlag() {
        return this.CrossBorderPromiseFlag;
    }

    /**
     * Set 代表是否跨境服务承诺。
     * @param CrossBorderPromiseFlag 代表是否跨境服务承诺。
     */
    public void setCrossBorderPromiseFlag(Boolean CrossBorderPromiseFlag) {
        this.CrossBorderPromiseFlag = CrossBorderPromiseFlag;
    }

    public ModifyGlobalAcceleratorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorRequest(ModifyGlobalAcceleratorRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CrossBorderType != null) {
            this.CrossBorderType = new String(source.CrossBorderType);
        }
        if (source.CrossBorderPromiseFlag != null) {
            this.CrossBorderPromiseFlag = new Boolean(source.CrossBorderPromiseFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CrossBorderType", this.CrossBorderType);
        this.setParamSimple(map, prefix + "CrossBorderPromiseFlag", this.CrossBorderPromiseFlag);

    }
}

