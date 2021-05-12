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

public class DescribeCaptchaMiniDataRequest extends AbstractModel{

    /**
    * 验证码应用ID
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 查询开始时间 例如：2019112900
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 查询结束时间 例如：2019112902
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 查询类型 安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

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
     * Get 查询开始时间 例如：2019112900 
     * @return Start 查询开始时间 例如：2019112900
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 查询开始时间 例如：2019112900
     * @param Start 查询开始时间 例如：2019112900
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 查询结束时间 例如：2019112902 
     * @return End 查询结束时间 例如：2019112902
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 查询结束时间 例如：2019112902
     * @param End 查询结束时间 例如：2019112902
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 查询类型 安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟） 
     * @return Type 查询类型 安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 查询类型 安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟）
     * @param Type 查询类型 安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeCaptchaMiniDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaMiniDataRequest(DescribeCaptchaMiniDataRequest source) {
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

