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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageDetailsRequest extends AbstractModel {

    /**
    * 起始时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，需大于开始日期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 统计时间粒度，有效值：
<li>Minute：以5分钟为粒度。</li>
<li>Day：以天为粒度。</li>
默认按时间跨度决定，小于等于1天以5分钟为粒度，大于1天则以天为粒度。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 查询的存储类型，有效值：
<li>TotalStorage：存储总量，标准、低频、归档和深度归档存储量之和，不含提前删除量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
<li>ArchiveStorage：归档存储。</li>
<li>DeepArchiveStorage：深度归档存储。</li>
<li>DeletedInfrequentStorage：低频存储提前删除量。</li>
<li>DeletedArchiveStorage：归档提前删除量。</li>
<li>DeletedDeepArchiveStorage：深度归档提前删除量。</li>
<li>ArchiveStandardRetrieval：归档标准取回量。</li>
<li>ArchiveExpeditedRetrieval：归档快速取回量。</li>
<li>ArchiveBulkRetrieval：归档批量取回量。</li>
<li>DeepArchiveStandardRetrieval：深度归档标准取回量。</li>
<li>DeepArchiveBulkRetrieval：深度归档批量取回量。</li>
<li>InfrequentRetrieval：低频存储取回量。</li>
默认值为 TotalStorage。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 查询的存储区域，有效值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
默认值为 Chinese Mainland。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 起始时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartTime 起始时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartTime 起始时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，需大于开始日期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return EndTime 结束时间，需大于开始日期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，需大于开始日期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param EndTime 结束时间，需大于开始日期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 统计时间粒度，有效值：
<li>Minute：以5分钟为粒度。</li>
<li>Day：以天为粒度。</li>
默认按时间跨度决定，小于等于1天以5分钟为粒度，大于1天则以天为粒度。 
     * @return Interval 统计时间粒度，有效值：
<li>Minute：以5分钟为粒度。</li>
<li>Day：以天为粒度。</li>
默认按时间跨度决定，小于等于1天以5分钟为粒度，大于1天则以天为粒度。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 统计时间粒度，有效值：
<li>Minute：以5分钟为粒度。</li>
<li>Day：以天为粒度。</li>
默认按时间跨度决定，小于等于1天以5分钟为粒度，大于1天则以天为粒度。
     * @param Interval 统计时间粒度，有效值：
<li>Minute：以5分钟为粒度。</li>
<li>Day：以天为粒度。</li>
默认按时间跨度决定，小于等于1天以5分钟为粒度，大于1天则以天为粒度。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 查询的存储类型，有效值：
<li>TotalStorage：存储总量，标准、低频、归档和深度归档存储量之和，不含提前删除量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
<li>ArchiveStorage：归档存储。</li>
<li>DeepArchiveStorage：深度归档存储。</li>
<li>DeletedInfrequentStorage：低频存储提前删除量。</li>
<li>DeletedArchiveStorage：归档提前删除量。</li>
<li>DeletedDeepArchiveStorage：深度归档提前删除量。</li>
<li>ArchiveStandardRetrieval：归档标准取回量。</li>
<li>ArchiveExpeditedRetrieval：归档快速取回量。</li>
<li>ArchiveBulkRetrieval：归档批量取回量。</li>
<li>DeepArchiveStandardRetrieval：深度归档标准取回量。</li>
<li>DeepArchiveBulkRetrieval：深度归档批量取回量。</li>
<li>InfrequentRetrieval：低频存储取回量。</li>
默认值为 TotalStorage。 
     * @return StorageType 查询的存储类型，有效值：
<li>TotalStorage：存储总量，标准、低频、归档和深度归档存储量之和，不含提前删除量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
<li>ArchiveStorage：归档存储。</li>
<li>DeepArchiveStorage：深度归档存储。</li>
<li>DeletedInfrequentStorage：低频存储提前删除量。</li>
<li>DeletedArchiveStorage：归档提前删除量。</li>
<li>DeletedDeepArchiveStorage：深度归档提前删除量。</li>
<li>ArchiveStandardRetrieval：归档标准取回量。</li>
<li>ArchiveExpeditedRetrieval：归档快速取回量。</li>
<li>ArchiveBulkRetrieval：归档批量取回量。</li>
<li>DeepArchiveStandardRetrieval：深度归档标准取回量。</li>
<li>DeepArchiveBulkRetrieval：深度归档批量取回量。</li>
<li>InfrequentRetrieval：低频存储取回量。</li>
默认值为 TotalStorage。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 查询的存储类型，有效值：
<li>TotalStorage：存储总量，标准、低频、归档和深度归档存储量之和，不含提前删除量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
<li>ArchiveStorage：归档存储。</li>
<li>DeepArchiveStorage：深度归档存储。</li>
<li>DeletedInfrequentStorage：低频存储提前删除量。</li>
<li>DeletedArchiveStorage：归档提前删除量。</li>
<li>DeletedDeepArchiveStorage：深度归档提前删除量。</li>
<li>ArchiveStandardRetrieval：归档标准取回量。</li>
<li>ArchiveExpeditedRetrieval：归档快速取回量。</li>
<li>ArchiveBulkRetrieval：归档批量取回量。</li>
<li>DeepArchiveStandardRetrieval：深度归档标准取回量。</li>
<li>DeepArchiveBulkRetrieval：深度归档批量取回量。</li>
<li>InfrequentRetrieval：低频存储取回量。</li>
默认值为 TotalStorage。
     * @param StorageType 查询的存储类型，有效值：
<li>TotalStorage：存储总量，标准、低频、归档和深度归档存储量之和，不含提前删除量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
<li>ArchiveStorage：归档存储。</li>
<li>DeepArchiveStorage：深度归档存储。</li>
<li>DeletedInfrequentStorage：低频存储提前删除量。</li>
<li>DeletedArchiveStorage：归档提前删除量。</li>
<li>DeletedDeepArchiveStorage：深度归档提前删除量。</li>
<li>ArchiveStandardRetrieval：归档标准取回量。</li>
<li>ArchiveExpeditedRetrieval：归档快速取回量。</li>
<li>ArchiveBulkRetrieval：归档批量取回量。</li>
<li>DeepArchiveStandardRetrieval：深度归档标准取回量。</li>
<li>DeepArchiveBulkRetrieval：深度归档批量取回量。</li>
<li>InfrequentRetrieval：低频存储取回量。</li>
默认值为 TotalStorage。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 查询的存储区域，有效值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
默认值为 Chinese Mainland。 
     * @return Area 查询的存储区域，有效值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
默认值为 Chinese Mainland。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 查询的存储区域，有效值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
默认值为 Chinese Mainland。
     * @param Area 查询的存储区域，有效值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
默认值为 Chinese Mainland。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeStorageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageDetailsRequest(DescribeStorageDetailsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

