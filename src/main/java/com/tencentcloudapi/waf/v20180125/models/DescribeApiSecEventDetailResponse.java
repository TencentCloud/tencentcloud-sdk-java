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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiSecEventDetailResponse extends AbstractModel {

    /**
    * <p>事件描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>事件基本信息</p>
    */
    @SerializedName("EventInfo")
    @Expose
    private ApiEvent EventInfo;

    /**
    * <p>攻击源详情</p>
    */
    @SerializedName("AttackSource")
    @Expose
    private ApiSecAttackSource [] AttackSource;

    /**
    * <p>变更历史</p>
    */
    @SerializedName("ChangeHistory")
    @Expose
    private ApiSecEventChange [] ChangeHistory;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>事件描述信息</p> 
     * @return Description <p>事件描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件描述信息</p>
     * @param Description <p>事件描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>事件基本信息</p> 
     * @return EventInfo <p>事件基本信息</p>
     */
    public ApiEvent getEventInfo() {
        return this.EventInfo;
    }

    /**
     * Set <p>事件基本信息</p>
     * @param EventInfo <p>事件基本信息</p>
     */
    public void setEventInfo(ApiEvent EventInfo) {
        this.EventInfo = EventInfo;
    }

    /**
     * Get <p>攻击源详情</p> 
     * @return AttackSource <p>攻击源详情</p>
     */
    public ApiSecAttackSource [] getAttackSource() {
        return this.AttackSource;
    }

    /**
     * Set <p>攻击源详情</p>
     * @param AttackSource <p>攻击源详情</p>
     */
    public void setAttackSource(ApiSecAttackSource [] AttackSource) {
        this.AttackSource = AttackSource;
    }

    /**
     * Get <p>变更历史</p> 
     * @return ChangeHistory <p>变更历史</p>
     */
    public ApiSecEventChange [] getChangeHistory() {
        return this.ChangeHistory;
    }

    /**
     * Set <p>变更历史</p>
     * @param ChangeHistory <p>变更历史</p>
     */
    public void setChangeHistory(ApiSecEventChange [] ChangeHistory) {
        this.ChangeHistory = ChangeHistory;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApiSecEventDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiSecEventDetailResponse(DescribeApiSecEventDetailResponse source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventInfo != null) {
            this.EventInfo = new ApiEvent(source.EventInfo);
        }
        if (source.AttackSource != null) {
            this.AttackSource = new ApiSecAttackSource[source.AttackSource.length];
            for (int i = 0; i < source.AttackSource.length; i++) {
                this.AttackSource[i] = new ApiSecAttackSource(source.AttackSource[i]);
            }
        }
        if (source.ChangeHistory != null) {
            this.ChangeHistory = new ApiSecEventChange[source.ChangeHistory.length];
            for (int i = 0; i < source.ChangeHistory.length; i++) {
                this.ChangeHistory[i] = new ApiSecEventChange(source.ChangeHistory[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "EventInfo.", this.EventInfo);
        this.setParamArrayObj(map, prefix + "AttackSource.", this.AttackSource);
        this.setParamArrayObj(map, prefix + "ChangeHistory.", this.ChangeHistory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

