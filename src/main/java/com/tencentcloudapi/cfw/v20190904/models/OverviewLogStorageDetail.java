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

public class OverviewLogStorageDetail extends AbstractModel {

    /**
    * <p>日志已使用存储容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("UsedBytes")
    @Expose
    private Long UsedBytes;

    /**
    * <p>日志总存储容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("TotalBytes")
    @Expose
    private Long TotalBytes;

    /**
    * <p>日志保留天数。</p><p>单位：天</p>
    */
    @SerializedName("StorageDay")
    @Expose
    private Long StorageDay;

    /**
    * <p>NDR 日志保留天数。</p><p>单位：天</p>
    */
    @SerializedName("NDRStorageDay")
    @Expose
    private Long NDRStorageDay;

    /**
    * <p>访问控制日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("AclSize")
    @Expose
    private Long AclSize;

    /**
    * <p>入侵检测日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("IdsSize")
    @Expose
    private Long IdsSize;

    /**
    * <p>流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("NetFlowSize")
    @Expose
    private Long NetFlowSize;

    /**
    * <p>操作日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("OperateSize")
    @Expose
    private Long OperateSize;

    /**
    * <p>NDR 风险日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("NDRRiskSize")
    @Expose
    private Long NDRRiskSize;

    /**
    * <p>NDR 流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
    */
    @SerializedName("NDRNetFlowSize")
    @Expose
    private Long NDRNetFlowSize;

    /**
    * <p>日志存储计费模式标识。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>是否因欠费停止写入日志的状态标识。</p>
    */
    @SerializedName("ArrearsStopWriting")
    @Expose
    private Long ArrearsStopWriting;

    /**
     * Get <p>日志已使用存储容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return UsedBytes <p>日志已使用存储容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getUsedBytes() {
        return this.UsedBytes;
    }

    /**
     * Set <p>日志已使用存储容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param UsedBytes <p>日志已使用存储容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setUsedBytes(Long UsedBytes) {
        this.UsedBytes = UsedBytes;
    }

    /**
     * Get <p>日志总存储容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return TotalBytes <p>日志总存储容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getTotalBytes() {
        return this.TotalBytes;
    }

    /**
     * Set <p>日志总存储容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param TotalBytes <p>日志总存储容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setTotalBytes(Long TotalBytes) {
        this.TotalBytes = TotalBytes;
    }

    /**
     * Get <p>日志保留天数。</p><p>单位：天</p> 
     * @return StorageDay <p>日志保留天数。</p><p>单位：天</p>
     */
    public Long getStorageDay() {
        return this.StorageDay;
    }

    /**
     * Set <p>日志保留天数。</p><p>单位：天</p>
     * @param StorageDay <p>日志保留天数。</p><p>单位：天</p>
     */
    public void setStorageDay(Long StorageDay) {
        this.StorageDay = StorageDay;
    }

    /**
     * Get <p>NDR 日志保留天数。</p><p>单位：天</p> 
     * @return NDRStorageDay <p>NDR 日志保留天数。</p><p>单位：天</p>
     */
    public Long getNDRStorageDay() {
        return this.NDRStorageDay;
    }

    /**
     * Set <p>NDR 日志保留天数。</p><p>单位：天</p>
     * @param NDRStorageDay <p>NDR 日志保留天数。</p><p>单位：天</p>
     */
    public void setNDRStorageDay(Long NDRStorageDay) {
        this.NDRStorageDay = NDRStorageDay;
    }

