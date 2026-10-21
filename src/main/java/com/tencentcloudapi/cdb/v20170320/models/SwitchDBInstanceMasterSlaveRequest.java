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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstanceMasterSlaveRequest extends AbstractModel {

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>目标从实例。可选值：&quot;first&quot; - 第一备机；&quot;second&quot; - 第二备机；&quot;third&quot; - 第三备机。默认值为 &quot;first&quot;，仅多可用区实例支持设置为 &quot;second&quot;。</p>
    */
    @SerializedName("DstSlave")
    @Expose
    private String DstSlave;

    /**
    * <p>是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。</p>
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Boolean ForceSwitch;

    /**
    * <p>是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Boolean WaitSwitch;

    /**
    * <p>集群版实例指定节点 ID 发起主从切换。</p>
    */
    @SerializedName("DstNodeId")
    @Expose
    private String DstNodeId;

    /**
    * <p>等待主备位点差收敛到阈值以内的最长时间,范围：30s-3600s</p>
    */
    @SerializedName("SyncTimeout")
    @Expose
    private Long SyncTimeout;

    /**
    * <p>slave 执行位点和读到位点差值，在最长等待时间内，位点差需小于该值才启动切换</p>
    */
    @SerializedName("SyncDistance")
    @Expose
    private String SyncDistance;

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>目标从实例。可选值：&quot;first&quot; - 第一备机；&quot;second&quot; - 第二备机；&quot;third&quot; - 第三备机。默认值为 &quot;first&quot;，仅多可用区实例支持设置为 &quot;second&quot;。</p> 
     * @return DstSlave <p>目标从实例。可选值：&quot;first&quot; - 第一备机；&quot;second&quot; - 第二备机；&quot;third&quot; - 第三备机。默认值为 &quot;first&quot;，仅多可用区实例支持设置为 &quot;second&quot;。</p>
     */
    public String getDstSlave() {
        return this.DstSlave;
    }

    /**
     * Set <p>目标从实例。可选值：&quot;first&quot; - 第一备机；&quot;second&quot; - 第二备机；&quot;third&quot; - 第三备机。默认值为 &quot;first&quot;，仅多可用区实例支持设置为 &quot;second&quot;。</p>
     * @param DstSlave <p>目标从实例。可选值：&quot;first&quot; - 第一备机；&quot;second&quot; - 第二备机；&quot;third&quot; - 第三备机。默认值为 &quot;first&quot;，仅多可用区实例支持设置为 &quot;second&quot;。</p>
     */
    public void setDstSlave(String DstSlave) {
        this.DstSlave = DstSlave;
    }

    /**
     * Get <p>是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。</p> 
     * @return ForceSwitch <p>是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set <p>是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。</p>
     * @param ForceSwitch <p>是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。</p>
     * @deprecated
     */
    @Deprecated
    public void setForceSwitch(Boolean ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    /**
     * Get <p>是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。</p> 
     * @return WaitSwitch <p>是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。</p>
     */
    public Boolean getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。</p>
     * @param WaitSwitch <p>是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。</p>
     */
    public void setWaitSwitch(Boolean WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>集群版实例指定节点 ID 发起主从切换。</p> 
     * @return DstNodeId <p>集群版实例指定节点 ID 发起主从切换。</p>
     */
    public String getDstNodeId() {
        return this.DstNodeId;
    }

    /**
     * Set <p>集群版实例指定节点 ID 发起主从切换。</p>
     * @param DstNodeId <p>集群版实例指定节点 ID 发起主从切换。</p>
     */
    public void setDstNodeId(String DstNodeId) {
        this.DstNodeId = DstNodeId;
    }

    /**
     * Get <p>等待主备位点差收敛到阈值以内的最长时间,范围：30s-3600s</p> 
     * @return SyncTimeout <p>等待主备位点差收敛到阈值以内的最长时间,范围：30s-3600s</p>
     */
    public Long getSyncTimeout() {
        return this.SyncTimeout;
    }

    /**
     * Set <p>等待主备位点差收敛到阈值以内的最长时间,范围：30s-3600s</p>
     * @param SyncTimeout <p>等待主备位点差收敛到阈值以内的最长时间,范围：30s-3600s</p>
     */
    public void setSyncTimeout(Long SyncTimeout) {
        this.SyncTimeout = SyncTimeout;
    }

    /**
     * Get <p>slave 执行位点和读到位点差值，在最长等待时间内，位点差需小于该值才启动切换</p> 
     * @return SyncDistance <p>slave 执行位点和读到位点差值，在最长等待时间内，位点差需小于该值才启动切换</p>
     */
    public String getSyncDistance() {
        return this.SyncDistance;
    }

    /**
     * Set <p>slave 执行位点和读到位点差值，在最长等待时间内，位点差需小于该值才启动切换</p>
     * @param SyncDistance <p>slave 执行位点和读到位点差值，在最长等待时间内，位点差需小于该值才启动切换</p>
     */
    public void setSyncDistance(String SyncDistance) {
        this.SyncDistance = SyncDistance;
    }

    public SwitchDBInstanceMasterSlaveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDBInstanceMasterSlaveRequest(SwitchDBInstanceMasterSlaveRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstSlave != null) {
            this.DstSlave = new String(source.DstSlave);
        }
        if (source.ForceSwitch != null) {
            this.ForceSwitch = new Boolean(source.ForceSwitch);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Boolean(source.WaitSwitch);
        }
        if (source.DstNodeId != null) {
            this.DstNodeId = new String(source.DstNodeId);
        }
        if (source.SyncTimeout != null) {
            this.SyncTimeout = new Long(source.SyncTimeout);
        }
        if (source.SyncDistance != null) {
            this.SyncDistance = new String(source.SyncDistance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstSlave", this.DstSlave);
        this.setParamSimple(map, prefix + "ForceSwitch", this.ForceSwitch);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "DstNodeId", this.DstNodeId);
        this.setParamSimple(map, prefix + "SyncTimeout", this.SyncTimeout);
        this.setParamSimple(map, prefix + "SyncDistance", this.SyncDistance);

    }
}

