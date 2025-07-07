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

public class CreatePersonRequest extends AbstractModel {

    /**
    * 待加入的人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员名称。[1，60]个字符，可修改，可重复。
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员ID，单个腾讯云账号下不可修改，不可重复。 
支持英文、数字、-%@#&_，，长度限制64B。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人体动作轨迹信息。
    */
    @SerializedName("Trace")
    @Expose
    private Trace Trace;

    /**
     * Get 待加入的人员库ID。 
     * @return GroupId 待加入的人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 待加入的人员库ID。
     * @param GroupId 待加入的人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员名称。[1，60]个字符，可修改，可重复。 
     * @return PersonName 人员名称。[1，60]个字符，可修改，可重复。
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称。[1，60]个字符，可修改，可重复。
     * @param PersonName 人员名称。[1，60]个字符，可修改，可重复。
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员ID，单个腾讯云账号下不可修改，不可重复。 
支持英文、数字、-%@#&_，，长度限制64B。 
     * @return PersonId 人员ID，单个腾讯云账号下不可修改，不可重复。 
支持英文、数字、-%@#&_，，长度限制64B。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，单个腾讯云账号下不可修改，不可重复。 
支持英文、数字、-%@#&_，，长度限制64B。
     * @param PersonId 人员ID，单个腾讯云账号下不可修改，不可重复。 
支持英文、数字、-%@#&_，，长度限制64B。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人体动作轨迹信息。 
     * @return Trace 人体动作轨迹信息。
     */
    public Trace getTrace() {
        return this.Trace;
    }

    /**
     * Set 人体动作轨迹信息。
     * @param Trace 人体动作轨迹信息。
     */
    public void setTrace(Trace Trace) {
        this.Trace = Trace;
    }

    public CreatePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonRequest(CreatePersonRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Trace != null) {
            this.Trace = new Trace(source.Trace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamObj(map, prefix + "Trace.", this.Trace);

    }
}

