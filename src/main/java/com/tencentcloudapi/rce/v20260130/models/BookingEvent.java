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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BookingEvent extends AbstractModel {

    /**
    * <p>预约场景。例如：预订机票、预订酒店</p>
    */
    @SerializedName("BookingScene")
    @Expose
    private String BookingScene;

    /**
    * <p>预约时间。要求符合ISO-8601标准的带时区的毫秒级时间，格式&quot;YYYY-MM-DDTHH:mm:ss.sssZ&quot; ，例如&quot;2025-10-19T09:11:10.145+08:00&quot;。</p>
    */
    @SerializedName("BookingTime")
    @Expose
    private String BookingTime;

    /**
    * <p>预约单唯一ID。</p>
    */
    @SerializedName("BookingId")
    @Expose
    private String BookingId;

    /**
    * <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>预约场景。例如：预订机票、预订酒店</p> 
     * @return BookingScene <p>预约场景。例如：预订机票、预订酒店</p>
     */
    public String getBookingScene() {
        return this.BookingScene;
    }

    /**
     * Set <p>预约场景。例如：预订机票、预订酒店</p>
     * @param BookingScene <p>预约场景。例如：预订机票、预订酒店</p>
     */
    public void setBookingScene(String BookingScene) {
        this.BookingScene = BookingScene;
    }

    /**
     * Get <p>预约时间。要求符合ISO-8601标准的带时区的毫秒级时间，格式&quot;YYYY-MM-DDTHH:mm:ss.sssZ&quot; ，例如&quot;2025-10-19T09:11:10.145+08:00&quot;。</p> 
     * @return BookingTime <p>预约时间。要求符合ISO-8601标准的带时区的毫秒级时间，格式&quot;YYYY-MM-DDTHH:mm:ss.sssZ&quot; ，例如&quot;2025-10-19T09:11:10.145+08:00&quot;。</p>
     */
    public String getBookingTime() {
        return this.BookingTime;
    }

    /**
     * Set <p>预约时间。要求符合ISO-8601标准的带时区的毫秒级时间，格式&quot;YYYY-MM-DDTHH:mm:ss.sssZ&quot; ，例如&quot;2025-10-19T09:11:10.145+08:00&quot;。</p>
     * @param BookingTime <p>预约时间。要求符合ISO-8601标准的带时区的毫秒级时间，格式&quot;YYYY-MM-DDTHH:mm:ss.sssZ&quot; ，例如&quot;2025-10-19T09:11:10.145+08:00&quot;。</p>
     */
    public void setBookingTime(String BookingTime) {
        this.BookingTime = BookingTime;
    }

    /**
     * Get <p>预约单唯一ID。</p> 
     * @return BookingId <p>预约单唯一ID。</p>
     */
    public String getBookingId() {
        return this.BookingId;
    }

    /**
     * Set <p>预约单唯一ID。</p>
     * @param BookingId <p>预约单唯一ID。</p>
     */
    public void setBookingId(String BookingId) {
        this.BookingId = BookingId;
    }

    /**
     * Get <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public BookingEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BookingEvent(BookingEvent source) {
        if (source.BookingScene != null) {
            this.BookingScene = new String(source.BookingScene);
        }
        if (source.BookingTime != null) {
            this.BookingTime = new String(source.BookingTime);
        }
        if (source.BookingId != null) {
            this.BookingId = new String(source.BookingId);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BookingScene", this.BookingScene);
        this.setParamSimple(map, prefix + "BookingTime", this.BookingTime);
        this.setParamSimple(map, prefix + "BookingId", this.BookingId);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

