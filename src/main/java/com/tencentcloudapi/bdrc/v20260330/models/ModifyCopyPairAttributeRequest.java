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
    * 要修改属性的复制对id
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * 要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * 修改复制对名称（长度最大支持 64 个字符）
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
     * Get 要修改属性的复制对id 
     * @return CopyPairId 要修改属性的复制对id
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set 要修改属性的复制对id
     * @param CopyPairId 要修改属性的复制对id
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get 要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE 
     * @return CopyPairType 要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set 要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE
     * @param CopyPairType 要修改的复制对类型，可选值：DISK、INSTANCE、CFS，默认 INSTANCE
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get 修改复制对名称（长度最大支持 64 个字符） 
     * @return CopyPairName 修改复制对名称（长度最大支持 64 个字符）
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set 修改复制对名称（长度最大支持 64 个字符）
     * @param CopyPairName 修改复制对名称（长度最大支持 64 个字符）
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);

    }
}

