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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAssetDataScanDetail extends AbstractModel {

    /**
    * <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>识别进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>最近扫描时间</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private Long LatestScanTime;

    /**
    * <p>识别失败信息</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * <p>识别结果分类详情</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

    /**
     * Get <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p> 
     * @return Status <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     * @param Status <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>识别进度</p> 
     * @return Progress <p>识别进度</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>识别进度</p>
     * @param Progress <p>识别进度</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>最近扫描时间</p> 
     * @return LatestScanTime <p>最近扫描时间</p>
     */
    public Long getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近扫描时间</p>
     * @param LatestScanTime <p>最近扫描时间</p>
     */
    public void setLatestScanTime(Long LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>识别失败信息</p> 
     * @return ErrorInfo <p>识别失败信息</p>
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>识别失败信息</p>
     * @param ErrorInfo <p>识别失败信息</p>
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>识别结果分类详情</p> 
     * @return CategoryDetails <p>识别结果分类详情</p>
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>识别结果分类详情</p>
     * @param CategoryDetails <p>识别结果分类详情</p>
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    public CosAssetDataScanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetDataScanDetail(CosAssetDataScanDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new Long(source.LatestScanTime);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);

    }
}

