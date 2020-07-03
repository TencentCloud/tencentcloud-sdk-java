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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePullStreamConfigRequest extends AbstractModel{

    /**
    * 源 Url ，用于拉流的地址。目前可支持直播流及点播文件。
注意：
1. 多个点播url之间使用空格拼接。
2. 目前上限支持10个url。
3. 支持拉流文件格式：flv，rtmp，hls，mp4。
    */
    @SerializedName("FromUrl")
    @Expose
    private String FromUrl;

    /**
    * 目的 Url ，用于推流的地址，目前限制该目标地址为腾讯域名。
仅支持：rtmp 协议。
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * 选择完成转拉推的服务所在区域:
1-深圳，
2-上海，
3-天津，
4-中国香港。
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId 为4的时候，IspId 只能为其他。
    */
    @SerializedName("IspId")
    @Expose
    private Long IspId;

    /**
    * 开始时间。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 源 Url ，用于拉流的地址。目前可支持直播流及点播文件。
注意：
1. 多个点播url之间使用空格拼接。
2. 目前上限支持10个url。
3. 支持拉流文件格式：flv，rtmp，hls，mp4。 
     * @return FromUrl 源 Url ，用于拉流的地址。目前可支持直播流及点播文件。
注意：
1. 多个点播url之间使用空格拼接。
2. 目前上限支持10个url。
3. 支持拉流文件格式：flv，rtmp，hls，mp4。
     */
    public String getFromUrl() {
        return this.FromUrl;
    }

    /**
     * Set 源 Url ，用于拉流的地址。目前可支持直播流及点播文件。
注意：
1. 多个点播url之间使用空格拼接。
2. 目前上限支持10个url。
3. 支持拉流文件格式：flv，rtmp，hls，mp4。
     * @param FromUrl 源 Url ，用于拉流的地址。目前可支持直播流及点播文件。
注意：
1. 多个点播url之间使用空格拼接。
2. 目前上限支持10个url。
3. 支持拉流文件格式：flv，rtmp，hls，mp4。
     */
    public void setFromUrl(String FromUrl) {
        this.FromUrl = FromUrl;
    }

    /**
     * Get 目的 Url ，用于推流的地址，目前限制该目标地址为腾讯域名。
仅支持：rtmp 协议。 
     * @return ToUrl 目的 Url ，用于推流的地址，目前限制该目标地址为腾讯域名。
仅支持：rtmp 协议。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set 目的 Url ，用于推流的地址，目前限制该目标地址为腾讯域名。
仅支持：rtmp 协议。
     * @param ToUrl 目的 Url ，用于推流的地址，目前限制该目标地址为腾讯域名。
仅支持：rtmp 协议。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get 选择完成转拉推的服务所在区域:
1-深圳，
2-上海，
3-天津，
4-中国香港。 
     * @return AreaId 选择完成转拉推的服务所在区域:
1-深圳，
2-上海，
3-天津，
4-中国香港。
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 选择完成转拉推的服务所在区域:
1-深圳，
2-上海，
3-天津，
4-中国香港。
     * @param AreaId 选择完成转拉推的服务所在区域:
1-深圳，
2-上海，
3-天津，
4-中国香港。
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId 为4的时候，IspId 只能为其他。 
     * @return IspId 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId 为4的时候，IspId 只能为其他。
     */
    public Long getIspId() {
        return this.IspId;
    }

    /**
     * Set 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId 为4的时候，IspId 只能为其他。
     * @param IspId 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId 为4的时候，IspId 只能为其他。
     */
    public void setIspId(Long IspId) {
        this.IspId = IspId;
    }

    /**
     * Get 开始时间。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 开始时间。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 开始时间。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用 UTC 格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromUrl", this.FromUrl);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "IspId", this.IspId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

