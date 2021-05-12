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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LookUpEventsResponse extends AbstractModel{

    /**
    * 查看更多日志的凭证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 日志集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Events")
    @Expose
    private Event [] Events;

    /**
    * 日志集合是否结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查看更多日志的凭证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextToken 查看更多日志的凭证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查看更多日志的凭证
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextToken 查看更多日志的凭证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 日志集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Events 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Event [] getEvents() {
        return this.Events;
    }

    /**
     * Set 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Events 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvents(Event [] Events) {
        this.Events = Events;
    }

    /**
     * Get 日志集合是否结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListOver 日志集合是否结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 日志集合是否结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListOver 日志集合是否结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public LookUpEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LookUpEventsResponse(LookUpEventsResponse source) {
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Events != null) {
            this.Events = new Event[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new Event(source.Events[i]);
            }
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

