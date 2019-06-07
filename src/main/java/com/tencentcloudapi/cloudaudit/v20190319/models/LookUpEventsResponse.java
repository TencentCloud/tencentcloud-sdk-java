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

public class LookUpEventsResponse  extends AbstractModel{

    /**
    * 日志集合
    */
    @SerializedName("Events")
    @Expose
    private Event [] Events;

    /**
    * 日志集合是否结束
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 查看更多日志的凭证
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取日志集合
     * @return Events 日志集合
     */
    public Event [] getEvents() {
        return this.Events;
    }

    /**
     * 设置日志集合
     * @param Events 日志集合
     */
    public void setEvents(Event [] Events) {
        this.Events = Events;
    }

    /**
     * 获取日志集合是否结束
     * @return ListOver 日志集合是否结束
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * 设置日志集合是否结束
     * @param ListOver 日志集合是否结束
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * 获取查看更多日志的凭证
     * @return NextToken 查看更多日志的凭证
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * 设置查看更多日志的凭证
     * @param NextToken 查看更多日志的凭证
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

