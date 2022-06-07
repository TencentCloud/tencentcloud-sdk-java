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

public class CreateLivePullStreamTaskRequest extends AbstractModel{

    /**
    * 拉流源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 拉流源 url 列表。
SourceType 为直播（PullLivePushLive）只可以填1个，
SourceType 为点播（PullVodPushLive）可以填多个，上限30个。
当前支持的文件格式：flv，mp4，hls。
当前支持的拉流协议：http，https，rtmp，rtmps，rtsp，srt。
注意：
1. 建议优先使用 flv 文件，对于 mp4 未交织好的文件轮播推流易产生卡顿，可通过点播转码进行重新交织后再轮播。
2. 拒绝内网域名等攻击性拉流地址，如有使用，则做账号封禁处理。
3. 源文件请保持时间戳正常交织递增，避免因源文件异常影响推流及播放。
4. 视频编码格式仅支持: H264, H265。
5. 音频编码格式仅支持: AAC。
6. 点播源请使用小文件，尽量时长保持在1小时内，较大文件打开和续播耗时较久，耗时超过15秒会有无法正常转推风险。
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * 推流域名。
将拉取过来的流推到该域名。
注意：请使用已在云直播配置的推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径。
将拉取过来的流推到该路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流名称。
将拉取过来的流推到该流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

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
    * 任务操作人备注。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 推流参数。
推流时携带自定义参数。
示例：
bak=1&test=2 。
    */
    @SerializedName("PushArgs")
    @Expose
    private String PushArgs;

    /**
    * 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。

TaskAlarm: 用于告警事件通知，AlarmType 示例:
PullFileUnstable - 文件拉取不稳定，
PushStreamUnstable - 推流不稳定，
PullFileFailed - 文件拉取出错，
PushStreamFailed - 推流出现失败，
FileEndEarly - 文件提前结束。
    */
    @SerializedName("CallbackEvents")
    @Expose
    private String [] CallbackEvents;

    /**
    * 点播拉流转推循环次数。默认：-1。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：该配置仅对拉流源为点播时生效。
    */
    @SerializedName("VodLoopTimes")
    @Expose
    private String VodLoopTimes;

    /**
    * 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即播放新的拉流源内容；
ContinueBreakPoint：播放完当前正在播放的点播 url 后再使用新的拉流源播放。（旧拉流源未播放的点播 url 不会再播放）

注意：该配置生效仅对变更前拉流源为点播时生效。
    */
    @SerializedName("VodRefreshType")
    @Expose
    private String VodRefreshType;

    /**
    * 自定义回调地址。
拉流转推任务相关事件会回调到该地址。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 其他参数。
示例: ignore_region  用于忽略传入地域, 内部按负载分配。
    */
    @SerializedName("ExtraCmd")
    @Expose
    private String ExtraCmd;

