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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQosResponse extends AbstractModel{

    /**
    * 0：无匹配的加速中会话
1：存在匹配的加速中会话
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 手机公网出口IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcPublicIpv4")
    @Expose
    private String SrcPublicIpv4;

    /**
    * 业务访问目的IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestIpv4")
    @Expose
    private String [] DestIpv4;

    /**
    * 当前加速剩余时长（单位秒）有，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 加速套餐类型，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosMenu")
    @Expose
    private String QosMenu;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0：无匹配的加速中会话
1：存在匹配的加速中会话 
     * @return Status 0：无匹配的加速中会话
1：存在匹配的加速中会话
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0：无匹配的加速中会话
1：存在匹配的加速中会话
     * @param Status 0：无匹配的加速中会话
1：存在匹配的加速中会话
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 手机公网出口IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcPublicIpv4 手机公网出口IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcPublicIpv4() {
        return this.SrcPublicIpv4;
    }

    /**
     * Set 手机公网出口IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcPublicIpv4 手机公网出口IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcPublicIpv4(String SrcPublicIpv4) {
        this.SrcPublicIpv4 = SrcPublicIpv4;
    }

    /**
     * Get 业务访问目的IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestIpv4 业务访问目的IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDestIpv4() {
        return this.DestIpv4;
    }

    /**
     * Set 业务访问目的IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestIpv4 业务访问目的IP，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestIpv4(String [] DestIpv4) {
        this.DestIpv4 = DestIpv4;
    }

    /**
     * Get 当前加速剩余时长（单位秒）有，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 当前加速剩余时长（单位秒）有，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 当前加速剩余时长（单位秒）有，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 当前加速剩余时长（单位秒）有，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 加速套餐类型，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosMenu 加速套餐类型，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQosMenu() {
        return this.QosMenu;
    }

    /**
     * Set 加速套餐类型，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosMenu 加速套餐类型，仅匹配时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosMenu(String QosMenu) {
        this.QosMenu = QosMenu;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeQosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQosResponse(DescribeQosResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcPublicIpv4 != null) {
            this.SrcPublicIpv4 = new String(source.SrcPublicIpv4);
        }
        if (source.DestIpv4 != null) {
            this.DestIpv4 = new String[source.DestIpv4.length];
            for (int i = 0; i < source.DestIpv4.length; i++) {
                this.DestIpv4[i] = new String(source.DestIpv4[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.QosMenu != null) {
            this.QosMenu = new String(source.QosMenu);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcPublicIpv4", this.SrcPublicIpv4);
        this.setParamArraySimple(map, prefix + "DestIpv4.", this.DestIpv4);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "QosMenu", this.QosMenu);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

