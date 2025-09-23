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

public class DescribeLogStorageStatisticResponse extends AbstractModel {

    /**
    * 返回状态码 0 成功 非0不成功
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 返回信息  success 成功 其他 不成功
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 已使用存储量，单位B
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * 配额存储总量，单位B
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 存储天数
    */
    @SerializedName("StorageDay")
    @Expose
    private Long StorageDay;

    /**
    * 访问控制日志存储量，单位B
    */
    @SerializedName("AclSize")
    @Expose
    private Long AclSize;

    /**
    * 入侵防御日志存储量，单位B
    */
    @SerializedName("IdsSize")
    @Expose
    private Long IdsSize;

    /**
    * 流量日志存储量，单位B
    */
    @SerializedName("NetFlowSize")
    @Expose
    private Long NetFlowSize;

    /**
    * 操作日志存储量，单位B
    */
    @SerializedName("OperateSize")
    @Expose
    private Long OperateSize;

    /**
    * 剩余存储量，单位B
    */
    @SerializedName("LeftSize")
    @Expose
    private Long LeftSize;

    /**
    * 计费模式，0后付费，1预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 每日增加日志存储量柱状图
    */
    @SerializedName("TimeHistogram")
    @Expose
    private StorageHistogram [] TimeHistogram;

    /**
    * 柱形图格式数据
    */
    @SerializedName("TimeHistogramShow")
    @Expose
    private StorageHistogramShow TimeHistogramShow;

    /**
    * 后付费模式存储状态，0正常，1欠费停止写入
    */
    @SerializedName("ArrearsStopWriting")
    @Expose
    private Long ArrearsStopWriting;

    /**
    * NDR流量日志存储量，单位B
    */
    @SerializedName("NDRNetFlowSize")
    @Expose
    private Long NDRNetFlowSize;

    /**
    * NDR风险日志存储量，单位B
    */
    @SerializedName("NDRRiskSize")
    @Expose
    private Long NDRRiskSize;

