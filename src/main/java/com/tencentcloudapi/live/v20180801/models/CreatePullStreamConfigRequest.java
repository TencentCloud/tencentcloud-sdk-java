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

public class CreatePullStreamConfigRequest  extends AbstractModel{

    /**
    * 源Url。目前可支持直播流及点播文件。
    */
    @SerializedName("FromUrl")
    @Expose
    private String FromUrl;

    /**
    * 目的Url，目前限制该目标地址为腾讯域名。
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
    private Integer AreaId;

    /**
    * 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId为4的时候,IspId只能为其他。
    */
    @SerializedName("IspId")
    @Expose
    private Integer IspId;

    /**
    * 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * 获取源Url。目前可支持直播流及点播文件。
     * @return FromUrl 源Url。目前可支持直播流及点播文件。
     */
    public String getFromUrl() {
        return this.FromUrl;
    }

    /**
     * 设置源Url。目前可支持直播流及点播文件。
     * @param FromUrl 源Url。目前可支持直播流及点播文件。
     */
    public void setFromUrl(String FromUrl) {
        this.FromUrl = FromUrl;
    }

    /**
     * 获取目的Url，目前限制该目标地址为腾讯域名。
     * @return ToUrl 目的Url，目前限制该目标地址为腾讯域名。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * 设置目的Url，目前限制该目标地址为腾讯域名。
     * @param ToUrl 目的Url，目前限制该目标地址为腾讯域名。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * 获取选择完成转拉推的服务所在区域:
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
    public Integer getAreaId() {
        return this.AreaId;
    }

    /**
     * 设置选择完成转拉推的服务所在区域:
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
    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * 获取选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId为4的时候,IspId只能为其他。
     * @return IspId 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId为4的时候,IspId只能为其他。
     */
    public Integer getIspId() {
        return this.IspId;
    }

    /**
     * 设置选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId为4的时候,IspId只能为其他。
     * @param IspId 选择完成转拉推服务使用的运营商网络：
1-电信，
2-移动，
3-联通，
4-其他。
注：AreaId为4的时候,IspId只能为其他。
     */
    public void setIspId(Integer IspId) {
        this.IspId = IspId;
    }

    /**
     * 获取开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return StartTime 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param StartTime 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 内部实现，用户禁止调用
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

