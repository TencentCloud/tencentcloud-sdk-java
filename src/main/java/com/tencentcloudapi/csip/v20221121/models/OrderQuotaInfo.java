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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderQuotaInfo extends AbstractModel {

    /**
    * <p>配额键</p>
    */
    @SerializedName("QuotaKey")
    @Expose
    private String QuotaKey;

    /**
    * <p>配额总量</p>
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * <p>配额已使用量（含共享给其他账号的消耗）。仅请求参数 NeedQuotaUsed 为 true 时采集；未传或为 false 时恒为 0；用量查询失败时恒为 0，错误提示见响应 QuotaUsedError 字段</p>
    */
    @SerializedName("QuotaUsed")
    @Expose
    private Long QuotaUsed;

    /**
    * <p>赠送配额。仅 CSPM 存在赠送额度，其余计费项为 0</p>
    */
    @SerializedName("QuotaGranted")
    @Expose
    private Long QuotaGranted;

    /**
     * Get <p>配额键</p> 
     * @return QuotaKey <p>配额键</p>
     */
    public String getQuotaKey() {
        return this.QuotaKey;
    }

    /**
     * Set <p>配额键</p>
     * @param QuotaKey <p>配额键</p>
     */
    public void setQuotaKey(String QuotaKey) {
        this.QuotaKey = QuotaKey;
    }

    /**
     * Get <p>配额总量</p> 
     * @return QuotaNum <p>配额总量</p>
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set <p>配额总量</p>
     * @param QuotaNum <p>配额总量</p>
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get <p>配额已使用量（含共享给其他账号的消耗）。仅请求参数 NeedQuotaUsed 为 true 时采集；未传或为 false 时恒为 0；用量查询失败时恒为 0，错误提示见响应 QuotaUsedError 字段</p> 
     * @return QuotaUsed <p>配额已使用量（含共享给其他账号的消耗）。仅请求参数 NeedQuotaUsed 为 true 时采集；未传或为 false 时恒为 0；用量查询失败时恒为 0，错误提示见响应 QuotaUsedError 字段</p>
     */
    public Long getQuotaUsed() {
        return this.QuotaUsed;
    }

    /**
     * Set <p>配额已使用量（含共享给其他账号的消耗）。仅请求参数 NeedQuotaUsed 为 true 时采集；未传或为 false 时恒为 0；用量查询失败时恒为 0，错误提示见响应 QuotaUsedError 字段</p>
     * @param QuotaUsed <p>配额已使用量（含共享给其他账号的消耗）。仅请求参数 NeedQuotaUsed 为 true 时采集；未传或为 false 时恒为 0；用量查询失败时恒为 0，错误提示见响应 QuotaUsedError 字段</p>
     */
    public void setQuotaUsed(Long QuotaUsed) {
        this.QuotaUsed = QuotaUsed;
    }

    /**
     * Get <p>赠送配额。仅 CSPM 存在赠送额度，其余计费项为 0</p> 
     * @return QuotaGranted <p>赠送配额。仅 CSPM 存在赠送额度，其余计费项为 0</p>
     */
    public Long getQuotaGranted() {
        return this.QuotaGranted;
    }

    /**
     * Set <p>赠送配额。仅 CSPM 存在赠送额度，其余计费项为 0</p>
     * @param QuotaGranted <p>赠送配额。仅 CSPM 存在赠送额度，其余计费项为 0</p>
     */
    public void setQuotaGranted(Long QuotaGranted) {
        this.QuotaGranted = QuotaGranted;
    }

    public OrderQuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderQuotaInfo(OrderQuotaInfo source) {
        if (source.QuotaKey != null) {
            this.QuotaKey = new String(source.QuotaKey);
        }
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUsed != null) {
            this.QuotaUsed = new Long(source.QuotaUsed);
        }
        if (source.QuotaGranted != null) {
            this.QuotaGranted = new Long(source.QuotaGranted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaKey", this.QuotaKey);
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUsed", this.QuotaUsed);
        this.setParamSimple(map, prefix + "QuotaGranted", this.QuotaGranted);

    }
}

