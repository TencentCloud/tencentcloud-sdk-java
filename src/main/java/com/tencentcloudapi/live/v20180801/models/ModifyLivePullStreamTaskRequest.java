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

public class ModifyLivePullStreamTaskRequest extends AbstractModel {

    /**
    * 任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 操作人姓名。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 拉流源url列表。
SourceType为直播（PullLivePushLive）只可以填1个，
SourceType为点播（PullVodPushLive）可以填多个，上限30个。
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于30天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 点播拉流转推循环次数。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：拉流源为点播，该配置生效。
    */
    @SerializedName("VodLoopTimes")
    @Expose
    private Long VodLoopTimes;

    /**
    * 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即从更新的拉流源开始播放；
ContinueBreakPoint：从上次断流url源的断点处继续，结束后再使用新的拉流源。
注意：拉流源为点播，该配置生效。
    */
    @SerializedName("VodRefreshType")
    @Expose
    private String VodRefreshType;

    /**
    * 任务状态：
enable - 启用，
pause - 暂停。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。
    */
    @SerializedName("CallbackEvents")
    @Expose
    private String [] CallbackEvents;

    /**
    * 自定义回调地址。
相关事件会回调到该地址。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 指定播放文件索引。
注意： 从1开始，不大于SourceUrls中文件个数。
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 指定播放文件偏移。
注意：
1. 单位：秒，配合FileIndex使用。
    */
    @SerializedName("OffsetTime")
    @Expose
    private Long OffsetTime;

    /**
    * 指定任务 ID 修改任务。

注意：该自定义任务 ID 只有在创建任务时指定了，才可在此处修改时使用。否则请使用系统返回的任务 ID。
    */
    @SerializedName("SpecifyTaskId")
    @Expose
    private String SpecifyTaskId;

    /**
    * 目标 Url。
换目标地址，会断流重推到新地址。
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * 任务备注。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 将该参数置为空，则可将任务去除备源信息。
3. 主直播源拉流中断时，自动使用备源进行拉流。
4. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
    */
    @SerializedName("BackupSourceType")
    @Expose
    private String BackupSourceType;

    /**
    * 备源 URL。
只允许填一个备源 URL
    */
    @SerializedName("BackupSourceUrl")
    @Expose
    private String BackupSourceUrl;

    /**
    * 水印信息列表。
注意：
1. 最多支持4个不同位置的水印。
2. 水印图片 URL 请使用合法外网可访问地址。
3. 支持的水印图片格式：png，jpg等。
4. 轮播任务修改水印后，轮播到下一个文件时新水印生效。
5. 直播源任务修改水印后，水印立即生效。
6. 清除水印时，需携带该水印列表参数，内容为空数组。
7. 暂不支持动图水印。
    */
    @SerializedName("WatermarkList")
    @Expose
    private PullPushWatermarkInfo [] WatermarkList;

    /**
    * 点播源是否启用本地推流模式，默认0，不启用。
0 - 不启用。
1 - 启用。
注意：启用本地模式后，会将源列表中的 MP4 文件进行本地下载，优先使用本地已下载文件进行推流，提高点播源推流稳定性。使用本地下载文件推流时，会产生增值费用。
    */
    @SerializedName("VodLocalMode")
    @Expose
    private Long VodLocalMode;

    /**
    * 新的目标地址。传空值，则取消该地址的推流。
传入新值，则替换原有地址。
    */
    @SerializedName("BackupToUrl")
    @Expose
    private String BackupToUrl;

    /**
    * 点播垫片文件地址。注意：用于在主源拉不到时自动兜底到垫片文件，切到垫片文件后，每次播完垫片会尝试拉主源，如果主源恢复则自动切回主源。可根据需要的轮询检查时长来传入对应时长的垫片文件。
    */
    @SerializedName("BackupVodUrl")
    @Expose
    private String BackupVodUrl;

    /**
     * Get 任务Id。 
     * @return TaskId 任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id。
     * @param TaskId 任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 操作人姓名。 
     * @return Operator 操作人姓名。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人姓名。
     * @param Operator 操作人姓名。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 拉流源url列表。
SourceType为直播（PullLivePushLive）只可以填1个，
SourceType为点播（PullVodPushLive）可以填多个，上限30个。 
     * @return SourceUrls 拉流源url列表。
SourceType为直播（PullLivePushLive）只可以填1个，
SourceType为点播（PullVodPushLive）可以填多个，上限30个。
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set 拉流源url列表。
SourceType为直播（PullLivePushLive）只可以填1个，
SourceType为点播（PullVodPushLive）可以填多个，上限30个。
     * @param SourceUrls 拉流源url列表。
SourceType为直播（PullLivePushLive）只可以填1个，
SourceType为点播（PullVodPushLive）可以填多个，上限30个。
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。 
     * @return StartTime 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     * @param StartTime 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于30天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。 
     * @return EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于30天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于30天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     * @param EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于30天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 点播拉流转推循环次数。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：拉流源为点播，该配置生效。 
     * @return VodLoopTimes 点播拉流转推循环次数。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：拉流源为点播，该配置生效。
     */
    public Long getVodLoopTimes() {
        return this.VodLoopTimes;
    }

