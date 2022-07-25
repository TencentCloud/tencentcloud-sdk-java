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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosParam extends AbstractModel{

    /**
    * cos 存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 地域代码
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 对象名称
    */
    @SerializedName("ObjectKey")
    @Expose
    private String ObjectKey;

    /**
    * 汇聚消息量的大小（单位：MB)
    */
    @SerializedName("AggregateBatchSize")
    @Expose
    private Long AggregateBatchSize;

    /**
    * 汇聚的时间间隔（单位：小时）
    */
    @SerializedName("AggregateInterval")
    @Expose
    private Long AggregateInterval;

    /**
    * 消息汇聚后的文件格式（支持csv, json）
    */
    @SerializedName("FormatOutputType")
    @Expose
    private String FormatOutputType;

    /**
    * 转储的对象目录前缀
    */
    @SerializedName("ObjectKeyPrefix")
    @Expose
    private String ObjectKeyPrefix;

    /**
    * 根据strptime 时间格式化的分区格式
    */
    @SerializedName("DirectoryTimeFormat")
    @Expose
    private String DirectoryTimeFormat;

    /**
     * Get cos 存储桶名称 
     * @return BucketName cos 存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set cos 存储桶名称
     * @param BucketName cos 存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 地域代码 
     * @return Region 地域代码
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域代码
     * @param Region 地域代码
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 对象名称 
     * @return ObjectKey 对象名称
     */
    public String getObjectKey() {
        return this.ObjectKey;
    }

    /**
     * Set 对象名称
     * @param ObjectKey 对象名称
     */
    public void setObjectKey(String ObjectKey) {
        this.ObjectKey = ObjectKey;
    }

    /**
     * Get 汇聚消息量的大小（单位：MB) 
     * @return AggregateBatchSize 汇聚消息量的大小（单位：MB)
     */
    public Long getAggregateBatchSize() {
        return this.AggregateBatchSize;
    }

    /**
     * Set 汇聚消息量的大小（单位：MB)
     * @param AggregateBatchSize 汇聚消息量的大小（单位：MB)
     */
    public void setAggregateBatchSize(Long AggregateBatchSize) {
        this.AggregateBatchSize = AggregateBatchSize;
    }

    /**
     * Get 汇聚的时间间隔（单位：小时） 
     * @return AggregateInterval 汇聚的时间间隔（单位：小时）
     */
    public Long getAggregateInterval() {
        return this.AggregateInterval;
    }

    /**
     * Set 汇聚的时间间隔（单位：小时）
     * @param AggregateInterval 汇聚的时间间隔（单位：小时）
     */
    public void setAggregateInterval(Long AggregateInterval) {
        this.AggregateInterval = AggregateInterval;
    }

    /**
     * Get 消息汇聚后的文件格式（支持csv, json） 
     * @return FormatOutputType 消息汇聚后的文件格式（支持csv, json）
     */
    public String getFormatOutputType() {
        return this.FormatOutputType;
    }

    /**
     * Set 消息汇聚后的文件格式（支持csv, json）
     * @param FormatOutputType 消息汇聚后的文件格式（支持csv, json）
     */
    public void setFormatOutputType(String FormatOutputType) {
        this.FormatOutputType = FormatOutputType;
    }

    /**
     * Get 转储的对象目录前缀 
     * @return ObjectKeyPrefix 转储的对象目录前缀
     */
    public String getObjectKeyPrefix() {
        return this.ObjectKeyPrefix;
    }

    /**
     * Set 转储的对象目录前缀
     * @param ObjectKeyPrefix 转储的对象目录前缀
     */
    public void setObjectKeyPrefix(String ObjectKeyPrefix) {
        this.ObjectKeyPrefix = ObjectKeyPrefix;
    }

    /**
     * Get 根据strptime 时间格式化的分区格式 
     * @return DirectoryTimeFormat 根据strptime 时间格式化的分区格式
     */
    public String getDirectoryTimeFormat() {
        return this.DirectoryTimeFormat;
    }

    /**
     * Set 根据strptime 时间格式化的分区格式
     * @param DirectoryTimeFormat 根据strptime 时间格式化的分区格式
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

