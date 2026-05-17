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

public class DescribeCosIdentifyFileListRequest extends AbstractModel {

    /**
    * <p>存储桶名</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选项</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>0：没有识别结果 1：有识别结果</p>
    */
    @SerializedName("ResultStatus")
    @Expose
    private Long ResultStatus;

    /**
     * Get <p>存储桶名</p> 
     * @return BucketName <p>存储桶名</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>存储桶名</p>
     * @param BucketName <p>存储桶名</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>筛选项</p> 
     * @return Filter <p>筛选项</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>筛选项</p>
     * @param Filter <p>筛选项</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>0：没有识别结果 1：有识别结果</p> 
     * @return ResultStatus <p>0：没有识别结果 1：有识别结果</p>
     */
    public Long getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>0：没有识别结果 1：有识别结果</p>
     * @param ResultStatus <p>0：没有识别结果 1：有识别结果</p>
     */
    public void setResultStatus(Long ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    public DescribeCosIdentifyFileListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosIdentifyFileListRequest(DescribeCosIdentifyFileListRequest source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new Long(source.ResultStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);

    }
}

