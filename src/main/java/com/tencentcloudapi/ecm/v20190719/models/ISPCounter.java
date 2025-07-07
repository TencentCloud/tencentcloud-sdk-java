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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISPCounter extends AbstractModel {

    /**
    * 运营商名称
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * 节点数量
    */
    @SerializedName("ProviderNodeNum")
    @Expose
    private Long ProviderNodeNum;

    /**
    * 实例数量
    */
    @SerializedName("ProvederInstanceNum")
    @Expose
    private Long ProvederInstanceNum;

    /**
    * Zone实例信息结构体数组
    */
    @SerializedName("ZoneInstanceInfoSet")
    @Expose
    private ZoneInstanceInfo [] ZoneInstanceInfoSet;

    /**
    * 实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProviderInstanceNum")
    @Expose
    private Long ProviderInstanceNum;

    /**
     * Get 运营商名称 
     * @return ProviderName 运营商名称
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set 运营商名称
     * @param ProviderName 运营商名称
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get 节点数量 
     * @return ProviderNodeNum 节点数量
     */
    public Long getProviderNodeNum() {
        return this.ProviderNodeNum;
    }

    /**
     * Set 节点数量
     * @param ProviderNodeNum 节点数量
     */
    public void setProviderNodeNum(Long ProviderNodeNum) {
        this.ProviderNodeNum = ProviderNodeNum;
    }

    /**
     * Get 实例数量 
     * @return ProvederInstanceNum 实例数量
     * @deprecated
     */
    @Deprecated
    public Long getProvederInstanceNum() {
        return this.ProvederInstanceNum;
    }

    /**
     * Set 实例数量
     * @param ProvederInstanceNum 实例数量
     * @deprecated
     */
    @Deprecated
    public void setProvederInstanceNum(Long ProvederInstanceNum) {
        this.ProvederInstanceNum = ProvederInstanceNum;
    }

    /**
     * Get Zone实例信息结构体数组 
     * @return ZoneInstanceInfoSet Zone实例信息结构体数组
     */
    public ZoneInstanceInfo [] getZoneInstanceInfoSet() {
        return this.ZoneInstanceInfoSet;
    }

    /**
     * Set Zone实例信息结构体数组
     * @param ZoneInstanceInfoSet Zone实例信息结构体数组
     */
    public void setZoneInstanceInfoSet(ZoneInstanceInfo [] ZoneInstanceInfoSet) {
        this.ZoneInstanceInfoSet = ZoneInstanceInfoSet;
    }

    /**
     * Get 实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProviderInstanceNum 实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProviderInstanceNum() {
        return this.ProviderInstanceNum;
    }

    /**
     * Set 实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProviderInstanceNum 实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProviderInstanceNum(Long ProviderInstanceNum) {
        this.ProviderInstanceNum = ProviderInstanceNum;
    }

    public ISPCounter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ISPCounter(ISPCounter source) {
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.ProviderNodeNum != null) {
            this.ProviderNodeNum = new Long(source.ProviderNodeNum);
        }
        if (source.ProvederInstanceNum != null) {
            this.ProvederInstanceNum = new Long(source.ProvederInstanceNum);
        }
        if (source.ZoneInstanceInfoSet != null) {
            this.ZoneInstanceInfoSet = new ZoneInstanceInfo[source.ZoneInstanceInfoSet.length];
            for (int i = 0; i < source.ZoneInstanceInfoSet.length; i++) {
                this.ZoneInstanceInfoSet[i] = new ZoneInstanceInfo(source.ZoneInstanceInfoSet[i]);
            }
        }
        if (source.ProviderInstanceNum != null) {
            this.ProviderInstanceNum = new Long(source.ProviderInstanceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "ProviderNodeNum", this.ProviderNodeNum);
        this.setParamSimple(map, prefix + "ProvederInstanceNum", this.ProvederInstanceNum);
        this.setParamArrayObj(map, prefix + "ZoneInstanceInfoSet.", this.ZoneInstanceInfoSet);
        this.setParamSimple(map, prefix + "ProviderInstanceNum", this.ProviderInstanceNum);

    }
}

