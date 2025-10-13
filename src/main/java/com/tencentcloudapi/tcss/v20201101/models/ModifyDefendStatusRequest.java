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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDefendStatusRequest extends AbstractModel {

    /**
    * 开关是否开启
    */
    @SerializedName("SwitchOn")
    @Expose
    private Boolean SwitchOn;

    /**
    * 实例类型 <li> Cluster: 集群</li> <li> Node: 节点</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 是否是全部实例
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * 实例id列表
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
     * Get 开关是否开启 
     * @return SwitchOn 开关是否开启
     */
    public Boolean getSwitchOn() {
        return this.SwitchOn;
    }

    /**
     * Set 开关是否开启
     * @param SwitchOn 开关是否开启
     */
    public void setSwitchOn(Boolean SwitchOn) {
        this.SwitchOn = SwitchOn;
    }

    /**
     * Get 实例类型 <li> Cluster: 集群</li> <li> Node: 节点</li> 
     * @return InstanceType 实例类型 <li> Cluster: 集群</li> <li> Node: 节点</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型 <li> Cluster: 集群</li> <li> Node: 节点</li>
     * @param InstanceType 实例类型 <li> Cluster: 集群</li> <li> Node: 节点</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 是否是全部实例 
     * @return IsAll 是否是全部实例
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 是否是全部实例
     * @param IsAll 是否是全部实例
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 实例id列表 
     * @return InstanceIDs 实例id列表
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set 实例id列表
     * @param InstanceIDs 实例id列表
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    public ModifyDefendStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDefendStatusRequest(ModifyDefendStatusRequest source) {
        if (source.SwitchOn != null) {
            this.SwitchOn = new Boolean(source.SwitchOn);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchOn", this.SwitchOn);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);

    }
}

