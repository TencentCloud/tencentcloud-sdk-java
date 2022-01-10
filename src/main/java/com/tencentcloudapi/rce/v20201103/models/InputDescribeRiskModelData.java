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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDescribeRiskModelData extends AbstractModel{

    /**
    * 业务参数加密后的签名值
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 调用时间戳，精确到秒
    */
    @SerializedName("ApplyDate")
    @Expose
    private Long ApplyDate;

    /**
    * 客户业务侧标识用户的唯一ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 是否为测试流量
    */
    @SerializedName("IsTest")
    @Expose
    private Long IsTest;

    /**
     * Get 业务参数加密后的签名值 
     * @return UserData 业务参数加密后的签名值
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 业务参数加密后的签名值
     * @param UserData 业务参数加密后的签名值
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 调用时间戳，精确到秒 
     * @return ApplyDate 调用时间戳，精确到秒
     */
    public Long getApplyDate() {
        return this.ApplyDate;
    }

    /**
     * Set 调用时间戳，精确到秒
     * @param ApplyDate 调用时间戳，精确到秒
     */
    public void setApplyDate(Long ApplyDate) {
        this.ApplyDate = ApplyDate;
    }

    /**
     * Get 客户业务侧标识用户的唯一ID 
     * @return UserId 客户业务侧标识用户的唯一ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 客户业务侧标识用户的唯一ID
     * @param UserId 客户业务侧标识用户的唯一ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 是否为测试流量 
     * @return IsTest 是否为测试流量
     */
    public Long getIsTest() {
        return this.IsTest;
    }

    /**
     * Set 是否为测试流量
     * @param IsTest 是否为测试流量
     */
    public void setIsTest(Long IsTest) {
        this.IsTest = IsTest;
    }

    public InputDescribeRiskModelData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputDescribeRiskModelData(InputDescribeRiskModelData source) {
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.ApplyDate != null) {
            this.ApplyDate = new Long(source.ApplyDate);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsTest != null) {
            this.IsTest = new Long(source.IsTest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "ApplyDate", this.ApplyDate);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsTest", this.IsTest);

    }
}

