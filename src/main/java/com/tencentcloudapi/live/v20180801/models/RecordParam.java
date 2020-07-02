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

public class RecordParam extends AbstractModel{

    /**
    * 录制间隔。
单位秒，默认：1800。
取值范围：300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * 录制存储时长。
单位秒，取值范围： 0 - 93312000。
0：表示永久存储。
    */
    @SerializedName("StorageTime")
    @Expose
    private Long StorageTime;

    /**
    * 是否开启当前格式录制，默认值为0，0：否， 1：是。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 点播子应用 ID。
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
    * 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
    */
    @SerializedName("VodFileName")
    @Expose
    private String VodFileName;

    /**
     * Get 录制间隔。
单位秒，默认：1800。
取值范围：300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。 
     * @return RecordInterval 录制间隔。
单位秒，默认：1800。
取值范围：300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set 录制间隔。
单位秒，默认：1800。
取值范围：300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     * @param RecordInterval 录制间隔。
单位秒，默认：1800。
取值范围：300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get 录制存储时长。
单位秒，取值范围： 0 - 93312000。
0：表示永久存储。 
     * @return StorageTime 录制存储时长。
单位秒，取值范围： 0 - 93312000。
0：表示永久存储。
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set 录制存储时长。
单位秒，取值范围： 0 - 93312000。
0：表示永久存储。
     * @param StorageTime 录制存储时长。
单位秒，取值范围： 0 - 93312000。
0：表示永久存储。
     */
    public void setStorageTime(Long StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * Get 是否开启当前格式录制，默认值为0，0：否， 1：是。 
     * @return Enable 是否开启当前格式录制，默认值为0，0：否， 1：是。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启当前格式录制，默认值为0，0：否， 1：是。
     * @param Enable 是否开启当前格式录制，默认值为0，0：否， 1：是。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 点播子应用 ID。 
     * @return VodSubAppId 点播子应用 ID。
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set 点播子应用 ID。
     * @param VodSubAppId 点播子应用 ID。
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Get 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond} 
     * @return VodFileName 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     */
    public String getVodFileName() {
        return this.VodFileName;
    }

    /**
     * Set 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     * @param VodFileName 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     */
    public void setVodFileName(String VodFileName) {
        this.VodFileName = VodFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordInterval", this.RecordInterval);
        this.setParamSimple(map, prefix + "StorageTime", this.StorageTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);
        this.setParamSimple(map, prefix + "VodFileName", this.VodFileName);

    }
}

