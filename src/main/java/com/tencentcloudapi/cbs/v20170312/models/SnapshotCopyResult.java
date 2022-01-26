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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotCopyResult extends AbstractModel{

    /**
    * 复制到目标地域的新快照ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 指示具体错误信息，成功时为空字符串。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 错误码，成功时取值为“Success”。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 跨地复制的目标地域。
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
     * Get 复制到目标地域的新快照ID。 
     * @return SnapshotId 复制到目标地域的新快照ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 复制到目标地域的新快照ID。
     * @param SnapshotId 复制到目标地域的新快照ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 指示具体错误信息，成功时为空字符串。 
     * @return Message 指示具体错误信息，成功时为空字符串。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 指示具体错误信息，成功时为空字符串。
     * @param Message 指示具体错误信息，成功时为空字符串。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 错误码，成功时取值为“Success”。 
     * @return Code 错误码，成功时取值为“Success”。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码，成功时取值为“Success”。
     * @param Code 错误码，成功时取值为“Success”。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 跨地复制的目标地域。 
     * @return DestinationRegion 跨地复制的目标地域。
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set 跨地复制的目标地域。
     * @param DestinationRegion 跨地复制的目标地域。
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    public SnapshotCopyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotCopyResult(SnapshotCopyResult source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);

    }
}

