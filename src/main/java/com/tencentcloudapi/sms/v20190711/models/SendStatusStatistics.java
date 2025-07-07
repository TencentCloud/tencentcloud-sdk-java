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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatusStatistics extends AbstractModel {

    /**
    * 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条。
    */
    @SerializedName("FeeCount")
    @Expose
    private Long FeeCount;

    /**
    * 短信提交量统计。
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * 短信提交成功量统计。
    */
    @SerializedName("RequestSuccessCount")
    @Expose
    private Long RequestSuccessCount;

    /**
     * Get 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条。 
     * @return FeeCount 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条。
     */
    public Long getFeeCount() {
        return this.FeeCount;
    }

    /**
     * Set 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条。
     * @param FeeCount 短信计费条数统计，例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条，则计费条数为： ```80 * 1 + 20 * 2 = 120``` 条。
     */
    public void setFeeCount(Long FeeCount) {
        this.FeeCount = FeeCount;
    }

    /**
     * Get 短信提交量统计。 
     * @return RequestCount 短信提交量统计。
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set 短信提交量统计。
     * @param RequestCount 短信提交量统计。
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get 短信提交成功量统计。 
     * @return RequestSuccessCount 短信提交成功量统计。
     */
    public Long getRequestSuccessCount() {
        return this.RequestSuccessCount;
    }

    /**
     * Set 短信提交成功量统计。
     * @param RequestSuccessCount 短信提交成功量统计。
     */
    public void setRequestSuccessCount(Long RequestSuccessCount) {
        this.RequestSuccessCount = RequestSuccessCount;
    }

    public SendStatusStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatusStatistics(SendStatusStatistics source) {
        if (source.FeeCount != null) {
            this.FeeCount = new Long(source.FeeCount);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.RequestSuccessCount != null) {
            this.RequestSuccessCount = new Long(source.RequestSuccessCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FeeCount", this.FeeCount);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "RequestSuccessCount", this.RequestSuccessCount);

    }
}