    /**
    * 任务描述，限制 512 字节。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 完整目标 URL 地址。
用法注意：如果使用该参数来传完整目标地址，则 DomainName, AppName, StreamName 需要传入空值，任务将会使用该 ToUrl 参数指定的目标地址。

注意：签名时间需要超过任务结束时间，避免因签名过期造成任务失败。
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 主直播源拉流中断时，自动使用备源进行拉流。
3. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
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
     * Get 拉流源 url 列表。
SourceType 为直播（PullLivePushLive）只可以填1个，
SourceType 为点播（PullVodPushLive）可以填多个，上限30个。
当前支持的文件格式：flv，mp4，hls。
当前支持的拉流协议：http，https，rtmp，rtmps，rtsp，srt。
注意：
1. 建议优先使用 flv 文件，对于 mp4 未交织好的文件轮播推流易产生卡顿，可通过点播转码进行重新交织后再轮播。
2. 拒绝内网域名等攻击性拉流地址，如有使用，则做账号封禁处理。
3. 源文件请保持时间戳正常交织递增，避免因源文件异常影响推流及播放。
4. 视频编码格式仅支持: H264, H265。
5. 音频编码格式仅支持: AAC。
6. 点播源请使用小文件，尽量时长保持在1小时内，较大文件打开和续播耗时较久，耗时超过15秒会有无法正常转推风险。 
     * @return SourceUrls 拉流源 url 列表。
SourceType 为直播（PullLivePushLive）只可以填1个，
SourceType 为点播（PullVodPushLive）可以填多个，上限30个。
当前支持的文件格式：flv，mp4，hls。
当前支持的拉流协议：http，https，rtmp，rtmps，rtsp，srt。
注意：
1. 建议优先使用 flv 文件，对于 mp4 未交织好的文件轮播推流易产生卡顿，可通过点播转码进行重新交织后再轮播。
2. 拒绝内网域名等攻击性拉流地址，如有使用，则做账号封禁处理。
3. 源文件请保持时间戳正常交织递增，避免因源文件异常影响推流及播放。
4. 视频编码格式仅支持: H264, H265。
5. 音频编码格式仅支持: AAC。
6. 点播源请使用小文件，尽量时长保持在1小时内，较大文件打开和续播耗时较久，耗时超过15秒会有无法正常转推风险。
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set 拉流源 url 列表。
SourceType 为直播（PullLivePushLive）只可以填1个，
SourceType 为点播（PullVodPushLive）可以填多个，上限30个。
当前支持的文件格式：flv，mp4，hls。
当前支持的拉流协议：http，https，rtmp，rtmps，rtsp，srt。
注意：
1. 建议优先使用 flv 文件，对于 mp4 未交织好的文件轮播推流易产生卡顿，可通过点播转码进行重新交织后再轮播。
2. 拒绝内网域名等攻击性拉流地址，如有使用，则做账号封禁处理。
3. 源文件请保持时间戳正常交织递增，避免因源文件异常影响推流及播放。
4. 视频编码格式仅支持: H264, H265。
5. 音频编码格式仅支持: AAC。
6. 点播源请使用小文件，尽量时长保持在1小时内，较大文件打开和续播耗时较久，耗时超过15秒会有无法正常转推风险。
     * @param SourceUrls 拉流源 url 列表。
SourceType 为直播（PullLivePushLive）只可以填1个，
SourceType 为点播（PullVodPushLive）可以填多个，上限30个。
当前支持的文件格式：flv，mp4，hls。
当前支持的拉流协议：http，https，rtmp，rtmps，rtsp，srt。
注意：
1. 建议优先使用 flv 文件，对于 mp4 未交织好的文件轮播推流易产生卡顿，可通过点播转码进行重新交织后再轮播。
2. 拒绝内网域名等攻击性拉流地址，如有使用，则做账号封禁处理。
3. 源文件请保持时间戳正常交织递增，避免因源文件异常影响推流及播放。
4. 视频编码格式仅支持: H264, H265。
5. 音频编码格式仅支持: AAC。
6. 点播源请使用小文件，尽量时长保持在1小时内，较大文件打开和续播耗时较久，耗时超过15秒会有无法正常转推风险。
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get 推流域名。
将拉取过来的流推到该域名。
注意：请使用已在云直播配置的推流域名。 
     * @return DomainName 推流域名。
将拉取过来的流推到该域名。
注意：请使用已在云直播配置的推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
将拉取过来的流推到该域名。
注意：请使用已在云直播配置的推流域名。
     * @param DomainName 推流域名。
将拉取过来的流推到该域名。
注意：请使用已在云直播配置的推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径。
将拉取过来的流推到该路径。 
     * @return AppName 推流路径。
将拉取过来的流推到该路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
将拉取过来的流推到该路径。
     * @param AppName 推流路径。
将拉取过来的流推到该路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流名称。
将拉取过来的流推到该流名称。 
     * @return StreamName 推流名称。
将拉取过来的流推到该流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 推流名称。
将拉取过来的流推到该流名称。
     * @param StreamName 推流名称。
将拉取过来的流推到该流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
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
     * Get 任务操作人备注。 
     * @return Operator 任务操作人备注。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 任务操作人备注。
     * @param Operator 任务操作人备注。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 推流参数。
推流时携带自定义参数。
示例：
bak=1&test=2 。 
     * @return PushArgs 推流参数。
推流时携带自定义参数。
示例：
bak=1&test=2 。
     */
    public String getPushArgs() {
        return this.PushArgs;
    }

