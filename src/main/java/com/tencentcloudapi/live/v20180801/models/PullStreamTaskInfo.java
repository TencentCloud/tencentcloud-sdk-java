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

public class PullStreamTaskInfo extends AbstractModel{

    /**
    * 拉流任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 拉流源url列表。
SourceType为直播（PullLiveToLive）只可以填1个，
SourceType为点播（PullVodToLive）可以填多个，上限10个。
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * 推流域名。
将拉到的源推到该域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径。
将拉到的源推到该路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。
将拉到的源推到该流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流参数。
推流携带的自定义参数。
    */
    @SerializedName("PushArgs")
    @Expose
    private String PushArgs;

    /**
    * 开始时间。
使用UTC格式时间，
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
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 拉流源所在地域（请就近选取）：
ap-beijing - 华北地区(北京)，
ap-shanghai -华东地区(上海)，
ap-guangzhou -华南地区(广州)，
ap-mumbai - 印度。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
    * 任务创建时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务更新时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建任务的操作者。
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 最后更新任务的操作者。
    */
    @SerializedName("UpdateBy")
    @Expose
    private String UpdateBy;

    /**
    * 回调地址。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 选择需要回调的事件：
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
    * 注意：该信息暂不返回。
最后一次回调信息。
    */
    @SerializedName("CallbackInfo")
    @Expose
    private String CallbackInfo;

    /**
    * 注意：该信息暂不返回。
错误信息。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 状态。
enable：生效中。
pause：暂停中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 注意：该信息仅在查询单个任务时返回。
任务最新拉流信息。
包含：源 url，偏移时间，上报时间。
    */
    @SerializedName("RecentPullInfo")
    @Expose
    private RecentPullInfo RecentPullInfo;

    /**
    * 任务备注信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 拉流任务Id。 
     * @return TaskId 拉流任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拉流任务Id。
     * @param TaskId 拉流任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。 
     * @return SourceType 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
     * @param SourceType 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 拉流源url列表。
SourceType为直播（PullLiveToLive）只可以填1个，
SourceType为点播（PullVodToLive）可以填多个，上限10个。 
     * @return SourceUrls 拉流源url列表。
SourceType为直播（PullLiveToLive）只可以填1个，
SourceType为点播（PullVodToLive）可以填多个，上限10个。
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set 拉流源url列表。
SourceType为直播（PullLiveToLive）只可以填1个，
SourceType为点播（PullVodToLive）可以填多个，上限10个。
     * @param SourceUrls 拉流源url列表。
SourceType为直播（PullLiveToLive）只可以填1个，
SourceType为点播（PullVodToLive）可以填多个，上限10个。
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get 推流域名。
将拉到的源推到该域名。 
     * @return DomainName 推流域名。
将拉到的源推到该域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
将拉到的源推到该域名。
     * @param DomainName 推流域名。
将拉到的源推到该域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径。
将拉到的源推到该路径。 
     * @return AppName 推流路径。
将拉到的源推到该路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
将拉到的源推到该路径。
     * @param AppName 推流路径。
将拉到的源推到该路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。
将拉到的源推到该流名称。 
     * @return StreamName 流名称。
将拉到的源推到该流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
将拉到的源推到该流名称。
     * @param StreamName 流名称。
将拉到的源推到该流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 推流参数。
推流携带的自定义参数。 
     * @return PushArgs 推流参数。
推流携带的自定义参数。
     */
    public String getPushArgs() {
        return this.PushArgs;
    }

    /**
     * Set 推流参数。
推流携带的自定义参数。
     * @param PushArgs 推流参数。
推流携带的自定义参数。
     */
    public void setPushArgs(String PushArgs) {
        this.PushArgs = PushArgs;
    }

