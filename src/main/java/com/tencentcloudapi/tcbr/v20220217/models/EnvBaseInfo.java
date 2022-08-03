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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvBaseInfo extends AbstractModel{

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 套餐类型：Trial ｜ Standard ｜ Professional ｜ Enterprise
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * VPC Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 环境创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 环境别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 环境状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 环境地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 环境类型 tcbr ｜ run
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 子网id
    */
    @SerializedName("SubnetIds")
    @Expose
    private String SubnetIds;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 套餐类型：Trial ｜ Standard ｜ Professional ｜ Enterprise 
     * @return PackageType 套餐类型：Trial ｜ Standard ｜ Professional ｜ Enterprise
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 套餐类型：Trial ｜ Standard ｜ Professional ｜ Enterprise
     * @param PackageType 套餐类型：Trial ｜ Standard ｜ Professional ｜ Enterprise
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get VPC Id 
     * @return VpcId VPC Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id
     * @param VpcId VPC Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 环境创建时间 
     * @return CreateTime 环境创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 环境创建时间
     * @param CreateTime 环境创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 环境别名 
     * @return Alias 环境别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 环境别名
     * @param Alias 环境别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 环境状态 
     * @return Status 环境状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 环境状态
     * @param Status 环境状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 环境地域 
     * @return Region 环境地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 环境地域
     * @param Region 环境地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 环境类型 tcbr ｜ run 
     * @return EnvType 环境类型 tcbr ｜ run
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型 tcbr ｜ run
     * @param EnvType 环境类型 tcbr ｜ run
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 子网id 
     * @return SubnetIds 子网id
     */
    public String getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id
     * @param SubnetIds 子网id
     */
    public void setSubnetIds(String SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    public EnvBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvBaseInfo(EnvBaseInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String(source.SubnetIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "SubnetIds", this.SubnetIds);

    }
}

