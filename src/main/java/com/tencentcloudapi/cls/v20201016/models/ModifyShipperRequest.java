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

public class ModifyShipperRequest extends AbstractModel {

    /**
    * <p>投递规则Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/58745">获取投递任务列表</a>获取ShipperId。</li></ul>
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * <p>COS存储桶，详见产品支持的<a href="https://cloud.tencent.com/document/product/436/13312">存储桶命名规范</a>。    </p><ul><li>通过<a href="https://cloud.tencent.com/document/product/436/8291">GET Service（List Buckets）</a>获取COS存储桶。</li></ul>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>投递规则投递的新的目录前缀。</p><ul><li>仅支持0-9A-Za-z-_/</li><li>最大支持256个字符</li></ul>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>投递规则的开关状态。true：开启投递任务；false：关闭投递任务。</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>投递规则的名字</p>
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * <p>投递的时间间隔，单位 秒，默认300，范围 300-900</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>投递的文件的最大值，单位 MB，默认256，范围 5-256</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递</p>
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * <p>投递日志的分区规则，支持strftime的时间格式表示</p>
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * <p>投递日志的压缩配置</p>
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * <p>投递日志的内容格式配置</p>
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * <p>投递文件命名配置，0：随机数命名，1：投递时间命名。</p>
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：</p><ul><li>STANDARD：标准存储</li><li>STANDARD_IA：低频存储</li><li>ARCHIVE：归档存储</li><li>DEEP_ARCHIVE：深度归档存储</li><li>MAZ_STANDARD：标准存储（多 AZ）</li><li>MAZ_STANDARD_IA：低频存储（多 AZ）</li><li>INTELLIGENT_TIERING：智能分层存储</li><li>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>外部ID</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>用于生成投递到COS 的文件路径中的时间变量</p><p>入参限制：支持下面时区列表</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>预过滤处理-对写入COS原始数据进行预过滤处理</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>投递规则Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/58745">获取投递任务列表</a>获取ShipperId。</li></ul> 
     * @return ShipperId <p>投递规则Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/58745">获取投递任务列表</a>获取ShipperId。</li></ul>
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set <p>投递规则Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/58745">获取投递任务列表</a>获取ShipperId。</li></ul>
     * @param ShipperId <p>投递规则Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/58745">获取投递任务列表</a>获取ShipperId。</li></ul>
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get <p>COS存储桶，详见产品支持的<a href="https://cloud.tencent.com/document/product/436/13312">存储桶命名规范</a>。    </p><ul><li>通过<a href="https://cloud.tencent.com/document/product/436/8291">GET Service（List Buckets）</a>获取COS存储桶。</li></ul> 
     * @return Bucket <p>COS存储桶，详见产品支持的<a href="https://cloud.tencent.com/document/product/436/13312">存储桶命名规范</a>。    </p><ul><li>通过<a href="https://cloud.tencent.com/document/product/436/8291">GET Service（List Buckets）</a>获取COS存储桶。</li></ul>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS存储桶，详见产品支持的<a href="https://cloud.tencent.com/document/product/436/13312">存储桶命名规范</a>。    </p><ul><li>通过<a href="https://cloud.tencent.com/document/product/436/8291">GET Service（List Buckets）</a>获取COS存储桶。</li></ul>
     * @param Bucket <p>COS存储桶，详见产品支持的<a href="https://cloud.tencent.com/document/product/436/13312">存储桶命名规范</a>。    </p><ul><li>通过<a href="https://cloud.tencent.com/document/product/436/8291">GET Service（List Buckets）</a>获取COS存储桶。</li></ul>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>投递规则投递的新的目录前缀。</p><ul><li>仅支持0-9A-Za-z-_/</li><li>最大支持256个字符</li></ul> 
     * @return Prefix <p>投递规则投递的新的目录前缀。</p><ul><li>仅支持0-9A-Za-z-_/</li><li>最大支持256个字符</li></ul>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>投递规则投递的新的目录前缀。</p><ul><li>仅支持0-9A-Za-z-_/</li><li>最大支持256个字符</li></ul>
     * @param Prefix <p>投递规则投递的新的目录前缀。</p><ul><li>仅支持0-9A-Za-z-_/</li><li>最大支持256个字符</li></ul>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>投递规则的开关状态。true：开启投递任务；false：关闭投递任务。</p> 
     * @return Status <p>投递规则的开关状态。true：开启投递任务；false：关闭投递任务。</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>投递规则的开关状态。true：开启投递任务；false：关闭投递任务。</p>
     * @param Status <p>投递规则的开关状态。true：开启投递任务；false：关闭投递任务。</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>投递规则的名字</p> 
     * @return ShipperName <p>投递规则的名字</p>
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set <p>投递规则的名字</p>
     * @param ShipperName <p>投递规则的名字</p>
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get <p>投递的时间间隔，单位 秒，默认300，范围 300-900</p> 
     * @return Interval <p>投递的时间间隔，单位 秒，默认300，范围 300-900</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>投递的时间间隔，单位 秒，默认300，范围 300-900</p>
     * @param Interval <p>投递的时间间隔，单位 秒，默认300，范围 300-900</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>投递的文件的最大值，单位 MB，默认256，范围 5-256</p> 
     * @return MaxSize <p>投递的文件的最大值，单位 MB，默认256，范围 5-256</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>投递的文件的最大值，单位 MB，默认256，范围 5-256</p>
     * @param MaxSize <p>投递的文件的最大值，单位 MB，默认256，范围 5-256</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递</p> 
     * @return FilterRules <p>投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递</p>
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set <p>投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递</p>
     * @param FilterRules <p>投递日志的过滤规则，匹配的日志进行投递，各rule之间是and关系，最多5个，数组为空则表示不过滤而全部投递</p>
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get <p>投递日志的分区规则，支持strftime的时间格式表示</p> 
     * @return Partition <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     * @param Partition <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>投递日志的压缩配置</p> 
     * @return Compress <p>投递日志的压缩配置</p>
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>投递日志的压缩配置</p>
     * @param Compress <p>投递日志的压缩配置</p>
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>投递日志的内容格式配置</p> 
     * @return Content <p>投递日志的内容格式配置</p>
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set <p>投递日志的内容格式配置</p>
     * @param Content <p>投递日志的内容格式配置</p>
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get <p>投递文件命名配置，0：随机数命名，1：投递时间命名。</p> 
     * @return FilenameMode <p>投递文件命名配置，0：随机数命名，1：投递时间命名。</p>
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set <p>投递文件命名配置，0：随机数命名，1：投递时间命名。</p>
     * @param FilenameMode <p>投递文件命名配置，0：随机数命名，1：投递时间命名。</p>
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：</p><ul><li>STANDARD：标准存储</li><li>STANDARD_IA：低频存储</li><li>ARCHIVE：归档存储</li><li>DEEP_ARCHIVE：深度归档存储</li><li>MAZ_STANDARD：标准存储（多 AZ）</li><li>MAZ_STANDARD_IA：低频存储（多 AZ）</li><li>INTELLIGENT_TIERING：智能分层存储</li><li>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</li></ul> 
     * @return StorageType <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：</p><ul><li>STANDARD：标准存储</li><li>STANDARD_IA：低频存储</li><li>ARCHIVE：归档存储</li><li>DEEP_ARCHIVE：深度归档存储</li><li>MAZ_STANDARD：标准存储（多 AZ）</li><li>MAZ_STANDARD_IA：低频存储（多 AZ）</li><li>INTELLIGENT_TIERING：智能分层存储</li><li>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：</p><ul><li>STANDARD：标准存储</li><li>STANDARD_IA：低频存储</li><li>ARCHIVE：归档存储</li><li>DEEP_ARCHIVE：深度归档存储</li><li>MAZ_STANDARD：标准存储（多 AZ）</li><li>MAZ_STANDARD_IA：低频存储（多 AZ）</li><li>INTELLIGENT_TIERING：智能分层存储</li><li>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</li></ul>
     * @param StorageType <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：</p><ul><li>STANDARD：标准存储</li><li>STANDARD_IA：低频存储</li><li>ARCHIVE：归档存储</li><li>DEEP_ARCHIVE：深度归档存储</li><li>MAZ_STANDARD：标准存储（多 AZ）</li><li>MAZ_STANDARD_IA：低频存储（多 AZ）</li><li>INTELLIGENT_TIERING：智能分层存储</li><li>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p> 
     * @return RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     * @param RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>外部ID</p> 
     * @return ExternalId <p>外部ID</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID</p>
     * @param ExternalId <p>外部ID</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>用于生成投递到COS 的文件路径中的时间变量</p><p>入参限制：支持下面时区列表</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul> 
     * @return TimeZone <p>用于生成投递到COS 的文件路径中的时间变量</p><p>入参限制：支持下面时区列表</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>用于生成投递到COS 的文件路径中的时间变量</p><p>入参限制：支持下面时区列表</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     * @param TimeZone <p>用于生成投递到COS 的文件路径中的时间变量</p><p>入参限制：支持下面时区列表</p><ul><li>GMT-12:00</li><li>GMT-11:00</li><li>GMT-10:00</li><li>GMT-09:30</li><li>GMT-09:00</li><li>GMT-08:00</li><li>GMT-07:00</li><li>GMT-06:00</li><li>GMT-05:00</li><li>GMT-04:00</li><li>GMT-03:30</li><li>GMT-03:00</li><li>GMT-02:00</li><li>GMT-01:00</li><li>GMT+00:00</li><li>GMT+01:00</li><li>GMT+02:00</li><li>GMT+03:30</li><li>GMT+04:00</li><li>GMT+04:30</li><li>GMT+05:00</li><li>GMT+05:30</li><li>GMT+05:45</li><li>GMT+06:00</li><li>GMT+06:30</li><li>GMT+07:00</li><li>GMT+08:00</li><li>GMT+09:00</li><li>GMT+09:30</li><li>GMT+10:00</li><li>GMT+10:30</li><li>GMT+11:00</li><li>GMT+11:30</li><li>GMT+12:00</li><li>GMT+12:45</li><li>GMT+13:00</li><li>GMT+14:00</li><li>UTC-11:00</li><li>UTC-10:00</li><li>UTC-09:00</li><li>UTC-08:00</li><li>UTC-12:00</li><li>UTC-07:00</li><li>UTC-06:00</li><li>UTC-05:00</li><li>UTC-04:30</li><li>UTC-04:00</li><li>UTC-03:30</li><li>UTC-03:00</li><li>UTC-02:00</li><li>UTC-01:00</li><li>UTC+00:00</li><li>UTC+01:00</li><li>UTC+02:00</li><li>UTC+03:00</li><li>UTC+03:30</li><li>UTC+04:00</li><li>UTC+04:30</li><li>UTC+05:00</li><li>UTC+05:45</li><li>UTC+06:00</li><li>UTC+06:30</li><li>UTC+07:00</li><li>UTC+08:00</li><li>UTC+09:00</li><li>UTC+09:30</li><li>UTC+10:00</li><li>UTC+11:00</li><li>UTC+12:00</li><li>UTC+13:00</li></ul>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>预过滤处理-对写入COS原始数据进行预过滤处理</p> 
     * @return DSLFilter <p>预过滤处理-对写入COS原始数据进行预过滤处理</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>预过滤处理-对写入COS原始数据进行预过滤处理</p>
     * @param DSLFilter <p>预过滤处理-对写入COS原始数据进行预过滤处理</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public ModifyShipperRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyShipperRequest(ModifyShipperRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
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
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

