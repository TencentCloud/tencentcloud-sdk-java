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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserVerifyUrlResponse extends AbstractModel {

    /**
    * 腾讯电子签小程序的实名认证链接。
如果没有传递，默认值是 HTTP。 链接的有效期均是 7 天。

<strong>1.如果EndPoint是APP</strong>：
得到的链接类似于<a href="">pages/guide/index?to=MP_PERSONAL_VERIFY&shortKey=yDCZHUyOcExAlcOvNod0</a>, 用法可以参考描述中的"跳转到小程序的实现"

<strong>2.如果EndPoint是HTTP</strong>：
得到的链接类似于 <a href="">https://res.ess.tencent.cn/cdn/h5-activity/jump-mp.html?to=TAG_VERIFY&shortKey=yDCZHUyOcChrfpaswT0d</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>3.如果EndPoint是HTTP_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>4.如果EndPoint是H5</strong>：
得到的链接类似于 <a href="">https://quick.test.qian.tencent.cn/guide?Code=yDU****VJhsS5q&CodeType=xxx&shortKey=yD*****frcb</a>，点击后会跳转到腾讯电子签H5页面进行签署

<strong>5.如果EndPoint是H5_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签H5页面进行签署


`注：` <font color="red">生成的链路后面不能再增加参数，防止出错重复参数覆盖原有的参数</font>
示例值：https://essurl.cn/2n**42Nd
    */
    @SerializedName("UserVerifyUrl")
    @Expose
    private String UserVerifyUrl;

    /**
    * 链接过期时间，为Unix时间戳（单位为秒）。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 小程序appid，用于半屏拉起电子签小程序， 仅在 Endpoint 设置为 APP 的时候返回
    */
    @SerializedName("MiniAppId")
    @Expose
    private String MiniAppId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯电子签小程序的实名认证链接。
如果没有传递，默认值是 HTTP。 链接的有效期均是 7 天。

<strong>1.如果EndPoint是APP</strong>：
得到的链接类似于<a href="">pages/guide/index?to=MP_PERSONAL_VERIFY&shortKey=yDCZHUyOcExAlcOvNod0</a>, 用法可以参考描述中的"跳转到小程序的实现"

<strong>2.如果EndPoint是HTTP</strong>：
得到的链接类似于 <a href="">https://res.ess.tencent.cn/cdn/h5-activity/jump-mp.html?to=TAG_VERIFY&shortKey=yDCZHUyOcChrfpaswT0d</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>3.如果EndPoint是HTTP_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>4.如果EndPoint是H5</strong>：
得到的链接类似于 <a href="">https://quick.test.qian.tencent.cn/guide?Code=yDU****VJhsS5q&CodeType=xxx&shortKey=yD*****frcb</a>，点击后会跳转到腾讯电子签H5页面进行签署

<strong>5.如果EndPoint是H5_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签H5页面进行签署


`注：` <font color="red">生成的链路后面不能再增加参数，防止出错重复参数覆盖原有的参数</font>
示例值：https://essurl.cn/2n**42Nd 
     * @return UserVerifyUrl 腾讯电子签小程序的实名认证链接。
如果没有传递，默认值是 HTTP。 链接的有效期均是 7 天。

<strong>1.如果EndPoint是APP</strong>：
得到的链接类似于<a href="">pages/guide/index?to=MP_PERSONAL_VERIFY&shortKey=yDCZHUyOcExAlcOvNod0</a>, 用法可以参考描述中的"跳转到小程序的实现"

<strong>2.如果EndPoint是HTTP</strong>：
得到的链接类似于 <a href="">https://res.ess.tencent.cn/cdn/h5-activity/jump-mp.html?to=TAG_VERIFY&shortKey=yDCZHUyOcChrfpaswT0d</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>3.如果EndPoint是HTTP_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>4.如果EndPoint是H5</strong>：
得到的链接类似于 <a href="">https://quick.test.qian.tencent.cn/guide?Code=yDU****VJhsS5q&CodeType=xxx&shortKey=yD*****frcb</a>，点击后会跳转到腾讯电子签H5页面进行签署

<strong>5.如果EndPoint是H5_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签H5页面进行签署


`注：` <font color="red">生成的链路后面不能再增加参数，防止出错重复参数覆盖原有的参数</font>
示例值：https://essurl.cn/2n**42Nd
     */
    public String getUserVerifyUrl() {
        return this.UserVerifyUrl;
    }

    /**
     * Set 腾讯电子签小程序的实名认证链接。
如果没有传递，默认值是 HTTP。 链接的有效期均是 7 天。

<strong>1.如果EndPoint是APP</strong>：
得到的链接类似于<a href="">pages/guide/index?to=MP_PERSONAL_VERIFY&shortKey=yDCZHUyOcExAlcOvNod0</a>, 用法可以参考描述中的"跳转到小程序的实现"

<strong>2.如果EndPoint是HTTP</strong>：
得到的链接类似于 <a href="">https://res.ess.tencent.cn/cdn/h5-activity/jump-mp.html?to=TAG_VERIFY&shortKey=yDCZHUyOcChrfpaswT0d</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>3.如果EndPoint是HTTP_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>4.如果EndPoint是H5</strong>：
得到的链接类似于 <a href="">https://quick.test.qian.tencent.cn/guide?Code=yDU****VJhsS5q&CodeType=xxx&shortKey=yD*****frcb</a>，点击后会跳转到腾讯电子签H5页面进行签署

<strong>5.如果EndPoint是H5_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签H5页面进行签署


`注：` <font color="red">生成的链路后面不能再增加参数，防止出错重复参数覆盖原有的参数</font>
示例值：https://essurl.cn/2n**42Nd
     * @param UserVerifyUrl 腾讯电子签小程序的实名认证链接。
如果没有传递，默认值是 HTTP。 链接的有效期均是 7 天。

<strong>1.如果EndPoint是APP</strong>：
得到的链接类似于<a href="">pages/guide/index?to=MP_PERSONAL_VERIFY&shortKey=yDCZHUyOcExAlcOvNod0</a>, 用法可以参考描述中的"跳转到小程序的实现"

<strong>2.如果EndPoint是HTTP</strong>：
得到的链接类似于 <a href="">https://res.ess.tencent.cn/cdn/h5-activity/jump-mp.html?to=TAG_VERIFY&shortKey=yDCZHUyOcChrfpaswT0d</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>3.如果EndPoint是HTTP_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签小程序进行签署

<strong>4.如果EndPoint是H5</strong>：
得到的链接类似于 <a href="">https://quick.test.qian.tencent.cn/guide?Code=yDU****VJhsS5q&CodeType=xxx&shortKey=yD*****frcb</a>，点击后会跳转到腾讯电子签H5页面进行签署

<strong>5.如果EndPoint是H5_SHORT_URL</strong>：
得到的链接类似于<a href="">https://essurl.cn/2n**42Nd</a>，点击后会跳转到腾讯电子签H5页面进行签署


`注：` <font color="red">生成的链路后面不能再增加参数，防止出错重复参数覆盖原有的参数</font>
示例值：https://essurl.cn/2n**42Nd
     */
    public void setUserVerifyUrl(String UserVerifyUrl) {
        this.UserVerifyUrl = UserVerifyUrl;
    }

    /**
     * Get 链接过期时间，为Unix时间戳（单位为秒）。 
     * @return ExpireTime 链接过期时间，为Unix时间戳（单位为秒）。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 链接过期时间，为Unix时间戳（单位为秒）。
     * @param ExpireTime 链接过期时间，为Unix时间戳（单位为秒）。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 小程序appid，用于半屏拉起电子签小程序， 仅在 Endpoint 设置为 APP 的时候返回 
     * @return MiniAppId 小程序appid，用于半屏拉起电子签小程序， 仅在 Endpoint 设置为 APP 的时候返回
     */
    public String getMiniAppId() {
        return this.MiniAppId;
    }

    /**
     * Set 小程序appid，用于半屏拉起电子签小程序， 仅在 Endpoint 设置为 APP 的时候返回
     * @param MiniAppId 小程序appid，用于半屏拉起电子签小程序， 仅在 Endpoint 设置为 APP 的时候返回
     */
    public void setMiniAppId(String MiniAppId) {
        this.MiniAppId = MiniAppId;
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

    public CreateUserVerifyUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserVerifyUrlResponse(CreateUserVerifyUrlResponse source) {
        if (source.UserVerifyUrl != null) {
            this.UserVerifyUrl = new String(source.UserVerifyUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.MiniAppId != null) {
            this.MiniAppId = new String(source.MiniAppId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserVerifyUrl", this.UserVerifyUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "MiniAppId", this.MiniAppId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

