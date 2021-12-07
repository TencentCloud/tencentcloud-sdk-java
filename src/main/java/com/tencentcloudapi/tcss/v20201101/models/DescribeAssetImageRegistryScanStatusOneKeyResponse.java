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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryScanStatusOneKeyResponse extends AbstractModel{

    /**
    * 镜像个数
    */
    @SerializedName("ImageTotal")
    @Expose
    private Long ImageTotal;

    /**
    * 扫描镜像个数
    */
    @SerializedName("ImageScanCnt")
    @Expose
    private Long ImageScanCnt;

    /**
    * 扫描进度列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageStatus")
    @Expose
    private ImageProgress [] ImageStatus;

    /**
    * 安全个数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 风险个数
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 总的扫描进度
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * 总的扫描状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 扫描剩余时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRemainTime")
    @Expose
    private Long ScanRemainTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像个数 
     * @return ImageTotal 镜像个数
     */
    public Long getImageTotal() {
        return this.ImageTotal;
    }

    /**
     * Set 镜像个数
     * @param ImageTotal 镜像个数
     */
    public void setImageTotal(Long ImageTotal) {
        this.ImageTotal = ImageTotal;
    }

    /**
     * Get 扫描镜像个数 
     * @return ImageScanCnt 扫描镜像个数
     */
    public Long getImageScanCnt() {
        return this.ImageScanCnt;
    }

    /**
     * Set 扫描镜像个数
     * @param ImageScanCnt 扫描镜像个数
     */
    public void setImageScanCnt(Long ImageScanCnt) {
        this.ImageScanCnt = ImageScanCnt;
    }

    /**
     * Get 扫描进度列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageStatus 扫描进度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageProgress [] getImageStatus() {
        return this.ImageStatus;
    }

    /**
     * Set 扫描进度列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageStatus 扫描进度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageStatus(ImageProgress [] ImageStatus) {
        this.ImageStatus = ImageStatus;
    }

    /**
     * Get 安全个数 
     * @return SuccessCount 安全个数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 安全个数
     * @param SuccessCount 安全个数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 风险个数 
     * @return RiskCount 风险个数
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险个数
     * @param RiskCount 风险个数
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 总的扫描进度 
     * @return Schedule 总的扫描进度
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 总的扫描进度
     * @param Schedule 总的扫描进度
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 总的扫描状态 
     * @return Status 总的扫描状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 总的扫描状态
     * @param Status 总的扫描状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 扫描剩余时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRemainTime 扫描剩余时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanRemainTime() {
        return this.ScanRemainTime;
    }

    /**
     * Set 扫描剩余时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRemainTime 扫描剩余时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRemainTime(Long ScanRemainTime) {
        this.ScanRemainTime = ScanRemainTime;
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

    public DescribeAssetImageRegistryScanStatusOneKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryScanStatusOneKeyResponse(DescribeAssetImageRegistryScanStatusOneKeyResponse source) {
        if (source.ImageTotal != null) {
            this.ImageTotal = new Long(source.ImageTotal);
        }
        if (source.ImageScanCnt != null) {
            this.ImageScanCnt = new Long(source.ImageScanCnt);
        }
        if (source.ImageStatus != null) {
            this.ImageStatus = new ImageProgress[source.ImageStatus.length];
            for (int i = 0; i < source.ImageStatus.length; i++) {
                this.ImageStatus[i] = new ImageProgress(source.ImageStatus[i]);
            }
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScanRemainTime != null) {
            this.ScanRemainTime = new Long(source.ScanRemainTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageTotal", this.ImageTotal);
        this.setParamSimple(map, prefix + "ImageScanCnt", this.ImageScanCnt);
        this.setParamArrayObj(map, prefix + "ImageStatus.", this.ImageStatus);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScanRemainTime", this.ScanRemainTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

