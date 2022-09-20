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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogTopicTaskRequest extends AbstractModel{

    /**
    * 日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志集所属的地域。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * 日志集主题名。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 推送任务的名称。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 数据推送类型，取值有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 日志主题保存时间，单位为天，取值范围为：1-366。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 推送任务实体列表。
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>不填将根据用户的地域智能选择加速区域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 日志集ID。 
     * @return LogSetId 日志集ID。
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志集ID。
     * @param LogSetId 日志集ID。
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志集所属的地域。 
     * @return LogSetRegion 日志集所属的地域。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 日志集所属的地域。
     * @param LogSetRegion 日志集所属的地域。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get 日志集主题名。 
     * @return TopicName 日志集主题名。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志集主题名。
     * @param TopicName 日志集主题名。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 推送任务的名称。 
     * @return TaskName 推送任务的名称。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 推送任务的名称。
     * @param TaskName 推送任务的名称。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 数据推送类型，取值有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li> 
     * @return EntityType 数据推送类型，取值有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 数据推送类型，取值有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     * @param EntityType 数据推送类型，取值有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 日志主题保存时间，单位为天，取值范围为：1-366。 
     * @return Period 日志主题保存时间，单位为天，取值范围为：1-366。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志主题保存时间，单位为天，取值范围为：1-366。
     * @param Period 日志主题保存时间，单位为天，取值范围为：1-366。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 推送任务实体列表。 
     * @return EntityList 推送任务实体列表。
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set 推送任务实体列表。
     * @param EntityList 推送任务实体列表。
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get 加速区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>不填将根据用户的地域智能选择加速区域。 
     * @return Area 加速区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>不填将根据用户的地域智能选择加速区域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>不填将根据用户的地域智能选择加速区域。
     * @param Area 加速区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>不填将根据用户的地域智能选择加速区域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public CreateLogTopicTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogTopicTaskRequest(CreateLogTopicTaskRequest source) {
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

