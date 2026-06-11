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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineGeneralResponse extends AbstractModel {

    /**
    * <p>资产总数</p>
    */
    @SerializedName("MachineCnt")
    @Expose
    private Long MachineCnt;

    /**
    * <p>腾讯云服务商机器数</p>
    */
    @SerializedName("TencentCloudMachineCnt")
    @Expose
    private Long TencentCloudMachineCnt;

    /**
    * <p>阿里云服务商机器数</p>
    */
    @SerializedName("AliCloudMachineCnt")
    @Expose
    private Long AliCloudMachineCnt;

    /**
    * <p>百度云服务商机器数</p>
    */
    @SerializedName("BaiduCloudMachineCnt")
    @Expose
    private Long BaiduCloudMachineCnt;

    /**
    * <p>IDC机器数</p>
    */
    @SerializedName("IDCMachineCnt")
    @Expose
    private Long IDCMachineCnt;

    /**
    * <p>其他云服务商机器数</p>
    */
    @SerializedName("OtherCloudMachineCnt")
    @Expose
    private Long OtherCloudMachineCnt;

    /**
    * <p>已防护机器数</p>
    */
    @SerializedName("ProtectMachineCnt")
    @Expose
    private Long ProtectMachineCnt;

    /**
    * <p>已防护基础版机器数</p>
    */
    @SerializedName("BaseMachineCnt")
    @Expose
    private Long BaseMachineCnt;

    /**
    * <p>已防护专业版机器数</p>
    */
    @SerializedName("SpecialtyMachineCnt")
    @Expose
    private Long SpecialtyMachineCnt;

    /**
    * <p>已防护旗舰版机器数</p>
    */
    @SerializedName("FlagshipMachineCnt")
    @Expose
    private Long FlagshipMachineCnt;

    /**
    * <p>存在风险的机器数</p>
    */
    @SerializedName("RiskMachineCnt")
    @Expose
    private Long RiskMachineCnt;

    /**
    * <p>比较昨日风险机器数</p>
    */
    @SerializedName("CompareYesterdayRiskMachineCnt")
    @Expose
    private Long CompareYesterdayRiskMachineCnt;

    /**
    * <p>比较昨日未防护机器数</p>
    */
    @SerializedName("CompareYesterdayNotProtectMachineCnt")
    @Expose
    private Long CompareYesterdayNotProtectMachineCnt;

    /**
    * <p>比较昨日即将到期的机器数</p>
    */
    @SerializedName("CompareYesterdayDeadlineMachineCnt")
    @Expose
    private Long CompareYesterdayDeadlineMachineCnt;

    /**
    * <p>即将到期的机器数</p>
    */
    @SerializedName("DeadlineMachineCnt")
    @Expose
    private Long DeadlineMachineCnt;

    /**
    * <p>未防护机器数</p>
    */
    @SerializedName("NotProtectMachineCnt")
    @Expose
    private Long NotProtectMachineCnt;

    /**
    * <p>已防护轻量机器数（Lighthouse机器）</p>
    */
    @SerializedName("LHGeneralDiscountCnt")
    @Expose
    private Long LHGeneralDiscountCnt;

    /**
    * <p>比较昨日新增的主机数</p>
    */
    @SerializedName("CompareYesterdayMachineCnt")
    @Expose
    private Long CompareYesterdayMachineCnt;

    /**
    * <p>自动清理时间,最大720小时,最小0, 默认0 ,0=关闭</p>
    */
    @SerializedName("MachineDestroyAfterOfflineHours")
    @Expose
    private Long MachineDestroyAfterOfflineHours;

    /**
    * <p>云服务器类型数组</p>
    */
    @SerializedName("CloudFrom")
    @Expose
    private CloudFromCnt [] CloudFrom;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资产总数</p> 
     * @return MachineCnt <p>资产总数</p>
     */
    public Long getMachineCnt() {
        return this.MachineCnt;
    }

    /**
     * Set <p>资产总数</p>
     * @param MachineCnt <p>资产总数</p>
     */
    public void setMachineCnt(Long MachineCnt) {
        this.MachineCnt = MachineCnt;
    }

    /**
     * Get <p>腾讯云服务商机器数</p> 
     * @return TencentCloudMachineCnt <p>腾讯云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public Long getTencentCloudMachineCnt() {
        return this.TencentCloudMachineCnt;
    }

    /**
     * Set <p>腾讯云服务商机器数</p>
     * @param TencentCloudMachineCnt <p>腾讯云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public void setTencentCloudMachineCnt(Long TencentCloudMachineCnt) {
        this.TencentCloudMachineCnt = TencentCloudMachineCnt;
    }

    /**
     * Get <p>阿里云服务商机器数</p> 
     * @return AliCloudMachineCnt <p>阿里云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAliCloudMachineCnt() {
        return this.AliCloudMachineCnt;
    }

    /**
     * Set <p>阿里云服务商机器数</p>
     * @param AliCloudMachineCnt <p>阿里云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public void setAliCloudMachineCnt(Long AliCloudMachineCnt) {
        this.AliCloudMachineCnt = AliCloudMachineCnt;
    }

    /**
     * Get <p>百度云服务商机器数</p> 
     * @return BaiduCloudMachineCnt <p>百度云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public Long getBaiduCloudMachineCnt() {
        return this.BaiduCloudMachineCnt;
    }

    /**
     * Set <p>百度云服务商机器数</p>
     * @param BaiduCloudMachineCnt <p>百度云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public void setBaiduCloudMachineCnt(Long BaiduCloudMachineCnt) {
        this.BaiduCloudMachineCnt = BaiduCloudMachineCnt;
    }

    /**
     * Get <p>IDC机器数</p> 
     * @return IDCMachineCnt <p>IDC机器数</p>
     * @deprecated
     */
    @Deprecated
    public Long getIDCMachineCnt() {
        return this.IDCMachineCnt;
    }

    /**
     * Set <p>IDC机器数</p>
     * @param IDCMachineCnt <p>IDC机器数</p>
     * @deprecated
     */
    @Deprecated
    public void setIDCMachineCnt(Long IDCMachineCnt) {
        this.IDCMachineCnt = IDCMachineCnt;
    }

    /**
     * Get <p>其他云服务商机器数</p> 
     * @return OtherCloudMachineCnt <p>其他云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public Long getOtherCloudMachineCnt() {
        return this.OtherCloudMachineCnt;
    }

    /**
     * Set <p>其他云服务商机器数</p>
     * @param OtherCloudMachineCnt <p>其他云服务商机器数</p>
     * @deprecated
     */
    @Deprecated
    public void setOtherCloudMachineCnt(Long OtherCloudMachineCnt) {
        this.OtherCloudMachineCnt = OtherCloudMachineCnt;
    }

    /**
     * Get <p>已防护机器数</p> 
     * @return ProtectMachineCnt <p>已防护机器数</p>
     */
    public Long getProtectMachineCnt() {
        return this.ProtectMachineCnt;
    }

    /**
     * Set <p>已防护机器数</p>
     * @param ProtectMachineCnt <p>已防护机器数</p>
     */
    public void setProtectMachineCnt(Long ProtectMachineCnt) {
        this.ProtectMachineCnt = ProtectMachineCnt;
    }

    /**
     * Get <p>已防护基础版机器数</p> 
     * @return BaseMachineCnt <p>已防护基础版机器数</p>
     */
    public Long getBaseMachineCnt() {
        return this.BaseMachineCnt;
    }

    /**
     * Set <p>已防护基础版机器数</p>
     * @param BaseMachineCnt <p>已防护基础版机器数</p>
     */
    public void setBaseMachineCnt(Long BaseMachineCnt) {
        this.BaseMachineCnt = BaseMachineCnt;
    }

    /**
     * Get <p>已防护专业版机器数</p> 
     * @return SpecialtyMachineCnt <p>已防护专业版机器数</p>
     */
    public Long getSpecialtyMachineCnt() {
        return this.SpecialtyMachineCnt;
    }

    /**
     * Set <p>已防护专业版机器数</p>
     * @param SpecialtyMachineCnt <p>已防护专业版机器数</p>
     */
    public void setSpecialtyMachineCnt(Long SpecialtyMachineCnt) {
        this.SpecialtyMachineCnt = SpecialtyMachineCnt;
    }

    /**
     * Get <p>已防护旗舰版机器数</p> 
     * @return FlagshipMachineCnt <p>已防护旗舰版机器数</p>
     */
    public Long getFlagshipMachineCnt() {
        return this.FlagshipMachineCnt;
    }

    /**
     * Set <p>已防护旗舰版机器数</p>
     * @param FlagshipMachineCnt <p>已防护旗舰版机器数</p>
     */
    public void setFlagshipMachineCnt(Long FlagshipMachineCnt) {
        this.FlagshipMachineCnt = FlagshipMachineCnt;
    }

    /**
     * Get <p>存在风险的机器数</p> 
     * @return RiskMachineCnt <p>存在风险的机器数</p>
     */
    public Long getRiskMachineCnt() {
        return this.RiskMachineCnt;
    }

    /**
     * Set <p>存在风险的机器数</p>
     * @param RiskMachineCnt <p>存在风险的机器数</p>
     */
    public void setRiskMachineCnt(Long RiskMachineCnt) {
        this.RiskMachineCnt = RiskMachineCnt;
    }

    /**
     * Get <p>比较昨日风险机器数</p> 
     * @return CompareYesterdayRiskMachineCnt <p>比较昨日风险机器数</p>
     */
    public Long getCompareYesterdayRiskMachineCnt() {
        return this.CompareYesterdayRiskMachineCnt;
    }

    /**
     * Set <p>比较昨日风险机器数</p>
     * @param CompareYesterdayRiskMachineCnt <p>比较昨日风险机器数</p>
     */
    public void setCompareYesterdayRiskMachineCnt(Long CompareYesterdayRiskMachineCnt) {
        this.CompareYesterdayRiskMachineCnt = CompareYesterdayRiskMachineCnt;
    }

    /**
     * Get <p>比较昨日未防护机器数</p> 
     * @return CompareYesterdayNotProtectMachineCnt <p>比较昨日未防护机器数</p>
     */
    public Long getCompareYesterdayNotProtectMachineCnt() {
        return this.CompareYesterdayNotProtectMachineCnt;
    }

    /**
     * Set <p>比较昨日未防护机器数</p>
     * @param CompareYesterdayNotProtectMachineCnt <p>比较昨日未防护机器数</p>
     */
    public void setCompareYesterdayNotProtectMachineCnt(Long CompareYesterdayNotProtectMachineCnt) {
        this.CompareYesterdayNotProtectMachineCnt = CompareYesterdayNotProtectMachineCnt;
    }

    /**
     * Get <p>比较昨日即将到期的机器数</p> 
     * @return CompareYesterdayDeadlineMachineCnt <p>比较昨日即将到期的机器数</p>
     */
    public Long getCompareYesterdayDeadlineMachineCnt() {
        return this.CompareYesterdayDeadlineMachineCnt;
    }

    /**
     * Set <p>比较昨日即将到期的机器数</p>
     * @param CompareYesterdayDeadlineMachineCnt <p>比较昨日即将到期的机器数</p>
     */
    public void setCompareYesterdayDeadlineMachineCnt(Long CompareYesterdayDeadlineMachineCnt) {
        this.CompareYesterdayDeadlineMachineCnt = CompareYesterdayDeadlineMachineCnt;
    }

    /**
     * Get <p>即将到期的机器数</p> 
     * @return DeadlineMachineCnt <p>即将到期的机器数</p>
     */
    public Long getDeadlineMachineCnt() {
        return this.DeadlineMachineCnt;
    }

    /**
     * Set <p>即将到期的机器数</p>
     * @param DeadlineMachineCnt <p>即将到期的机器数</p>
     */
    public void setDeadlineMachineCnt(Long DeadlineMachineCnt) {
        this.DeadlineMachineCnt = DeadlineMachineCnt;
    }

    /**
     * Get <p>未防护机器数</p> 
     * @return NotProtectMachineCnt <p>未防护机器数</p>
     */
    public Long getNotProtectMachineCnt() {
        return this.NotProtectMachineCnt;
    }

    /**
     * Set <p>未防护机器数</p>
     * @param NotProtectMachineCnt <p>未防护机器数</p>
     */
    public void setNotProtectMachineCnt(Long NotProtectMachineCnt) {
        this.NotProtectMachineCnt = NotProtectMachineCnt;
    }

    /**
     * Get <p>已防护轻量机器数（Lighthouse机器）</p> 
     * @return LHGeneralDiscountCnt <p>已防护轻量机器数（Lighthouse机器）</p>
     */
    public Long getLHGeneralDiscountCnt() {
        return this.LHGeneralDiscountCnt;
    }

    /**
     * Set <p>已防护轻量机器数（Lighthouse机器）</p>
     * @param LHGeneralDiscountCnt <p>已防护轻量机器数（Lighthouse机器）</p>
     */
    public void setLHGeneralDiscountCnt(Long LHGeneralDiscountCnt) {
        this.LHGeneralDiscountCnt = LHGeneralDiscountCnt;
    }

    /**
     * Get <p>比较昨日新增的主机数</p> 
     * @return CompareYesterdayMachineCnt <p>比较昨日新增的主机数</p>
     */
    public Long getCompareYesterdayMachineCnt() {
        return this.CompareYesterdayMachineCnt;
    }

    /**
     * Set <p>比较昨日新增的主机数</p>
     * @param CompareYesterdayMachineCnt <p>比较昨日新增的主机数</p>
     */
    public void setCompareYesterdayMachineCnt(Long CompareYesterdayMachineCnt) {
        this.CompareYesterdayMachineCnt = CompareYesterdayMachineCnt;
    }

    /**
     * Get <p>自动清理时间,最大720小时,最小0, 默认0 ,0=关闭</p> 
     * @return MachineDestroyAfterOfflineHours <p>自动清理时间,最大720小时,最小0, 默认0 ,0=关闭</p>
     */
    public Long getMachineDestroyAfterOfflineHours() {
        return this.MachineDestroyAfterOfflineHours;
    }

    /**
     * Set <p>自动清理时间,最大720小时,最小0, 默认0 ,0=关闭</p>
     * @param MachineDestroyAfterOfflineHours <p>自动清理时间,最大720小时,最小0, 默认0 ,0=关闭</p>
     */
    public void setMachineDestroyAfterOfflineHours(Long MachineDestroyAfterOfflineHours) {
        this.MachineDestroyAfterOfflineHours = MachineDestroyAfterOfflineHours;
    }

    /**
     * Get <p>云服务器类型数组</p> 
     * @return CloudFrom <p>云服务器类型数组</p>
     */
    public CloudFromCnt [] getCloudFrom() {
        return this.CloudFrom;
    }

    /**
     * Set <p>云服务器类型数组</p>
     * @param CloudFrom <p>云服务器类型数组</p>
     */
    public void setCloudFrom(CloudFromCnt [] CloudFrom) {
        this.CloudFrom = CloudFrom;
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

    public DescribeMachineGeneralResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineGeneralResponse(DescribeMachineGeneralResponse source) {
        if (source.MachineCnt != null) {
            this.MachineCnt = new Long(source.MachineCnt);
        }
        if (source.TencentCloudMachineCnt != null) {
            this.TencentCloudMachineCnt = new Long(source.TencentCloudMachineCnt);
        }
        if (source.AliCloudMachineCnt != null) {
            this.AliCloudMachineCnt = new Long(source.AliCloudMachineCnt);
        }
        if (source.BaiduCloudMachineCnt != null) {
            this.BaiduCloudMachineCnt = new Long(source.BaiduCloudMachineCnt);
        }
        if (source.IDCMachineCnt != null) {
            this.IDCMachineCnt = new Long(source.IDCMachineCnt);
        }
        if (source.OtherCloudMachineCnt != null) {
            this.OtherCloudMachineCnt = new Long(source.OtherCloudMachineCnt);
        }
        if (source.ProtectMachineCnt != null) {
            this.ProtectMachineCnt = new Long(source.ProtectMachineCnt);
        }
        if (source.BaseMachineCnt != null) {
            this.BaseMachineCnt = new Long(source.BaseMachineCnt);
        }
        if (source.SpecialtyMachineCnt != null) {
            this.SpecialtyMachineCnt = new Long(source.SpecialtyMachineCnt);
        }
        if (source.FlagshipMachineCnt != null) {
            this.FlagshipMachineCnt = new Long(source.FlagshipMachineCnt);
        }
        if (source.RiskMachineCnt != null) {
            this.RiskMachineCnt = new Long(source.RiskMachineCnt);
        }
        if (source.CompareYesterdayRiskMachineCnt != null) {
            this.CompareYesterdayRiskMachineCnt = new Long(source.CompareYesterdayRiskMachineCnt);
        }
        if (source.CompareYesterdayNotProtectMachineCnt != null) {
            this.CompareYesterdayNotProtectMachineCnt = new Long(source.CompareYesterdayNotProtectMachineCnt);
        }
        if (source.CompareYesterdayDeadlineMachineCnt != null) {
            this.CompareYesterdayDeadlineMachineCnt = new Long(source.CompareYesterdayDeadlineMachineCnt);
        }
        if (source.DeadlineMachineCnt != null) {
            this.DeadlineMachineCnt = new Long(source.DeadlineMachineCnt);
        }
        if (source.NotProtectMachineCnt != null) {
            this.NotProtectMachineCnt = new Long(source.NotProtectMachineCnt);
        }
        if (source.LHGeneralDiscountCnt != null) {
            this.LHGeneralDiscountCnt = new Long(source.LHGeneralDiscountCnt);
        }
        if (source.CompareYesterdayMachineCnt != null) {
            this.CompareYesterdayMachineCnt = new Long(source.CompareYesterdayMachineCnt);
        }
        if (source.MachineDestroyAfterOfflineHours != null) {
            this.MachineDestroyAfterOfflineHours = new Long(source.MachineDestroyAfterOfflineHours);
        }
        if (source.CloudFrom != null) {
            this.CloudFrom = new CloudFromCnt[source.CloudFrom.length];
            for (int i = 0; i < source.CloudFrom.length; i++) {
                this.CloudFrom[i] = new CloudFromCnt(source.CloudFrom[i]);
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
        this.setParamSimple(map, prefix + "MachineCnt", this.MachineCnt);
        this.setParamSimple(map, prefix + "TencentCloudMachineCnt", this.TencentCloudMachineCnt);
        this.setParamSimple(map, prefix + "AliCloudMachineCnt", this.AliCloudMachineCnt);
        this.setParamSimple(map, prefix + "BaiduCloudMachineCnt", this.BaiduCloudMachineCnt);
        this.setParamSimple(map, prefix + "IDCMachineCnt", this.IDCMachineCnt);
        this.setParamSimple(map, prefix + "OtherCloudMachineCnt", this.OtherCloudMachineCnt);
        this.setParamSimple(map, prefix + "ProtectMachineCnt", this.ProtectMachineCnt);
        this.setParamSimple(map, prefix + "BaseMachineCnt", this.BaseMachineCnt);
        this.setParamSimple(map, prefix + "SpecialtyMachineCnt", this.SpecialtyMachineCnt);
        this.setParamSimple(map, prefix + "FlagshipMachineCnt", this.FlagshipMachineCnt);
        this.setParamSimple(map, prefix + "RiskMachineCnt", this.RiskMachineCnt);
        this.setParamSimple(map, prefix + "CompareYesterdayRiskMachineCnt", this.CompareYesterdayRiskMachineCnt);
        this.setParamSimple(map, prefix + "CompareYesterdayNotProtectMachineCnt", this.CompareYesterdayNotProtectMachineCnt);
        this.setParamSimple(map, prefix + "CompareYesterdayDeadlineMachineCnt", this.CompareYesterdayDeadlineMachineCnt);
        this.setParamSimple(map, prefix + "DeadlineMachineCnt", this.DeadlineMachineCnt);
        this.setParamSimple(map, prefix + "NotProtectMachineCnt", this.NotProtectMachineCnt);
        this.setParamSimple(map, prefix + "LHGeneralDiscountCnt", this.LHGeneralDiscountCnt);
        this.setParamSimple(map, prefix + "CompareYesterdayMachineCnt", this.CompareYesterdayMachineCnt);
        this.setParamSimple(map, prefix + "MachineDestroyAfterOfflineHours", this.MachineDestroyAfterOfflineHours);
        this.setParamArrayObj(map, prefix + "CloudFrom.", this.CloudFrom);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

