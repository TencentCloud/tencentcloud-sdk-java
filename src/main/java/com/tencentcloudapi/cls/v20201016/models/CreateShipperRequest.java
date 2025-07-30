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

public class CreateShipperRequest extends AbstractModel {

    /**
    * 创建的投递规则所属的日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 投递规则投递的新的目录前缀。
- 仅支持0-9A-Za-z-_/
- 最大支持256个字符
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 投递规则的名字。最大支持255个字符
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * 投递的时间间隔，单位 秒，默认300，范围 300-900
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 投递的文件的最大值，单位 MB，默认256，范围 5-256
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * 投递日志的分区规则，支持strftime的时间格式表示
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * 投递日志的压缩配置
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * 投递日志的内容格式配置
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * 投递数据范围的开始时间点（秒级时间戳），不能超出日志主题的生命周期起点。
如果用户不填写，默认为用户新建投递任务的时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 投递数据范围的结束时间点（秒级时间戳），不能填写未来时间。
如果用户不填写，默认为持续投递，即无限。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 对象存储类型，默认值为 STANDARD。枚举值请参见[ 存储类型概述](https://cloud.tencent.com/document/product/436/33417) 文档。
参考值有：

- STANDARD：标准存储
- STANDARD_IA：低频存储
- ARCHIVE：归档存储
- DEEP_ARCHIVE：深度归档存储
- MAZ_STANDARD：标准存储（多 AZ）
- MAZ_STANDARD_IA：低频存储（多 AZ）
- INTELLIGENT_TIERING：智能分层存储
- MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get 创建的投递规则所属的日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 创建的投递规则所属的日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 创建的投递规则所属的日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 创建的投递规则所属的日志主题Id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get 投递规则投递的新的目录前缀。
- 仅支持0-9A-Za-z-_/
- 最大支持256个字符 
     * @return Prefix 投递规则投递的新的目录前缀。
- 仅支持0-9A-Za-z-_/
- 最大支持256个字符
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 投递规则投递的新的目录前缀。
- 仅支持0-9A-Za-z-_/
- 最大支持256个字符
     * @param Prefix 投递规则投递的新的目录前缀。
- 仅支持0-9A-Za-z-_/
- 最大支持256个字符
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 投递规则的名字。最大支持255个字符 
     * @return ShipperName 投递规则的名字。最大支持255个字符
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set 投递规则的名字。最大支持255个字符
     * @param ShipperName 投递规则的名字。最大支持255个字符
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get 投递的时间间隔，单位 秒，默认300，范围 300-900 
     * @return Interval 投递的时间间隔，单位 秒，默认300，范围 300-900
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 投递的时间间隔，单位 秒，默认300，范围 300-900
     * @param Interval 投递的时间间隔，单位 秒，默认300，范围 300-900
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 投递的文件的最大值，单位 MB，默认256，范围 5-256 
     * @return MaxSize 投递的文件的最大值，单位 MB，默认256，范围 5-256
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 投递的文件的最大值，单位 MB，默认256，范围 5-256
     * @param MaxSize 投递的文件的最大值，单位 MB，默认256，范围 5-256
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递 
     * @return FilterRules 投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set 投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递
     * @param FilterRules 投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get 投递日志的分区规则，支持strftime的时间格式表示 
     * @return Partition 投递日志的分区规则，支持strftime的时间格式表示
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 投递日志的分区规则，支持strftime的时间格式表示
     * @param Partition 投递日志的分区规则，支持strftime的时间格式表示
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 投递日志的压缩配置 
     * @return Compress 投递日志的压缩配置
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set 投递日志的压缩配置
     * @param Compress 投递日志的压缩配置
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 投递日志的内容格式配置 
     * @return Content 投递日志的内容格式配置
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set 投递日志的内容格式配置
     * @param Content 投递日志的内容格式配置
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名） 
     * @return FilenameMode 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     * @param FilenameMode 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get 投递数据范围的开始时间点（秒级时间戳），不能超出日志主题的生命周期起点。
如果用户不填写，默认为用户新建投递任务的时间。 
     * @return StartTime 投递数据范围的开始时间点（秒级时间戳），不能超出日志主题的生命周期起点。
如果用户不填写，默认为用户新建投递任务的时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 投递数据范围的开始时间点（秒级时间戳），不能超出日志主题的生命周期起点。
如果用户不填写，默认为用户新建投递任务的时间。
     * @param StartTime 投递数据范围的开始时间点（秒级时间戳），不能超出日志主题的生命周期起点。
如果用户不填写，默认为用户新建投递任务的时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 投递数据范围的结束时间点（秒级时间戳），不能填写未来时间。
如果用户不填写，默认为持续投递，即无限。 
     * @return EndTime 投递数据范围的结束时间点（秒级时间戳），不能填写未来时间。
如果用户不填写，默认为持续投递，即无限。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 投递数据范围的结束时间点（秒级时间戳），不能填写未来时间。
如果用户不填写，默认为持续投递，即无限。
     * @param EndTime 投递数据范围的结束时间点（秒级时间戳），不能填写未来时间。
如果用户不填写，默认为持续投递，即无限。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 对象存储类型，默认值为 STANDARD。枚举值请参见[ 存储类型概述](https://cloud.tencent.com/document/product/436/33417) 文档。
参考值有：

- STANDARD：标准存储
- STANDARD_IA：低频存储
- ARCHIVE：归档存储
- DEEP_ARCHIVE：深度归档存储
- MAZ_STANDARD：标准存储（多 AZ）
- MAZ_STANDARD_IA：低频存储（多 AZ）
- INTELLIGENT_TIERING：智能分层存储
- MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ） 
     * @return StorageType 对象存储类型，默认值为 STANDARD。枚举值请参见[ 存储类型概述](https://cloud.tencent.com/document/product/436/33417) 文档。
参考值有：

- STANDARD：标准存储
- STANDARD_IA：低频存储
- ARCHIVE：归档存储
- DEEP_ARCHIVE：深度归档存储
- MAZ_STANDARD：标准存储（多 AZ）
- MAZ_STANDARD_IA：低频存储（多 AZ）
- INTELLIGENT_TIERING：智能分层存储
- MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 对象存储类型，默认值为 STANDARD。枚举值请参见[ 存储类型概述](https://cloud.tencent.com/document/product/436/33417) 文档。
参考值有：

- STANDARD：标准存储
- STANDARD_IA：低频存储
- ARCHIVE：归档存储
- DEEP_ARCHIVE：深度归档存储
- MAZ_STANDARD：标准存储（多 AZ）
- MAZ_STANDARD_IA：低频存储（多 AZ）
- INTELLIGENT_TIERING：智能分层存储
- MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）
     * @param StorageType 对象存储类型，默认值为 STANDARD。枚举值请参见[ 存储类型概述](https://cloud.tencent.com/document/product/436/33417) 文档。
参考值有：

- STANDARD：标准存储
- STANDARD_IA：低频存储
- ARCHIVE：归档存储
- DEEP_ARCHIVE：深度归档存储
- MAZ_STANDARD：标准存储（多 AZ）
- MAZ_STANDARD_IA：低频存储（多 AZ）
- INTELLIGENT_TIERING：智能分层存储
- MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public CreateShipperRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateShipperRequest(CreateShipperRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.ShipperName != null) {
            this.ShipperName = new String(source.ShipperName);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRuleInfo[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRuleInfo(source.FilterRules[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Compress != null) {
            this.Compress = new CompressInfo(source.Compress);
        }
        if (source.Content != null) {
            this.Content = new ContentInfo(source.Content);
        }
        if (source.FilenameMode != null) {
            this.FilenameMode = new Long(source.FilenameMode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

