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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosParam extends AbstractModel {

    /**
    * <p>cos 存储桶名称</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>地域代码</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>对象名称</p>
    */
    @SerializedName("ObjectKey")
    @Expose
    private String ObjectKey;

    /**
    * <p>汇聚消息量的大小（单位：MB)</p>
    */
    @SerializedName("AggregateBatchSize")
    @Expose
    private Long AggregateBatchSize;

    /**
    * <p>汇聚的时间间隔（单位：小时）</p>
    */
    @SerializedName("AggregateInterval")
    @Expose
    private Long AggregateInterval;

    /**
    * <p>消息汇聚后的文件格式（支持csv, json）</p>
    */
    @SerializedName("FormatOutputType")
    @Expose
    private String FormatOutputType;

    /**
    * <p>转储的对象目录前缀</p>
    */
    @SerializedName("ObjectKeyPrefix")
    @Expose
    private String ObjectKeyPrefix;

    /**
    * <p>根据strptime 时间格式化的分区格式</p>
    */
    @SerializedName("DirectoryTimeFormat")
    @Expose
    private String DirectoryTimeFormat;

    /**
     * Get <p>cos 存储桶名称</p> 
     * @return BucketName <p>cos 存储桶名称</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>cos 存储桶名称</p>
     * @param BucketName <p>cos 存储桶名称</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>地域代码</p> 
     * @return Region <p>地域代码</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域代码</p>
     * @param Region <p>地域代码</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>对象名称</p> 
     * @return ObjectKey <p>对象名称</p>
     */
    public String getObjectKey() {
        return this.ObjectKey;
    }

    /**
     * Set <p>对象名称</p>
     * @param ObjectKey <p>对象名称</p>
     */
    public void setObjectKey(String ObjectKey) {
        this.ObjectKey = ObjectKey;
    }

    /**
     * Get <p>汇聚消息量的大小（单位：MB)</p> 
     * @return AggregateBatchSize <p>汇聚消息量的大小（单位：MB)</p>
     */
    public Long getAggregateBatchSize() {
        return this.AggregateBatchSize;
    }

    /**
     * Set <p>汇聚消息量的大小（单位：MB)</p>
     * @param AggregateBatchSize <p>汇聚消息量的大小（单位：MB)</p>
     */
    public void setAggregateBatchSize(Long AggregateBatchSize) {
        this.AggregateBatchSize = AggregateBatchSize;
    }

    /**
     * Get <p>汇聚的时间间隔（单位：小时）</p> 
     * @return AggregateInterval <p>汇聚的时间间隔（单位：小时）</p>
     */
    public Long getAggregateInterval() {
        return this.AggregateInterval;
    }

    /**
     * Set <p>汇聚的时间间隔（单位：小时）</p>
     * @param AggregateInterval <p>汇聚的时间间隔（单位：小时）</p>
     */
    public void setAggregateInterval(Long AggregateInterval) {
        this.AggregateInterval = AggregateInterval;
    }

    /**
     * Get <p>消息汇聚后的文件格式（支持csv, json）</p> 
     * @return FormatOutputType <p>消息汇聚后的文件格式（支持csv, json）</p>
     */
    public String getFormatOutputType() {
        return this.FormatOutputType;
    }

    /**
     * Set <p>消息汇聚后的文件格式（支持csv, json）</p>
     * @param FormatOutputType <p>消息汇聚后的文件格式（支持csv, json）</p>
     */
    public void setFormatOutputType(String FormatOutputType) {
        this.FormatOutputType = FormatOutputType;
    }

    /**
     * Get <p>转储的对象目录前缀</p> 
     * @return ObjectKeyPrefix <p>转储的对象目录前缀</p>
     */
    public String getObjectKeyPrefix() {
        return this.ObjectKeyPrefix;
    }

    /**
     * Set <p>转储的对象目录前缀</p>
     * @param ObjectKeyPrefix <p>转储的对象目录前缀</p>
     */
    public void setObjectKeyPrefix(String ObjectKeyPrefix) {
        this.ObjectKeyPrefix = ObjectKeyPrefix;
    }

    /**
     * Get <p>根据strptime 时间格式化的分区格式</p> 
     * @return DirectoryTimeFormat <p>根据strptime 时间格式化的分区格式</p>
     */
    public String getDirectoryTimeFormat() {
        return this.DirectoryTimeFormat;
    }

    /**
     * Set <p>根据strptime 时间格式化的分区格式</p>
     * @param DirectoryTimeFormat <p>根据strptime 时间格式化的分区格式</p>
     */
    public void setDirectoryTimeFormat(String DirectoryTimeFormat) {
        this.DirectoryTimeFormat = DirectoryTimeFormat;
    }

    public CosParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosParam(CosParam source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ObjectKey != null) {
            this.ObjectKey = new String(source.ObjectKey);
        }
        if (source.AggregateBatchSize != null) {
            this.AggregateBatchSize = new Long(source.AggregateBatchSize);
        }
        if (source.AggregateInterval != null) {
            this.AggregateInterval = new Long(source.AggregateInterval);
        }
        if (source.FormatOutputType != null) {
            this.FormatOutputType = new String(source.FormatOutputType);
        }
        if (source.ObjectKeyPrefix != null) {
            this.ObjectKeyPrefix = new String(source.ObjectKeyPrefix);
        }
        if (source.DirectoryTimeFormat != null) {
            this.DirectoryTimeFormat = new String(source.DirectoryTimeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ObjectKey", this.ObjectKey);
        this.setParamSimple(map, prefix + "AggregateBatchSize", this.AggregateBatchSize);
        this.setParamSimple(map, prefix + "AggregateInterval", this.AggregateInterval);
        this.setParamSimple(map, prefix + "FormatOutputType", this.FormatOutputType);
        this.setParamSimple(map, prefix + "ObjectKeyPrefix", this.ObjectKeyPrefix);
        this.setParamSimple(map, prefix + "DirectoryTimeFormat", this.DirectoryTimeFormat);

    }
}

