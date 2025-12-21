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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduledActionRequest extends AbstractModel {

    /**
    * 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * 当定时任务触发时，设置的伸缩组最小实例数。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 当定时任务触发时，设置的伸缩组期望实例数。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * 当定时任务触发时，设置的伸缩组最大实例数。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br><br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 定时任务的重复方式。为标准 Cron 格式。定时任务中的 [Recurrence参数限制](https://cloud.tencent.com/document/product/377/88119) 为5个字段，由空格分开，结构为：分，小时，日期，月份，星期。此参数与`EndTime`需要同时指定。
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * 停用期望数更新。默认值为 False，表示定时任务触发时期望实例数正常更新。
该值为 True 时，定时任务触发时不会主动修改期望实例数，但可能会因最大最小值机制修改期望实例数。
以下案例的前提都是停用期望数更新为 True：

- 定时任务触发时，原期望数为 5，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 5 小于最小值 10，最终新期望数为 10。
- 定时任务触发时，原期望数为 25，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 25 大于最大值 20，最终新期望数为 20。
- 定时任务触发时，原期望数为 13，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，期望数保持为 13 。
    */
    @SerializedName("DisableUpdateDesiredCapacity")
    @Expose
    private Boolean DisableUpdateDesiredCapacity;

    /**
     * Get 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li> 
     * @return AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     * @param AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。 
     * @return ScheduledActionName 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     * @param ScheduledActionName 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get 当定时任务触发时，设置的伸缩组最小实例数。 
     * @return MinSize 当定时任务触发时，设置的伸缩组最小实例数。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 当定时任务触发时，设置的伸缩组最小实例数。
     * @param MinSize 当定时任务触发时，设置的伸缩组最小实例数。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。 
     * @return StartTime 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     * @param StartTime 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 当定时任务触发时，设置的伸缩组期望实例数。 
     * @return DesiredCapacity 当定时任务触发时，设置的伸缩组期望实例数。
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set 当定时任务触发时，设置的伸缩组期望实例数。
     * @param DesiredCapacity 当定时任务触发时，设置的伸缩组期望实例数。
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get 当定时任务触发时，设置的伸缩组最大实例数。 
     * @return MaxSize 当定时任务触发时，设置的伸缩组最大实例数。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 当定时任务触发时，设置的伸缩组最大实例数。
     * @param MaxSize 当定时任务触发时，设置的伸缩组最大实例数。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br><br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。 
     * @return EndTime 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br><br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br><br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     * @param EndTime 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br><br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 定时任务的重复方式。为标准 Cron 格式。定时任务中的 [Recurrence参数限制](https://cloud.tencent.com/document/product/377/88119) 为5个字段，由空格分开，结构为：分，小时，日期，月份，星期。此参数与`EndTime`需要同时指定。 
     * @return Recurrence 定时任务的重复方式。为标准 Cron 格式。定时任务中的 [Recurrence参数限制](https://cloud.tencent.com/document/product/377/88119) 为5个字段，由空格分开，结构为：分，小时，日期，月份，星期。此参数与`EndTime`需要同时指定。
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set 定时任务的重复方式。为标准 Cron 格式。定时任务中的 [Recurrence参数限制](https://cloud.tencent.com/document/product/377/88119) 为5个字段，由空格分开，结构为：分，小时，日期，月份，星期。此参数与`EndTime`需要同时指定。
     * @param Recurrence 定时任务的重复方式。为标准 Cron 格式。定时任务中的 [Recurrence参数限制](https://cloud.tencent.com/document/product/377/88119) 为5个字段，由空格分开，结构为：分，小时，日期，月份，星期。此参数与`EndTime`需要同时指定。
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Get 停用期望数更新。默认值为 False，表示定时任务触发时期望实例数正常更新。
该值为 True 时，定时任务触发时不会主动修改期望实例数，但可能会因最大最小值机制修改期望实例数。
以下案例的前提都是停用期望数更新为 True：

- 定时任务触发时，原期望数为 5，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 5 小于最小值 10，最终新期望数为 10。
- 定时任务触发时，原期望数为 25，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 25 大于最大值 20，最终新期望数为 20。
- 定时任务触发时，原期望数为 13，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，期望数保持为 13 。 
     * @return DisableUpdateDesiredCapacity 停用期望数更新。默认值为 False，表示定时任务触发时期望实例数正常更新。
该值为 True 时，定时任务触发时不会主动修改期望实例数，但可能会因最大最小值机制修改期望实例数。
以下案例的前提都是停用期望数更新为 True：

- 定时任务触发时，原期望数为 5，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 5 小于最小值 10，最终新期望数为 10。
- 定时任务触发时，原期望数为 25，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 25 大于最大值 20，最终新期望数为 20。
- 定时任务触发时，原期望数为 13，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，期望数保持为 13 。
     */
    public Boolean getDisableUpdateDesiredCapacity() {
        return this.DisableUpdateDesiredCapacity;
    }

    /**
     * Set 停用期望数更新。默认值为 False，表示定时任务触发时期望实例数正常更新。
该值为 True 时，定时任务触发时不会主动修改期望实例数，但可能会因最大最小值机制修改期望实例数。
以下案例的前提都是停用期望数更新为 True：

- 定时任务触发时，原期望数为 5，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 5 小于最小值 10，最终新期望数为 10。
- 定时任务触发时，原期望数为 25，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 25 大于最大值 20，最终新期望数为 20。
- 定时任务触发时，原期望数为 13，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，期望数保持为 13 。
     * @param DisableUpdateDesiredCapacity 停用期望数更新。默认值为 False，表示定时任务触发时期望实例数正常更新。
该值为 True 时，定时任务触发时不会主动修改期望实例数，但可能会因最大最小值机制修改期望实例数。
以下案例的前提都是停用期望数更新为 True：

- 定时任务触发时，原期望数为 5，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 5 小于最小值 10，最终新期望数为 10。
- 定时任务触发时，原期望数为 25，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，但原期望数 25 大于最大值 20，最终新期望数为 20。
- 定时任务触发时，原期望数为 13，定时任务将最小值改为 10，最大值改为 20，期望数改为 15，由于停用期望数更新，15不生效，期望数保持为 13 。
     */
    public void setDisableUpdateDesiredCapacity(Boolean DisableUpdateDesiredCapacity) {
        this.DisableUpdateDesiredCapacity = DisableUpdateDesiredCapacity;
    }

    public CreateScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledActionRequest(CreateScheduledActionRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ScheduledActionName != null) {
            this.ScheduledActionName = new String(source.ScheduledActionName);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
        if (source.DisableUpdateDesiredCapacity != null) {
            this.DisableUpdateDesiredCapacity = new Boolean(source.DisableUpdateDesiredCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "DisableUpdateDesiredCapacity", this.DisableUpdateDesiredCapacity);

    }
}

