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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInterfaces extends AbstractModel {

    /**
    * <p>表示是主网卡还是辅助网卡。注意：枚举值要全部大写；<strong>NetworkInterfaces数组中必须要有PRIMARY</strong>，且PRIMARY只能存在一个，SECONDARY可以存在多个。</p><p>枚举值：</p><ul><li>PRIMARY： 主网卡</li><li>SECONDARY： 辅助网卡</li></ul>
    */
    @SerializedName("InterfaceType")
    @Expose
    private String InterfaceType;

    /**
    * <p>私有网络ID，形如<code>vpc-xxx</code>。有效的VpcId可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> ，从接口返回中的<code>VpcId</code>字段获取。若在创建子机时VpcId与SubnetId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如<code>subnet-xxx</code>。有效的私有网络子网ID可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">控制台</a>查询；也可以调用接口  <a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a> ，从接口返回中的<code>SubnetId</code>字段获取。若在创建子机时SubnetId与VpcId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>此字段是必填字段，表示每张网卡自动分配私有网卡IP个数。注意：不允许客户同时指定ip且动态分配ip。</p><p>取值范围：[1, 50]</p>
    */
    @SerializedName("PrivateIpv4AddressCount")
    @Expose
    private Long PrivateIpv4AddressCount;

    /**
    * <p>指定存量的网卡ID用于绑定。只对辅助网卡生效，主网卡的生成采用既有流程。注：客户手动指定已有弹性网卡时，相关接口InstanceCount必须为1。主网卡不支持指定。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的 <code>SecurityGroupId</code> 字段来获取。若不指定该参数，则绑定指定项目下的默认安全组，如默认安全组不存在则将自动创建。</p><p>每个用户在每个地域每个项目下最多可设置50个安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>是否随CVM删除绑定的弹性网卡，参数只对辅助网卡生效。默认保留辅助网卡兼容当前线上行为。该参数放置在主网卡上不生效，主网卡会随着CVM一同销毁。</p><p>默认值：<code>false</code></p>
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
     * Get <p>表示是主网卡还是辅助网卡。注意：枚举值要全部大写；<strong>NetworkInterfaces数组中必须要有PRIMARY</strong>，且PRIMARY只能存在一个，SECONDARY可以存在多个。</p><p>枚举值：</p><ul><li>PRIMARY： 主网卡</li><li>SECONDARY： 辅助网卡</li></ul> 
     * @return InterfaceType <p>表示是主网卡还是辅助网卡。注意：枚举值要全部大写；<strong>NetworkInterfaces数组中必须要有PRIMARY</strong>，且PRIMARY只能存在一个，SECONDARY可以存在多个。</p><p>枚举值：</p><ul><li>PRIMARY： 主网卡</li><li>SECONDARY： 辅助网卡</li></ul>
     */
    public String getInterfaceType() {
        return this.InterfaceType;
    }

    /**
     * Set <p>表示是主网卡还是辅助网卡。注意：枚举值要全部大写；<strong>NetworkInterfaces数组中必须要有PRIMARY</strong>，且PRIMARY只能存在一个，SECONDARY可以存在多个。</p><p>枚举值：</p><ul><li>PRIMARY： 主网卡</li><li>SECONDARY： 辅助网卡</li></ul>
     * @param InterfaceType <p>表示是主网卡还是辅助网卡。注意：枚举值要全部大写；<strong>NetworkInterfaces数组中必须要有PRIMARY</strong>，且PRIMARY只能存在一个，SECONDARY可以存在多个。</p><p>枚举值：</p><ul><li>PRIMARY： 主网卡</li><li>SECONDARY： 辅助网卡</li></ul>
     */
    public void setInterfaceType(String InterfaceType) {
        this.InterfaceType = InterfaceType;
    }

    /**
     * Get <p>私有网络ID，形如<code>vpc-xxx</code>。有效的VpcId可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> ，从接口返回中的<code>VpcId</code>字段获取。若在创建子机时VpcId与SubnetId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p> 
     * @return VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。有效的VpcId可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> ，从接口返回中的<code>VpcId</code>字段获取。若在创建子机时VpcId与SubnetId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如<code>vpc-xxx</code>。有效的VpcId可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> ，从接口返回中的<code>VpcId</code>字段获取。若在创建子机时VpcId与SubnetId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     * @param VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。有效的VpcId可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> ，从接口返回中的<code>VpcId</code>字段获取。若在创建子机时VpcId与SubnetId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如<code>subnet-xxx</code>。有效的私有网络子网ID可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">控制台</a>查询；也可以调用接口  <a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a> ，从接口返回中的<code>SubnetId</code>字段获取。若在创建子机时SubnetId与VpcId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p> 
     * @return SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。有效的私有网络子网ID可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">控制台</a>查询；也可以调用接口  <a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a> ，从接口返回中的<code>SubnetId</code>字段获取。若在创建子机时SubnetId与VpcId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如<code>subnet-xxx</code>。有效的私有网络子网ID可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">控制台</a>查询；也可以调用接口  <a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a> ，从接口返回中的<code>SubnetId</code>字段获取。若在创建子机时SubnetId与VpcId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     * @param SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。有效的私有网络子网ID可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">控制台</a>查询；也可以调用接口  <a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a> ，从接口返回中的<code>SubnetId</code>字段获取。若在创建子机时SubnetId与VpcId同时传入<code>DEFAULT</code>，则强制使用默认vpc网络。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>此字段是必填字段，表示每张网卡自动分配私有网卡IP个数。注意：不允许客户同时指定ip且动态分配ip。</p><p>取值范围：[1, 50]</p> 
     * @return PrivateIpv4AddressCount <p>此字段是必填字段，表示每张网卡自动分配私有网卡IP个数。注意：不允许客户同时指定ip且动态分配ip。</p><p>取值范围：[1, 50]</p>
     */
    public Long getPrivateIpv4AddressCount() {
        return this.PrivateIpv4AddressCount;
    }

    /**
     * Set <p>此字段是必填字段，表示每张网卡自动分配私有网卡IP个数。注意：不允许客户同时指定ip且动态分配ip。</p><p>取值范围：[1, 50]</p>
     * @param PrivateIpv4AddressCount <p>此字段是必填字段，表示每张网卡自动分配私有网卡IP个数。注意：不允许客户同时指定ip且动态分配ip。</p><p>取值范围：[1, 50]</p>
     */
    public void setPrivateIpv4AddressCount(Long PrivateIpv4AddressCount) {
        this.PrivateIpv4AddressCount = PrivateIpv4AddressCount;
    }

    /**
     * Get <p>指定存量的网卡ID用于绑定。只对辅助网卡生效，主网卡的生成采用既有流程。注：客户手动指定已有弹性网卡时，相关接口InstanceCount必须为1。主网卡不支持指定。</p> 
     * @return NetworkInterfaceId <p>指定存量的网卡ID用于绑定。只对辅助网卡生效，主网卡的生成采用既有流程。注：客户手动指定已有弹性网卡时，相关接口InstanceCount必须为1。主网卡不支持指定。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p>指定存量的网卡ID用于绑定。只对辅助网卡生效，主网卡的生成采用既有流程。注：客户手动指定已有弹性网卡时，相关接口InstanceCount必须为1。主网卡不支持指定。</p>
     * @param NetworkInterfaceId <p>指定存量的网卡ID用于绑定。只对辅助网卡生效，主网卡的生成采用既有流程。注：客户手动指定已有弹性网卡时，相关接口InstanceCount必须为1。主网卡不支持指定。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的 <code>SecurityGroupId</code> 字段来获取。若不指定该参数，则绑定指定项目下的默认安全组，如默认安全组不存在则将自动创建。</p><p>每个用户在每个地域每个项目下最多可设置50个安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的 <code>SecurityGroupId</code> 字段来获取。若不指定该参数，则绑定指定项目下的默认安全组，如默认安全组不存在则将自动创建。</p><p>每个用户在每个地域每个项目下最多可设置50个安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的 <code>SecurityGroupId</code> 字段来获取。若不指定该参数，则绑定指定项目下的默认安全组，如默认安全组不存在则将自动创建。</p><p>每个用户在每个地域每个项目下最多可设置50个安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的 <code>SecurityGroupId</code> 字段来获取。若不指定该参数，则绑定指定项目下的默认安全组，如默认安全组不存在则将自动创建。</p><p>每个用户在每个地域每个项目下最多可设置50个安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>是否随CVM删除绑定的弹性网卡，参数只对辅助网卡生效。默认保留辅助网卡兼容当前线上行为。该参数放置在主网卡上不生效，主网卡会随着CVM一同销毁。</p><p>默认值：<code>false</code></p> 
     * @return DeleteWithInstance <p>是否随CVM删除绑定的弹性网卡，参数只对辅助网卡生效。默认保留辅助网卡兼容当前线上行为。该参数放置在主网卡上不生效，主网卡会随着CVM一同销毁。</p><p>默认值：<code>false</code></p>
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set <p>是否随CVM删除绑定的弹性网卡，参数只对辅助网卡生效。默认保留辅助网卡兼容当前线上行为。该参数放置在主网卡上不生效，主网卡会随着CVM一同销毁。</p><p>默认值：<code>false</code></p>
     * @param DeleteWithInstance <p>是否随CVM删除绑定的弹性网卡，参数只对辅助网卡生效。默认保留辅助网卡兼容当前线上行为。该参数放置在主网卡上不生效，主网卡会随着CVM一同销毁。</p><p>默认值：<code>false</code></p>
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    public NetworkInterfaces() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterfaces(NetworkInterfaces source) {
        if (source.InterfaceType != null) {
            this.InterfaceType = new String(source.InterfaceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PrivateIpv4AddressCount != null) {
            this.PrivateIpv4AddressCount = new Long(source.PrivateIpv4AddressCount);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterfaceType", this.InterfaceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PrivateIpv4AddressCount", this.PrivateIpv4AddressCount);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);

    }
}

