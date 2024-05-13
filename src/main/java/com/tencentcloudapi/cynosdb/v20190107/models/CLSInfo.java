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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSInfo extends AbstractModel {

    /**
    * 日志主题操作：可选create,reuse。
create:新增日志主题，使用TopicName创建日志主题。
reuse:使用已有日志主题，使用TopicId指定日志主题。
不允许使用已有日志主题且新建日志集的组合。
    */
    @SerializedName("TopicOperation")
    @Expose
    private String TopicOperation;

    /**
    * 日志集操作：可选create,reuse。
create:新增日志集，使用GroupName创建日志集。
reuse:使用已有日志集，使用GroupId指定日志集。
不允许使用已有日志主题且新建日志集的组合。
    */
    @SerializedName("GroupOperation")
    @Expose
    private String GroupOperation;

    /**
    * 日志投递地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志集id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 日志集name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 日志主题操作：可选create,reuse。
create:新增日志主题，使用TopicName创建日志主题。
reuse:使用已有日志主题，使用TopicId指定日志主题。
不允许使用已有日志主题且新建日志集的组合。 
     * @return TopicOperation 日志主题操作：可选create,reuse。
create:新增日志主题，使用TopicName创建日志主题。
reuse:使用已有日志主题，使用TopicId指定日志主题。
不允许使用已有日志主题且新建日志集的组合。
     */
    public String getTopicOperation() {
        return this.TopicOperation;
    }

    /**
     * Set 日志主题操作：可选create,reuse。
create:新增日志主题，使用TopicName创建日志主题。
reuse:使用已有日志主题，使用TopicId指定日志主题。
不允许使用已有日志主题且新建日志集的组合。
     * @param TopicOperation 日志主题操作：可选create,reuse。
create:新增日志主题，使用TopicName创建日志主题。
reuse:使用已有日志主题，使用TopicId指定日志主题。
不允许使用已有日志主题且新建日志集的组合。
     */
    public void setTopicOperation(String TopicOperation) {
        this.TopicOperation = TopicOperation;
    }

    /**
     * Get 日志集操作：可选create,reuse。
create:新增日志集，使用GroupName创建日志集。
reuse:使用已有日志集，使用GroupId指定日志集。
不允许使用已有日志主题且新建日志集的组合。 
     * @return GroupOperation 日志集操作：可选create,reuse。
create:新增日志集，使用GroupName创建日志集。
reuse:使用已有日志集，使用GroupId指定日志集。
不允许使用已有日志主题且新建日志集的组合。
     */
    public String getGroupOperation() {
        return this.GroupOperation;
    }

    /**
     * Set 日志集操作：可选create,reuse。
create:新增日志集，使用GroupName创建日志集。
reuse:使用已有日志集，使用GroupId指定日志集。
不允许使用已有日志主题且新建日志集的组合。
     * @param GroupOperation 日志集操作：可选create,reuse。
create:新增日志集，使用GroupName创建日志集。
reuse:使用已有日志集，使用GroupId指定日志集。
不允许使用已有日志主题且新建日志集的组合。
     */
    public void setGroupOperation(String GroupOperation) {
        this.GroupOperation = GroupOperation;
    }

    /**
     * Get 日志投递地域 
     * @return Region 日志投递地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 日志投递地域
     * @param Region 日志投递地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题name 
     * @return TopicName 日志主题name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题name
     * @param TopicName 日志主题name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志集id 
     * @return GroupId 日志集id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 日志集id
     * @param GroupId 日志集id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 日志集name 
     * @return GroupName 日志集name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 日志集name
     * @param GroupName 日志集name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public CLSInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSInfo(CLSInfo source) {
        if (source.TopicOperation != null) {
            this.TopicOperation = new String(source.TopicOperation);
        }
        if (source.GroupOperation != null) {
            this.GroupOperation = new String(source.GroupOperation);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicOperation", this.TopicOperation);
        this.setParamSimple(map, prefix + "GroupOperation", this.GroupOperation);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

