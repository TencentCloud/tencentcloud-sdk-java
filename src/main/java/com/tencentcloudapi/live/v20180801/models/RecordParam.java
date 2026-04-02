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

public class RecordParam extends AbstractModel {

    /**
    * <p>录制间隔。<br>单位秒，默认：1800。<br>FLV、MP4取值范围： 60-43200， AAC取值范围： 60-7200 。<br>此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。</p>
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * <p>录制存储时长。<br>单位秒，取值范围： 0 - 1500天。<br>0：表示永久存储。<br>注：此参数只对录制到VOD有效。</p>
    */
    @SerializedName("StorageTime")
    @Expose
    private Long StorageTime;

    /**
    * <p>是否开启当前格式录制，默认值为0，0：否， 1：是。</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>点播子应用 ID。</p>
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
    * <p>录制文件名。<br>支持的特殊占位符有：<br>{StreamID}: 流ID<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p><p>若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}</p>
    */
    @SerializedName("VodFileName")
    @Expose
    private String VodFileName;

    /**
    * <p>任务流</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * <p>视频存储策略。<br>normal：标准存储。<br>cold：低频存储。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>点播应用分类</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>存储至 cos 的 bucket 桶名称。<br>注：CosBucketName参数值不能包含-[appid] 部分。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>存储至 cos 的 bucket 区域。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * <p>存储至 cos 的 bucket 路径。<br>注意：若为输入参数，则该参数必填，且必须以斜杠（/）开头，建议至少包含 {StartYear}、{StartMonth}、{StartDay}、{StartHour}、{StartMinute}、{StartSecond} 或 {RandomID} 任意一种，否则可能出现录制文件名重复造成文件相互覆盖；若为返回参数，则此字段可能返回 null，表示取不到有效值。<br>示例值：/{RecordSource}/{Domain}/{AppName}/{StreamID}/{RecordId}-{RandomID}/{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}</p><p>支持的特殊占位符有：<br>{RecordSource}：区分录制内容，若录制原始流、水印流则为“origin”，录制转码流时，代表转码模板ID<br>{StreamID}: 流ID<br>{RecordId}：录制任务ID，断流前后该值可能重复；<br>{RandomID}：随机数，断流前后该值不同；<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketPath")
    @Expose
    private String CosBucketPath;

    /**
     * Get <p>录制间隔。<br>单位秒，默认：1800。<br>FLV、MP4取值范围： 60-43200， AAC取值范围： 60-7200 。<br>此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。</p> 
     * @return RecordInterval <p>录制间隔。<br>单位秒，默认：1800。<br>FLV、MP4取值范围： 60-43200， AAC取值范围： 60-7200 。<br>此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。</p>
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set <p>录制间隔。<br>单位秒，默认：1800。<br>FLV、MP4取值范围： 60-43200， AAC取值范围： 60-7200 。<br>此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。</p>
     * @param RecordInterval <p>录制间隔。<br>单位秒，默认：1800。<br>FLV、MP4取值范围： 60-43200， AAC取值范围： 60-7200 。<br>此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。</p>
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get <p>录制存储时长。<br>单位秒，取值范围： 0 - 1500天。<br>0：表示永久存储。<br>注：此参数只对录制到VOD有效。</p> 
     * @return StorageTime <p>录制存储时长。<br>单位秒，取值范围： 0 - 1500天。<br>0：表示永久存储。<br>注：此参数只对录制到VOD有效。</p>
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set <p>录制存储时长。<br>单位秒，取值范围： 0 - 1500天。<br>0：表示永久存储。<br>注：此参数只对录制到VOD有效。</p>
     * @param StorageTime <p>录制存储时长。<br>单位秒，取值范围： 0 - 1500天。<br>0：表示永久存储。<br>注：此参数只对录制到VOD有效。</p>
     */
    public void setStorageTime(Long StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * Get <p>是否开启当前格式录制，默认值为0，0：否， 1：是。</p> 
     * @return Enable <p>是否开启当前格式录制，默认值为0，0：否， 1：是。</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启当前格式录制，默认值为0，0：否， 1：是。</p>
     * @param Enable <p>是否开启当前格式录制，默认值为0，0：否， 1：是。</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>点播子应用 ID。</p> 
     * @return VodSubAppId <p>点播子应用 ID。</p>
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set <p>点播子应用 ID。</p>
     * @param VodSubAppId <p>点播子应用 ID。</p>
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Get <p>录制文件名。<br>支持的特殊占位符有：<br>{StreamID}: 流ID<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p><p>若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}</p> 
     * @return VodFileName <p>录制文件名。<br>支持的特殊占位符有：<br>{StreamID}: 流ID<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p><p>若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}</p>
     */
    public String getVodFileName() {
        return this.VodFileName;
    }

    /**
     * Set <p>录制文件名。<br>支持的特殊占位符有：<br>{StreamID}: 流ID<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p><p>若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}</p>
     * @param VodFileName <p>录制文件名。<br>支持的特殊占位符有：<br>{StreamID}: 流ID<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p><p>若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}</p>
     */
    public void setVodFileName(String VodFileName) {
        this.VodFileName = VodFileName;
    }

    /**
     * Get <p>任务流</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedure <p>任务流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p>任务流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedure <p>任务流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get <p>视频存储策略。<br>normal：标准存储。<br>cold：低频存储。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageMode <p>视频存储策略。<br>normal：标准存储。<br>cold：低频存储。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>视频存储策略。<br>normal：标准存储。<br>cold：低频存储。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageMode <p>视频存储策略。<br>normal：标准存储。<br>cold：低频存储。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>点播应用分类</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassId <p>点播应用分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>点播应用分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassId <p>点播应用分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>存储至 cos 的 bucket 桶名称。<br>注：CosBucketName参数值不能包含-[appid] 部分。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName <p>存储至 cos 的 bucket 桶名称。<br>注：CosBucketName参数值不能包含-[appid] 部分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>存储至 cos 的 bucket 桶名称。<br>注：CosBucketName参数值不能包含-[appid] 部分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName <p>存储至 cos 的 bucket 桶名称。<br>注：CosBucketName参数值不能包含-[appid] 部分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>存储至 cos 的 bucket 区域。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketRegion <p>存储至 cos 的 bucket 区域。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set <p>存储至 cos 的 bucket 区域。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketRegion <p>存储至 cos 的 bucket 区域。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get <p>存储至 cos 的 bucket 路径。<br>注意：若为输入参数，则该参数必填，且必须以斜杠（/）开头，建议至少包含 {StartYear}、{StartMonth}、{StartDay}、{StartHour}、{StartMinute}、{StartSecond} 或 {RandomID} 任意一种，否则可能出现录制文件名重复造成文件相互覆盖；若为返回参数，则此字段可能返回 null，表示取不到有效值。<br>示例值：/{RecordSource}/{Domain}/{AppName}/{StreamID}/{RecordId}-{RandomID}/{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}</p><p>支持的特殊占位符有：<br>{RecordSource}：区分录制内容，若录制原始流、水印流则为“origin”，录制转码流时，代表转码模板ID<br>{StreamID}: 流ID<br>{RecordId}：录制任务ID，断流前后该值可能重复；<br>{RandomID}：随机数，断流前后该值不同；<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketPath <p>存储至 cos 的 bucket 路径。<br>注意：若为输入参数，则该参数必填，且必须以斜杠（/）开头，建议至少包含 {StartYear}、{StartMonth}、{StartDay}、{StartHour}、{StartMinute}、{StartSecond} 或 {RandomID} 任意一种，否则可能出现录制文件名重复造成文件相互覆盖；若为返回参数，则此字段可能返回 null，表示取不到有效值。<br>示例值：/{RecordSource}/{Domain}/{AppName}/{StreamID}/{RecordId}-{RandomID}/{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}</p><p>支持的特殊占位符有：<br>{RecordSource}：区分录制内容，若录制原始流、水印流则为“origin”，录制转码流时，代表转码模板ID<br>{StreamID}: 流ID<br>{RecordId}：录制任务ID，断流前后该值可能重复；<br>{RandomID}：随机数，断流前后该值不同；<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketPath() {
        return this.CosBucketPath;
    }

    /**
     * Set <p>存储至 cos 的 bucket 路径。<br>注意：若为输入参数，则该参数必填，且必须以斜杠（/）开头，建议至少包含 {StartYear}、{StartMonth}、{StartDay}、{StartHour}、{StartMinute}、{StartSecond} 或 {RandomID} 任意一种，否则可能出现录制文件名重复造成文件相互覆盖；若为返回参数，则此字段可能返回 null，表示取不到有效值。<br>示例值：/{RecordSource}/{Domain}/{AppName}/{StreamID}/{RecordId}-{RandomID}/{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}</p><p>支持的特殊占位符有：<br>{RecordSource}：区分录制内容，若录制原始流、水印流则为“origin”，录制转码流时，代表转码模板ID<br>{StreamID}: 流ID<br>{RecordId}：录制任务ID，断流前后该值可能重复；<br>{RandomID}：随机数，断流前后该值不同；<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketPath <p>存储至 cos 的 bucket 路径。<br>注意：若为输入参数，则该参数必填，且必须以斜杠（/）开头，建议至少包含 {StartYear}、{StartMonth}、{StartDay}、{StartHour}、{StartMinute}、{StartSecond} 或 {RandomID} 任意一种，否则可能出现录制文件名重复造成文件相互覆盖；若为返回参数，则此字段可能返回 null，表示取不到有效值。<br>示例值：/{RecordSource}/{Domain}/{AppName}/{StreamID}/{RecordId}-{RandomID}/{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}</p><p>支持的特殊占位符有：<br>{RecordSource}：区分录制内容，若录制原始流、水印流则为“origin”，录制转码流时，代表转码模板ID<br>{StreamID}: 流ID<br>{RecordId}：录制任务ID，断流前后该值可能重复；<br>{RandomID}：随机数，断流前后该值不同；<br>{StartYear}: 开始时间-年<br>{StartMonth}: 开始时间-月<br>{StartDay}: 开始时间-日<br>{StartHour}: 开始时间-小时<br>{StartMinute}: 开始时间-分钟<br>{StartSecond}: 开始时间-秒<br>{StartMillisecond}: 开始时间-毫秒<br>{EndYear}: 结束时间-年<br>{EndMonth}: 结束时间-月<br>{EndDay}: 结束时间-日<br>{EndHour}: 结束时间-小时<br>{EndMinute}: 结束时间-分钟<br>{EndSecond}: 结束时间-秒<br>{EndMillisecond}: 结束时间-毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketPath(String CosBucketPath) {
        this.CosBucketPath = CosBucketPath;
    }

    public RecordParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordParam(RecordParam source) {
        if (source.RecordInterval != null) {
            this.RecordInterval = new Long(source.RecordInterval);
        }
        if (source.StorageTime != null) {
            this.StorageTime = new Long(source.StorageTime);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VodSubAppId != null) {
            this.VodSubAppId = new Long(source.VodSubAppId);
        }
        if (source.VodFileName != null) {
            this.VodFileName = new String(source.VodFileName);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.CosBucketPath != null) {
            this.CosBucketPath = new String(source.CosBucketPath);
        }
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
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "CosBucketPath", this.CosBucketPath);

    }
}

