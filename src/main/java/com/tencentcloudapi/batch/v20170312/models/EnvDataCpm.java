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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvDataCpm  extends AbstractModel{

    /**
    * 黑石可用区列表。可通过黑石[DescribeRegions](https://cloud.tencent.com/document/api/386/33564)接口查询。目前仅支持一个可用区。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 黑石计算单元类型列表。如v3.c2.medium，更详细的ComputeType参考[黑石竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)。目前仅支持一个计算单元类型。
    */
    @SerializedName("ComputeTypes")
    @Expose
    private String [] ComputeTypes;

    /**
    * 黑石操作系统类型ID。
    */
    @SerializedName("OsTypeId")
    @Expose
    private Integer OsTypeId;

    /**
    * 黑石VPC列表，目前仅支持一个VPC。
    */
    @SerializedName("VirtualPrivateClouds")
    @Expose
    private CpmVirtualPrivateCloud [] VirtualPrivateClouds;

    /**
    * DeployType参数值为fast时，将选取黑石预部署机器发货，发货快。如果无此参数，则选取黑石常规机器发货。
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 出价策略。默认取值为SpotAsPriceGo，表示出价方式为随市场价的策略。目前只可取值SpotAsPriceGo。
    */
    @SerializedName("SpotStrategy")
    @Expose
    private String SpotStrategy;

    /**
    * 设置黑石竞价实例密码。若不指定会生成随机密码，可到站内信中查看。
    */
    @SerializedName("Passwd")
    @Expose
    private String Passwd;

    /**
     * 获取黑石可用区列表。可通过黑石[DescribeRegions](https://cloud.tencent.com/document/api/386/33564)接口查询。目前仅支持一个可用区。
     * @return Zones 黑石可用区列表。可通过黑石[DescribeRegions](https://cloud.tencent.com/document/api/386/33564)接口查询。目前仅支持一个可用区。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * 设置黑石可用区列表。可通过黑石[DescribeRegions](https://cloud.tencent.com/document/api/386/33564)接口查询。目前仅支持一个可用区。
     * @param Zones 黑石可用区列表。可通过黑石[DescribeRegions](https://cloud.tencent.com/document/api/386/33564)接口查询。目前仅支持一个可用区。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * 获取黑石计算单元类型列表。如v3.c2.medium，更详细的ComputeType参考[黑石竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)。目前仅支持一个计算单元类型。
     * @return ComputeTypes 黑石计算单元类型列表。如v3.c2.medium，更详细的ComputeType参考[黑石竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)。目前仅支持一个计算单元类型。
     */
    public String [] getComputeTypes() {
        return this.ComputeTypes;
    }

    /**
     * 设置黑石计算单元类型列表。如v3.c2.medium，更详细的ComputeType参考[黑石竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)。目前仅支持一个计算单元类型。
     * @param ComputeTypes 黑石计算单元类型列表。如v3.c2.medium，更详细的ComputeType参考[黑石竞价实例产品文档](https://cloud.tencent.com/document/product/386/30256)。目前仅支持一个计算单元类型。
     */
    public void setComputeTypes(String [] ComputeTypes) {
        this.ComputeTypes = ComputeTypes;
    }

    /**
     * 获取黑石操作系统类型ID。
     * @return OsTypeId 黑石操作系统类型ID。
     */
    public Integer getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * 设置黑石操作系统类型ID。
     * @param OsTypeId 黑石操作系统类型ID。
     */
    public void setOsTypeId(Integer OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * 获取黑石VPC列表，目前仅支持一个VPC。
     * @return VirtualPrivateClouds 黑石VPC列表，目前仅支持一个VPC。
     */
    public CpmVirtualPrivateCloud [] getVirtualPrivateClouds() {
        return this.VirtualPrivateClouds;
    }

    /**
     * 设置黑石VPC列表，目前仅支持一个VPC。
     * @param VirtualPrivateClouds 黑石VPC列表，目前仅支持一个VPC。
     */
    public void setVirtualPrivateClouds(CpmVirtualPrivateCloud [] VirtualPrivateClouds) {
        this.VirtualPrivateClouds = VirtualPrivateClouds;
    }

    /**
     * 获取DeployType参数值为fast时，将选取黑石预部署机器发货，发货快。如果无此参数，则选取黑石常规机器发货。
     * @return DeployType DeployType参数值为fast时，将选取黑石预部署机器发货，发货快。如果无此参数，则选取黑石常规机器发货。
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * 设置DeployType参数值为fast时，将选取黑石预部署机器发货，发货快。如果无此参数，则选取黑石常规机器发货。
     * @param DeployType DeployType参数值为fast时，将选取黑石预部署机器发货，发货快。如果无此参数，则选取黑石常规机器发货。
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * 获取出价策略。默认取值为SpotAsPriceGo，表示出价方式为随市场价的策略。目前只可取值SpotAsPriceGo。
     * @return SpotStrategy 出价策略。默认取值为SpotAsPriceGo，表示出价方式为随市场价的策略。目前只可取值SpotAsPriceGo。
     */
    public String getSpotStrategy() {
        return this.SpotStrategy;
    }

    /**
     * 设置出价策略。默认取值为SpotAsPriceGo，表示出价方式为随市场价的策略。目前只可取值SpotAsPriceGo。
     * @param SpotStrategy 出价策略。默认取值为SpotAsPriceGo，表示出价方式为随市场价的策略。目前只可取值SpotAsPriceGo。
     */
    public void setSpotStrategy(String SpotStrategy) {
        this.SpotStrategy = SpotStrategy;
    }

    /**
     * 获取设置黑石竞价实例密码。若不指定会生成随机密码，可到站内信中查看。
     * @return Passwd 设置黑石竞价实例密码。若不指定会生成随机密码，可到站内信中查看。
     */
    public String getPasswd() {
        return this.Passwd;
    }

    /**
     * 设置设置黑石竞价实例密码。若不指定会生成随机密码，可到站内信中查看。
     * @param Passwd 设置黑石竞价实例密码。若不指定会生成随机密码，可到站内信中查看。
     */
    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "ComputeTypes.", this.ComputeTypes);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamArrayObj(map, prefix + "VirtualPrivateClouds.", this.VirtualPrivateClouds);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "SpotStrategy", this.SpotStrategy);
        this.setParamSimple(map, prefix + "Passwd", this.Passwd);

    }
}

