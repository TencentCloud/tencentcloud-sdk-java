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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDlcDeliverRequest extends AbstractModel {

    /**
    * <p>日志主题id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>投递类型。0:批投递,1:实时投递</p>
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * <p>投递时间范围的开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>dlc配置信息</p>
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * <p>投递文件大小,单位MB。 DeliverType=0时必填，范围 5&lt;= MaxSize &lt;= 256。</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>投递间隔，单位秒。 DeliverType=0时必填，范围 300&lt;= Interval &lt;=900。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>是否开启投递服务日志。1关闭，2开启。默认开启</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>日志主题id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。</p> 
     * @return Name <p>名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。</p>
     * @param Name <p>名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>投递类型。0:批投递,1:实时投递</p> 
     * @return DeliverType <p>投递类型。0:批投递,1:实时投递</p>
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>投递类型。0:批投递,1:实时投递</p>
     * @param DeliverType <p>投递类型。0:批投递,1:实时投递</p>
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get <p>投递时间范围的开始时间</p> 
     * @return StartTime <p>投递时间范围的开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>投递时间范围的开始时间</p>
     * @param StartTime <p>投递时间范围的开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>dlc配置信息</p> 
     * @return DlcInfo <p>dlc配置信息</p>
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set <p>dlc配置信息</p>
     * @param DlcInfo <p>dlc配置信息</p>
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get <p>投递文件大小,单位MB。 DeliverType=0时必填，范围 5&lt;= MaxSize &lt;= 256。</p> 
     * @return MaxSize <p>投递文件大小,单位MB。 DeliverType=0时必填，范围 5&lt;= MaxSize &lt;= 256。</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>投递文件大小,单位MB。 DeliverType=0时必填，范围 5&lt;= MaxSize &lt;= 256。</p>
     * @param MaxSize <p>投递文件大小,单位MB。 DeliverType=0时必填，范围 5&lt;= MaxSize &lt;= 256。</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>投递间隔，单位秒。 DeliverType=0时必填，范围 300&lt;= Interval &lt;=900。</p> 
     * @return Interval <p>投递间隔，单位秒。 DeliverType=0时必填，范围 300&lt;= Interval &lt;=900。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>投递间隔，单位秒。 DeliverType=0时必填，范围 300&lt;= Interval &lt;=900。</p>
     * @param Interval <p>投递间隔，单位秒。 DeliverType=0时必填，范围 300&lt;= Interval &lt;=900。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。</p> 
     * @return EndTime <p>投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。</p>
     * @param EndTime <p>投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>是否开启投递服务日志。1关闭，2开启。默认开启</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1关闭，2开启。默认开启</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1关闭，2开启。默认开启</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1关闭，2开启。默认开启</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public CreateDlcDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDlcDeliverRequest(CreateDlcDeliverRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new Long(source.DeliverType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.DlcInfo != null) {
            this.DlcInfo = new DlcInfo(source.DlcInfo);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamObj(map, prefix + "DlcInfo.", this.DlcInfo);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

