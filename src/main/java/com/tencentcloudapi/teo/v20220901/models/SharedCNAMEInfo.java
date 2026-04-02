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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedCNAMEInfo extends AbstractModel {

    /**
    * 共享CNAME类型：取值范围如下：
<li>custom：由用户创建的自定义共享CNAME</li>
<li>ip-ssl：IP SSL类型的共享CNAME</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 共享CNAME名称。
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。
    */
    @SerializedName("IPSSLConfig")
    @Expose
    private IPSSLConfig IPSSLConfig;

    /**
    * 共享CNAME绑定的加速域名数量。
    */
    @SerializedName("BindDomainCount")
    @Expose
    private Long BindDomainCount;

    /**
    * 加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。
    */
    @SerializedName("AccelerationDomains")
    @Expose
    private ReferenceHolder [] AccelerationDomains;

    /**
     * Get 共享CNAME类型：取值范围如下：
<li>custom：由用户创建的自定义共享CNAME</li>
<li>ip-ssl：IP SSL类型的共享CNAME</li> 
     * @return Type 共享CNAME类型：取值范围如下：
<li>custom：由用户创建的自定义共享CNAME</li>
<li>ip-ssl：IP SSL类型的共享CNAME</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 共享CNAME类型：取值范围如下：
<li>custom：由用户创建的自定义共享CNAME</li>
<li>ip-ssl：IP SSL类型的共享CNAME</li>
     * @param Type 共享CNAME类型：取值范围如下：
<li>custom：由用户创建的自定义共享CNAME</li>
<li>ip-ssl：IP SSL类型的共享CNAME</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 共享CNAME名称。 
     * @return SharedCNAME 共享CNAME名称。
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set 共享CNAME名称。
     * @param SharedCNAME 共享CNAME名称。
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。 
     * @return IPSSLConfig 当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。
     */
    public IPSSLConfig getIPSSLConfig() {
        return this.IPSSLConfig;
    }

    /**
     * Set 当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。
     * @param IPSSLConfig 当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。
     */
    public void setIPSSLConfig(IPSSLConfig IPSSLConfig) {
        this.IPSSLConfig = IPSSLConfig;
    }

    /**
     * Get 共享CNAME绑定的加速域名数量。 
     * @return BindDomainCount 共享CNAME绑定的加速域名数量。
     */
    public Long getBindDomainCount() {
        return this.BindDomainCount;
    }

    /**
     * Set 共享CNAME绑定的加速域名数量。
     * @param BindDomainCount 共享CNAME绑定的加速域名数量。
     */
    public void setBindDomainCount(Long BindDomainCount) {
        this.BindDomainCount = BindDomainCount;
    }

    /**
     * Get 加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。 
     * @return AccelerationDomains 加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。
     */
    public ReferenceHolder [] getAccelerationDomains() {
        return this.AccelerationDomains;
    }

    /**
     * Set 加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。
     * @param AccelerationDomains 加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。
     */
    public void setAccelerationDomains(ReferenceHolder [] AccelerationDomains) {
        this.AccelerationDomains = AccelerationDomains;
    }

    public SharedCNAMEInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedCNAMEInfo(SharedCNAMEInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IPSSLConfig != null) {
            this.IPSSLConfig = new IPSSLConfig(source.IPSSLConfig);
        }
        if (source.BindDomainCount != null) {
            this.BindDomainCount = new Long(source.BindDomainCount);
        }
        if (source.AccelerationDomains != null) {
            this.AccelerationDomains = new ReferenceHolder[source.AccelerationDomains.length];
            for (int i = 0; i < source.AccelerationDomains.length; i++) {
                this.AccelerationDomains[i] = new ReferenceHolder(source.AccelerationDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "IPSSLConfig.", this.IPSSLConfig);
        this.setParamSimple(map, prefix + "BindDomainCount", this.BindDomainCount);
        this.setParamArrayObj(map, prefix + "AccelerationDomains.", this.AccelerationDomains);

    }
}

