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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HaVip extends AbstractModel {

    /**
    * <p><code>HAVIP</code>的<code>ID</code>，是<code>HAVIP</code>的唯一标识。</p>
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * <p><code>HAVIP</code>名称。</p>
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * <p>虚拟IP地址。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p><code>HAVIP</code>所在私有网络<code>ID</code>。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p><code>HAVIP</code>所在子网<code>ID</code>。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p><code>HAVIP</code>关联弹性网卡<code>ID</code>。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>被绑定的实例<code>ID</code>。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>绑定<code>EIP</code>。</p>
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * <p>状态：</p><li><code>AVAILABLE</code>：运行中</li><li><code>UNBIND</code>：未绑定</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>使用havip的业务标识。</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p><code>HAVIP</code>的飘移范围。</p>
    */
    @SerializedName("HaVipAssociationSet")
    @Expose
    private HaVipAssociation [] HaVipAssociationSet;

    /**
    * <p>是否开启<code>HAVIP</code>的漂移范围校验。</p>
    */
    @SerializedName("CheckAssociate")
    @Expose
    private Boolean CheckAssociate;

    /**
    * <p>CDC实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>HAVIP 刷新时间。该参数只作为出参数。以下场景会触发FlushedTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00</p>
    */
    @SerializedName("FlushedTime")
    @Expose
    private String FlushedTime;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p><code>HAVIP</code>的<code>ID</code>，是<code>HAVIP</code>的唯一标识。</p> 
     * @return HaVipId <p><code>HAVIP</code>的<code>ID</code>，是<code>HAVIP</code>的唯一标识。</p>
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set <p><code>HAVIP</code>的<code>ID</code>，是<code>HAVIP</code>的唯一标识。</p>
     * @param HaVipId <p><code>HAVIP</code>的<code>ID</code>，是<code>HAVIP</code>的唯一标识。</p>
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get <p><code>HAVIP</code>名称。</p> 
     * @return HaVipName <p><code>HAVIP</code>名称。</p>
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set <p><code>HAVIP</code>名称。</p>
     * @param HaVipName <p><code>HAVIP</code>名称。</p>
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get <p>虚拟IP地址。</p> 
     * @return Vip <p>虚拟IP地址。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>虚拟IP地址。</p>
     * @param Vip <p>虚拟IP地址。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p><code>HAVIP</code>所在私有网络<code>ID</code>。</p> 
     * @return VpcId <p><code>HAVIP</code>所在私有网络<code>ID</code>。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p><code>HAVIP</code>所在私有网络<code>ID</code>。</p>
     * @param VpcId <p><code>HAVIP</code>所在私有网络<code>ID</code>。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p><code>HAVIP</code>所在子网<code>ID</code>。</p> 
     * @return SubnetId <p><code>HAVIP</code>所在子网<code>ID</code>。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p><code>HAVIP</code>所在子网<code>ID</code>。</p>
     * @param SubnetId <p><code>HAVIP</code>所在子网<code>ID</code>。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p><code>HAVIP</code>关联弹性网卡<code>ID</code>。</p> 
     * @return NetworkInterfaceId <p><code>HAVIP</code>关联弹性网卡<code>ID</code>。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p><code>HAVIP</code>关联弹性网卡<code>ID</code>。</p>
     * @param NetworkInterfaceId <p><code>HAVIP</code>关联弹性网卡<code>ID</code>。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>被绑定的实例<code>ID</code>。</p> 
     * @return InstanceId <p>被绑定的实例<code>ID</code>。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>被绑定的实例<code>ID</code>。</p>
     * @param InstanceId <p>被绑定的实例<code>ID</code>。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>绑定<code>EIP</code>。</p> 
     * @return AddressIp <p>绑定<code>EIP</code>。</p>
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set <p>绑定<code>EIP</code>。</p>
     * @param AddressIp <p>绑定<code>EIP</code>。</p>
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get <p>状态：</p><li><code>AVAILABLE</code>：运行中</li><li><code>UNBIND</code>：未绑定</li> 
     * @return State <p>状态：</p><li><code>AVAILABLE</code>：运行中</li><li><code>UNBIND</code>：未绑定</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>状态：</p><li><code>AVAILABLE</code>：运行中</li><li><code>UNBIND</code>：未绑定</li>
     * @param State <p>状态：</p><li><code>AVAILABLE</code>：运行中</li><li><code>UNBIND</code>：未绑定</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>使用havip的业务标识。</p> 
     * @return Business <p>使用havip的业务标识。</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>使用havip的业务标识。</p>
     * @param Business <p>使用havip的业务标识。</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p><code>HAVIP</code>的飘移范围。</p> 
     * @return HaVipAssociationSet <p><code>HAVIP</code>的飘移范围。</p>
     */
    public HaVipAssociation [] getHaVipAssociationSet() {
        return this.HaVipAssociationSet;
    }

    /**
     * Set <p><code>HAVIP</code>的飘移范围。</p>
     * @param HaVipAssociationSet <p><code>HAVIP</code>的飘移范围。</p>
     */
    public void setHaVipAssociationSet(HaVipAssociation [] HaVipAssociationSet) {
        this.HaVipAssociationSet = HaVipAssociationSet;
    }

    /**
     * Get <p>是否开启<code>HAVIP</code>的漂移范围校验。</p> 
     * @return CheckAssociate <p>是否开启<code>HAVIP</code>的漂移范围校验。</p>
     */
    public Boolean getCheckAssociate() {
        return this.CheckAssociate;
    }

    /**
     * Set <p>是否开启<code>HAVIP</code>的漂移范围校验。</p>
     * @param CheckAssociate <p>是否开启<code>HAVIP</code>的漂移范围校验。</p>
     */
    public void setCheckAssociate(Boolean CheckAssociate) {
        this.CheckAssociate = CheckAssociate;
    }

    /**
     * Get <p>CDC实例ID。</p> 
     * @return CdcId <p>CDC实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>CDC实例ID。</p>
     * @param CdcId <p>CDC实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>HAVIP 刷新时间。该参数只作为出参数。以下场景会触发FlushedTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00</p> 
     * @return FlushedTime <p>HAVIP 刷新时间。该参数只作为出参数。以下场景会触发FlushedTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00</p>
     */
    public String getFlushedTime() {
        return this.FlushedTime;
    }

    /**
     * Set <p>HAVIP 刷新时间。该参数只作为出参数。以下场景会触发FlushedTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00</p>
     * @param FlushedTime <p>HAVIP 刷新时间。该参数只作为出参数。以下场景会触发FlushedTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00</p>
     */
    public void setFlushedTime(String FlushedTime) {
        this.FlushedTime = FlushedTime;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public HaVip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HaVip(HaVip source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.HaVipAssociationSet != null) {
            this.HaVipAssociationSet = new HaVipAssociation[source.HaVipAssociationSet.length];
            for (int i = 0; i < source.HaVipAssociationSet.length; i++) {
                this.HaVipAssociationSet[i] = new HaVipAssociation(source.HaVipAssociationSet[i]);
            }
        }
        if (source.CheckAssociate != null) {
            this.CheckAssociate = new Boolean(source.CheckAssociate);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.FlushedTime != null) {
            this.FlushedTime = new String(source.FlushedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "HaVipAssociationSet.", this.HaVipAssociationSet);
        this.setParamSimple(map, prefix + "CheckAssociate", this.CheckAssociate);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "FlushedTime", this.FlushedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

