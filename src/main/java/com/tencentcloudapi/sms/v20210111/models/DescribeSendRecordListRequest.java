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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSendRecordListRequest extends AbstractModel {

    /**
    * <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * <p>查询起始时间，以短信发送时间为准，UNIX 时间戳（单位：秒）。注：最早可查询当前时间前 72 小时的数据。</p><p>单位：秒</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>查询截止时间，以短信发送时间为准，UNIX 时间戳（时间：秒）。注：不可以超过当前时间。</p><p>单位：秒</p><p>默认值：腾讯云服务当前时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>单次查询最大条数。</p><p>取值范围：[1, 50]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量。 </p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>注：查询范围内超过 1000 条记录将被截断，最大查询 1000 条，查询记录按发送时间降序。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p> 
     * @return PhoneNumber <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     * @param PhoneNumber <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p> 
     * @return SmsSdkAppId <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     * @param SmsSdkAppId <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get <p>查询起始时间，以短信发送时间为准，UNIX 时间戳（单位：秒）。注：最早可查询当前时间前 72 小时的数据。</p><p>单位：秒</p> 
     * @return BeginTime <p>查询起始时间，以短信发送时间为准，UNIX 时间戳（单位：秒）。注：最早可查询当前时间前 72 小时的数据。</p><p>单位：秒</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>查询起始时间，以短信发送时间为准，UNIX 时间戳（单位：秒）。注：最早可查询当前时间前 72 小时的数据。</p><p>单位：秒</p>
     * @param BeginTime <p>查询起始时间，以短信发送时间为准，UNIX 时间戳（单位：秒）。注：最早可查询当前时间前 72 小时的数据。</p><p>单位：秒</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>查询截止时间，以短信发送时间为准，UNIX 时间戳（时间：秒）。注：不可以超过当前时间。</p><p>单位：秒</p><p>默认值：腾讯云服务当前时间</p> 
     * @return EndTime <p>查询截止时间，以短信发送时间为准，UNIX 时间戳（时间：秒）。注：不可以超过当前时间。</p><p>单位：秒</p><p>默认值：腾讯云服务当前时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询截止时间，以短信发送时间为准，UNIX 时间戳（时间：秒）。注：不可以超过当前时间。</p><p>单位：秒</p><p>默认值：腾讯云服务当前时间</p>
     * @param EndTime <p>查询截止时间，以短信发送时间为准，UNIX 时间戳（时间：秒）。注：不可以超过当前时间。</p><p>单位：秒</p><p>默认值：腾讯云服务当前时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>单次查询最大条数。</p><p>取值范围：[1, 50]</p><p>默认值：20</p> 
     * @return Limit <p>单次查询最大条数。</p><p>取值范围：[1, 50]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询最大条数。</p><p>取值范围：[1, 50]</p><p>默认值：20</p>
     * @param Limit <p>单次查询最大条数。</p><p>取值范围：[1, 50]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量。 </p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>注：查询范围内超过 1000 条记录将被截断，最大查询 1000 条，查询记录按发送时间降序。</p> 
     * @return Offset <p>偏移量。 </p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>注：查询范围内超过 1000 条记录将被截断，最大查询 1000 条，查询记录按发送时间降序。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量。 </p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>注：查询范围内超过 1000 条记录将被截断，最大查询 1000 条，查询记录按发送时间降序。</p>
     * @param Offset <p>偏移量。 </p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>注：查询范围内超过 1000 条记录将被截断，最大查询 1000 条，查询记录按发送时间降序。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSendRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSendRecordListRequest(DescribeSendRecordListRequest source) {
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

