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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafeInfoResponse extends AbstractModel {

    /**
    * <p>文本内容</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>超链接地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>受影响机器数</p>
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * <p>受影响事件名称</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>受影响事件类型 0 无 1 木马 2 漏洞 3基线</p>
    */
    @SerializedName("EventCategory")
    @Expose
    private Long EventCategory;

    /**
    * <p>是否展示通知</p>
    */
    @SerializedName("IsShow")
    @Expose
    private Boolean IsShow;

    /**
    * <p>Id值</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文本内容</p> 
     * @return Context <p>文本内容</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>文本内容</p>
     * @param Context <p>文本内容</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>超链接地址</p> 
     * @return Url <p>超链接地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>超链接地址</p>
     * @param Url <p>超链接地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>受影响机器数</p> 
     * @return EffectHostCount <p>受影响机器数</p>
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set <p>受影响机器数</p>
     * @param EffectHostCount <p>受影响机器数</p>
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get <p>受影响事件名称</p> 
     * @return EventName <p>受影响事件名称</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>受影响事件名称</p>
     * @param EventName <p>受影响事件名称</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>受影响事件类型 0 无 1 木马 2 漏洞 3基线</p> 
     * @return EventCategory <p>受影响事件类型 0 无 1 木马 2 漏洞 3基线</p>
     */
    public Long getEventCategory() {
        return this.EventCategory;
    }

    /**
     * Set <p>受影响事件类型 0 无 1 木马 2 漏洞 3基线</p>
     * @param EventCategory <p>受影响事件类型 0 无 1 木马 2 漏洞 3基线</p>
     */
    public void setEventCategory(Long EventCategory) {
        this.EventCategory = EventCategory;
    }

    /**
     * Get <p>是否展示通知</p> 
     * @return IsShow <p>是否展示通知</p>
     */
    public Boolean getIsShow() {
        return this.IsShow;
    }

    /**
     * Set <p>是否展示通知</p>
     * @param IsShow <p>是否展示通知</p>
     */
    public void setIsShow(Boolean IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get <p>Id值</p> 
     * @return Id <p>Id值</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Id值</p>
     * @param Id <p>Id值</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    public DescribeSafeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafeInfoResponse(DescribeSafeInfoResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventCategory != null) {
            this.EventCategory = new Long(source.EventCategory);
        }
        if (source.IsShow != null) {
            this.IsShow = new Boolean(source.IsShow);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventCategory", this.EventCategory);
        this.setParamSimple(map, prefix + "IsShow", this.IsShow);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

