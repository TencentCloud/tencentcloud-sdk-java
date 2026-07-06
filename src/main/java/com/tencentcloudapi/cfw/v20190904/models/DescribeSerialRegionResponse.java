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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSerialRegionResponse extends AbstractModel {

    /**
    * <p>串行地域带宽分配</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialRegionLst")
    @Expose
    private SerialRegionInfo [] SerialRegionLst;

    /**
    * <p>剩余可分配通用带宽 单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnUsedWidth")
    @Expose
    private Long UnUsedWidth;

    /**
    * <p>可配置实例个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnUsedQuota")
    @Expose
    private Long UnUsedQuota;

    /**
    * <p>旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BypassWidth")
    @Expose
    private Long BypassWidth;

    /**
    * <p>赠送的旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendBypassWidth")
    @Expose
    private Long SendBypassWidth;

    /**
    * <p>互联网边界防火墙总带宽</p>
    */
    @SerializedName("EdgeWidth")
    @Expose
    private Long EdgeWidth;

    /**
    * <p>互联网边界弹性开关</p>
    */
    @SerializedName("EdgeElasticSwitch")
    @Expose
    private Long EdgeElasticSwitch;

    /**
    * <p>互联网边界弹性带宽值</p>
    */
    @SerializedName("EdgeElasticBandwidth")
    @Expose
    private Long EdgeElasticBandwidth;

    /**
    * <p>互联网边界弹性带宽上限</p>
    */
    @SerializedName("EdgeElasticBandwidthLimit")
    @Expose
    private Long EdgeElasticBandwidthLimit;

    /**
    * <p>互联网边界防火墙计量开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 打开</li></ul>
    */
    @SerializedName("EdgeElasticTrafficSwitch")
    @Expose
    private Long EdgeElasticTrafficSwitch;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>串行地域带宽分配</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialRegionLst <p>串行地域带宽分配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SerialRegionInfo [] getSerialRegionLst() {
        return this.SerialRegionLst;
    }

    /**
     * Set <p>串行地域带宽分配</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialRegionLst <p>串行地域带宽分配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialRegionLst(SerialRegionInfo [] SerialRegionLst) {
        this.SerialRegionLst = SerialRegionLst;
    }

    /**
     * Get <p>剩余可分配通用带宽 单位M</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnUsedWidth <p>剩余可分配通用带宽 单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnUsedWidth() {
        return this.UnUsedWidth;
    }

    /**
     * Set <p>剩余可分配通用带宽 单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnUsedWidth <p>剩余可分配通用带宽 单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnUsedWidth(Long UnUsedWidth) {
        this.UnUsedWidth = UnUsedWidth;
    }

    /**
     * Get <p>可配置实例个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnUsedQuota <p>可配置实例个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnUsedQuota() {
        return this.UnUsedQuota;
    }

    /**
     * Set <p>可配置实例个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnUsedQuota <p>可配置实例个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnUsedQuota(Long UnUsedQuota) {
        this.UnUsedQuota = UnUsedQuota;
    }

    /**
     * Get <p>旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BypassWidth <p>旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBypassWidth() {
        return this.BypassWidth;
    }

    /**
     * Set <p>旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BypassWidth <p>旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBypassWidth(Long BypassWidth) {
        this.BypassWidth = BypassWidth;
    }

    /**
     * Get <p>赠送的旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendBypassWidth <p>赠送的旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSendBypassWidth() {
        return this.SendBypassWidth;
    }

    /**
     * Set <p>赠送的旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendBypassWidth <p>赠送的旁路带宽数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendBypassWidth(Long SendBypassWidth) {
        this.SendBypassWidth = SendBypassWidth;
    }

    /**
     * Get <p>互联网边界防火墙总带宽</p> 
     * @return EdgeWidth <p>互联网边界防火墙总带宽</p>
     */
    public Long getEdgeWidth() {
        return this.EdgeWidth;
    }

    /**
     * Set <p>互联网边界防火墙总带宽</p>
     * @param EdgeWidth <p>互联网边界防火墙总带宽</p>
     */
    public void setEdgeWidth(Long EdgeWidth) {
        this.EdgeWidth = EdgeWidth;
    }

    /**
     * Get <p>互联网边界弹性开关</p> 
     * @return EdgeElasticSwitch <p>互联网边界弹性开关</p>
     */
    public Long getEdgeElasticSwitch() {
        return this.EdgeElasticSwitch;
    }

    /**
     * Set <p>互联网边界弹性开关</p>
     * @param EdgeElasticSwitch <p>互联网边界弹性开关</p>
     */
    public void setEdgeElasticSwitch(Long EdgeElasticSwitch) {
        this.EdgeElasticSwitch = EdgeElasticSwitch;
    }

    /**
     * Get <p>互联网边界弹性带宽值</p> 
     * @return EdgeElasticBandwidth <p>互联网边界弹性带宽值</p>
     */
    public Long getEdgeElasticBandwidth() {
        return this.EdgeElasticBandwidth;
    }

    /**
     * Set <p>互联网边界弹性带宽值</p>
     * @param EdgeElasticBandwidth <p>互联网边界弹性带宽值</p>
     */
    public void setEdgeElasticBandwidth(Long EdgeElasticBandwidth) {
        this.EdgeElasticBandwidth = EdgeElasticBandwidth;
    }

    /**
     * Get <p>互联网边界弹性带宽上限</p> 
     * @return EdgeElasticBandwidthLimit <p>互联网边界弹性带宽上限</p>
     */
    public Long getEdgeElasticBandwidthLimit() {
        return this.EdgeElasticBandwidthLimit;
    }

    /**
     * Set <p>互联网边界弹性带宽上限</p>
     * @param EdgeElasticBandwidthLimit <p>互联网边界弹性带宽上限</p>
     */
    public void setEdgeElasticBandwidthLimit(Long EdgeElasticBandwidthLimit) {
        this.EdgeElasticBandwidthLimit = EdgeElasticBandwidthLimit;
    }

    /**
     * Get <p>互联网边界防火墙计量开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 打开</li></ul> 
     * @return EdgeElasticTrafficSwitch <p>互联网边界防火墙计量开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 打开</li></ul>
     */
    public Long getEdgeElasticTrafficSwitch() {
        return this.EdgeElasticTrafficSwitch;
    }

    /**
     * Set <p>互联网边界防火墙计量开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 打开</li></ul>
     * @param EdgeElasticTrafficSwitch <p>互联网边界防火墙计量开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 打开</li></ul>
     */
    public void setEdgeElasticTrafficSwitch(Long EdgeElasticTrafficSwitch) {
        this.EdgeElasticTrafficSwitch = EdgeElasticTrafficSwitch;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSerialRegionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSerialRegionResponse(DescribeSerialRegionResponse source) {
        if (source.SerialRegionLst != null) {
            this.SerialRegionLst = new SerialRegionInfo[source.SerialRegionLst.length];
            for (int i = 0; i < source.SerialRegionLst.length; i++) {
                this.SerialRegionLst[i] = new SerialRegionInfo(source.SerialRegionLst[i]);
            }
        }
        if (source.UnUsedWidth != null) {
            this.UnUsedWidth = new Long(source.UnUsedWidth);
        }
        if (source.UnUsedQuota != null) {
            this.UnUsedQuota = new Long(source.UnUsedQuota);
        }
        if (source.BypassWidth != null) {
            this.BypassWidth = new Long(source.BypassWidth);
        }
        if (source.SendBypassWidth != null) {
            this.SendBypassWidth = new Long(source.SendBypassWidth);
        }
        if (source.EdgeWidth != null) {
            this.EdgeWidth = new Long(source.EdgeWidth);
        }
        if (source.EdgeElasticSwitch != null) {
            this.EdgeElasticSwitch = new Long(source.EdgeElasticSwitch);
        }
        if (source.EdgeElasticBandwidth != null) {
            this.EdgeElasticBandwidth = new Long(source.EdgeElasticBandwidth);
        }
        if (source.EdgeElasticBandwidthLimit != null) {
            this.EdgeElasticBandwidthLimit = new Long(source.EdgeElasticBandwidthLimit);
        }
        if (source.EdgeElasticTrafficSwitch != null) {
            this.EdgeElasticTrafficSwitch = new Long(source.EdgeElasticTrafficSwitch);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SerialRegionLst.", this.SerialRegionLst);
        this.setParamSimple(map, prefix + "UnUsedWidth", this.UnUsedWidth);
        this.setParamSimple(map, prefix + "UnUsedQuota", this.UnUsedQuota);
        this.setParamSimple(map, prefix + "BypassWidth", this.BypassWidth);
        this.setParamSimple(map, prefix + "SendBypassWidth", this.SendBypassWidth);
        this.setParamSimple(map, prefix + "EdgeWidth", this.EdgeWidth);
        this.setParamSimple(map, prefix + "EdgeElasticSwitch", this.EdgeElasticSwitch);
        this.setParamSimple(map, prefix + "EdgeElasticBandwidth", this.EdgeElasticBandwidth);
        this.setParamSimple(map, prefix + "EdgeElasticBandwidthLimit", this.EdgeElasticBandwidthLimit);
        this.setParamSimple(map, prefix + "EdgeElasticTrafficSwitch", this.EdgeElasticTrafficSwitch);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

