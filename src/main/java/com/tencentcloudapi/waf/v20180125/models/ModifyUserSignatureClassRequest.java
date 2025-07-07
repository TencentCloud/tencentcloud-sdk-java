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

public class ModifyUserSignatureClassRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则类型ID
    */
    @SerializedName("TypeID")
    @Expose
    private String TypeID;

    /**
    * 规则类型状态，0:关闭，1:开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则类型ID 
     * @return TypeID 规则类型ID
     */
    public String getTypeID() {
        return this.TypeID;
    }

    /**
     * Set 规则类型ID
     * @param TypeID 规则类型ID
     */
    public void setTypeID(String TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * Get 规则类型状态，0:关闭，1:开启 
     * @return Status 规则类型状态，0:关闭，1:开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则类型状态，0:关闭，1:开启
     * @param Status 规则类型状态，0:关闭，1:开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyUserSignatureClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserSignatureClassRequest(ModifyUserSignatureClassRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TypeID != null) {
            this.TypeID = new String(source.TypeID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