    /**
     * Set 点播拉流转推循环次数。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：拉流源为点播，该配置生效。
     * @param VodLoopTimes 点播拉流转推循环次数。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：拉流源为点播，该配置生效。
     */
    public void setVodLoopTimes(Long VodLoopTimes) {
        this.VodLoopTimes = VodLoopTimes;
    }

    /**
     * Get 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即从更新的拉流源开始播放；
ContinueBreakPoint：从上次断流url源的断点处继续，结束后再使用新的拉流源。
注意：拉流源为点播，该配置生效。 
     * @return VodRefreshType 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即从更新的拉流源开始播放；
ContinueBreakPoint：从上次断流url源的断点处继续，结束后再使用新的拉流源。
注意：拉流源为点播，该配置生效。
     */
    public String getVodRefreshType() {
        return this.VodRefreshType;
    }

    /**
     * Set 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即从更新的拉流源开始播放；
ContinueBreakPoint：从上次断流url源的断点处继续，结束后再使用新的拉流源。
注意：拉流源为点播，该配置生效。
     * @param VodRefreshType 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即从更新的拉流源开始播放；
ContinueBreakPoint：从上次断流url源的断点处继续，结束后再使用新的拉流源。
注意：拉流源为点播，该配置生效。
     */
    public void setVodRefreshType(String VodRefreshType) {
        this.VodRefreshType = VodRefreshType;
    }

    /**
     * Get 任务状态：
enable - 启用，
pause - 暂停。 
     * @return Status 任务状态：
enable - 启用，
pause - 暂停。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态：
enable - 启用，
pause - 暂停。
     * @param Status 任务状态：
enable - 启用，
pause - 暂停。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。 
     * @return CallbackEvents 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。
     */
    public String [] getCallbackEvents() {
        return this.CallbackEvents;
    }

    /**
     * Set 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。
     * @param CallbackEvents 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。
     */
    public void setCallbackEvents(String [] CallbackEvents) {
        this.CallbackEvents = CallbackEvents;
    }

