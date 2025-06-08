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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitingRule extends AbstractModel {

    /**
    * 精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 精准速率限制的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 精准速率限制的具体内容，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br /><br />当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br/><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies['session']</b>：名称为session的Cookie，其中session可替换为自己指定的参数；</li><li><b>http.request.headers['user-agent']</b>：名称为user-agent的HTTP头部，其中user-agent可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的JA3指纹；</li><li><b>http.request.uri.query['test']</b>：名称为test的URL查询参数，其中test可替换为自己指定的参数。</li> 
    */
    @SerializedName("CountBy")
    @Expose
    private String [] CountBy;

    /**
    * 精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。
    */
    @SerializedName("MaxRequestThreshold")
    @Expose
    private Long MaxRequestThreshold;

    /**
    * 统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li> 
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li>
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
    * 精准速率限制的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中DenyActionParameters.Name支持Deny和ReturnCustomPage；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name支持JSChallenge和ManagedChallenge；</li><li>Redirect：重定向至URL；</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * 精准速率限制的优先级，范围是 0 ~ 100，默认为 0。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li> 
     * @return Id 精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     * @param Id 精准速率限制的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：RateLimitingRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 精准速率限制的名称。 
     * @return Name 精准速率限制的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 精准速率限制的名称。
     * @param Name 精准速率限制的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 精准速率限制的具体内容，需符合表达式语法，详细规范参见产品文档。 
     * @return Condition 精准速率限制的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 精准速率限制的具体内容，需符合表达式语法，详细规范参见产品文档。
     * @param Condition 精准速率限制的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br /><br />当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br/><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies['session']</b>：名称为session的Cookie，其中session可替换为自己指定的参数；</li><li><b>http.request.headers['user-agent']</b>：名称为user-agent的HTTP头部，其中user-agent可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的JA3指纹；</li><li><b>http.request.uri.query['test']</b>：名称为test的URL查询参数，其中test可替换为自己指定的参数。</li>  
     * @return CountBy 速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br /><br />当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br/><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies['session']</b>：名称为session的Cookie，其中session可替换为自己指定的参数；</li><li><b>http.request.headers['user-agent']</b>：名称为user-agent的HTTP头部，其中user-agent可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的JA3指纹；</li><li><b>http.request.uri.query['test']</b>：名称为test的URL查询参数，其中test可替换为自己指定的参数。</li> 
     */
    public String [] getCountBy() {
        return this.CountBy;
    }

    /**
     * Set 速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br /><br />当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br/><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies['session']</b>：名称为session的Cookie，其中session可替换为自己指定的参数；</li><li><b>http.request.headers['user-agent']</b>：名称为user-agent的HTTP头部，其中user-agent可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的JA3指纹；</li><li><b>http.request.uri.query['test']</b>：名称为test的URL查询参数，其中test可替换为自己指定的参数。</li> 
     * @param CountBy 速率阈值请求特征的匹配方式， 当 Enabled 为 on 时，此字段必填。<br /><br />当条件有多个时，将组合多个条件共同进行统计计算，条件最多不可超过5条。取值有：<br/><li><b>http.request.ip</b>：客户端 IP；</li><li><b>http.request.xff_header_ip</b>：客户端 IP（优先匹配 XFF 头部）；</li><li><b>http.request.uri.path</b>：请求的访问路径；</li><li><b>http.request.cookies['session']</b>：名称为session的Cookie，其中session可替换为自己指定的参数；</li><li><b>http.request.headers['user-agent']</b>：名称为user-agent的HTTP头部，其中user-agent可替换为自己指定的参数；</li><li><b>http.request.ja3</b>：请求的JA3指纹；</li><li><b>http.request.uri.query['test']</b>：名称为test的URL查询参数，其中test可替换为自己指定的参数。</li> 
     */
    public void setCountBy(String [] CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get 精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。 
     * @return MaxRequestThreshold 精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。
     */
    public Long getMaxRequestThreshold() {
        return this.MaxRequestThreshold;
    }

    /**
     * Set 精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。
     * @param MaxRequestThreshold 精准速率限制在时间范围内的累计拦截次数，取值范围 1 ~ 100000。
     */
    public void setMaxRequestThreshold(Long MaxRequestThreshold) {
        this.MaxRequestThreshold = MaxRequestThreshold;
    }

    /**
     * Get 统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li>  
     * @return CountingPeriod 统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li> 
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set 统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li> 
     * @param CountingPeriod 统计的时间窗口，取值有：<li>1s：1秒；</li><li>5s：5秒；</li><li>10s：10秒；</li><li>20s：20秒；</li><li>30s：30秒；</li><li>40s：40秒；</li><li>50s：50秒；</li><li>1m：1分钟；</li><li>2m：2分钟；</li><li>5m：5分钟；</li><li>10m：10分钟；</li><li>1h：1小时。</li> 
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li> 
     * @return ActionDuration Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li>
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li>
     * @param ActionDuration Action 动作的持续时长，单位仅支持：<li>s：秒，取值 1 ~ 120；</li><li>m：分钟，取值 1 ~ 120；</li><li>h：小时，取值 1 ~ 48；</li><li>d：天，取值 1 ~ 30。</li>
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    /**
     * Get 精准速率限制的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中DenyActionParameters.Name支持Deny和ReturnCustomPage；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name支持JSChallenge和ManagedChallenge；</li><li>Redirect：重定向至URL；</li> 
     * @return Action 精准速率限制的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中DenyActionParameters.Name支持Deny和ReturnCustomPage；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name支持JSChallenge和ManagedChallenge；</li><li>Redirect：重定向至URL；</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 精准速率限制的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中DenyActionParameters.Name支持Deny和ReturnCustomPage；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name支持JSChallenge和ManagedChallenge；</li><li>Redirect：重定向至URL；</li>
     * @param Action 精准速率限制的处置方式。取值有：<li>Monitor：观察；</li><li>Deny：拦截，其中DenyActionParameters.Name支持Deny和ReturnCustomPage；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name支持JSChallenge和ManagedChallenge；</li><li>Redirect：重定向至URL；</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get 精准速率限制的优先级，范围是 0 ~ 100，默认为 0。 
     * @return Priority 精准速率限制的优先级，范围是 0 ~ 100，默认为 0。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 精准速率限制的优先级，范围是 0 ~ 100，默认为 0。
     * @param Priority 精准速率限制的优先级，范围是 0 ~ 100，默认为 0。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 精准速率限制规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
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
        this.setParamArraySimple(map, prefix + "CountBy.", this.CountBy);
        this.setParamSimple(map, prefix + "MaxRequestThreshold", this.MaxRequestThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

