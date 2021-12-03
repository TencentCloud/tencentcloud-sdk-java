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
    * 1 OK 验证通过
6 user code len error 验证码长度不匹配，请检查请求是否带Randstr参数，Randstr参数大小写是否有误
7 captcha no match 验证码答案不匹配/Randstr参数不匹配，请重新生成Randstr、Ticket进行校验
8 verify timeout 验证码签名超时，票据已过期，请重新生成Randstr、Ticket票进行校验
9 Sequnce repeat 验证码签名重放，票据重复使用，请重新生成Randstr、Ticket进行校验
10 Sequnce invalid 验证码签名序列
11 Cookie invalid 验证码cookie信息不合法，非法请求，可能存在不规范接入
12 sig len error 签名长度错误
13 verify ip no match ip不匹配，非法请求，可能存在不规范接入
15 decrypt fail 验证码签名解密失败，票据校验失败，请检查Ticket票据是否与前端返回Ticket一致
16 appid no match 验证码强校验appid错误，前端代码 data-appid 和后端 CaptchaAppId 所填写的值，必须和 验证码控制台 中【验证详情】>【基础配置】内的 AppID 一致,请检查CaptchaAppId是否为控制台基础配置界面系统分配的APPID
17 cmd no much 验证码系统命令不匹配
18 uin no match 号码不匹配
19 seq redirect 重定向验证
20 opt no vcode 操作使用pt免验证码校验错误
21 diff 差别，验证错误 
该情况出现原因一般为，当验证码前端生成terror格式票据并进行后端票据校验时，用户网络较差，该情况下仍会返回可用票据，业务侧可以自行根据需要，进行票据生成或做其他处理。详情参见 [验证码Web前端接入-异常处理文档](https://cloud.tencent.com/document/product/1110/36841#.E5.BC.82.E5.B8.B8.E5.A4.84.E7.90.86)。
22 captcha type not match 验证码类型与拉取时不一致
23 verify type error 验证类型错误
24 invalid pkg 非法请求包
25 bad visitor 策略拦截
26 system busy 系统内部错误
100 param err appsecretkey 参数校验错误，CaptchaAppId 与对应 AppSecretKey 不一致，需检查 AppSecretKey 参数是否有误。其中 CaptchaAppId、 AppSecretKey 在 验证码控制台 的【验证详情】>【基础配置】中获取
104 Ticket Reuse 票据重复使用，同个票据验证多次，请重新生成Randstr、Ticket进行校验
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
     * Get 1 OK 验证通过
6 user code len error 验证码长度不匹配，请检查请求是否带Randstr参数，Randstr参数大小写是否有误
7 captcha no match 验证码答案不匹配/Randstr参数不匹配，请重新生成Randstr、Ticket进行校验
8 verify timeout 验证码签名超时，票据已过期，请重新生成Randstr、Ticket票进行校验
9 Sequnce repeat 验证码签名重放，票据重复使用，请重新生成Randstr、Ticket进行校验
10 Sequnce invalid 验证码签名序列
11 Cookie invalid 验证码cookie信息不合法，非法请求，可能存在不规范接入
12 sig len error 签名长度错误
13 verify ip no match ip不匹配，非法请求，可能存在不规范接入
15 decrypt fail 验证码签名解密失败，票据校验失败，请检查Ticket票据是否与前端返回Ticket一致
16 appid no match 验证码强校验appid错误，前端代码 data-appid 和后端 CaptchaAppId 所填写的值，必须和 验证码控制台 中【验证详情】>【基础配置】内的 AppID 一致,请检查CaptchaAppId是否为控制台基础配置界面系统分配的APPID
17 cmd no much 验证码系统命令不匹配
18 uin no match 号码不匹配
19 seq redirect 重定向验证
20 opt no vcode 操作使用pt免验证码校验错误
21 diff 差别，验证错误 
该情况出现原因一般为，当验证码前端生成terror格式票据并进行后端票据校验时，用户网络较差，该情况下仍会返回可用票据，业务侧可以自行根据需要，进行票据生成或做其他处理。详情参见 [验证码Web前端接入-异常处理文档](https://cloud.tencent.com/document/product/1110/36841#.E5.BC.82.E5.B8.B8.E5.A4.84.E7.90.86)。
22 captcha type not match 验证码类型与拉取时不一致
23 verify type error 验证类型错误
24 invalid pkg 非法请求包
25 bad visitor 策略拦截
26 system busy 系统内部错误
100 param err appsecretkey 参数校验错误，CaptchaAppId 与对应 AppSecretKey 不一致，需检查 AppSecretKey 参数是否有误。其中 CaptchaAppId、 AppSecretKey 在 验证码控制台 的【验证详情】>【基础配置】中获取
104 Ticket Reuse 票据重复使用，同个票据验证多次，请重新生成Randstr、Ticket进行校验 
     * @return CaptchaCode 1 OK 验证通过
6 user code len error 验证码长度不匹配，请检查请求是否带Randstr参数，Randstr参数大小写是否有误
7 captcha no match 验证码答案不匹配/Randstr参数不匹配，请重新生成Randstr、Ticket进行校验
8 verify timeout 验证码签名超时，票据已过期，请重新生成Randstr、Ticket票进行校验
9 Sequnce repeat 验证码签名重放，票据重复使用，请重新生成Randstr、Ticket进行校验
10 Sequnce invalid 验证码签名序列
11 Cookie invalid 验证码cookie信息不合法，非法请求，可能存在不规范接入
12 sig len error 签名长度错误
13 verify ip no match ip不匹配，非法请求，可能存在不规范接入
15 decrypt fail 验证码签名解密失败，票据校验失败，请检查Ticket票据是否与前端返回Ticket一致
16 appid no match 验证码强校验appid错误，前端代码 data-appid 和后端 CaptchaAppId 所填写的值，必须和 验证码控制台 中【验证详情】>【基础配置】内的 AppID 一致,请检查CaptchaAppId是否为控制台基础配置界面系统分配的APPID
17 cmd no much 验证码系统命令不匹配
18 uin no match 号码不匹配
19 seq redirect 重定向验证
20 opt no vcode 操作使用pt免验证码校验错误
21 diff 差别，验证错误 
该情况出现原因一般为，当验证码前端生成terror格式票据并进行后端票据校验时，用户网络较差，该情况下仍会返回可用票据，业务侧可以自行根据需要，进行票据生成或做其他处理。详情参见 [验证码Web前端接入-异常处理文档](https://cloud.tencent.com/document/product/1110/36841#.E5.BC.82.E5.B8.B8.E5.A4.84.E7.90.86)。
22 captcha type not match 验证码类型与拉取时不一致
23 verify type error 验证类型错误
24 invalid pkg 非法请求包
25 bad visitor 策略拦截
26 system busy 系统内部错误
100 param err appsecretkey 参数校验错误，CaptchaAppId 与对应 AppSecretKey 不一致，需检查 AppSecretKey 参数是否有误。其中 CaptchaAppId、 AppSecretKey 在 验证码控制台 的【验证详情】>【基础配置】中获取
104 Ticket Reuse 票据重复使用，同个票据验证多次，请重新生成Randstr、Ticket进行校验
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set 1 OK 验证通过
6 user code len error 验证码长度不匹配，请检查请求是否带Randstr参数，Randstr参数大小写是否有误
7 captcha no match 验证码答案不匹配/Randstr参数不匹配，请重新生成Randstr、Ticket进行校验
8 verify timeout 验证码签名超时，票据已过期，请重新生成Randstr、Ticket票进行校验
9 Sequnce repeat 验证码签名重放，票据重复使用，请重新生成Randstr、Ticket进行校验
10 Sequnce invalid 验证码签名序列
11 Cookie invalid 验证码cookie信息不合法，非法请求，可能存在不规范接入
12 sig len error 签名长度错误
13 verify ip no match ip不匹配，非法请求，可能存在不规范接入
15 decrypt fail 验证码签名解密失败，票据校验失败，请检查Ticket票据是否与前端返回Ticket一致
16 appid no match 验证码强校验appid错误，前端代码 data-appid 和后端 CaptchaAppId 所填写的值，必须和 验证码控制台 中【验证详情】>【基础配置】内的 AppID 一致,请检查CaptchaAppId是否为控制台基础配置界面系统分配的APPID
17 cmd no much 验证码系统命令不匹配
18 uin no match 号码不匹配
19 seq redirect 重定向验证
20 opt no vcode 操作使用pt免验证码校验错误
21 diff 差别，验证错误 
该情况出现原因一般为，当验证码前端生成terror格式票据并进行后端票据校验时，用户网络较差，该情况下仍会返回可用票据，业务侧可以自行根据需要，进行票据生成或做其他处理。详情参见 [验证码Web前端接入-异常处理文档](https://cloud.tencent.com/document/product/1110/36841#.E5.BC.82.E5.B8.B8.E5.A4.84.E7.90.86)。
22 captcha type not match 验证码类型与拉取时不一致
23 verify type error 验证类型错误
24 invalid pkg 非法请求包
25 bad visitor 策略拦截
26 system busy 系统内部错误
100 param err appsecretkey 参数校验错误，CaptchaAppId 与对应 AppSecretKey 不一致，需检查 AppSecretKey 参数是否有误。其中 CaptchaAppId、 AppSecretKey 在 验证码控制台 的【验证详情】>【基础配置】中获取
104 Ticket Reuse 票据重复使用，同个票据验证多次，请重新生成Randstr、Ticket进行校验
     * @param CaptchaCode 1 OK 验证通过
6 user code len error 验证码长度不匹配，请检查请求是否带Randstr参数，Randstr参数大小写是否有误
7 captcha no match 验证码答案不匹配/Randstr参数不匹配，请重新生成Randstr、Ticket进行校验
8 verify timeout 验证码签名超时，票据已过期，请重新生成Randstr、Ticket票进行校验
9 Sequnce repeat 验证码签名重放，票据重复使用，请重新生成Randstr、Ticket进行校验
10 Sequnce invalid 验证码签名序列
11 Cookie invalid 验证码cookie信息不合法，非法请求，可能存在不规范接入
12 sig len error 签名长度错误
13 verify ip no match ip不匹配，非法请求，可能存在不规范接入
15 decrypt fail 验证码签名解密失败，票据校验失败，请检查Ticket票据是否与前端返回Ticket一致
16 appid no match 验证码强校验appid错误，前端代码 data-appid 和后端 CaptchaAppId 所填写的值，必须和 验证码控制台 中【验证详情】>【基础配置】内的 AppID 一致,请检查CaptchaAppId是否为控制台基础配置界面系统分配的APPID
17 cmd no much 验证码系统命令不匹配
18 uin no match 号码不匹配
19 seq redirect 重定向验证
20 opt no vcode 操作使用pt免验证码校验错误
21 diff 差别，验证错误 
该情况出现原因一般为，当验证码前端生成terror格式票据并进行后端票据校验时，用户网络较差，该情况下仍会返回可用票据，业务侧可以自行根据需要，进行票据生成或做其他处理。详情参见 [验证码Web前端接入-异常处理文档](https://cloud.tencent.com/document/product/1110/36841#.E5.BC.82.E5.B8.B8.E5.A4.84.E7.90.86)。
22 captcha type not match 验证码类型与拉取时不一致
23 verify type error 验证类型错误
24 invalid pkg 非法请求包
25 bad visitor 策略拦截
26 system busy 系统内部错误
100 param err appsecretkey 参数校验错误，CaptchaAppId 与对应 AppSecretKey 不一致，需检查 AppSecretKey 参数是否有误。其中 CaptchaAppId、 AppSecretKey 在 验证码控制台 的【验证详情】>【基础配置】中获取
104 Ticket Reuse 票据重复使用，同个票据验证多次，请重新生成Randstr、Ticket进行校验
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

    public DescribeCaptchaResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaResultResponse(DescribeCaptchaResultResponse source) {
        if (source.CaptchaCode != null) {
            this.CaptchaCode = new Long(source.CaptchaCode);
        }
        if (source.CaptchaMsg != null) {
            this.CaptchaMsg = new String(source.CaptchaMsg);
        }
        if (source.EvilLevel != null) {
            this.EvilLevel = new Long(source.EvilLevel);
        }
        if (source.GetCaptchaTime != null) {
            this.GetCaptchaTime = new Long(source.GetCaptchaTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

