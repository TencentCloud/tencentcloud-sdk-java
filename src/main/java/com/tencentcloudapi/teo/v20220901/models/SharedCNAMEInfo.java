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
    * <p>共享CNAME类型：取值范围如下：</p><li>custom：由用户创建的自定义共享CNAME</li><li>ip-ssl：IP SSL类型的共享CNAME</li><li>zero-rating：免流类型的共享CNAME</li><li>preset：预置资源类型的共享CNAME</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>共享CNAME名称。</p>
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * <p>描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。</p>
    */
    @SerializedName("IPSSLConfig")
    @Expose
    private IPSSLConfig IPSSLConfig;

    /**
    * <p>共享CNAME绑定的加速域名数量。</p>
    */
    @SerializedName("BindDomainCount")
    @Expose
    private Long BindDomainCount;

    /**
    * <p>加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。</p>
    */
    @SerializedName("AccelerationDomains")
    @Expose
    private ReferenceHolder [] AccelerationDomains;

    /**
     * Get <p>共享CNAME类型：取值范围如下：</p><li>custom：由用户创建的自定义共享CNAME</li><li>ip-ssl：IP SSL类型的共享CNAME</li><li>zero-rating：免流类型的共享CNAME</li><li>preset：预置资源类型的共享CNAME</li> 
     * @return Type <p>共享CNAME类型：取值范围如下：</p><li>custom：由用户创建的自定义共享CNAME</li><li>ip-ssl：IP SSL类型的共享CNAME</li><li>zero-rating：免流类型的共享CNAME</li><li>preset：预置资源类型的共享CNAME</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>共享CNAME类型：取值范围如下：</p><li>custom：由用户创建的自定义共享CNAME</li><li>ip-ssl：IP SSL类型的共享CNAME</li><li>zero-rating：免流类型的共享CNAME</li><li>preset：预置资源类型的共享CNAME</li>
     * @param Type <p>共享CNAME类型：取值范围如下：</p><li>custom：由用户创建的自定义共享CNAME</li><li>ip-ssl：IP SSL类型的共享CNAME</li><li>zero-rating：免流类型的共享CNAME</li><li>preset：预置资源类型的共享CNAME</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>共享CNAME名称。</p> 
     * @return SharedCNAME <p>共享CNAME名称。</p>
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set <p>共享CNAME名称。</p>
     * @param SharedCNAME <p>共享CNAME名称。</p>
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get <p>描述。</p> 
     * @return Description <p>描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述。</p>
     * @param Description <p>描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。</p> 
     * @return IPSSLConfig <p>当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。</p>
     */
    public IPSSLConfig getIPSSLConfig() {
        return this.IPSSLConfig;
    }

    /**
     * Set <p>当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。</p>
     * @param IPSSLConfig <p>当type为ip-ssl时，展示该共享CNAME关联的 IP SSL 配置信息。</p>
     */
    public void setIPSSLConfig(IPSSLConfig IPSSLConfig) {
        this.IPSSLConfig = IPSSLConfig;
    }

    /**
     * Get <p>共享CNAME绑定的加速域名数量。</p> 
     * @return BindDomainCount <p>共享CNAME绑定的加速域名数量。</p>
     */
    public Long getBindDomainCount() {
        return this.BindDomainCount;
    }

    /**
     * Set <p>共享CNAME绑定的加速域名数量。</p>
     * @param BindDomainCount <p>共享CNAME绑定的加速域名数量。</p>
     */
    public void setBindDomainCount(Long BindDomainCount) {
        this.BindDomainCount = BindDomainCount;
    }

    /**
     * Get <p>加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。</p> 
     * @return AccelerationDomains <p>加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。</p>
     */
    public ReferenceHolder [] getAccelerationDomains() {
        return this.AccelerationDomains;
    }

    /**
     * Set <p>加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。</p>
     * @param AccelerationDomains <p>加入该共享CNAME的加速域名列表。当加入的域名数量超过100个时，只返回前100个加速域名。</p>
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

