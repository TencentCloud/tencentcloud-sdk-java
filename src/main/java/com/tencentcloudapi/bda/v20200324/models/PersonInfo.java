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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo extends AbstractModel {

    /**
    * 人员名称。
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员ID。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 包含的人体动作轨迹图片信息列表。
    */
    @SerializedName("TraceInfos")
    @Expose
    private TraceInfo [] TraceInfos;

    /**
     * Get 人员名称。 
     * @return PersonName 人员名称。
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称。
     * @param PersonName 人员名称。
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员ID。 
     * @return PersonId 人员ID。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID。
     * @param PersonId 人员ID。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 包含的人体动作轨迹图片信息列表。 
     * @return TraceInfos 包含的人体动作轨迹图片信息列表。
     */
    public TraceInfo [] getTraceInfos() {
        return this.TraceInfos;
    }

    /**
     * Set 包含的人体动作轨迹图片信息列表。
     * @param TraceInfos 包含的人体动作轨迹图片信息列表。
     */
    public void setTraceInfos(TraceInfo [] TraceInfos) {
        this.TraceInfos = TraceInfos;
    }

    public PersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonInfo(PersonInfo source) {
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.TraceInfos != null) {
            this.TraceInfos = new TraceInfo[source.TraceInfos.length];
            for (int i = 0; i < source.TraceInfos.length; i++) {
                this.TraceInfos[i] = new TraceInfo(source.TraceInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArrayObj(map, prefix + "TraceInfos.", this.TraceInfos);

    }
}

