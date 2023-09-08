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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetInstancesInfo extends AbstractModel{

    /**
    * 网络实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 网络实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 网络cidr (多段以逗号分隔)
    */
    @SerializedName("InstanceCidr")
    @Expose
    private String InstanceCidr;

    /**
    * 网络实例所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 网络实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 网络实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 网络实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 网络实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 网络实例名称 
     * @return InstanceName 网络实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 网络实例名称
     * @param InstanceName 网络实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 网络cidr (多段以逗号分隔) 
     * @return InstanceCidr 网络cidr (多段以逗号分隔)
     */
    public String getInstanceCidr() {
        return this.InstanceCidr;
    }

    /**
     * Set 网络cidr (多段以逗号分隔)
     * @param InstanceCidr 网络cidr (多段以逗号分隔)
     */
    public void setInstanceCidr(String InstanceCidr) {
        this.InstanceCidr = InstanceCidr;
    }

    /**
     * Get 网络实例所在地域 
     * @return Region 网络实例所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 网络实例所在地域
     * @param Region 网络实例所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public NetInstancesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetInstancesInfo(NetInstancesInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCidr != null) {
            this.InstanceCidr = new String(source.InstanceCidr);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCidr", this.InstanceCidr);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

