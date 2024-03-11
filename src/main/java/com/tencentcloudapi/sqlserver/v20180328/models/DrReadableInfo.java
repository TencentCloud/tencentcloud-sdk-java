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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrReadableInfo extends AbstractModel {

    /**
    * 备机状态，enable-运行中，disable-不可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveStatus")
    @Expose
    private String SlaveStatus;

    /**
    * 备机可读状态，enable-已开启，disable-已关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadableStatus")
    @Expose
    private String ReadableStatus;

    /**
    * 备机只读vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 备机只读端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 备机所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 备机所在私有网络子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * Get 备机状态，enable-运行中，disable-不可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveStatus 备机状态，enable-运行中，disable-不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlaveStatus() {
        return this.SlaveStatus;
    }

    /**
     * Set 备机状态，enable-运行中，disable-不可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveStatus 备机状态，enable-运行中，disable-不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveStatus(String SlaveStatus) {
        this.SlaveStatus = SlaveStatus;
    }

    /**
     * Get 备机可读状态，enable-已开启，disable-已关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadableStatus 备机可读状态，enable-已开启，disable-已关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadableStatus() {
        return this.ReadableStatus;
    }

    /**
     * Set 备机可读状态，enable-已开启，disable-已关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadableStatus 备机可读状态，enable-已开启，disable-已关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadableStatus(String ReadableStatus) {
        this.ReadableStatus = ReadableStatus;
    }

    /**
     * Get 备机只读vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 备机只读vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 备机只读vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 备机只读vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 备机只读端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VPort 备机只读端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 备机只读端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param VPort 备机只读端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 备机所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId 备机所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 备机所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId 备机所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 备机所在私有网络子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqSubnetId 备机所在私有网络子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 备机所在私有网络子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqSubnetId 备机所在私有网络子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    public DrReadableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrReadableInfo(DrReadableInfo source) {
        if (source.SlaveStatus != null) {
            this.SlaveStatus = new String(source.SlaveStatus);
        }
        if (source.ReadableStatus != null) {
            this.ReadableStatus = new String(source.ReadableStatus);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlaveStatus", this.SlaveStatus);
        this.setParamSimple(map, prefix + "ReadableStatus", this.ReadableStatus);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}

