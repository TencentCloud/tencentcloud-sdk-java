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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyRequest extends AbstractModel{

    /**
    * 通道的项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 接入地域。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 通道带宽上限，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道需要添加的标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
    */
    @SerializedName("ClonedProxyId")
    @Expose
    private String ClonedProxyId;

    /**
    * 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
     * Get 通道的项目ID。 
     * @return ProjectId 通道的项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 通道的项目ID。
     * @param ProjectId 通道的项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通道名称。 
     * @return ProxyName 通道名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 通道名称。
     * @param ProxyName 通道名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 接入地域。 
     * @return AccessRegion 接入地域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 接入地域。
     * @param AccessRegion 接入地域。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get 通道带宽上限，单位：Mbps。 
     * @return Bandwidth 通道带宽上限，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 通道带宽上限，单位：Mbps。
     * @param Bandwidth 通道带宽上限，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 通道并发量上限，表示同时在线的连接数，单位：万。 
     * @return Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set 通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段 
     * @return RealServerRegion 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     * @param RealServerRegion 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。 
     * @return GroupId 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     * @param GroupId 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道需要添加的标签列表。 
     * @return TagSet 通道需要添加的标签列表。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 通道需要添加的标签列表。
     * @param TagSet 通道需要添加的标签列表。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。 
     * @return ClonedProxyId 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     */
    public String getClonedProxyId() {
        return this.ClonedProxyId;
    }

    /**
     * Set 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     * @param ClonedProxyId 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     */
    public void setClonedProxyId(String ClonedProxyId) {
        this.ClonedProxyId = ClonedProxyId;
    }

    /**
     * Get 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费） 
     * @return BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     * @param BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "ClonedProxyId", this.ClonedProxyId);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);

    }
}

