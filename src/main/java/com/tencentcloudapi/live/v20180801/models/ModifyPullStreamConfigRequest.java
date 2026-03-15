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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPullStreamConfigRequest extends AbstractModel {

    /**
    * <p>配置 ID。<br>获取来源：</p><ol><li>创建拉流配置接口CreatePullStreamConfig返回的配置 ID。</li><li>通过查询接口DescribePullStreamConfigs获取配置 ID。</li></ol>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>源 URL，用于拉流的地址。目前可支持直播流及点播文件。<br>注意：</p><ol><li>多个点播 URL 之间使用空格拼接。</li><li>目前上限支持10个 URL。</li><li>支持拉流文件格式：FLV，RTMP，HLS，MP4。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
    */
    @SerializedName("FromUrl")
    @Expose
    private String FromUrl;

    /**
    * <p>目的 URL，用于推流的地址，目前限制该目标地址为腾讯域名。</p><ol><li>仅支持 RTMP 协议。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * <p>区域 ID：<br>1-深圳。<br>2-上海。<br>3-天津。<br>4-中国香港。<br>如有改动，需同时传入IspId。</p>
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * <p>运营商 ID，<br>1：电信。<br>2：移动。<br>3：联通。<br>4：其他。<br>AreaId为4的时候，IspId只能为其他。如有改动，需同时传入AreaId。</p>
    */
    @SerializedName("IspId")
    @Expose
    private Long IspId;

    /**
    * <p>开始时间。<br>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，注意：</p><ol><li>结束时间必须大于开始时间；</li><li>结束时间和开始时间必须大于当前时间；</li><li>结束时间 和 开始时间 间隔必须小于七天。</li></ol><p>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>配置 ID。<br>获取来源：</p><ol><li>创建拉流配置接口CreatePullStreamConfig返回的配置 ID。</li><li>通过查询接口DescribePullStreamConfigs获取配置 ID。</li></ol> 
     * @return ConfigId <p>配置 ID。<br>获取来源：</p><ol><li>创建拉流配置接口CreatePullStreamConfig返回的配置 ID。</li><li>通过查询接口DescribePullStreamConfigs获取配置 ID。</li></ol>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>配置 ID。<br>获取来源：</p><ol><li>创建拉流配置接口CreatePullStreamConfig返回的配置 ID。</li><li>通过查询接口DescribePullStreamConfigs获取配置 ID。</li></ol>
     * @param ConfigId <p>配置 ID。<br>获取来源：</p><ol><li>创建拉流配置接口CreatePullStreamConfig返回的配置 ID。</li><li>通过查询接口DescribePullStreamConfigs获取配置 ID。</li></ol>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>源 URL，用于拉流的地址。目前可支持直播流及点播文件。<br>注意：</p><ol><li>多个点播 URL 之间使用空格拼接。</li><li>目前上限支持10个 URL。</li><li>支持拉流文件格式：FLV，RTMP，HLS，MP4。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol> 
     * @return FromUrl <p>源 URL，用于拉流的地址。目前可支持直播流及点播文件。<br>注意：</p><ol><li>多个点播 URL 之间使用空格拼接。</li><li>目前上限支持10个 URL。</li><li>支持拉流文件格式：FLV，RTMP，HLS，MP4。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     */
    public String getFromUrl() {
        return this.FromUrl;
    }

    /**
     * Set <p>源 URL，用于拉流的地址。目前可支持直播流及点播文件。<br>注意：</p><ol><li>多个点播 URL 之间使用空格拼接。</li><li>目前上限支持10个 URL。</li><li>支持拉流文件格式：FLV，RTMP，HLS，MP4。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     * @param FromUrl <p>源 URL，用于拉流的地址。目前可支持直播流及点播文件。<br>注意：</p><ol><li>多个点播 URL 之间使用空格拼接。</li><li>目前上限支持10个 URL。</li><li>支持拉流文件格式：FLV，RTMP，HLS，MP4。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     */
    public void setFromUrl(String FromUrl) {
        this.FromUrl = FromUrl;
    }

    /**
     * Get <p>目的 URL，用于推流的地址，目前限制该目标地址为腾讯域名。</p><ol><li>仅支持 RTMP 协议。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol> 
     * @return ToUrl <p>目的 URL，用于推流的地址，目前限制该目标地址为腾讯域名。</p><ol><li>仅支持 RTMP 协议。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set <p>目的 URL，用于推流的地址，目前限制该目标地址为腾讯域名。</p><ol><li>仅支持 RTMP 协议。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     * @param ToUrl <p>目的 URL，用于推流的地址，目前限制该目标地址为腾讯域名。</p><ol><li>仅支持 RTMP 协议。</li><li>使用标准三层样式，如：http://test.com/live/stream.flv。</li></ol>
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get <p>区域 ID：<br>1-深圳。<br>2-上海。<br>3-天津。<br>4-中国香港。<br>如有改动，需同时传入IspId。</p> 
     * @return AreaId <p>区域 ID：<br>1-深圳。<br>2-上海。<br>3-天津。<br>4-中国香港。<br>如有改动，需同时传入IspId。</p>
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set <p>区域 ID：<br>1-深圳。<br>2-上海。<br>3-天津。<br>4-中国香港。<br>如有改动，需同时传入IspId。</p>
     * @param AreaId <p>区域 ID：<br>1-深圳。<br>2-上海。<br>3-天津。<br>4-中国香港。<br>如有改动，需同时传入IspId。</p>
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get <p>运营商 ID，<br>1：电信。<br>2：移动。<br>3：联通。<br>4：其他。<br>AreaId为4的时候，IspId只能为其他。如有改动，需同时传入AreaId。</p> 
     * @return IspId <p>运营商 ID，<br>1：电信。<br>2：移动。<br>3：联通。<br>4：其他。<br>AreaId为4的时候，IspId只能为其他。如有改动，需同时传入AreaId。</p>
     */
    public Long getIspId() {
        return this.IspId;
    }

    /**
     * Set <p>运营商 ID，<br>1：电信。<br>2：移动。<br>3：联通。<br>4：其他。<br>AreaId为4的时候，IspId只能为其他。如有改动，需同时传入AreaId。</p>
     * @param IspId <p>运营商 ID，<br>1：电信。<br>2：移动。<br>3：联通。<br>4：其他。<br>AreaId为4的时候，IspId只能为其他。如有改动，需同时传入AreaId。</p>
     */
    public void setIspId(Long IspId) {
        this.IspId = IspId;
    }

    /**
     * Get <p>开始时间。<br>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return StartTime <p>开始时间。<br>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。<br>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param StartTime <p>开始时间。<br>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，注意：</p><ol><li>结束时间必须大于开始时间；</li><li>结束时间和开始时间必须大于当前时间；</li><li>结束时间 和 开始时间 间隔必须小于七天。</li></ol><p>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return EndTime <p>结束时间，注意：</p><ol><li>结束时间必须大于开始时间；</li><li>结束时间和开始时间必须大于当前时间；</li><li>结束时间 和 开始时间 间隔必须小于七天。</li></ol><p>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，注意：</p><ol><li>结束时间必须大于开始时间；</li><li>结束时间和开始时间必须大于当前时间；</li><li>结束时间 和 开始时间 间隔必须小于七天。</li></ol><p>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param EndTime <p>结束时间，注意：</p><ol><li>结束时间必须大于开始时间；</li><li>结束时间和开始时间必须大于当前时间；</li><li>结束时间 和 开始时间 间隔必须小于七天。</li></ol><p>使用UTC格式时间，<br>例如：2019-01-08T10:00:00Z。<br>注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyPullStreamConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPullStreamConfigRequest(ModifyPullStreamConfigRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.FromUrl != null) {
            this.FromUrl = new String(source.FromUrl);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
        }
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.IspId != null) {
            this.IspId = new Long(source.IspId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "FromUrl", this.FromUrl);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "IspId", this.IspId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

