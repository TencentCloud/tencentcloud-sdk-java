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

public class CaptchaOperDataRes extends AbstractModel{

    /**
    * 验证码加载耗时数据返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperDataLoadTimeUnitArray")
    @Expose
    private CaptchaOperDataLoadTimeUnit [] OperDataLoadTimeUnitArray;

    /**
    * 验证码拦截情况数据返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperDataInterceptUnitArray")
    @Expose
    private CaptchaOperDataInterceptUnit [] OperDataInterceptUnitArray;

    /**
    * 验证码尝试次数数据返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperDataTryTimesUnitArray")
    @Expose
    private CaptchaOperDataTryTimesUnit [] OperDataTryTimesUnitArray;

    /**
    * 验证码尝试次数分布数据返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperDataTryTimesDistributeUnitArray")
    @Expose
    private CaptchaOperDataTryTimesDistributeUnit [] OperDataTryTimesDistributeUnitArray;

    /**
     * Get 验证码加载耗时数据返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperDataLoadTimeUnitArray 验证码加载耗时数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaptchaOperDataLoadTimeUnit [] getOperDataLoadTimeUnitArray() {
        return this.OperDataLoadTimeUnitArray;
    }

    /**
     * Set 验证码加载耗时数据返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperDataLoadTimeUnitArray 验证码加载耗时数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperDataLoadTimeUnitArray(CaptchaOperDataLoadTimeUnit [] OperDataLoadTimeUnitArray) {
        this.OperDataLoadTimeUnitArray = OperDataLoadTimeUnitArray;
    }

    /**
     * Get 验证码拦截情况数据返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperDataInterceptUnitArray 验证码拦截情况数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaptchaOperDataInterceptUnit [] getOperDataInterceptUnitArray() {
        return this.OperDataInterceptUnitArray;
    }

    /**
     * Set 验证码拦截情况数据返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperDataInterceptUnitArray 验证码拦截情况数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperDataInterceptUnitArray(CaptchaOperDataInterceptUnit [] OperDataInterceptUnitArray) {
        this.OperDataInterceptUnitArray = OperDataInterceptUnitArray;
    }

    /**
     * Get 验证码尝试次数数据返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperDataTryTimesUnitArray 验证码尝试次数数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaptchaOperDataTryTimesUnit [] getOperDataTryTimesUnitArray() {
        return this.OperDataTryTimesUnitArray;
    }

    /**
     * Set 验证码尝试次数数据返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperDataTryTimesUnitArray 验证码尝试次数数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperDataTryTimesUnitArray(CaptchaOperDataTryTimesUnit [] OperDataTryTimesUnitArray) {
        this.OperDataTryTimesUnitArray = OperDataTryTimesUnitArray;
    }

    /**
     * Get 验证码尝试次数分布数据返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperDataTryTimesDistributeUnitArray 验证码尝试次数分布数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaptchaOperDataTryTimesDistributeUnit [] getOperDataTryTimesDistributeUnitArray() {
        return this.OperDataTryTimesDistributeUnitArray;
    }

    /**
     * Set 验证码尝试次数分布数据返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperDataTryTimesDistributeUnitArray 验证码尝试次数分布数据返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperDataTryTimesDistributeUnitArray(CaptchaOperDataTryTimesDistributeUnit [] OperDataTryTimesDistributeUnitArray) {
        this.OperDataTryTimesDistributeUnitArray = OperDataTryTimesDistributeUnitArray;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OperDataLoadTimeUnitArray.", this.OperDataLoadTimeUnitArray);
        this.setParamArrayObj(map, prefix + "OperDataInterceptUnitArray.", this.OperDataInterceptUnitArray);
        this.setParamArrayObj(map, prefix + "OperDataTryTimesUnitArray.", this.OperDataTryTimesUnitArray);
        this.setParamArrayObj(map, prefix + "OperDataTryTimesDistributeUnitArray.", this.OperDataTryTimesDistributeUnitArray);

    }
}

