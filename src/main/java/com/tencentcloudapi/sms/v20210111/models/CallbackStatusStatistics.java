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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackStatusStatistics extends AbstractModel {

    /**
    * <p>短信回执量统计。</p><p>单位：个</p>
    */
    @SerializedName("CallbackCount")
    @Expose
    private Long CallbackCount;

    /**
    * <p>短信提交成功量统计。</p><p>单位：个</p>
    */
    @SerializedName("RequestSuccessCount")
    @Expose
    private Long RequestSuccessCount;

    /**
    * <p>短信回执失败量统计。</p><p>单位：个</p>
    */
    @SerializedName("CallbackFailCount")
    @Expose
    private Long CallbackFailCount;

    /**
    * <p>短信回执成功量统计。</p><p>单位：个</p>
    */
    @SerializedName("CallbackSuccessCount")
    @Expose
    private Long CallbackSuccessCount;

    /**
    * <p>运营商内部错误统计。</p><p>单位：个</p>
    */
    @SerializedName("InternalErrorCount")
    @Expose
    private Long InternalErrorCount;

    /**
    * <p>号码无效或空号统计。</p><p>单位：个</p>
    */
    @SerializedName("InvalidNumberCount")
    @Expose
    private Long InvalidNumberCount;

    /**
    * <p>停机、关机等错误统计。</p><p>单位：个</p>
    */
    @SerializedName("ShutdownErrorCount")
    @Expose
    private Long ShutdownErrorCount;

    /**
    * <p>号码拉入免打扰名单统计。</p><p>单位：个</p>
    */
    @SerializedName("BlackListCount")
    @Expose
    private Long BlackListCount;

    /**
    * <p>运营商频率限制统计。</p><p>单位：个</p>
    */
    @SerializedName("FrequencyLimitCount")
    @Expose
    private Long FrequencyLimitCount;

    /**
     * Get <p>短信回执量统计。</p><p>单位：个</p> 
     * @return CallbackCount <p>短信回执量统计。</p><p>单位：个</p>
     */
    public Long getCallbackCount() {
        return this.CallbackCount;
    }

    /**
     * Set <p>短信回执量统计。</p><p>单位：个</p>
     * @param CallbackCount <p>短信回执量统计。</p><p>单位：个</p>
     */
    public void setCallbackCount(Long CallbackCount) {
        this.CallbackCount = CallbackCount;
    }

    /**
     * Get <p>短信提交成功量统计。</p><p>单位：个</p> 
     * @return RequestSuccessCount <p>短信提交成功量统计。</p><p>单位：个</p>
     */
    public Long getRequestSuccessCount() {
        return this.RequestSuccessCount;
    }

    /**
     * Set <p>短信提交成功量统计。</p><p>单位：个</p>
     * @param RequestSuccessCount <p>短信提交成功量统计。</p><p>单位：个</p>
     */
    public void setRequestSuccessCount(Long RequestSuccessCount) {
        this.RequestSuccessCount = RequestSuccessCount;
    }

    /**
     * Get <p>短信回执失败量统计。</p><p>单位：个</p> 
     * @return CallbackFailCount <p>短信回执失败量统计。</p><p>单位：个</p>
     */
    public Long getCallbackFailCount() {
        return this.CallbackFailCount;
    }

    /**
     * Set <p>短信回执失败量统计。</p><p>单位：个</p>
     * @param CallbackFailCount <p>短信回执失败量统计。</p><p>单位：个</p>
     */
    public void setCallbackFailCount(Long CallbackFailCount) {
        this.CallbackFailCount = CallbackFailCount;
    }

    /**
     * Get <p>短信回执成功量统计。</p><p>单位：个</p> 
     * @return CallbackSuccessCount <p>短信回执成功量统计。</p><p>单位：个</p>
     */
    public Long getCallbackSuccessCount() {
        return this.CallbackSuccessCount;
    }

    /**
     * Set <p>短信回执成功量统计。</p><p>单位：个</p>
     * @param CallbackSuccessCount <p>短信回执成功量统计。</p><p>单位：个</p>
     */
    public void setCallbackSuccessCount(Long CallbackSuccessCount) {
        this.CallbackSuccessCount = CallbackSuccessCount;
    }

    /**
     * Get <p>运营商内部错误统计。</p><p>单位：个</p> 
     * @return InternalErrorCount <p>运营商内部错误统计。</p><p>单位：个</p>
     */
    public Long getInternalErrorCount() {
        return this.InternalErrorCount;
    }

    /**
     * Set <p>运营商内部错误统计。</p><p>单位：个</p>
     * @param InternalErrorCount <p>运营商内部错误统计。</p><p>单位：个</p>
     */
    public void setInternalErrorCount(Long InternalErrorCount) {
        this.InternalErrorCount = InternalErrorCount;
    }

    /**
     * Get <p>号码无效或空号统计。</p><p>单位：个</p> 
     * @return InvalidNumberCount <p>号码无效或空号统计。</p><p>单位：个</p>
     */
    public Long getInvalidNumberCount() {
        return this.InvalidNumberCount;
    }

    /**
     * Set <p>号码无效或空号统计。</p><p>单位：个</p>
     * @param InvalidNumberCount <p>号码无效或空号统计。</p><p>单位：个</p>
     */
    public void setInvalidNumberCount(Long InvalidNumberCount) {
        this.InvalidNumberCount = InvalidNumberCount;
    }

    /**
     * Get <p>停机、关机等错误统计。</p><p>单位：个</p> 
     * @return ShutdownErrorCount <p>停机、关机等错误统计。</p><p>单位：个</p>
     */
    public Long getShutdownErrorCount() {
        return this.ShutdownErrorCount;
    }

    /**
     * Set <p>停机、关机等错误统计。</p><p>单位：个</p>
     * @param ShutdownErrorCount <p>停机、关机等错误统计。</p><p>单位：个</p>
     */
    public void setShutdownErrorCount(Long ShutdownErrorCount) {
        this.ShutdownErrorCount = ShutdownErrorCount;
    }

    /**
     * Get <p>号码拉入免打扰名单统计。</p><p>单位：个</p> 
     * @return BlackListCount <p>号码拉入免打扰名单统计。</p><p>单位：个</p>
     */
    public Long getBlackListCount() {
        return this.BlackListCount;
    }

    /**
     * Set <p>号码拉入免打扰名单统计。</p><p>单位：个</p>
     * @param BlackListCount <p>号码拉入免打扰名单统计。</p><p>单位：个</p>
     */
    public void setBlackListCount(Long BlackListCount) {
        this.BlackListCount = BlackListCount;
    }

    /**
     * Get <p>运营商频率限制统计。</p><p>单位：个</p> 
     * @return FrequencyLimitCount <p>运营商频率限制统计。</p><p>单位：个</p>
     */
    public Long getFrequencyLimitCount() {
        return this.FrequencyLimitCount;
    }

    /**
     * Set <p>运营商频率限制统计。</p><p>单位：个</p>
     * @param FrequencyLimitCount <p>运营商频率限制统计。</p><p>单位：个</p>
     */
    public void setFrequencyLimitCount(Long FrequencyLimitCount) {
        this.FrequencyLimitCount = FrequencyLimitCount;
    }

    public CallbackStatusStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackStatusStatistics(CallbackStatusStatistics source) {
        if (source.CallbackCount != null) {
            this.CallbackCount = new Long(source.CallbackCount);
        }
        if (source.RequestSuccessCount != null) {
            this.RequestSuccessCount = new Long(source.RequestSuccessCount);
        }
        if (source.CallbackFailCount != null) {
            this.CallbackFailCount = new Long(source.CallbackFailCount);
        }
        if (source.CallbackSuccessCount != null) {
            this.CallbackSuccessCount = new Long(source.CallbackSuccessCount);
        }
        if (source.InternalErrorCount != null) {
            this.InternalErrorCount = new Long(source.InternalErrorCount);
        }
        if (source.InvalidNumberCount != null) {
            this.InvalidNumberCount = new Long(source.InvalidNumberCount);
        }
        if (source.ShutdownErrorCount != null) {
            this.ShutdownErrorCount = new Long(source.ShutdownErrorCount);
        }
        if (source.BlackListCount != null) {
            this.BlackListCount = new Long(source.BlackListCount);
        }
        if (source.FrequencyLimitCount != null) {
            this.FrequencyLimitCount = new Long(source.FrequencyLimitCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackCount", this.CallbackCount);
        this.setParamSimple(map, prefix + "RequestSuccessCount", this.RequestSuccessCount);
        this.setParamSimple(map, prefix + "CallbackFailCount", this.CallbackFailCount);
        this.setParamSimple(map, prefix + "CallbackSuccessCount", this.CallbackSuccessCount);
        this.setParamSimple(map, prefix + "InternalErrorCount", this.InternalErrorCount);
        this.setParamSimple(map, prefix + "InvalidNumberCount", this.InvalidNumberCount);
        this.setParamSimple(map, prefix + "ShutdownErrorCount", this.ShutdownErrorCount);
        this.setParamSimple(map, prefix + "BlackListCount", this.BlackListCount);
        this.setParamSimple(map, prefix + "FrequencyLimitCount", this.FrequencyLimitCount);

    }
}

