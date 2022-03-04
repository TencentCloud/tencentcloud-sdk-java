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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewContractRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 外部合同主键编号（ContractId或OutContractId必须传一个）
    */
    @SerializedName("OutContractId")
    @Expose
    private String OutContractId;

    /**
    * 合同主键（ContractId或OutContractId必须传一个）
    */
    @SerializedName("ContractId")
    @Expose
    private String ContractId;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 外部合同主键编号（ContractId或OutContractId必须传一个） 
     * @return OutContractId 外部合同主键编号（ContractId或OutContractId必须传一个）
     */
    public String getOutContractId() {
        return this.OutContractId;
    }

    /**
     * Set 外部合同主键编号（ContractId或OutContractId必须传一个）
     * @param OutContractId 外部合同主键编号（ContractId或OutContractId必须传一个）
     */
    public void setOutContractId(String OutContractId) {
        this.OutContractId = OutContractId;
    }

    /**
     * Get 合同主键（ContractId或OutContractId必须传一个） 
     * @return ContractId 合同主键（ContractId或OutContractId必须传一个）
     */
    public String getContractId() {
        return this.ContractId;
    }

    /**
     * Set 合同主键（ContractId或OutContractId必须传一个）
     * @param ContractId 合同主键（ContractId或OutContractId必须传一个）
     */
    public void setContractId(String ContractId) {
        this.ContractId = ContractId;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public ViewContractRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewContractRequest(ViewContractRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.OutContractId != null) {
            this.OutContractId = new String(source.OutContractId);
        }
        if (source.ContractId != null) {
            this.ContractId = new String(source.ContractId);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "OutContractId", this.OutContractId);
        this.setParamSimple(map, prefix + "ContractId", this.ContractId);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

