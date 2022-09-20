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

public class ModifyLogTopicTaskRequest extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 日志集所属地区。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * 日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 数据推送类型，可选的类型有：
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
    * 推送任务名。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 待更新的主题名称，不填表示不更新主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 更新后的日志集名称。
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * 更新后的日志集保存时间。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 待添加的推送任务实体列表。
    */
    @SerializedName("DropEntityList")
    @Expose
    private String [] DropEntityList;

    /**
    * 待删除的推送任务实例列表。
    */
    @SerializedName("AddedEntityList")
    @Expose
    private String [] AddedEntityList;

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
     * Get 日志集所属地区。 
     * @return LogSetRegion 日志集所属地区。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 日志集所属地区。
     * @param LogSetRegion 日志集所属地区。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

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
     * Get 日志主题ID。 
     * @return TopicId 日志主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。
     * @param TopicId 日志主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 数据推送类型，可选的类型有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li> 
     * @return EntityType 数据推送类型，可选的类型有：
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
     * Set 数据推送类型，可选的类型有：
<li>domain：七层代理日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制日志；</li>
<li>web-attack：Web攻击防护日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     * @param EntityType 数据推送类型，可选的类型有：
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
     * Get 推送任务名。 
     * @return TaskName 推送任务名。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 推送任务名。
     * @param TaskName 推送任务名。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 待更新的主题名称，不填表示不更新主题名称。 
     * @return TopicName 待更新的主题名称，不填表示不更新主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 待更新的主题名称，不填表示不更新主题名称。
     * @param TopicName 待更新的主题名称，不填表示不更新主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 更新后的日志集名称。 
     * @return LogSetName 更新后的日志集名称。
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set 更新后的日志集名称。
     * @param LogSetName 更新后的日志集名称。
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get 更新后的日志集保存时间。 
     * @return Period 更新后的日志集保存时间。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 更新后的日志集保存时间。
     * @param Period 更新后的日志集保存时间。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 待添加的推送任务实体列表。 
     * @return DropEntityList 待添加的推送任务实体列表。
     */
    public String [] getDropEntityList() {
        return this.DropEntityList;
    }

    /**
     * Set 待添加的推送任务实体列表。
     * @param DropEntityList 待添加的推送任务实体列表。
     */
    public void setDropEntityList(String [] DropEntityList) {
        this.DropEntityList = DropEntityList;
    }

    /**
     * Get 待删除的推送任务实例列表。 
     * @return AddedEntityList 待删除的推送任务实例列表。
     */
    public String [] getAddedEntityList() {
        return this.AddedEntityList;
    }

    /**
     * Set 待删除的推送任务实例列表。
     * @param AddedEntityList 待删除的推送任务实例列表。
     */
    public void setAddedEntityList(String [] AddedEntityList) {
        this.AddedEntityList = AddedEntityList;
    }

    public ModifyLogTopicTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogTopicTaskRequest(ModifyLogTopicTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.DropEntityList != null) {
            this.DropEntityList = new String[source.DropEntityList.length];
            for (int i = 0; i < source.DropEntityList.length; i++) {
                this.DropEntityList[i] = new String(source.DropEntityList[i]);
            }
        }
        if (source.AddedEntityList != null) {
            this.AddedEntityList = new String[source.AddedEntityList.length];
            for (int i = 0; i < source.AddedEntityList.length; i++) {
                this.AddedEntityList[i] = new String(source.AddedEntityList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "DropEntityList.", this.DropEntityList);
        this.setParamArraySimple(map, prefix + "AddedEntityList.", this.AddedEntityList);

    }
}

