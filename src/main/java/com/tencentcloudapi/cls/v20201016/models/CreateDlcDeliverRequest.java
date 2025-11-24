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
    * 日志主题id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 投递类型。0:批投递,1:实时投递
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * 投递时间范围的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * dlc配置信息
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * 投递文件大小,单位MB。 DeliverType=0时必填，范围 5<= MaxSize <= 256。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 投递间隔，单位秒。 DeliverType=0时必填，范围 300<= Interval <=900。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 是否开启投递服务日志。1关闭，2开启。默认开启
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get 日志主题id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 日志主题id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 日志主题id。
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。 
     * @return Name 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     * @param Name 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 投递类型。0:批投递,1:实时投递 
     * @return DeliverType 投递类型。0:批投递,1:实时投递
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set 投递类型。0:批投递,1:实时投递
     * @param DeliverType 投递类型。0:批投递,1:实时投递
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get 投递时间范围的开始时间 
     * @return StartTime 投递时间范围的开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 投递时间范围的开始时间
     * @param StartTime 投递时间范围的开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get dlc配置信息 
     * @return DlcInfo dlc配置信息
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set dlc配置信息
     * @param DlcInfo dlc配置信息
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get 投递文件大小,单位MB。 DeliverType=0时必填，范围 5<= MaxSize <= 256。 
     * @return MaxSize 投递文件大小,单位MB。 DeliverType=0时必填，范围 5<= MaxSize <= 256。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 投递文件大小,单位MB。 DeliverType=0时必填，范围 5<= MaxSize <= 256。
     * @param MaxSize 投递文件大小,单位MB。 DeliverType=0时必填，范围 5<= MaxSize <= 256。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 投递间隔，单位秒。 DeliverType=0时必填，范围 300<= Interval <=900。 
     * @return Interval 投递间隔，单位秒。 DeliverType=0时必填，范围 300<= Interval <=900。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 投递间隔，单位秒。 DeliverType=0时必填，范围 300<= Interval <=900。
     * @param Interval 投递间隔，单位秒。 DeliverType=0时必填，范围 300<= Interval <=900。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。 
     * @return EndTime 投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。
     * @param EndTime 投递时间范围的结束时间。 如果为空，则表示不限时。EndTime不为空时，需要大于StartTime。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否开启投递服务日志。1关闭，2开启。默认开启 
     * @return HasServicesLog 是否开启投递服务日志。1关闭，2开启。默认开启
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set 是否开启投递服务日志。1关闭，2开启。默认开启
     * @param HasServicesLog 是否开启投递服务日志。1关闭，2开启。默认开启
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