    /**
     * Get 自定义回调地址。
相关事件会回调到该地址。 
     * @return CallbackUrl 自定义回调地址。
相关事件会回调到该地址。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 自定义回调地址。
相关事件会回调到该地址。
     * @param CallbackUrl 自定义回调地址。
相关事件会回调到该地址。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 指定播放文件索引。
注意： 从1开始，不大于SourceUrls中文件个数。 
     * @return FileIndex 指定播放文件索引。
注意： 从1开始，不大于SourceUrls中文件个数。
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 指定播放文件索引。
注意： 从1开始，不大于SourceUrls中文件个数。
     * @param FileIndex 指定播放文件索引。
注意： 从1开始，不大于SourceUrls中文件个数。
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get 指定播放文件偏移。
注意：
1. 单位：秒，配合FileIndex使用。 
     * @return OffsetTime 指定播放文件偏移。
注意：
1. 单位：秒，配合FileIndex使用。
     */
    public Long getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 指定播放文件偏移。
注意：
1. 单位：秒，配合FileIndex使用。
     * @param OffsetTime 指定播放文件偏移。
注意：
1. 单位：秒，配合FileIndex使用。
     */
    public void setOffsetTime(Long OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 指定任务 ID 修改任务。

注意：该自定义任务 ID 只有在创建任务时指定了，才可在此处修改时使用。否则请使用系统返回的任务 ID。 
     * @return SpecifyTaskId 指定任务 ID 修改任务。

注意：该自定义任务 ID 只有在创建任务时指定了，才可在此处修改时使用。否则请使用系统返回的任务 ID。
     */
    public String getSpecifyTaskId() {
        return this.SpecifyTaskId;
    }

    /**
     * Set 指定任务 ID 修改任务。

注意：该自定义任务 ID 只有在创建任务时指定了，才可在此处修改时使用。否则请使用系统返回的任务 ID。
     * @param SpecifyTaskId 指定任务 ID 修改任务。

注意：该自定义任务 ID 只有在创建任务时指定了，才可在此处修改时使用。否则请使用系统返回的任务 ID。
     */
    public void setSpecifyTaskId(String SpecifyTaskId) {
        this.SpecifyTaskId = SpecifyTaskId;
    }

    /**
     * Get 目标 Url。
换目标地址，会断流重推到新地址。 
     * @return ToUrl 目标 Url。
换目标地址，会断流重推到新地址。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set 目标 Url。
换目标地址，会断流重推到新地址。
     * @param ToUrl 目标 Url。
换目标地址，会断流重推到新地址。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get 任务备注。 
     * @return Comment 任务备注。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 任务备注。
     * @param Comment 任务备注。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 将该参数置为空，则可将任务去除备源信息。
3. 主直播源拉流中断时，自动使用备源进行拉流。
4. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。 
     * @return BackupSourceType 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 将该参数置为空，则可将任务去除备源信息。
3. 主直播源拉流中断时，自动使用备源进行拉流。
4. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
     */
    public String getBackupSourceType() {
        return this.BackupSourceType;
    }

    /**
     * Set 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 将该参数置为空，则可将任务去除备源信息。
3. 主直播源拉流中断时，自动使用备源进行拉流。
4. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
     * @param BackupSourceType 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 将该参数置为空，则可将任务去除备源信息。
3. 主直播源拉流中断时，自动使用备源进行拉流。
4. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
     */
    public void setBackupSourceType(String BackupSourceType) {
        this.BackupSourceType = BackupSourceType;
    }

    /**
     * Get 备源 URL。
只允许填一个备源 URL 
     * @return BackupSourceUrl 备源 URL。
只允许填一个备源 URL
     */
    public String getBackupSourceUrl() {
        return this.BackupSourceUrl;
    }

    /**
     * Set 备源 URL。
只允许填一个备源 URL
     * @param BackupSourceUrl 备源 URL。
只允许填一个备源 URL
     */
    public void setBackupSourceUrl(String BackupSourceUrl) {
        this.BackupSourceUrl = BackupSourceUrl;
    }

    /**
     * Get 水印信息列表。
注意：
1. 最多支持4个不同位置的水印。
2. 水印图片 URL 请使用合法外网可访问地址。
3. 支持的水印图片格式：png，jpg等。
4. 轮播任务修改水印后，轮播到下一个文件时新水印生效。
5. 直播源任务修改水印后，水印立即生效。
6. 清除水印时，需携带该水印列表参数，内容为空数组。
7. 暂不支持动图水印。 
     * @return WatermarkList 水印信息列表。
注意：
1. 最多支持4个不同位置的水印。
2. 水印图片 URL 请使用合法外网可访问地址。
3. 支持的水印图片格式：png，jpg等。
4. 轮播任务修改水印后，轮播到下一个文件时新水印生效。
5. 直播源任务修改水印后，水印立即生效。
6. 清除水印时，需携带该水印列表参数，内容为空数组。
7. 暂不支持动图水印。
     */
    public PullPushWatermarkInfo [] getWatermarkList() {
        return this.WatermarkList;
    }

    /**
     * Set 水印信息列表。
注意：
1. 最多支持4个不同位置的水印。
2. 水印图片 URL 请使用合法外网可访问地址。
3. 支持的水印图片格式：png，jpg等。
4. 轮播任务修改水印后，轮播到下一个文件时新水印生效。
5. 直播源任务修改水印后，水印立即生效。
6. 清除水印时，需携带该水印列表参数，内容为空数组。
7. 暂不支持动图水印。
     * @param WatermarkList 水印信息列表。
注意：
1. 最多支持4个不同位置的水印。
2. 水印图片 URL 请使用合法外网可访问地址。
3. 支持的水印图片格式：png，jpg等。
4. 轮播任务修改水印后，轮播到下一个文件时新水印生效。
5. 直播源任务修改水印后，水印立即生效。
6. 清除水印时，需携带该水印列表参数，内容为空数组。
7. 暂不支持动图水印。
     */
    public void setWatermarkList(PullPushWatermarkInfo [] WatermarkList) {
        this.WatermarkList = WatermarkList;
    }

    /**
     * Get 点播源是否启用本地推流模式，默认0，不启用。
0 - 不启用。
1 - 启用。
注意：启用本地模式后，会将源列表中的 MP4 文件进行本地下载，优先使用本地已下载文件进行推流，提高点播源推流稳定性。使用本地下载文件推流时，会产生增值费用。 
     * @return VodLocalMode 点播源是否启用本地推流模式，默认0，不启用。
0 - 不启用。
1 - 启用。
注意：启用本地模式后，会将源列表中的 MP4 文件进行本地下载，优先使用本地已下载文件进行推流，提高点播源推流稳定性。使用本地下载文件推流时，会产生增值费用。
     */
    public Long getVodLocalMode() {
        return this.VodLocalMode;
    }

    /**
     * Set 点播源是否启用本地推流模式，默认0，不启用。
0 - 不启用。
1 - 启用。
注意：启用本地模式后，会将源列表中的 MP4 文件进行本地下载，优先使用本地已下载文件进行推流，提高点播源推流稳定性。使用本地下载文件推流时，会产生增值费用。
     * @param VodLocalMode 点播源是否启用本地推流模式，默认0，不启用。
0 - 不启用。
1 - 启用。
注意：启用本地模式后，会将源列表中的 MP4 文件进行本地下载，优先使用本地已下载文件进行推流，提高点播源推流稳定性。使用本地下载文件推流时，会产生增值费用。
     */
    public void setVodLocalMode(Long VodLocalMode) {
        this.VodLocalMode = VodLocalMode;
    }

    /**
     * Get 新的目标地址。传空值，则取消该地址的推流。
传入新值，则替换原有地址。 
     * @return BackupToUrl 新的目标地址。传空值，则取消该地址的推流。
传入新值，则替换原有地址。
     */
    public String getBackupToUrl() {
        return this.BackupToUrl;
    }

    /**
     * Set 新的目标地址。传空值，则取消该地址的推流。
传入新值，则替换原有地址。
     * @param BackupToUrl 新的目标地址。传空值，则取消该地址的推流。
传入新值，则替换原有地址。
     */
    public void setBackupToUrl(String BackupToUrl) {
        this.BackupToUrl = BackupToUrl;
    }

    /**
     * Get 点播垫片文件地址。注意：用于在主源拉不到时自动兜底到垫片文件，切到垫片文件后，每次播完垫片会尝试拉主源，如果主源恢复则自动切回主源。可根据需要的轮询检查时长来传入对应时长的垫片文件。 
     * @return BackupVodUrl 点播垫片文件地址。注意：用于在主源拉不到时自动兜底到垫片文件，切到垫片文件后，每次播完垫片会尝试拉主源，如果主源恢复则自动切回主源。可根据需要的轮询检查时长来传入对应时长的垫片文件。
     */
    public String getBackupVodUrl() {
        return this.BackupVodUrl;
    }

    /**
     * Set 点播垫片文件地址。注意：用于在主源拉不到时自动兜底到垫片文件，切到垫片文件后，每次播完垫片会尝试拉主源，如果主源恢复则自动切回主源。可根据需要的轮询检查时长来传入对应时长的垫片文件。
     * @param BackupVodUrl 点播垫片文件地址。注意：用于在主源拉不到时自动兜底到垫片文件，切到垫片文件后，每次播完垫片会尝试拉主源，如果主源恢复则自动切回主源。可根据需要的轮询检查时长来传入对应时长的垫片文件。
     */
    public void setBackupVodUrl(String BackupVodUrl) {
        this.BackupVodUrl = BackupVodUrl;
    }

    public ModifyLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLivePullStreamTaskRequest(ModifyLivePullStreamTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.SourceUrls != null) {
            this.SourceUrls = new String[source.SourceUrls.length];
            for (int i = 0; i < source.SourceUrls.length; i++) {
                this.SourceUrls[i] = new String(source.SourceUrls[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new Long(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new Long(source.OffsetTime);
        }
        if (source.SpecifyTaskId != null) {
            this.SpecifyTaskId = new String(source.SpecifyTaskId);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.BackupSourceType != null) {
            this.BackupSourceType = new String(source.BackupSourceType);
        }
        if (source.BackupSourceUrl != null) {
            this.BackupSourceUrl = new String(source.BackupSourceUrl);
        }
        if (source.WatermarkList != null) {
            this.WatermarkList = new PullPushWatermarkInfo[source.WatermarkList.length];
            for (int i = 0; i < source.WatermarkList.length; i++) {
                this.WatermarkList[i] = new PullPushWatermarkInfo(source.WatermarkList[i]);
            }
        }
        if (source.VodLocalMode != null) {
            this.VodLocalMode = new Long(source.VodLocalMode);
        }
        if (source.BackupToUrl != null) {
            this.BackupToUrl = new String(source.BackupToUrl);
        }
        if (source.BackupVodUrl != null) {
            this.BackupVodUrl = new String(source.BackupVodUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "SpecifyTaskId", this.SpecifyTaskId);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "BackupSourceType", this.BackupSourceType);
        this.setParamSimple(map, prefix + "BackupSourceUrl", this.BackupSourceUrl);
        this.setParamArrayObj(map, prefix + "WatermarkList.", this.WatermarkList);
        this.setParamSimple(map, prefix + "VodLocalMode", this.VodLocalMode);
        this.setParamSimple(map, prefix + "BackupToUrl", this.BackupToUrl);
        this.setParamSimple(map, prefix + "BackupVodUrl", this.BackupVodUrl);

    }
}