    /**
     * Get 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 开始时间。
使用UTC格式时间，
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
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
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
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束时间，注意：
1. 结束时间必须大于开始时间；
2. 结束时间和开始时间必须大于当前时间；
3. 结束时间 和 开始时间 间隔必须小于七天。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 拉流源所在地域（请就近选取）：
ap-beijing - 华北地区(北京)，
ap-shanghai -华东地区(上海)，
ap-guangzhou -华南地区(广州)，
ap-mumbai - 印度。 
     * @return Region 拉流源所在地域（请就近选取）：
ap-beijing - 华北地区(北京)，
ap-shanghai -华东地区(上海)，
ap-guangzhou -华南地区(广州)，
ap-mumbai - 印度。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 拉流源所在地域（请就近选取）：
ap-beijing - 华北地区(北京)，
ap-shanghai -华东地区(上海)，
ap-guangzhou -华南地区(广州)，
ap-mumbai - 印度。
     * @param Region 拉流源所在地域（请就近选取）：
ap-beijing - 华北地区(北京)，
ap-shanghai -华东地区(上海)，
ap-guangzhou -华南地区(广州)，
ap-mumbai - 印度。
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 任务创建时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 任务创建时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 任务创建时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 任务更新时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 任务更新时间。
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建任务的操作者。 
     * @return CreateBy 创建任务的操作者。
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 创建任务的操作者。
     * @param CreateBy 创建任务的操作者。
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 最后更新任务的操作者。 
     * @return UpdateBy 最后更新任务的操作者。
     */
    public String getUpdateBy() {
        return this.UpdateBy;
    }

    /**
     * Set 最后更新任务的操作者。
     * @param UpdateBy 最后更新任务的操作者。
     */
    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    /**
     * Get 回调地址。 
     * @return CallbackUrl 回调地址。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址。
     * @param CallbackUrl 回调地址。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 选择需要回调的事件：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。 
     * @return CallbackEvents 选择需要回调的事件：
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
     * Set 选择需要回调的事件：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。
     * @param CallbackEvents 选择需要回调的事件：
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
     * Get 注意：该信息暂不返回。
最后一次回调信息。 
     * @return CallbackInfo 注意：该信息暂不返回。
最后一次回调信息。
     */
    public String getCallbackInfo() {
        return this.CallbackInfo;
    }

    /**
     * Set 注意：该信息暂不返回。
最后一次回调信息。
     * @param CallbackInfo 注意：该信息暂不返回。
最后一次回调信息。
     */
    public void setCallbackInfo(String CallbackInfo) {
        this.CallbackInfo = CallbackInfo;
    }

    /**
     * Get 注意：该信息暂不返回。
错误信息。 
     * @return ErrorInfo 注意：该信息暂不返回。
错误信息。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 注意：该信息暂不返回。
错误信息。
     * @param ErrorInfo 注意：该信息暂不返回。
错误信息。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 状态。
enable：生效中。
pause：暂停中。 
     * @return Status 状态。
enable：生效中。
pause：暂停中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
enable：生效中。
pause：暂停中。
     * @param Status 状态。
enable：生效中。
pause：暂停中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 注意：该信息仅在查询单个任务时返回。
任务最新拉流信息。
包含：源 url，偏移时间，上报时间。 
     * @return RecentPullInfo 注意：该信息仅在查询单个任务时返回。
任务最新拉流信息。
包含：源 url，偏移时间，上报时间。
     */
    public RecentPullInfo getRecentPullInfo() {
        return this.RecentPullInfo;
    }

    /**
     * Set 注意：该信息仅在查询单个任务时返回。
任务最新拉流信息。
包含：源 url，偏移时间，上报时间。
     * @param RecentPullInfo 注意：该信息仅在查询单个任务时返回。
任务最新拉流信息。
包含：源 url，偏移时间，上报时间。
     */
    public void setRecentPullInfo(RecentPullInfo RecentPullInfo) {
        this.RecentPullInfo = RecentPullInfo;
    }

    /**
     * Get 任务备注信息。 
     * @return Comment 任务备注信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 任务备注信息。
     * @param Comment 任务备注信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public PullStreamTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullStreamTaskInfo(PullStreamTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceUrls != null) {
            this.SourceUrls = new String[source.SourceUrls.length];
            for (int i = 0; i < source.SourceUrls.length; i++) {
                this.SourceUrls[i] = new String(source.SourceUrls[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.PushArgs != null) {
            this.PushArgs = new String(source.PushArgs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new Long(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.UpdateBy != null) {
            this.UpdateBy = new String(source.UpdateBy);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.CallbackInfo != null) {
            this.CallbackInfo = new String(source.CallbackInfo);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RecentPullInfo != null) {
            this.RecentPullInfo = new RecentPullInfo(source.RecentPullInfo);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PushArgs", this.PushArgs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "UpdateBy", this.UpdateBy);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "CallbackInfo", this.CallbackInfo);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "RecentPullInfo.", this.RecentPullInfo);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

