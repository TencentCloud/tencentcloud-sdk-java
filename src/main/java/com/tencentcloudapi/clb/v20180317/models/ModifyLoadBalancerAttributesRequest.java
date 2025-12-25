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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerAttributesRequest extends AbstractModel {

    /**
    * <p>负载均衡的唯一ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>负载均衡实例名称，规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>设置负载均衡跨地域绑定1.0的后端服务信息</p>
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * <p>网络计费相关参数</p>
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
    * <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。不填则不修改。</p>
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * <p>不同计费模式之间的切换：0表示不切换，1表示预付费和后付费切换，2表示后付费之间切换。默认值：0</p>
    */
    @SerializedName("SwitchFlag")
    @Expose
    private Long SwitchFlag;

    /**
    * <p>是否开启跨地域绑定2.0功能。不填则不修改。</p>
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * <p>是否开启删除保护，不填则不修改。</p>
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * <p>将负载均衡二级域名由mycloud.com改为tencentclb.com，子域名也会变换，修改后mycloud.com域名将失效。不填则不修改。</p>
    */
    @SerializedName("ModifyClassicDomain")
    @Expose
    private Boolean ModifyClassicDomain;

    /**
    * <p>关联的终端节点Id，可通过<a href="https://cloud.tencent.com/document/product/215/54679">DescribeVpcEndPoint</a>接口查询。传空字符串代表解除关联。</p>
    */
    @SerializedName("AssociateEndpoint")
    @Expose
    private String AssociateEndpoint;

    /**
     * Get <p>负载均衡的唯一ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p> 
     * @return LoadBalancerId <p>负载均衡的唯一ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡的唯一ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     * @param LoadBalancerId <p>负载均衡的唯一ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>负载均衡实例名称，规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。</p> 
     * @return LoadBalancerName <p>负载均衡实例名称，规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>负载均衡实例名称，规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。</p>
     * @param LoadBalancerName <p>负载均衡实例名称，规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>设置负载均衡跨地域绑定1.0的后端服务信息</p> 
     * @return TargetRegionInfo <p>设置负载均衡跨地域绑定1.0的后端服务信息</p>
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set <p>设置负载均衡跨地域绑定1.0的后端服务信息</p>
     * @param TargetRegionInfo <p>设置负载均衡跨地域绑定1.0的后端服务信息</p>
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get <p>网络计费相关参数</p> 
     * @return InternetChargeInfo <p>网络计费相关参数</p>
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set <p>网络计费相关参数</p>
     * @param InternetChargeInfo <p>网络计费相关参数</p>
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。不填则不修改。</p> 
     * @return LoadBalancerPassToTarget <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。不填则不修改。</p>
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。不填则不修改。</p>
     * @param LoadBalancerPassToTarget <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。不填则不修改。</p>
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get <p>不同计费模式之间的切换：0表示不切换，1表示预付费和后付费切换，2表示后付费之间切换。默认值：0</p> 
     * @return SwitchFlag <p>不同计费模式之间的切换：0表示不切换，1表示预付费和后付费切换，2表示后付费之间切换。默认值：0</p>
     */
    public Long getSwitchFlag() {
        return this.SwitchFlag;
    }

    /**
     * Set <p>不同计费模式之间的切换：0表示不切换，1表示预付费和后付费切换，2表示后付费之间切换。默认值：0</p>
     * @param SwitchFlag <p>不同计费模式之间的切换：0表示不切换，1表示预付费和后付费切换，2表示后付费之间切换。默认值：0</p>
     */
    public void setSwitchFlag(Long SwitchFlag) {
        this.SwitchFlag = SwitchFlag;
    }

    /**
     * Get <p>是否开启跨地域绑定2.0功能。不填则不修改。</p> 
     * @return SnatPro <p>是否开启跨地域绑定2.0功能。不填则不修改。</p>
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set <p>是否开启跨地域绑定2.0功能。不填则不修改。</p>
     * @param SnatPro <p>是否开启跨地域绑定2.0功能。不填则不修改。</p>
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get <p>是否开启删除保护，不填则不修改。</p> 
     * @return DeleteProtect <p>是否开启删除保护，不填则不修改。</p>
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set <p>是否开启删除保护，不填则不修改。</p>
     * @param DeleteProtect <p>是否开启删除保护，不填则不修改。</p>
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get <p>将负载均衡二级域名由mycloud.com改为tencentclb.com，子域名也会变换，修改后mycloud.com域名将失效。不填则不修改。</p> 
     * @return ModifyClassicDomain <p>将负载均衡二级域名由mycloud.com改为tencentclb.com，子域名也会变换，修改后mycloud.com域名将失效。不填则不修改。</p>
     */
    public Boolean getModifyClassicDomain() {
        return this.ModifyClassicDomain;
    }

    /**
     * Set <p>将负载均衡二级域名由mycloud.com改为tencentclb.com，子域名也会变换，修改后mycloud.com域名将失效。不填则不修改。</p>
     * @param ModifyClassicDomain <p>将负载均衡二级域名由mycloud.com改为tencentclb.com，子域名也会变换，修改后mycloud.com域名将失效。不填则不修改。</p>
     */
    public void setModifyClassicDomain(Boolean ModifyClassicDomain) {
        this.ModifyClassicDomain = ModifyClassicDomain;
    }

    /**
     * Get <p>关联的终端节点Id，可通过<a href="https://cloud.tencent.com/document/product/215/54679">DescribeVpcEndPoint</a>接口查询。传空字符串代表解除关联。</p> 
     * @return AssociateEndpoint <p>关联的终端节点Id，可通过<a href="https://cloud.tencent.com/document/product/215/54679">DescribeVpcEndPoint</a>接口查询。传空字符串代表解除关联。</p>
     */
    public String getAssociateEndpoint() {
        return this.AssociateEndpoint;
    }

    /**
     * Set <p>关联的终端节点Id，可通过<a href="https://cloud.tencent.com/document/product/215/54679">DescribeVpcEndPoint</a>接口查询。传空字符串代表解除关联。</p>
     * @param AssociateEndpoint <p>关联的终端节点Id，可通过<a href="https://cloud.tencent.com/document/product/215/54679">DescribeVpcEndPoint</a>接口查询。传空字符串代表解除关联。</p>
     */
    public void setAssociateEndpoint(String AssociateEndpoint) {
        this.AssociateEndpoint = AssociateEndpoint;
    }

    public ModifyLoadBalancerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAttributesRequest(ModifyLoadBalancerAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.TargetRegionInfo != null) {
            this.TargetRegionInfo = new TargetRegionInfo(source.TargetRegionInfo);
        }
        if (source.InternetChargeInfo != null) {
            this.InternetChargeInfo = new InternetAccessible(source.InternetChargeInfo);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.SwitchFlag != null) {
            this.SwitchFlag = new Long(source.SwitchFlag);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.ModifyClassicDomain != null) {
            this.ModifyClassicDomain = new Boolean(source.ModifyClassicDomain);
        }
        if (source.AssociateEndpoint != null) {
            this.AssociateEndpoint = new String(source.AssociateEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "SwitchFlag", this.SwitchFlag);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamSimple(map, prefix + "ModifyClassicDomain", this.ModifyClassicDomain);
        this.setParamSimple(map, prefix + "AssociateEndpoint", this.AssociateEndpoint);

    }
}

