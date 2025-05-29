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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadRestrictionRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 下载限制类型，NoLimit-不限制,LimitOnlyIntranet-限制内网 ,Customize-自定义
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * 限制下载的vpc设置
    */
    @SerializedName("LimitVpcs")
    @Expose
    private BackupLimitVpcItem [] LimitVpcs;

    /**
    * 限制下载的ip设置
    */
    @SerializedName("LimitIps")
    @Expose
    private String [] LimitIps;

    /**
     * Get 集群ID 
     * @return ClusterIds 集群ID
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群ID
     * @param ClusterIds 集群ID
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 下载限制类型，NoLimit-不限制,LimitOnlyIntranet-限制内网 ,Customize-自定义 
     * @return LimitType 下载限制类型，NoLimit-不限制,LimitOnlyIntranet-限制内网 ,Customize-自定义
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set 下载限制类型，NoLimit-不限制,LimitOnlyIntranet-限制内网 ,Customize-自定义
     * @param LimitType 下载限制类型，NoLimit-不限制,LimitOnlyIntranet-限制内网 ,Customize-自定义
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In 
     * @return VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     * @param VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get In: 指定的ip可以下载； NotIn: 指定的ip不可以下载 
     * @return IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     * @param IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get 限制下载的vpc设置 
     * @return LimitVpcs 限制下载的vpc设置
     */
    public BackupLimitVpcItem [] getLimitVpcs() {
        return this.LimitVpcs;
    }

    /**
     * Set 限制下载的vpc设置
     * @param LimitVpcs 限制下载的vpc设置
     */
    public void setLimitVpcs(BackupLimitVpcItem [] LimitVpcs) {
        this.LimitVpcs = LimitVpcs;
    }

    /**
     * Get 限制下载的ip设置 
     * @return LimitIps 限制下载的ip设置
     */
    public String [] getLimitIps() {
        return this.LimitIps;
    }

    /**
     * Set 限制下载的ip设置
     * @param LimitIps 限制下载的ip设置
     */
    public void setLimitIps(String [] LimitIps) {
        this.LimitIps = LimitIps;
    }

    public ModifyBackupDownloadRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupDownloadRestrictionRequest(ModifyBackupDownloadRestrictionRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.VpcComparisonSymbol != null) {
            this.VpcComparisonSymbol = new String(source.VpcComparisonSymbol);
        }
        if (source.IpComparisonSymbol != null) {
            this.IpComparisonSymbol = new String(source.IpComparisonSymbol);
        }
        if (source.LimitVpcs != null) {
            this.LimitVpcs = new BackupLimitVpcItem[source.LimitVpcs.length];
            for (int i = 0; i < source.LimitVpcs.length; i++) {
                this.LimitVpcs[i] = new BackupLimitVpcItem(source.LimitVpcs[i]);
            }
        }
        if (source.LimitIps != null) {
            this.LimitIps = new String[source.LimitIps.length];
            for (int i = 0; i < source.LimitIps.length; i++) {
                this.LimitIps[i] = new String(source.LimitIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpcs.", this.LimitVpcs);
        this.setParamArraySimple(map, prefix + "LimitIps.", this.LimitIps);

    }
}