    /**
     * Set 推流参数。
推流时携带自定义参数。
示例：
bak=1&test=2 。
     * @param PushArgs 推流参数。
推流时携带自定义参数。
示例：
bak=1&test=2 。
     */
    public void setPushArgs(String PushArgs) {
        this.PushArgs = PushArgs;
    }

    /**
     * Get 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。

TaskAlarm: 用于告警事件通知，AlarmType 示例:
PullFileUnstable - 文件拉取不稳定，
PushStreamUnstable - 推流不稳定，
PullFileFailed - 文件拉取出错，
PushStreamFailed - 推流出现失败，
FileEndEarly - 文件提前结束。 
     * @return CallbackEvents 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。

TaskAlarm: 用于告警事件通知，AlarmType 示例:
PullFileUnstable - 文件拉取不稳定，
PushStreamUnstable - 推流不稳定，
PullFileFailed - 文件拉取出错，
PushStreamFailed - 推流出现失败，
FileEndEarly - 文件提前结束。
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

TaskAlarm: 用于告警事件通知，AlarmType 示例:
PullFileUnstable - 文件拉取不稳定，
PushStreamUnstable - 推流不稳定，
PullFileFailed - 文件拉取出错，
PushStreamFailed - 推流出现失败，
FileEndEarly - 文件提前结束。
     * @param CallbackEvents 选择需要回调的事件（不填则回调全部）：
TaskStart：任务启动回调，
TaskExit：任务停止回调，
VodSourceFileStart：从点播源文件开始拉流回调，
VodSourceFileFinish：从点播源文件拉流结束回调，
ResetTaskConfig：任务更新回调。

TaskAlarm: 用于告警事件通知，AlarmType 示例:
PullFileUnstable - 文件拉取不稳定，
PushStreamUnstable - 推流不稳定，
PullFileFailed - 文件拉取出错，
PushStreamFailed - 推流出现失败，
FileEndEarly - 文件提前结束。
     */
    public void setCallbackEvents(String [] CallbackEvents) {
        this.CallbackEvents = CallbackEvents;
    }

    /**
     * Get 点播拉流转推循环次数。默认：-1。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：该配置仅对拉流源为点播时生效。 
     * @return VodLoopTimes 点播拉流转推循环次数。默认：-1。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：该配置仅对拉流源为点播时生效。
     */
    public String getVodLoopTimes() {
        return this.VodLoopTimes;
    }

    /**
     * Set 点播拉流转推循环次数。默认：-1。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：该配置仅对拉流源为点播时生效。
     * @param VodLoopTimes 点播拉流转推循环次数。默认：-1。
-1：无限循环，直到任务结束。
0：不循环。
>0：具体循环次数。次数和时间以先结束的为准。
注意：该配置仅对拉流源为点播时生效。
     */
    public void setVodLoopTimes(String VodLoopTimes) {
        this.VodLoopTimes = VodLoopTimes;
    }

    /**
     * Get 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即播放新的拉流源内容；
ContinueBreakPoint：播放完当前正在播放的点播 url 后再使用新的拉流源播放。（旧拉流源未播放的点播 url 不会再播放）

注意：该配置生效仅对变更前拉流源为点播时生效。 
     * @return VodRefreshType 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即播放新的拉流源内容；
ContinueBreakPoint：播放完当前正在播放的点播 url 后再使用新的拉流源播放。（旧拉流源未播放的点播 url 不会再播放）

注意：该配置生效仅对变更前拉流源为点播时生效。
     */
    public String getVodRefreshType() {
        return this.VodRefreshType;
    }

    /**
     * Set 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即播放新的拉流源内容；
ContinueBreakPoint：播放完当前正在播放的点播 url 后再使用新的拉流源播放。（旧拉流源未播放的点播 url 不会再播放）

注意：该配置生效仅对变更前拉流源为点播时生效。
     * @param VodRefreshType 点播更新SourceUrls后的播放方式：
ImmediateNewSource：立即播放新的拉流源内容；
ContinueBreakPoint：播放完当前正在播放的点播 url 后再使用新的拉流源播放。（旧拉流源未播放的点播 url 不会再播放）

注意：该配置生效仅对变更前拉流源为点播时生效。
     */
    public void setVodRefreshType(String VodRefreshType) {
        this.VodRefreshType = VodRefreshType;
    }

