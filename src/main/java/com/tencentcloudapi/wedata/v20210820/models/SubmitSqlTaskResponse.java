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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitSqlTaskResponse extends AbstractModel{

    /**
    * 任务提交记录
    */
    @SerializedName("Record")
    @Expose
    private AdhocRecord Record;

    /**
    * 子任务记录列表
    */
    @SerializedName("Details")
    @Expose
    private AdhocDetail [] Details;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务提交记录 
     * @return Record 任务提交记录
     */
    public AdhocRecord getRecord() {
        return this.Record;
    }

    /**
     * Set 任务提交记录
     * @param Record 任务提交记录
     */
    public void setRecord(AdhocRecord Record) {
        this.Record = Record;
    }

    /**
     * Get 子任务记录列表 
     * @return Details 子任务记录列表
     */
    public AdhocDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 子任务记录列表
     * @param Details 子任务记录列表
     */
    public void setDetails(AdhocDetail [] Details) {
        this.Details = Details;
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

    public SubmitSqlTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitSqlTaskResponse(SubmitSqlTaskResponse source) {
        if (source.Record != null) {
            this.Record = new AdhocRecord(source.Record);
        }
        if (source.Details != null) {
            this.Details = new AdhocDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new AdhocDetail(source.Details[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Record.", this.Record);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

