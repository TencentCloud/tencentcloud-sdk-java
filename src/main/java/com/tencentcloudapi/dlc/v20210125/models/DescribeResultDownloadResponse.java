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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResultDownloadResponse extends AbstractModel{

    /**
    * 下载文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 任务状态 init | queue | format | compress | success|  timeout | error
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务异常原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 临时AK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 临时SK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 临时Token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下载文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 下载文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 下载文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 下载文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 任务状态 init | queue | format | compress | success|  timeout | error 
     * @return Status 任务状态 init | queue | format | compress | success|  timeout | error
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态 init | queue | format | compress | success|  timeout | error
     * @param Status 任务状态 init | queue | format | compress | success|  timeout | error
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务异常原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 任务异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 任务异常原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 任务异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 临时AK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretId 临时AK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 临时AK
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretId 临时AK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 临时SK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 临时SK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 临时SK
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 临时SK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 临时Token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token 临时Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 临时Token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token 临时Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    public DescribeResultDownloadResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResultDownloadResponse(DescribeResultDownloadResponse source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

