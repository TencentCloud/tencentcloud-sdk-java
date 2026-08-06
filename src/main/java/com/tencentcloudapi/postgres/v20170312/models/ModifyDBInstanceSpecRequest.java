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

public class ModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * <p>实例ID，形如：postgres-6bwgamo3。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>修改后的实例内存大小，单位GB。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>修改后的实例磁盘大小，单位GB。该参数的设置步长为10。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID列表，目前仅支持指定一张代金券。</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>活动ID。</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * <p>指定实例配置完成变更后的切换时间。</p><li>0：立即切换 </li><li>1：指定时间切换</li><li>2：维护时间窗口内</li>切换默认值：0
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * <p>切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>修改后的实例CPU大小，单位Core。不填写该参数时，默认根据Memory确定Cpu大小。如Memory为2，支持的规格有1核2GB，则不传入Cpu时，Cpu默认为1。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>变配时同步修改的参数列表</p>
    */
    @SerializedName("SyncModifyParams")
    @Expose
    private ParamEntry [] SyncModifyParams;

    /**
     * Get <p>实例ID，形如：postgres-6bwgamo3。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例ID，形如：postgres-6bwgamo3。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID，形如：postgres-6bwgamo3。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例ID，形如：postgres-6bwgamo3。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>修改后的实例内存大小，单位GB。</p> 
     * @return Memory <p>修改后的实例内存大小，单位GB。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>修改后的实例内存大小，单位GB。</p>
     * @param Memory <p>修改后的实例内存大小，单位GB。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>修改后的实例磁盘大小，单位GB。该参数的设置步长为10。</p> 
     * @return Storage <p>修改后的实例磁盘大小，单位GB。该参数的设置步长为10。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>修改后的实例磁盘大小，单位GB。该参数的设置步长为10。</p>
     * @param Storage <p>修改后的实例磁盘大小，单位GB。该参数的设置步长为10。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表，目前仅支持指定一张代金券。</p> 
     * @return VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     * @param VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>活动ID。</p> 
     * @return ActivityId <p>活动ID。</p>
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>活动ID。</p>
     * @param ActivityId <p>活动ID。</p>
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>指定实例配置完成变更后的切换时间。</p><li>0：立即切换 </li><li>1：指定时间切换</li><li>2：维护时间窗口内</li>切换默认值：0 
     * @return SwitchTag <p>指定实例配置完成变更后的切换时间。</p><li>0：立即切换 </li><li>1：指定时间切换</li><li>2：维护时间窗口内</li>切换默认值：0
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set <p>指定实例配置完成变更后的切换时间。</p><li>0：立即切换 </li><li>1：指定时间切换</li><li>2：维护时间窗口内</li>切换默认值：0
     * @param SwitchTag <p>指定实例配置完成变更后的切换时间。</p><li>0：立即切换 </li><li>1：指定时间切换</li><li>2：维护时间窗口内</li>切换默认值：0
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get <p>切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。</p> 
     * @return SwitchStartTime <p>切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。</p>
     * @param SwitchStartTime <p>切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。</p> 
     * @return SwitchEndTime <p>切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。</p>
     * @param SwitchEndTime <p>切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>修改后的实例CPU大小，单位Core。不填写该参数时，默认根据Memory确定Cpu大小。如Memory为2，支持的规格有1核2GB，则不传入Cpu时，Cpu默认为1。</p> 
     * @return Cpu <p>修改后的实例CPU大小，单位Core。不填写该参数时，默认根据Memory确定Cpu大小。如Memory为2，支持的规格有1核2GB，则不传入Cpu时，Cpu默认为1。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>修改后的实例CPU大小，单位Core。不填写该参数时，默认根据Memory确定Cpu大小。如Memory为2，支持的规格有1核2GB，则不传入Cpu时，Cpu默认为1。</p>
     * @param Cpu <p>修改后的实例CPU大小，单位Core。不填写该参数时，默认根据Memory确定Cpu大小。如Memory为2，支持的规格有1核2GB，则不传入Cpu时，Cpu默认为1。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>变配时同步修改的参数列表</p> 
     * @return SyncModifyParams <p>变配时同步修改的参数列表</p>
     */
    public ParamEntry [] getSyncModifyParams() {
        return this.SyncModifyParams;
    }

    /**
     * Set <p>变配时同步修改的参数列表</p>
     * @param SyncModifyParams <p>变配时同步修改的参数列表</p>
     */
    public void setSyncModifyParams(ParamEntry [] SyncModifyParams) {
        this.SyncModifyParams = SyncModifyParams;
    }

    public ModifyDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSpecRequest(ModifyDBInstanceSpecRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.SyncModifyParams != null) {
            this.SyncModifyParams = new ParamEntry[source.SyncModifyParams.length];
            for (int i = 0; i < source.SyncModifyParams.length; i++) {
                this.SyncModifyParams[i] = new ParamEntry(source.SyncModifyParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamArrayObj(map, prefix + "SyncModifyParams.", this.SyncModifyParams);

    }
}

