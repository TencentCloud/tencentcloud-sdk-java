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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel {

    /**
    * 事件源的信息,新产品上报必须符合EB的规范
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 事件数据，内容由创建事件的系统来控制，当前datacontenttype仅支持application/json;charset=utf-8，所以该字段是json字符串
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 事件类型，可自定义，选填。云服务默认写 COS:Created:PostObject，用“：”分割类型字段
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件来源详细描述，可自定义，选填。云服务默认为标准qcs资源表示语法：qcs::dts:ap-guangzhou:appid/uin:xxx
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 事件发生的毫秒时间戳，
time.Now().UnixNano()/1e6
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 事件的地域信息，没有则默认是EB所在的地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用于描述事件状态，非必须，默认是""
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件的唯一id，用户侧主动上传则需要保证风格一致
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 事件源的信息,新产品上报必须符合EB的规范 
     * @return Source 事件源的信息,新产品上报必须符合EB的规范
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 事件源的信息,新产品上报必须符合EB的规范
     * @param Source 事件源的信息,新产品上报必须符合EB的规范
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 事件数据，内容由创建事件的系统来控制，当前datacontenttype仅支持application/json;charset=utf-8，所以该字段是json字符串 
     * @return Data 事件数据，内容由创建事件的系统来控制，当前datacontenttype仅支持application/json;charset=utf-8，所以该字段是json字符串
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 事件数据，内容由创建事件的系统来控制，当前datacontenttype仅支持application/json;charset=utf-8，所以该字段是json字符串
     * @param Data 事件数据，内容由创建事件的系统来控制，当前datacontenttype仅支持application/json;charset=utf-8，所以该字段是json字符串
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 事件类型，可自定义，选填。云服务默认写 COS:Created:PostObject，用“：”分割类型字段 
     * @return Type 事件类型，可自定义，选填。云服务默认写 COS:Created:PostObject，用“：”分割类型字段
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型，可自定义，选填。云服务默认写 COS:Created:PostObject，用“：”分割类型字段
     * @param Type 事件类型，可自定义，选填。云服务默认写 COS:Created:PostObject，用“：”分割类型字段
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件来源详细描述，可自定义，选填。云服务默认为标准qcs资源表示语法：qcs::dts:ap-guangzhou:appid/uin:xxx 
     * @return Subject 事件来源详细描述，可自定义，选填。云服务默认为标准qcs资源表示语法：qcs::dts:ap-guangzhou:appid/uin:xxx
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 事件来源详细描述，可自定义，选填。云服务默认为标准qcs资源表示语法：qcs::dts:ap-guangzhou:appid/uin:xxx
     * @param Subject 事件来源详细描述，可自定义，选填。云服务默认为标准qcs资源表示语法：qcs::dts:ap-guangzhou:appid/uin:xxx
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 事件发生的毫秒时间戳，
time.Now().UnixNano()/1e6 
     * @return Time 事件发生的毫秒时间戳，
time.Now().UnixNano()/1e6
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 事件发生的毫秒时间戳，
time.Now().UnixNano()/1e6
     * @param Time 事件发生的毫秒时间戳，
time.Now().UnixNano()/1e6
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 事件的地域信息，没有则默认是EB所在的地域信息 
     * @return Region 事件的地域信息，没有则默认是EB所在的地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 事件的地域信息，没有则默认是EB所在的地域信息
     * @param Region 事件的地域信息，没有则默认是EB所在的地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用于描述事件状态，非必须，默认是"" 
     * @return Status 用于描述事件状态，非必须，默认是""
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 用于描述事件状态，非必须，默认是""
     * @param Status 用于描述事件状态，非必须，默认是""
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件的唯一id，用户侧主动上传则需要保证风格一致 
     * @return Id 事件的唯一id，用户侧主动上传则需要保证风格一致
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 事件的唯一id，用户侧主动上传则需要保证风格一致
     * @param Id 事件的唯一id，用户侧主动上传则需要保证风格一致
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 标签列表 
     * @return TagList 标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签列表
     * @param TagList 标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

