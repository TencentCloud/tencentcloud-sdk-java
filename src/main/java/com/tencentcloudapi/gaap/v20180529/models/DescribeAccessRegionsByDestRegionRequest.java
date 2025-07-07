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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessRegionsByDestRegionRequest extends AbstractModel {

    /**
    * 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
    * IP版本，可取值：IPv4、IPv6，默认值IPv4
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
     * Get 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值 
     * @return DestRegion 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * Set 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     * @param DestRegion 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * Get IP版本，可取值：IPv4、IPv6，默认值IPv4 
     * @return IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP版本，可取值：IPv4、IPv6，默认值IPv4
     * @param IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。 
     * @return PackageType 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     * @param PackageType 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    public DescribeAccessRegionsByDestRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessRegionsByDestRegionRequest(DescribeAccessRegionsByDestRegionRequest source) {
        if (source.DestRegion != null) {
            this.DestRegion = new String(source.DestRegion);
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);

    }
}

