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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackStatusStatistics  extends AbstractModel{

    /**
    * 短信回执量统计
    */
    @SerializedName("CallbackCount")
    @Expose
    private Long CallbackCount;

    /**
    * 短信提交成功量统计
    */
    @SerializedName("RequestSuccessCount")
    @Expose
    private Long RequestSuccessCount;

    /**
    * 短信回执失败量统计
    */
    @SerializedName("CallbackFailCount")
    @Expose
    private Long CallbackFailCount;

    /**
    * 短信回执成功量统计
    */
    @SerializedName("CallbackSuccessCount")
    @Expose
    private Long CallbackSuccessCount;

    /**
    * 运营商内部错误统计
    */
    @SerializedName("InternalErrorCount")
    @Expose
    private Long InternalErrorCount;

    /**
    * 号码无效或空号统计
    */
    @SerializedName("InvalidNumberCount")
    @Expose
    private Long InvalidNumberCount;

    /**
    * 停机、关机等错误统计
    */
    @SerializedName("ShutdownErrorCount")
    @Expose
    private Long ShutdownErrorCount;

    /**
    * 号码拉入黑名单统计
    */
    @SerializedName("BlackListCount")
    @Expose
    private Long BlackListCount;

    /**
    * 运营商频率限制统计
    */
    @SerializedName("FrequencyLimitCount")
    @Expose
    private Long FrequencyLimitCount;

    /**
     * 获取短信回执量统计
     * @return CallbackCount 短信回执量统计
     */
    public Long getCallbackCount() {
        return this.CallbackCount;
    }

    /**
     * 设置短信回执量统计
     * @param CallbackCount 短信回执量统计
     */
    public void setCallbackCount(Long CallbackCount) {
        this.CallbackCount = CallbackCount;
    }

    /**
     * 获取短信提交成功量统计
     * @return RequestSuccessCount 短信提交成功量统计
     */
    public Long getRequestSuccessCount() {
        return this.RequestSuccessCount;
    }

    /**
     * 设置短信提交成功量统计
     * @param RequestSuccessCount 短信提交成功量统计
     */
    public void setRequestSuccessCount(Long RequestSuccessCount) {
        this.RequestSuccessCount = RequestSuccessCount;
    }

    /**
     * 获取短信回执失败量统计
     * @return CallbackFailCount 短信回执失败量统计
     */
    public Long getCallbackFailCount() {
        return this.CallbackFailCount;
    }

    /**
     * 设置短信回执失败量统计
     * @param CallbackFailCount 短信回执失败量统计
     */
    public void setCallbackFailCount(Long CallbackFailCount) {
        this.CallbackFailCount = CallbackFailCount;
    }

    /**
     * 获取短信回执成功量统计
     * @return CallbackSuccessCount 短信回执成功量统计
     */
    public Long getCallbackSuccessCount() {
        return this.CallbackSuccessCount;
    }

    /**
     * 设置短信回执成功量统计
     * @param CallbackSuccessCount 短信回执成功量统计
     */
    public void setCallbackSuccessCount(Long CallbackSuccessCount) {
        this.CallbackSuccessCount = CallbackSuccessCount;
    }

    /**
     * 获取运营商内部错误统计
     * @return InternalErrorCount 运营商内部错误统计
     */
    public Long getInternalErrorCount() {
        return this.InternalErrorCount;
    }

    /**
     * 设置运营商内部错误统计
     * @param InternalErrorCount 运营商内部错误统计
     */
    public void setInternalErrorCount(Long InternalErrorCount) {
        this.InternalErrorCount = InternalErrorCount;
    }

    /**
     * 获取号码无效或空号统计
     * @return InvalidNumberCount 号码无效或空号统计
     */
    public Long getInvalidNumberCount() {
        return this.InvalidNumberCount;
    }

    /**
     * 设置号码无效或空号统计
     * @param InvalidNumberCount 号码无效或空号统计
     */
    public void setInvalidNumberCount(Long InvalidNumberCount) {
        this.InvalidNumberCount = InvalidNumberCount;
    }

    /**
     * 获取停机、关机等错误统计
     * @return ShutdownErrorCount 停机、关机等错误统计
     */
    public Long getShutdownErrorCount() {
        return this.ShutdownErrorCount;
    }

    /**
     * 设置停机、关机等错误统计
     * @param ShutdownErrorCount 停机、关机等错误统计
     */
    public void setShutdownErrorCount(Long ShutdownErrorCount) {
        this.ShutdownErrorCount = ShutdownErrorCount;
    }

    /**
     * 获取号码拉入黑名单统计
     * @return BlackListCount 号码拉入黑名单统计
     */
    public Long getBlackListCount() {
        return this.BlackListCount;
    }

    /**
     * 设置号码拉入黑名单统计
     * @param BlackListCount 号码拉入黑名单统计
     */
    public void setBlackListCount(Long BlackListCount) {
        this.BlackListCount = BlackListCount;
    }

    /**
     * 获取运营商频率限制统计
     * @return FrequencyLimitCount 运营商频率限制统计
     */
    public Long getFrequencyLimitCount() {
        return this.FrequencyLimitCount;
    }

    /**
     * 设置运营商频率限制统计
     * @param FrequencyLimitCount 运营商频率限制统计
     */
    public void setFrequencyLimitCount(Long FrequencyLimitCount) {
        this.FrequencyLimitCount = FrequencyLimitCount;
    }

    /**
     * 内部实现，用户禁止调用
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

