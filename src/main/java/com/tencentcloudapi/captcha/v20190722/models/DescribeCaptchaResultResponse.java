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

public class DescribeCaptchaResultResponse extends AbstractModel{

    /**
    * 1	OK	验证通过
6	user code len error	验证码长度不匹配
7	captcha no match	验证码答案不匹配/Randstr参数不匹配
8	verify timeout	验证码签名超时
9	Sequnce repeat	验证码签名重放
10	Sequnce invalid	验证码签名序列
11	Cookie invalid	验证码cooking信息不合法
12	sig len error	签名长度错误
13	verify ip no match	ip不匹配
15	decrypt fail	验证码签名解密失败
16	appid no match	验证码强校验appid错误
17	cmd no much	验证码系统命令不匹配
18	uin no match	号码不匹配
19	seq redirect	重定向验证
20	opt no vcode	操作使用pt免验证码校验错误
21	diff	差别，验证错误
22	captcha type not match	验证码类型与拉取时不一致
23	verify type error	验证类型错误
24	invalid pkg	非法请求包
25	bad visitor	策略拦截
26	system busy	系统内部错误
100	param err	appsecretkey 参数校验错误
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilLevel")
    @Expose
    private Long EvilLevel;

    /**
    * 前端获取验证码时间，时间戳格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GetCaptchaTime")
    @Expose
    private Long GetCaptchaTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 1	OK	验证通过
6	user code len error	验证码长度不匹配
7	captcha no match	验证码答案不匹配/Randstr参数不匹配
8	verify timeout	验证码签名超时
9	Sequnce repeat	验证码签名重放
10	Sequnce invalid	验证码签名序列
11	Cookie invalid	验证码cooking信息不合法
12	sig len error	签名长度错误
13	verify ip no match	ip不匹配
15	decrypt fail	验证码签名解密失败
16	appid no match	验证码强校验appid错误
17	cmd no much	验证码系统命令不匹配
18	uin no match	号码不匹配
19	seq redirect	重定向验证
20	opt no vcode	操作使用pt免验证码校验错误
21	diff	差别，验证错误
22	captcha type not match	验证码类型与拉取时不一致
23	verify type error	验证类型错误
24	invalid pkg	非法请求包
25	bad visitor	策略拦截
26	system busy	系统内部错误
100	param err	appsecretkey 参数校验错误 
     * @return CaptchaCode 1	OK	验证通过
6	user code len error	验证码长度不匹配
7	captcha no match	验证码答案不匹配/Randstr参数不匹配
8	verify timeout	验证码签名超时
9	Sequnce repeat	验证码签名重放
10	Sequnce invalid	验证码签名序列
11	Cookie invalid	验证码cooking信息不合法
12	sig len error	签名长度错误
13	verify ip no match	ip不匹配
15	decrypt fail	验证码签名解密失败
16	appid no match	验证码强校验appid错误
17	cmd no much	验证码系统命令不匹配
18	uin no match	号码不匹配
19	seq redirect	重定向验证
20	opt no vcode	操作使用pt免验证码校验错误
21	diff	差别，验证错误
22	captcha type not match	验证码类型与拉取时不一致
23	verify type error	验证类型错误
24	invalid pkg	非法请求包
25	bad visitor	策略拦截
26	system busy	系统内部错误
100	param err	appsecretkey 参数校验错误
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set 1	OK	验证通过
6	user code len error	验证码长度不匹配
7	captcha no match	验证码答案不匹配/Randstr参数不匹配
8	verify timeout	验证码签名超时
9	Sequnce repeat	验证码签名重放
10	Sequnce invalid	验证码签名序列
11	Cookie invalid	验证码cooking信息不合法
12	sig len error	签名长度错误
13	verify ip no match	ip不匹配
15	decrypt fail	验证码签名解密失败
16	appid no match	验证码强校验appid错误
17	cmd no much	验证码系统命令不匹配
18	uin no match	号码不匹配
19	seq redirect	重定向验证
20	opt no vcode	操作使用pt免验证码校验错误
21	diff	差别，验证错误
22	captcha type not match	验证码类型与拉取时不一致
23	verify type error	验证类型错误
24	invalid pkg	非法请求包
25	bad visitor	策略拦截
26	system busy	系统内部错误
100	param err	appsecretkey 参数校验错误
     * @param CaptchaCode 1	OK	验证通过
6	user code len error	验证码长度不匹配
7	captcha no match	验证码答案不匹配/Randstr参数不匹配
8	verify timeout	验证码签名超时
9	Sequnce repeat	验证码签名重放
10	Sequnce invalid	验证码签名序列
11	Cookie invalid	验证码cooking信息不合法
12	sig len error	签名长度错误
13	verify ip no match	ip不匹配
15	decrypt fail	验证码签名解密失败
16	appid no match	验证码强校验appid错误
17	cmd no much	验证码系统命令不匹配
18	uin no match	号码不匹配
19	seq redirect	重定向验证
20	opt no vcode	操作使用pt免验证码校验错误
21	diff	差别，验证错误
22	captcha type not match	验证码类型与拉取时不一致
23	verify type error	验证类型错误
24	invalid pkg	非法请求包
25	bad visitor	策略拦截
26	system busy	系统内部错误
100	param err	appsecretkey 参数校验错误
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaptchaMsg 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptchaMsg 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilLevel [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilLevel() {
        return this.EvilLevel;
    }

    /**
     * Set [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilLevel [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilLevel(Long EvilLevel) {
        this.EvilLevel = EvilLevel;
    }

    /**
     * Get 前端获取验证码时间，时间戳格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GetCaptchaTime 前端获取验证码时间，时间戳格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGetCaptchaTime() {
        return this.GetCaptchaTime;
    }

    /**
     * Set 前端获取验证码时间，时间戳格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param GetCaptchaTime 前端获取验证码时间，时间戳格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGetCaptchaTime(Long GetCaptchaTime) {
        this.GetCaptchaTime = GetCaptchaTime;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamSimple(map, prefix + "EvilLevel", this.EvilLevel);
        this.setParamSimple(map, prefix + "GetCaptchaTime", this.GetCaptchaTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