    /**
     * Get 自定义回调地址。
拉流转推任务相关事件会回调到该地址。 
     * @return CallbackUrl 自定义回调地址。
拉流转推任务相关事件会回调到该地址。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 自定义回调地址。
拉流转推任务相关事件会回调到该地址。
     * @param CallbackUrl 自定义回调地址。
拉流转推任务相关事件会回调到该地址。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 其他参数。
示例: ignore_region  用于忽略传入地域, 内部按负载分配。 
     * @return ExtraCmd 其他参数。
示例: ignore_region  用于忽略传入地域, 内部按负载分配。
     */
    public String getExtraCmd() {
        return this.ExtraCmd;
    }

    /**
     * Set 其他参数。
示例: ignore_region  用于忽略传入地域, 内部按负载分配。
     * @param ExtraCmd 其他参数。
示例: ignore_region  用于忽略传入地域, 内部按负载分配。
     */
    public void setExtraCmd(String ExtraCmd) {
        this.ExtraCmd = ExtraCmd;
    }

    /**
     * Get 任务描述，限制 512 字节。 
     * @return Comment 任务描述，限制 512 字节。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 任务描述，限制 512 字节。
     * @param Comment 任务描述，限制 512 字节。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 完整目标 URL 地址。
用法注意：如果使用该参数来传完整目标地址，则 DomainName, AppName, StreamName 需要传入空值，任务将会使用该 ToUrl 参数指定的目标地址。

注意：签名时间需要超过任务结束时间，避免因签名过期造成任务失败。 
     * @return ToUrl 完整目标 URL 地址。
用法注意：如果使用该参数来传完整目标地址，则 DomainName, AppName, StreamName 需要传入空值，任务将会使用该 ToUrl 参数指定的目标地址。

注意：签名时间需要超过任务结束时间，避免因签名过期造成任务失败。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set 完整目标 URL 地址。
用法注意：如果使用该参数来传完整目标地址，则 DomainName, AppName, StreamName 需要传入空值，任务将会使用该 ToUrl 参数指定的目标地址。

注意：签名时间需要超过任务结束时间，避免因签名过期造成任务失败。
     * @param ToUrl 完整目标 URL 地址。
用法注意：如果使用该参数来传完整目标地址，则 DomainName, AppName, StreamName 需要传入空值，任务将会使用该 ToUrl 参数指定的目标地址。

注意：签名时间需要超过任务结束时间，避免因签名过期造成任务失败。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 主直播源拉流中断时，自动使用备源进行拉流。
3. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。 
     * @return BackupSourceType 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 主直播源拉流中断时，自动使用备源进行拉流。
3. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
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
2. 主直播源拉流中断时，自动使用备源进行拉流。
3. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
     * @param BackupSourceType 备源的类型：
PullLivePushLive -直播，
PullVodPushLive -点播。
注意：
1. 仅当主源类型为直播源时，备源才会生效。
2. 主直播源拉流中断时，自动使用备源进行拉流。
3. 如果备源为点播文件时，则每次轮播完点播文件就检查主源是否恢复，如果主源恢复则自动切回到主源，否则继续拉备源。
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

    public CreateLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLivePullStreamTaskRequest(CreateLivePullStreamTaskRequest source) {
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.PushArgs != null) {
            this.PushArgs = new String(source.PushArgs);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new String(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ExtraCmd != null) {
            this.ExtraCmd = new String(source.ExtraCmd);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
        }
        if (source.BackupSourceType != null) {
            this.BackupSourceType = new String(source.BackupSourceType);
        }
        if (source.BackupSourceUrl != null) {
            this.BackupSourceUrl = new String(source.BackupSourceUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "PushArgs", this.PushArgs);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ExtraCmd", this.ExtraCmd);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "BackupSourceType", this.BackupSourceType);
        this.setParamSimple(map, prefix + "BackupSourceUrl", this.BackupSourceUrl);

    }
}

