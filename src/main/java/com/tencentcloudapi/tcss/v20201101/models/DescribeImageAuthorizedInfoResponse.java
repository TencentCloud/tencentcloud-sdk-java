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

public class DescribeImageAuthorizedInfoResponse extends AbstractModel{

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

