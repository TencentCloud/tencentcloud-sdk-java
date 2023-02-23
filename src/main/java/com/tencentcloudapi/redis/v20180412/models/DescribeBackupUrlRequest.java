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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份 ID，可通过 [DescribeInstanceBackups ](https://cloud.tencent.com/document/product/239/20011)接口返回的参数 RedisBackupSet 获取。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 下载备份文件的网络限制类型，如果不配置该参数，则使用用户自定义的配置。

- NoLimit：不限制，腾讯云内外网均可以下载备份文件。
-  LimitOnlyIntranet：仅腾讯云自动分配的内网地址可下载备份文件。
- Customize：指用户自定义的私有网络可下载备份文件。
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * 该参数仅支持输入 In，表示自定义的**LimitVpc**可以下载备份文件。
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * 标识自定义的 LimitIp 地址是否可下载备份文件。

- In: 自定义的 IP 地址可以下载。默认为 In。
- NotIn: 自定义的 IP 不可以下载。
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * 自定义的可下载备份文件的 VPC ID。当参数**LimitType**为**Customize **时，需配置该参数。
    */
    @SerializedName("LimitVpc")
    @Expose
    private BackupLimitVpcItem [] LimitVpc;

    /**
    * 自定义的可下载备份文件的 VPC IP 地址。当参数**LimitType**为**Customize **时，需配置该参数。
    */
    @SerializedName("LimitIp")
    @Expose
    private String [] LimitIp;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份 ID，可通过 [DescribeInstanceBackups ](https://cloud.tencent.com/document/product/239/20011)接口返回的参数 RedisBackupSet 获取。 
     * @return BackupId 备份 ID，可通过 [DescribeInstanceBackups ](https://cloud.tencent.com/document/product/239/20011)接口返回的参数 RedisBackupSet 获取。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份 ID，可通过 [DescribeInstanceBackups ](https://cloud.tencent.com/document/product/239/20011)接口返回的参数 RedisBackupSet 获取。
     * @param BackupId 备份 ID，可通过 [DescribeInstanceBackups ](https://cloud.tencent.com/document/product/239/20011)接口返回的参数 RedisBackupSet 获取。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 下载备份文件的网络限制类型，如果不配置该参数，则使用用户自定义的配置。

- NoLimit：不限制，腾讯云内外网均可以下载备份文件。
-  LimitOnlyIntranet：仅腾讯云自动分配的内网地址可下载备份文件。
- Customize：指用户自定义的私有网络可下载备份文件。 
     * @return LimitType 下载备份文件的网络限制类型，如果不配置该参数，则使用用户自定义的配置。

- NoLimit：不限制，腾讯云内外网均可以下载备份文件。
-  LimitOnlyIntranet：仅腾讯云自动分配的内网地址可下载备份文件。
- Customize：指用户自定义的私有网络可下载备份文件。
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set 下载备份文件的网络限制类型，如果不配置该参数，则使用用户自定义的配置。

- NoLimit：不限制，腾讯云内外网均可以下载备份文件。
-  LimitOnlyIntranet：仅腾讯云自动分配的内网地址可下载备份文件。
- Customize：指用户自定义的私有网络可下载备份文件。
     * @param LimitType 下载备份文件的网络限制类型，如果不配置该参数，则使用用户自定义的配置。

- NoLimit：不限制，腾讯云内外网均可以下载备份文件。
-  LimitOnlyIntranet：仅腾讯云自动分配的内网地址可下载备份文件。
- Customize：指用户自定义的私有网络可下载备份文件。
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get 该参数仅支持输入 In，表示自定义的**LimitVpc**可以下载备份文件。 
     * @return VpcComparisonSymbol 该参数仅支持输入 In，表示自定义的**LimitVpc**可以下载备份文件。
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set 该参数仅支持输入 In，表示自定义的**LimitVpc**可以下载备份文件。
     * @param VpcComparisonSymbol 该参数仅支持输入 In，表示自定义的**LimitVpc**可以下载备份文件。
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get 标识自定义的 LimitIp 地址是否可下载备份文件。

- In: 自定义的 IP 地址可以下载。默认为 In。
- NotIn: 自定义的 IP 不可以下载。 
     * @return IpComparisonSymbol 标识自定义的 LimitIp 地址是否可下载备份文件。

- In: 自定义的 IP 地址可以下载。默认为 In。
- NotIn: 自定义的 IP 不可以下载。
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set 标识自定义的 LimitIp 地址是否可下载备份文件。

- In: 自定义的 IP 地址可以下载。默认为 In。
- NotIn: 自定义的 IP 不可以下载。
     * @param IpComparisonSymbol 标识自定义的 LimitIp 地址是否可下载备份文件。

- In: 自定义的 IP 地址可以下载。默认为 In。
- NotIn: 自定义的 IP 不可以下载。
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get 自定义的可下载备份文件的 VPC ID。当参数**LimitType**为**Customize **时，需配置该参数。 
     * @return LimitVpc 自定义的可下载备份文件的 VPC ID。当参数**LimitType**为**Customize **时，需配置该参数。
     */
    public BackupLimitVpcItem [] getLimitVpc() {
        return this.LimitVpc;
    }

    /**
     * Set 自定义的可下载备份文件的 VPC ID。当参数**LimitType**为**Customize **时，需配置该参数。
     * @param LimitVpc 自定义的可下载备份文件的 VPC ID。当参数**LimitType**为**Customize **时，需配置该参数。
     */
    public void setLimitVpc(BackupLimitVpcItem [] LimitVpc) {
        this.LimitVpc = LimitVpc;
    }

    /**
     * Get 自定义的可下载备份文件的 VPC IP 地址。当参数**LimitType**为**Customize **时，需配置该参数。 
     * @return LimitIp 自定义的可下载备份文件的 VPC IP 地址。当参数**LimitType**为**Customize **时，需配置该参数。
     */
    public String [] getLimitIp() {
        return this.LimitIp;
    }

    /**
     * Set 自定义的可下载备份文件的 VPC IP 地址。当参数**LimitType**为**Customize **时，需配置该参数。
     * @param LimitIp 自定义的可下载备份文件的 VPC IP 地址。当参数**LimitType**为**Customize **时，需配置该参数。
     */
    public void setLimitIp(String [] LimitIp) {
        this.LimitIp = LimitIp;
    }

    public DescribeBackupUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupUrlRequest(DescribeBackupUrlRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpc.", this.LimitVpc);
        this.setParamArraySimple(map, prefix + "LimitIp.", this.LimitIp);

    }
}

