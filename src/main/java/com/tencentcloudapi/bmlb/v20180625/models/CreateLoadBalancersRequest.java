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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancersRequest extends AbstractModel{

    /**
    * 黑石负载均衡实例所属的私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡的类型，取值为open或internal。open表示公网(有日租)，internal表示内网。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 在私有网络内购买内网负载均衡实例的时候需要指定子网ID，内网负载均衡实例的VIP将从这个子网中产生。其他情况不用填写该字段。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡所属项目ID。不填则属于默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 购买黑石负载均衡实例的数量。默认值为1, 最大值为20。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 黑石负载均衡的计费模式，取值为flow和bandwidth，其中flow模式表示流量模式，bandwidth表示带宽模式。默认值为flow。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 负载均衡对应的TGW集群类别，取值为tunnel、fullnat或dnat。tunnel表示隧道集群，fullnat表示FULLNAT集群（普通外网负载均衡），dnat表示DNAT集群（增强型外网负载均衡）。默认值为fullnat。如需获取client IP，可以选择 tunnel 模式，fullnat 模式（tcp 通过toa 获取），dnat 模式。
    */
    @SerializedName("TgwSetType")
    @Expose
    private String TgwSetType;

    /**
    * 负载均衡的独占类别，取值为0表示非独占，1表示四层独占，2表示七层独占，3表示四层和七层独占，4表示共享容灾。
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 指定的VIP，如果指定，则数量必须与goodsNum一致。如果不指定，则由后台分配随机VIP。
    */
    @SerializedName("SpecifiedVips")
    @Expose
    private String [] SpecifiedVips;

    /**
    * （未全地域开放）保障型负载均衡设定参数，如果类别选择保障型则需传入此参数。
    */
    @SerializedName("BzConf")
    @Expose
    private CreateLoadBalancerBzConf BzConf;

    /**
    * IP协议类型。可取的值为“ipv4”或“ipv6”。
    */
    @SerializedName("IpProtocolType")
    @Expose
    private String IpProtocolType;

    /**
     * Get 黑石负载均衡实例所属的私有网络ID。 
     * @return VpcId 黑石负载均衡实例所属的私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 黑石负载均衡实例所属的私有网络ID。
     * @param VpcId 黑石负载均衡实例所属的私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡的类型，取值为open或internal。open表示公网(有日租)，internal表示内网。 
     * @return LoadBalancerType 负载均衡的类型，取值为open或internal。open表示公网(有日租)，internal表示内网。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡的类型，取值为open或internal。open表示公网(有日租)，internal表示内网。
     * @param LoadBalancerType 负载均衡的类型，取值为open或internal。open表示公网(有日租)，internal表示内网。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 在私有网络内购买内网负载均衡实例的时候需要指定子网ID，内网负载均衡实例的VIP将从这个子网中产生。其他情况不用填写该字段。 
     * @return SubnetId 在私有网络内购买内网负载均衡实例的时候需要指定子网ID，内网负载均衡实例的VIP将从这个子网中产生。其他情况不用填写该字段。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 在私有网络内购买内网负载均衡实例的时候需要指定子网ID，内网负载均衡实例的VIP将从这个子网中产生。其他情况不用填写该字段。
     * @param SubnetId 在私有网络内购买内网负载均衡实例的时候需要指定子网ID，内网负载均衡实例的VIP将从这个子网中产生。其他情况不用填写该字段。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡所属项目ID。不填则属于默认项目。 
     * @return ProjectId 负载均衡所属项目ID。不填则属于默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡所属项目ID。不填则属于默认项目。
     * @param ProjectId 负载均衡所属项目ID。不填则属于默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 购买黑石负载均衡实例的数量。默认值为1, 最大值为20。 
     * @return GoodsNum 购买黑石负载均衡实例的数量。默认值为1, 最大值为20。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买黑石负载均衡实例的数量。默认值为1, 最大值为20。
     * @param GoodsNum 购买黑石负载均衡实例的数量。默认值为1, 最大值为20。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 黑石负载均衡的计费模式，取值为flow和bandwidth，其中flow模式表示流量模式，bandwidth表示带宽模式。默认值为flow。 
     * @return PayMode 黑石负载均衡的计费模式，取值为flow和bandwidth，其中flow模式表示流量模式，bandwidth表示带宽模式。默认值为flow。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 黑石负载均衡的计费模式，取值为flow和bandwidth，其中flow模式表示流量模式，bandwidth表示带宽模式。默认值为flow。
     * @param PayMode 黑石负载均衡的计费模式，取值为flow和bandwidth，其中flow模式表示流量模式，bandwidth表示带宽模式。默认值为flow。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 负载均衡对应的TGW集群类别，取值为tunnel、fullnat或dnat。tunnel表示隧道集群，fullnat表示FULLNAT集群（普通外网负载均衡），dnat表示DNAT集群（增强型外网负载均衡）。默认值为fullnat。如需获取client IP，可以选择 tunnel 模式，fullnat 模式（tcp 通过toa 获取），dnat 模式。 
     * @return TgwSetType 负载均衡对应的TGW集群类别，取值为tunnel、fullnat或dnat。tunnel表示隧道集群，fullnat表示FULLNAT集群（普通外网负载均衡），dnat表示DNAT集群（增强型外网负载均衡）。默认值为fullnat。如需获取client IP，可以选择 tunnel 模式，fullnat 模式（tcp 通过toa 获取），dnat 模式。
     */
    public String getTgwSetType() {
        return this.TgwSetType;
    }

    /**
     * Set 负载均衡对应的TGW集群类别，取值为tunnel、fullnat或dnat。tunnel表示隧道集群，fullnat表示FULLNAT集群（普通外网负载均衡），dnat表示DNAT集群（增强型外网负载均衡）。默认值为fullnat。如需获取client IP，可以选择 tunnel 模式，fullnat 模式（tcp 通过toa 获取），dnat 模式。
     * @param TgwSetType 负载均衡对应的TGW集群类别，取值为tunnel、fullnat或dnat。tunnel表示隧道集群，fullnat表示FULLNAT集群（普通外网负载均衡），dnat表示DNAT集群（增强型外网负载均衡）。默认值为fullnat。如需获取client IP，可以选择 tunnel 模式，fullnat 模式（tcp 通过toa 获取），dnat 模式。
     */
    public void setTgwSetType(String TgwSetType) {
        this.TgwSetType = TgwSetType;
    }

    /**
     * Get 负载均衡的独占类别，取值为0表示非独占，1表示四层独占，2表示七层独占，3表示四层和七层独占，4表示共享容灾。 
     * @return Exclusive 负载均衡的独占类别，取值为0表示非独占，1表示四层独占，2表示七层独占，3表示四层和七层独占，4表示共享容灾。
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 负载均衡的独占类别，取值为0表示非独占，1表示四层独占，2表示七层独占，3表示四层和七层独占，4表示共享容灾。
     * @param Exclusive 负载均衡的独占类别，取值为0表示非独占，1表示四层独占，2表示七层独占，3表示四层和七层独占，4表示共享容灾。
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 指定的VIP，如果指定，则数量必须与goodsNum一致。如果不指定，则由后台分配随机VIP。 
     * @return SpecifiedVips 指定的VIP，如果指定，则数量必须与goodsNum一致。如果不指定，则由后台分配随机VIP。
     */
    public String [] getSpecifiedVips() {
        return this.SpecifiedVips;
    }

    /**
     * Set 指定的VIP，如果指定，则数量必须与goodsNum一致。如果不指定，则由后台分配随机VIP。
     * @param SpecifiedVips 指定的VIP，如果指定，则数量必须与goodsNum一致。如果不指定，则由后台分配随机VIP。
     */
    public void setSpecifiedVips(String [] SpecifiedVips) {
        this.SpecifiedVips = SpecifiedVips;
    }

    /**
     * Get （未全地域开放）保障型负载均衡设定参数，如果类别选择保障型则需传入此参数。 
     * @return BzConf （未全地域开放）保障型负载均衡设定参数，如果类别选择保障型则需传入此参数。
     */
    public CreateLoadBalancerBzConf getBzConf() {
        return this.BzConf;
    }

    /**
     * Set （未全地域开放）保障型负载均衡设定参数，如果类别选择保障型则需传入此参数。
     * @param BzConf （未全地域开放）保障型负载均衡设定参数，如果类别选择保障型则需传入此参数。
     */
    public void setBzConf(CreateLoadBalancerBzConf BzConf) {
        this.BzConf = BzConf;
    }

    /**
     * Get IP协议类型。可取的值为“ipv4”或“ipv6”。 
     * @return IpProtocolType IP协议类型。可取的值为“ipv4”或“ipv6”。
     */
    public String getIpProtocolType() {
        return this.IpProtocolType;
    }

    /**
     * Set IP协议类型。可取的值为“ipv4”或“ipv6”。
     * @param IpProtocolType IP协议类型。可取的值为“ipv4”或“ipv6”。
     */
    public void setIpProtocolType(String IpProtocolType) {
        this.IpProtocolType = IpProtocolType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TgwSetType", this.TgwSetType);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamArraySimple(map, prefix + "SpecifiedVips.", this.SpecifiedVips);
        this.setParamObj(map, prefix + "BzConf.", this.BzConf);
        this.setParamSimple(map, prefix + "IpProtocolType", this.IpProtocolType);

    }
}

