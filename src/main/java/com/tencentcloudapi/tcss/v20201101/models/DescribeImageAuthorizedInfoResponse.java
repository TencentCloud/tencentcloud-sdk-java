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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAuthorizedInfoResponse extends AbstractModel {

    /**
    * 总共有效的镜像授权数
    */
    @SerializedName("TotalAuthorizedCnt")
    @Expose
    private Long TotalAuthorizedCnt;

    /**
    * 已使用镜像授权数
    */
    @SerializedName("UsedAuthorizedCnt")
    @Expose
    private Long UsedAuthorizedCnt;

    /**
    * 已开启扫描镜像数
    */
    @SerializedName("ScannedImageCnt")
    @Expose
    private Long ScannedImageCnt;

    /**
    * 未开启扫描镜像数
    */
    @SerializedName("NotScannedImageCnt")
    @Expose
    private Long NotScannedImageCnt;

    /**
    * 本地未开启扫描镜像数
    */
    @SerializedName("NotScannedLocalImageCnt")
    @Expose
    private Long NotScannedLocalImageCnt;

    /**
    * 试用镜像授权数
    */
    @SerializedName("TrialAuthorizedCnt")
    @Expose
    private Long TrialAuthorizedCnt;

    /**
    * 已使用试用镜像授权数
    */
    @SerializedName("UsedTrialAuthorizedCnt")
    @Expose
    private Long UsedTrialAuthorizedCnt;

    /**
    * 已购镜像授权数
    */
    @SerializedName("PurchasedAuthorizedCnt")
    @Expose
    private Long PurchasedAuthorizedCnt;

    /**
    * 已使用已购镜像授权数
    */
    @SerializedName("UsedPurchasedAuthorizedCnt")
    @Expose
    private Long UsedPurchasedAuthorizedCnt;

    /**
    * 是否可免费领取镜像授权数
    */
    @SerializedName("CanApplyFreeImageAuthorize")
    @Expose
    private Boolean CanApplyFreeImageAuthorize;

    /**
    * 镜像扫描计费信息
    */
    @SerializedName("ImageScanInquireInfo")
    @Expose
    private ImageScanInquireInfo ImageScanInquireInfo;

    /**
    * 重复镜像数(本地镜像和仓库镜像)
    */
    @SerializedName("RepeatImageIdCnt")
    @Expose
    private Long RepeatImageIdCnt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总共有效的镜像授权数 
     * @return TotalAuthorizedCnt 总共有效的镜像授权数
     */
    public Long getTotalAuthorizedCnt() {
        return this.TotalAuthorizedCnt;
    }

    /**
     * Set 总共有效的镜像授权数
     * @param TotalAuthorizedCnt 总共有效的镜像授权数
     */
    public void setTotalAuthorizedCnt(Long TotalAuthorizedCnt) {
        this.TotalAuthorizedCnt = TotalAuthorizedCnt;
    }

    /**
     * Get 已使用镜像授权数 
     * @return UsedAuthorizedCnt 已使用镜像授权数
     */
    public Long getUsedAuthorizedCnt() {
        return this.UsedAuthorizedCnt;
    }

    /**
     * Set 已使用镜像授权数
     * @param UsedAuthorizedCnt 已使用镜像授权数
     */
    public void setUsedAuthorizedCnt(Long UsedAuthorizedCnt) {
        this.UsedAuthorizedCnt = UsedAuthorizedCnt;
    }

    /**
     * Get 已开启扫描镜像数 
     * @return ScannedImageCnt 已开启扫描镜像数
     */
    public Long getScannedImageCnt() {
        return this.ScannedImageCnt;
    }

    /**
     * Set 已开启扫描镜像数
     * @param ScannedImageCnt 已开启扫描镜像数
     */
    public void setScannedImageCnt(Long ScannedImageCnt) {
        this.ScannedImageCnt = ScannedImageCnt;
    }

    /**
     * Get 未开启扫描镜像数 
     * @return NotScannedImageCnt 未开启扫描镜像数
     */
    public Long getNotScannedImageCnt() {
        return this.NotScannedImageCnt;
    }

    /**
     * Set 未开启扫描镜像数
     * @param NotScannedImageCnt 未开启扫描镜像数
     */
    public void setNotScannedImageCnt(Long NotScannedImageCnt) {
        this.NotScannedImageCnt = NotScannedImageCnt;
    }

    /**
     * Get 本地未开启扫描镜像数 
     * @return NotScannedLocalImageCnt 本地未开启扫描镜像数
     */
    public Long getNotScannedLocalImageCnt() {
        return this.NotScannedLocalImageCnt;
    }

    /**
     * Set 本地未开启扫描镜像数
     * @param NotScannedLocalImageCnt 本地未开启扫描镜像数
     */
    public void setNotScannedLocalImageCnt(Long NotScannedLocalImageCnt) {
        this.NotScannedLocalImageCnt = NotScannedLocalImageCnt;
    }

    /**
     * Get 试用镜像授权数 
     * @return TrialAuthorizedCnt 试用镜像授权数
     */
    public Long getTrialAuthorizedCnt() {
        return this.TrialAuthorizedCnt;
    }

    /**
     * Set 试用镜像授权数
     * @param TrialAuthorizedCnt 试用镜像授权数
     */
    public void setTrialAuthorizedCnt(Long TrialAuthorizedCnt) {
        this.TrialAuthorizedCnt = TrialAuthorizedCnt;
    }

    /**
     * Get 已使用试用镜像授权数 
     * @return UsedTrialAuthorizedCnt 已使用试用镜像授权数
     */
    public Long getUsedTrialAuthorizedCnt() {
        return this.UsedTrialAuthorizedCnt;
    }

    /**
     * Set 已使用试用镜像授权数
     * @param UsedTrialAuthorizedCnt 已使用试用镜像授权数
     */
    public void setUsedTrialAuthorizedCnt(Long UsedTrialAuthorizedCnt) {
        this.UsedTrialAuthorizedCnt = UsedTrialAuthorizedCnt;
    }

    /**
     * Get 已购镜像授权数 
     * @return PurchasedAuthorizedCnt 已购镜像授权数
     */
    public Long getPurchasedAuthorizedCnt() {
        return this.PurchasedAuthorizedCnt;
    }

    /**
     * Set 已购镜像授权数
     * @param PurchasedAuthorizedCnt 已购镜像授权数
     */
    public void setPurchasedAuthorizedCnt(Long PurchasedAuthorizedCnt) {
        this.PurchasedAuthorizedCnt = PurchasedAuthorizedCnt;
    }

    /**
     * Get 已使用已购镜像授权数 
     * @return UsedPurchasedAuthorizedCnt 已使用已购镜像授权数
     */
    public Long getUsedPurchasedAuthorizedCnt() {
        return this.UsedPurchasedAuthorizedCnt;
    }

    /**
     * Set 已使用已购镜像授权数
     * @param UsedPurchasedAuthorizedCnt 已使用已购镜像授权数
     */
    public void setUsedPurchasedAuthorizedCnt(Long UsedPurchasedAuthorizedCnt) {
        this.UsedPurchasedAuthorizedCnt = UsedPurchasedAuthorizedCnt;
    }

    /**
     * Get 是否可免费领取镜像授权数 
     * @return CanApplyFreeImageAuthorize 是否可免费领取镜像授权数
     */
    public Boolean getCanApplyFreeImageAuthorize() {
        return this.CanApplyFreeImageAuthorize;
    }

    /**
     * Set 是否可免费领取镜像授权数
     * @param CanApplyFreeImageAuthorize 是否可免费领取镜像授权数
     */
    public void setCanApplyFreeImageAuthorize(Boolean CanApplyFreeImageAuthorize) {
        this.CanApplyFreeImageAuthorize = CanApplyFreeImageAuthorize;
    }

    /**
     * Get 镜像扫描计费信息 
     * @return ImageScanInquireInfo 镜像扫描计费信息
     */
    public ImageScanInquireInfo getImageScanInquireInfo() {
        return this.ImageScanInquireInfo;
    }

    /**
     * Set 镜像扫描计费信息
     * @param ImageScanInquireInfo 镜像扫描计费信息
     */
    public void setImageScanInquireInfo(ImageScanInquireInfo ImageScanInquireInfo) {
        this.ImageScanInquireInfo = ImageScanInquireInfo;
    }

    /**
     * Get 重复镜像数(本地镜像和仓库镜像) 
     * @return RepeatImageIdCnt 重复镜像数(本地镜像和仓库镜像)
     */
    public Long getRepeatImageIdCnt() {
        return this.RepeatImageIdCnt;
    }

    /**
     * Set 重复镜像数(本地镜像和仓库镜像)
     * @param RepeatImageIdCnt 重复镜像数(本地镜像和仓库镜像)
     */
    public void setRepeatImageIdCnt(Long RepeatImageIdCnt) {
        this.RepeatImageIdCnt = RepeatImageIdCnt;
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

    public DescribeImageAuthorizedInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAuthorizedInfoResponse(DescribeImageAuthorizedInfoResponse source) {
        if (source.TotalAuthorizedCnt != null) {
            this.TotalAuthorizedCnt = new Long(source.TotalAuthorizedCnt);
        }
        if (source.UsedAuthorizedCnt != null) {
            this.UsedAuthorizedCnt = new Long(source.UsedAuthorizedCnt);
        }
        if (source.ScannedImageCnt != null) {
            this.ScannedImageCnt = new Long(source.ScannedImageCnt);
        }
        if (source.NotScannedImageCnt != null) {
            this.NotScannedImageCnt = new Long(source.NotScannedImageCnt);
        }
        if (source.NotScannedLocalImageCnt != null) {
            this.NotScannedLocalImageCnt = new Long(source.NotScannedLocalImageCnt);
        }
        if (source.TrialAuthorizedCnt != null) {
            this.TrialAuthorizedCnt = new Long(source.TrialAuthorizedCnt);
        }
        if (source.UsedTrialAuthorizedCnt != null) {
            this.UsedTrialAuthorizedCnt = new Long(source.UsedTrialAuthorizedCnt);
        }
        if (source.PurchasedAuthorizedCnt != null) {
            this.PurchasedAuthorizedCnt = new Long(source.PurchasedAuthorizedCnt);
        }
        if (source.UsedPurchasedAuthorizedCnt != null) {
            this.UsedPurchasedAuthorizedCnt = new Long(source.UsedPurchasedAuthorizedCnt);
        }
        if (source.CanApplyFreeImageAuthorize != null) {
            this.CanApplyFreeImageAuthorize = new Boolean(source.CanApplyFreeImageAuthorize);
        }
        if (source.ImageScanInquireInfo != null) {
            this.ImageScanInquireInfo = new ImageScanInquireInfo(source.ImageScanInquireInfo);
        }
        if (source.RepeatImageIdCnt != null) {
            this.RepeatImageIdCnt = new Long(source.RepeatImageIdCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalAuthorizedCnt", this.TotalAuthorizedCnt);
        this.setParamSimple(map, prefix + "UsedAuthorizedCnt", this.UsedAuthorizedCnt);
        this.setParamSimple(map, prefix + "ScannedImageCnt", this.ScannedImageCnt);
        this.setParamSimple(map, prefix + "NotScannedImageCnt", this.NotScannedImageCnt);
        this.setParamSimple(map, prefix + "NotScannedLocalImageCnt", this.NotScannedLocalImageCnt);
        this.setParamSimple(map, prefix + "TrialAuthorizedCnt", this.TrialAuthorizedCnt);
        this.setParamSimple(map, prefix + "UsedTrialAuthorizedCnt", this.UsedTrialAuthorizedCnt);
        this.setParamSimple(map, prefix + "PurchasedAuthorizedCnt", this.PurchasedAuthorizedCnt);
        this.setParamSimple(map, prefix + "UsedPurchasedAuthorizedCnt", this.UsedPurchasedAuthorizedCnt);
        this.setParamSimple(map, prefix + "CanApplyFreeImageAuthorize", this.CanApplyFreeImageAuthorize);
        this.setParamObj(map, prefix + "ImageScanInquireInfo.", this.ImageScanInquireInfo);
        this.setParamSimple(map, prefix + "RepeatImageIdCnt", this.RepeatImageIdCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

