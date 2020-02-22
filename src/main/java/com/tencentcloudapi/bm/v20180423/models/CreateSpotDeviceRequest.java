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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSpotDeviceRequest extends AbstractModel{

    /**
    * 可用区名称。如ap-guangzhou-bls-1, 通过DescribeRegions获取
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计算单元类型, 如v3.c2.medium，更详细的ComputeType参考[竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)
    */
    @SerializedName("ComputeType")
    @Expose
    private String ComputeType;

    /**
    * 操作系统类型ID
    */
    @SerializedName("OsTypeId")
    @Expose
    private Long OsTypeId;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 购买的计算单元个数
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 出价策略。可取值为SpotWithPriceLimit和SpotAsPriceGo。SpotWithPriceLimit，用户设置价格上限，需要传SpotPriceLimit参数， 如果市场价高于用户的指定价格，则购买不成功;  SpotAsPriceGo 是随市场价的策略。
    */
    @SerializedName("SpotStrategy")
    @Expose
    private String SpotStrategy;

    /**
    * 用户设置的价格。当为SpotWithPriceLimit竞价策略时有效
    */
    @SerializedName("SpotPriceLimit")
    @Expose
    private Float SpotPriceLimit;

    /**
    * 设置竞价实例密码。可选参数，没有指定会生成随机密码
    */
    @SerializedName("Passwd")
    @Expose
    private String Passwd;

    /**
     * Get 可用区名称。如ap-guangzhou-bls-1, 通过DescribeRegions获取 
     * @return Zone 可用区名称。如ap-guangzhou-bls-1, 通过DescribeRegions获取
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称。如ap-guangzhou-bls-1, 通过DescribeRegions获取
     * @param Zone 可用区名称。如ap-guangzhou-bls-1, 通过DescribeRegions获取
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计算单元类型, 如v3.c2.medium，更详细的ComputeType参考[竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256) 
     * @return ComputeType 计算单元类型, 如v3.c2.medium，更详细的ComputeType参考[竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)
     */
    public String getComputeType() {
        return this.ComputeType;
    }

    /**
     * Set 计算单元类型, 如v3.c2.medium，更详细的ComputeType参考[竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)
     * @param ComputeType 计算单元类型, 如v3.c2.medium，更详细的ComputeType参考[竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)
     */
    public void setComputeType(String ComputeType) {
        this.ComputeType = ComputeType;
    }

    /**
     * Get 操作系统类型ID 
     * @return OsTypeId 操作系统类型ID
     */
    public Long getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * Set 操作系统类型ID
     * @param OsTypeId 操作系统类型ID
     */
    public void setOsTypeId(Long OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 购买的计算单元个数 
     * @return GoodsNum 购买的计算单元个数
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买的计算单元个数
     * @param GoodsNum 购买的计算单元个数
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 出价策略。可取值为SpotWithPriceLimit和SpotAsPriceGo。SpotWithPriceLimit，用户设置价格上限，需要传SpotPriceLimit参数， 如果市场价高于用户的指定价格，则购买不成功;  SpotAsPriceGo 是随市场价的策略。 
     * @return SpotStrategy 出价策略。可取值为SpotWithPriceLimit和SpotAsPriceGo。SpotWithPriceLimit，用户设置价格上限，需要传SpotPriceLimit参数， 如果市场价高于用户的指定价格，则购买不成功;  SpotAsPriceGo 是随市场价的策略。
     */
    public String getSpotStrategy() {
        return this.SpotStrategy;
    }

    /**
     * Set 出价策略。可取值为SpotWithPriceLimit和SpotAsPriceGo。SpotWithPriceLimit，用户设置价格上限，需要传SpotPriceLimit参数， 如果市场价高于用户的指定价格，则购买不成功;  SpotAsPriceGo 是随市场价的策略。
     * @param SpotStrategy 出价策略。可取值为SpotWithPriceLimit和SpotAsPriceGo。SpotWithPriceLimit，用户设置价格上限，需要传SpotPriceLimit参数， 如果市场价高于用户的指定价格，则购买不成功;  SpotAsPriceGo 是随市场价的策略。
     */
    public void setSpotStrategy(String SpotStrategy) {
        this.SpotStrategy = SpotStrategy;
    }

    /**
     * Get 用户设置的价格。当为SpotWithPriceLimit竞价策略时有效 
     * @return SpotPriceLimit 用户设置的价格。当为SpotWithPriceLimit竞价策略时有效
     */
    public Float getSpotPriceLimit() {
        return this.SpotPriceLimit;
    }

    /**
     * Set 用户设置的价格。当为SpotWithPriceLimit竞价策略时有效
     * @param SpotPriceLimit 用户设置的价格。当为SpotWithPriceLimit竞价策略时有效
     */
    public void setSpotPriceLimit(Float SpotPriceLimit) {
        this.SpotPriceLimit = SpotPriceLimit;
    }

    /**
     * Get 设置竞价实例密码。可选参数，没有指定会生成随机密码 
     * @return Passwd 设置竞价实例密码。可选参数，没有指定会生成随机密码
     */
    public String getPasswd() {
        return this.Passwd;
    }

    /**
     * Set 设置竞价实例密码。可选参数，没有指定会生成随机密码
     * @param Passwd 设置竞价实例密码。可选参数，没有指定会生成随机密码
     */
    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ComputeType", this.ComputeType);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "SpotStrategy", this.SpotStrategy);
        this.setParamSimple(map, prefix + "SpotPriceLimit", this.SpotPriceLimit);
        this.setParamSimple(map, prefix + "Passwd", this.Passwd);

    }
}

