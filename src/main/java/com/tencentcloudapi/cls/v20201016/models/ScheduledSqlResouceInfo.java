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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledSqlResouceInfo extends AbstractModel {

    /**
    * 目标主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题的地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 主题类型：0为日志主题，1为指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标名称
BizType为1时，优先使用MetricNames字段多指标只能填充到MetricNames字段，单指标建议填充到MetricName字段
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 指标标签，从SQL结果字段中选择，一般是分组(group by) 的字段。
    */
    @SerializedName("MetricLabels")
    @Expose
    private String [] MetricLabels;

    /**
    * 指标时间戳，默认值为SQL查询时间范围的左侧时间点，您也可以指定其他字段（类型为uinx时间，精度毫秒）为指标时间戳。
    */
    @SerializedName("CustomTime")
    @Expose
    private String CustomTime;

    /**
    * 除了MetricLabels，您还可以使用该参数，为指标补充静态的标签。
    */
    @SerializedName("CustomMetricLabels")
    @Expose
    private MetricLabel [] CustomMetricLabels;

    /**
     * Get 目标主题id 
     * @return TopicId 目标主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 目标主题id
     * @param TopicId 目标主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题的地域信息 
     * @return Region 主题的地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 主题的地域信息
     * @param Region 主题的地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 主题类型：0为日志主题，1为指标主题 
     * @return BizType 主题类型：0为日志主题，1为指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 主题类型：0为日志主题，1为指标主题
     * @param BizType 主题类型：0为日志主题，1为指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标名称
BizType为1时，优先使用MetricNames字段多指标只能填充到MetricNames字段，单指标建议填充到MetricName字段 
     * @return MetricNames 指标名称
BizType为1时，优先使用MetricNames字段多指标只能填充到MetricNames字段，单指标建议填充到MetricName字段
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 指标名称
BizType为1时，优先使用MetricNames字段多指标只能填充到MetricNames字段，单指标建议填充到MetricName字段
     * @param MetricNames 指标名称
BizType为1时，优先使用MetricNames字段多指标只能填充到MetricNames字段，单指标建议填充到MetricName字段
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 指标标签，从SQL结果字段中选择，一般是分组(group by) 的字段。 
     * @return MetricLabels 指标标签，从SQL结果字段中选择，一般是分组(group by) 的字段。
     */
    public String [] getMetricLabels() {
        return this.MetricLabels;
    }

    /**
     * Set 指标标签，从SQL结果字段中选择，一般是分组(group by) 的字段。
     * @param MetricLabels 指标标签，从SQL结果字段中选择，一般是分组(group by) 的字段。
     */
    public void setMetricLabels(String [] MetricLabels) {
        this.MetricLabels = MetricLabels;
    }

    /**
     * Get 指标时间戳，默认值为SQL查询时间范围的左侧时间点，您也可以指定其他字段（类型为uinx时间，精度毫秒）为指标时间戳。 
     * @return CustomTime 指标时间戳，默认值为SQL查询时间范围的左侧时间点，您也可以指定其他字段（类型为uinx时间，精度毫秒）为指标时间戳。
     */
    public String getCustomTime() {
        return this.CustomTime;
    }

    /**
     * Set 指标时间戳，默认值为SQL查询时间范围的左侧时间点，您也可以指定其他字段（类型为uinx时间，精度毫秒）为指标时间戳。
     * @param CustomTime 指标时间戳，默认值为SQL查询时间范围的左侧时间点，您也可以指定其他字段（类型为uinx时间，精度毫秒）为指标时间戳。
     */
    public void setCustomTime(String CustomTime) {
        this.CustomTime = CustomTime;
    }

    /**
     * Get 除了MetricLabels，您还可以使用该参数，为指标补充静态的标签。 
     * @return CustomMetricLabels 除了MetricLabels，您还可以使用该参数，为指标补充静态的标签。
     */
    public MetricLabel [] getCustomMetricLabels() {
        return this.CustomMetricLabels;
    }

    /**
     * Set 除了MetricLabels，您还可以使用该参数，为指标补充静态的标签。
     * @param CustomMetricLabels 除了MetricLabels，您还可以使用该参数，为指标补充静态的标签。
     */
    public void setCustomMetricLabels(MetricLabel [] CustomMetricLabels) {
        this.CustomMetricLabels = CustomMetricLabels;
    }

    public ScheduledSqlResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledSqlResouceInfo(ScheduledSqlResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.MetricLabels != null) {
            this.MetricLabels = new String[source.MetricLabels.length];
            for (int i = 0; i < source.MetricLabels.length; i++) {
                this.MetricLabels[i] = new String(source.MetricLabels[i]);
            }
        }
        if (source.CustomTime != null) {
            this.CustomTime = new String(source.CustomTime);
        }
        if (source.CustomMetricLabels != null) {
            this.CustomMetricLabels = new MetricLabel[source.CustomMetricLabels.length];
            for (int i = 0; i < source.CustomMetricLabels.length; i++) {
                this.CustomMetricLabels[i] = new MetricLabel(source.CustomMetricLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "MetricLabels.", this.MetricLabels);
        this.setParamSimple(map, prefix + "CustomTime", this.CustomTime);
        this.setParamArrayObj(map, prefix + "CustomMetricLabels.", this.CustomMetricLabels);

    }
}

