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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultResponse extends AbstractModel {

    /**
    * <p>1 OK 验证通过<br>7 captcha no match 传入的Randstr不合法，请检查Randstr是否与前端返回的Randstr一致<br>8 ticket expired 传入的Ticket已过期（Ticket有效期5分钟），请重新生成Ticket、Randstr进行校验<br>9 ticket reused 传入的Ticket被重复使用，请重新生成Ticket、Randstr进行校验<br>15 decrypt fail 传入的Ticket不合法，请检查Ticket是否与前端返回的Ticket一致<br>16 appid-ticket mismatch 传入的CaptchaAppId错误，请检查CaptchaAppId是否与前端传入的CaptchaAppId一致，并且保障CaptchaAppId是从验证码控制台【验证管理】-&gt;【基础配置】中获取<br>21 diff 票据校验异常，可能的原因是（1）若Ticket包含trerror前缀，一般是由于用户网络较差，导致前端自动容灾，而生成了容灾票据，业务侧可根据需要进行跳过或二次处理。（2）若Ticket不包含trerror前缀，则是由于验证码风控系统发现请求有安全风险，业务侧可根据需要进行拦截。<br>100 appid-secretkey-ticket mismatch 参数校验错误，（1）请检查CaptchaAppId与AppSecretKey是否正确，CaptchaAppId、AppSecretKey需要在验证码控制台【验证管理】&gt;【基础配置】中获取（2）请检查传入的Ticket是否由传入的CaptchaAppId生成</p>
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * <p>状态描述及验证错误信息</p>
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * <p>无感验证模式下，该参数返回验证结果：<br>EvilLevel=0 请求无恶意<br>EvilLevel=100 请求有恶意</p>
    */
    @SerializedName("EvilLevel")
    @Expose
    private Long EvilLevel;

    /**
    * <p>前端获取验证码时间，时间戳格式</p>
    */
    @SerializedName("GetCaptchaTime")
    @Expose
    private Long GetCaptchaTime;

    /**
    * <p>拦截类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilBitmap")
    @Expose
    private Long EvilBitmap;

    /**
    * <p>提交验证码时间</p>
    */
    @SerializedName("SubmitCaptchaTime")
    @Expose
    private Long SubmitCaptchaTime;

    /**
    * <p>设备风险大类</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceRiskCategory")
    @Expose
    private String DeviceRiskCategory;

    /**
    * <p>验证码评分</p><p>取值0-100，分值越高，风险越大</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>1 OK 验证通过<br>7 captcha no match 传入的Randstr不合法，请检查Randstr是否与前端返回的Randstr一致<br>8 ticket expired 传入的Ticket已过期（Ticket有效期5分钟），请重新生成Ticket、Randstr进行校验<br>9 ticket reused 传入的Ticket被重复使用，请重新生成Ticket、Randstr进行校验<br>15 decrypt fail 传入的Ticket不合法，请检查Ticket是否与前端返回的Ticket一致<br>16 appid-ticket mismatch 传入的CaptchaAppId错误，请检查CaptchaAppId是否与前端传入的CaptchaAppId一致，并且保障CaptchaAppId是从验证码控制台【验证管理】-&gt;【基础配置】中获取<br>21 diff 票据校验异常，可能的原因是（1）若Ticket包含trerror前缀，一般是由于用户网络较差，导致前端自动容灾，而生成了容灾票据，业务侧可根据需要进行跳过或二次处理。（2）若Ticket不包含trerror前缀，则是由于验证码风控系统发现请求有安全风险，业务侧可根据需要进行拦截。<br>100 appid-secretkey-ticket mismatch 参数校验错误，（1）请检查CaptchaAppId与AppSecretKey是否正确，CaptchaAppId、AppSecretKey需要在验证码控制台【验证管理】&gt;【基础配置】中获取（2）请检查传入的Ticket是否由传入的CaptchaAppId生成</p> 
     * @return CaptchaCode <p>1 OK 验证通过<br>7 captcha no match 传入的Randstr不合法，请检查Randstr是否与前端返回的Randstr一致<br>8 ticket expired 传入的Ticket已过期（Ticket有效期5分钟），请重新生成Ticket、Randstr进行校验<br>9 ticket reused 传入的Ticket被重复使用，请重新生成Ticket、Randstr进行校验<br>15 decrypt fail 传入的Ticket不合法，请检查Ticket是否与前端返回的Ticket一致<br>16 appid-ticket mismatch 传入的CaptchaAppId错误，请检查CaptchaAppId是否与前端传入的CaptchaAppId一致，并且保障CaptchaAppId是从验证码控制台【验证管理】-&gt;【基础配置】中获取<br>21 diff 票据校验异常，可能的原因是（1）若Ticket包含trerror前缀，一般是由于用户网络较差，导致前端自动容灾，而生成了容灾票据，业务侧可根据需要进行跳过或二次处理。（2）若Ticket不包含trerror前缀，则是由于验证码风控系统发现请求有安全风险，业务侧可根据需要进行拦截。<br>100 appid-secretkey-ticket mismatch 参数校验错误，（1）请检查CaptchaAppId与AppSecretKey是否正确，CaptchaAppId、AppSecretKey需要在验证码控制台【验证管理】&gt;【基础配置】中获取（2）请检查传入的Ticket是否由传入的CaptchaAppId生成</p>
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set <p>1 OK 验证通过<br>7 captcha no match 传入的Randstr不合法，请检查Randstr是否与前端返回的Randstr一致<br>8 ticket expired 传入的Ticket已过期（Ticket有效期5分钟），请重新生成Ticket、Randstr进行校验<br>9 ticket reused 传入的Ticket被重复使用，请重新生成Ticket、Randstr进行校验<br>15 decrypt fail 传入的Ticket不合法，请检查Ticket是否与前端返回的Ticket一致<br>16 appid-ticket mismatch 传入的CaptchaAppId错误，请检查CaptchaAppId是否与前端传入的CaptchaAppId一致，并且保障CaptchaAppId是从验证码控制台【验证管理】-&gt;【基础配置】中获取<br>21 diff 票据校验异常，可能的原因是（1）若Ticket包含trerror前缀，一般是由于用户网络较差，导致前端自动容灾，而生成了容灾票据，业务侧可根据需要进行跳过或二次处理。（2）若Ticket不包含trerror前缀，则是由于验证码风控系统发现请求有安全风险，业务侧可根据需要进行拦截。<br>100 appid-secretkey-ticket mismatch 参数校验错误，（1）请检查CaptchaAppId与AppSecretKey是否正确，CaptchaAppId、AppSecretKey需要在验证码控制台【验证管理】&gt;【基础配置】中获取（2）请检查传入的Ticket是否由传入的CaptchaAppId生成</p>
     * @param CaptchaCode <p>1 OK 验证通过<br>7 captcha no match 传入的Randstr不合法，请检查Randstr是否与前端返回的Randstr一致<br>8 ticket expired 传入的Ticket已过期（Ticket有效期5分钟），请重新生成Ticket、Randstr进行校验<br>9 ticket reused 传入的Ticket被重复使用，请重新生成Ticket、Randstr进行校验<br>15 decrypt fail 传入的Ticket不合法，请检查Ticket是否与前端返回的Ticket一致<br>16 appid-ticket mismatch 传入的CaptchaAppId错误，请检查CaptchaAppId是否与前端传入的CaptchaAppId一致，并且保障CaptchaAppId是从验证码控制台【验证管理】-&gt;【基础配置】中获取<br>21 diff 票据校验异常，可能的原因是（1）若Ticket包含trerror前缀，一般是由于用户网络较差，导致前端自动容灾，而生成了容灾票据，业务侧可根据需要进行跳过或二次处理。（2）若Ticket不包含trerror前缀，则是由于验证码风控系统发现请求有安全风险，业务侧可根据需要进行拦截。<br>100 appid-secretkey-ticket mismatch 参数校验错误，（1）请检查CaptchaAppId与AppSecretKey是否正确，CaptchaAppId、AppSecretKey需要在验证码控制台【验证管理】&gt;【基础配置】中获取（2）请检查传入的Ticket是否由传入的CaptchaAppId生成</p>
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get <p>状态描述及验证错误信息</p> 
     * @return CaptchaMsg <p>状态描述及验证错误信息</p>
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set <p>状态描述及验证错误信息</p>
     * @param CaptchaMsg <p>状态描述及验证错误信息</p>
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get <p>无感验证模式下，该参数返回验证结果：<br>EvilLevel=0 请求无恶意<br>EvilLevel=100 请求有恶意</p> 
     * @return EvilLevel <p>无感验证模式下，该参数返回验证结果：<br>EvilLevel=0 请求无恶意<br>EvilLevel=100 请求有恶意</p>
     */
    public Long getEvilLevel() {
        return this.EvilLevel;
    }

    /**
     * Set <p>无感验证模式下，该参数返回验证结果：<br>EvilLevel=0 请求无恶意<br>EvilLevel=100 请求有恶意</p>
     * @param EvilLevel <p>无感验证模式下，该参数返回验证结果：<br>EvilLevel=0 请求无恶意<br>EvilLevel=100 请求有恶意</p>
     */
    public void setEvilLevel(Long EvilLevel) {
        this.EvilLevel = EvilLevel;
    }

    /**
     * Get <p>前端获取验证码时间，时间戳格式</p> 
     * @return GetCaptchaTime <p>前端获取验证码时间，时间戳格式</p>
     */
    public Long getGetCaptchaTime() {
        return this.GetCaptchaTime;
    }

    /**
     * Set <p>前端获取验证码时间，时间戳格式</p>
     * @param GetCaptchaTime <p>前端获取验证码时间，时间戳格式</p>
     */
    public void setGetCaptchaTime(Long GetCaptchaTime) {
        this.GetCaptchaTime = GetCaptchaTime;
    }

    /**
     * Get <p>拦截类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilBitmap <p>拦截类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilBitmap() {
        return this.EvilBitmap;
    }

    /**
     * Set <p>拦截类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilBitmap <p>拦截类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilBitmap(Long EvilBitmap) {
        this.EvilBitmap = EvilBitmap;
    }

    /**
     * Get <p>提交验证码时间</p> 
     * @return SubmitCaptchaTime <p>提交验证码时间</p>
     */
    public Long getSubmitCaptchaTime() {
        return this.SubmitCaptchaTime;
    }

    /**
     * Set <p>提交验证码时间</p>
     * @param SubmitCaptchaTime <p>提交验证码时间</p>
     */
    public void setSubmitCaptchaTime(Long SubmitCaptchaTime) {
        this.SubmitCaptchaTime = SubmitCaptchaTime;
    }

    /**
     * Get <p>设备风险大类</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceRiskCategory <p>设备风险大类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceRiskCategory() {
        return this.DeviceRiskCategory;
    }

    /**
     * Set <p>设备风险大类</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceRiskCategory <p>设备风险大类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceRiskCategory(String DeviceRiskCategory) {
        this.DeviceRiskCategory = DeviceRiskCategory;
    }

    /**
     * Get <p>验证码评分</p><p>取值0-100，分值越高，风险越大</p> 
     * @return Score <p>验证码评分</p><p>取值0-100，分值越高，风险越大</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>验证码评分</p><p>取值0-100，分值越高，风险越大</p>
     * @param Score <p>验证码评分</p><p>取值0-100，分值越高，风险越大</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
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
        if (source.EvilBitmap != null) {
            this.EvilBitmap = new Long(source.EvilBitmap);
        }
        if (source.SubmitCaptchaTime != null) {
            this.SubmitCaptchaTime = new Long(source.SubmitCaptchaTime);
        }
        if (source.DeviceRiskCategory != null) {
            this.DeviceRiskCategory = new String(source.DeviceRiskCategory);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
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
        this.setParamSimple(map, prefix + "EvilBitmap", this.EvilBitmap);
        this.setParamSimple(map, prefix + "SubmitCaptchaTime", this.SubmitCaptchaTime);
        this.setParamSimple(map, prefix + "DeviceRiskCategory", this.DeviceRiskCategory);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

