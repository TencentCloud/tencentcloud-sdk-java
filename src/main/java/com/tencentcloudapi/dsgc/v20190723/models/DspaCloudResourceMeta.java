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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaCloudResourceMeta extends AbstractModel{

    /**
    * 用户资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源VIP。
    */
    @SerializedName("ResourceVip")
    @Expose
    private String ResourceVip;

    /**
    * 资源端口。
    */
    @SerializedName("ResourceVPort")
    @Expose
    private Long ResourceVPort;

    /**
    * 资源被创建时间。
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * 用户资源VPC ID 字符串。
    */
    @SerializedName("ResourceUniqueVpcId")
    @Expose
    private String ResourceUniqueVpcId;

    /**
    * 用户资源Subnet ID 字符串。
    */
    @SerializedName("ResourceUniqueSubnetId")
    @Expose
    private String ResourceUniqueSubnetId;

    /**
     * Get 用户资源ID。 
     * @return ResourceId 用户资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 用户资源ID。
     * @param ResourceId 用户资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称。 
     * @return ResourceName 资源名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称。
     * @param ResourceName 资源名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源VIP。 
     * @return ResourceVip 资源VIP。
     */
    public String getResourceVip() {
        return this.ResourceVip;
    }

    /**
     * Set 资源VIP。
     * @param ResourceVip 资源VIP。
     */
    public void setResourceVip(String ResourceVip) {
        this.ResourceVip = ResourceVip;
    }

    /**
     * Get 资源端口。 
     * @return ResourceVPort 资源端口。
     */
    public Long getResourceVPort() {
        return this.ResourceVPort;
    }

    /**
     * Set 资源端口。
     * @param ResourceVPort 资源端口。
     */
    public void setResourceVPort(Long ResourceVPort) {
        this.ResourceVPort = ResourceVPort;
    }

    /**
     * Get 资源被创建时间。 
     * @return ResourceCreateTime 资源被创建时间。
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set 资源被创建时间。
     * @param ResourceCreateTime 资源被创建时间。
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
    }

    /**
     * Get 用户资源VPC ID 字符串。 
     * @return ResourceUniqueVpcId 用户资源VPC ID 字符串。
     */
    public String getResourceUniqueVpcId() {
        return this.ResourceUniqueVpcId;
    }

    /**
     * Set 用户资源VPC ID 字符串。
     * @param ResourceUniqueVpcId 用户资源VPC ID 字符串。
     */
    public void setResourceUniqueVpcId(String ResourceUniqueVpcId) {
        this.ResourceUniqueVpcId = ResourceUniqueVpcId;
    }

    /**
     * Get 用户资源Subnet ID 字符串。 
     * @return ResourceUniqueSubnetId 用户资源Subnet ID 字符串。
     */
    public String getResourceUniqueSubnetId() {
        return this.ResourceUniqueSubnetId;
    }

    /**
     * Set 用户资源Subnet ID 字符串。
     * @param ResourceUniqueSubnetId 用户资源Subnet ID 字符串。
     */
    public void setResourceUniqueSubnetId(String ResourceUniqueSubnetId) {
        this.ResourceUniqueSubnetId = ResourceUniqueSubnetId;
    }

    public DspaCloudResourceMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaCloudResourceMeta(DspaCloudResourceMeta source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceVip != null) {
            this.ResourceVip = new String(source.ResourceVip);
        }
        if (source.ResourceVPort != null) {
            this.ResourceVPort = new Long(source.ResourceVPort);
        }
        if (source.ResourceCreateTime != null) {
            this.ResourceCreateTime = new String(source.ResourceCreateTime);
        }
        if (source.ResourceUniqueVpcId != null) {
            this.ResourceUniqueVpcId = new String(source.ResourceUniqueVpcId);
        }
        if (source.ResourceUniqueSubnetId != null) {
            this.ResourceUniqueSubnetId = new String(source.ResourceUniqueSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceVip", this.ResourceVip);
        this.setParamSimple(map, prefix + "ResourceVPort", this.ResourceVPort);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamSimple(map, prefix + "ResourceUniqueVpcId", this.ResourceUniqueVpcId);
        this.setParamSimple(map, prefix + "ResourceUniqueSubnetId", this.ResourceUniqueSubnetId);

    }
}

