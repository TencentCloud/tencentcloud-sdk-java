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

public class SendStatusStatistics  extends AbstractModel{

    /**
    * 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条
    */
    @SerializedName("BillingStatistics")
    @Expose
    private Long BillingStatistics;

    /**
    * 短信提交量统计
    */
    @SerializedName("RequestStatistics")
    @Expose
    private Long RequestStatistics;

    /**
    * 短信提交成功量统计
    */
    @SerializedName("RequestSuccessStatistics")
    @Expose
    private Long RequestSuccessStatistics;

    /**
     * 获取短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条
     * @return BillingStatistics 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条
     */
    public Long getBillingStatistics() {
        return this.BillingStatistics;
    }

    /**
     * 设置短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条
     * @param BillingStatistics 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条
     */
    public void setBillingStatistics(Long BillingStatistics) {
        this.BillingStatistics = BillingStatistics;
    }

    /**
     * 获取短信提交量统计
     * @return RequestStatistics 短信提交量统计
     */
    public Long getRequestStatistics() {
        return this.RequestStatistics;
    }

    /**
     * 设置短信提交量统计
     * @param RequestStatistics 短信提交量统计
     */
    public void setRequestStatistics(Long RequestStatistics) {
        this.RequestStatistics = RequestStatistics;
    }

    /**
     * 获取短信提交成功量统计
     * @return RequestSuccessStatistics 短信提交成功量统计
     */
    public Long getRequestSuccessStatistics() {
        return this.RequestSuccessStatistics;
    }

    /**
     * 设置短信提交成功量统计
     * @param RequestSuccessStatistics 短信提交成功量统计
     */
    public void setRequestSuccessStatistics(Long RequestSuccessStatistics) {
        this.RequestSuccessStatistics = RequestSuccessStatistics;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingStatistics", this.BillingStatistics);
        this.setParamSimple(map, prefix + "RequestStatistics", this.RequestStatistics);
        this.setParamSimple(map, prefix + "RequestSuccessStatistics", this.RequestSuccessStatistics);

    }
}