    /**
     * Get <p>访问控制日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return AclSize <p>访问控制日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getAclSize() {
        return this.AclSize;
    }

    /**
     * Set <p>访问控制日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param AclSize <p>访问控制日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setAclSize(Long AclSize) {
        this.AclSize = AclSize;
    }

    /**
     * Get <p>入侵检测日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return IdsSize <p>入侵检测日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getIdsSize() {
        return this.IdsSize;
    }

    /**
     * Set <p>入侵检测日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param IdsSize <p>入侵检测日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setIdsSize(Long IdsSize) {
        this.IdsSize = IdsSize;
    }

    /**
     * Get <p>流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return NetFlowSize <p>流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getNetFlowSize() {
        return this.NetFlowSize;
    }

    /**
     * Set <p>流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param NetFlowSize <p>流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setNetFlowSize(Long NetFlowSize) {
        this.NetFlowSize = NetFlowSize;
    }

    /**
     * Get <p>操作日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return OperateSize <p>操作日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getOperateSize() {
        return this.OperateSize;
    }

    /**
     * Set <p>操作日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param OperateSize <p>操作日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setOperateSize(Long OperateSize) {
        this.OperateSize = OperateSize;
    }

    /**
     * Get <p>NDR 风险日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return NDRRiskSize <p>NDR 风险日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getNDRRiskSize() {
        return this.NDRRiskSize;
    }

    /**
     * Set <p>NDR 风险日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param NDRRiskSize <p>NDR 风险日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setNDRRiskSize(Long NDRRiskSize) {
        this.NDRRiskSize = NDRRiskSize;
    }

    /**
     * Get <p>NDR 流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p> 
     * @return NDRNetFlowSize <p>NDR 流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public Long getNDRNetFlowSize() {
        return this.NDRNetFlowSize;
    }

    /**
     * Set <p>NDR 流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     * @param NDRNetFlowSize <p>NDR 流量日志占用容量，单位为 Byte。</p><p>单位：Byte</p>
     */
    public void setNDRNetFlowSize(Long NDRNetFlowSize) {
        this.NDRNetFlowSize = NDRNetFlowSize;
    }

    /**
     * Get <p>日志存储计费模式标识。</p> 
     * @return PayMode <p>日志存储计费模式标识。</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>日志存储计费模式标识。</p>
     * @param PayMode <p>日志存储计费模式标识。</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>是否因欠费停止写入日志的状态标识。</p> 
     * @return ArrearsStopWriting <p>是否因欠费停止写入日志的状态标识。</p>
     */
    public Long getArrearsStopWriting() {
        return this.ArrearsStopWriting;
    }

    /**
     * Set <p>是否因欠费停止写入日志的状态标识。</p>
     * @param ArrearsStopWriting <p>是否因欠费停止写入日志的状态标识。</p>
     */
    public void setArrearsStopWriting(Long ArrearsStopWriting) {
        this.ArrearsStopWriting = ArrearsStopWriting;
    }

    public OverviewLogStorageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewLogStorageDetail(OverviewLogStorageDetail source) {
        if (source.UsedBytes != null) {
            this.UsedBytes = new Long(source.UsedBytes);
        }
        if (source.TotalBytes != null) {
            this.TotalBytes = new Long(source.TotalBytes);
        }
        if (source.StorageDay != null) {
            this.StorageDay = new Long(source.StorageDay);
        }
        if (source.NDRStorageDay != null) {
            this.NDRStorageDay = new Long(source.NDRStorageDay);
        }
        if (source.AclSize != null) {
            this.AclSize = new Long(source.AclSize);
        }
        if (source.IdsSize != null) {
            this.IdsSize = new Long(source.IdsSize);
        }
        if (source.NetFlowSize != null) {
            this.NetFlowSize = new Long(source.NetFlowSize);
        }
        if (source.OperateSize != null) {
            this.OperateSize = new Long(source.OperateSize);
        }
        if (source.NDRRiskSize != null) {
            this.NDRRiskSize = new Long(source.NDRRiskSize);
        }
        if (source.NDRNetFlowSize != null) {
            this.NDRNetFlowSize = new Long(source.NDRNetFlowSize);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ArrearsStopWriting != null) {
            this.ArrearsStopWriting = new Long(source.ArrearsStopWriting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedBytes", this.UsedBytes);
        this.setParamSimple(map, prefix + "TotalBytes", this.TotalBytes);
        this.setParamSimple(map, prefix + "StorageDay", this.StorageDay);
        this.setParamSimple(map, prefix + "NDRStorageDay", this.NDRStorageDay);
        this.setParamSimple(map, prefix + "AclSize", this.AclSize);
        this.setParamSimple(map, prefix + "IdsSize", this.IdsSize);
        this.setParamSimple(map, prefix + "NetFlowSize", this.NetFlowSize);
        this.setParamSimple(map, prefix + "OperateSize", this.OperateSize);
        this.setParamSimple(map, prefix + "NDRRiskSize", this.NDRRiskSize);
        this.setParamSimple(map, prefix + "NDRNetFlowSize", this.NDRNetFlowSize);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ArrearsStopWriting", this.ArrearsStopWriting);

    }
}

