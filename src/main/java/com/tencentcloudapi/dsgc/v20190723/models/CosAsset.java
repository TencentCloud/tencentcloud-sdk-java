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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAsset extends AbstractModel {

    /**
    * 桶的个数
    */
    @SerializedName("BucketNums")
    @Expose
    private Long BucketNums;

    /**
    * 敏感桶的个数
    */
    @SerializedName("SensitiveBucketNums")
    @Expose
    private Long SensitiveBucketNums;

    /**
    * 文件个数
    */
    @SerializedName("FileNums")
    @Expose
    private Long FileNums;

    /**
    * 敏感文件的个数
    */
    @SerializedName("SensitiveFileNums")
    @Expose
    private Long SensitiveFileNums;

    /**
     * Get 桶的个数 
     * @return BucketNums 桶的个数
     */
    public Long getBucketNums() {
        return this.BucketNums;
    }

    /**
     * Set 桶的个数
     * @param BucketNums 桶的个数
     */
    public void setBucketNums(Long BucketNums) {
        this.BucketNums = BucketNums;
    }

    /**
     * Get 敏感桶的个数 
     * @return SensitiveBucketNums 敏感桶的个数
     */
    public Long getSensitiveBucketNums() {
        return this.SensitiveBucketNums;
    }

    /**
     * Set 敏感桶的个数
     * @param SensitiveBucketNums 敏感桶的个数
     */
    public void setSensitiveBucketNums(Long SensitiveBucketNums) {
        this.SensitiveBucketNums = SensitiveBucketNums;
    }

    /**
     * Get 文件个数 
     * @return FileNums 文件个数
     */
    public Long getFileNums() {
        return this.FileNums;
    }

    /**
     * Set 文件个数
     * @param FileNums 文件个数
     */
    public void setFileNums(Long FileNums) {
        this.FileNums = FileNums;
    }

    /**
     * Get 敏感文件的个数 
     * @return SensitiveFileNums 敏感文件的个数
     */
    public Long getSensitiveFileNums() {
        return this.SensitiveFileNums;
    }

    /**
     * Set 敏感文件的个数
     * @param SensitiveFileNums 敏感文件的个数
     */
    public void setSensitiveFileNums(Long SensitiveFileNums) {
        this.SensitiveFileNums = SensitiveFileNums;
    }

    public CosAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAsset(CosAsset source) {
        if (source.BucketNums != null) {
            this.BucketNums = new Long(source.BucketNums);
        }
        if (source.SensitiveBucketNums != null) {
            this.SensitiveBucketNums = new Long(source.SensitiveBucketNums);
        }
        if (source.FileNums != null) {
            this.FileNums = new Long(source.FileNums);
        }
        if (source.SensitiveFileNums != null) {
            this.SensitiveFileNums = new Long(source.SensitiveFileNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketNums", this.BucketNums);
        this.setParamSimple(map, prefix + "SensitiveBucketNums", this.SensitiveBucketNums);
        this.setParamSimple(map, prefix + "FileNums", this.FileNums);
        this.setParamSimple(map, prefix + "SensitiveFileNums", this.SensitiveFileNums);

    }
}

