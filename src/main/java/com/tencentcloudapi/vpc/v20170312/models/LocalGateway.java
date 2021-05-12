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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalGateway extends AbstractModel{

    /**
    * CDC实例ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 本地网关实例ID
    */
    @SerializedName("UniqLocalGwId")
    @Expose
    private String UniqLocalGwId;

    /**
    * 本地网关名称
    */
    @SerializedName("LocalGatewayName")
    @Expose
    private String LocalGatewayName;

    /**
    * 本地网关IP地址
    */
    @SerializedName("LocalGwIp")
    @Expose
    private String LocalGwIp;

    /**
    * 本地网关创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get CDC实例ID 
     * @return CdcId CDC实例ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC实例ID
     * @param CdcId CDC实例ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get VPC实例ID 
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 本地网关实例ID 
     * @return UniqLocalGwId 本地网关实例ID
     */
    public String getUniqLocalGwId() {
        return this.UniqLocalGwId;
    }

    /**
     * Set 本地网关实例ID
     * @param UniqLocalGwId 本地网关实例ID
     */
    public void setUniqLocalGwId(String UniqLocalGwId) {
        this.UniqLocalGwId = UniqLocalGwId;
    }

    /**
     * Get 本地网关名称 
     * @return LocalGatewayName 本地网关名称
     */
    public String getLocalGatewayName() {
        return this.LocalGatewayName;
    }

    /**
     * Set 本地网关名称
     * @param LocalGatewayName 本地网关名称
     */
    public void setLocalGatewayName(String LocalGatewayName) {
        this.LocalGatewayName = LocalGatewayName;
    }

    /**
     * Get 本地网关IP地址 
     * @return LocalGwIp 本地网关IP地址
     */
    public String getLocalGwIp() {
        return this.LocalGwIp;
    }

    /**
     * Set 本地网关IP地址
     * @param LocalGwIp 本地网关IP地址
     */
    public void setLocalGwIp(String LocalGwIp) {
        this.LocalGwIp = LocalGwIp;
    }

    /**
     * Get 本地网关创建时间 
     * @return CreateTime 本地网关创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 本地网关创建时间
     * @param CreateTime 本地网关创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalGateway(LocalGateway source) {
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UniqLocalGwId != null) {
            this.UniqLocalGwId = new String(source.UniqLocalGwId);
        }
        if (source.LocalGatewayName != null) {
            this.LocalGatewayName = new String(source.LocalGatewayName);
        }
        if (source.LocalGwIp != null) {
            this.LocalGwIp = new String(source.LocalGwIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqLocalGwId", this.UniqLocalGwId);
        this.setParamSimple(map, prefix + "LocalGatewayName", this.LocalGatewayName);
        this.setParamSimple(map, prefix + "LocalGwIp", this.LocalGwIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

