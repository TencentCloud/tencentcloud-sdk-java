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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollUpdateCloudBaseRunServerVersionResponse extends AbstractModel{

    /**
    * succ为成功
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 滚动更新的VersionName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get succ为成功 
     * @return Result succ为成功
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set succ为成功
     * @param Result succ为成功
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 滚动更新的VersionName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 滚动更新的VersionName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 滚动更新的VersionName
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 滚动更新的VersionName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 操作记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunId 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunId 操作记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
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

    public RollUpdateCloudBaseRunServerVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollUpdateCloudBaseRunServerVersionResponse(RollUpdateCloudBaseRunServerVersionResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

