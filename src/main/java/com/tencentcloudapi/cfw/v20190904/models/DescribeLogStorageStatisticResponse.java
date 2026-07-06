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
    * <p>返回状态码 0 成功 非0不成功</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * <p>返回信息  success 成功 其他 不成功</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>已使用存储量，单位B</p>
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * <p>配额存储总量，单位B</p>
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * <p>存储天数</p>
    */
    @SerializedName("StorageDay")
    @Expose
    private Long StorageDay;

    /**
    * <p>访问控制日志存储量，单位B</p>
    */
    @SerializedName("AclSize")
    @Expose
    private Long AclSize;

    /**
    * <p>入侵防御日志存储量，单位B</p>
    */
    @SerializedName("IdsSize")
    @Expose
    private Long IdsSize;

    /**
    * <p>流量日志存储量，单位B</p>
    */
    @SerializedName("NetFlowSize")
    @Expose
    private Long NetFlowSize;

    /**
    * <p>操作日志存储量，单位B</p>
    */
    @SerializedName("OperateSize")
    @Expose
    private Long OperateSize;

    /**
    * <p>剩余存储量，单位B</p>
    */
    @SerializedName("LeftSize")
    @Expose
    private Long LeftSize;

    /**
    * <p>计费模式，0后付费，1预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>每日增加日志存储量柱状图</p>
    */
    @SerializedName("TimeHistogram")
    @Expose
    private StorageHistogram [] TimeHistogram;

    /**
    * <p>柱形图格式数据</p>
    */
    @SerializedName("TimeHistogramShow")
    @Expose
    private StorageHistogramShow TimeHistogramShow;

    /**
    * <p>后付费模式存储状态，0正常，1欠费停止写入</p>
    */
    @SerializedName("ArrearsStopWriting")
    @Expose
    private Long ArrearsStopWriting;

    /**
    * <p>NDR流量日志存储量，单位B</p>
    */
    @SerializedName("NDRNetFlowSize")
    @Expose
    private Long NDRNetFlowSize;

    /**
    * <p>NDR风险日志存储量，单位B</p>
    */
    @SerializedName("NDRRiskSize")
    @Expose
    private Long NDRRiskSize;

    /**
    * <p>NDR日志存储天数</p>
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
     * Get <p>返回状态码 0 成功 非0不成功</p> 
     * @return ReturnCode <p>返回状态码 0 成功 非0不成功</p>
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>返回状态码 0 成功 非0不成功</p>
     * @param ReturnCode <p>返回状态码 0 成功 非0不成功</p>
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>返回信息  success 成功 其他 不成功</p> 
     * @return ReturnMsg <p>返回信息  success 成功 其他 不成功</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>返回信息  success 成功 其他 不成功</p>
     * @param ReturnMsg <p>返回信息  success 成功 其他 不成功</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>已使用存储量，单位B</p> 
     * @return UsedSize <p>已使用存储量，单位B</p>
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set <p>已使用存储量，单位B</p>
     * @param UsedSize <p>已使用存储量，单位B</p>
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
    }

    /**
     * Get <p>配额存储总量，单位B</p> 
     * @return TotalSize <p>配额存储总量，单位B</p>
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>配额存储总量，单位B</p>
     * @param TotalSize <p>配额存储总量，单位B</p>
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get <p>存储天数</p> 
     * @return StorageDay <p>存储天数</p>
     */
    public Long getStorageDay() {
        return this.StorageDay;
    }

    /**
     * Set <p>存储天数</p>
     * @param StorageDay <p>存储天数</p>
     */
    public void setStorageDay(Long StorageDay) {
        this.StorageDay = StorageDay;
    }

    /**
     * Get <p>访问控制日志存储量，单位B</p> 
     * @return AclSize <p>访问控制日志存储量，单位B</p>
     */
    public Long getAclSize() {
        return this.AclSize;
    }

    /**
     * Set <p>访问控制日志存储量，单位B</p>
     * @param AclSize <p>访问控制日志存储量，单位B</p>
     */
    public void setAclSize(Long AclSize) {
        this.AclSize = AclSize;
    }

    /**
     * Get <p>入侵防御日志存储量，单位B</p> 
     * @return IdsSize <p>入侵防御日志存储量，单位B</p>
     */
    public Long getIdsSize() {
        return this.IdsSize;
    }

    /**
     * Set <p>入侵防御日志存储量，单位B</p>
     * @param IdsSize <p>入侵防御日志存储量，单位B</p>
     */
    public void setIdsSize(Long IdsSize) {
        this.IdsSize = IdsSize;
    }

    /**
     * Get <p>流量日志存储量，单位B</p> 
     * @return NetFlowSize <p>流量日志存储量，单位B</p>
     */
    public Long getNetFlowSize() {
        return this.NetFlowSize;
    }

    /**
     * Set <p>流量日志存储量，单位B</p>
     * @param NetFlowSize <p>流量日志存储量，单位B</p>
     */
    public void setNetFlowSize(Long NetFlowSize) {
        this.NetFlowSize = NetFlowSize;
    }

    /**
     * Get <p>操作日志存储量，单位B</p> 
     * @return OperateSize <p>操作日志存储量，单位B</p>
     */
    public Long getOperateSize() {
        return this.OperateSize;
    }

    /**
     * Set <p>操作日志存储量，单位B</p>
     * @param OperateSize <p>操作日志存储量，单位B</p>
     */
    public void setOperateSize(Long OperateSize) {
        this.OperateSize = OperateSize;
    }

    /**
     * Get <p>剩余存储量，单位B</p> 
     * @return LeftSize <p>剩余存储量，单位B</p>
     */
    public Long getLeftSize() {
        return this.LeftSize;
    }

    /**
     * Set <p>剩余存储量，单位B</p>
     * @param LeftSize <p>剩余存储量，单位B</p>
     */
    public void setLeftSize(Long LeftSize) {
        this.LeftSize = LeftSize;
    }

    /**
     * Get <p>计费模式，0后付费，1预付费</p> 
     * @return PayMode <p>计费模式，0后付费，1预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式，0后付费，1预付费</p>
     * @param PayMode <p>计费模式，0后付费，1预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>每日增加日志存储量柱状图</p> 
     * @return TimeHistogram <p>每日增加日志存储量柱状图</p>
     */
    public StorageHistogram [] getTimeHistogram() {
        return this.TimeHistogram;
    }

    /**
     * Set <p>每日增加日志存储量柱状图</p>
     * @param TimeHistogram <p>每日增加日志存储量柱状图</p>
     */
    public void setTimeHistogram(StorageHistogram [] TimeHistogram) {
        this.TimeHistogram = TimeHistogram;
    }

    /**
     * Get <p>柱形图格式数据</p> 
     * @return TimeHistogramShow <p>柱形图格式数据</p>
     */
    public StorageHistogramShow getTimeHistogramShow() {
        return this.TimeHistogramShow;
    }

    /**
     * Set <p>柱形图格式数据</p>
     * @param TimeHistogramShow <p>柱形图格式数据</p>
     */
    public void setTimeHistogramShow(StorageHistogramShow TimeHistogramShow) {
        this.TimeHistogramShow = TimeHistogramShow;
    }

    /**
     * Get <p>后付费模式存储状态，0正常，1欠费停止写入</p> 
     * @return ArrearsStopWriting <p>后付费模式存储状态，0正常，1欠费停止写入</p>
     */
    public Long getArrearsStopWriting() {
        return this.ArrearsStopWriting;
    }

    /**
     * Set <p>后付费模式存储状态，0正常，1欠费停止写入</p>
     * @param ArrearsStopWriting <p>后付费模式存储状态，0正常，1欠费停止写入</p>
     */
    public void setArrearsStopWriting(Long ArrearsStopWriting) {
        this.ArrearsStopWriting = ArrearsStopWriting;
    }

    /**
     * Get <p>NDR流量日志存储量，单位B</p> 
     * @return NDRNetFlowSize <p>NDR流量日志存储量，单位B</p>
     */
    public Long getNDRNetFlowSize() {
        return this.NDRNetFlowSize;
    }

    /**
     * Set <p>NDR流量日志存储量，单位B</p>
     * @param NDRNetFlowSize <p>NDR流量日志存储量，单位B</p>
     */
    public void setNDRNetFlowSize(Long NDRNetFlowSize) {
        this.NDRNetFlowSize = NDRNetFlowSize;
    }

    /**
     * Get <p>NDR风险日志存储量，单位B</p> 
     * @return NDRRiskSize <p>NDR风险日志存储量，单位B</p>
     */
    public Long getNDRRiskSize() {
        return this.NDRRiskSize;
    }

    /**
     * Set <p>NDR风险日志存储量，单位B</p>
     * @param NDRRiskSize <p>NDR风险日志存储量，单位B</p>
     */
    public void setNDRRiskSize(Long NDRRiskSize) {
        this.NDRRiskSize = NDRRiskSize;
    }

    /**
     * Get <p>NDR日志存储天数</p> 
     * @return NDRStorageDay <p>NDR日志存储天数</p>
     */
    public Long getNDRStorageDay() {
        return this.NDRStorageDay;
    }

    /**
     * Set <p>NDR日志存储天数</p>
     * @param NDRStorageDay <p>NDR日志存储天数</p>
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

