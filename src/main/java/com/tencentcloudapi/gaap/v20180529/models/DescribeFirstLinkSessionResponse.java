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

public class DescribeFirstLinkSessionResponse extends AbstractModel{

    /**
    * 会话状态，具体如下：
1： 加速中；
0： 非加速中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 剩余加速时间，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 加速套餐类型。
套餐说明如下：
T100K：上/下行保障100kbps；
BD4M：下行带宽保障4Mbps；
BU4M：上行带宽保障4Mbps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuiteType")
    @Expose
    private String SuiteType;

    /**
    * 加速终端的公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcPublicIpv4")
    @Expose
    private String SrcPublicIpv4;

    /**
    * 加速目标ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestIpv4")
    @Expose
    private String [] DestIpv4;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话状态，具体如下：
1： 加速中；
0： 非加速中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 会话状态，具体如下：
1： 加速中；
0： 非加速中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 会话状态，具体如下：
1： 加速中；
0： 非加速中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 会话状态，具体如下：
1： 加速中；
0： 非加速中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 剩余加速时间，单位秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 剩余加速时间，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 剩余加速时间，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 剩余加速时间，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 加速套餐类型。
套餐说明如下：
T100K：上/下行保障100kbps；
BD4M：下行带宽保障4Mbps；
BU4M：上行带宽保障4Mbps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuiteType 加速套餐类型。
套餐说明如下：
T100K：上/下行保障100kbps；
BD4M：下行带宽保障4Mbps；
BU4M：上行带宽保障4Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuiteType() {
        return this.SuiteType;
    }

    /**
     * Set 加速套餐类型。
套餐说明如下：
T100K：上/下行保障100kbps；
BD4M：下行带宽保障4Mbps；
BU4M：上行带宽保障4Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuiteType 加速套餐类型。
套餐说明如下：
T100K：上/下行保障100kbps；
BD4M：下行带宽保障4Mbps；
BU4M：上行带宽保障4Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuiteType(String SuiteType) {
        this.SuiteType = SuiteType;
    }

    /**
     * Get 加速终端的公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcPublicIpv4 加速终端的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcPublicIpv4() {
        return this.SrcPublicIpv4;
    }

    /**
     * Set 加速终端的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcPublicIpv4 加速终端的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcPublicIpv4(String SrcPublicIpv4) {
        this.SrcPublicIpv4 = SrcPublicIpv4;
    }

    /**
     * Get 加速目标ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestIpv4 加速目标ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDestIpv4() {
        return this.DestIpv4;
    }

    /**
     * Set 加速目标ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestIpv4 加速目标ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestIpv4(String [] DestIpv4) {
        this.DestIpv4 = DestIpv4;
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

    public DescribeFirstLinkSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirstLinkSessionResponse(DescribeFirstLinkSessionResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.SuiteType != null) {
            this.SuiteType = new String(source.SuiteType);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "SuiteType", this.SuiteType);
        this.setParamSimple(map, prefix + "SrcPublicIpv4", this.SrcPublicIpv4);
        this.setParamArraySimple(map, prefix + "DestIpv4.", this.DestIpv4);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

