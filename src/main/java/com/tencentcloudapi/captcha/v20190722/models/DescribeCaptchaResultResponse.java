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

public class DescribeCaptchaResultResponse  extends AbstractModel{

    /**
    * 1:验证成功，0:验证失败，100:AppSecretKey参数校验错误
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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取1:验证成功，0:验证失败，100:AppSecretKey参数校验错误
     * @return CaptchaCode 1:验证成功，0:验证失败，100:AppSecretKey参数校验错误
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * 设置1:验证成功，0:验证失败，100:AppSecretKey参数校验错误
     * @param CaptchaCode 1:验证成功，0:验证失败，100:AppSecretKey参数校验错误
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * 获取状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return CaptchaMsg 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * 设置状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptchaMsg 状态描述及验证错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * 获取[0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     * @return EvilLevel [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilLevel() {
        return this.EvilLevel;
    }

    /**
     * 设置[0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilLevel [0,100]，恶意等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilLevel(Long EvilLevel) {
        this.EvilLevel = EvilLevel;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamSimple(map, prefix + "EvilLevel", this.EvilLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