    /**
    * NDR日志存储天数
    */
    @SerializedName("NDRStorageDay")
    @Expose
    private Long NDRStorageDay;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回状态码 0 成功 非0不成功 
     * @return ReturnCode 返回状态码 0 成功 非0不成功
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回状态码 0 成功 非0不成功
     * @param ReturnCode 返回状态码 0 成功 非0不成功
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 返回信息  success 成功 其他 不成功 
     * @return ReturnMsg 返回信息  success 成功 其他 不成功
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回信息  success 成功 其他 不成功
     * @param ReturnMsg 返回信息  success 成功 其他 不成功
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 已使用存储量，单位B 
     * @return UsedSize 已使用存储量，单位B
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set 已使用存储量，单位B
     * @param UsedSize 已使用存储量，单位B
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
    }

    /**
     * Get 配额存储总量，单位B 
     * @return TotalSize 配额存储总量，单位B
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 配额存储总量，单位B
     * @param TotalSize 配额存储总量，单位B
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 存储天数 
     * @return StorageDay 存储天数
     */
    public Long getStorageDay() {
        return this.StorageDay;
    }

    /**
     * Set 存储天数
     * @param StorageDay 存储天数
     */
    public void setStorageDay(Long StorageDay) {
        this.StorageDay = StorageDay;
    }

    /**
     * Get 访问控制日志存储量，单位B 
     * @return AclSize 访问控制日志存储量，单位B
     */
    public Long getAclSize() {
        return this.AclSize;
    }

    /**
     * Set 访问控制日志存储量，单位B
     * @param AclSize 访问控制日志存储量，单位B
     */
    public void setAclSize(Long AclSize) {
        this.AclSize = AclSize;
    }

    /**
     * Get 入侵防御日志存储量，单位B 
     * @return IdsSize 入侵防御日志存储量，单位B
     */
    public Long getIdsSize() {
        return this.IdsSize;
    }

    /**
     * Set 入侵防御日志存储量，单位B
     * @param IdsSize 入侵防御日志存储量，单位B
     */
    public void setIdsSize(Long IdsSize) {
        this.IdsSize = IdsSize;
    }

    /**
     * Get 流量日志存储量，单位B 
     * @return NetFlowSize 流量日志存储量，单位B
     */
    public Long getNetFlowSize() {
        return this.NetFlowSize;
    }

    /**
     * Set 流量日志存储量，单位B
     * @param NetFlowSize 流量日志存储量，单位B
     */
    public void setNetFlowSize(Long NetFlowSize) {
        this.NetFlowSize = NetFlowSize;
    }

    /**
     * Get 操作日志存储量，单位B 
     * @return OperateSize 操作日志存储量，单位B
     */
    public Long getOperateSize() {
        return this.OperateSize;
    }

    /**
     * Set 操作日志存储量，单位B
     * @param OperateSize 操作日志存储量，单位B
     */
    public void setOperateSize(Long OperateSize) {
        this.OperateSize = OperateSize;
    }

    /**
     * Get 剩余存储量，单位B 
     * @return LeftSize 剩余存储量，单位B
     */
    public Long getLeftSize() {
        return this.LeftSize;
    }

    /**
     * Set 剩余存储量，单位B
     * @param LeftSize 剩余存储量，单位B
     */
    public void setLeftSize(Long LeftSize) {
        this.LeftSize = LeftSize;
    }

    /**
     * Get 计费模式，0后付费，1预付费 
     * @return PayMode 计费模式，0后付费，1预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式，0后付费，1预付费
     * @param PayMode 计费模式，0后付费，1预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 每日增加日志存储量柱状图 
     * @return TimeHistogram 每日增加日志存储量柱状图
     */
    public StorageHistogram [] getTimeHistogram() {
        return this.TimeHistogram;
    }

    /**
     * Set 每日增加日志存储量柱状图
     * @param TimeHistogram 每日增加日志存储量柱状图
     */
    public void setTimeHistogram(StorageHistogram [] TimeHistogram) {
        this.TimeHistogram = TimeHistogram;
    }

    /**
     * Get 柱形图格式数据 
     * @return TimeHistogramShow 柱形图格式数据
     */
    public StorageHistogramShow getTimeHistogramShow() {
        return this.TimeHistogramShow;
    }

    /**
     * Set 柱形图格式数据
     * @param TimeHistogramShow 柱形图格式数据
     */
    public void setTimeHistogramShow(StorageHistogramShow TimeHistogramShow) {
        this.TimeHistogramShow = TimeHistogramShow;
    }

    /**
     * Get 后付费模式存储状态，0正常，1欠费停止写入 
     * @return ArrearsStopWriting 后付费模式存储状态，0正常，1欠费停止写入
     */
    public Long getArrearsStopWriting() {
        return this.ArrearsStopWriting;
    }

    /**
     * Set 后付费模式存储状态，0正常，1欠费停止写入
     * @param ArrearsStopWriting 后付费模式存储状态，0正常，1欠费停止写入
     */
    public void setArrearsStopWriting(Long ArrearsStopWriting) {
        this.ArrearsStopWriting = ArrearsStopWriting;
    }

    /**
     * Get NDR流量日志存储量，单位B 
     * @return NDRNetFlowSize NDR流量日志存储量，单位B
     */
    public Long getNDRNetFlowSize() {
        return this.NDRNetFlowSize;
    }

    /**
     * Set NDR流量日志存储量，单位B
     * @param NDRNetFlowSize NDR流量日志存储量，单位B
     */
    public void setNDRNetFlowSize(Long NDRNetFlowSize) {
        this.NDRNetFlowSize = NDRNetFlowSize;
    }

    /**
     * Get NDR风险日志存储量，单位B 
     * @return NDRRiskSize NDR风险日志存储量，单位B
     */
    public Long getNDRRiskSize() {
        return this.NDRRiskSize;
    }

    /**
     * Set NDR风险日志存储量，单位B
     * @param NDRRiskSize NDR风险日志存储量，单位B
     */
    public void setNDRRiskSize(Long NDRRiskSize) {
        this.NDRRiskSize = NDRRiskSize;
    }

    /**
     * Get NDR日志存储天数 
     * @return NDRStorageDay NDR日志存储天数
     */
    public Long getNDRStorageDay() {
        return this.NDRStorageDay;
    }

    /**
     * Set NDR日志存储天数
     * @param NDRStorageDay NDR日志存储天数
     */
    public void setNDRStorageDay(Long NDRStorageDay) {
        this.NDRStorageDay = NDRStorageDay;
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

    public DescribeLogStorageStatisticResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogStorageStatisticResponse(DescribeLogStorageStatisticResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.UsedSize != null) {
            this.UsedSize = new Long(source.UsedSize);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.StorageDay != null) {
            this.StorageDay = new Long(source.StorageDay);
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
        if (source.LeftSize != null) {
            this.LeftSize = new Long(source.LeftSize);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeHistogram != null) {
            this.TimeHistogram = new StorageHistogram[source.TimeHistogram.length];
            for (int i = 0; i < source.TimeHistogram.length; i++) {
                this.TimeHistogram[i] = new StorageHistogram(source.TimeHistogram[i]);
            }
        }
        if (source.TimeHistogramShow != null) {
            this.TimeHistogramShow = new StorageHistogramShow(source.TimeHistogramShow);
        }
        if (source.ArrearsStopWriting != null) {
            this.ArrearsStopWriting = new Long(source.ArrearsStopWriting);
        }
        if (source.NDRNetFlowSize != null) {
            this.NDRNetFlowSize = new Long(source.NDRNetFlowSize);
        }
        if (source.NDRRiskSize != null) {
            this.NDRRiskSize = new Long(source.NDRRiskSize);
        }
        if (source.NDRStorageDay != null) {
            this.NDRStorageDay = new Long(source.NDRStorageDay);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "UsedSize", this.UsedSize);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "StorageDay", this.StorageDay);
        this.setParamSimple(map, prefix + "AclSize", this.AclSize);
        this.setParamSimple(map, prefix + "IdsSize", this.IdsSize);
        this.setParamSimple(map, prefix + "NetFlowSize", this.NetFlowSize);
        this.setParamSimple(map, prefix + "OperateSize", this.OperateSize);
        this.setParamSimple(map, prefix + "LeftSize", this.LeftSize);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "TimeHistogram.", this.TimeHistogram);
        this.setParamObj(map, prefix + "TimeHistogramShow.", this.TimeHistogramShow);
        this.setParamSimple(map, prefix + "ArrearsStopWriting", this.ArrearsStopWriting);
        this.setParamSimple(map, prefix + "NDRNetFlowSize", this.NDRNetFlowSize);
        this.setParamSimple(map, prefix + "NDRRiskSize", this.NDRRiskSize);
        this.setParamSimple(map, prefix + "NDRStorageDay", this.NDRStorageDay);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

