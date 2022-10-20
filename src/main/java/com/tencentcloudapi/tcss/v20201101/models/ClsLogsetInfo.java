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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogsetInfo extends AbstractModel{

    /**
    * 日志集ID
    */
    @SerializedName("LogsetID")
    @Expose
    private String LogsetID;

    /**
    * 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * cls主题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private ClsTopicInfo [] TopicList;

    /**
     * Get 日志集ID 
     * @return LogsetID 日志集ID
     */
    public String getLogsetID() {
        return this.LogsetID;
    }

    /**
     * Set 日志集ID
     * @param LogsetID 日志集ID
     */
    public void setLogsetID(String LogsetID) {
        this.LogsetID = LogsetID;
    }

    /**
     * Get 日志集名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetName 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetName 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get cls主题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList cls主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClsTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set cls主题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList cls主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(ClsTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    public ClsLogsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogsetInfo(ClsLogsetInfo source) {
        if (source.LogsetID != null) {
            this.LogsetID = new String(source.LogsetID);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicList != null) {
            this.TopicList = new ClsTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new ClsTopicInfo(source.TopicList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetID", this.LogsetID);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);

    }
}

