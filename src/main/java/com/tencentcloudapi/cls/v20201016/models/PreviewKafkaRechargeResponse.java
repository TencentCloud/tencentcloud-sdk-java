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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewKafkaRechargeResponse extends AbstractModel{

    /**
    * 日志样例，PreviewType为2时返回
    */
    @SerializedName("LogSample")
    @Expose
    private String LogSample;

    /**
    * 日志预览结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogData")
    @Expose
    private String LogData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志样例，PreviewType为2时返回 
     * @return LogSample 日志样例，PreviewType为2时返回
     */
    public String getLogSample() {
        return this.LogSample;
    }

    /**
     * Set 日志样例，PreviewType为2时返回
     * @param LogSample 日志样例，PreviewType为2时返回
     */
    public void setLogSample(String LogSample) {
        this.LogSample = LogSample;
    }

    /**
     * Get 日志预览结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogData 日志预览结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogData() {
        return this.LogData;
    }

    /**
     * Set 日志预览结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogData 日志预览结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogData(String LogData) {
        this.LogData = LogData;
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

    public PreviewKafkaRechargeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewKafkaRechargeResponse(PreviewKafkaRechargeResponse source) {
        if (source.LogSample != null) {
            this.LogSample = new String(source.LogSample);
        }
        if (source.LogData != null) {
            this.LogData = new String(source.LogData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSample", this.LogSample);
        this.setParamSimple(map, prefix + "LogData", this.LogData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

