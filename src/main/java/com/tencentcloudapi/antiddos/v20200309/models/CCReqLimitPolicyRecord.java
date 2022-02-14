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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCReqLimitPolicyRecord extends AbstractModel{

    /**
    * 统计周期，可取值1，10，30，60，单位秒
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 请求数，取值1~20000
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
    * 频率限制策略方式，可取值alg表示验证码，drop表示丢弃
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 频率限制策略时长，可取值1~86400，单位秒
    */
    @SerializedName("ExecuteDuration")
    @Expose
    private Long ExecuteDuration;

    /**
    * 策略项比对方式，可取值include表示包含，equal表示等于
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Uri，三个策略项仅可填其中之一
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * User-Agent，三个策略项仅可填其中之一
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Cookie，三个策略项仅可填其中之一
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
     * Get 统计周期，可取值1，10，30，60，单位秒 
     * @return Period 统计周期，可取值1，10，30，60，单位秒
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期，可取值1，10，30，60，单位秒
     * @param Period 统计周期，可取值1，10，30，60，单位秒
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 请求数，取值1~20000 
     * @return RequestNum 请求数，取值1~20000
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set 请求数，取值1~20000
     * @param RequestNum 请求数，取值1~20000
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    /**
     * Get 频率限制策略方式，可取值alg表示验证码，drop表示丢弃 
     * @return Action 频率限制策略方式，可取值alg表示验证码，drop表示丢弃
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 频率限制策略方式，可取值alg表示验证码，drop表示丢弃
     * @param Action 频率限制策略方式，可取值alg表示验证码，drop表示丢弃
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 频率限制策略时长，可取值1~86400，单位秒 
     * @return ExecuteDuration 频率限制策略时长，可取值1~86400，单位秒
     */
    public Long getExecuteDuration() {
        return this.ExecuteDuration;
    }

    /**
     * Set 频率限制策略时长，可取值1~86400，单位秒
     * @param ExecuteDuration 频率限制策略时长，可取值1~86400，单位秒
     */
    public void setExecuteDuration(Long ExecuteDuration) {
        this.ExecuteDuration = ExecuteDuration;
    }

    /**
     * Get 策略项比对方式，可取值include表示包含，equal表示等于 
     * @return Mode 策略项比对方式，可取值include表示包含，equal表示等于
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 策略项比对方式，可取值include表示包含，equal表示等于
     * @param Mode 策略项比对方式，可取值include表示包含，equal表示等于
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Uri，三个策略项仅可填其中之一 
     * @return Uri Uri，三个策略项仅可填其中之一
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set Uri，三个策略项仅可填其中之一
     * @param Uri Uri，三个策略项仅可填其中之一
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get User-Agent，三个策略项仅可填其中之一 
     * @return UserAgent User-Agent，三个策略项仅可填其中之一
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set User-Agent，三个策略项仅可填其中之一
     * @param UserAgent User-Agent，三个策略项仅可填其中之一
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Cookie，三个策略项仅可填其中之一 
     * @return Cookie Cookie，三个策略项仅可填其中之一
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie，三个策略项仅可填其中之一
     * @param Cookie Cookie，三个策略项仅可填其中之一
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    public CCReqLimitPolicyRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCReqLimitPolicyRecord(CCReqLimitPolicyRecord source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ExecuteDuration != null) {
            this.ExecuteDuration = new Long(source.ExecuteDuration);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.Cookie != null) {
            this.Cookie = new String(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ExecuteDuration", this.ExecuteDuration);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);

    }
}

