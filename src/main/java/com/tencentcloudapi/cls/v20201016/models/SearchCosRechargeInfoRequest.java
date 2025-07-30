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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCosRechargeInfoRequest extends AbstractModel {

    /**
    * 日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * COS导入任务名称,最大支持128个字节。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 压缩模式:   "", "gzip", "lzop", "snappy"。  默认："" 不压缩
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
     * Get 日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。 
     * @return LogsetId 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     * @param LogsetId 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get COS导入任务名称,最大支持128个字节。 
     * @return Name COS导入任务名称,最大支持128个字节。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS导入任务名称,最大支持128个字节。
     * @param Name COS导入任务名称,最大支持128个字节。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。 
     * @return Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
     * @param Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。 
     * @return BucketRegion COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     * @param BucketRegion COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。 
     * @return Prefix COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     * @param Prefix COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 压缩模式:   "", "gzip", "lzop", "snappy"。  默认："" 不压缩 
     * @return Compress 压缩模式:   "", "gzip", "lzop", "snappy"。  默认："" 不压缩
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set 压缩模式:   "", "gzip", "lzop", "snappy"。  默认："" 不压缩
     * @param Compress 压缩模式:   "", "gzip", "lzop", "snappy"。  默认："" 不压缩
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    public SearchCosRechargeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCosRechargeInfoRequest(SearchCosRechargeInfoRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);

    }
}

