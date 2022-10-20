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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkPeer extends AbstractModel{

    /**
    * 对象类型：

命名空间：NamespaceSelector，代表NamespaceSelector有值

pod类型：PodSelector，代表NamespaceSelector和PodSelector都有值

ip类型：IPBlock，代表只有IPBlock有值
    */
    @SerializedName("PeerType")
    @Expose
    private String PeerType;

    /**
    * 空间选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private String NamespaceSelector;

    /**
    * pod选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * Ip选择器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPBlock")
    @Expose
    private String IPBlock;

    /**
     * Get 对象类型：

命名空间：NamespaceSelector，代表NamespaceSelector有值

pod类型：PodSelector，代表NamespaceSelector和PodSelector都有值

ip类型：IPBlock，代表只有IPBlock有值 
     * @return PeerType 对象类型：

命名空间：NamespaceSelector，代表NamespaceSelector有值

pod类型：PodSelector，代表NamespaceSelector和PodSelector都有值

ip类型：IPBlock，代表只有IPBlock有值
     */
    public String getPeerType() {
        return this.PeerType;
    }

    /**
     * Set 对象类型：

命名空间：NamespaceSelector，代表NamespaceSelector有值

pod类型：PodSelector，代表NamespaceSelector和PodSelector都有值

ip类型：IPBlock，代表只有IPBlock有值
     * @param PeerType 对象类型：

命名空间：NamespaceSelector，代表NamespaceSelector有值

pod类型：PodSelector，代表NamespaceSelector和PodSelector都有值

ip类型：IPBlock，代表只有IPBlock有值
     */
    public void setPeerType(String PeerType) {
        this.PeerType = PeerType;
    }

    /**
     * Get 空间选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceSelector 空间选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set 空间选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceSelector 空间选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceSelector(String NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    /**
     * Get pod选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodSelector pod选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set pod选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodSelector pod选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get Ip选择器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPBlock Ip选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPBlock() {
        return this.IPBlock;
    }

    /**
     * Set Ip选择器
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPBlock Ip选择器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPBlock(String IPBlock) {
        this.IPBlock = IPBlock;
    }

    public NetworkPeer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkPeer(NetworkPeer source) {
        if (source.PeerType != null) {
            this.PeerType = new String(source.PeerType);
        }
        if (source.NamespaceSelector != null) {
            this.NamespaceSelector = new String(source.NamespaceSelector);
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.IPBlock != null) {
            this.IPBlock = new String(source.IPBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerType", this.PeerType);
        this.setParamSimple(map, prefix + "NamespaceSelector", this.NamespaceSelector);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "IPBlock", this.IPBlock);

    }
}

