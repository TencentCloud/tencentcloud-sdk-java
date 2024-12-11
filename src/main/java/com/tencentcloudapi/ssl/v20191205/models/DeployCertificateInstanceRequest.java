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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployCertificateInstanceRequest extends AbstractModel {

    /**
    * 待部署的证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 需要部署实例列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 部署的云资源类型,如clb，cos
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 部署云资源状态：
云直播：
-1：域名未关联证书。
1： 域名https已开启。
0： 域名https已关闭。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
    */
    @SerializedName("IsCache")
    @Expose
    private Long IsCache;

    /**
     * Get 待部署的证书ID 
     * @return CertificateId 待部署的证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 待部署的证书ID
     * @param CertificateId 待部署的证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 需要部署实例列表 
     * @return InstanceIdList 需要部署实例列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 需要部署实例列表
     * @param InstanceIdList 需要部署实例列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 部署的云资源类型,如clb，cos 
     * @return ResourceType 部署的云资源类型,如clb，cos
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 部署的云资源类型,如clb，cos
     * @param ResourceType 部署的云资源类型,如clb，cos
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 部署云资源状态：
云直播：
-1：域名未关联证书。
1： 域名https已开启。
0： 域名https已关闭。 
     * @return Status 部署云资源状态：
云直播：
-1：域名未关联证书。
1： 域名https已开启。
0： 域名https已关闭。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 部署云资源状态：
云直播：
-1：域名未关联证书。
1： 域名https已开启。
0： 域名https已关闭。
     * @param Status 部署云资源状态：
云直播：
-1：域名未关联证书。
1： 域名https已开启。
0： 域名https已关闭。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时 
     * @return IsCache 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     */
    public Long getIsCache() {
        return this.IsCache;
    }

    /**
     * Set 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     * @param IsCache 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     */
    public void setIsCache(Long IsCache) {
        this.IsCache = IsCache;
    }

    public DeployCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployCertificateInstanceRequest(DeployCertificateInstanceRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsCache != null) {
            this.IsCache = new Long(source.IsCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsCache", this.IsCache);

    }
}

