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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitingRule extends AbstractModel {

    /**
    * <p>精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>精准速率限制的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>精准速率限制的具体内容，需符合表达式语法，详细规范参见<a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a>。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>限速方式。在统计时间窗口 CountingPeriod 内，对满足特征 CountBy 的请求，支持配置以下限速方式：<li>Block: 阻断访问源。当统计次数超过阈值 MaxRequestThreshold 时，在 ActionDuration 时长内，对满足特征的所有后续请求执行 Action 处置；</li><li>Throttle: 仅处置超额请求。当统计次数超过阈值 MaxRequestThreshold 时，仅对超过阈值的请求执行 Action 处置，窗口结束后停止处置。此时，ActionDuration 参数将被忽略。</li><br>默认值为 Block。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br><br>当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies[&#39;session&#39;]</b>：名称为 session 的 Cookie，其中 session 可替换为自己指定的参数；</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>：名称为 user-agent 的 HTTP 头部，其中 user-agent 可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的 JA3 指纹；</li><li><b>http.request.ja4</b>：请求的 JA4 指纹；</li><li><b>http.request.uri.query[&#39;test&#39;]</b>：名称为 test 的 URL 查询参数，其中 test 可替换为自己指定的参数。</li></p>
    */
    @SerializedName("CountBy")
    @Expose
    private String [] CountBy;

    /**
    * <p>精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。</p>
    */
    @SerializedName("MaxRequestThreshold")
    @Expose
    private Long MaxRequestThreshold;

    /**
    * <p>统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li></p>
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * <p>Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li><br>当 Mode 为 Throttle 时，此参数将被忽略，不会生效。</p>
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
    * <p>精准速率限制的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * <p>精准速率限制的优先级，范围是 0 ~ 100，默认为 0。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get <p>精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p> 
     * @return Id <p>精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     * @param Id <p>精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>精准速率限制的名称。</p> 
     * @return Name <p>精准速率限制的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>精准速率限制的名称。</p>
     * @param Name <p>精准速率限制的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>精准速率限制的具体内容，需符合表达式语法，详细规范参见<a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a>。</p> 
     * @return Condition <p>精准速率限制的具体内容，需符合表达式语法，详细规范参见<a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a>。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>精准速率限制的具体内容，需符合表达式语法，详细规范参见<a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a>。</p>
     * @param Condition <p>精准速率限制的具体内容，需符合表达式语法，详细规范参见<a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a>。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>限速方式。在统计时间窗口 CountingPeriod 内，对满足特征 CountBy 的请求，支持配置以下限速方式：<li>Block: 阻断访问源。当统计次数超过阈值 MaxRequestThreshold 时，在 ActionDuration 时长内，对满足特征的所有后续请求执行 Action 处置；</li><li>Throttle: 仅处置超额请求。当统计次数超过阈值 MaxRequestThreshold 时，仅对超过阈值的请求执行 Action 处置，窗口结束后停止处置。此时，ActionDuration 参数将被忽略。</li><br>默认值为 Block。</p> 
     * @return Mode <p>限速方式。在统计时间窗口 CountingPeriod 内，对满足特征 CountBy 的请求，支持配置以下限速方式：<li>Block: 阻断访问源。当统计次数超过阈值 MaxRequestThreshold 时，在 ActionDuration 时长内，对满足特征的所有后续请求执行 Action 处置；</li><li>Throttle: 仅处置超额请求。当统计次数超过阈值 MaxRequestThreshold 时，仅对超过阈值的请求执行 Action 处置，窗口结束后停止处置。此时，ActionDuration 参数将被忽略。</li><br>默认值为 Block。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>限速方式。在统计时间窗口 CountingPeriod 内，对满足特征 CountBy 的请求，支持配置以下限速方式：<li>Block: 阻断访问源。当统计次数超过阈值 MaxRequestThreshold 时，在 ActionDuration 时长内，对满足特征的所有后续请求执行 Action 处置；</li><li>Throttle: 仅处置超额请求。当统计次数超过阈值 MaxRequestThreshold 时，仅对超过阈值的请求执行 Action 处置，窗口结束后停止处置。此时，ActionDuration 参数将被忽略。</li><br>默认值为 Block。</p>
     * @param Mode <p>限速方式。在统计时间窗口 CountingPeriod 内，对满足特征 CountBy 的请求，支持配置以下限速方式：<li>Block: 阻断访问源。当统计次数超过阈值 MaxRequestThreshold 时，在 ActionDuration 时长内，对满足特征的所有后续请求执行 Action 处置；</li><li>Throttle: 仅处置超额请求。当统计次数超过阈值 MaxRequestThreshold 时，仅对超过阈值的请求执行 Action 处置，窗口结束后停止处置。此时，ActionDuration 参数将被忽略。</li><br>默认值为 Block。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br><br>当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies[&#39;session&#39;]</b>：名称为 session 的 Cookie，其中 session 可替换为自己指定的参数；</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>：名称为 user-agent 的 HTTP 头部，其中 user-agent 可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的 JA3 指纹；</li><li><b>http.request.ja4</b>：请求的 JA4 指纹；</li><li><b>http.request.uri.query[&#39;test&#39;]</b>：名称为 test 的 URL 查询参数，其中 test 可替换为自己指定的参数。</li></p> 
     * @return CountBy <p>速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br><br>当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies[&#39;session&#39;]</b>：名称为 session 的 Cookie，其中 session 可替换为自己指定的参数；</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>：名称为 user-agent 的 HTTP 头部，其中 user-agent 可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的 JA3 指纹；</li><li><b>http.request.ja4</b>：请求的 JA4 指纹；</li><li><b>http.request.uri.query[&#39;test&#39;]</b>：名称为 test 的 URL 查询参数，其中 test 可替换为自己指定的参数。</li></p>
     */
    public String [] getCountBy() {
        return this.CountBy;
    }

    /**
     * Set <p>速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br><br>当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies[&#39;session&#39;]</b>：名称为 session 的 Cookie，其中 session 可替换为自己指定的参数；</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>：名称为 user-agent 的 HTTP 头部，其中 user-agent 可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的 JA3 指纹；</li><li><b>http.request.ja4</b>：请求的 JA4 指纹；</li><li><b>http.request.uri.query[&#39;test&#39;]</b>：名称为 test 的 URL 查询参数，其中 test 可替换为自己指定的参数。</li></p>
     * @param CountBy <p>速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br><br>当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies[&#39;session&#39;]</b>：名称为 session 的 Cookie，其中 session 可替换为自己指定的参数；</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>：名称为 user-agent 的 HTTP 头部，其中 user-agent 可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的 JA3 指纹；</li><li><b>http.request.ja4</b>：请求的 JA4 指纹；</li><li><b>http.request.uri.query[&#39;test&#39;]</b>：名称为 test 的 URL 查询参数，其中 test 可替换为自己指定的参数。</li></p>
     */
    public void setCountBy(String [] CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get <p>精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。</p> 
     * @return MaxRequestThreshold <p>精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。</p>
     */
    public Long getMaxRequestThreshold() {
        return this.MaxRequestThreshold;
    }

    /**
     * Set <p>精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。</p>
     * @param MaxRequestThreshold <p>精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。</p>
     */
    public void setMaxRequestThreshold(Long MaxRequestThreshold) {
        this.MaxRequestThreshold = MaxRequestThreshold;
    }

    /**
     * Get <p>统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li></p> 
     * @return CountingPeriod <p>统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li></p>
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set <p>统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li></p>
     * @param CountingPeriod <p>统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li></p>
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get <p>Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li><br>当 Mode 为 Throttle 时，此参数将被忽略，不会生效。</p> 
     * @return ActionDuration <p>Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li><br>当 Mode 为 Throttle 时，此参数将被忽略，不会生效。</p>
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set <p>Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li><br>当 Mode 为 Throttle 时，此参数将被忽略，不会生效。</p>
     * @param ActionDuration <p>Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li><br>当 Mode 为 Throttle 时，此参数将被忽略，不会生效。</p>
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    /**
     * Get <p>精准速率限制的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul> 
     * @return Action <p>精准速率限制的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set <p>精准速率限制的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     * @param Action <p>精准速率限制的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get <p>精准速率限制的优先级，范围是 0 ~ 100，默认为 0。</p> 
     * @return Priority <p>精准速率限制的优先级，范围是 0 ~ 100，默认为 0。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>精准速率限制的优先级，范围是 0 ~ 100，默认为 0。</p>
     * @param Priority <p>精准速率限制的优先级，范围是 0 ~ 100，默认为 0。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p> 
     * @return Enabled <p>精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     * @param Enabled <p>精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public RateLimitingRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitingRule(RateLimitingRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.CountBy != null) {
            this.CountBy = new String[source.CountBy.length];
            for (int i = 0; i < source.CountBy.length; i++) {
                this.CountBy[i] = new String(source.CountBy[i]);
            }
        }
        if (source.MaxRequestThreshold != null) {
            this.MaxRequestThreshold = new Long(source.MaxRequestThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.ActionDuration != null) {
            this.ActionDuration = new String(source.ActionDuration);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "CountBy.", this.CountBy);
        this.setParamSimple(map, prefix + "MaxRequestThreshold", this.MaxRequestThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

