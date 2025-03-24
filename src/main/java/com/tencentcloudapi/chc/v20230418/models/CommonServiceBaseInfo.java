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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonServiceBaseInfo extends AbstractModel {

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 业务联系人
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 联系人电话
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 操作说明
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
    * 1 、2 、3 分别代表 L1、L2、L3
    */
    @SerializedName("ServiceLevel")
    @Expose
    private Long ServiceLevel;

    /**
    * 操作预授权
    */
    @SerializedName("PreAuthorization")
    @Expose
    private Boolean PreAuthorization;

    /**
     * Get 机房名称 
     * @return IdcName 机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机房名称
     * @param IdcName 机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 业务联系人 
     * @return ContactName 业务联系人
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 业务联系人
     * @param ContactName 业务联系人
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 联系人电话 
     * @return ContactPhone 联系人电话
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 联系人电话
     * @param ContactPhone 联系人电话
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 操作说明 
     * @return Instructions 操作说明
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set 操作说明
     * @param Instructions 操作说明
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Get 1 、2 、3 分别代表 L1、L2、L3 
     * @return ServiceLevel 1 、2 、3 分别代表 L1、L2、L3
     */
    public Long getServiceLevel() {
        return this.ServiceLevel;
    }

    /**
     * Set 1 、2 、3 分别代表 L1、L2、L3
     * @param ServiceLevel 1 、2 、3 分别代表 L1、L2、L3
     */
    public void setServiceLevel(Long ServiceLevel) {
        this.ServiceLevel = ServiceLevel;
    }

    /**
     * Get 操作预授权 
     * @return PreAuthorization 操作预授权
     */
    public Boolean getPreAuthorization() {
        return this.PreAuthorization;
    }

    /**
     * Set 操作预授权
     * @param PreAuthorization 操作预授权
     */
    public void setPreAuthorization(Boolean PreAuthorization) {
        this.PreAuthorization = PreAuthorization;
    }

    public CommonServiceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonServiceBaseInfo(CommonServiceBaseInfo source) {
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.Instructions != null) {
            this.Instructions = new String(source.Instructions);
        }
        if (source.ServiceLevel != null) {
            this.ServiceLevel = new Long(source.ServiceLevel);
        }
        if (source.PreAuthorization != null) {
            this.PreAuthorization = new Boolean(source.PreAuthorization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "Instructions", this.Instructions);
        this.setParamSimple(map, prefix + "ServiceLevel", this.ServiceLevel);
        this.setParamSimple(map, prefix + "PreAuthorization", this.PreAuthorization);

    }
}

