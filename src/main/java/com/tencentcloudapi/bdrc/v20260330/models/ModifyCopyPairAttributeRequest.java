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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCopyPairAttributeRequest extends AbstractModel {

    /**
    * <p>要修改属性的复制对id</p>
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * <p>要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE</p>
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * <p>修改复制对名称（长度最大支持 64 个字符）</p>
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
    * <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>要修改属性的复制对id</p> 
     * @return CopyPairId <p>要修改属性的复制对id</p>
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set <p>要修改属性的复制对id</p>
     * @param CopyPairId <p>要修改属性的复制对id</p>
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get <p>要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE</p> 
     * @return CopyPairType <p>要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE</p>
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set <p>要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE</p>
     * @param CopyPairType <p>要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE</p>
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get <p>修改复制对名称（长度最大支持 64 个字符）</p> 
     * @return CopyPairName <p>修改复制对名称（长度最大支持 64 个字符）</p>
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set <p>修改复制对名称（长度最大支持 64 个字符）</p>
     * @param CopyPairName <p>修改复制对名称（长度最大支持 64 个字符）</p>
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
    }

    /**
     * Get <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p> 
     * @return InstanceType <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     * @param InstanceType <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public ModifyCopyPairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCopyPairAttributeRequest(ModifyCopyPairAttributeRequest source) {
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.CopyPairName != null) {
            this.CopyPairName = new String(source.CopyPairName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

