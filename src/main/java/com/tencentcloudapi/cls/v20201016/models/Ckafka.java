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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ckafka extends AbstractModel{

    /**
    * Ckafka 的 Vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Ckafka 的 Vport
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Ckafka 的 InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Ckafka 的 InstanceName
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Ckafka 的 TopicId
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Ckafka 的 TopicName
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Ckafka 的 Vip 
     * @return Vip Ckafka 的 Vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Ckafka 的 Vip
     * @param Vip Ckafka 的 Vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Ckafka 的 Vport 
     * @return Vport Ckafka 的 Vport
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Ckafka 的 Vport
     * @param Vport Ckafka 的 Vport
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Ckafka 的 InstanceId 
     * @return InstanceId Ckafka 的 InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Ckafka 的 InstanceId
     * @param InstanceId Ckafka 的 InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Ckafka 的 InstanceName 
     * @return InstanceName Ckafka 的 InstanceName
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Ckafka 的 InstanceName
     * @param InstanceName Ckafka 的 InstanceName
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Ckafka 的 TopicId 
     * @return TopicId Ckafka 的 TopicId
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Ckafka 的 TopicId
     * @param TopicId Ckafka 的 TopicId
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Ckafka 的 TopicName 
     * @return TopicName Ckafka 的 TopicName
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Ckafka 的 TopicName
     * @param TopicName Ckafka 的 TopicName
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public Ckafka() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ckafka(Ckafka source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

