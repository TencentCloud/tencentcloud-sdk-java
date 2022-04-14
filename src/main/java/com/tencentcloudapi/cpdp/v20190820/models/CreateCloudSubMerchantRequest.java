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

public class CreateCloudSubMerchantRequest extends AbstractModel{

    /**
    * 米大师分配的支付主MidasAppId，根应用Id。
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 父应用Id。
    */
    @SerializedName("ParentAppId")
    @Expose
    private String ParentAppId;

    /**
    * 子商户名。
    */
    @SerializedName("SubMchName")
    @Expose
    private String SubMchName;

    /**
    * 子商户描述。
    */
    @SerializedName("SubMchDescription")
    @Expose
    private String SubMchDescription;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 子应用Id，为空则自动创建子应用id。
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 子商户名缩写。
    */
    @SerializedName("SubMchShortName")
    @Expose
    private String SubMchShortName;

    /**
    * 业务平台自定义的子商户Id，唯一。
    */
    @SerializedName("OutSubMerchantId")
    @Expose
    private String OutSubMerchantId;

    /**
     * Get 米大师分配的支付主MidasAppId，根应用Id。 
     * @return MidasAppId 米大师分配的支付主MidasAppId，根应用Id。
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId，根应用Id。
     * @param MidasAppId 米大师分配的支付主MidasAppId，根应用Id。
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 父应用Id。 
     * @return ParentAppId 父应用Id。
     */
    public String getParentAppId() {
        return this.ParentAppId;
    }

    /**
     * Set 父应用Id。
     * @param ParentAppId 父应用Id。
     */
    public void setParentAppId(String ParentAppId) {
        this.ParentAppId = ParentAppId;
    }

    /**
     * Get 子商户名。 
     * @return SubMchName 子商户名。
     */
    public String getSubMchName() {
        return this.SubMchName;
    }

    /**
     * Set 子商户名。
     * @param SubMchName 子商户名。
     */
    public void setSubMchName(String SubMchName) {
        this.SubMchName = SubMchName;
    }

    /**
     * Get 子商户描述。 
     * @return SubMchDescription 子商户描述。
     */
    public String getSubMchDescription() {
        return this.SubMchDescription;
    }

    /**
     * Set 子商户描述。
     * @param SubMchDescription 子商户描述。
     */
    public void setSubMchDescription(String SubMchDescription) {
        this.SubMchDescription = SubMchDescription;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 子应用Id，为空则自动创建子应用id。 
     * @return SubAppId 子应用Id，为空则自动创建子应用id。
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用Id，为空则自动创建子应用id。
     * @param SubAppId 子应用Id，为空则自动创建子应用id。
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子商户名缩写。 
     * @return SubMchShortName 子商户名缩写。
     */
    public String getSubMchShortName() {
        return this.SubMchShortName;
    }

    /**
     * Set 子商户名缩写。
     * @param SubMchShortName 子商户名缩写。
     */
    public void setSubMchShortName(String SubMchShortName) {
        this.SubMchShortName = SubMchShortName;
    }

    /**
     * Get 业务平台自定义的子商户Id，唯一。 
     * @return OutSubMerchantId 业务平台自定义的子商户Id，唯一。
     */
    public String getOutSubMerchantId() {
        return this.OutSubMerchantId;
    }

    /**
     * Set 业务平台自定义的子商户Id，唯一。
     * @param OutSubMerchantId 业务平台自定义的子商户Id，唯一。
     */
    public void setOutSubMerchantId(String OutSubMerchantId) {
        this.OutSubMerchantId = OutSubMerchantId;
    }

    public CreateCloudSubMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudSubMerchantRequest(CreateCloudSubMerchantRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.ParentAppId != null) {
            this.ParentAppId = new String(source.ParentAppId);
        }
        if (source.SubMchName != null) {
            this.SubMchName = new String(source.SubMchName);
        }
        if (source.SubMchDescription != null) {
            this.SubMchDescription = new String(source.SubMchDescription);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.SubMchShortName != null) {
            this.SubMchShortName = new String(source.SubMchShortName);
        }
        if (source.OutSubMerchantId != null) {
            this.OutSubMerchantId = new String(source.OutSubMerchantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "ParentAppId", this.ParentAppId);
        this.setParamSimple(map, prefix + "SubMchName", this.SubMchName);
        this.setParamSimple(map, prefix + "SubMchDescription", this.SubMchDescription);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SubMchShortName", this.SubMchShortName);
        this.setParamSimple(map, prefix + "OutSubMerchantId", this.OutSubMerchantId);

    }
}

