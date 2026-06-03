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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>实例的规格,<br>基础版：basic<br>标准版：standard<br>高级版：premium</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>实例删除保护，false为关闭</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>实例是否开启多版本控制，false为关闭</p>
    */
    @SerializedName("EnableCosVersioning")
    @Expose
    private Boolean EnableCosVersioning;

    /**
     * Get <p>实例ID</p> 
     * @return RegistryId <p>实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>实例ID</p>
     * @param RegistryId <p>实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>实例的规格,<br>基础版：basic<br>标准版：standard<br>高级版：premium</p> 
     * @return RegistryType <p>实例的规格,<br>基础版：basic<br>标准版：standard<br>高级版：premium</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>实例的规格,<br>基础版：basic<br>标准版：standard<br>高级版：premium</p>
     * @param RegistryType <p>实例的规格,<br>基础版：basic<br>标准版：standard<br>高级版：premium</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>实例删除保护，false为关闭</p> 
     * @return DeletionProtection <p>实例删除保护，false为关闭</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>实例删除保护，false为关闭</p>
     * @param DeletionProtection <p>实例删除保护，false为关闭</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>实例是否开启多版本控制，false为关闭</p> 
     * @return EnableCosVersioning <p>实例是否开启多版本控制，false为关闭</p>
     */
    public Boolean getEnableCosVersioning() {
        return this.EnableCosVersioning;
    }

    /**
     * Set <p>实例是否开启多版本控制，false为关闭</p>
     * @param EnableCosVersioning <p>实例是否开启多版本控制，false为关闭</p>
     */
    public void setEnableCosVersioning(Boolean EnableCosVersioning) {
        this.EnableCosVersioning = EnableCosVersioning;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.EnableCosVersioning != null) {
            this.EnableCosVersioning = new Boolean(source.EnableCosVersioning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "EnableCosVersioning", this.EnableCosVersioning);

    }
}

