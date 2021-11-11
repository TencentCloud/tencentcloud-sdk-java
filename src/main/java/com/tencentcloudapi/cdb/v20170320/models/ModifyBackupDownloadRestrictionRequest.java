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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupDownloadRestrictionRequest extends AbstractModel{

    /**
    * NoLimit 不限制,内外网都可以下载； LimitOnlyIntranet 仅内网可下载； Customize 用户自定义vpc:ip可下载。 只有该值为 Customize 时，才可以设置 LimitVpc 和 LimitIp 。
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In。
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * In: 指定的ip可以下载； NotIn: 指定的ip不可以下载。 默认为In。
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * 限制下载的vpc设置。
    */
    @SerializedName("LimitVpc")
    @Expose
    private BackupLimitVpcItem [] LimitVpc;

    /**
    * 限制下载的ip设置
    */
    @SerializedName("LimitIp")
    @Expose
    private String [] LimitIp;

    /**
     * Get NoLimit 不限制,内外网都可以下载； LimitOnlyIntranet 仅内网可下载； Customize 用户自定义vpc:ip可下载。 只有该值为 Customize 时，才可以设置 LimitVpc 和 LimitIp 。 
     * @return LimitType NoLimit 不限制,内外网都可以下载； LimitOnlyIntranet 仅内网可下载； Customize 用户自定义vpc:ip可下载。 只有该值为 Customize 时，才可以设置 LimitVpc 和 LimitIp 。
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set NoLimit 不限制,内外网都可以下载； LimitOnlyIntranet 仅内网可下载； Customize 用户自定义vpc:ip可下载。 只有该值为 Customize 时，才可以设置 LimitVpc 和 LimitIp 。
     * @param LimitType NoLimit 不限制,内外网都可以下载； LimitOnlyIntranet 仅内网可下载； Customize 用户自定义vpc:ip可下载。 只有该值为 Customize 时，才可以设置 LimitVpc 和 LimitIp 。
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In。 
     * @return VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In。
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In。
     * @param VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In。
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get In: 指定的ip可以下载； NotIn: 指定的ip不可以下载。 默认为In。 
     * @return IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载。 默认为In。
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set In: 指定的ip可以下载； NotIn: 指定的ip不可以下载。 默认为In。
     * @param IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载。 默认为In。
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get 限制下载的vpc设置。 
     * @return LimitVpc 限制下载的vpc设置。
     */
    public BackupLimitVpcItem [] getLimitVpc() {
        return this.LimitVpc;
    }

    /**
     * Set 限制下载的vpc设置。
     * @param LimitVpc 限制下载的vpc设置。
     */
    public void setLimitVpc(BackupLimitVpcItem [] LimitVpc) {
        this.LimitVpc = LimitVpc;
    }

    /**
     * Get 限制下载的ip设置 
     * @return LimitIp 限制下载的ip设置
     */
    public String [] getLimitIp() {
        return this.LimitIp;
    }

    /**
     * Set 限制下载的ip设置
     * @param LimitIp 限制下载的ip设置
     */
    public void setLimitIp(String [] LimitIp) {
        this.LimitIp = LimitIp;
    }

    public ModifyBackupDownloadRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupDownloadRestrictionRequest(ModifyBackupDownloadRestrictionRequest source) {
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.VpcComparisonSymbol != null) {
            this.VpcComparisonSymbol = new String(source.VpcComparisonSymbol);
        }
        if (source.IpComparisonSymbol != null) {
            this.IpComparisonSymbol = new String(source.IpComparisonSymbol);
        }
        if (source.LimitVpc != null) {
            this.LimitVpc = new BackupLimitVpcItem[source.LimitVpc.length];
            for (int i = 0; i < source.LimitVpc.length; i++) {
                this.LimitVpc[i] = new BackupLimitVpcItem(source.LimitVpc[i]);
            }
        }
        if (source.LimitIp != null) {
            this.LimitIp = new String[source.LimitIp.length];
            for (int i = 0; i < source.LimitIp.length; i++) {
                this.LimitIp[i] = new String(source.LimitIp[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpc.", this.LimitVpc);
        this.setParamArraySimple(map, prefix + "LimitIp.", this.LimitIp);

    }
}

