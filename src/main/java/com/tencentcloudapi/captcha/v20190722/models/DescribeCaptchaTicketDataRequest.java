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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaTicketDataRequest extends AbstractModel{

    /**
    * 验证码应用ID
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 查询开始时间 例如：20200909
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 查询结束时间 例如：20220314
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get 验证码应用ID 
     * @return CaptchaAppId 验证码应用ID
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set 验证码应用ID
     * @param CaptchaAppId 验证码应用ID
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get 查询开始时间 例如：20200909 
     * @return Start 查询开始时间 例如：20200909
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 查询开始时间 例如：20200909
     * @param Start 查询开始时间 例如：20200909
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 查询结束时间 例如：20220314 
     * @return End 查询结束时间 例如：20220314
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 查询结束时间 例如：20220314
     * @param End 查询结束时间 例如：20220314
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public DescribeCaptchaTicketDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaTicketDataRequest(DescribeCaptchaTicketDataRequest source) {
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

