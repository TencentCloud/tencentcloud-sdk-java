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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTCRInstanceListRequest extends AbstractModel {

    /**
    * <p>访问密钥Id</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>访问密钥Key</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>镜像仓库所在region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String [] RegistryRegion;

    /**
    * <p>镜像仓库id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>筛选项</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get <p>访问密钥Id</p> 
     * @return AccessKey <p>访问密钥Id</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>访问密钥Id</p>
     * @param AccessKey <p>访问密钥Id</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>访问密钥Key</p> 
     * @return SecretKey <p>访问密钥Key</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>访问密钥Key</p>
     * @param SecretKey <p>访问密钥Key</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>镜像仓库所在region</p> 
     * @return RegistryRegion <p>镜像仓库所在region</p>
     */
    public String [] getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>镜像仓库所在region</p>
     * @param RegistryRegion <p>镜像仓库所在region</p>
     */
    public void setRegistryRegion(String [] RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>镜像仓库id</p> 
     * @return RegistryId <p>镜像仓库id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>镜像仓库id</p>
     * @param RegistryId <p>镜像仓库id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>筛选项</p> 
     * @return Filter <p>筛选项</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>筛选项</p>
     * @param Filter <p>筛选项</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeTCRInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTCRInstanceListRequest(DescribeTCRInstanceListRequest source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String[source.RegistryRegion.length];
            for (int i = 0; i < source.RegistryRegion.length; i++) {
                this.RegistryRegion[i] = new String(source.RegistryRegion[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "RegistryRegion.", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

