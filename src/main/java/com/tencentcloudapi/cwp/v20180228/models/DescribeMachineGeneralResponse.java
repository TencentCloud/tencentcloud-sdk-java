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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineGeneralResponse extends AbstractModel {

    /**
    * 资产总数
    */
    @SerializedName("MachineCnt")
    @Expose
    private Long MachineCnt;

    /**
    * 腾讯云服务商机器数
    */
    @SerializedName("TencentCloudMachineCnt")
    @Expose
    private Long TencentCloudMachineCnt;

    /**
    * 阿里云服务商机器数
    */
    @SerializedName("AliCloudMachineCnt")
    @Expose
    private Long AliCloudMachineCnt;

    /**
    * 百度云服务商机器数
    */
    @SerializedName("BaiduCloudMachineCnt")
    @Expose
    private Long BaiduCloudMachineCnt;

    /**
    * IDC机器数
    */
    @SerializedName("IDCMachineCnt")
    @Expose
    private Long IDCMachineCnt;

    /**
    * 其他云服务商机器数
    */
    @SerializedName("OtherCloudMachineCnt")
    @Expose
    private Long OtherCloudMachineCnt;

    /**
    * 已防护机器数
    */
    @SerializedName("ProtectMachineCnt")
    @Expose
    private Long ProtectMachineCnt;

    /**
    * 已防护基础版机器数
    */
    @SerializedName("BaseMachineCnt")
    @Expose
    private Long BaseMachineCnt;

    /**
    * 已防护专业版机器数
    */
    @SerializedName("SpecialtyMachineCnt")
    @Expose
    private Long SpecialtyMachineCnt;

    /**
    * 已防护旗舰版机器数
    */
    @SerializedName("FlagshipMachineCnt")
    @Expose
    private Long FlagshipMachineCnt;

    /**
    * 存在风险的机器数
    */
    @SerializedName("RiskMachineCnt")
    @Expose
    private Long RiskMachineCnt;

    /**
    * 比较昨日风险机器数
    */
    @SerializedName("CompareYesterdayRiskMachineCnt")
    @Expose
    private Long CompareYesterdayRiskMachineCnt;

    /**
    * 比较昨日未防护机器数
    */
    @SerializedName("CompareYesterdayNotProtectMachineCnt")
    @Expose
    private Long CompareYesterdayNotProtectMachineCnt;

    /**
    * 比较昨日即将到期的机器数
    */
    @SerializedName("CompareYesterdayDeadlineMachineCnt")
    @Expose
    private Long CompareYesterdayDeadlineMachineCnt;

    /**
    * 即将到期的机器数
    */
    @SerializedName("DeadlineMachineCnt")
    @Expose
    private Long DeadlineMachineCnt;

    /**
    * 未防护机器数
    */
    @SerializedName("NotProtectMachineCnt")
    @Expose
    private Long NotProtectMachineCnt;

    /**
    * 已防护普惠版机器数（Lighthouse机器）
    */
    @SerializedName("LHGeneralDiscountCnt")
    @Expose
    private Long LHGeneralDiscountCnt;

    /**
    * 比较昨日新增的主机数
    */
    @SerializedName("CompareYesterdayMachineCnt")
    @Expose
    private Long CompareYesterdayMachineCnt;

    /**
    * 自动清理时间,最大720小时,最小0, 默认0 ,0=关闭
    */
    @SerializedName("MachineDestroyAfterOfflineHours")
    @Expose
    private Long MachineDestroyAfterOfflineHours;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产总数 
     * @return MachineCnt 资产总数
     */
    public Long getMachineCnt() {
        return this.MachineCnt;
    }

    /**
     * Set 资产总数
     * @param MachineCnt 资产总数
     */
    public void setMachineCnt(Long MachineCnt) {
        this.MachineCnt = MachineCnt;
    }

    /**
     * Get 腾讯云服务商机器数 
     * @return TencentCloudMachineCnt 腾讯云服务商机器数
     */
    public Long getTencentCloudMachineCnt() {
        return this.TencentCloudMachineCnt;
    }

    /**
     * Set 腾讯云服务商机器数
     * @param TencentCloudMachineCnt 腾讯云服务商机器数
     */
    public void setTencentCloudMachineCnt(Long TencentCloudMachineCnt) {
        this.TencentCloudMachineCnt = TencentCloudMachineCnt;
    }

    /**
     * Get 阿里云服务商机器数 
     * @return AliCloudMachineCnt 阿里云服务商机器数
     */
    public Long getAliCloudMachineCnt() {
        return this.AliCloudMachineCnt;
    }

    /**
     * Set 阿里云服务商机器数
     * @param AliCloudMachineCnt 阿里云服务商机器数
     */
    public void setAliCloudMachineCnt(Long AliCloudMachineCnt) {
        this.AliCloudMachineCnt = AliCloudMachineCnt;
    }

    /**
     * Get 百度云服务商机器数 
     * @return BaiduCloudMachineCnt 百度云服务商机器数
     */
    public Long getBaiduCloudMachineCnt() {
        return this.BaiduCloudMachineCnt;
    }

    /**
     * Set 百度云服务商机器数
     * @param BaiduCloudMachineCnt 百度云服务商机器数
     */
    public void setBaiduCloudMachineCnt(Long BaiduCloudMachineCnt) {
        this.BaiduCloudMachineCnt = BaiduCloudMachineCnt;
    }

    /**
     * Get IDC机器数 
     * @return IDCMachineCnt IDC机器数
     */
    public Long getIDCMachineCnt() {
        return this.IDCMachineCnt;
    }

    /**
     * Set IDC机器数
     * @param IDCMachineCnt IDC机器数
     */
    public void setIDCMachineCnt(Long IDCMachineCnt) {
        this.IDCMachineCnt = IDCMachineCnt;
    }

    /**
     * Get 其他云服务商机器数 
     * @return OtherCloudMachineCnt 其他云服务商机器数
     */
    public Long getOtherCloudMachineCnt() {
        return this.OtherCloudMachineCnt;
    }

    /**
     * Set 其他云服务商机器数
     * @param OtherCloudMachineCnt 其他云服务商机器数
     */
    public void setOtherCloudMachineCnt(Long OtherCloudMachineCnt) {
        this.OtherCloudMachineCnt = OtherCloudMachineCnt;
    }

    /**
     * Get 已防护机器数 
     * @return ProtectMachineCnt 已防护机器数
     */
    public Long getProtectMachineCnt() {
        return this.ProtectMachineCnt;
    }

    /**
     * Set 已防护机器数
     * @param ProtectMachineCnt 已防护机器数
     */
    public void setProtectMachineCnt(Long ProtectMachineCnt) {
        this.ProtectMachineCnt = ProtectMachineCnt;
    }

    /**
     * Get 已防护基础版机器数 
     * @return BaseMachineCnt 已防护基础版机器数
     */
    public Long getBaseMachineCnt() {
        return this.BaseMachineCnt;
    }

    /**
     * Set 已防护基础版机器数
     * @param BaseMachineCnt 已防护基础版机器数
     */
    public void setBaseMachineCnt(Long BaseMachineCnt) {
        this.BaseMachineCnt = BaseMachineCnt;
    }

    /**
     * Get 已防护专业版机器数 
     * @return SpecialtyMachineCnt 已防护专业版机器数
     */
    public Long getSpecialtyMachineCnt() {
        return this.SpecialtyMachineCnt;
    }

    /**
     * Set 已防护专业版机器数
     * @param SpecialtyMachineCnt 已防护专业版机器数
     */
    public void setSpecialtyMachineCnt(Long SpecialtyMachineCnt) {
        this.SpecialtyMachineCnt = SpecialtyMachineCnt;
    }

    /**
     * Get 已防护旗舰版机器数 
     * @return FlagshipMachineCnt 已防护旗舰版机器数
     */
    public Long getFlagshipMachineCnt() {
        return this.FlagshipMachineCnt;
    }

    /**
     * Set 已防护旗舰版机器数
     * @param FlagshipMachineCnt 已防护旗舰版机器数
     */
    public void setFlagshipMachineCnt(Long FlagshipMachineCnt) {
        this.FlagshipMachineCnt = FlagshipMachineCnt;
    }

    /**
     * Get 存在风险的机器数 
     * @return RiskMachineCnt 存在风险的机器数
     */
    public Long getRiskMachineCnt() {
        return this.RiskMachineCnt;
    }

    /**
     * Set 存在风险的机器数
     * @param RiskMachineCnt 存在风险的机器数
     */
    public void setRiskMachineCnt(Long RiskMachineCnt) {
        this.RiskMachineCnt = RiskMachineCnt;
    }

    /**
     * Get 比较昨日风险机器数 
     * @return CompareYesterdayRiskMachineCnt 比较昨日风险机器数
     */
    public Long getCompareYesterdayRiskMachineCnt() {
        return this.CompareYesterdayRiskMachineCnt;
    }

    /**
     * Set 比较昨日风险机器数
     * @param CompareYesterdayRiskMachineCnt 比较昨日风险机器数
     */
    public void setCompareYesterdayRiskMachineCnt(Long CompareYesterdayRiskMachineCnt) {
        this.CompareYesterdayRiskMachineCnt = CompareYesterdayRiskMachineCnt;
    }

    /**
     * Get 比较昨日未防护机器数 
     * @return CompareYesterdayNotProtectMachineCnt 比较昨日未防护机器数
     */
    public Long getCompareYesterdayNotProtectMachineCnt() {
        return this.CompareYesterdayNotProtectMachineCnt;
    }

    /**
     * Set 比较昨日未防护机器数
     * @param CompareYesterdayNotProtectMachineCnt 比较昨日未防护机器数
     */
    public void setCompareYesterdayNotProtectMachineCnt(Long CompareYesterdayNotProtectMachineCnt) {
        this.CompareYesterdayNotProtectMachineCnt = CompareYesterdayNotProtectMachineCnt;
    }

    /**
     * Get 比较昨日即将到期的机器数 
     * @return CompareYesterdayDeadlineMachineCnt 比较昨日即将到期的机器数
     */
    public Long getCompareYesterdayDeadlineMachineCnt() {
        return this.CompareYesterdayDeadlineMachineCnt;
    }

    /**
     * Set 比较昨日即将到期的机器数
     * @param CompareYesterdayDeadlineMachineCnt 比较昨日即将到期的机器数
     */
    public void setCompareYesterdayDeadlineMachineCnt(Long CompareYesterdayDeadlineMachineCnt) {
        this.CompareYesterdayDeadlineMachineCnt = CompareYesterdayDeadlineMachineCnt;
    }

    /**
     * Get 即将到期的机器数 
     * @return DeadlineMachineCnt 即将到期的机器数
     */
    public Long getDeadlineMachineCnt() {
        return this.DeadlineMachineCnt;
    }

    /**
     * Set 即将到期的机器数
     * @param DeadlineMachineCnt 即将到期的机器数
     */
    public void setDeadlineMachineCnt(Long DeadlineMachineCnt) {
        this.DeadlineMachineCnt = DeadlineMachineCnt;
    }

    /**
     * Get 未防护机器数 
     * @return NotProtectMachineCnt 未防护机器数
     */
    public Long getNotProtectMachineCnt() {
        return this.NotProtectMachineCnt;
    }

    /**
     * Set 未防护机器数
     * @param NotProtectMachineCnt 未防护机器数
     */
    public void setNotProtectMachineCnt(Long NotProtectMachineCnt) {
        this.NotProtectMachineCnt = NotProtectMachineCnt;
    }

    /**
     * Get 已防护普惠版机器数（Lighthouse机器） 
     * @return LHGeneralDiscountCnt 已防护普惠版机器数（Lighthouse机器）
     */
    public Long getLHGeneralDiscountCnt() {
        return this.LHGeneralDiscountCnt;
    }

    /**
     * Set 已防护普惠版机器数（Lighthouse机器）
     * @param LHGeneralDiscountCnt 已防护普惠版机器数（Lighthouse机器）
     */
    public void setLHGeneralDiscountCnt(Long LHGeneralDiscountCnt) {
        this.LHGeneralDiscountCnt = LHGeneralDiscountCnt;
    }

    /**
     * Get 比较昨日新增的主机数 
     * @return CompareYesterdayMachineCnt 比较昨日新增的主机数
     */
    public Long getCompareYesterdayMachineCnt() {
        return this.CompareYesterdayMachineCnt;
    }

    /**
     * Set 比较昨日新增的主机数
     * @param CompareYesterdayMachineCnt 比较昨日新增的主机数
     */
    public void setCompareYesterdayMachineCnt(Long CompareYesterdayMachineCnt) {
        this.CompareYesterdayMachineCnt = CompareYesterdayMachineCnt;
    }

    /**
     * Get 自动清理时间,最大720小时,最小0, 默认0 ,0=关闭 
     * @return MachineDestroyAfterOfflineHours 自动清理时间,最大720小时,最小0, 默认0 ,0=关闭
     */
    public Long getMachineDestroyAfterOfflineHours() {
        return this.MachineDestroyAfterOfflineHours;
    }

    /**
     * Set 自动清理时间,最大720小时,最小0, 默认0 ,0=关闭
     * @param MachineDestroyAfterOfflineHours 自动清理时间,最大720小时,最小0, 默认0 ,0=关闭
     */
    public void setMachineDestroyAfterOfflineHours(Long MachineDestroyAfterOfflineHours) {
        this.MachineDestroyAfterOfflineHours = MachineDestroyAfterOfflineHours;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

