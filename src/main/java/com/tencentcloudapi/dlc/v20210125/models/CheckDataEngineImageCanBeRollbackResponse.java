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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDataEngineImageCanBeRollbackResponse extends AbstractModel {

    /**
    * 回滚后日志记录id
    */
    @SerializedName("ToRecordId")
    @Expose
    private String ToRecordId;

    /**
    * 回滚前日志记录id
    */
    @SerializedName("FromRecordId")
    @Expose
    private String FromRecordId;

    /**
    * 是否能够回滚
    */
    @SerializedName("IsRollback")
    @Expose
    private Boolean IsRollback;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 回滚后日志记录id 
     * @return ToRecordId 回滚后日志记录id
     */
    public String getToRecordId() {
        return this.ToRecordId;
    }

    /**
     * Set 回滚后日志记录id
     * @param ToRecordId 回滚后日志记录id
     */
    public void setToRecordId(String ToRecordId) {
        this.ToRecordId = ToRecordId;
    }

    /**
     * Get 回滚前日志记录id 
     * @return FromRecordId 回滚前日志记录id
     */
    public String getFromRecordId() {
        return this.FromRecordId;
    }

    /**
     * Set 回滚前日志记录id
     * @param FromRecordId 回滚前日志记录id
     */
    public void setFromRecordId(String FromRecordId) {
        this.FromRecordId = FromRecordId;
    }

    /**
     * Get 是否能够回滚 
     * @return IsRollback 是否能够回滚
     */
    public Boolean getIsRollback() {
        return this.IsRollback;
    }

    /**
     * Set 是否能够回滚
     * @param IsRollback 是否能够回滚
     */
    public void setIsRollback(Boolean IsRollback) {
        this.IsRollback = IsRollback;
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

    public CheckDataEngineImageCanBeRollbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDataEngineImageCanBeRollbackResponse(CheckDataEngineImageCanBeRollbackResponse source) {
        if (source.ToRecordId != null) {
            this.ToRecordId = new String(source.ToRecordId);
        }
        if (source.FromRecordId != null) {
            this.FromRecordId = new String(source.FromRecordId);
        }
        if (source.IsRollback != null) {
            this.IsRollback = new Boolean(source.IsRollback);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToRecordId", this.ToRecordId);
        this.setParamSimple(map, prefix + "FromRecordId", this.FromRecordId);
        this.setParamSimple(map, prefix + "IsRollback", this.IsRollback);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

