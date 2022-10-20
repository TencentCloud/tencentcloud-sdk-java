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

public class CKafkaInstanceInfo extends AbstractModel{

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private CKafkaTopicInfo [] TopicList;

    /**
    * 路由列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteList")
    @Expose
    private CkafkaRouteInfo [] RouteList;

    /**
    * kafka版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 主题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CKafkaTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(CKafkaTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get 路由列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteList 路由列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CkafkaRouteInfo [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set 路由列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteList 路由列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteList(CkafkaRouteInfo [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get kafka版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVersion kafka版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set kafka版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVersion kafka版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    public CKafkaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaInstanceInfo(CKafkaInstanceInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicList != null) {
            this.TopicList = new CKafkaTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new CKafkaTopicInfo(source.TopicList[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new CkafkaRouteInfo[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new CkafkaRouteInfo(source.RouteList[i]);
            }
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);

    }
}

