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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceHAConfigResponse extends AbstractModel{

    /**
    * 主从同步方式：
<li>Semi-sync：半同步
<li>Async：异步
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * 高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。
<li>单位：byte
<li>参数范围：[1073741824, 322122547200]
    */
    @SerializedName("MaxStandbyLatency")
    @Expose
    private Long MaxStandbyLatency;

    /**
    * 高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。
<li>单位：s
<li>参数范围：[5, 10]
    */
    @SerializedName("MaxStandbyLag")
    @Expose
    private Long MaxStandbyLag;

    /**
    * 同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例该字段返回null。
半同步实例禁止退化为异步复制时，该字段返回null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSyncStandbyLatency")
    @Expose
    private Long MaxSyncStandbyLatency;

    /**
    * 同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例不返回该字段。
半同步实例禁止退化为异步复制时，不返回该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSyncStandbyLag")
    @Expose
    private Long MaxSyncStandbyLag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主从同步方式：
<li>Semi-sync：半同步
<li>Async：异步 
     * @return SyncMode 主从同步方式：
<li>Semi-sync：半同步
<li>Async：异步
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 主从同步方式：
<li>Semi-sync：半同步
<li>Async：异步
     * @param SyncMode 主从同步方式：
<li>Semi-sync：半同步
<li>Async：异步
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get 高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。
<li>单位：byte
<li>参数范围：[1073741824, 322122547200] 
     * @return MaxStandbyLatency 高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。
<li>单位：byte
<li>参数范围：[1073741824, 322122547200]
     */
    public Long getMaxStandbyLatency() {
        return this.MaxStandbyLatency;
    }

    /**
     * Set 高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。
<li>单位：byte
<li>参数范围：[1073741824, 322122547200]
     * @param MaxStandbyLatency 高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。
<li>单位：byte
<li>参数范围：[1073741824, 322122547200]
     */
    public void setMaxStandbyLatency(Long MaxStandbyLatency) {
        this.MaxStandbyLatency = MaxStandbyLatency;
    }

    /**
     * Get 高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。
<li>单位：s
<li>参数范围：[5, 10] 
     * @return MaxStandbyLag 高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。
<li>单位：s
<li>参数范围：[5, 10]
     */
    public Long getMaxStandbyLag() {
        return this.MaxStandbyLag;
    }

    /**
     * Set 高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。
<li>单位：s
<li>参数范围：[5, 10]
     * @param MaxStandbyLag 高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。
<li>单位：s
<li>参数范围：[5, 10]
     */
    public void setMaxStandbyLag(Long MaxStandbyLag) {
        this.MaxStandbyLag = MaxStandbyLag;
    }

    /**
     * Get 同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例该字段返回null。
半同步实例禁止退化为异步复制时，该字段返回null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSyncStandbyLatency 同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例该字段返回null。
半同步实例禁止退化为异步复制时，该字段返回null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSyncStandbyLatency() {
        return this.MaxSyncStandbyLatency;
    }

    /**
     * Set 同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例该字段返回null。
半同步实例禁止退化为异步复制时，该字段返回null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSyncStandbyLatency 同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例该字段返回null。
半同步实例禁止退化为异步复制时，该字段返回null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSyncStandbyLatency(Long MaxSyncStandbyLatency) {
        this.MaxSyncStandbyLatency = MaxSyncStandbyLatency;
    }

    /**
     * Get 同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例不返回该字段。
半同步实例禁止退化为异步复制时，不返回该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSyncStandbyLag 同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例不返回该字段。
半同步实例禁止退化为异步复制时，不返回该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSyncStandbyLag() {
        return this.MaxSyncStandbyLag;
    }

    /**
     * Set 同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例不返回该字段。
半同步实例禁止退化为异步复制时，不返回该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSyncStandbyLag 同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。
该参数值针对SyncMode设置为Semi-sync的实例有效。
异步实例不返回该字段。
半同步实例禁止退化为异步复制时，不返回该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSyncStandbyLag(Long MaxSyncStandbyLag) {
        this.MaxSyncStandbyLag = MaxSyncStandbyLag;
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

    public DescribeDBInstanceHAConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceHAConfigResponse(DescribeDBInstanceHAConfigResponse source) {
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.MaxStandbyLatency != null) {
            this.MaxStandbyLatency = new Long(source.MaxStandbyLatency);
        }
        if (source.MaxStandbyLag != null) {
            this.MaxStandbyLag = new Long(source.MaxStandbyLag);
        }
        if (source.MaxSyncStandbyLatency != null) {
            this.MaxSyncStandbyLatency = new Long(source.MaxSyncStandbyLatency);
        }
        if (source.MaxSyncStandbyLag != null) {
            this.MaxSyncStandbyLag = new Long(source.MaxSyncStandbyLag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "MaxStandbyLatency", this.MaxStandbyLatency);
        this.setParamSimple(map, prefix + "MaxStandbyLag", this.MaxStandbyLag);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLatency", this.MaxSyncStandbyLatency);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLag", this.MaxSyncStandbyLag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

