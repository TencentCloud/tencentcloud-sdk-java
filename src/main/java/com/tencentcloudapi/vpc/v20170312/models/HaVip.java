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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HaVip extends AbstractModel {

    /**
    * `HAVIP`的`ID`，是`HAVIP`的唯一标识。
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * `HAVIP`名称。
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * 虚拟IP地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * `HAVIP`所在私有网络`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `HAVIP`所在子网`ID`。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * `HAVIP`关联弹性网卡`ID`。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 被绑定的实例`ID`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定`EIP`。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 使用havip的业务标识。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * `HAVIP`的飘移范围。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HaVipAssociationSet")
    @Expose
    private HaVipAssociation [] HaVipAssociationSet;

    /**
    * 是否开启`HAVIP`的飘移范围校验。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckAssociate")
    @Expose
    private Boolean CheckAssociate;

    /**
    * CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * HAVIP 刷新时间。该参数只作为出参数。以下场景会触发 FlushTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlushedTime")
    @Expose
    private String FlushedTime;

    /**
    * 标签键值对。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get `HAVIP`的`ID`，是`HAVIP`的唯一标识。 
     * @return HaVipId `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     * @param HaVipId `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get `HAVIP`名称。 
     * @return HaVipName `HAVIP`名称。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set `HAVIP`名称。
     * @param HaVipName `HAVIP`名称。
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get 虚拟IP地址。 
     * @return Vip 虚拟IP地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟IP地址。
     * @param Vip 虚拟IP地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get `HAVIP`所在私有网络`ID`。 
     * @return VpcId `HAVIP`所在私有网络`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `HAVIP`所在私有网络`ID`。
     * @param VpcId `HAVIP`所在私有网络`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `HAVIP`所在子网`ID`。 
     * @return SubnetId `HAVIP`所在子网`ID`。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set `HAVIP`所在子网`ID`。
     * @param SubnetId `HAVIP`所在子网`ID`。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get `HAVIP`关联弹性网卡`ID`。 
     * @return NetworkInterfaceId `HAVIP`关联弹性网卡`ID`。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set `HAVIP`关联弹性网卡`ID`。
     * @param NetworkInterfaceId `HAVIP`关联弹性网卡`ID`。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 被绑定的实例`ID`。 
     * @return InstanceId 被绑定的实例`ID`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 被绑定的实例`ID`。
     * @param InstanceId 被绑定的实例`ID`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定`EIP`。 
     * @return AddressIp 绑定`EIP`。
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 绑定`EIP`。
     * @param AddressIp 绑定`EIP`。
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li> 
     * @return State 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     * @param State 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 使用havip的业务标识。 
     * @return Business 使用havip的业务标识。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 使用havip的业务标识。
     * @param Business 使用havip的业务标识。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get `HAVIP`的飘移范围。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HaVipAssociationSet `HAVIP`的飘移范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HaVipAssociation [] getHaVipAssociationSet() {
        return this.HaVipAssociationSet;
    }

    /**
     * Set `HAVIP`的飘移范围。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HaVipAssociationSet `HAVIP`的飘移范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHaVipAssociationSet(HaVipAssociation [] HaVipAssociationSet) {
        this.HaVipAssociationSet = HaVipAssociationSet;
    }

    /**
     * Get 是否开启`HAVIP`的飘移范围校验。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckAssociate 是否开启`HAVIP`的飘移范围校验。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckAssociate() {
        return this.CheckAssociate;
    }

    /**
     * Set 是否开启`HAVIP`的飘移范围校验。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckAssociate 是否开启`HAVIP`的飘移范围校验。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckAssociate(Boolean CheckAssociate) {
        this.CheckAssociate = CheckAssociate;
    }

    /**
     * Get CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get HAVIP 刷新时间。该参数只作为出参数。以下场景会触发 FlushTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlushedTime HAVIP 刷新时间。该参数只作为出参数。以下场景会触发 FlushTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlushedTime() {
        return this.FlushedTime;
    }

    /**
     * Set HAVIP 刷新时间。该参数只作为出参数。以下场景会触发 FlushTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlushedTime HAVIP 刷新时间。该参数只作为出参数。以下场景会触发 FlushTime 被刷新：1）子机发出免费 ARP 触发 HAVIP 漂移；2）手动HAVIP解绑网卡; 没有更新时默认值：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlushedTime(String FlushedTime) {
        this.FlushedTime = FlushedTime;
    }

    /**
     * Get 标签键值对。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签键值对。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签键值对。	
注意：此字段可能返回 null，表示取不到有效值。
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

