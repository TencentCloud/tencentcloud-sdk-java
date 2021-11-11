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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchProductionResponse extends AbstractModel{

    /**
    * 量产数量。
    */
    @SerializedName("BatchCnt")
    @Expose
    private Long BatchCnt;

    /**
    * 烧录方式。
    */
    @SerializedName("BurnMethod")
    @Expose
    private Long BurnMethod;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 下载URL。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 生成方式。
    */
    @SerializedName("GenerationMethod")
    @Expose
    private Long GenerationMethod;

    /**
    * 上传URL。
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 量产数量。 
     * @return BatchCnt 量产数量。
     */
    public Long getBatchCnt() {
        return this.BatchCnt;
    }

    /**
     * Set 量产数量。
     * @param BatchCnt 量产数量。
     */
    public void setBatchCnt(Long BatchCnt) {
        this.BatchCnt = BatchCnt;
    }

    /**
     * Get 烧录方式。 
     * @return BurnMethod 烧录方式。
     */
    public Long getBurnMethod() {
        return this.BurnMethod;
    }

    /**
     * Set 烧录方式。
     * @param BurnMethod 烧录方式。
     */
    public void setBurnMethod(Long BurnMethod) {
        this.BurnMethod = BurnMethod;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 下载URL。 
     * @return DownloadUrl 下载URL。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载URL。
     * @param DownloadUrl 下载URL。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 生成方式。 
     * @return GenerationMethod 生成方式。
     */
    public Long getGenerationMethod() {
        return this.GenerationMethod;
    }

    /**
     * Set 生成方式。
     * @param GenerationMethod 生成方式。
     */
    public void setGenerationMethod(Long GenerationMethod) {
        this.GenerationMethod = GenerationMethod;
    }

    /**
     * Get 上传URL。 
     * @return UploadUrl 上传URL。
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 上传URL。
     * @param UploadUrl 上传URL。
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
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

    public DescribeBatchProductionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchProductionResponse(DescribeBatchProductionResponse source) {
        if (source.BatchCnt != null) {
            this.BatchCnt = new Long(source.BatchCnt);
        }
        if (source.BurnMethod != null) {
            this.BurnMethod = new Long(source.BurnMethod);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.GenerationMethod != null) {
            this.GenerationMethod = new Long(source.GenerationMethod);
        }
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchCnt", this.BatchCnt);
        this.setParamSimple(map, prefix + "BurnMethod", this.BurnMethod);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "GenerationMethod", this.GenerationMethod);
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

