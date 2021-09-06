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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailedStatusMessage extends AbstractModel{

    /**
    * 错误类型。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 可用区信息。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例计费类型。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 错误描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 实例类型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 错误类型。 
     * @return Code 错误类型。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误类型。
     * @param Code 错误类型。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 可用区信息。 
     * @return Zone 可用区信息。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息。
     * @param Zone 可用区信息。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例计费类型。 
     * @return InstanceChargeType 实例计费类型。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。
     * @param InstanceChargeType 实例计费类型。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 子网ID。 
     * @return SubnetId 子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID。
     * @param SubnetId 子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 错误描述。 
     * @return Message 错误描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误描述。
     * @param Message 错误描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 实例类型。 
     * @return InstanceType 实例类型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
     * @param InstanceType 实例类型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DetailedStatusMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailedStatusMessage(DetailedStatusMessage source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

