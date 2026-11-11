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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceHAConfigRequest extends AbstractModel {

    /**
    * <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>主从同步方式：</p><li>Semi-sync：半同步</li><li>Async：异步</li>
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * <p>高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。</p><li>单位：byte</li><li>参数范围：[1073741824, 322122547200]</li>
    */
    @SerializedName("MaxStandbyLatency")
    @Expose
    private Long MaxStandbyLatency;

    /**
    * <p>高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。</p><li>单位：s</li><li>参数范围：[5, 10]</li>
    */
    @SerializedName("MaxStandbyLag")
    @Expose
    private Long MaxStandbyLag;

    /**
    * <p>同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag。</p>
    */
    @SerializedName("MaxSyncStandbyLatency")
    @Expose
    private Long MaxSyncStandbyLatency;

    /**
    * <p>同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag，</p>
    */
    @SerializedName("MaxSyncStandbyLag")
    @Expose
    private Long MaxSyncStandbyLag;

    /**
     * Get <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>主从同步方式：</p><li>Semi-sync：半同步</li><li>Async：异步</li> 
     * @return SyncMode <p>主从同步方式：</p><li>Semi-sync：半同步</li><li>Async：异步</li>
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>主从同步方式：</p><li>Semi-sync：半同步</li><li>Async：异步</li>
     * @param SyncMode <p>主从同步方式：</p><li>Semi-sync：半同步</li><li>Async：异步</li>
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。</p><li>单位：byte</li><li>参数范围：[1073741824, 322122547200]</li> 
     * @return MaxStandbyLatency <p>高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。</p><li>单位：byte</li><li>参数范围：[1073741824, 322122547200]</li>
     */
    public Long getMaxStandbyLatency() {
        return this.MaxStandbyLatency;
    }

    /**
     * Set <p>高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。</p><li>单位：byte</li><li>参数范围：[1073741824, 322122547200]</li>
     * @param MaxStandbyLatency <p>高可用备机最大延迟数据量。备节点延迟数据量小于等于该值，且备节点延迟时间小于等于MaxStandbyLag时，可以切换为主节点。</p><li>单位：byte</li><li>参数范围：[1073741824, 322122547200]</li>
     */
    public void setMaxStandbyLatency(Long MaxStandbyLatency) {
        this.MaxStandbyLatency = MaxStandbyLatency;
    }

    /**
     * Get <p>高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。</p><li>单位：s</li><li>参数范围：[5, 10]</li> 
     * @return MaxStandbyLag <p>高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。</p><li>单位：s</li><li>参数范围：[5, 10]</li>
     */
    public Long getMaxStandbyLag() {
        return this.MaxStandbyLag;
    }

    /**
     * Set <p>高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。</p><li>单位：s</li><li>参数范围：[5, 10]</li>
     * @param MaxStandbyLag <p>高可用备机最大延迟时间。备节点延迟时间小于等于该值，且备节点延迟数据量小于等于MaxStandbyLatency时，可以切换为主节点。</p><li>单位：s</li><li>参数范围：[5, 10]</li>
     */
    public void setMaxStandbyLag(Long MaxStandbyLag) {
        this.MaxStandbyLag = MaxStandbyLag;
    }

    /**
     * Get <p>同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag。</p> 
     * @return MaxSyncStandbyLatency <p>同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag。</p>
     */
    public Long getMaxSyncStandbyLatency() {
        return this.MaxSyncStandbyLatency;
    }

    /**
     * Set <p>同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag。</p>
     * @param MaxSyncStandbyLatency <p>同步备机最大延迟数据量。备机延迟数据量小于等于该值，且该备机延迟时间小于等于MaxSyncStandbyLag时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag。</p>
     */
    public void setMaxSyncStandbyLatency(Long MaxSyncStandbyLatency) {
        this.MaxSyncStandbyLatency = MaxSyncStandbyLatency;
    }

    /**
     * Get <p>同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag，</p> 
     * @return MaxSyncStandbyLag <p>同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag，</p>
     */
    public Long getMaxSyncStandbyLag() {
        return this.MaxSyncStandbyLag;
    }

    /**
     * Set <p>同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag，</p>
     * @param MaxSyncStandbyLag <p>同步备机最大延迟时间。备机延迟时间小于等于该值，且该备机延迟数据量小于等于MaxSyncStandbyLatency时，则该备机采用同步复制；否则，采用异步复制。<br>该参数值针对SyncMode设置为Semi-sync的实例有效。<br>半同步实例禁止退化为异步复制时，不设置MaxSyncStandbyLatency、MaxSyncStandbyLag。<br>半同步实例允许退化异步复制时，PostgreSQL 9版本的实例须设置MaxSyncStandbyLatency且不设置MaxSyncStandbyLag，PostgreSQL 10及以上版本的实例须设置MaxSyncStandbyLatency、MaxSyncStandbyLag，</p>
     */
    public void setMaxSyncStandbyLag(Long MaxSyncStandbyLag) {
        this.MaxSyncStandbyLag = MaxSyncStandbyLag;
    }

    public ModifyDBInstanceHAConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceHAConfigRequest(ModifyDBInstanceHAConfigRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "MaxStandbyLatency", this.MaxStandbyLatency);
        this.setParamSimple(map, prefix + "MaxStandbyLag", this.MaxStandbyLag);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLatency", this.MaxSyncStandbyLatency);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLag", this.MaxSyncStandbyLag);

    }
}

